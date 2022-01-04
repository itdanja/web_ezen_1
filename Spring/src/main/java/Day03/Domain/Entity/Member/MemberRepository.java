package Day03.Domain.Entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity , Integer> {

}
