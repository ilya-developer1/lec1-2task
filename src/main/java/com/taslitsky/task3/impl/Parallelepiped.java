package com.taslitsky.task3.impl;

import com.taslitsky.task3.Shape;

public class Parallelepiped extends Shape {
  private double length;
  private double width;
  private double height;

  public Parallelepiped(double length, double width, double height) {
    this.width = width;
    this.length = length;
    this.height = height;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Parallelepiped that = (Parallelepiped) o;

    if (Double.compare(that.length, length) != 0) {
      return false;
    }
    if (Double.compare(that.width, width) != 0) {
      return false;
    }
    return Double.compare(that.height, height) == 0;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(length);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(width);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(height);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public double getVolume() {
    return width * length * height;
  }

  @Override
  public String toString() {
    return "Parallelepiped{" +
        "length=" + length +
        ", width=" + width +
        ", height=" + height +
        '}';
  }
}
