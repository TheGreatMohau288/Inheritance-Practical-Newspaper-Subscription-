// NewspaperSubscription.java
public abstract class NewspaperSubscription {
    protected String subscriberName;
    protected String subscriberAddress;
    protected double subscriberRate;
    
    public NewspaperSubscription() {
        this.subscriberName = "The Great Mohau";
        this.subscriberAddress = "2024, Mmabatho";
        this.subscriberRate = 0;
    }
    
    public NewspaperSubscription(String subscriberName, String subscriberAddress, double subscriberRate) {
        this.subscriberName = subscriberName;
        this.subscriberAddress = subscriberAddress;
        this.subscriberRate = subscriberRate;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getSubscriberAddress() {
        return subscriberAddress;
    }

    public void setSubscriberAddress(String subscriberAddress) {
        this.subscriberAddress = subscriberAddress;
    }

    public double getSubscriberRate() {
        return subscriberRate;
    }

    public void setSubscriberRate(double subscriberRate) {
        this.subscriberRate = subscriberRate;
    }

    @Override
    public String toString() {
        return "NewspaperSubscription{" + "subscriberName=" + subscriberName + ", subscriberAddress=" + subscriberAddress + ", subscriberRate=" + subscriberRate + '}';
    }
}
