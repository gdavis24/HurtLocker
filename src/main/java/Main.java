import org.apache.commons.io.IOUtils;
import java.io.IOException;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        String[] data = output.split("##");
        Parse parse = new Parse();
//        output = parse.parseData();
        int len1 = output.length();
        System.out.println(output);
        System.out.println(data);
    }
}
