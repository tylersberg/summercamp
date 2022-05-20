package summercamp.app.record.gamerecord;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameRecordController {

	@Autowired
	private GameRecordService gs;

	@GetMapping("/gamerecords")
	public Iterable<GameRecord> all() {
		return gs.findAll();
	}

	@PostMapping("/gamerecords")
	public void save(@RequestBody GameRecord newGameRecord) {
		gs.save(newGameRecord);
	}

	@GetMapping("/gamerecords/{id}")
	public Optional<GameRecord> getGameRecord(@PathVariable String id) {
		return gs.findById(id);
	}
}
