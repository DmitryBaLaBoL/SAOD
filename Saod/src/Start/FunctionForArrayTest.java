package Start;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionForArrayTest {

    @Test
    void hasSortArrayTest() {
        // Проверка с отсортированный массивом
        double[] Arr = new double[]{2.0,3.9,5.6,7.9,8.1};
        assertEquals(FunctionForArray.HasSortArray(Arr),true);

        // Проверка где сортировка прерывается в конце
        Arr = new double[]{1.2,3.4,5.6,7,8,1.2};
        assertEquals(FunctionForArray.HasSortArray(Arr),false);

        // Проверка где сортировка прерывается в начале
        Arr = new double[]{8.9,1.2,6.2,7.2,8.6,9.1,10.0};
        assertEquals(FunctionForArray.HasSortArray(Arr),false);

        // Проверка где сортировка прерывается в середине
        Arr = new double[]{1.2,3.4,5.6,7.2,4.3,6.7,7.8,10.9,11.2};
        assertEquals(FunctionForArray.HasSortArray(Arr),false);



    }
}