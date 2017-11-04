package divideAndConquer;

/**
 * Created by PDeb on 11/3/2017.
 */
public class NumRotationsInCircularSortedArray {

    public static int findRotationCount(int a[], int n){
        int low = 0, high = a.length-1;
        while(low < high)
        {
            if(a[low]<=a[high])
                return low;

            int mid = (low + high) /2;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;

            if(a[prev] >= a[mid] && a[next]>= a[mid])
                return mid;
            else if(a[mid] <= a[high])
                high = mid-1;
            else if(a[low] <= a[mid])
                low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {8, 9, 10, 2, 5, 6};
        System.out.println(findRotationCount(a, a.length));
    }
}
