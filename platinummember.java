package assignment;

public class platinummember extends member {
	    public platinummember(String memberId, String name, String email) {
	        super(memberId, name, email);
	        this.tier = "Platinum";
	    }

	    @Override
	    protected int calculateMiles(int distance, String fareClass) {
	        return (int)(distance * 1.5);
	    }

	    @Override
	    public void evaluateTier() {
	        System.out.println(name + " is already at the highest tier (Platinum).");
	    }
	}

