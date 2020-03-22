package springPrj.user.dao;

import springPrj.user.vo.UserVo;

public interface UserDao {

	public void insert(UserVo user);
	
	public UserVo read(String id);
	
	
}
