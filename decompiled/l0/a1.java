package l0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.h f7591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b3.r0 f7592b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7595e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n3.c f7597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f3.d f7598h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b3.r f7600j;
    public n3.o k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7593c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7594d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7596f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f7599i = u8.w.f13122a;

    public a1(b3.h hVar, b3.r0 r0Var, boolean z10, n3.c cVar, f3.d dVar, int i7) {
        this.f7591a = hVar;
        this.f7592b = r0Var;
        this.f7595e = z10;
        this.f7597g = cVar;
        this.f7598h = dVar;
    }

    public final void a(n3.o oVar) {
        b3.r rVar = this.f7600j;
        if (rVar == null || oVar != this.k || rVar.a()) {
            this.k = oVar;
            rVar = new b3.r(this.f7591a, b3.g0.h(this.f7592b, oVar), this.f7599i, this.f7597g, this.f7598h);
        }
        this.f7600j = rVar;
    }
}
