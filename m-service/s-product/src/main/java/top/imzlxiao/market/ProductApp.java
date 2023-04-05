package top.imzlxiao.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Zhang Longxiao
 * @date 2023/3/20 16:55
 */
//向注册中心注册自己的信息
@EnableDiscoveryClient
@SpringBootApplication
public class ProductApp {
    public static void main(String[] args) {
        SpringApplication.run(ProductApp.class,args);
    }
}


