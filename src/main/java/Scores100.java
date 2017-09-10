/**
 * Created by Laurie on 10 Sep 2017.
 */
public class Scores100 {

    public static boolean scores100(int[] scores) {
        for(int i=0; i<= scores.length-1; i++){
            if(scores[i] == 100 && (i+1) <= scores.length-1 && scores[i+1]==100){
                return true;
            }
        }
        return false;
    }

}
