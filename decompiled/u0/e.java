package u0;

import b3.g0;
import b3.q0;
import g3.c0;
import g3.d0;
import g3.w;
import l0.s;
import l0.u0;
import o9.u;
import q2.y1;
import t8.z;
import w0.t1;
import y2.r;
import y2.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q2.m implements y1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d0 f12975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w f12976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u0 f12977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g3.q f12979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t1 f12980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g3.k f12981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public w1.o f12982x;

    public static void D0(u0 u0Var, String str, boolean z10) {
        if (z10) {
            c0 c0Var = u0Var.f7852e;
            s sVar = u0Var.f7868v;
            if (c0Var == null) {
                int length = str.length();
                sVar.invoke(new w(str, g0.b(length, length), 4));
            } else {
                w wVarP = u0Var.f7851d.p(n3.l.J(new g3.d(), new g3.a(1, str)));
                c0Var.a(null, wVarP);
                sVar.invoke(wVarP);
            }
        }
    }

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
        b3.h hVar = this.f12976r.f5889a;
        u[] uVarArr = t.f15077a;
        y2.u uVar = r.D;
        u[] uVarArr2 = t.f15077a;
        u uVar2 = uVarArr2[17];
        uVar.a(jVar, hVar);
        b3.h hVar2 = this.f12975q.f5852a;
        y2.u uVar3 = r.E;
        u uVar4 = uVarArr2[18];
        uVar3.a(jVar, hVar2);
        long j5 = this.f12976r.f5890b;
        y2.u uVar5 = r.F;
        u uVar6 = uVarArr2[19];
        uVar5.a(jVar, new q0(j5));
        y2.u uVar7 = r.f15066r;
        u uVar8 = uVarArr2[9];
        uVar7.a(jVar, s1.m.f12552a);
        jVar.n(y2.i.f14992g, new y2.a(null, new d(this, 0)));
        if (!this.f12978t) {
            jVar.n(r.f15058i, z.f12851a);
        }
        boolean z10 = this.f12978t;
        y2.u uVar9 = r.M;
        u uVar10 = uVarArr2[25];
        uVar9.a(jVar, Boolean.valueOf(z10));
        t.a(jVar, new d(this, 1));
        int i7 = 2;
        if (z10) {
            jVar.n(y2.i.f14995j, new y2.a(null, new d(this, i7)));
            jVar.n(y2.i.f14998n, new y2.a(null, new d(this, jVar)));
        }
        jVar.n(y2.i.f14994i, new y2.a(null, new cc.k(4, this)));
        int i10 = this.f12981w.f5870e;
        c cVar = new c(this, 6);
        jVar.n(r.G, new g3.j(i10));
        jVar.n(y2.i.f14999o, new y2.a(null, cVar));
        jVar.n(y2.i.f14987b, new y2.a(null, new c(this, 7)));
        jVar.n(y2.i.f14988c, new y2.a(null, new c(this, 1)));
        if (!q0.c(this.f12976r.f5890b)) {
            jVar.n(y2.i.f15000p, new y2.a(null, new c(this, 2)));
            if (this.f12978t) {
                jVar.n(y2.i.f15001q, new y2.a(null, new c(this, 3)));
            }
        }
        if (this.f12978t) {
            jVar.n(y2.i.f15002r, new y2.a(null, new c(this, 5)));
        }
    }

    @Override // q2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // q2.y1
    public final boolean j0() {
        return true;
    }
}
