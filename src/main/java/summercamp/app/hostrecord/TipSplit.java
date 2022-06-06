package summercamp.app.hostrecord;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import summercamp.app.gamerecord.GameRecord;

/*
 * Represents a record of the tips for a given game at a specific time, used to determine the appropriate TipOut for the host.
 */

@Entity
public class TipSplit {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToOne(optional=false)
	private GameRecord gameRecord;
	@ManyToOne(optional=false)
	private HostRecord hostRecord;
	private BigDecimal amount;
	private ZonedDateTime time;

	protected TipSplit() {}

	public TipSplit(HostRecord hostRecord, BigDecimal amount, ZonedDateTime time) {
		this.hostRecord = hostRecord;
		this.amount = amount;
		this.time = time;
	}

	public GameRecord getGameRecord() {
		return gameRecord;
	}

	public void setGameRecord(GameRecord gameRecord) {
		this.gameRecord = gameRecord;
	}

	public HostRecord getHostRecord() {
		return hostRecord;
	}

	public void setHostRecord(HostRecord hostRecord) {
		this.hostRecord = hostRecord;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public ZonedDateTime getTime() {
		return time;
	}

	public void setTime(ZonedDateTime time) {
		this.time = time;
	}

}
