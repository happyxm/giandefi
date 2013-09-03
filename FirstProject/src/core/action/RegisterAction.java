package core.action;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import core.bo.RegisterBo;
import core.model.User;

/**
 * Action class che si occupa della registrazione dell'utente in un database
 * @author Gianluca De Filippis
 *
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User>{

	private User user;
	private RegisterBo registerBo;
	
	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	/**
	 * controlla se i campi obbligatori sono vuoti e verifica che l'email sia in formato corretto
	 */
	public void validate()
	{
		System.out.println("validating");
		if (StringUtils.isEmpty(getUser().getUserId()))
		{
			addFieldError("userId", "Campo obbligatorio");
		}
		if (StringUtils.isEmpty(getUser().getPassword()))
		{
			addFieldError("password", "Campo obbligatorio");
		}
		if (StringUtils.isEmpty(getUser().getName()))
		{
			addFieldError("name", "Campo obbligatorio");
		}
		if (StringUtils.isEmpty(getUser().getSurname()))
		{
			addFieldError("surname", "Campo obbligatorio");
		}
		if (StringUtils.isEmpty(getUser().getEmail()))
		{
			addFieldError("email", "Campo obbligatorio");
		}
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(getUser().getEmail());
		if (!matcher.matches())
		{
			addFieldError("email", "email non valida!");
		}
	}
	
	@Override
	public String execute() throws Exception
	{
			System.out.println("execute called for user=" + user.getUserId() + " " + " password=" + user.getPassword());
			getRegisterBo().addUser(user);
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

	public RegisterBo getRegisterBo() {
		return registerBo;
	}

	public void setRegisterBo(RegisterBo registerBo) {
		this.registerBo = registerBo;
	}
	

	
}
