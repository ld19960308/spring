package transaction;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class AccountDAOImp extends HibernateDaoSupport implements AccountDao {

	@Override
	public void transfer(Account a1, Account a2) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(a1);
		getHibernateTemplate().update(a2);

	}

	@SuppressWarnings("rawtypes")
	@Override
	public List getAccountByAccountNo(final String accountNo) {
		// TODO Auto-generated method stub
		return (List) super.getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session)throws HibernateException{
		    	Criteria c=session.createCriteria(Account.class);
		    	c.add(Restrictions.eq("accountNo",accountNo));
		    	return c.list();
		    }
			
		});
	}



}
