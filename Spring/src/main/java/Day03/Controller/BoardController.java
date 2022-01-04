package Day03.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    // http url 연결
    @GetMapping("/board/boardlist")
    public String boardlist(){
        return "Day03/board/boardlist" ;  // 타임리프 를 통한 html 반환
    }
    @GetMapping("/board/boardwrite")
    public String boardwrite(){
        return "Day03/board/boardwrite";
    }
    @PostMapping("/board/boardwritecontroller")
    public String boardwritecontroller(){
        return "redirect:/board/boardlist"; // 글쓰기 성공시 게시판 목록이동
    }
}
