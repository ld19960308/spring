package aop;

public class UserDaoImp implements UserDao {

	@Override
	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("�����û��ɹ�");

	}

	@Override
	public void delUser(int id) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("ɾ���û��ɹ�");
		throw new Exception("�����׳��쳣");

	}

}
