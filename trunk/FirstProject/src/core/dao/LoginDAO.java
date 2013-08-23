package core.dao;

import core.model.User;

public interface LoginDAO {

	boolean verifyLogin(User user);

}
