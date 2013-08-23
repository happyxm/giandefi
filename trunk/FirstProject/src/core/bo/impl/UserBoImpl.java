package core.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.bo.UserBo;
import core.dao.UserDAO;
import core.model.User;

@Service("userBO")
public class UserBoImpl implements UserBo{

	@Autowired
	private UserDAO userDAO;

	@Override
	public void addUser(User user) {
		userDAO.addUser(user);
		
	}
	
	public void setUserDAO(UserDAO userDAO)
	{
		this.userDAO = userDAO;
	}

	
}
