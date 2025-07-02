package com.codeplay.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
                "com.codeplay.components",
                "com.codeplay.model",
                "com.codeplay.config",
                "com.codeplay.service"
})
public class ProjectConfig {
}
