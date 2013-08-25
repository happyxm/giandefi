package core.dao.impl;

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
			Integer count = (Integer) getHibernateTemplate().find("count(*) from User where userId='" + user.getUserId() + "' and password='" + user.getPassword()+"'").get(0);
			if (count != 1)
			{
				System.out.println(count);
				return true;
			}
		}
		catch (Exception e)
		{
			System.out.println("Utente non trovato");
			return false;
		}
		return false;
	}
}