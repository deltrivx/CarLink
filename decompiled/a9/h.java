package a9;

import i9.l;
import i9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g implements i9.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f307a;

    public h(int i7, y8.c cVar) {
        super(cVar);
        this.f307a = i7;
    }

    @Override // i9.i
    public final int getArity() {
        return this.f307a;
    }

    @Override // a9.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = y.f6689a.h(this);
        l.d(strH, "renderLambdaToString(...)");
        return strH;
    }
}
