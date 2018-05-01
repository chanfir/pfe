package com.chanfir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chanfir.entity.ParametreJob;
import com.chanfir.entity.SpiJob;

@Configuration
@ComponentScan(basePackages = {"com.chanfir"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication
@RestController
public class TalendBackendApplication {

    @RequestMapping("/")
    public String info() {
        return "CandidateApp Server v1.0";
    }

    public static void main(String[] args) {
        SpringApplication.run(TalendBackendApplication.class, args);
        
//        ParametreJob param=new ParametreJob();
//        
//        SpiJob job=new SpiJob();
//        job.getParamSet().add(param);
    }
}
