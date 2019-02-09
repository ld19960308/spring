package li;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AddDao extends JdbcDaoSupport{
	public void addUser(User user){
		String sql="delete from user where username='"+user.getUsername()+"'";
		getJdbcTemplate().execute(sql);
		getJdbcTemplate().execute(sql);
	}

}
