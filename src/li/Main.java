package li;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BeanFactory factory=new FileSystemXmlApplicationContext("applicationContext.xml");
        /*User user=(User)factory.getBean("user");
        System.out.println(user);
        UserDao userDao=(UserDao)factory.getBean("userDao");
        userDao.inserUser(user);
        userDao.deleteUser(user);
        System.out.println("����ɹ�");*/
        
        /*���ʽ�������
        TransactionExample te=(TransactionExample)factory.getBean("transactionExample");
        te.transactionOperation();
        */
        
        /*����ʽ�������ȱ��jar�ļ�
         * AddDao addDao=(AddDao)factory.getBean("transactionProxy");
        User user=new User();
        user.setUsername("zhao");
        user.setPassword("zhao");
        addDao.addUser(user);*/
        
        JdbcTemplate jtl=(JdbcTemplate)factory.getBean("jdbcTemplate");
        String sql="insert into user values(2,'1','1')";
        jtl.update(sql);
        
	}

}
