package Day13;
import java.util.*;
import java.util.Arrays;
public class HomeTask_ArraySorted {
        public static void main(String[] args) {
            System.out.println(IsSorted());
        }

        public static boolean IsSorted(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println("Before Sorting: " + Arrays.toString(arr));
            Arrays.parallelSort(arr);
            System.out.println("After Sorting: " + Arrays.toString(arr));

            for(int i=0;i<arr.length;i++){
                if(arr[i]< arr[i+1]){
                    return true;
                }
            }
            return false;
        }
}
