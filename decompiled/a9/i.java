package a9;

import i9.l;
import i9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends c implements i9.i {
    private final int arity;

    public i(int i7, y8.c cVar) {
        super(cVar);
        this.arity = i7;
    }

    @Override // i9.i
    public int getArity() {
        return this.arity;
    }

    @Override // a9.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = y.f6689a.h(this);
        l.d(strH, "renderLambdaToString(...)");
        return strH;
    }
}
