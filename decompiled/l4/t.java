package l4;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f8041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f8042b;

    public t(int i7) {
        this.f8041a = new SparseArray(i7);
    }

    public final void a(w wVar, int i7, int i10) {
        int iA = wVar.a(i7);
        SparseArray sparseArray = this.f8041a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(iA);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(wVar.a(i7), tVar);
        }
        if (i10 > i7) {
            tVar.a(wVar, i7 + 1, i10);
        } else {
            tVar.f8042b = wVar;
        }
    }
}
