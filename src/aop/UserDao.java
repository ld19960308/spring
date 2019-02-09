package aop;

public interface UserDao {
	public void addUser(String username,String password);
	public void delUser(int id)throws Exception;

}
