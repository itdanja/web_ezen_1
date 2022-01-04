package Day03.Controller;

import Day03.Domain.Dto.MemberDto;
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
    public String signup(){
        return "Day03/member/signup";
    }

    @PostMapping("/member/signupcontroller") // 회원가입 처리 연결
    public String signupcontroller(MemberDto memberDto){
        System.out.println( memberDto.get)
        return "redirect : /member/login";  // 회원가입 성공시 로그인페이지 연결

    }

}
