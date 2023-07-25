package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> result = new HashMap<>();
        if (sourceMap.size() > 0) {
            for (Map.Entry<Integer, String> item : sourceMap.entrySet()) {
                if (result.containsKey(item.getValue())) {
                    if (result.get(item.getValue()) > item.getKey())
                        result.put(item.getValue(), item.getKey());
                } else
                    result.put(item.getValue(), item.getKey());
            }
        }
        return result;
    }
}
