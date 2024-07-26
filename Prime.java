import java.util.*;


class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check it is prime or not");
        int n=sc.nextInt();
       

        if(n==2){
            System.out.println("The number is Prime");

        }
        else{
            boolean isPrime = true;
        
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
            }
           
        }
        
        if(isPrime==true){
            System.out.println("The number is Prime");
        }
        else{
            System.out.println("The number is not Prime");
        }
        }

        

        


    }

}
