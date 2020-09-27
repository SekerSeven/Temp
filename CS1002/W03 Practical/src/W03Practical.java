public class W03Practical {
    public static void main(String[] args) throws Exception {
        // Int is used for the number of items as they must be whole numbers, whereas,
        // double is used for the prices as they generally aren't.
        int noOfCakes = 1;
        double cakePrice = 24.75;
        // Here the variables containing the number of plates of sandwiches and the
        // price of said plates are listed as though they are individual sandwiches for
        // increased brevity and clarity. Similar truncations occur for later variables
        // such as the number of plates of sausage rolls and the number of pass the
        // parcel games.
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
        // I chose to compute the solution the way I did because it allows for the easy
        // changing of variables (in case the price of items increase or the number
        // requested changes) without having to change every instance of them in the
        // code.
        double totalPartyPrice = noOfCakes * cakePrice + noOfSandwiches * sandwichPrice + noOfSausages * sausagePrice
                + noOfJellies * jellyPrice + noOfInvites * invitePrice + noOfPartyBags * partyBagPrice
                + noOfBalloons * balloonPrice + noOfParcels * parcelPrice + noOfMagicians * magicianPrice
                + noOfVenues * venuePrice;
        System.out.println(totalPartyPrice);
    }
}
