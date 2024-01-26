public class TestDriver {
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
    }

    public static void testCase1() {
        System.out.println("Test case 1: Empty Feed");
        Factorial.compute(new EmptyFeedStub());
        System.out.println("End of Test 1");
    }

    public static void testCase2() {
        System.out.println("Test case 2: Feed with One Value");
        Factorial.compute(new FeedOneValueStub());
        System.out.println("End of Test 2");
    }

    public static void testCase3() {
        System.out.println("Test case 3: Feed with Multiple Value");
        Factorial.compute(new FeedMultipleValuesStub());
        System.out.println("End of Test 3");
    }

    public static void testCase4() {
        System.out.println("Test case 4: Feed with Zero Value");
        Factorial.compute(new FeedWithZeroValue());
        System.out.println("End of Test 4");
    }

    public static void testCase5() {
        System.out.println("Test case 5: Feed with Negative Value");
        Factorial.compute(new FeedWithNegativeValues());
        System.out.println("End of Test 5");
    }
    
}

