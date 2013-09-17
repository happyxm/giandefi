/**
 * 
 */
package core.bo.dao;

import java.util.List;

import core.model.User;

/**
 * Data Access Object class che legge da un database
 * @author giandefi
 *
 */
public interface ReadDAO {
	
	/**
	 * legge dal database i dettagli degli utenti
	 * @return la lista contenente gli utenti
	 */
	public List<User> getUsers();

	/**
	 * legge dal database tutti gli utenti con userId ed email specifici
	 * @param userId
	 * @param email
	 * @return
	 */
	public List<User> getUsersByUserIdAndMail(String userId, String email);
}
