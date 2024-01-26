import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OrdSetSimple_Driver {

  public static void main(String argv[]) {

    OrdSetSimple_Driver o = new OrdSetSimple_Driver();
    o.TestCase2();
    o.TestCase3();

  }

  /**
   * This test case catches fault 1, 2, 3, 4, 10, 11, 12, 13, 14, 15, 16, 17, 18
   */
  @Test
  public void TestCase1() {
    System.out.println("Test Case 1:");
    OrdSetSimple s1 = new OrdSetSimple(5);
    OrdSetSimple s2 = new OrdSetSimple(5);
    s1.addElement(1);
    s1.addElement(2);
    s2.addElement(2);
    s2.addElement(3);
    System.out.println("s1 = "+s1);
    System.out.println("s2 = "+s2);
    OrdSetSimple result = s1.difference(s2);
    OrdSetSimple expected_result = new OrdSetSimple(5);
    expected_result.addElement(1);
    System.out.println("expected result = s1 - s2 = "+ expected_result);
    System.out.println("result = s1 - s2 = "+ result);
    assertTrue(result.equals(expected_result)); 
    System.out.println("--------------------------\n");
  }

  /**
   * This test case catches fault 5, assert still passed so I removed the @Test tag
   * but the print statements show a message that catches this fault
   * This test case also catches fault 6
   * This test case also catches fault 16
   */
  public void TestCase2() {
    System.out.println("Test Case 2:");
    OrdSetSimple s1 = new OrdSetSimple(3);
    OrdSetSimple s2 = new OrdSetSimple(3);
    s1.addElement(1);
    s1.addElement(2);
    s1.addElement(3);

    s2.addElement(2);
    s2.addElement(3);

    System.out.println("s1 = "+s1);
    System.out.println("s2 = "+s2);
    OrdSetSimple result = s1.difference(s2);

    OrdSetSimple expected_result = new OrdSetSimple(5);
    expected_result.addElement(1);
    System.out.println("expected result = s1 - s2 = "+ expected_result);
    System.out.println("result = s1 - s2 = "+ result);
    //assertTrue(result.equals(expected_result)); 
    System.out.println("--------------------------\n");
  }


  /**
   * This test case catches fault 8, 9, messages appear that should not
   * This test case also catches fault 16
   * This test case also catches fault 18
   */
  public void TestCase3() {
    System.out.println("Test Case 3:");
    OrdSetSimple s1 = new OrdSetSimple(3);
    OrdSetSimple s2 = new OrdSetSimple(3);
    s1.addElement(1);
    s1.addElement(2);
    //s1.addElement(3);

    s2.addElement(2);
    s2.addElement(3);
    s2.addElement(4);


    System.out.println("s1 = "+s1);
    System.out.println("s2 = "+s2);
    OrdSetSimple result = s1.difference(s2);

    OrdSetSimple expected_result = new OrdSetSimple(5);
    expected_result.addElement(1);
    System.out.println("expected result = s1 - s2 = "+ expected_result);
    System.out.println("result = s1 - s2 = "+ result);
    //assertTrue(result.equals(expected_result)); 
    System.out.println("--------------------------\n");
  }

  /**
   * In conclusion, I noticed that I was not able to create a test case that picked up on fault #7
   * because of the fact that chaning s1.getSize() to this.getSize() is not incorrect since s1 is assigned to 
   * this earlier in the code. Also for fault #19 I was not able to create a test case that picked this up because
   * it does not seem to be a fault. The original code seems to be incorrect in that it creates the new set
   * with the size of s2 but it should be s1 since the different() should be taking s1 and removing the elements
   * that are in s2 or the passed set. This means the new set should by default start with the size of s1.
   * Overrall, I realize that there is no need to create a test case for every single fault found, it is sufficient to keep
   * re-use test cases if it means that it can pick up on multiple faults.
   */
  

}







 


