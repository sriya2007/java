package assignment;

public class goldmember extends member {

	    public goldmember(String memberId, String name, String email) {
	        super(memberId, name, email);
	        this.tier = "Gold";
	    }

	    @Override
	    protected int calculateMiles(int distance, String fareClass) {
	        return (int)(distance * 1.25);
	    }

	    @Override
	    public void evaluateTier() {
	        if (milesBalance >= 100000) {
	            System.out.println(name + " upgraded to Platinum!");
	            this.tier = "Platinum";
	        }
	    }
	}

