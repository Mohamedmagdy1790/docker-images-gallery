package com.example.api.jsonplaceholderApi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonPlaceHolderConfig {

    @Bean(value = "jsonplaceholder")
    CommandLineRunner commandLineRunner(JsonPlaceHolderClient jsonPlaceHolderClient){

        return args -> {
            System.out.println(jsonPlaceHolderClient.getPosts().size());

            System.out.println("-------------------");

            System.out.println(jsonPlaceHolderClient.getPost(1));

            Post post=  jsonPlaceHolderClient.getPost(1);

            System.out.println(post.getTitle());
        };
    }


}
