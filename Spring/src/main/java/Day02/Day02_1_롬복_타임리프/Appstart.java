package Day02.Day02_1_롬복_타임리프;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Appstart {
    public static void main(String[] args) {
        SpringApplication.run( Appstart.class , args);
    }
}

// 스프링부트를 실행하는 방법
    // 1. @SpringBootApplication : 주입
    // 2.  SpringApplication.run( 현재클래스명.class , args);