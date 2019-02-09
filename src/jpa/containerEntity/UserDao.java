package jpa.containerEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("userDao")
@Transactional
public class UserDao {
	@PersistenceContext
	private EntityManager em;
	public User getById(Integer id){
		return em.find(User.class, id);
	}

}
