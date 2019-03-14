package com.poc.jigsaw.lombok.lombokmodule.controller;

import com.poc.jigsaw.lombok.lombokmodule.dto.TestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest/v1/test")
@Slf4j
public class LombokTestController {


    @GetMapping
    public ResponseEntity<TestDTO> test(TestDTO test) {
        log.info("Request receive {}", test);
        return ResponseEntity.ok(test);
    }
}
