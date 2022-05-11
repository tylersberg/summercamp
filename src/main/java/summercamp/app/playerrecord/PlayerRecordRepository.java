package summercamp.app.playerrecord;

import org.springframework.data.repository.CrudRepository;

public interface PlayerRecordRepository extends CrudRepository<PlayerRecord, Long> {

	public PlayerRecord findByPlayerName(String name);

	public PlayerRecord findByPlayerId(String id);
}
