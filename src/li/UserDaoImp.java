package li;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class UserDaoImp implements UserDao {
    private DataSource dataSource;
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	@Override
	public void inserUser(User user) {
		// TODO Auto-generated method stub
       String username=user.getUsername();
       String password=user.getPassword();
       Connection con=null;
       Statement sta=null;
       try{
    	   con=dataSource.getConnection();
    	   sta=con.createStatement();
    	   String sql="insert into user values("+1+",'"+username+"','"+password+"')";
    	   System.out.println(sql);
    	   sta.execute(sql);
       }
       catch(SQLException e){
    	   e.printStackTrace();
       }
       finally{
    	   if(sta!=null){
    		   try {
				sta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	   }
    	   if(con!=null){
    		   try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	   }
       }
	}
	public void deleteUser(User user){
		   String username=user.getUsername();
	       String password=user.getPassword();
	       Connection con=null;
	       Statement sta=null;
	       try{
	    	   con=dataSource.getConnection();
	    	   sta=con.createStatement();
	    	   String sql="delete from user where username='"+username+"' and password='"+password+"'";
	    	   System.out.println(sql);
	    	   sta.execute(sql);
	       }
	       catch(SQLException e){
	    	   e.printStackTrace();
	       }
	       finally{
	    	   if(sta!=null){
	    		   try {
					sta.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    	   }
	    	   if(con!=null){
	    		   try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    	   }
	       }
	}

}
