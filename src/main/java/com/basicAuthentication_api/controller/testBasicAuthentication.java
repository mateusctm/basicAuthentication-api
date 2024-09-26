package com.basicAuthentication_api.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("BasicAuthentication")
public class testBasicAuthentication {

    @GetMapping
    public ResponseEntity<String> basicAuthentication() {
        return  ResponseEntity.ok("teste");
    }


}
