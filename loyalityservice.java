package assignment;
import java.util.*;
public class loyalityservice {
    private List<member> members = new ArrayList<>();
    private List<reward> rewards = new ArrayList<>();

    public void enroll(member Member) {
        members.add(Member);
        System.out.println(Member.getName() + " enrolled successfully!");
    }

    public void addReward(reward Reward) {
        rewards.add(Reward);
    }

    public void creditMiles(member Member, flightactivity activity) {
        activity.assignMiles(Member);
        Member.evaluateTier();
    }

    public void redeemReward(member Member, String rewardName) {
        for (reward r : rewards) {
            if (r.getName().equalsIgnoreCase(rewardName)) {
                r.redeem(Member);
                return;
            }
        }
        System.out.println("Reward not found!");
    }

    public void printTierSummary() {
        Map<String, Integer> summary = new HashMap<>();
        for (member m : members) {
            summary.put(m.getTier(), summary.getOrDefault(m.getTier(), 0) + 1);
        }
        System.out.println("=== Tier Distribution ===");
        for (String tier : summary.keySet()) {
            System.out.println(tier + ": " + summary.get(tier));
        }
    }
}
