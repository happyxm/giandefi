/**
 * 
 */
package core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import core.bo.dao.ReadDAO;
import core.model.User;
import core.util.CustomHibernateDaoSupport;

/**
 * @author giandefi
 *
 */
@Repository("ReadDAO")
public class ReadDaoImpl extends CustomHibernateDaoSupport implements ReadDAO {

	/* (non-Javadoc)
	 * @see core.bo.dao.ReadDAO#getUsers()
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsers() 
	{
		return getHibernateTemplate().find("from User");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUsersByUserIdAndMail(String userId, String email) {
		String[] param = {userId, email};
		return getHibernateTemplate().find("from User u where u.userId = ? or u.email = ?", param);
	}

}
