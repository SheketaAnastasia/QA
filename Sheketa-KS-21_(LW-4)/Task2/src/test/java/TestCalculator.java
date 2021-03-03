import org.junit.*;

public class TestCalculator {

    Calculator calculator=new Calculator();

    @Test
    public void testDiv(){
        Assert.assertEquals(2, calculator.division(4,2),0);
    }
    @Test
    public void testSum(){
        Assert.assertEquals(2, calculator.sum(1,1),0);
    }
    @Test
    public void testMulti(){
        Assert.assertEquals(2, calculator.multiplication(2, 1),0);
    }
    @Test
    public void testSubtract(){
        Assert.assertEquals(2, calculator.subtraction(4,2),0);
    }

}
