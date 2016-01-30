package main.java.org.ipso.lbc.learning.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ϣ����� ������ 2016/01/21 19:06������ 1174751315@qq.com��<br>
 * ˵����
 */
public class Configuration {


    public static Configuration INSTANCE = new Configuration();




    private Map<String,String> properties = new HashMap<String, String>();
    private Configuration() {
        print("Initializing system configuration...");
    }

    private void print(String s){
        System.out.println(s);
    }
    public String getConfiguration(String key){
        String value = properties.get(key);
        if (value == null){
            value = "Invalid key";
        }
        return value;
    }
}
