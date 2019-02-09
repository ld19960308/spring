package transaction;

import java.util.List;

public class AccountBizImp implements AccountBiz {
	AccountDao accountDao;
	@Override
	public List getAccountByAccountNo(String accountNo) {
		// TODO Auto-generated method stub
		return accountDao.getAccountByAccountNo(accountNo);
	}

	@Override
	public void transfer(Account a1, Account a2) {
		// TODO Auto-generated method stub
        accountDao.transfer(a1, a2);
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

}
