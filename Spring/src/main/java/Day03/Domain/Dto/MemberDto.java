package Day03.Domain.Dto;

import lombok.*;

@NoArgsConstructor // 빈생성자
@AllArgsConstructor // 풀생성자
@Getter@Setter  // get / set 메소드
@ToString // 객체 정보 메소드
public class MemberDto {
    // 필드
    private int m_num;   // 회원번호
    private String m_id;    // 회원아이디
    private String m_password; // 회원비밀번호
    private String m_name; // 회원이름
    private String m_sex; // 회원성별
    private String m_phone; // 회원연락처
    private String m_email; // 회원이메일
    private String m_address; // 회원주소
    private int m_point; // 회원포인트
    private String m_grade; // 회원등급
}