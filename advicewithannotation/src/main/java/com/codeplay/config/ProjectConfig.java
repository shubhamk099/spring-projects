package com.codeplay.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {
                "com.codeplay.components",
                "com.codeplay.model",
                "com.codeplay.config",
                "com.codeplay.service",
                "com.codeplay.aspects"
})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
