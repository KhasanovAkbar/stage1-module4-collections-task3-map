package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();

        if (!sentence.trim().equals("")) {
            String[] words = sentence.toLowerCase().trim().split(" ");
            List<String> inputWords = new ArrayList<>();
            for (String item:words){
                if (item.contains(".") || item.contains(",")){
                    inputWords.add(item.substring(0, item.length()-1));
                } else
                    inputWords.add(item);
            }
            for (String item : inputWords) {
                if (!item.equals("")) {
                    if (result.containsKey(item)) {
                        Integer value = result.get(item);
                        result.put(item, ++value);
                    } else
                        result.put(item, 1);
                }
            }
        }
        return result;

    }
}
