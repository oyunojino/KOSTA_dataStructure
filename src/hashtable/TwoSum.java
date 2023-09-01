package hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static int[] twoSum(int[] numbers, int target){
    Map<Integer, Integer> map = new HashMap<>();
    int diff = 0;
    for (int i = 0; i < numbers.length; i++) {
      map.put(numbers[i], i);
    }

    for (int i = 0; i < numbers.length; i++) {
      diff = target - numbers[i];
      if(map.containsKey(diff) && map.get(diff) != i){ // 자기 자신을 제외하고 더해서 target이 되는 값 찾기
        return new int[] {i, map.get(diff)};
      }
    }
    return null;
  }
}