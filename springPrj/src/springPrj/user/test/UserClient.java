package springPrj.user.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springPrj.user.dao.UserDao;
import springPrj.user.service.UserService;
import springPrj.user.vo.UserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/beans.xml")
public class UserClient {

	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserService service;
	
	@Test
	public void daoTest() {
		UserDao dao = context.getBean("userDao", UserDao.class);
		UserVo vo = dao.read("id1");
		
		System.out.println("daoTest vo"+ vo);
	}
	
	@Test @Ignore
	public void configTest() {
		SqlSession session = context.getBean("sqlSession", SqlSession.class);
		System.out.println(session.getClass().getName());
		
		UserVo vo = session.selectOne("userNS.selectUserById", "id1");
		System.out.println(vo);
	}
}
