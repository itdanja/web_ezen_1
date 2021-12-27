package Day01.Day01_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // RestController <-----> 템플릿엔진 호환불가
@SpringBootApplication
public class Day01_3thymeleaf {

    public static void main(String[] args) {
        SpringApplication.run( Day01_3thymeleaf.class , args );
    }

    // 타임리프[thymeleaf] 를 이용한 html 에 접근
        // thymeleaf : resources폴더내 templates 폴더내에서 html 반환
                    // java폴더에 백엔드
                    // resources폴더에 프론트엔드 [ html , css , js 등등 ]
    @GetMapping("/")
    public String mainpage(){
        return "Day01/mainpage";    // html 파일명 경로
    }
}



