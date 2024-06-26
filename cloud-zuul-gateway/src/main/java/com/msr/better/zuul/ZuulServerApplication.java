package com.msr.better.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2021-05-16 16:15
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableOAuth2Sso
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }
}
