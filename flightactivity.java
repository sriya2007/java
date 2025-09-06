package assignment;

public class flightactivity {
	
	    private String activityId;
	    private String flightNo;
	    private String date;
	    private int distance;
	    private String fareClass;
	    private int milesEarned;

	    public flightactivity(String activityId, String flightNo, String date, int distance, String fareClass) {
	        this.activityId = activityId;
	        this.flightNo = flightNo;
	        this.date = date;
	        this.distance = distance;
	        this.fareClass = fareClass;
	    }

	    public int getDistance() { return distance; }
	    public String getFareClass() { return fareClass; }
	    public int getMilesEarned() { return milesEarned; }

	    public void assignMiles(member Member) {
	        Member.creditMiles(distance, fareClass);
	        this.milesEarned = distance;
	    }

	    public void printActivity() {
	        System.out.println("Flight: " + flightNo + " | Date: " + date +
	                " | Distance: " + distance + " | FareClass: " + fareClass);
	    }
	}


