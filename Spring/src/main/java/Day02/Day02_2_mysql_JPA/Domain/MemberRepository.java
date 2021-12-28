package Day02.Day02_2_mysql_JPA.Domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity , Long> {
                        // 아무거나 인테페이스명 extends JpaRepository< 엔티티명 , 기본키자료형 >
}
