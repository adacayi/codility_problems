package com.sanver.projects.codility_problems;

public class BinaryGap {
    public int solution(int number) {
        char[] binaryArray = Integer.toBinaryString(number).toCharArray();
        int i, current = 0, max = 0, begin = -1;

        for (i = 0; i < binaryArray.length; i++) {
            switch (binaryArray[i]) {
                case '0':
                    if (begin != -1)
                        current++;
                    break;
                case '1':
                    if (begin == -1) {
                        begin = i;
                        break;
                    }
                    begin = i;
                    if (current > max)
                        max = current;
                    current = 0;
                    break;
                default:
                    break;
            }
        }
        return max;
    }
}
