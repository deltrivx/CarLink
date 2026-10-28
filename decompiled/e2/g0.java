package e2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Iterator, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4169a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4170b;

    public g0(h0 h0Var) {
        this.f4170b = h0Var.f4183j.iterator();
    }

    public g0(Enumeration enumeration) {
        this.f4170b = enumeration;
    }

    public g0(k1.e eVar) {
        k1.n[] nVarArr = new k1.n[8];
        for (int i7 = 0; i7 < 8; i7++) {
            nVarArr[i7] = new k1.p(this);
        }
        this.f4170b = new k1.f(eVar, nVarArr);
    }

    public g0(Object[] objArr) {
        i9.l.e(objArr, "array");
        this.f4170b = i9.l.h(objArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4169a) {
            case 0:
                return ((Iterator) this.f4170b).hasNext();
            case 1:
                return ((k1.f) this.f4170b).f7154c;
            case 2:
                return ((Enumeration) this.f4170b).hasMoreElements();
            default:
                return ((i9.b) this.f4170b).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4169a) {
            case 0:
                return (j0) ((Iterator) this.f4170b).next();
            case 1:
                return (Map.Entry) ((k1.f) this.f4170b).next();
            case 2:
                return ((Enumeration) this.f4170b).nextElement();
            default:
                return ((i9.b) this.f4170b).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4169a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                ((k1.f) this.f4170b).remove();
                return;
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
