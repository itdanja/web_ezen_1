package Day01.Day01_2.Controller;

import Day01.Day01_2.Dto.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 현재 클래스에 컨트롤러 어노테이션 주입
public class Maincontroller {

    @GetMapping(value = "/")
    public Member mainpage(){
        Member member = new Member("아이디" , "비밀번호");
        return member; // 객체 반환 => 반환타입 : 객체의 클래스
    }
}
