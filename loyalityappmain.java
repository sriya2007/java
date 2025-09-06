package assignment;
public class loyalityappmain {
    public static void main(String[] args) {
        loyalityservice service = new loyalityservice();

        // Enroll members
        member m1 = new member("M001", "Alice", "alice@mail.com");
        member m2 = new silvermember("M002", "Bob", "bob@mail.com");

        service.enroll(m1);
        service.enroll(m2);

        // Add rewards
        service.addReward(new reward("R001", "Free Flight", 20000, true));
        service.addReward(new reward("R002", "Business Upgrade", 15000, true));
        service.addReward(new reward("R003", "Gift Voucher", 5000, true));

        // Add flight activities
        flightactivity f1 = new flightactivity("A001", "AI101", "2025-09-01", 8000, "Economy");
        flightactivity f2 = new flightactivity("A002", "AI202", "2025-09-03", 12000, "Business");

        service.creditMiles(m1, f1);
        service.creditMiles(m2, f2);

        // Redeem rewards
        service.redeemReward(m1, "Gift Voucher");
        service.redeemReward(m2, "Free Flight");

        // Print statements
        m1.printStatement();
        m2.printStatement();

        // Print tier summary
        service.printTierSummary();
    }
}
