package Day01.Day01_2.Dto;

import lombok.*;

// lombok 라이브러니는 클래스 설계시 사용되는 어노테이션 제공
    // * 실행시 자동으로 메소드 생성

@Setter // 현재 필드에 set메소드 제공
@Getter // 현재 필드에 get메소드 제공
@NoArgsConstructor // 빈생성자 제공
@AllArgsConstructor // 풀생성자 제공
//@RequiredArgsConstructor //  생성자 사용시 null 값 부여
@ToString // 객체 정보 메소드 제공
public class Member {
    // 필드
    private String id;
    private String password;
    // 생성자 [ 룸북 사용하면 빈생성자,풀생성자 제공 ]
    // 메소드 [ 룸북 사용하면 get,set메소드 자동생성 ]
}
