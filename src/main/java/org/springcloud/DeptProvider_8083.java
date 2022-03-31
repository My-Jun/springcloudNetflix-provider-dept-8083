package org.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 启动类
@SpringBootApplication
// 开启eureka 在服务启动后自动将服务注册到eureka中
@EnableEurekaClient
// 服务发现及DeptController中的discovery方法
@EnableDiscoveryClient
public class DeptProvider_8083 {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_8083.class, args);
	}

}
