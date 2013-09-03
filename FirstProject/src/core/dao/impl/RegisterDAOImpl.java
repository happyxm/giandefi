package core.dao.impl;

import org.springframework.stereotype.Repository;

import core.dao.RegisterDAO;
import core.model.User;
import core.util.CustomHibernateDaoSupport;

@Repository("userDAO")
public class RegisterDAOImpl extends CustomHibernateDaoSupport implements RegisterDAO{

	@Override
	public void addUser(User user) {
		getHibernateTemplate().save(user);
		
	}
	
	

}
