public class SumOfFirstTenNaturalNumbers {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        
        System.out.println("Sum of the first 10 natural numbers: " + sum);
    }
}