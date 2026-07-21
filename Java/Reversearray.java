import java.util.*;
class Reversearray{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter 5 array elements");
        int[] ar=new int[6];
        for(int i=0;i<5;i++){
             ar[i]=s.nextInt();
        }
        for(int j=5;j>=0;j--){
            System.out.println(ar[j]);
        }

    }
}
