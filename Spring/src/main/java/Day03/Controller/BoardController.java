package Day03.Controller;

import Day03.Domain.Dto.BoardDto;
import Day03.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;  // boardService 메소드 호출용 객체

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
    public String boardwritecontroller(BoardDto boardDto){
        boardService.boardwrite( boardDto );
        return "redirect:/board/boardlist"; // 글쓰기 성공시 게시판 목록이동
    }

}
