package Day03.Domain.Entity.Member;

import Day03.Domain.Entity.BaseTimeEntity;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity // DB내 테이블과 연결
@Table( name = "member") // 테이블속성
@Builder    // 생성자 안정성 보장
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@ToString
public class MemberEntity extends BaseTimeEntity  {

    @Id // 기본키 pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto key
    private int m_num;   // 회원번호
    @Column
    private String m_id;    // 회원아이디
    @Column
    private String m_password; // 회원비밀번호
    @Column
    private String m_name; // 회원이름
    @Column
    private String m_sex; // 회원성별
    @Column
    private String m_phone; // 회원연락처
    @Column
    private String m_email; // 회원이메일
    @Column
    private String m_address; // 회원주소
    @Column
    private int m_point; // 회원포인트
    @Column
    private String m_grade; // 회원등급

}
