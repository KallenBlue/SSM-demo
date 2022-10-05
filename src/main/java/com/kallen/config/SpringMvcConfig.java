package com.kallen.config;

import com.kallen.controller.interceptor.ProjectInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.kallen.controller","com.kallen.config"})
@EnableWebMvc
public class SpringMvcConfig {

}
