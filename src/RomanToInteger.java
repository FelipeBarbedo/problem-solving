public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(SolutionRTI.romanToInt("MCMXCIV"));
    }
}

class SolutionRTI {
    public static int romanToInt(String s) {

        int[] romanNumbers = {1, 5, 10, 50, 100, 500, 1000};
        StringBuilder sIndex = new StringBuilder();
        int number = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case 'I':
                    sIndex.append(0);
                    break;
                case 'V':
                    sIndex.append(1);
                    break;
                case 'X':
                    sIndex.append(2);
                    break;
                case 'L':
                    sIndex.append(3);
                    break;
                case 'C':
                    sIndex.append(4);
                    break;
                case 'D':
                    sIndex.append(5);
                    break;
                case 'M':
                    sIndex.append(6);
                    break;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int a, b;
            a = Character.getNumericValue(sIndex.charAt(i));
            if ((i + 1) < s.length()) {
                b = Character.getNumericValue(sIndex.charAt(i + 1));
            } else {
                b = -1;
            }

            if (a >= b) {
                number += romanNumbers[a];
            } else {
                number -= romanNumbers[a];
            }
        }

        return number;
    }
}

