package jpdictionary;
import java.util.HashMap;

public class DictionaryC {
    
HashMap < String, String> hMap;

public HashMap <String, String> addToDictionary(){
    hMap = new HashMap<>();
    hMap.put("eat", "በላ" );
    hMap.put("car", "mekina" );
    hMap.put("mountain", "terara" );
    hMap.put("river", "wonz" );

    
    return hMap;

}

}