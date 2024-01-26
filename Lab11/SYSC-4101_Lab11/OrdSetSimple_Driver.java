
public class OrdSetSimple_Driver {

  public static void main(String argv[]) {

    TestCase1();

    // add other calls to test case methods here

  }

  public static void TestCase1() {
    // OrdSetSimple s1, s2, s3;

    // s1 = new OrdSetSimple(3); // Creating a set of maximum size 3.
    // System.out.println("s1 = "+s1);

    // s2 = new OrdSetSimple(2);
    // s2.addElement(1);
    // s2.addElement(4);
    // System.out.println("s2 = "+s2);

    // s3 = s1.difference(s2);
    // System.out.println("s3 = s1 - s2 = "+s3);
    OrdSetSimple s1 = new OrdSetSimple(5);
    OrdSetSimple s2 = new OrdSetSimple(5);
    s1.addElement(1);
    s1.addElement(2);
    s2.addElement(2);
    s2.addElement(3);
    System.out.println("s1 = "+s1);
    System.out.println("s2 = "+s2);
    OrdSetSimple result = s1.difference(s2);
    System.out.println("result = s1 - s2 = "+ result);

  }

  // Add other methods defining tests here.
}





 


