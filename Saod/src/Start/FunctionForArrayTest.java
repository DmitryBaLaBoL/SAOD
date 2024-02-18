package Start;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import Start.FunctionForArray;

class FunctionForArrayTest {

    @Test
    void hasSortArrayTest() {
        double[] Arr = new double[]{2.0,3.9,5.6,7.9,8.1};
        assertEquals(FunctionForArray.HasSortArray(Arr),true);
        Arr = new double[]{1.2,3.4,5.6,7,8,1.2};
        assertEquals(FunctionForArray.HasSortArray(Arr),false);
    }
}