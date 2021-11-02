package com.example.demoday004;

import com.example.demoday004.entity.qdd;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.AsyncRestOperations;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
//import com.thoughtmechanix.simpleservice;

@SpringBootApplication
@MapperScan("com.example.demoday004.mapper")
@EnableEurekaClient
@EnableCircuitBreaker
@RestController
@RequestMapping("/")
public class Demoday004Application {

    public static void main(String[] args) {
        SpringApplication.run(Demoday004Application.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(threadPoolKey = "helloThreadPool")
    public String helloRemoteServiceCall(String firstname,String lastname)throws Exception {
        qdd q=new qdd();
        q.setId(1);
        q.setName("1");
        q.setSex("1");

        ResponseEntity<String> restExchange=restTemplate.exchange(
                "http://logical-service-id/name/[ca]{firstname}/{lastname}",
                HttpMethod.GET,
                new HttpEntity<>(q),String.class,firstname,lastname
        );
        return restExchange.getBody();
    }
    @RequestMapping(value="/hello/{firstname}/{lastname}",method = RequestMethod.GET)
    public String hello(@PathVariable("firstname")String firstname,
                        @PathVariable("lastname")String lastname) throws Exception {
        return helloRemoteServiceCall(firstname, lastname);
    }
}
