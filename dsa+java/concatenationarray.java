import java.util.Scanner;
import java.util.Arrays;
class concatenationarray
{ 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter size: ");
        int n = s.nextInt();        
        int[] nums = new int[n]; 
        for(int i = 0; i < n; i++){ 
            nums[i] = s.nextInt(); 
        } 
        int[] arr = new int[2 * n]; 
        
        for(int i = 0; i < n; i++){ 
            arr[i] = nums[i]; 
        } 
        
        for(int j = n; j < 2 * n; j++){ 
            arr[j] = arr[j - n]; 
        } 
        System.out.println("Result: " + Arrays.toString(arr)); 
        
        s.close();
    }
}
