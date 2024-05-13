package com.example.demoswagger.vo;

/**
 * @ClassName HelloVo
 * @Author diaoyn
 * @Date 2024/5/13 16:49
 */

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "HelloVo", title = "请求Vo")
public class HelloVo {
    @Schema(title = "名称", example = "admin")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
