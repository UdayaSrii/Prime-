import java.util.Scanner; 
public class Prime{
  // Start your code from here
  // Create a method to check if a number is prime
    public static boolean isPrime(int n){
      // If the number is less than 2, it is not prime
        if(n<=1){
      return false;
    }
    // Check if the number is divisible by any number up to its square root
    for(int i=2;i<n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  // Create the main method
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  System.out.println(isPrime(n));
  }
}

