package n1exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "39975262, C",
            "12131415, L",
            "98765432, M",
            "22222222, J",
            "10000000, Z",
            "44444444, A",
            "22222222, J",
            "88888888, Y"
    })
    void testCalcularLletraDni(int dni, char lletraEsperada){
        assertEquals(lletraEsperada, CalculoDni.calcularLletraDni(dni));
    }
}