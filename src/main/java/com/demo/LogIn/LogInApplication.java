package com.demo.LogIn;

import com.demo.LogIn.entity.User;
import com.demo.LogIn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class LogInApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(LogInApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		user.setUsername("Preeti");
		user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
		user.setEmail("abc@gmail.com");
		user.setStatus("Active");
		user.setRole("ROLE_ADMIN");

		this.userRepository.save(user);

		User user1=new User();
		user1.setUsername("Amresh");
		user1.setPassword(this.bCryptPasswordEncoder.encode("hey"));
		user1.setEmail("hey@gmail.com");
		user1.setStatus("Active");
		user1.setRole("ROLE_USER");
		this.userRepository.save(user1);
	}
}
