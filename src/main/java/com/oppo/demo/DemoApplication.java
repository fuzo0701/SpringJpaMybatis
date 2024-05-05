package com.oppo.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.oppo.demo.model.Post;
import com.oppo.demo.model.User;
import com.oppo.demo.repository.PostRepository;
import com.oppo.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

	private final PostRepository postRepository;
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Post> postList = List.of(
            new Post(UUID.randomUUID(), "title1", "contents1","", LocalDateTime.now()),
            new Post(UUID.randomUUID(), "title2", "contents1","", LocalDateTime.now()),
            new Post(UUID.randomUUID(), "title3", "contents1","", LocalDateTime.now())
        );

		postRepository.saveAll(postList);

		List<User> userList = List.of(
			User.builder().email("matthew@oppo.com")
				.password(passwordEncoder.encode("1234"))
				.name("matthew")
			.build()
		);
		userRepository.saveAll(userList);
	}

}
