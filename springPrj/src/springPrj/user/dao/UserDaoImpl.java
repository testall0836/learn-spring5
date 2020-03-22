package springPrj.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springPrj.user.vo.UserVo;

//@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SqlSession session;

	@Override
	public void insert(UserVo user) {
		session.update("userNS.insertUser", user);

	}

	@Override
	public UserVo read(String id) {
		UserVo user = session.selectOne("userNS.selectUserById", id);
		return user;
	}

}
