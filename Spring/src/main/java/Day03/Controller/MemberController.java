package Day03.Controller;

import Day03.Domain.Dto.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @GetMapping("/member/login")    // 로그인페이지 연결
    public String login(){
        return "Day03/login";
    }
    @GetMapping("/member/signup") // 회원가입페이지 연결
    public String signup(){return "Day03/member/signup";}

    @PostMapping("/member/signupcontroller") // 회원가입 처리 연결
    public String signupcontroller(MemberDto memberDto){
                                                // 자동주입 : form 입력한 name 과 dto의 필드명 동일하면 자동주입
                                                        // 입력이 없는 필드는 초기값[ 문자=null , 숫자 = 0 ]
        System.out.println( memberDto.toString() );
        return "redirect:/";  // 회원가입 성공시 메인페이지 연결
    }
}
