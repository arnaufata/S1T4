package n1exercici1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MesTest {
    @Test
    void test() {
        Mes mesos = new Mes();
        assertAll(
                ()->assertEquals(12, mesos.getMesos().size()),
                ()->assertEquals("Agost", mesos.getMesos().get(7)),
                ()->assertNotNull(mesos.getMesos())
        );
    }

}