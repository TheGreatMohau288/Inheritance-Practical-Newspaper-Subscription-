// DemoSubscriptions.java
public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription physicalSub = new PhysicalNewspaperSubscription();
        physicalSub.setSubscriberName("The Great Mohau");
        physicalSub.setSubscriberAddress("2024, Mmabatho"); // Invalid address, should display error message

        OnlineNewspaperSubscription onlineSub = new OnlineNewspaperSubscription();
        onlineSub.setSubscriberName("Mohau Mokoena");
        onlineSub.setSubscriberAddress("thegreatmohau@gmail.com"); // Valid address

        System.out.println("Physical Subscription:");
        System.out.println("Name: " + physicalSub.getSubscriberName());
        System.out.println("Address: " + physicalSub.getSubscriberAddress());
        System.out.println("Rate: R" + physicalSub.getSubscriberRate());

        System.out.println("\nOnline Subscription:");
        System.out.println("Name: " + onlineSub.getSubscriberName());
        System.out.println("Address: " + onlineSub.getSubscriberAddress());
        System.out.println("Rate: R" + onlineSub.getSubscriberRate());
    }
}

