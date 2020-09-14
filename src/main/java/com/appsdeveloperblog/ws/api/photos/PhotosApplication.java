package com.appsdeveloperblog.ws.api.photos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PhotosApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotosApplication.class, args);
    }

}
