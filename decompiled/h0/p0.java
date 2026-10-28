package h0;

import q2.y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends r1.o implements y1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h9.a f6349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l0 f6350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z.x0 f6351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y2.h f6353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m0 f6354t = new m0(this, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public m0 f6355u;

    public p0(h9.a aVar, l0 l0Var, z.x0 x0Var, boolean z10) {
        this.f6349o = aVar;
        this.f6350p = l0Var;
        this.f6351q = x0Var;
        this.f6352r = z10;
        A0();
    }

    public final void A0() {
        this.f6353s = new y2.h(new n0(this, 0), new n0(this, 1));
        this.f6355u = this.f6352r ? new m0(this, 1) : null;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
        o9.u[] uVarArr = y2.t.f15077a;
        y2.u uVar = y2.r.f15061m;
        o9.u[] uVarArr2 = y2.t.f15077a;
        o9.u uVar2 = uVarArr2[6];
        uVar.a(jVar, Boolean.TRUE);
        jVar.n(y2.r.L, this.f6354t);
        if (this.f6351q == z.x0.f15591a) {
            y2.h hVar = this.f6353s;
            if (hVar == null) {
                i9.l.j("scrollAxisRange");
                throw null;
            }
            y2.u uVar3 = y2.r.f15069u;
            o9.u uVar4 = uVarArr2[12];
            uVar3.a(jVar, hVar);
        } else {
            y2.h hVar2 = this.f6353s;
            if (hVar2 == null) {
                i9.l.j("scrollAxisRange");
                throw null;
            }
            y2.u uVar5 = y2.r.f15068t;
            o9.u uVar6 = uVarArr2[11];
            uVar5.a(jVar, hVar2);
        }
        m0 m0Var = this.f6355u;
        if (m0Var != null) {
            jVar.n(y2.i.f14991f, new y2.a(null, m0Var));
        }
        jVar.n(y2.i.B, new y2.a(null, new b2.a(24, new n0(this, 2))));
        y2.b bVarF = this.f6350p.f();
        y2.u uVar7 = y2.r.f15055f;
        o9.u uVar8 = uVarArr2[22];
        uVar7.a(jVar, bVarF);
    }

    @Override // q2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }
}
