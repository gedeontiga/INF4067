package premier_support.singleton;

public final class OperationMathematique {
    private static OperationMathematique instance = null;
    private float a;
    private float b;
    private float c;

    private OperationMathematique(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private OperationMathematique(float a, float b) {
        this.a = a;
        this.b = b;
    }

    private OperationMathematique() {
        super();
    }

    public static OperationMathematique getInstance() {
        return instance = instance == null ? new OperationMathematique() : instance;
    }

    public static OperationMathematique getInstance(float a, float b) {
        return instance = instance == null ? new OperationMathematique(a, b) : instance;
    }

    public static OperationMathematique getInstance(float a, float b, float c) {
        return instance = instance == null ? new OperationMathematique(a, b, c) : instance;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    public float sum(float a, float b, float c) {
        return a + b + c;
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

    public void affiche() {
        System.out.print(
                "\nJe suis une instance mes valeurs sont : a = " + this.a + ", b = " + this.b + " et c = " + this.c);
    }
}