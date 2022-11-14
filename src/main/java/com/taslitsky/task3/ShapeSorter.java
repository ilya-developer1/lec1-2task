package com.taslitsky.task3;

import java.util.Comparator;
import java.util.List;

public class ShapeSorter {
  public static void sortByVolume(List<Shape> shapes) {
    shapes.sort(Comparator.comparingDouble(Shape::getVolume));
  }
}
