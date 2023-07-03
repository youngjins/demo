package com.example.demo.controller;

import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class DemoController {

    @Resource(name = "demoService")
    private DemoService demoService;

    @PostMapping(value = "/selectList", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> selectList(@RequestBody Map<String, Object> param) throws Exception {
        //Map<String, Object> data = (Map<String, Object>) command.get("data");
        System.out.println("ddddddddddd");
        Map<String, Object> result = demoService.selectList(param);

        return ResponseEntity.ok().body(result);
    };


}