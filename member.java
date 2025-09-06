package assignment;
public class member {
    protected String memberId;
    protected String name;
    protected String email;
    protected String tier;
    protected int milesBalance;

    public member(String memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.tier = "Basic";
        this.milesBalance = 0;
    }

    // Getters/Setters
    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getTier() { return tier; }
    public int getMilesBalance() { return milesBalance; }

    public void setTier(String tier) { this.tier = tier; }

    // Overloaded methods
    public void creditMiles(int distance) {
        milesBalance += calculateMiles(distance, "Economy");
    }

    public void creditMiles(int distance, String fareClass) {
        milesBalance += calculateMiles(distance, fareClass);
    }

    // Default implementation
    protected int calculateMiles(int distance, String fareClass) {
        return distance;
    }

    // Default evaluation
    public void evaluateTier() {
        if (milesBalance >= 25000) {
            System.out.println(name + " upgraded to Silver!");
            this.tier = "Silver";
        }
    }

    public void redeemMiles(int miles) {
        if (milesBalance >= miles) {
            milesBalance -= miles;
            System.out.println(name + " redeemed " + miles + " miles successfully!");
        } else {
            System.out.println("Insufficient miles for " + name);
        }
    }

    public void printStatement() {
        System.out.println("=== Member Statement ===");
        System.out.println("ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Tier: " + tier);
        System.out.println("Miles Balance: " + milesBalance);
        System.out.println("========================");
    }
}

