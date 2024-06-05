package sia.tcloudauthenticator.data;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import sia.tcloudauthenticator.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Configuration
public class DataConfig {



    @Bean
	ApplicationRunner dataLoader(UserRepository repo, PasswordEncoder encoder) {
       return args -> {
           repo.save(new Users("habuma", encoder.encode("password"), "ROLE_ADMIN"));
           repo.save(new Users("tacochef", encoder.encode("password"), "ROLE_ADMIN"));
       };
    }


}