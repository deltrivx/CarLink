package l1;

import i1.e;
import java.util.Iterator;
import u8.i;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7967d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1.c f7970c;

    static {
        m1.b bVar = m1.b.f8399a;
        f7967d = new b(bVar, bVar, k1.c.f7149c);
    }

    public b(Object obj, Object obj2, k1.c cVar) {
        this.f7968a = obj;
        this.f7969b = obj2;
        this.f7970c = cVar;
    }

    @Override // u8.a
    public final int c() {
        k1.c cVar = this.f7970c;
        cVar.getClass();
        return cVar.f7151b;
    }

    @Override // u8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f7970c.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f7968a, this.f7970c);
    }
}
