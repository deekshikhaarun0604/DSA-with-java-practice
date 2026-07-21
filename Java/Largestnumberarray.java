public class Largestnumberarray {
    public static void main(String[] args) {
         int[] arr = new int[] {1, 12, 3, 8}; 
        int maxi=arr[0];
        for(int i:arr){
            if(i>maxi){
                maxi=i;
            }
        }
   System.out.println("largest element:"+maxi);
    }
    
}
