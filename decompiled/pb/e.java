package pb;

import hc.s;
import java.util.Collection;
import java.util.List;
import t8.o;
import u8.w;
import x9.h0;
import x9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f10367a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa.e f10368b = wa.e.g("<Error module>");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f10369c = w.f13122a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f10370d = t8.a.d(d.f10366a);

    @Override // x9.y
    public final h0 F(wa.c cVar) {
        i9.l.e(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return null;
    }

    @Override // x9.y
    public final Object V(s sVar) {
        i9.l.e(sVar, "capability");
        return null;
    }

    @Override // x9.k, x9.b
    public final x9.k a() {
        return this;
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        return y9.g.f15129a;
    }

    @Override // x9.k
    public final wa.e getName() {
        return f10368b;
    }

    @Override // x9.y
    public final Collection h(wa.c cVar, h9.k kVar) {
        i9.l.e(cVar, "fqName");
        return w.f13122a;
    }

    @Override // x9.y
    public final u9.i k() {
        return (u9.i) f10370d.getValue();
    }

    @Override // x9.y
    public final List k0() {
        return f10369c;
    }

    @Override // x9.k
    public final x9.k l() {
        return null;
    }

    @Override // x9.y
    public final boolean r0(y yVar) {
        i9.l.e(yVar, "targetModule");
        return false;
    }
}
