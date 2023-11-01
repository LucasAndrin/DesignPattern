package unit;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    Operation operation = new Operation();

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(4, operation.add(2, 2));
        assertNotEquals(3, operation.add(1, 1));
        assertEquals(6, operation.add(2, 4));
    }

    @org.junit.jupiter.api.Test
    void sub() {
        assertEquals(1, operation.sub(2, 1));
        assertEquals(1, operation.sub(3, 2));
        assertEquals(-2, operation.sub(2, 4));
    }

    @org.junit.jupiter.api.Test
    void mul() {
        assertEquals(2, operation.mul(2, 1));
        assertEquals(6, operation.mul(3, 2));
        assertEquals(8, operation.mul(2, 4));
    }

    @org.junit.jupiter.api.Test
    void div() {
        assertEquals(2, operation.div(2, 1));
        assertEquals(1.5, operation.div(3, 2));
        assertEquals(.5, operation.div(2, 4));
    }
}