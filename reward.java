package assignment;

public class reward {
		    private String rewardId;
		    private String name;
		    private int milesRequired;
		    private boolean available;

		    public reward(String rewardId, String name, int milesRequired, boolean available) {
		        this.rewardId = rewardId;
		        this.name = name;
		        this.milesRequired = milesRequired;
		        this.available = available;
		    }

		    public int getMilesRequired() { return milesRequired; }
		    public String getName() { return name; }
		    public boolean isAvailable() { return available; }

		    public void redeem(member member) {
		        if (!available) {
		            System.out.println("Reward not available.");
		            return;
		        }
		        if (member.getMilesBalance() >= milesRequired) {
		            member.redeemMiles(milesRequired);
		            System.out.println("Reward redeemed: " + name);
		        } else {
		            System.out.println("Not enough miles for " + name);
		        }
		    }
		}

