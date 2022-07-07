package Level_1.incompleteRunner;

import java.util.Arrays;
import java.util.HashMap;

public class incompleteRunner {
    public static String solution(String[] participant, String[] completion) {
        /*
        Arrays.sort(participant);
        Arrays.sort(completion);
        for ( int i=0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[completion.length];

         */

        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1); //getOrDefault 에 대해서 배웠다.
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
