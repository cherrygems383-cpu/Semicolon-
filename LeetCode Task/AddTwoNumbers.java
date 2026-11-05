import java.util.Arrays;

public class AddTwoNumbers{
  public static void main (String[] args){
  
  
      int [ ] nums = {2, 7, 11, 15};  
      int target = 17;
      int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
  }


   public static int[] twoSum(int[] nums, int target) {
        for(int index =0; index < nums.length; index++){
            for (int count = index + 1; count < nums.length; count++){
                  if (nums[index]  + nums[count] == target){
                      int [] newarray = {index, count};
                      return newarray;
                
             
            
                
            
         }
         
       
     }
 }
 
              return nums;
}
}
