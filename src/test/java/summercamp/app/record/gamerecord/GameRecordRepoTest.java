package summercamp.app.record.gamerecord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class GameRecordRepoTest {

	@Autowired
	GameRecordRepository repo;

	@Test
	public void InsertionRetreivalTest() {
		GameRecord r1 = new GameRecord(
				"11081060",
				"$30 buyin Touney $350 added",
				"NL Hold'em",
				LocalDateTime.now(),
				BigDecimal.valueOf(66));
		GameRecord r2 = new GameRecord(
				"22073660",
				"BigBlind: 1",
				"NL Hold'em",
				LocalDateTime.now(),
				BigDecimal.valueOf(80));
		repo.save(r1);
		repo.save(r2);
		repo.flush();
		List<GameRecord> l = repo.findAll();
		assertEquals(2, l.size());
	}
}
