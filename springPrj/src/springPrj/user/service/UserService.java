package springPrj.user.service;

import java.util.List;

import springPrj.user.vo.UserVo;

public interface UserService {

	public void insertUser(UserVo user);
	
	public List<UserVo> getUserList();
	
	public void deleteUser(String id);
	
	public UserVo getUser(String id);
	
	public void updateUser(UserVo user);
}
