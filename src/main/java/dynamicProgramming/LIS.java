package dynamicProgramming;

/**
 * Created by PDeb on 11/13/2017.
 */
public class LIS {

    public int LIS(int a[]){
        int L[] = new int[a.length];
        L[0] = 1;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j] && L[i] < L[j])
                    L[i] = L[j];//include j
            }
            L[i]++;
        }

        int maxLen = 0;
        for (int i = 0; i < L.length; i++) {
            if(maxLen < L[i])
                maxLen = L[i];
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int a[] = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        int max = new LIS().LIS(a);
        System.out.println(max);
    }
}
