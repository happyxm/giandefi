package core.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.bo.RegisterBo;
import core.dao.RegisterDAO;
import core.model.User;

@Service("userBO")
public class RegisterBoImpl implements RegisterBo{

	@Autowired
	private RegisterDAO registerDAO;

	@Override
	public void addUser(User user) {
		registerDAO.addUser(user);
		
	}
	
	public void setRegisterDAO(RegisterDAO registerDAO)
	{
		this.registerDAO = registerDAO;
	}

	
}
