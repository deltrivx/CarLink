package o2;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f9306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.k f9307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f9308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f9309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h9.k f9310g;

    public c0(int i7, int i10, Map map, h9.k kVar, d0 d0Var, i0 i0Var, h9.k kVar2) {
        this.f9304a = i7;
        this.f9305b = i10;
        this.f9306c = map;
        this.f9307d = kVar;
        this.f9308e = d0Var;
        this.f9309f = i0Var;
        this.f9310g = kVar2;
    }

    @Override // o2.n0
    public final Map b() {
        return this.f9306c;
    }

    @Override // o2.n0
    public final void c() {
        q2.s sVar;
        q2.h0 h0Var = this.f9309f.f9341a;
        boolean zQ = this.f9308e.Q();
        h9.k kVar = this.f9310g;
        if (!zQ || (sVar = h0Var.E.f10614c.P) == null) {
            kVar.invoke(h0Var.E.f10614c.f10773l);
        } else {
            kVar.invoke(sVar.f10773l);
        }
    }

    @Override // o2.n0
    public final h9.k d() {
        return this.f9307d;
    }

    @Override // o2.n0
    public final int getHeight() {
        return this.f9305b;
    }

    @Override // o2.n0
    public final int getWidth() {
        return this.f9304a;
    }
}
