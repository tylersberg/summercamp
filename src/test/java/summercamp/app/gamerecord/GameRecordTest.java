package summercamp.app.gamerecord;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest @Sql({"/testData.sql"})
public class GameRecordTest {

	@Autowired
	private GameRecordService gs;

	@Test
	public void ServiceTest() {
		List<GameRecord> l = gs.findAll();
		assertEquals(2, l.size());
	}
}
