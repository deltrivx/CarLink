package i9;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements i, Serializable {
    private final int arity;

    public n(int i7) {
        this.arity = i7;
    }

    @Override // i9.i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strI = y.f6689a.i(this);
        l.d(strI, "renderLambdaToString(...)");
        return strI;
    }
}
