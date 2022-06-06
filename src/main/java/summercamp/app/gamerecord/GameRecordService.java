package summercamp.app.gamerecord;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * GameRecordService
 */

@Service
public class GameRecordService {

	@Autowired
	private GameRecordRepository repo;

	public List<GameRecord> findAll() {
		return repo.findAll();
	}

	public Optional<GameRecord> findById(String id) {
		return repo.findById(id);
	}

	public void save(GameRecord gameRecord) {
		repo.save(gameRecord);
	}
}
