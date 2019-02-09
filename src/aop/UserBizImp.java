package aop;

public class UserBizImp implements UserBiz {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		userDao.addUser(username, password);

	}

	@Override
	public void delUser(int id){
		// TODO Auto-generated method stub
		//throw new Exception("故意抛出异常");
		try{
          userDao.delUser(id);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
    public void arg(String args){
    	System.out.println("带参数的方法");
    }
}
