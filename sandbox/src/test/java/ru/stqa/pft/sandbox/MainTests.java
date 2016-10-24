package ru.stqa.pft.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTests {

  @Test
  public void testArea () {
    Point p = new Point(0,0);
    Point k = new Point(3,4);
    Assert.assertEquals(Main.distance(p, k), 5.0);
  }
}
