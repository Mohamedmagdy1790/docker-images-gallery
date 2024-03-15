package com.example.api.jsonplaceholderApi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/api")
@RestController
public class JsonPlaceHolderController {
    JsonPlaceHolderClient jsonPlaceHolderClient;

    @Autowired
    JsonPlaceHolderController(JsonPlaceHolderClient jsonPlaceHolderClient){
        this.jsonPlaceHolderClient= jsonPlaceHolderClient;
    }
    @GetMapping("/posts/{id}")
    Post getPost(@PathVariable Integer id){
        return jsonPlaceHolderClient.getPost(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/a")
    String getString(){
        System.out.println("did you entered this method");
        return "hello";
    }
}
