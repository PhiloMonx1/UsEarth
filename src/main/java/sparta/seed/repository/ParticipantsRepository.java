package sparta.seed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sparta.seed.domain.Community;
import sparta.seed.domain.Participants;

public interface ParticipantsRepository extends JpaRepository<Participants,Long> {
  Boolean existsByCommunityAndMemberId(Community Community, Long memberId);
  Long deleteByMemberId(Long memberId);
}
