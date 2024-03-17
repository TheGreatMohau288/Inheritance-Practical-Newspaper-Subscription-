// OnlineNewspaperSubscription.java
public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setSubscriberAddress(String address) {
        if (address.contains("@")) {
            super.setSubscriberAddress(address);
            super.setSubscriberRate(9.0);
        } else {
            System.out.println("Address must contain an @ symbol. Subscriber rate is set to 0");
            super.setSubscriberRate(0.0);
        }
    }
}
