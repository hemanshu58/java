import java.util.*;

// class Pattern {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the row you  want to print *");
//         n =sc.nextInt();
//         int b=1,a=0;
        

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
               
//                 if((i+j)%2==0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
                


//             }
//             System.out.println();
//         }

//     }
// }

// class Pattern {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the row you  want to print *");
//         n =sc.nextInt();
        

//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }

//     }
// }

// class Pattern {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the row you  want to print *");
//         n =sc.nextInt();
        

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j + " ");

//             }
//             System.out.println();
//         }

//     }
// }

// class Pattern {
//     public static void main(String[] args) {
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the row you  want to print *");
//         n =sc.nextInt();
//         char ch = 'A';
        

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;

//             }
//             System.out.println();
//         }

//     }
// }

// class Pattern{
// public static void main(String[] args) {
    
//     int n;
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the row you want to print");
//     n = sc.nextInt();

//     for(int i=n;i>=1;i--){
//         for(int j=1;j<i;j++){
//             System.out.print(" ");
//         }
//         for(int j=0;j<=n-i;j++){
//             System.out.print("*");

//         }
//         System.out.println();
//     }
// }

// }

class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row you  want to print *");
        n =sc.nextInt();
        

        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++){
                System.out.print(j);

            }
            System.out.println();
            n--;
        }

    }
}

