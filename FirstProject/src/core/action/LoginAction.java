package core.action;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import core.bo.LoginBo;
import core.model.User;

public class LoginAction extends ActionSupport implements ModelDriven<User>{

	private User user;
	private LoginBo loginBo;

	
	public void validate()
	{
		System.out.println("validate method called");
		if (StringUtils.isEmpty(user.getUserId()))
		{
			addFieldError("userId", "Campo userId vuoto!");
		}
		if (StringUtils.isEmpty(user.getPassword()))
		{
			addFieldError("password", "Campo password vuoto!");
		}
	}
	
	@Override
	public String execute()
	{	
		System.out.println("execute user="+user.getUserId() + " pass=" + user.getPassword());
		if (getLoginBo().verifyLogin(user))
		{

				return SUCCESS;
		
		}
		else return "notregistered";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		return getUser();
	}

	public LoginBo getLoginBo() {
		return loginBo;
	}

	public void setLoginBo(LoginBo loginBo) {
		this.loginBo = loginBo;
	}

}
