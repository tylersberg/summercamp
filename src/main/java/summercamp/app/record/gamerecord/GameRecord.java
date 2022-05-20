package summercamp.app.record.gamerecord;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import summercamp.app.record.playerrecord.PlayerRecord;

@Entity
public class GameRecord implements Serializable {

	@Id 
	private String gameCode;
	private String gameName;
	private String gameType;
	private LocalDateTime startTime;
	private BigDecimal totalTips;
	@OneToMany(mappedBy="gameRecord", cascade=CascadeType.ALL)
	private Set<PlayerRecord> playerRecords;

	protected GameRecord() {}

	public GameRecord(
			String gameCode,
			String gameName,
			String gameType,
			LocalDateTime startDateTime,
			BigDecimal totalTips
			) {
		this.gameCode = gameCode;
		this.gameName = gameName;
		this.gameType = gameType;
		this.startTime = startDateTime;
		this.totalTips = totalTips;
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
		return startTime;
	}

	public BigDecimal getTips() {
		return totalTips;
	}
/*
	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}
	
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	
	public void setStart(LocalDateTime time) {
		this.startTime = time;
	}

	public void setTips(BigDecimal tips) {
		this.totalTips = tips;
	}
*/
	@Override
	public String toString() {
		return String.format(
				"GameCode=%s, GameName=%s, GameType=%s, StartTime=%t, TotalTips=%d",
				gameCode, gameName, gameType, startTime, totalTips);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof GameRecord))
			return false;
		GameRecord gr = (GameRecord) o;
		return Objects.equals(this.gameCode, gr.gameCode)
			&& Objects.equals(this.gameName, gr.gameName)
			&& Objects.equals(this.gameType, gr.gameType)
			&& Objects.equals(this.startTime, gr.startTime);
	}
}
