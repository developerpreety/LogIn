package com.demo.LogIn;


import com.demo.LogIn.entity.User;
import com.demo.LogIn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class LogInApplication   {



	public static void main(String[] args) {
		SpringApplication.run(LogInApplication.class, args);
	}


	/*@Override
	public void run(String... args) throws Exception {
		User user=new User();
		user.setUsername("Preeti");
		user.setPassword(bCryptPasswordEncoder.encode("abc"));
		user.setEmail("abc@gmail.com");
		userRepository.save(user);


	}*/
}
