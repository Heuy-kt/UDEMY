package com.company.practice.CollectionsP;

import java.util.HashMap;
import java.util.Map;

public class MapCode {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "An old language lots of idiots want to get rid of");
        languages.put("HTML", "A beautiful gen");

        languages.put("CSS", "not a language");
        languages.put("COBOL", "fucking old");

        languages.put("VB", "another crappy old language");
        languages.put("CSS", "Castigating Style sheets");

        boolean kee = languages.containsKey("Java");
//        System.out.println(kee);


        for(String key: languages.keySet()){
            System.out.println(key + ": " + languages.get(key));
        }

        System.out.println("===================================================");
        System.out.println(languages.remove("Java"));
    }
}
