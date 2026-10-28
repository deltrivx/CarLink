package v0;

import l0.b1;
import o2.w;
import w0.a0;
import w0.b0;
import w0.d1;
import w0.f0;
import w0.f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13539a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13540b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f13541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f13542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13543e;

    public i(g gVar, d1 d1Var, long j5) {
        this.f13541c = gVar;
        this.f13542d = d1Var;
        this.f13543e = j5;
    }

    @Override // l0.b1
    public final void a(long j5) {
        w wVar = (w) this.f13541c.invoke();
        d1 d1Var = this.f13542d;
        if (wVar != null) {
            if (!wVar.isAttached()) {
                return;
            }
            a0 a0Var = b0.f13738e;
            j3.c cVar = d1Var.f13767f;
            if (cVar != null) {
                cVar.a(Boolean.TRUE, wVar, new x1.b(j5), a0Var);
            }
            this.f13539a = j5;
        }
        if (f1.a(d1Var, this.f13543e)) {
            this.f13540b = 0L;
        }
    }

    @Override // l0.b1
    public final void b() {
        f0 f0Var;
        long j5 = this.f13543e;
        d1 d1Var = this.f13542d;
        if (!f1.a(d1Var, j5) || (f0Var = d1Var.f13769h) == null) {
            return;
        }
        f0Var.invoke();
    }

    @Override // l0.b1
    public final void c() {
    }

    @Override // l0.b1
    public final void d() {
    }

    @Override // l0.b1
    public final void e(long j5) {
        w wVar = (w) this.f13541c.invoke();
        if (wVar == null || !wVar.isAttached()) {
            return;
        }
        d1 d1Var = this.f13542d;
        if (f1.a(d1Var, this.f13543e)) {
            long jH = x1.b.h(this.f13540b, j5);
            this.f13540b = jH;
            long jH2 = x1.b.h(this.f13539a, jH);
            if (d1Var.b(wVar, jH2, this.f13539a, b0.f13738e, true)) {
                this.f13539a = jH2;
                this.f13540b = 0L;
            }
        }
    }

    @Override // l0.b1
    public final void onCancel() {
        f0 f0Var;
        long j5 = this.f13543e;
        d1 d1Var = this.f13542d;
        if (!f1.a(d1Var, j5) || (f0Var = d1Var.f13769h) == null) {
            return;
        }
        f0Var.invoke();
    }
}
