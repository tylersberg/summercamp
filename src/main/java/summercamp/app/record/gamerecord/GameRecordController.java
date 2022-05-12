package summercamp.app.record.gamerecord;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GameRecordController {

  private final GameRecordRepository repo;

  GameRecordController(GameRecordRepository repo) {
    this.repo = repo;
  }

  @GetMapping("/gamerecords")
  Iterable<GameRecord> all() {
    return repo.findAll();
  }

  @PostMapping("/gamerecords")
  GameRecord newGameRecord(@RequestBody GameRecord newGameRecord) {
    return repo.save(newGameRecord);
  }

  @GetMapping("/gamerecords/{id}")
  Optional<GameRecord> one(@PathVariable String id) {
    return repo.findById(id);
  }
}
