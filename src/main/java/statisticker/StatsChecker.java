package statisticker;

import java.util.List;

import statisticker.Statistics.Stats;

public class StatsChecker {

	private  float maxThreshold;
	private  EmailAlert emailAlerter;
	private  LEDAlert ledAlerter;

	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.emailAlerter = (EmailAlert) alerters[0];
		this.ledAlerter = (LEDAlert) alerters[1];
	}

	public void checkAndAlert(List<Float> numberList) {
		Stats s = Statistics.getStatistics(numberList);
		if(s.getMax() > this.maxThreshold) {
			this.emailAlerter.setEmailSent(true);
			this.ledAlerter.setLedGlows(true);
		}
		
	}

}
