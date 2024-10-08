import java.util.Arrays;

/*
Write a function to find the longest common prefix string
amongst an array of strings.
If there is no common prefix, return an empty string "".
 */

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        System.out.println(SolutionLCP.longestCommonPrefix(strs));
    }
}

class SolutionLCP {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        int prefixSize = 0;
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];

        while (prefixSize < firstString.length() && prefixSize < lastString.length()) {
            if (firstString.charAt(prefixSize) == lastString.charAt(prefixSize)) {
                prefixSize++;
            } else {
                break;
            }
        }
        return firstString.substring(0, prefixSize);
    }
}

