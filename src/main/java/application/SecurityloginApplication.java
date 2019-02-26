package application;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import application.model.Role;
import application.model.User;
import application.repository.RoleRepository;
import application.repository.UserRepository;
import application.util.RoleEnum;


@SpringBootApplication
public class SecurityloginApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(SecurityloginApplication.class, args);
	
		RoleRepository roleRepository = ctx.getBean(RoleRepository.class);
		
    
		Role roleUser = new Role(RoleEnum.ROLE_USER);
		Role roleAdmin = new Role(RoleEnum.ROLE_ADMIN);
		
		roleRepository.save(roleUser);
		roleRepository.save(roleAdmin);
		
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		User user = new User("user", "password1", true);
		user.setRoles(Arrays.asList(roleUser));
		
		userRepository.save(user);
		
		User admin = new User("admin", "password2", true);
		admin.setRoles(Arrays.asList(roleUser, roleAdmin));
		
		userRepository.save(admin);
		
	}

}

