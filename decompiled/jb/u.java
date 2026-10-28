package jb;

import aa.f0;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ra.k f7078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f7079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wa.b f7080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ra.j f7081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7082h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ra.k kVar, ta.f fVar, f0 f0Var, n0 n0Var, u uVar) {
        super(fVar, f0Var, n0Var);
        i9.l.e(kVar, "classProto");
        i9.l.e(fVar, "nameResolver");
        this.f7078d = kVar;
        this.f7079e = uVar;
        this.f7080f = i2.c.D(fVar, kVar.f12040e);
        ra.j jVar = (ra.j) ta.d.f12865f.i(kVar.f12039d);
        this.f7081g = jVar == null ? ra.j.CLASS : jVar;
        this.f7082h = ta.d.f12866g.i(kVar.f12039d).booleanValue();
        ta.d.f12867h.getClass();
    }

    @Override // jb.w
    public final wa.c a() {
        return this.f7080f.a();
    }
}
