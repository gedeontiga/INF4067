
public final class Singleton {
    private static Singleton instance;
    private float a;
    private float b;
    private float c;

    private Singleton(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private Singleton(float a, float b) {
        this.a = a;
        this.b = b;
    }

    private Singleton(float a) {
        this.a = a;
    }

    public static Singleton getInstance(float a) {
        return instance = instance == null ? new Singleton(a) : instance;
    }

    public static Singleton getInstance(float a, float b) {
        return instance = instance == null ? new Singleton(a, b) : instance;
    }

    public static Singleton getInstance(float a, float b, float c) {
        return instance = instance == null ? new Singleton(a, b, c) : instance;
    }

    public float sum() {
        return this.b == 0.0f ? this.a : this.c == 0.0f ? this.a + this.b : this.a + this.b + this.c;
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
        throw new CloneNotSupportedException();
    }
}