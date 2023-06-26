import java.util.Arrays;
import java.util.Scanner;

class Move_Zeroes{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter array elements : ");
        for(int i = 0; i<size; i++){
            arr[i] = s.nextInt(); 
        }

      moveZeroes(arr);
      System.out.println(Arrays.toString(arr));
    }

    static void moveZeroes(int arr[]){
        int left = 0, right = 0;

        while(right < arr.length){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
          
    }
}