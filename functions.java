import java.util.Scanner;

public class functions {

    // public static int addfunction(int a , int b){
    //     int sum = a + b ;
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     int a = 10;
    //     int b = 20;

    //     int sum =  addfunction(a,b);
    //     System.out.println(sum);


    // }

// product of 2 numbers

    // public static int product(int a , int b){
    //     int pro = a*b;
    //     return pro;
    // }
    // public static void main(String[] args) {
    //     int a = 5;
    //     int b = 2;
    //     System.out.println(product(a, b));
        
    // }


// factorial

//     public static int calculatefactorial(int n ){
//         int fact = 1 ;
//         for(int i = 1 ; i <= n ; i++){
//             fact = fact * i;
//         }
//         return fact;
//     }

//     public static int bionomial (int n , int r) {
//        int n_fact = calculatefactorial(n);
//        int r_fact = calculatefactorial(r);
//         int n_rfact = calculatefactorial(n-r);     
        
//         int coff = n_fact / (r_fact * n_rfact);
//         return coff;
//     }
//  public static void main(String[] args) {
   
//     System.out.println(bionomial(5, 2));
//  }


// prime or not 

//  public static boolean isprime(int n ){
//     boolean isprime = true;
//     for(int i = 2 ; i <= n-1 ; i++){
//         if(n%i==0){
//             isprime = false;
//             break;
//         }
//     }
//     return isprime;
// }

// public static void main(String[] args) {
//     System.out.println(isprime(5));
// }
//  }


// chek prime from 1 to 10 


// public static void primes(int n ) {
//     for( int i = 2 ; i <= n ; i++){
//         if(isprime(i) == true){
//             System.out.println(i + "");
//         }
        
//     }
// }

// public static void main(String[] args) {
//    primes(10);
// }



// binary to decimal



// public static void binaryToDecimal(int n) {
//     int dec = 0;
//     int pow = 0;

//     while(n > 0){
//         int lastDigit = n % 10;
//         dec = dec + (lastDigit * (int)Math.pow(2,pow));

//         pow++;
//         n = n/10;
//     }
//     System.out.println("decimal of" +  n + " = " + dec);
// }
// public static void main(String[] args) {
//     binaryToDecimal(101);
// }




// decimal to binary



// public static void decimalToBianry(int n) {
//     int bin = 0;
//     int pow = 0;

//     while(n > 0){
//         int rem = n % 2;
//         bin = bin + (rem * (int)Math.pow(10,pow));
//         pow++;
//         n = n/2;
//     }
//     System.out.println("decimal of" +  n + " = " + bin );
// }
// public static void main(String[] args) {
//     decimalToBianry(7);
// }


Scanner sc = new Scanner(System.in);


//practice Q1


// public static int avg(int a , int b , int c ){
//   int avg = (a + b + c )/3;
//   return avg;
// }

// public static void main(String[] args) {
//     int a = 5;
//     int b = 3;
//     int c = 4;
//     int average = avg(a,b,c);
//     System.out.println(average); 

// }


//practice Q2

public static boolean isEven(int n){
    boolean iseven = false;
    if(n % 2 == 0 ){
        iseven = true;
    }
    return iseven;
}
public static void main(String[] args) {
    int n = 3;
    boolean iseven = isEven(n);
    System.out.println(iseven);
}

}




