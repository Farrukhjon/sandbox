package io.github.farrukhjon.experiment.spring.jersey;

import io.github.farrukhjon.experiment.spring.jersey.outbound.PostProvider;
import io.github.farrukhjon.experiment.spring.jersey.outbound.PostProviderImpl;
import io.github.farrukhjon.experiment.spring.jersey.service.PostService;
import io.github.farrukhjon.experiment.spring.jersey.service.PostServiceImpl;
import io.github.farrukhjon.experiment.spring.jersey.repository.PostRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Bean
    public RestOperations restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public PostProvider postProvider(final RestOperations restTemplate) {
        return new PostProviderImpl(restTemplate);
    }

    @Bean
    public PostService postService(final PostProvider postProvider, final PostRepository repository) {
        return new PostServiceImpl(postProvider, repository);
    }

    public static void main(String[] args) {
        new Application().configure(new SpringApplicationBuilder(Application.class)).run(args);
    }
}
