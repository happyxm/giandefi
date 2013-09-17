package core.dao.impl;

import org.springframework.stereotype.Repository;

import core.dao.RegisterDAO;
import core.model.User;
import core.util.CustomHibernateDaoSupport;

@Repository("userDAO")
public class RegisterDAOImpl extends CustomHibernateDaoSupport implements RegisterDAO{

	@Override
	public boolean addUser(User user)
	{
		try
		{
			getHibernateTemplate().save(user);
			return true;
		}
		catch (RuntimeException e)
		{
			return false;
		}
	
	}
	
	

}
