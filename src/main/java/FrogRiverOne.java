public class FrogRiverOne {
    public int solution(int x, int[] array) {
        int[] positions = new int[x + 1];
        int i,n=array.length,count=0,position;

        for (i = 0; i < n; i++) {

            position = positions[array[i]];

            if(position ==1)
                continue;

            positions[array[i]]=1;
            count++;

            if(count==x)
                return i;
        }

        return -1;
    }
}
