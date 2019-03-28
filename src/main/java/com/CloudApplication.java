package com;

import com.config.CommonInit;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.*.dao")
public class CloudApplication {
 /*   @Bean
    public Object testBean(PlatformTransactionManager platformTransactionManager){
        System.out.print(">>>>>>>>>>"+platformTransactionManager.getClass().getName());
        return  new Object();
    }*/
    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
        new CommonInit().init();
    }

}
