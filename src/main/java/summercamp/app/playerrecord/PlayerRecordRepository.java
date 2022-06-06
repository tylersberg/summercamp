package summercamp.app.playerrecord;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRecordRepository extends JpaRepository<PlayerRecord, Long> {

	public PlayerRecord findByPlayerName(String name);

	public PlayerRecord findByPlayerId(String id);
}
