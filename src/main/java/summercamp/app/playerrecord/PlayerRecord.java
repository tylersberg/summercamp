package summercamp.app.playerrecord;

import summercamp.app.gamerecord.GameRecord;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class PlayerRecord {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String playerId;
	private String playerName;
	private Integer hands;
	private Integer tips;
	private BigDecimal buyin;
	private BigDecimal profit;
	@ManyToOne(optional=false)
	private GameRecord gameRecord;

	protected PlayerRecord() {}

	public PlayerRecord(
			String playerId,
			String playerName,
			Integer hands,
			Integer tips,
			BigDecimal buyin,
			BigDecimal profit,
			GameRecord gameRecord
			) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.hands = hands;
		this.buyin = buyin;
		this.profit = profit;
		this.gameRecord = gameRecord;
			}

	public Long getId() {
		return id;
	}

	public GameRecord getGameRecord() {
		return gameRecord;
	}

	public String getPlayerId() {
		return playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public Integer getHands() {
		return hands;
	}

	public Integer getTips() {
		return tips;
	}

	public BigDecimal getBuyin() {
		return buyin;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	@Override
	public String toString() {
		return String.format(
				"GameCode=%s, PlayerId=%d, PlayerName=%s, Hands=%s, Tips=%d, Buyin=%d, Profit=%d",
				gameRecord.getGameCode(),
				playerId,
				playerName,
				hands,
				tips,
				buyin,
				profit
				);
	}
	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof PlayerRecord))
			return false;
		PlayerRecord pr = (PlayerRecord) o;
		return Objects.equals(this.id, pr.id)
			&& Objects.equals(this.playerName, pr.playerName);
	}
}
