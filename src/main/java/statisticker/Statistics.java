package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
    	//implement the computation of statistics here
    	Statistics statictics = new Statistics();
    	Stats statsObj = statictics.new Stats();
    	
    		statsObj.setAverage((float) numbers.stream()
                    .mapToDouble(x -> x).average().orElse(Float.NaN));
        	statsObj.setMax((float) numbers.stream()
                    .mapToDouble(x -> x).max().orElse(Float.NaN));
        	statsObj.setMin((float) numbers.stream()
                    .mapToDouble(x -> x).min().orElse(Float.NaN));
    	
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
