package statisticker;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
    	//implement the computation of statistics here
    	Statistics statictics = new Statistics();
    	Stats statsObj = statictics.new Stats();
    	if(!numbers.isEmpty()) {
    	DoubleSummaryStatistics stats = numbers.stream()
                .mapToDouble(x -> x)
                .summaryStatistics();    	
    	statsObj.setAverage((float) stats.getAverage());
    	statsObj.setMax((float) stats.getMax());
    	statsObj.setMin((float) stats.getMin());
    	}
    	else {
    		statsObj.setAverage(Float.NaN);
        	statsObj.setMax(Float.NaN);
        	statsObj.setMin(Float.NaN);
    	}
		return statsObj;           
    }
    
    public class Stats {

		private  float average;
		private  float min;
		private  float max;
		public float getAverage() {
			return average;
		}
		public void setAverage(float average) {
			this.average = average;
		}
		public float getMin() {
			return min;
		}
		public void setMin(float min) {
			this.min = min;
		}
		public float getMax() {
			return max;
		}
		public void setMax(float max) {
			this.max = max;
		}		
    }
}
