package com.example.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/api")
@RestController
public class JsonPlaceHolderController {
    JsonPlaceHolderClient jsonPlaceHolderClient;

    @Autowired
    JsonPlaceHolderController(JsonPlaceHolderClient jsonPlaceHolderClient){
        this.jsonPlaceHolderClient= jsonPlaceHolderClient;
    }
    @GetMapping("/posts")
    List<Post> getPosts(){
        return jsonPlaceHolderClient.getPosts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/a")
    String getString(){
        System.out.println("did you entered this method");
        return "hello";
    }
}
