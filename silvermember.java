package assignment;

public class silvermember extends member {
	
	    public silvermember(String memberId, String name, String email) {
	        super(memberId, name, email);
	        this.tier = "Silver";
	    }

	    @Override
	    protected int calculateMiles(int distance, String fareClass) {
	        return (int)(distance * 1.1);
	    }

	    @Override
	    public void evaluateTier() {
	        if (milesBalance >= 50000) {
	            System.out.println(name + " upgraded to Gold!");
	            this.tier = "Gold";
	        }
	    }
	}

