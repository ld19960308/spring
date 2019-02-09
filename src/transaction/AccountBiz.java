package transaction;

import java.util.List;

public interface AccountBiz {
	public List getAccountByAccountNo(String accountNo);
	public void transfer(Account a1,Account a2);

}
