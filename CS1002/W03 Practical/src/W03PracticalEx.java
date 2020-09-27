public class W03PracticalEx {
    public static void main(String[] args) throws Exception {
        int noOfCakes = 1;
        double cakePrice = 24.75;
        int noOfSandwiches = 4;
        double sandwichPrice = 13.50;
        int noOfSausages = 4;
        double sausagePrice = 13.50;
        int noOfJellies = 4;
        double jellyPrice = 12.75;
        int noOfInvites = 15;
        double invitePrice = 1.33;
        int noOfPartyBags = 15;
        double partyBagPrice = 2.55;
        int noOfBalloons = 16;
        double balloonPrice = 1.02;
        int noOfParcels = 2;
        double parcelPrice = 18.10;
        int noOfMagicians = 1;
        double magicianPrice = 69.99;
        int noOfVenues = 1;
        double venuePrice = 98.99;
        double cateringCost = noOfCakes * cakePrice + noOfSandwiches * sandwichPrice + noOfSausages * sausagePrice
                + noOfJellies * jellyPrice;
        double itemsCost = noOfInvites * invitePrice + noOfPartyBags * partyBagPrice + noOfBalloons * balloonPrice
                + noOfParcels * parcelPrice;
        double venueCosts = noOfMagicians * magicianPrice + noOfVenues * venuePrice;
        double totalPartyPrice = cateringCost + itemsCost + venueCosts;
        // Created a variable in order to more neatly format the outputs of the program.
        // Do not fully understand how it works but I found it here:
        // https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java
        // on 2020/09/27 at 17:25
        String formatting = "%.5g%n";
        System.out.println("Catering: " + String.format(formatting, cateringCost));
        System.out.println("Items: " + String.format(formatting, itemsCost));
        System.out.println("Venue: " + String.format(formatting, venueCosts));
        System.out.println("Total: " + String.format(formatting, totalPartyPrice));
    }
}
