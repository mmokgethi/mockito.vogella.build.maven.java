package mockito.vogella.build.maven.java;

public class Calculator {
    CalculatorService service;

    public Calculator(CalculatorService service)
    {
        this.service = service;
    }

    public int calcSum(int a, int b)
    {

        return service.add(a, b)*2;
        //return (a + b)*a;
    }
}
