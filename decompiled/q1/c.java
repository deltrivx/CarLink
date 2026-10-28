package q1;

import f1.s;
import g1.k0;
import h9.n;
import java.util.List;
import n3.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k0, y8.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n4.e f10579b = new n4.e(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f10580a;

    public c(s sVar) {
        this.f10580a = sVar;
    }

    @Override // g1.k0
    public final List U(Integer num) {
        return this.f10580a.D();
    }

    @Override // y8.f
    public final y8.g getKey() {
        return f10579b;
    }

    @Override // y8.h
    public final y8.h h(y8.g gVar) {
        return u.F(this, gVar);
    }

    @Override // y8.h
    public final y8.f l(y8.g gVar) {
        return u.A(this, gVar);
    }

    @Override // y8.h
    public final Object q(n nVar, Object obj) {
        return nVar.invoke(obj, this);
    }

    @Override // y8.h
    public final y8.h s(y8.h hVar) {
        return u.G(this, hVar);
    }
}
