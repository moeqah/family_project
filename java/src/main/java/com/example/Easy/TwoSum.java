package main.java.com.example.Easy;
import java.util.HashMap;

public class TwoSum {
  public static int[] run(int[] nums, int target){
    HashMap<Integer, Integer> unique = new HashMap<Integer, Integer>();
    for(int i = 0; i < nums.length; i++){
      int valueToFind = target - nums[i];
      if(unique.containsKey(valueToFind)){
          return new int[]{unique.get(valueToFind), i};
      } else{
        unique.put(nums[i], i);
      }
    }
    return new int[]{};
  }
}
