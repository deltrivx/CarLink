package qc;

import java.util.Map;
import pc.e0;
import pc.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w implements mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f11056a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f11057b = v.f11053b;

    @Override // mc.a
    public final void a(rc.s sVar, Object obj) {
        u uVar = (u) obj;
        i9.l.e(uVar, "value");
        n3.u.h(sVar);
        x0 x0Var = x0.f10518a;
        l lVar = l.f11043a;
        new e0().a(sVar, uVar);
    }

    @Override // mc.a
    public final Object c(oc.b bVar) {
        n3.u.k(bVar);
        x0 x0Var = x0.f10518a;
        l lVar = l.f11043a;
        return new u((Map) new e0().c(bVar));
    }

    @Override // mc.a
    public final nc.e d() {
        return f11057b;
    }
}
