package core.dao.exceptions;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(String err)
	{
		super(err);
	}
}
