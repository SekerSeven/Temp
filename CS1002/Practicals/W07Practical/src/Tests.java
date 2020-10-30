public class Tests {

    // This tests the normal running of the program for a valid borrow, as well as
    // the calculation of a fine for late return.
    public void scenario1() {
        Hall abh = new Hall();
        abh.setAddress("blah blah");
        abh.setFine(0.75);
        abh.setName("ABH");
        Hall am = new Hall();
        am.setAddress("to be filled");
        am.setFine(0.50);
        am.setName("Andrew Melville");

        Game chess = new Game();
        chess.setHall(abh);
        chess.setName("Chess");
        chess.setPrice(10.00);
        chess.setLoanLen(2);

        Student bob = new Student();
        bob.setName("Bob");
        bob.setMatNumber(200000000);
        bob.setHall(abh);
        Student alice = new Student();
        alice.setName("Alice");
        alice.setMatNumber(123456789);
        alice.setHall(am);

        abh.borrowGame(chess, bob, alice, "2020-10-30");
        abh.getDetails();
        chess.getDetails(chess);
        bob.getDetails();
        System.out.println("Fine: £" + chess.calcFine(chess));
        System.out.println("\n");
    }

    // This tests that the program can handle invalid borrow requests and that it
    // deals with outputting the fine when none has been incurred.
    public void scenario2() {
        Hall abh = new Hall();
        abh.setAddress("blah blah");
        abh.setFine(0.75);
        abh.setName("ABH");
        Hall am = new Hall();
        am.setAddress("to be filled");
        am.setFine(0.50);
        am.setName("Andrew Melville");

        Game backgammon = new Game();
        backgammon.setHall(am);
        backgammon.setName("Backgammon");
        backgammon.setPrice(15.00);
        backgammon.setLoanLen(5);

        Student bob = new Student();
        bob.setName("Bob");
        bob.setMatNumber(200000000);
        bob.setHall(abh);
        Student eve = new Student();
        eve.setName("Eve");
        eve.setMatNumber(102938475);
        eve.setHall(null);

        am.borrowGame(backgammon, bob, eve, "2020-10-28");
        backgammon.getDetails(backgammon);
        System.out.println("Fine: £" + backgammon.calcFine(backgammon));
        System.out.println("\n");
    }

    // This tests that the extension program works for a valid borrow and return and
    // correctly subtracts the fine levied for return from the students' balances
    // and adds it to their running total of fines. It also checks that the fine
    // does not exceed the price of the game however late the return.
    public void scenario3() {
        HallEx abh = new HallEx();
        abh.setAddress("blah blah");
        abh.setFine(0.75);
        abh.setName("ABH");
        abh.setFineLimit(25.00);

        GameEx chess = new GameEx();
        chess.setHall(abh);
        chess.setName("Chess");
        chess.setPrice(10.00);
        chess.setLoanLen(2);

        Account bobAccount = new Account();
        bobAccount.setBalance(10.00);
        bobAccount.setDateCreated("2020-07-17");
        bobAccount.setNumber(925925925);
        Account johnAccount = new Account();
        johnAccount.setBalance(13.00);
        johnAccount.setDateCreated("2002-11-15");
        johnAccount.setNumber(529529529);

        StudentEx bob = new StudentEx();
        bob.setName("Bob");
        bob.setMatNumber(200000000);
        bob.setHall(abh);
        bob.setAccount(bobAccount);
        bob.setFines(0);
        StudentEx john = new StudentEx();
        john.setName("John");
        john.setMatNumber(657483920);
        john.setHall(abh);
        john.setAccount(johnAccount);
        john.setFines(15.00);

        abh.borrowGame(chess, bob, john, "2020-10-10");
        chess.getDetails(chess);
        System.out.println("Fine: £" + chess.calcFine(chess));
        // Then the game is returned.
        abh.returnGame(chess, bob, john);
        chess.getDetails(chess);
        bob.getDetails();
        bobAccount.getDetails();
        john.getDetails();
        johnAccount.getDetails();
        System.out.println("\n");
    }

    // This tests that the game is not successfully lent when the balance in one of
    // the students' accounts is lower than the replacement cost of the game.
    public void scenario4() {
        HallEx abh = new HallEx();
        abh.setAddress("blah blah");
        abh.setFine(0.75);
        abh.setName("ABH");
        abh.setFineLimit(25.00);

        GameEx chess = new GameEx();
        chess.setHall(abh);
        chess.setName("Chess");
        chess.setPrice(10.00);
        chess.setLoanLen(2);

        Account bobAccount = new Account();
        bobAccount.setBalance(9.00);
        bobAccount.setDateCreated("2020-07-17");
        bobAccount.setNumber(925925925);
        Account johnAccount = new Account();
        johnAccount.setBalance(13.00);
        johnAccount.setDateCreated("2002-11-15");
        johnAccount.setNumber(529529529);

        StudentEx bob = new StudentEx();
        bob.setName("Bob");
        bob.setMatNumber(200000000);
        bob.setHall(abh);
        bob.setAccount(bobAccount);
        bob.setFines(0);
        StudentEx john = new StudentEx();
        john.setName("John");
        john.setMatNumber(657483920);
        john.setHall(abh);
        john.setAccount(johnAccount);
        john.setFines(15.00);

        abh.borrowGame(chess, bob, john, "2020-10-10");
        chess.getDetails(chess);
        System.out.println("Fine: £" + chess.calcFine(chess));
        // Then the game is returned.
        abh.returnGame(chess, bob, john);
        chess.getDetails(chess);
        bob.getDetails();
        bobAccount.getDetails();
        john.getDetails();
        johnAccount.getDetails();
        System.out.println("\n");
    }

    // This tests that the game is not successfully lent when the fines that one of
    // the studets has accrued exceed the maximum for the hall they are trying to
    // borrow the game from.
    public void scenario5() {
        HallEx abh = new HallEx();
        abh.setAddress("blah blah");
        abh.setFine(0.75);
        abh.setName("ABH");
        abh.setFineLimit(25.00);

        GameEx chess = new GameEx();
        chess.setHall(abh);
        chess.setName("Chess");
        chess.setPrice(10.00);
        chess.setLoanLen(2);

        Account bobAccount = new Account();
        bobAccount.setBalance(10.00);
        bobAccount.setDateCreated("2020-07-17");
        bobAccount.setNumber(925925925);
        Account johnAccount = new Account();
        johnAccount.setBalance(13.00);
        johnAccount.setDateCreated("2002-11-15");
        johnAccount.setNumber(529529529);

        StudentEx bob = new StudentEx();
        bob.setName("Bob");
        bob.setMatNumber(200000000);
        bob.setHall(abh);
        bob.setAccount(bobAccount);
        bob.setFines(0);
        StudentEx john = new StudentEx();
        john.setName("John");
        john.setMatNumber(657483920);
        john.setHall(abh);
        john.setAccount(johnAccount);
        john.setFines(25.00);

        abh.borrowGame(chess, bob, john, "2020-10-10");
        chess.getDetails(chess);
        System.out.println("Fine: £" + chess.calcFine(chess));
        // Then the game is returned.
        abh.returnGame(chess, bob, john);
        chess.getDetails(chess);
        bob.getDetails();
        bobAccount.getDetails();
        john.getDetails();
        johnAccount.getDetails();
        System.out.println("\n");
    }
}
