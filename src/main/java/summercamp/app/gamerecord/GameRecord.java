package summercamp.app.gamerecord;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.time.LocalDateTime;

import java.math.BigDecimal;

@Entity
public class GameRecord {

  @Id
  private Long gameCode;
  private String gameName;
  private String gameType;
  private LocalDateTime start;
  private LocalDateTime end;
  private BigDecimal totalTips;

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
        "GameId=%d, GameName='%s', GameType='%s', StartTime=%t, TotalTips=%d",
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
