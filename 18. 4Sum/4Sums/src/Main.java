import java.util.List;
import java.util.Arrays;

public class Main {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> listOfUniqueQuadrplets = new List<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == target){
                // this index is equal to the target we should add it to the list
            }else if (){

            }
            
        }

        return listOfUniqueQuadrplets;
    }
    
    public static void main(String[] args) throws Exception {
        int[] arrayOfNums = {1,0,-1,0,-2,2};
        int target = 0;

        fourSum(arrayOfNums, target);
        System.out.println();
    }
}
