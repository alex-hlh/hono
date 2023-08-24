package com.hu.hono.server;

import com.hu.hono.server.config.AppBanner;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.util.StopWatch;

@SpringBootApplication
@EnableAsync
@MapperScan(value = {"com.hu.hono.**.mapper"})
public class HonoApplication {

    private static final Logger logger = LoggerFactory.getLogger(HonoApplication.class);
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HonoApplication.class)
                .logStartupInfo(false)
                .banner(new AppBanner())
                .run(args);
        stopWatch.stop();
        Integer port = context.getBean(ServerProperties.class).getPort();
        logger.info("HonoServer 服务启动完成，耗时:{}s，演示页请访问: http://127.0.0.1:{} ", stopWatch.getTotalTimeSeconds(), port);
    }

}
