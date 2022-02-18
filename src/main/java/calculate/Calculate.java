package calculate;

public class Calculate extends AbstractForCalculate {

    public Calculate(double num1, double num2, char sign) {
        super(num1, num2, sign);
    }


    public double getResult() {
        switch (super.getSign()) {
            case '+':
                return addition();
            case '-':
                return subtraction();
            case '/':
                return division();
            case '*':
                return multiplication();
            default:
                throw new RuntimeException("Такой операции нет.");
        }
    }

    public double addition() {
        return super.getNum1() + super.getNum2();
    }

    public double subtraction() {
        return super.getNum1() - super.getNum2();
    }

    public double division() {
        try {
            if(super.getNum2() == 0) {
                throw new RuntimeException("Делить на 0 нельзя!");
            }
            return super.getNum1() / super.getNum2();
        } catch (ArithmeticException e) {
            throw new RuntimeException("Некорректная операция");
        }
    }
    public double multiplication() {
        return super.getNum1() * super.getNum2();
    }
}
