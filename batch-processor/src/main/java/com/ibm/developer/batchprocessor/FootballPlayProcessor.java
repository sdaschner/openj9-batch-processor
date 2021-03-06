package com.ibm.developer.batchprocessor;

import java.text.SimpleDateFormat;

import org.h2.security.SHA256;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class FootballPlayProcessor implements ItemProcessor<FootballPlay, FootballPlayRecord> {
	private static final Logger LOGGER = LoggerFactory.getLogger(BigPlayProcessor.class);
	private static final SimpleDateFormat DF = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public FootballPlayRecord process(FootballPlay item) throws Exception {
		FootballPlayRecord footballPlayRecord = new FootballPlayRecord();
		footballPlayRecord.setChallenge(item.getIsChallenge() ==  1);
		footballPlayRecord.setChallenger(item.getChallenger());
		footballPlayRecord.setChallengeReversed(item.getIsChallengeReversed() == 1);
		footballPlayRecord.setDefenseTeam(item.getDefenseTeam());
		footballPlayRecord.setDescription(item.getDescription());
		footballPlayRecord.setFormation(item.getFormation());
		footballPlayRecord.setFumble(item.getIsFumble() == 0);
		footballPlayRecord.setGameDate(DF.parse(item.getGameDate()));
		footballPlayRecord.setGameId(item.getGameId());
		footballPlayRecord.setIncomplete(item.getIsIncomplete() == 1);
		footballPlayRecord.setIntercerption(item.getIsIntercerption() == 1);
		footballPlayRecord.setMeasurement(item.getIsMeasurement() == 1);
		footballPlayRecord.setMinute(item.getMinute());
		footballPlayRecord.setNoPlay(item.getIsNoPlay() == 1);
		footballPlayRecord.setOffenseTeam(item.getOffenseTeam());
		footballPlayRecord.setPass(item.getIsPass() == 1);
		footballPlayRecord.setPassType(item.getPassType());
		footballPlayRecord.setPenalty(item.getIsPenalty() == 1);
		footballPlayRecord.setPenaltyAccepted(item.getPenaltyAccepted() == 1);
		footballPlayRecord.setPenaltyTeam(item.getPenaltyTeam());
		footballPlayRecord.setPenaltyType(item.getPenaltyType());
		footballPlayRecord.setPenaltyYards(item.getPenaltyYards());
		footballPlayRecord.setPlayType(item.getPlayType());
		footballPlayRecord.setQuarter(item.getQuarter());
		footballPlayRecord.setRush(item.getIsRush() == 1);
		footballPlayRecord.setRushDirection(item.getRushDirection());
		footballPlayRecord.setSack(item.getIsSack() == 1);
		footballPlayRecord.setSeasonYear(item.getSeasonYear());
		footballPlayRecord.setSecond(item.getSecond());
		footballPlayRecord.setSeriesFirstDown(item.getSeriesFirstDown() == 1);
		footballPlayRecord.setToGo(item.getToGo());
		footballPlayRecord.setTouchdown(item.getIsTouchdown() == 1);
		footballPlayRecord.setTwoPointConversion(item.getIsTwoPointConversion() == 1);
		footballPlayRecord.setTwoPointConversionSuccessful(item.getIsTwoPointConversionSuccessful() == 1);
		footballPlayRecord.setYardLine(item.getYardLine());
		footballPlayRecord.setYardLineDirection(item.getYardLineDirection());
		footballPlayRecord.setYardLineFixed(item.getYardLineFixed());
		footballPlayRecord.setYards(item.getYards());
		byte[] hash = SHA256.getHash(footballPlayRecord.toString().getBytes(), false);
		footballPlayRecord.setRecordHash(hash);
		LOGGER.info("Record hashed and transformed: " + footballPlayRecord.toString());
		return footballPlayRecord;
	}

}
