package com.bcdbook.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Security Demo 的启动类
 *
 * @author summer
 * @date 2019-01-15 18:35
 * @version V1.0.0-RELEASE
 */
@SpringBootApplication
@RestController
@EnableSwagger2
public class SecurityDemoApplication {
    /**
     * Security Demo 的主入口
     *
     * @author summer
     * @date 2019-01-15 18:34
     * @param args 默认参数
     * @return void
     * @version V1.0.0-RELEASE
     */
    public static void main(String[] args) {
        SpringApplication.run(SecurityDemoApplication.class, args);
    }
}