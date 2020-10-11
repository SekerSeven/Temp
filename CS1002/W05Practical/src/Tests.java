import org.junit.jupiter.api.Test;

import cs1002.*;

public class Tests {
    @Test
    public void Test1() {
        FileTest.run(W05Practical::main, "input_1");
    }
    @Test
    public void Test3() {
        FileTest.run(W05Practical::main, "input_3");
    }
    @Test
    public void Test6() {
        FileTest.run(W05Practical::main, "input_6");
    }
    @Test
    public void Test7() {
        FileTest.run(W05Practical::main, "input_7");
    }
    @Test
    public void Test72() {
        FileTest.run(W05Practical::main, "input_72");
    }
    @Test
    public void TestMinus13() {
        FileTest.run(W05Practical::main, "input_-13");
    }
    
}
