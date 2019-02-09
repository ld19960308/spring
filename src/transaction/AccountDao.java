package transaction;

import java.util.List;

public interface AccountDao {
	public void transfer(Account al,Account a2);
	public List getAccountByAccountNo(String accountNo);

}
