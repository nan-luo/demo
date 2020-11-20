package com.hfsoft.hfcms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.hfsoft.hfcms.sysmanager.mapper"})
public class HfcmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HfcmsApplication.class, args);
    }

}
