package com.poc.jigsaw.lombok.lombokmodule.controller;

import com.poc.jigsaw.lombok.lombokmodule.dto.TestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest/v1/test")
public class LombokTestController {

    @GetMapping
    public ResponseEntity<TestDTO> test(TestDTO test) {
        return ResponseEntity.ok(test);
    }
}
