/**
 * Created by Laurie on 31 May 2017.
 */
public class Sum {

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for(int x:nums){
            if(x==2){
                sum+=x;
            }
        }
        return sum==8;
    }

}
