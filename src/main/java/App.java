import calculate.Calculate;

public class App {
     public static void main(String[] args) {
        try {
            Calculate calculate = new Calculate(5, 0, '/');
            System.out.print("Результат: " + calculate.getResult());
        }
        catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}