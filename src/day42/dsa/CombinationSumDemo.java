package day42.dsa;

import java.util.*;

public class CombinationSumDemo {

    public static void main(String[] args) {
        int[] candidates = {1, 2, 3, 7};
        int target = 7;

        List<List<Integer>> result = combinationSum(candidates, target);
        result.stream().forEach(System.out::println);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] candidates, int target, int index,
                                  List<Integer> current, List<List<Integer>> result) {

        // ✅ Found valid combination
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // ❌ Stop if target goes negative
        if (target < 0) {
            return;
        }

        // 🔁 Try all options from current index
        for (int i = index; i < candidates.length; i++) {

            // Choose
            current.add(candidates[i]);

            // Explore (stay at same index → reuse allowed)
            backtrack(candidates, target - candidates[i], i, current, result);

            // Backtrack (undo choice)
            current.remove(current.size() - 1);
        }
    }
}