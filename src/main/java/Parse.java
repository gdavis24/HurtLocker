import java.util.HashMap;
import java.util.Map;

public class Parse {
    Map<String, String> itemsMap = new HashMap<String, String>();
    //key: name. Value: milk...
    Map<String, Integer> priceMap = new HashMap<String, Integer>();
    //key: milk. Value: price #...

    public String[] parseData(String input){
        String[] data = input.split("##");
//        Main main = new Main();

        for (int i = 0; i < data.length; i++) {
            String[] items = data[i].split("[^a-zA-Z0-9:./ ]");
            itemsMap.put(items[0], items[1]);
        }
        return data;
    }

}
