import java.util.HashMap;
import java.util.Map;

/**
 * Created by Laurie on 10 Sep 2017.
 */
public class WordMultiple {

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> returnMap = new HashMap<>();
        for(String string: strings){
            if(returnMap.containsKey(string)){
                returnMap.put(string, true);
            } else {
                returnMap.put(string, false);
            }
        }

        return returnMap;
    }
}
