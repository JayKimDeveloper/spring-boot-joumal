package com.apress.spring.springbootjoumal;

import com.apress.spring.domain.Journal;
import com.apress.spring.repository.JournalRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJoumalApplication {

    @Bean
    InitializingBean saveData(JournalRepository repo){
        return() -> {
          repo.save(new Journal("스프링 부트 입문", "오늘부터 스프링 부트 공부하기 시작했다.","01/05/2019"));
          repo.save(new Journal("스프링 부트 해부", "스프링 부트를 자세히 살펴보았다.", "01/05/2019"));
          repo.save(new Journal("스프링 부트 클라우드", "클라우드 파운드리를 응용한 스프링 부트를 공부했다", "01/05/2019"));
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJoumalApplication.class, args);
    }

}
