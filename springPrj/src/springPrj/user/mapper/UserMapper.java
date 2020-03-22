package springPrj.user.mapper;

import springPrj.user.vo.UserVo;

public interface UserMapper {

	UserVo selectUserById(String id);
}
