package com.ibm.developer.batchprocessor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOOTBALL_PLAY_RECORD")
public class FootballPlayRecord {
	@Id
	@GeneratedValue
	private long id;
	@Column(name = "GAME_ID")
	private long gameId;
	@Column(name = "GAME_DATE")
	private Date gameDate;
	@Column(name = "QUARTER")
	private short quarter;
	@Column(name = "MINUTE")
	private short minute;
	@Column(name = "SECOND")
	private short second;
	@Column(name = "OFFENSE_TEAM")
	private String offenseTeam;
	@Column(name = "DEFENSE_TEAM")
	private String defenseTeam;
	@Column(name = "DOWN")
	private short down;
	@Column(name = "TO_GO")
	private short toGo;
	@Column(name = "YARD_LINE")
	private short yardLine;
	@Column(name = "SERIES_FIRST_DOWN")
	private boolean seriesFirstDown;
	@Column(name = "DESCRIPTION", length = 1024)
	private String description;
	@Column(name = "SEASON_YEAR")
	private short seasonYear;
	@Column(name = "YARDS")
	private short yards;
	@Column(name = "FORMATION")
	private String formation;
	@Column(name = "PLAY_TYPE")
	private String playType;
	@Column(name = "IS_RUSH")
	private boolean isRush;
	@Column(name = "IS_PASS")
	private boolean isPass;
	@Column(name = "IS_INCOMPLETE")
	private boolean isIncomplete;
	@Column(name = "IS_TOUCHDOWN")
	private boolean isTouchdown;
	@Column(name = "PASS_TYPE")
	private String passType;
	@Column(name = "IS_SACK")
	private boolean isSack;
	@Column(name = "IS_CHALLENGE")
	private boolean isChallenge;
	@Column(name = "IS_CHALLENGE_REVERSED")
	private boolean isChallengeReversed;
	@Column(name = "CHALLENGER")
	private String challenger;
	@Column(name = "IS_MEASUREMENT")
	private boolean isMeasurement;
	@Column(name = "IS_INTERCEPTED")
	private boolean isIntercerption;
	@Column(name = "IS_FUMBLE")
	private boolean isFumble;
	@Column(name = "IS_PENALTY")
	private boolean isPenalty;
	@Column(name = "IS_TWO_POINT_CONVERSION")
	private boolean isTwoPointConversion;
	@Column(name = "IS_TWO_POINT_CONVERSION_SUCCESSFUL")
	private boolean isTwoPointConversionSuccessful;
	@Column(name = "RUSH_DIRECTION")
	private String rushDirection;
	@Column(name = "YARD_LINE_FIXED")
	private short yardLineFixed;
	@Column(name = "YARD_LINE_DIRECTION")
	private String yardLineDirection;
	@Column(name = "PENALTY_ACCEPTED")
	private boolean penaltyAccepted;
	@Column(name = "PENALTY_TEAM")
	private String penaltyTeam;
	@Column(name = "IS_NO_PLAY")
	private boolean isNoPlay;
	@Column(name = "PENALTY_TYPE")
	private String penaltyType;
	@Column(name = "PENALTY_YARDS")
	private short penaltyYards;
	@Column(name = "RECORD_HASH")
	private byte[] recordHash;
	@Column(name = "BIG_PLAY")
	private boolean isBigPlay;
	@Column(name = "MAHOMES_FLAIR")
	private String mahomesFlair;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	public Date getGameDate() {
		return gameDate;
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}

	public short getQuarter() {
		return quarter;
	}

	public void setQuarter(short quarter) {
		this.quarter = quarter;
	}

	public short getMinute() {
		return minute;
	}

	public void setMinute(short minute) {
		this.minute = minute;
	}

	public short getSecond() {
		return second;
	}

	public void setSecond(short second) {
		this.second = second;
	}

	public String getOffenseTeam() {
		return offenseTeam;
	}

	public void setOffenseTeam(String offenseTeam) {
		this.offenseTeam = offenseTeam;
	}

	public String getDefenseTeam() {
		return defenseTeam;
	}

	public void setDefenseTeam(String defenseTeam) {
		this.defenseTeam = defenseTeam;
	}

	public short getDown() {
		return down;
	}

	public void setDown(short down) {
		this.down = down;
	}

	public short getToGo() {
		return toGo;
	}

	public void setToGo(short toGo) {
		this.toGo = toGo;
	}

	public short getYardLine() {
		return yardLine;
	}

	public void setYardLine(short yardLine) {
		this.yardLine = yardLine;
	}

	public boolean isSeriesFirstDown() {
		return seriesFirstDown;
	}

