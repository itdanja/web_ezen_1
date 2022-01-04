package Day03.Service;

import Day03.Domain.Dto.BoardDto;
import Day03.Domain.Entity.Board.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    // 필수!!!!!!!
public class BoardService {

    @Autowired
    BoardRepository boardRepository;

    public void boardwrite( BoardDto boardDto){
        boardRepository.save( boardDto.toentity() );
    }

}
