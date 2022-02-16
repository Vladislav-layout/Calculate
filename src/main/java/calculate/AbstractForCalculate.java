package calculate;

public abstract class AbstractForCalculate {
    private double num1;
    private double num2;
    private char sign;

    public AbstractForCalculate(double num1, double num2, char sign) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

}