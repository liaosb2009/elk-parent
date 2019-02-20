package com.elk.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@ServletComponentScan // 启用扫描Servlet,包括监听，过滤，servlet本身
@EnableFeignClients // 启用Feign客户端
@EnableEurekaClient//自动注册进eureka服务中
public class ElkPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElkPortalApplication.class, args);
	}

}
