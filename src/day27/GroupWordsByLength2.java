package day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupWordsByLength2 {

	public static void main(String[] args) {
		String sentence = "one two three four five six seven eight nine ten eleven twelve";
		Map<Integer, List<String>> map = new HashMap<>();

		for (String word : sentence.split(" ")) {
			int key=word.length();
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>(Arrays.asList(word)));
			} else {
				map.get(key).add(word);
			}
		}
	}
}

/*
 * //word="three" key=5 { 3 : [one,two] 5 : [three] }
 */

/*
 * 3 [one,two,six,ten] 4 [four,five,nine] 5 [three,seven,eight]
 */