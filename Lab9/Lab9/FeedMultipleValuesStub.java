public class FeedMultipleValuesStub implements FeedOfIntValues {
    private int[] values = {1, 5, 10};
    private int currIndex = 0;

    @Override
    public boolean hasNext() {
        return currIndex < values.length;
    }

    @Override
    public int getNextIntValue() {
        return values[currIndex++];
    }
    
}
