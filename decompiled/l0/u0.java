package l0;

import f1.w1;
import r2.n2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public final f1.k1 A;
    public final f1.k1 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1 f7848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f7849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n2 f7850c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.support.v4.media.session.r f7851d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g3.c0 f7852e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f1.k1 f7853f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f1.k1 f7854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o2.w f7855h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f1.k1 f7856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b3.h f7857j;
    public final f1.k1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f1.k1 f7858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f1.k1 f7859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f1.k1 f7860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f1.k1 f7861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f1.k1 f7863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a2.b f7864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f1.k1 f7865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f1.k1 f7866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public h9.k f7867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f7868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s f7869w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f7870x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f7.q f7871y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f7872z;

    public u0(a1 a1Var, w1 w1Var, n2 n2Var) {
        this.f7848a = a1Var;
        this.f7849b = w1Var;
        this.f7850c = n2Var;
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(9, false);
        b3.h hVar = b3.i.f1371a;
        long j5 = b3.q0.f1428b;
        g3.w wVar = new g3.w(hVar, j5, (b3.q0) null);
        rVar.f604b = wVar;
        rVar.f605c = new g3.h(hVar, wVar.f5890b);
        this.f7851d = rVar;
        Boolean bool = Boolean.FALSE;
        this.f7853f = f1.b.s(bool);
        this.f7854g = f1.b.s(new n3.f(0));
        this.f7856i = f1.b.s(null);
        this.k = f1.b.s(i0.f7678a);
        this.f7858l = f1.b.s(bool);
        this.f7859m = f1.b.s(bool);
        this.f7860n = f1.b.s(bool);
        this.f7861o = f1.b.s(bool);
        this.f7862p = true;
        this.f7863q = f1.b.s(Boolean.TRUE);
        this.f7864r = new a2.b(n2Var);
        this.f7865s = f1.b.s(bool);
        this.f7866t = f1.b.s(bool);
        this.f7867u = new t0(0);
        this.f7868v = new s(this, 1);
        this.f7869w = new s(this, 2);
        this.f7870x = new s(this, 3);
        this.f7871y = y1.h0.h();
        this.f7872z = y1.q.f14958m;
        this.A = f1.b.s(new b3.q0(j5));
        this.B = f1.b.s(new b3.q0(j5));
    }

    public final i0 a() {
        return (i0) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f7853f.getValue()).booleanValue();
    }

    public final o2.w c() {
        o2.w wVar = this.f7855h;
        if (wVar == null || !wVar.isAttached()) {
            return null;
        }
        return wVar;
    }

    public final s1 d() {
        return (s1) this.f7856i.getValue();
    }

    public final void e(long j5) {
        this.B.setValue(new b3.q0(j5));
    }

    public final void f(long j5) {
        this.A.setValue(new b3.q0(j5));
    }
}
