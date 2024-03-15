package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping
public class UnsplashController {

    private final RestTemplate restTemplate;

    @Autowired
    public UnsplashController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Value("${UNSPLASH_KEY}")
    private String unsplashKey;

    @Value("${UNSPLASH_URL}")
    private String unsplashUrl;

    @GetMapping("/new-image")
    public ResponseEntity<Photo> getRandomPhoto(@RequestParam("query") String query) {
        System.out.println("Received request to /api/search/photos with query: " + query);

        String apiUrl = unsplashUrl + "/photos/random";

        // Set up headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept-Version", "v1");
        headers.set("Authorization", "Client-ID " + unsplashKey);

        // Set up parameters
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(apiUrl)
                .queryParam("query", query);

        // Make the request

        ResponseEntity<Photo> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                new HttpEntity<>(headers),
                Photo.class
        );
        return response;
    }
}
