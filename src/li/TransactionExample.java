package li;

import java.sql.Statement;
import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class TransactionExample {
	private DataSource dataSource;
	private PlatformTransactionManager transactionManager;
	private TransactionTemplate transactionTemplate;
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public PlatformTransactionManager getTransactionManager() {
		return transactionManager;
	}
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	public void transactionOperation(){
		transactionTemplate.execute(new TransactionCallback(){
		  public Object doInTransaction(TransactionStatus status){
			Connection conn=DataSourceUtils.getConnection(dataSource);
			try{
				Statement stmt=conn.createStatement();
				stmt.execute("insert into user values(1,'li','li')");
				System.out.println(10/0);
                System.out.println("执行成功");
			}
			catch(Exception e){
				transactionManager.rollback(status);
				System.out.println("操作失败，失误回滚！");
				System.out.println("原因："+e.getMessage());
			}
			return null;
		  }
		});
	}

}
