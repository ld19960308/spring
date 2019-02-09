package aop;

public class UserDaoImp implements UserDao {

	@Override
	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("增加用户成功");

	}

	@Override
	public void delUser(int id) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("删除用户成功");
		throw new Exception("故意抛出异常");

	}

}
