package springPrj.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springPrj.user.mapper.UserMapper;
import springPrj.user.vo.UserVo;

@Repository("userDao")
public class UserDaoImplMapper implements UserDao {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public void insert(UserVo user) {
		

	}

	@Override
	public UserVo read(String id) {
		UserVo user = userMapper.selectUserById(id);
		return user;
	}

}
