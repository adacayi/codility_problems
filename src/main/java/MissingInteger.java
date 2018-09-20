public class MissingInteger {
    public int solution(int[] array) {
        int i;
        int[] occured=new int[1_000_001];

        for (i = 0; i < array.length; i++) {
            if(array[i]<1)
                continue;
            occured[array[i]]=1;
        }

        for (i = 1; i < occured.length; i++) {
            if(occured[i]==0)
                break;
        }

        return i;
    }
}
