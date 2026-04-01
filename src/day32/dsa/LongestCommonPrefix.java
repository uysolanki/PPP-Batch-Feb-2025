package day32.dsa;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args)
	{				//				       i
		String strs[] = {"FLOWERS","FLOW","FLIGHT"};
		System.out.println(findLongestCommonPrefix(strs));
	}

	private static String findLongestCommonPrefix(String[] strs) {
		String prefix = strs[0]; //FLOW

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix))
            {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
		
	}

	

}
