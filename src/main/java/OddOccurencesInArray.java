public class OddOccurencesInArray {

    public int solution(int[] array) {
        int result=array[0];
        for (int i = 1; i < array.length; i++) {
            result ^= array[i];
        }
        return result;
    }
}
