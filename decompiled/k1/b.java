package k1;

import e2.g0;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements j9.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f7147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7148e;

    public b(g0 g0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f7147d = g0Var;
        this.f7148e = obj2;
    }

    @Override // k1.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f7148e;
    }

    @Override // k1.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f7148e;
        this.f7148e = obj;
        f fVar = (f) this.f7147d.f4170b;
        e eVar = fVar.f7161d;
        Object obj3 = this.f7145b;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z10 = fVar.f7154c;
        if (!z10) {
            eVar.put(obj3, obj);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            n nVar = fVar.f7152a[fVar.f7153b];
            Object obj4 = nVar.f7177a[nVar.f7179c];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f7157c, obj4, 0);
        }
        fVar.f7164g = eVar.f7159e;
        return obj2;
    }
}
