package com.john.wiki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * 启动类
 *
 * @author constantinejohn
 */
@SpringBootApplication
public class WikiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {

        // 添加启动成功的日志
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment environment = app.run(args).getEnvironment();
        LOG.info("启动成功！！！");
        LOG.info("地址：\thttps://127.0.0.1:{}", environment.getProperty("server.port"));
    }

}
