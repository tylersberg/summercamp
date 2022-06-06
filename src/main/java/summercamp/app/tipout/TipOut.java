package summercamp.app.tipout;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import summercamp.app.gamerecord.GameRecord;

@Entity
public class TipOut {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne
	private GameRecord gameRecord;

	protected TipOut() {}

	public TipOut(GameRecord gameRecord) {
		this.gameRecord = gameRecord;
	}

	public GameRecord getGame() {
		return gameRecord;
	}

}
