public class PrintSubArray {

    public static void printSubArray(int[] numbers){

        int maxSum = Integer.MIN_VALUE;
                int minSum = Integer.MAX_VALUE;
        

        for(int i = 0 ; i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                

                int sum =0;
                for(int s = start;s<=end;s++){
                    sum+=numbers[s];
                }


                for(int k = start;k<=end;k++){
                    
                    System.out.print(numbers[k]  + " ");
                 
                }
                System.out.println("="+sum);
                
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }

                

            }
            System.out.println();
        }
        System.out.println("\nMaximum sum of all subarrays: " + maxSum);
       
                System.out.println("Minimum sum of all subarrays: " + minSum);
       

   

    }
   

   


    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};

        printSubArray(numbers);
       


    }
}
