
package Day01.Day01_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // http 로부터 객체 전송 가능
@SpringBootApplication // 1.스프링부트에서 제공하는 기본적인 설정값 가져오기
public class Day01_1springbootstart {

    public static void main(String[] args) {
        // 2. 스프링부트 시작 메소드
        SpringApplication.run( Day01_1springbootstart.class , args );
    }
    @GetMapping(value = "/") // "/" : 최상위 경로 와 매핑           "/"경로와 메소드 매핑[연결]
    public  String 보내기(){
        return "스프링부트 시작합니다"; // 매핑된 경로로 메소드 결과 호출
    }

/*
        HTTP : HyperText Transfer Protocol
            // 1. https://www.naver.com/ -> 네이버 문서 전송 받음
            // 2. http : 문서 교환

        @ : 어노테이션
            1. @SpringBootApplication : 1.스프링부트에서 제공하는 기본적인 설정값 가져오기
                    1. SpringApplication.run( 클래스명.class , args );

            1. @RestController : @Controller , @ResponseBody  합쳐진 어노테이션
            2. @Controller : HTTP 응답 본문의 객체로 클라이언트 전송
            3. @GetMapping :
                        1. 컨트롤러 클래스에서 사용을 한다
                        2. URL 과 매핑
    */

}

