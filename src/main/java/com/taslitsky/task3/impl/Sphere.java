package com.taslitsky.task3.impl;

import com.taslitsky.task3.Shape;

public class Sphere extends Shape {
  private double radius;

  public Sphere(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getVolume() {
    return 4 * Math.PI * Math.pow(radius, 2);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Sphere sphere = (Sphere) o;

    return Double.compare(sphere.radius, radius) == 0;
  }

  @Override
  public int hashCode() {
    long temp = Double.doubleToLongBits(radius);
    return (int) (temp ^ (temp >>> 32));
  }

  @Override
  public String toString() {
    return "Sphere{" +
        "radius=" + radius +
        '}';
  }
}
