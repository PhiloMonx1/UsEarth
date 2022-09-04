package sparta.seed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sparta.seed.domain.ClearMission;

public interface ClearMissionRepository extends JpaRepository<ClearMission,Long> {
	int countAllByMemberId(Long memberId);
}
