package n1exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayExceptionTest {

    @Test
    public void testThrowArrayIndexOutOfBoundsException(){

        ArrayExceptionThrower thrower = new ArrayExceptionThrower();

        assertThrows(ArrayIndexOutOfBoundsException.class, thrower::throwsArrayIndexOutOfBoundsException);
    }
}
