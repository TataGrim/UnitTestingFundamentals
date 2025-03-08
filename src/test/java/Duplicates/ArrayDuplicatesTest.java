package Duplicates;
/*
Implement the method in the ArrayExample class using the TDD approach: public static String[] removeDuplicates(String[] array)
 Method should return new array without duplicates.

 input={apple,banana,apple,orange,banana}
 removeDuplicates(input)={apple,banana,orange}

 */


import org.assertj.core.internal.IterableElementComparisonStrategy;
import org.example.duplicates.ArrayDuplicates;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ArrayDuplicatesTest {

    @Test
    public void testRemoveDuplicatesGoodFlow(){
        String[] input={"apple","banana","apple","orange","banana"};
        String[] expected={"apple","banana","orange"};

        assertThat(ArrayDuplicates.removeDuplicates(input))
        .containsExactlyInAnyOrder(expected);

    }

    @Test
    public void testAlreadyUniqueElementsEdgeCase(){
        String[] input={"apple","banana","orange"};
        String[] expected={"apple","banana","orange"};

        assertThat(ArrayDuplicates.removeDuplicates(input))
                .containsExactlyInAnyOrder(expected);
    }

}




