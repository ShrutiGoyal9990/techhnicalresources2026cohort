import java.util.*;
public class Assignment{
public static void main(String[] args) {
  // Q-1 print Z
  //  System.out.println("*****");
  //  System.out.println("   *");
  //  System.out.println("  *");
  //  System.out.println(" *");
  //  System.out.println("*****");


  //Q-2 GRADING SYSTEM
  // Scanner scn = new Scanner(System.in);
  //   int marks = scn.nextInt();
  //   // input - don't change this code
  //   if (marks>90){
  //       System.out.println("excellent");   
  //   } else if(marks>80){
  //       System.out.println("good");    
  //   } else if(marks>70){
  //       System.out.println("fair");    
  //   } else if(marks>60){
  //       System.out.println("meets expectations");   
  //   } else {
  //       System.out.println("below par");
  //   }


  //Q-3 IS A NUMBER PRIME
  // Scanner scn = new Scanner(System.in);
  //     int t = scn.nextInt();
  //     for(int i=0; i<t; i++){
  //         int n=scn.nextInt();
  //         int count=0;
  //         for(int div = 2; div * div <=n; div++){
  //            if(n%div==0){
  //             count++;
  //             break;
  //            }
  //         }
      
  //     if (count==0){
  //         System.out.println("prime");
  //     } else {
  //         System.out.println("not prime");
  //     } 
  //  }


  // Q-4 PRINT ALL PRIMES TILL N
  // Scanner scn = new Scanner(System.in);
  //       int low = scn.nextInt();
  //       int high = scn.nextInt();       
  //       for(int n=low; n <= high; n++){
  //           int count=0;           
  //           for(int div=2; div * div<=n; div++){
  //               if(n%div==0){
  //                   count++;
  //                   break;
  //               }
  //           }                      
  //           if(count==0){
  //               System.out.println(n);
  //           }
            
  //       }


  //Q-5 PRINT COUNT OF A NUMBER
  // Scanner s = new Scanner(System.in);
  //   int num = s.nextInt();
  //   int count = 0;
  //   while (num != 0) {
  //       count++;
  //       num = num/10;
  //   }
  //   System.out.println(count);


  //Q-6 REVERSE OF A NUMBER
  // Scanner s = new Scanner(System.in);
  //    int n = s.nextInt();
  //    if (n == 0) {
  //        System.out.println(n);
  //    }
  //    while (n != 0) {
  //        System.out.println(n%10);
  //        n /= 10;
  //    }


  //Q-7 INVERSE OF A NUMBER
  // int ans = 0;
  // int place = 1;
  // Scanner s = new Scanner(System.in);
  // int n = s.nextInt();
  // while (n != 0) {
  //     int r = n%10;
  //     ans += place*((int)Math.pow(10,r-1));
  //     place++;
  //     n = n/10;
  // }
  // System.out.println(ans);


  //Q-8 ROTATE A NUMBER 
  // Scanner s = new Scanner(System.in);
  //   int N = s.nextInt();
  //   int K = s.nextInt();
  //   int ans = 0;
  //   int place = 0;
  //   int count = 0;
  //   int n = N;
  //   while (n > 0) {
  //     count++;
  //     n = n / 10;
  //   }
  //   while (K < 0) {
  //       K = count + K;
  //   }
  //   if (K > count) {
  //       K = K % count;
  //   }
  //   while (N > 0) {
  //     int r = N % 10;
  //     if (place < K) {
  //       ans += r * ((int)Math.pow(10, place - K + count));
  //     }
  //     else {
  //       ans += r * ((int)Math.pow(10, place - K));
  //     }
  //     N = N / 10;
  //     place++;
  //   }
  //   System.out.println(ans);


  //Q-9 GCD AND LCM
  // Scanner s = new Scanner(System.in);
  //     int n1 = s.nextInt();
  //     int n2 = s.nextInt();
  //     int gcd = 1;
  //     for (int i = 1; i <= Math.min(n1,n2); i++) {
  //         if (n1%i == 0 && n2%i == 0) {
  //             gcd = i;
  //         }
  //     }
  //     System.out.println(gcd);
  //     int lcm = Math.max(n1,n2);
  //     for (; lcm <= n1*n2; lcm++) {
  //         if (lcm%n1 == 0 && lcm%n2 == 0) {
  //             System.out.println(lcm);
  //             break;
  //         }
  //     }


  //Q-10 PRIME FACTORIZATION OF A NUMBER
  // Scanner s = new Scanner(System.in);
  // int n = s.nextInt();
  // for (int i = 2; i <= n;) {
  //     if (n % i == 0) {
  //         System.out.print(i + " ");
  //         n = n/i;
  //     }
  //     else {
  //         i++;
  //     }
  //}
 }
}
