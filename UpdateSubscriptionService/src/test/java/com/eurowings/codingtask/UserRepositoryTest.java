package com.eurowings.codingtask;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.eurowings.codingtask.entity.Users;
import com.eurowings.codingtask.repository.UserRepository;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@TestPropertySource(properties = { "spring.jpa.hibernate.ddl-auto=validate" })
class UserRepositoryTest {

	@Autowired
	private UserRepository repository;

	@Test
	public void testUserRepository() {
		repository.save(new Users("Naj89", "naj89@gmail.com"));
		Optional<Users> userSaved = repository.findByUserName("Naj89");
		assertThat(userSaved.get()).isNotNull();
	}

}
