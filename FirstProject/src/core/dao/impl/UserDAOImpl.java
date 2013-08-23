package core.dao.impl;

import org.springframework.stereotype.Repository;

import core.dao.UserDAO;
import core.model.User;
import core.util.CustomHibernateDaoSupport;

@Repository("userDAO")
public class UserDAOImpl extends CustomHibernateDaoSupport implements UserDAO{

	@Override
	public void addUser(User user) {
		getHibernateTemplate().save(user);
		
	}
	
	

}
