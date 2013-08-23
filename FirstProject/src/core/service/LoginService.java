package core.service;

import core.model.User;

public class LoginService {
	
	//connect db
	public boolean verifyLogin(User user)
	{
		System.out.println("verifico user="+user.getUserId() + "pass=" + user.getPassword());
		if (user.getUserId().equals("user") && user.getPassword().equals("password"))
		{
			return true;
		}
		else 
			{
			return false;
		
			}
	}

}
