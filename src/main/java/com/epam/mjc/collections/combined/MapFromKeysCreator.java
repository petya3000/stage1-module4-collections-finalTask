package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet())
          result.put(entry.getKey().length(), new HashSet<>());
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()){
            Set<String> helper = result.get(entry.getKey().length());
            helper.add(entry.getKey());
            result.replace(entry.getKey().length(), helper);
        }
            return result;
    }
}
