package br.com.spring;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.spring.auth.domain.Role;
import br.com.spring.auth.domain.User;
import br.com.spring.auth.service.RoleService;
import br.com.spring.auth.service.UserService;

@Service
public class Initializer {
	
	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@PostConstruct
	public void criaUsuariosEPermissoes() {
		Role roleAdmin = new Role();

		roleAdmin.setName("USER");

		roleService.save(roleAdmin);

		User user = new User();
		user.setAtivo(true);
		user.setEmail("teste@teste.com");
		user.setNome("Anderson");
		user.setSenha(new BCryptPasswordEncoder().encode("123456"));
		user.setUsername("anderson");
		user.setRoles(Arrays.asList(roleAdmin));

		userService.save(user);

	}
}