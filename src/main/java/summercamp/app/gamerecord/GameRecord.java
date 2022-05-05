package summercamp.app.gamerecord;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;

import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Set;

import summercamp.app.playerrecord.PlayerRecord;

@Entity
public class GameRecord implements Serializable {

  @Id
  private Long gameCode;
  private String gameName;
  private String gameType;
  private LocalDateTime start;
  private LocalDateTime end;
  private BigDecimal totalTips;
  @OneToMany(mappedBy="gameRecord", cascade=CascadeType.ALL)
  private Set<PlayerRecord> playerRecords;

  protected GameRecord() {}

  public GameRecord(
    String gameName,
    String gameType,
    LocalDateTime startDateTime,
    LocalDateTime endDateTime
  ) {
      this.gameName = gameName;
      this.gameType = gameType;
      this.start = startDateTime;
  }

  @Override
  public String toString() {
    return String.format(
        "GameId=%d, GameName=%s, GameType=%s, StartTime=%t, TotalTips=%d",
        gameCode, gameName, gameType, start, totalTips);
  }

  public Long getGameCode() {
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
}
