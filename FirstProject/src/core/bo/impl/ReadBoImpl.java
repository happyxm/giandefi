package core.bo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import core.bo.ReadBo;
import core.bo.dao.ReadDAO;
import core.model.User;

@Service("readBo")
public class ReadBoImpl implements ReadBo {

	private ReadDAO readDAO;
	
	@Override
	public List<User> getRegisteredUsers() {
		return readDAO.getUsers();
	}

	public ReadDAO getReadDAO() {
		return readDAO;
	}

	public void setReadDAO(ReadDAO readDAO) {
		this.readDAO = readDAO;
	}

	@Override
	public List<User> getUsersByUserIdAndMail(String userId, String email) {
		return readDAO.getUsersByUserIdAndMail(userId, email);
	}

}
