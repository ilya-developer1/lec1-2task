package com.taslitsky.task3.impl;

import com.taslitsky.task3.Shape;

public class Cube extends Shape {
  private double length;

  public Cube(double length) {
    this.length = length;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public double getVolume() {
    return Math.pow(length, 3);
  }

  @Override
  public String toString() {
    return "Cube{" +
        "length=" + length +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Cube cube = (Cube) o;

    return Double.compare(cube.length, length) == 0;
  }

  @Override
  public int hashCode() {
    long temp = Double.doubleToLongBits(length);
    return (int) (temp ^ (temp >>> 32));
  }
}
