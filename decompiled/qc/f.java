package qc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f11040a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f11041b = e.f11037b;

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        d dVar = (d) obj;
        i9.l.e(dVar, "value");
        n3.u.h(sVar);
        new pc.c(l.f11043a).a(sVar, dVar);
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        n3.u.k(bVar);
        return new d((List) new pc.c(l.f11043a).c(bVar));
    }

    @Override // mc.a
    public final nc.e d() {
        return f11041b;
    }
}
