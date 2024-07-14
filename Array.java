import java.util.*;

public class Array{

    public static int linearSearch(int[] number, int key){
        
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
            
           
        }


        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array :");
        int size = sc.nextInt();
        
        int[] number = new int[size];
        System.out.println("Enter element one by one : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            
        }

        System.out.print("The array is : " );

        for (int j : number) {
            System.out.print(j + " ");
        }

            System.out.println("\n Enter the key you want to find element on which index :");
            int key = sc.nextInt();
            

        int index = linearSearch(number,key);

        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("The element is at index : " + index);
        }
        

       


 
        
    }


}