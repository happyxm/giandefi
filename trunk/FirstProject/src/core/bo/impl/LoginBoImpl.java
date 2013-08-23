package core.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import core.bo.LoginBo;
import core.dao.LoginDAO;
import core.model.User;

@Service("loginBo")
public class LoginBoImpl implements LoginBo {

	@Autowired
	private LoginDAO loginDAO;
	
	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	public boolean verifyLogin(User user)
	{
		if (loginDAO.verifyLogin(user))
			return true;
		else return false;
	}
}
