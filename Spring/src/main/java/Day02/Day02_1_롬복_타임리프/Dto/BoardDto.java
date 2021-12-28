package Day02.Day02_1_롬복_타임리프.Dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
    // 필드
    private String b_title;
    private String b_contents;
    private Date b_date;
    // 생성자
    //  빈생성자 ->  @NoArgsConstructor 대체
    //  풀생성자 -> @AllArgsConstructor 대체

    // 메소드
    // get -> @Getter 대체
    // get -> @Setter 대체
}

// 롬복 사용하는 이유 **
