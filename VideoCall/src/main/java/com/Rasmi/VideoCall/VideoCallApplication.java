package com.Rasmi.VideoCall;

import com.Rasmi.VideoCall.user.User;
import com.Rasmi.VideoCall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
					.username("Rashmi")
					.email("Rasmi@mail.com")
					.password("123")
					.build());

			service.register(User.builder()
					.username("John")
					.email("john@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Shubha")
					.email("subh@mail.com")
					.password("123")
					.build());
		};
	}

}
