import java.util.Scanner;

public class FibonacciNumbers {
    private int NUMBERofFibonacciNumber = 0;
    private int counter = 0;
    private int previousNumber = 0;
    private int prePreviousNumber = 1;
    private int currentNumber = 0;

    public FibonacciNumbers(int number){
        this.NUMBERofFibonacciNumber = number;
    }

    public int getNumber(){
        return this.NUMBERofFibonacciNumber;
    }

    public void setNumber(int NUMBERofFibonacciNumber) {
        this.NUMBERofFibonacciNumber = NUMBERofFibonacciNumber;
    }

    public int calculateNumber(){
        if(counter != NUMBERofFibonacciNumber){
            counter++;
            currentNumber = previousNumber + prePreviousNumber;
            prePreviousNumber = previousNumber;
            previousNumber = currentNumber;
            calculateNumber();
        }
        return currentNumber;
    }
}
