package core.action;



import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import core.model.User;
import core.service.LoginService;




public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private User user;
	private LoginService loginService;

	
	public void validate()
	{
		System.out.println("validating");
		if (StringUtils.isEmpty(user.getUserId()))
		{
			addFieldError("userId", "Campo userId vuoto!");
		}
		if (StringUtils.isEmpty(user.getPassword()))
		{
			addFieldError("password", "Campo password vuoto!");
		}
	}
	
	public String execute()
	{	
		System.out.println("execute user="+user.getUserId() + "pass=" + user.getPassword());
		if (loginService.verifyLogin(user))
		{
			return SUCCESS;
		}
		else return LOGIN;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	@Override
	public User getModel() {
		return getUser();
	}

}
