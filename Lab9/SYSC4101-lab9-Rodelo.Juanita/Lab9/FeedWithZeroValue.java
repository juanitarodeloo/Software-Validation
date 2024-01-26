public class FeedWithZeroValue implements FeedOfIntValues{
    private int[] values = {0};
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
