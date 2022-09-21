package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> set = new LinkedList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()){
            for (String dev : entry.getValue())
                if (dev.equals(developer))
                    set.add(entry.getKey());
        }

        Comparator<String> comp = (o1, o2) -> {
            if (o1.length() == o2.length()) return o2.compareTo(o1);
            else return Integer.compare(o2.length(), o1.length());
        };

        set.sort(comp);
        return set;
    }
}
