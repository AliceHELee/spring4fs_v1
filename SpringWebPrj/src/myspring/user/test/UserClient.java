package myspring.user.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import myspring.user.dao.UserDao;
import myspring.user.service.UserService;
import myspring.user.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/beans.xml")
public class UserClient {
	@Autowired
	ApplicationContext context;
	@Autowired
	UserService service;

	@Test 
	public void daoTest() {
		UserDao dao = context.getBean("userDao",UserDao.class);
		
		//dao.insert(new UserVO("dooly", "�Ѹ�", "��", "����"));
		//dao.update(new UserVO("dooly", "�Ѹ�2", "��", "���"));
		//dao.delete("dooly");
		
//		List<UserVO> list = dao.readAll();
//		for (UserVO userVO : list) {
//			System.out.println(userVO);
//		}
		
		UserVO vo = dao.read("gildong");
		System.out.println(vo);
		
	}
	
	@Test @Ignore
	public void configTest() {
		SqlSession session = context.getBean("sqlSession",SqlSession.class);
		System.out.println(session.getClass().getName());
		
		UserVO vo = session.selectOne("myspring.user.dao.UserMapper.selectUserById", "gildong");
		System.out.println(vo);
	}
	
	@Test @Ignore
	public void updateUserTest() {
		service.updateUser(new UserVO("gildong", "ȫ�浿2", "��2", "����2"));

		UserVO user = service.getUser("gildong");
		System.out.println(user);
	}

	@Test
	@Ignore
	public void insertUserTest() {
		service.insertUser(new UserVO("dooly", "�Ѹ�", "��", "���"));

		for (UserVO user : service.getUserList()) {
			System.out.println(user);
		}
	}
	
	@Test @Ignore
	public void getUserTest() {
		UserVO user = service.getUser("gildong");
		System.out.println(user);
		assertEquals("ȫ�浿", user.getName());
	}

	@Test
	@Ignore
	public void dataSourceTest() {
		DataSource ds = (DataSource) context.getBean("dataSource");
		try {
			System.out.println(ds.getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	@Test
	@Ignore
	public void deleteUserTest() {
		service.deleteUser("dooly");

		for (UserVO user : service.getUserList()) {
			System.out.println(user);
		}
	}



	@Test
	@Ignore
	public void serviceTest() {
		UserService service = context.getBean(UserService.class);
		System.out.println("------���ڵ� ����--------");
		service.deleteUser("vega2k");
		service.deleteUser("dooly");
		service.deleteUser("jungwu");
		System.out.println("------���ڵ� ����--------");
		service.insertUser(new UserVO("vega2k", "�ȳ�", "��", "����"));
		service.insertUser(new UserVO("dooly", "�Ѹ�", "��", "����"));
		service.insertUser(new UserVO("jungwu", "����", "��", "�λ�"));
		System.out.println("------���ڵ� ���--------");
		for (UserVO user : service.getUserList()) {
			System.out.println(user);
		}
		System.out.println("----userid= dooly ���ڵ� ����  -----");
		service.updateUser(new UserVO("dooly", "�Ѹ�", "��", "����"));

		System.out.println("----userid = dooly ���ڵ� ��ȸ -----");
		System.out.println(service.getUser("dooly"));
	}

}