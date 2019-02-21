package mockito.vogella.build.maven.java;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = null;
    CalculatorService service = mock(CalculatorService.class);

    @Before
    public void Setup()
    {
        calc = new Calculator(service);
    }

    @Test
    public void testAdd()
    {
        when(service.add(2,3)).thenReturn(5);
        assertEquals(10,calc.calcSum(2,3));
        verify(service).add(2,3);
    }

}