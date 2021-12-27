package Day01.Day01_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day01_2Lombok {

    // 콘솔에 출력
    /*public static void main(String[] args) {
        Member member = new Member();
        member.setId("qweqwe");
        member.setPassword("1234");
        System.out.println( member.getId() );
        System.out.println( member.getPassword() );
    }*/
    public static void main(String[] args) {
        SpringApplication.run( Day01_2Lombok.class , args);
    }
}
