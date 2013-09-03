package core.dao;

import core.model.User;

/**
 * Data Access Object class che interroga un database
 * @author Gianluca De Filippis
 *
 */
public interface LoginDAO {

	/**
	 * Verifica tramite una query su userId e password che l'utente esiste nel database
	 * @param user utente da verificare
	 * @return il record dell'utente trovato
	 */
	public User verifyLogin(User user);

}
