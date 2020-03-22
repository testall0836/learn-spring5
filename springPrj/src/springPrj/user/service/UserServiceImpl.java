package springPrj.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springPrj.user.dao.UserDao;
import springPrj.user.vo.UserVo;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	
	@Override
	public void insertUser(UserVo user) {
		userdao.insert(user);

	}

	@Override
	public List<UserVo> getUserList() {
		return null;
	}

	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public UserVo getUser(String id) {
		return userdao.read(id);
	}

	@Override
	public void updateUser(UserVo user) {
		// TODO Auto-generated method stub

	}

}
