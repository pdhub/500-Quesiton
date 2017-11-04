package dynamicProgramming;

/**
 * Created by PDeb on 11/4/2017.
 */
public class LCS {

    public int recursiveImplmentation(String firstString, String secondString, int firstStrLen, int secondStrLen){

        if(firstStrLen == 0 || secondStrLen ==0)
            return 0;

        if(firstString.charAt(firstStrLen-1) == secondString.charAt(secondStrLen-1))
            return recursiveImplmentation(firstString, secondString, firstStrLen-1, secondStrLen-1)+1;
        else
            return Math.max(recursiveImplmentation(firstString, secondString, firstStrLen-1, secondStrLen),
                            recursiveImplmentation(firstString, secondString, firstStrLen, secondStrLen-1));
    }
    /**Worst case in this above is O(2^(m+n)), when there are no subsequences and each recursive call will end up in two calls*/

    
}
