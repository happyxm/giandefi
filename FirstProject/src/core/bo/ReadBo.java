/**
 * 
 */
package core.bo;

import java.util.List;

import core.model.User;

/**
 * Business Object che legge dal database
 * @author giandefi
 *
 */
public interface ReadBo {
	
	/**
	 * Legge la lista degli utenti registrati nel database
	 * @return
	 */
	public List<User> getRegisteredUsers();

	/**
	 * Legge la lista degli utenti con un certo userId ed email
	 * @param userId
	 * @param email
	 * @return
	 */
	public List<User> getUsersByUserIdAndMail(String userId, String email);
}
