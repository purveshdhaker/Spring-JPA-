package com.ashdaker.rest.springjpa;

import com.ashdaker.rest.springjpa.model.Author;
import com.ashdaker.rest.springjpa.model.Video;
import com.ashdaker.rest.springjpa.repository.AuthorRepository;
import com.ashdaker.rest.springjpa.repository.VideoRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository authorRepository,
            VideoRepository videoRepository
    ) {
        return args -> {

//            for (int i = 0; i < 50; i++) {
//                Faker faker = new Faker();
//                var author = Author.builder()
//                        .firstName(faker.name().firstName())
//                        .lastName(faker.name().lastName())
//                        .age(faker.number().numberBetween(20, 80))
//                        .email(faker.name().username() + "@aliboucoding.com")
//                        .build();
//                authorRepository.save(author);
//            }


//          var author = Author.builder()
//                  .firstName("Purvesh")
//                  .lastName("dhaker")
//                  .age(22)
//                  .email("ashdaker@ashdaker.com")
//                  .build();

//            authorRepository.save(author);

//            var video = Video.builder().name("ABC").length(5).build();
//            videoRepository.save(video);

        };
    }
}
