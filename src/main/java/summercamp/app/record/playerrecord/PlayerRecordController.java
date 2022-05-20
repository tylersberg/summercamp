
package summercamp.app.record.playerrecord;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerRecordController {

	@Autowired
	private PlayerRecordService ps;

	@GetMapping("/playerrecords")
	public Iterable<PlayerRecord> all() {
		return ps.findAll();
	}

	@PostMapping("/playerrecords")
	public void save(@RequestBody PlayerRecord newPlayerRecord) {
		ps.save(newPlayerRecord);
	}

	@GetMapping("/playerRecords/{id}")
	public Optional<PlayerRecord> getPlayerRecord(@PathVariable Long id) {
		return ps.findById(id);
	}
}
