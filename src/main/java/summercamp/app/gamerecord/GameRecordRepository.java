package summercamp.app.gamerecord;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.time.LocalDateTime;

public interface GameRecordRepository extends CrudRepository<GameRecord, String> {

	public List<GameRecord> findByStartBetween(LocalDateTime start, LocalDateTime end);

}
