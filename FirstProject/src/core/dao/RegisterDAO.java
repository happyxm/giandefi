package core.dao;

import core.model.User;

/**
 * Data Access Object class che effettua operazioni in un database
 * @author Gianluca De Filippis
 *
 */
public interface RegisterDAO {
	
	boolean addUser(User user);

}
