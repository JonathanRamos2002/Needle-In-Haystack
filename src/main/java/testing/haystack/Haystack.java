package testing.haystack;

public class Haystack{
    private int [] haystack;

    public Haystack(int[] haystack) {
        this.haystack = haystack;
    }

    // A needle in the haystack is represented by the int 1
    public boolean findNeedle()
    {
        for(int item : haystack)
        {
            if(item == 1)
                return true;
        }

        return false;
    }

}
