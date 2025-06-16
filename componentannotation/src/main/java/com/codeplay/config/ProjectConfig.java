package com.codeplay.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * We also need to tell the spring where to look for the classes annotated
 * with @Component annotation (with @ComponentScan), otherwise it will scan the
 * whole package, and this causes performance degradation
 */

@Configuration
@ComponentScan(basePackages = "com.codeplay.beans")
public class ProjectConfig {

}
