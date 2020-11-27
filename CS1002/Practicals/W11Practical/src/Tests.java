public class Tests {

    // TODO: Brief description of the scenario goes here - what is this scenario
    // testing?
    public void scenario1() {
        Cruise c = new Cruise("Titanic", 5, 3);
        c.setPassNum(5);
        c.setPassListSize();

        Passenger p = new Standard("John", 50);
        Passenger p2 = new Standard("Jane", 100);
        Passenger p3 = new Senior("Alice", 50);
        Passenger p4 = new Senior("Bob", 25);
        Passenger p5 = new Premium("Eve");

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
        p3.printDetails();
        System.out.print("\n");
        p5.printDetails();
        System.out.print("\n");
        c.printRemaining();
    }

    // TODO: Brief description of the scenario goes here - what is this scenario
    // testing?
    public void scenario2() {
        // TODO: create some objects and call some methods to test they work
    }

    // TODO: Brief description of the scenario goes here - what is this scenario
    // testing?
    public void scenario3() {
        // TODO: create some objects and call some methods to test they work
    }
}
