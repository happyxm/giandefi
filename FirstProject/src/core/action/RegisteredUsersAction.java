package core.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import core.bo.ReadBo;
import core.model.User;

public class RegisteredUsersAction extends ActionSupport implements ModelDriven<User>{

	private static final long serialVersionUID = -5380851873583016562L;
	private User user;
	private ReadBo readBo;
	private List<User> list;

	@Override
	public String execute()
	{
		list = readBo.getRegisteredUsers();
		if (list.size() > 0)
		{
			return SUCCESS;
		}
		else return "notregistered";
	}

	public ReadBo getReadBo() {
		return readBo;
	}

	public void setReadBo(ReadBo readBo) {
		this.readBo = readBo;
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
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
}
