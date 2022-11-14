package com.taslitsky.task3.impl;

import com.taslitsky.task3.Shape;

public class Cylinder extends Shape {
  private double radius;
  private double height;

  public Cylinder(double radius, double height) {
    this.radius = radius;
    this.height = height;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getVolume() {
    return Math.PI * Math.pow(radius, 2) * height;
  }

  @Override
  public String toString() {
    return "Cylinder{" +
        "radius=" + radius +
        ", height=" + height +
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

    Cylinder cylinder = (Cylinder) o;

    if (Double.compare(cylinder.radius, radius) != 0) {
      return false;
    }
    return Double.compare(cylinder.height, height) == 0;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(radius);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(height);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }
}
