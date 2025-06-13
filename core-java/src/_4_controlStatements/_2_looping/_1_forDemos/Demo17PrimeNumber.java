package _4_controlStatements._2_looping._1_forDemos;

public class Demo17PrimeNumber {
    public static void main(String[] args) {
        int number = 15;
       //factors of 15 = 1, 3, 5
        boolean isPrime = true;
        for (int i = 2; i <=number/2 ; i++) {
          if(number % i == 0) {
              isPrime = false;
              break;
          }
        }
        System.out.println(isPrime?"Prime":"Not Prime");
    }
}
