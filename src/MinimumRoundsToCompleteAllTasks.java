import java.util.HashMap;

public class MinimumRoundsToCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : tasks) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int count : map.values()) {
            if (count == 1) return -1;
            res += count / 3;
            if (count % 3 != 0) res++;
        }
        return res;
    }
}
