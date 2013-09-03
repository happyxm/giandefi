package core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import core.dao.LoginDAO;
import core.model.User;
import core.util.CustomHibernateDaoSupport;

	
@Repository("loginDAO")
public class LoginDAOImpl extends CustomHibernateDaoSupport implements LoginDAO 
{
	
	@SuppressWarnings("unchecked")
	@Override
	public User verifyLogin(User user)
	{
		String[] params = { user.getUserId(), user.getPassword()};
		List<User> list = getHibernateTemplate().find("from User where userId=? and password=?", params);
		if (list.size() == 1)
		{
			User u = list.get(0);
				user.setEmail(u.getEmail());
				user.setSurname(u.getSurname());
				user.setName(u.getName());
				user.setJoinDate(u.getJoinDate());
				user.setId(u.getId());
			return (User) getHibernateTemplate().get(core.model.User.class, list.get(0).getId());
		}
		else
		{
			System.out.println("Utente non trovato");
			return null;
		}

	}
}