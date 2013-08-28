package core.bo;

import core.model.User;

/**
 * Business Object che si occupa del login
 * @author Gianluca De Filippis
 *
 */
public interface LoginBo {
	
	/**
	 * verifica che l'utente esiste nel database
	 * @param user l'utente da cercare
	 * @return <b>true</b> se l'utente esiste<br>
	 * <b>false</b> se l'utente non esiste
	 */
	public boolean verifyLogin(User user);

}
