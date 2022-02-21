import calculate.Calculate;
import org.junit.Assert;
import org.junit.Test;


public class CalculateTests {
    @Test
    public void testAdditionNum1AndNum2(){
        Calculate calculate = new Calculate(5.25, 788, '+');
        Assert.assertEquals("Сумма 5 и 788 должна быть равна 793,2500.", 793.2500, calculate.getResult(), 0);
    }
    @Test
    public void testSubtractionNum1AndNum2(){
        Calculate calculate = new Calculate(5.25, 788, '-');
        Assert.assertEquals("Разность 5 и 788 должна быть равна -782.7500.", -782.7500, calculate.getResult(), 0);
    }
    @Test
    public void testDivisionNum1AndNum2(){
        Calculate calculate = new Calculate(5.33, 5.3300, '/');
        Assert.assertEquals("Результат деления 5.33 на 5.3300 должен равняться 1.0000", 1.0000, calculate.getResult(), 0);
    }
    @Test
    public void testMultiplicationNum1AndNum2(){
        Calculate calculate = new Calculate(5.25, 5.25, '*');
        Assert.assertEquals("Результат умножения 5.25 и 5.25 должнен равняться 27.5625.", 27.5625, calculate.getResult(), 0);
    }
    @Test
    public void testDivisionToZero(){
        Calculate calculate = new Calculate(5.25, 0, '/');
        Assert.assertEquals("Делить на 0 нельзя!", 0, calculate.getNum2(),0);
    }
    @Test
    public void testUncorrectValueForSign(){
        Calculate calculate = new Calculate(5, 5, 's');
        Assert.assertNotEquals("Некорректный ввод данных.", '+', calculate.getSign());
        Assert.assertNotEquals("Некорректный ввод данных.", '-', calculate.getSign());
        Assert.assertNotEquals("Некорректный ввод данных.", '/', calculate.getSign());
        Assert.assertNotEquals("Некорректный ввод данных.", '*', calculate.getSign());
    }
}
