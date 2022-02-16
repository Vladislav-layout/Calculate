import calculate.Calculate;

public class App {
     public static void main(String[] args) {
        try {
            Calculate calculate = new Calculate(5, 788, '+');
            System.out.printf("Результат: %.4f", calculate.getResult());
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}