	public void setSeriesFirstDown(boolean seriesFirstDown) {
		this.seriesFirstDown = seriesFirstDown;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getSeasonYear() {
		return seasonYear;
	}

	public void setSeasonYear(short seasonYear) {
		this.seasonYear = seasonYear;
	}

	public short getYards() {
		return yards;
	}

	public void setYards(short yards) {
		this.yards = yards;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}

	public String getPlayType() {
		return playType;
	}

	public void setPlayType(String playType) {
		this.playType = playType;
	}

	public boolean isRush() {
		return isRush;
	}

	public void setRush(boolean isRush) {
		this.isRush = isRush;
	}

	public boolean isPass() {
		return isPass;
	}

	public void setPass(boolean isPass) {
		this.isPass = isPass;
	}

	public boolean isIncomplete() {
		return isIncomplete;
	}

	public void setIncomplete(boolean isIncomplete) {
		this.isIncomplete = isIncomplete;
	}

	public boolean isTouchdown() {
		return isTouchdown;
	}

	public void setTouchdown(boolean isTouchdown) {
		this.isTouchdown = isTouchdown;
	}

	public String getPassType() {
		return passType;
	}

	public void setPassType(String passType) {
		this.passType = passType;
	}

	public boolean isSack() {
		return isSack;
	}

	public void setSack(boolean isSack) {
		this.isSack = isSack;
	}

	public boolean isChallenge() {
		return isChallenge;
	}

	public void setChallenge(boolean isChallenge) {
		this.isChallenge = isChallenge;
	}

	public boolean isChallengeReversed() {
		return isChallengeReversed;
	}

	public void setChallengeReversed(boolean isChallengeReversed) {
		this.isChallengeReversed = isChallengeReversed;
	}

	public String getChallenger() {
		return challenger;
	}

	public void setChallenger(String challenger) {
		this.challenger = challenger;
	}

	public boolean isMeasurement() {
		return isMeasurement;
	}

	public void setMeasurement(boolean isMeasurement) {
		this.isMeasurement = isMeasurement;
	}

	public boolean isIntercerption() {
		return isIntercerption;
	}

	public void setIntercerption(boolean isIntercerption) {
		this.isIntercerption = isIntercerption;
	}

	public boolean isFumble() {
		return isFumble;
	}

	public void setFumble(boolean isFumble) {
		this.isFumble = isFumble;
	}

	public boolean isPenalty() {
		return isPenalty;
	}

	public void setPenalty(boolean isPenalty) {
		this.isPenalty = isPenalty;
	}

	public boolean isTwoPointConversion() {
		return isTwoPointConversion;
	}

	public void setTwoPointConversion(boolean isTwoPointConversion) {
		this.isTwoPointConversion = isTwoPointConversion;
	}

	public boolean isTwoPointConversionSuccessful() {
		return isTwoPointConversionSuccessful;
	}

	public void setTwoPointConversionSuccessful(boolean isTwoPointConversionSuccessful) {
		this.isTwoPointConversionSuccessful = isTwoPointConversionSuccessful;
	}

	public String getRushDirection() {
		return rushDirection;
	}

	public void setRushDirection(String rushDirection) {
		this.rushDirection = rushDirection;
	}

	public short getYardLineFixed() {
		return yardLineFixed;
	}

	public void setYardLineFixed(short yardLineFixed) {
		this.yardLineFixed = yardLineFixed;
	}

	public String getYardLineDirection() {
		return yardLineDirection;
	}

	public void setYardLineDirection(String yardLineDirection) {
		this.yardLineDirection = yardLineDirection;
	}

	public boolean isPenaltyAccepted() {
		return penaltyAccepted;
	}

	public void setPenaltyAccepted(boolean penaltyAccepted) {
		this.penaltyAccepted = penaltyAccepted;
	}

	public String getPenaltyTeam() {
		return penaltyTeam;
	}

	public void setPenaltyTeam(String penaltyTeam) {
		this.penaltyTeam = penaltyTeam;
	}

	public boolean isNoPlay() {
		return isNoPlay;
	}

	public void setNoPlay(boolean isNoPlay) {
		this.isNoPlay = isNoPlay;
	}

	public String getPenaltyType() {
		return penaltyType;
	}

	public void setPenaltyType(String penaltyType) {
		this.penaltyType = penaltyType;
	}

	public short getPenaltyYards() {
		return penaltyYards;
	}

	public void setPenaltyYards(short penaltyYards) {
		this.penaltyYards = penaltyYards;
	}

	public byte[] getRecordHash() {
		return recordHash;
	}

	public void setRecordHash(byte[] recordHash) {
		this.recordHash = recordHash;
	}

	public boolean isBigPlay() {
		return isBigPlay;
	}

	public void setBigPlay(boolean isBigPlay) {
		this.isBigPlay = isBigPlay;
	}

	public String getMahomesFlair() {
		return mahomesFlair;
	}

	public void setMahomesFlair(String mahomesFlair) {
		this.mahomesFlair = mahomesFlair;
	}

	@Override
	public String toString() {
		return "FootballPlayRecord [id=" + id + ", gameId=" + gameId + ", gameDate=" + gameDate + ", quarter=" + quarter
				+ ", minute=" + minute + ", second=" + second + ", offenseTeam=" + offenseTeam + ", defenseTeam="
				+ defenseTeam + ", down=" + down + ", toGo=" + toGo + ", yardLine=" + yardLine + ", seriesFirstDown="
				+ seriesFirstDown + ", description=" + description + ", seasonYear=" + seasonYear + ", yards=" + yards
				+ ", formation=" + formation + ", playType=" + playType + ", isRush=" + isRush + ", isPass=" + isPass
				+ ", isIncomplete=" + isIncomplete + ", isTouchdown=" + isTouchdown + ", passType=" + passType
				+ ", isSack=" + isSack + ", isChallenge=" + isChallenge + ", isChallengeReversed=" + isChallengeReversed
				+ ", challenger=" + challenger + ", isMeasurement=" + isMeasurement + ", isIntercerption="
				+ isIntercerption + ", isFumble=" + isFumble + ", isPenalty=" + isPenalty + ", isTwoPointConversion="
				+ isTwoPointConversion + ", isTwoPointConversionSuccessful=" + isTwoPointConversionSuccessful
				+ ", rushDirection=" + rushDirection + ", yardLineFixed=" + yardLineFixed + ", yardLineDirection="
				+ yardLineDirection + ", penaltyAccepted=" + penaltyAccepted + ", penaltyTeam=" + penaltyTeam
				+ ", isNoPlay=" + isNoPlay + ", penaltyType=" + penaltyType + ", penaltyYards=" + penaltyYards + "]";
	}

}
