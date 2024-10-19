package premier_support.singleton;

public final class ImmutableSum {
    private static ImmutableSum instance = null;
    private float a;
    private float b;
    private float c;

    private ImmutableSum(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private ImmutableSum(float a, float b) {
        this.a = a;
        this.b = b;
    }

    private ImmutableSum(float a) {
        this.a = a;
    }

    public static ImmutableSum getInstance(float a) {
        return instance = instance == null ? new ImmutableSum(a) : instance;
    }

    public static ImmutableSum getInstance(float a, float b) {
        return instance = instance == null ? new ImmutableSum(a, b) : instance;
    }

    public static ImmutableSum getInstance(float a, float b, float c) {
        return instance = instance == null ? new ImmutableSum(a, b, c) : instance;
    }

    public float sum() {
        if (this.b == 0.0f)
            return this.a;
        else if (this.c == 0.0f)
            return this.a + this.b;
        else
            return this.a + this.b + this.c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("This class cannot be cloned.");
    }
}