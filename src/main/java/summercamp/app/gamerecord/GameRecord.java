package summercamp.app.gamerecord;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import summercamp.app.playerrecord.PlayerRecord;

@Entity
public class GameRecord implements Serializable {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String gameCode;
	private String gameName;
	private String gameType;
	private LocalDateTime start;
	private LocalDateTime end;
	private BigDecimal totalTips;
	@OneToMany(mappedBy="gameRecord", cascade=CascadeType.ALL)
	private Set<PlayerRecord> playerRecords;

	protected GameRecord() {}

	public GameRecord(
			String gameCode,
			String gameName,
			String gameType,
			LocalDateTime startDateTime,
			LocalDateTime endDateTime
			) {
		this.gameCode = gameCode;
		this.gameName = gameName;
		this.gameType = gameType;
		this.start = startDateTime;
		this.end = endDateTime;
			}

	public String getGameCode() {
		return gameCode;
	}

	public String getGameName() {
		return gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public LocalDateTime getStart() {
		return start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public BigDecimal getTips() {
		return totalTips;
	}

	@Override
	public String toString() {
		return String.format(
				"GameId=%d, GameCode=%s, GameName=%s, GameType=%s, StartTime=%t, TotalTips=%d",
				id, gameCode, gameName, gameType, start, totalTips);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof GameRecord))
			return false;
		GameRecord gr = (GameRecord) o;
		return Objects.equals(this.id, gr.id)
			&& Objects.equals(this.gameCode, gr.gameCode)
			&& Objects.equals(this.gameName, gr.gameName)
			&& Objects.equals(this.gameType, gr.gameType)
			&& Objects.equals(this.start, gr.start)
			&& Objects.equals(this.start, gr.end);
	}
}
