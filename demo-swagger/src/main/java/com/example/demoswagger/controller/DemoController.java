package com.example.demoswagger.controller;

import com.example.demoswagger.vo.HelloVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName DemoController
 * @Author diaoyn
 * @Date 2024/5/13 16:45
 */
@Tag(name = "demo接口")
@RestController
@RequestMapping()
public class DemoController {


    @Operation(summary = "get请求")
    @Parameter(name = "name", description = "", example = "admin")
    @GetMapping("/hello")
    public String hello(@RequestParam Boolean name) {
        return "hello " + name;
    }

    @Operation(summary = "post请求")
    @PostMapping("/hello2")
    public String hello2(@RequestBody HelloVo vo) {
        return "hello " + vo.getName();
    }
}
