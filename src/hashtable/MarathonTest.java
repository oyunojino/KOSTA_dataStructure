package hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

// 완주하지 못한 선수 구하는 문제
public class MarathonTest {
  public static void main(String[] args) {
    String[] participant = {"kiki", "kiki", "eden"};
    String[] completion = {"eden", "kiki"};
    solution(participant, completion);
  }

  static String solution(String[] participant, String[] completion) {
    Map<String, Integer> map = new HashMap<>();
    int defaultValue = 0;

    for (String per : participant) {
      map.put(per, map.getOrDefault(per, defaultValue) + 1); // 참가선수중에 동명이인 처리를 위한 방법
    }
    System.out.println(map);

    for (String per : completion) {
      map.put(per, map.get(per) - 1);// 참가선수 명단에서 완주자를 찾아서 선수의 수만큼 value 수정
    }
    System.out.println(map);

    Set<String> set = map.keySet();
    for (String key : set) {
      if (map.get(key) != 0) {
        return map.get(key).toString();
      }
    }
    return null;
  }
}