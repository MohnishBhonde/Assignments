import java.util.*;
public class SearchArray {
    public static boolean searchArray(int[] arr, int toCheckValue){
        boolean ans=false;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == toCheckValue) {
                ans = true;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int []arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        System.out.print("Enter no to check:");
        int Value=input.nextInt();
        boolean ans =searchArray(arr,Value);
        if (ans==true){
            System.out.print("Found the Number");
        }
        else{
            System.out.print("Number is not there");
    }

    }



}
