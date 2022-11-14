package com.taslitsky;

import com.taslitsky.task1and2.Solution;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1and2Test {
  private Solution solution = new Solution();

  @Test
  public void getPositiveArrayTest() {
    // GIVEN
    int[] tested = new int[]{1, 4, 0, -4, -84, 1, -4, 98, 432, 543, 40, -30, -29, 0};
    int[] expected = new int[]{543, 432, 98, 40, 4, 1, 1, 0, 0};

    // WHEN
    int[] actual = solution.getPositiveSortedArray(tested);

    // THEN
    Assertions.assertArrayEquals(expected, actual);
  }

  @Test
  public void getTop5HashtagsTest() {
    // GIVEN
    List<String> tested = new ArrayList<>();
    tested.add("Привет меня зовут #Анатолий и я не #неудачник!. Ну как то так #получается. Хэллоу");
    tested.add("Привет меня зовут #Анатолий и я не #неудачник!. Ну как то так #получается. Хэллоу");
    tested.add("Привет меня зовут #Виталий и я не #неудачник!. Ну как то так #кажется. Хэллоу");
    tested.add("Привет меня #Виталий #Виталий #Виталий зовут #Виталий и я не #неудачник!. Ну как то так #кажется. Хэллоу");
    tested.add("Привет меня зовут #Виталий и я не #неудачник!. Ну как то так #получается. Хэллоу");
    tested.add("Привет меня зовут #Генадий и я не #неудачник!. Ну как то так #видится. Хэллоу");
    tested.add("Привет меня  #Генадий  #Генадий зовут #Генадий и я не #неудачник!. Ну как то так #видится. Хэллоу");
    tested.add("Привет меня зовут #Анатолий и я не #неудачник!. Ну как то так #видится. Хэллоу");
    tested.add("Привет меня зовут #Анатолий и я не #Генадий!. Ну как то так #видится. Хэллоу");
    tested.add("Привет меня зовут #Анатолий и я не #неудачник!. Ну как то так #получается. Хэллоу");
    tested.add("Привет меня зовут #Анатолий и я не #Генадий!. Ну как то так #видится. Хэллоу");
    tested.add("Привет меня зовут #Анатолий и я не #неудачник!. Ну как то так #получается. Хэллоу");

    Map<String, Integer> expected = new HashMap<>();
    expected.put("#неудачник!.", 10);
    expected.put("#Анатолий", 7);
    expected.put("#получается.", 5);
    expected.put("#Виталий", 3);
    expected.put("#видится.", 5);

    // WHEN
    Map<String, Integer> actual = solution.getTop5HashTags(tested);

    // THEN
    Assertions.assertEquals(expected, actual);
  }

}
