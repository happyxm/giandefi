package core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import core.dao.LoginDAO;
import core.model.User;
import core.util.CustomHibernateDaoSupport;

@Repository("loginDAO")
public class LoginDAOImpl extends CustomHibernateDaoSupport implements LoginDAO 
{

	@Override
	public boolean verifyLogin(User user) 
	{
		try
		{
			@SuppressWarnings("rawtypes")
			List list = getHibernateTemplate().find("from User where userId='" + user.getUserId() + "' and password='" + user.getPassword()+"'");
			User result = (User) list.get(0);
			if (result != null)
			{
				System.out.println(result.getId());
				return true;
			}
		}
		catch (Exception e)
		{
			System.out.println("non trovato");
		}
		return false;
	}
}