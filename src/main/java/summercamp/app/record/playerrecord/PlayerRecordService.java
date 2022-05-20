package summercamp.app.record.playerrecord;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PlayerRecordService
 */
@Service
public class PlayerRecordService {

	@Autowired
	private PlayerRecordRepository repo;

	public Iterable<PlayerRecord> findAll() {
		return repo.findAll();
	}

	public Optional<PlayerRecord> findById(Long id) {
		return repo.findById(id);
	}

	public void save(PlayerRecord gameRecord) {
		repo.save(gameRecord);
	}
}
