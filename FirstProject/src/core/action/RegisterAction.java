package core.action;

import org.apache.commons.lang3.StringUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import core.bo.UserBo;
import core.model.User;

public class RegisterAction extends ActionSupport implements ModelDriven<User>{

	private User user;
	private UserBo userBo;
		
	public void validate()
	{
		System.out.println("validating");
		if (StringUtils.isEmpty(getUser().getUserId()))
		{
			addFieldError("userId", "Campo userId vuoto!");
		}
		if (StringUtils.isEmpty(getUser().getPassword()))
		{
			addFieldError("password", "Campo password vuoto!");
		}
	}
	
	public String execute() throws Exception
	{
			System.out.println("execute called for user=" + user.getUserId() + " " + " password=" + user.getPassword());
			getUserBo().addUser(user);
			return "success";
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public User getModel() {
		return user;	}
	public UserBo getUserBo() {
		return userBo;
	}
	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}
	
}
