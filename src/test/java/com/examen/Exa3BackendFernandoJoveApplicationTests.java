package com.examen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.examen.Dao.UsuarioDao;



@SpringBootTest
class Exa3BackendFernandoJoveApplicationTests {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Test
	void contextLoads() {
		System.out.println(passwordEncoder.encode("1234"));
	}

}
