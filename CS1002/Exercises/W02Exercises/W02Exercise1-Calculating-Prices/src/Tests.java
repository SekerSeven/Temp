import org.junit.jupiter.api.Test;

import cs1002.*;

public class Tests {
    @Test
    public void TestInput1() {
        FileTest.run(W02Exercise1::main, "input_3_6_11");
    }

    @Test
    public void TestInput2() {
        FileTest.run(W02Exercise1::main, "input_21_19_17");
    }  
}
