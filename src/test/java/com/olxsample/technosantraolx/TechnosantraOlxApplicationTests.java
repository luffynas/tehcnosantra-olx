package com.olxsample.technosantraolx;

import com.olxsample.technosantraolx.entity.User;
import com.olxsample.technosantraolx.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TechnosantraOlxApplicationTests extends TestCase {

	@Autowired
	private UserService userService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testLoadAndSaveUser(){
		User user = new User();
		user.setId(1L);
		user.setName("Dheni");
		user.setEmail("dheni@gmail.com");
		user.setPassword("123123");
		userService.save(user);

		List<User> users = userService.findAll();
		System.out.println("size =>> "+users.size());
		assertEquals("Sukses", users.size(), 1);

	}

}

