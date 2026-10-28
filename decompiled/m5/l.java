package m5;

import a8.y1;
import cc.y;
import f1.g1;
import f1.h1;
import f1.k1;
import fc.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f8482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8483b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f8484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f8485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f8486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1 f8487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f8488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g1 f8489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g1 f8490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f8491j;
    public final k1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f8492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f7.q f8493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k1 f8494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f8497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h0 f8498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y1 f8499s;

    public l(y yVar) {
        this.f8482a = yVar;
        k1 k1VarS = f1.b.s(new x1.b(0L));
        this.f8484c = k1VarS;
        this.f8485d = k1VarS;
        long j5 = y1.q.f14957l;
        k1 k1VarS2 = f1.b.s(new y1.q(j5));
        this.f8486e = k1VarS2;
        this.f8487f = k1VarS2;
        this.f8488g = f1.b.s(new y1.q(j5));
        this.f8489h = new g1(1.0f);
        this.f8490i = new g1(1.0f);
        this.f8491j = fc.y.b(null);
        this.k = f1.b.s(null);
        this.f8492l = 12;
        f7.q qVarH = y1.h0.h();
        qVarH.k(y1.q.f14951e);
        this.f8493m = qVarH;
        this.f8494n = f1.b.s(Boolean.TRUE);
        this.f8497q = new h1(0);
        this.f8498r = fc.y.b(null);
    }

    public final void a(boolean z10) {
        long j5 = ((y1.q) this.f8486e.getValue()).f14960a;
        float f10 = 255;
        int iD = (int) (y1.q.d(j5) * f10);
        int iH = (int) (y1.q.h(j5) * f10);
        int iG = (int) (y1.q.g(j5) * f10);
        int iE = (int) (y1.q.e(j5) * f10);
        k kVar = new k(j5, g5.a.k(iD) + g5.a.k(iH) + g5.a.k(iG) + g5.a.k(iE), z10);
        h0 h0Var = this.f8498r;
        h0Var.getClass();
        h0Var.j(null, kVar);
    }

    public final void b(long j5, boolean z10) {
        y1 y1Var = this.f8499s;
        if (!((Boolean) this.f8494n.getValue()).booleanValue() || y1Var == null) {
            return;
        }
        t8.j jVar = (t8.j) y1Var.invoke(new x1.b(j5));
        long j10 = ((y1.q) jVar.f12830a).f14960a;
        this.f8484c.setValue(new x1.b(((x1.b) jVar.f12831b).f14521a));
        k1 k1Var = this.f8488g;
        if (y1.q.c(((y1.q) k1Var.getValue()).f14960a, j10)) {
            return;
        }
        t8.p pVarP0 = g5.a.p0(j10);
        float fFloatValue = ((Number) pVarP0.f12839a).floatValue();
        float fFloatValue2 = ((Number) pVarP0.f12840b).floatValue();
        float fFloatValue3 = ((Number) pVarP0.f12841c).floatValue();
        if (this.f8496p) {
            fFloatValue3 = ((Number) this.f8490i.getValue()).floatValue();
        }
        this.f8486e.setValue(new y1.q(n4.e.i(fFloatValue, fFloatValue2, fFloatValue3, this.f8495o ? ((Number) this.f8489h.getValue()).floatValue() : 1.0f, 16)));
        k1Var.setValue(new y1.q(j10));
        a(z10);
    }
}
