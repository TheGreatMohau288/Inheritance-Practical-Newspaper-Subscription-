// PhysicalNewspaperSubscription.java
public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setSubscriberAddress(String address) {
        if (address.matches(".*\\d.*")) {
            super.setSubscriberAddress(address);
            super.setSubscriberRate(15.0);
        } else {
            System.out.println("Address must contain at least one digit. Subscriber rate is set to 0");
            super.setSubscriberRate(0.0);
        }
    }
}