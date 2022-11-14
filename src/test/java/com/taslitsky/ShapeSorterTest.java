package com.taslitsky;

import com.taslitsky.task3.impl.Cylinder;
import com.taslitsky.task3.impl.Parallelepiped;
import com.taslitsky.task3.impl.Sphere;
import com.taslitsky.task3.impl.Cube;

import com.taslitsky.task3.Shape;
import com.taslitsky.task3.ShapeSorter;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeSorterTest {

  @Test
  void sortByVolumeTest() {
    //  GIVEN
    List<Shape> tested = new ArrayList<>();
    Collections.addAll(tested,
        new Cylinder(5, 10),
        new Sphere(4),
        new Cube(2),
        new Parallelepiped(2,3,4));

    List<Shape> expected = new ArrayList<>();
    Collections.addAll(expected,
        new Cube(2),
        new Parallelepiped(2,3,4),
        new Sphere(4),
        new Cylinder(5, 10));


    // WHEN
    ShapeSorter.sortByVolume(tested);

    // THEN
    Assertions.assertEquals(expected, tested);
  }
}