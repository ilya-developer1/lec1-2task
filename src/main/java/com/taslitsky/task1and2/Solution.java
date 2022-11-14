package com.taslitsky.task1and2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {
  public int[] getPositiveSortedArray(int[] arr) {
   return Arrays.stream(arr)
        .boxed()
        .filter(el -> el >= 0)
        .sorted(Collections.reverseOrder())
        .mapToInt(Integer::intValue)
        .toArray();
  }

  public Map<String, Integer> getTop5HashTags(List<String> strings) {
    Map<String, Integer> result = new HashMap<>();
    Set<String> hashtags = new HashSet<>();

    Pattern pattern = Pattern.compile("#.*? ");

    for (String string : strings) {
      Matcher matcher = pattern.matcher(string);
      while (matcher.find()) {
        hashtags.add(string.substring(matcher.start(), matcher.end()-1));
      }
      hashtags = hashtags.stream()
          .peek(str -> {
            if (result.containsKey(str)) {
              result.put(str, result.get(str) + 1);
            } else {
              result.put(str, 1);
            }
          })
          .collect(Collectors.toSet());

      hashtags.clear();
    }

    return result.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .limit(5)
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, HashMap::new));
  }
}
