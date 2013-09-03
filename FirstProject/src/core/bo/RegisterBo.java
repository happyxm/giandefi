package core.bo;

import core.model.User;

/**
 * Business Object che si occupa della registrazione di un nuovo utente 
 * @author Gianluca De Filippis
 *
 */
public interface RegisterBo {

	/**
	 * Aggiunte un nuovo utente al database
	 * @param user l'utente da aggiungere al database
	 */
	void addUser(User user);
}
