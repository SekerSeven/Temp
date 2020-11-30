public class Tests {

    // This scenario tests the normal function of all the classes as well as the
    // rejection of invalid activity booking for all possible reasons.
    public void scenario1() {
        Cruise c = new Cruise("Titanic", 5, 3);
        c.setPassNum(5);
        c.setPassListSize();

        Standard p = new Standard("John", 40);
        Standard p2 = new Standard("Jane", 100);
        Senior p3 = new Senior("Alice", 40);
        Senior p4 = new Senior("Bob", 46);
        Premium p5 = new Premium("Eve");

        Destination d = new Destination("London", 3);
        Attraction a = new Attraction("London Eye", 10, 3, d);
        Tour a2 = new Tour("Tour", 15, 5, d, 3.5);
        Show a3 = new Show("The Tempest", 20, 2, d, 3);
        a3.setStar(0, "John Smith - Ariel");
        a3.setStar(1, "Jane Smith - Miranda");
        a3.setStar(2, "Bob Loss - Prospero");
        d.setActivity(0, a);
        d.setActivity(1, a2);
        d.setActivity(2, a3);
        c.setItinerary(0, d);

        Destination d2 = new Destination("Chicago", 2);
        Tour a4 = new Tour("Architecture tour", 15, 3, d2, 5);
        Attraction a5 = new Attraction("Lake Michigan", 8, 5, d2);
        d2.setActivity(0, a4);
        d2.setActivity(1, a5);
        c.setItinerary(1, d2);

        Destination d3 = new Destination("Sydney", 1);
        Attraction a6 = new Attraction("Sydney Opera House", 17, 4, d3);
        d3.setActivity(0, a6);
        c.setItinerary(2, d3);

        c.setPassList(0, p);
        c.setPassList(1, p2);
        c.setPassList(2, p3);
        c.setPassList(3, p4);
        c.setPassList(4, p5);

        p.setListSize(c);
        p.bookActivity(a, c);
        p.bookActivity(a2, c);
        p.bookActivity(a4, c);
        p.bookActivity(a6, c);

        p2.setListSize(c);
        p2.bookActivity(a2, c);
        p2.bookActivity(a5, c);
        p2.bookActivity(a6, c);

        p3.setListSize(c);
        p3.bookActivity(a, c);
        p3.bookActivity(a4, c);
        p3.bookActivity(a6, c);

        p4.setListSize(c);
        p4.bookActivity(a3, c);
        p4.bookActivity(a4, c);
        p4.bookActivity(a6, c);

        p5.setListSize(c);
        p5.bookActivity(a3, c);
        p5.bookActivity(a4, c);
        p5.bookActivity(a6, c);

        c.printItinerary();
        System.out.print("\n");
        c.printPassList();
        System.out.print("\n");
        p.printDetails();
        System.out.print("\n");
        p2.printDetails();
        System.out.print("\n");
        p3.printDetails();
        System.out.print("\n");
        p4.printDetails();
        System.out.print("\n");
        p5.printDetails();
        System.out.print("\n");
        c.printRemaining();
        System.out.print("\n");
    }

    // This scenario tests that it is acceptable for a passenger to not book any
    // activities
    public void scenario2() {
        Cruise c = new Cruise("Nautilus", 2, 1);
        c.setPassNum(1);
        c.setPassListSize();
        Standard p = new Standard("John", 40);
        Destination d = new Destination("Rio de Janeiro", 1);
        Attraction a = new Attraction("Christ the Redeemer", 10, 3, d);
        d.setActivity(0, a);
        c.setItinerary(0, d);
        c.setPassList(0, p);
        p.setListSize(c);
        c.printItinerary();
        System.out.print("\n");
        c.printPassList();
        System.out.print("\n");
        p.printDetails();
        System.out.print("\n");
        c.printRemaining();
        System.out.print("\n");
    }

    // This scenario tests whether the extension code functions correctly as well as
    // testing all the new methods
    public void scenario3() {
        CruiseEx c = new CruiseEx("Titanic", 5, 3);
        CabinStandard cab = new CabinStandard("1a");
        CabinStandard cab2 = new CabinStandard("1b");
        CabinPremium cab3 = new CabinPremium("2a");
        CabinPremium cab4 = new CabinPremium("2b");
        CabinStandard cab5 = new CabinStandard("3a");
        c.setPassNum(5);
        c.setPassListSize();

        StandardEx p = new StandardEx("John", 100, 40);
        StandardEx p2 = new StandardEx("Jane", 100, 100);
        SeniorEx p3 = new SeniorEx("Alice", 100, 40);
        SeniorEx p4 = new SeniorEx("Bob", 100, 46);
        PremiumEx p5 = new PremiumEx("Eve", 100);

        DestinationEx d = new DestinationEx("London", 3);
        AttractionEx a = new AttractionEx("London Eye", 10, 3, d);
        TourEx a2 = new TourEx("Tour", 15, 5, d, 3.5);
        ShowEx a3 = new ShowEx("The Tempest", 20, 2, d, 3);
        a3.setStar(0, "John Smith - Ariel");
        a3.setStar(1, "Jane Smith - Miranda");
        a3.setStar(2, "Bob Loss - Prospero");
        d.setActivity(0, a);
        d.setActivity(1, a2);
        d.setActivity(2, a3);
        c.setItinerary(0, d);

        DestinationEx d2 = new DestinationEx("Chicago", 2);
        TourEx a4 = new TourEx("Architecture tour", 15, 3, d2, 5);
        AttractionEx a5 = new AttractionEx("Lake Michigan", 8, 5, d2);
        d2.setActivity(0, a4);
        d2.setActivity(1, a5);
        c.setItinerary(1, d2);

        DestinationEx d3 = new DestinationEx("Sydney", 1);
        AttractionEx a6 = new AttractionEx("Sydney Opera House", 17, 4, d3);
        d3.setActivity(0, a6);
        c.setItinerary(2, d3);

        c.setPassList(0, p);
        c.setPassList(1, p2);
        c.setPassList(2, p3);
        c.setPassList(3, p4);
        c.setPassList(4, p5);

        p.bookActivity(a, c);
        p.bookActivity(a2, c);
        p.bookActivity(a4, c);
        p.bookActivity(a6, c);
        cab.bookCabin(p);
        p.storeCruise(c);

        p2.bookActivity(a2, c);
        p2.bookActivity(a5, c);
        p2.bookActivity(a6, c);
        cab.bookCabin(p2);
        cab2.bookCabin(p2);
        p2.storeCruise(c);

        p3.bookActivity(a, c);
        p3.bookActivity(a4, c);
        p3.bookActivity(a6, c);
        cab3.bookCabin(p3);
        p3.storeCruise(c);

        p4.bookActivity(a3, c);
        p4.bookActivity(a4, c);
        p4.bookActivity(a6, c);
        cab5.bookCabin(p4);
        p4.storeCruise(c);

        p5.bookActivity(a3, c);
        p5.bookActivity(a4, c);
        p5.bookActivity(a6, c);
        cab4.bookCabin(p5);
        p5.storeCruise(c);

        c.printItinerary();
        System.out.print("\n");
        c.printPassList();
        System.out.print("\n");
        p.printDetails();
        System.out.print("\n");
        p2.printDetails();
        System.out.print("\n");
        p3.printDetails();
        System.out.print("\n");
        p4.printDetails();
        System.out.print("\n");
        p5.printDetails();
        System.out.print("\n");
        c.printCabinAllocation();
        System.out.print("\n");
        c.printRemaining();
        System.out.print("\n");
        p.printHistory();
        System.out.print("\n");
        p2.printHistory();
        System.out.print("\n");
        p3.printHistory();
        System.out.print("\n");
        p4.printHistory();
        System.out.print("\n");
        p5.printHistory();
        System.out.print("\n");

        CruiseEx c2 = new CruiseEx("HMS Beagle", 2, 1);
        c2.setPassNum(1);
        c2.setPassListSize();
        DestinationEx d4 = new DestinationEx("Taipei", 1);
        AttractionEx a7 = new AttractionEx("Taipei 101", 10, 3, d4);
        d4.setActivity(0, a7);
        c2.setItinerary(0, d4);
        c2.setPassList(0, p);
        p.bookActivity(a7, c2);
        p.storeCruise(c2);
        c2.printItinerary();
        System.out.print("\n");
        c2.printPassList();
        System.out.print("\n");
        p.printDetails();
        System.out.print("\n");
        c2.printRemaining();
        System.out.print("\n");
        p.printHistory();
    }
}
