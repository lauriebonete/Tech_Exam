/**
 * Created by Laurie on 31 May 2017.
 */
public class Triangle {

    public static int countStar(int rows) {
        if(rows==0){
            return 0;
        } else {
            return rows + countStar(rows - 1);
        }
    }
}
