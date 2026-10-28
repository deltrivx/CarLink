package l8;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import c1.g1;
import f1.q1;
import f1.w0;
import f1.x2;
import r2.j1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h9.n f8209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h9.n f8211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h9.n f8212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h9.n f8213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h9.n f8214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h9.a f8215h;

    public l(long j5, h9.n nVar, int i7, h9.n nVar2, h9.n nVar3, h9.n nVar4, h9.n nVar5, h9.a aVar) {
        this.f8208a = j5;
        this.f8209b = nVar;
        this.f8210c = i7;
        this.f8211d = nVar2;
        this.f8212e = nVar3;
        this.f8213f = nVar4;
        this.f8214g = nVar5;
        this.f8215h = aVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        f1.s sVar = (f1.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            r1.h hVar = r1.c.f11096e;
            o2.m0 m0VarD = d0.m.d(hVar, false);
            long j5 = sVar.T;
            int i7 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
            r1.p pVarC = r1.a.c(sVar, r1.m.f11116a);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            q2.h hVar2 = q2.i.f10708e;
            f1.b.w(sVar, hVar2, m0VarD);
            q2.h hVar3 = q2.i.f10707d;
            f1.b.w(sVar, hVar3, q1VarL);
            q2.h hVar4 = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i7))) {
                ob.a.w(i7, sVar, i7, hVar4);
            }
            q2.h hVar5 = q2.i.f10706c;
            f1.b.w(sVar, hVar5, pVarC);
            n3.c cVar = (n3.c) sVar.j(j1.f11276h);
            DisplayMetrics displayMetrics = ((Resources) sVar.j(r2.n0.f11344c)).getDisplayMetrics();
            r1.p pVarD = androidx.compose.foundation.layout.c.d(androidx.compose.foundation.layout.c.l(0.0f, cVar.J(displayMetrics.widthPixels - 128), 1), 0.0f, cVar.J(displayMetrics.heightPixels - 128), 1);
            c1.m mVarE = g1.e(4, 62);
            x2 x2Var = c1.y.f2319a;
            sVar.W(-1680936624);
            x2 x2Var2 = c1.y.f2319a;
            c1.w wVar = (c1.w) sVar.j(x2Var2);
            long j10 = this.f8208a;
            long jA = c1.y.a(wVar, j10);
            long j11 = jA != 16 ? jA : ((y1.q) sVar.j(c1.a0.f1805a)).f14960a;
            sVar.p(false);
            long j12 = y1.q.f14958m;
            long jB = y1.q.b(0.38f, j11);
            c1.l lVarF = g1.f((c1.w) sVar.j(x2Var2));
            if (j10 == 16) {
                j10 = lVarF.f1974a;
            }
            long j13 = j10;
            if (j11 == 16) {
                j11 = lVarF.f1975b;
            }
            g1.b(pVarD, k0.e.a(g5.a.n(12, sVar)), new c1.l(j13, j11, j12 != 16 ? j12 : lVarF.f1976c, jB != 16 ? jB : lVarF.f1977d), mVarE, n1.h.e(-990002840, new k(this.f8209b, this.f8210c, this.f8211d, this.f8212e, this.f8213f, this.f8214g), sVar), sVar, 196608, 16);
            r1.p pVarA = androidx.compose.foundation.layout.b.f819a.a(androidx.compose.foundation.layout.c.f820a, r1.c.f11093b);
            o2.m0 m0VarD2 = d0.m.d(hVar, false);
            long j14 = sVar.T;
            int i10 = (int) (j14 ^ (j14 >>> 32));
            q1 q1VarL2 = sVar.l();
            r1.p pVarC2 = r1.a.c(sVar, pVarA);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar2, m0VarD2);
            f1.b.w(sVar, hVar3, q1VarL2);
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
                ob.a.w(i10, sVar, i10, hVar4);
            }
            f1.b.w(sVar, hVar5, pVarC2);
            e2.f fVarB = n3.l.f8745a;
            if (fVarB == null) {
                e2.e eVar = new e2.e("Filled.MoreHoriz", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i11 = e2.i0.f4202a;
                y1.n0 n0Var = new y1.n0(y1.q.f14948b);
                e2.g gVar = new e2.g();
                gVar.i(6.0f, 10.0f);
                gVar.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                gVar.j(0.9f, 2.0f, 2.0f, 2.0f);
                gVar.j(2.0f, -0.9f, 2.0f, -2.0f);
                gVar.j(-0.9f, -2.0f, -2.0f, -2.0f);
                gVar.c();
                gVar.i(18.0f, 10.0f);
                gVar.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                gVar.j(0.9f, 2.0f, 2.0f, 2.0f);
                gVar.j(2.0f, -0.9f, 2.0f, -2.0f);
                gVar.j(-0.9f, -2.0f, -2.0f, -2.0f);
                gVar.c();
                gVar.i(12.0f, 10.0f);
                gVar.d(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                gVar.j(0.9f, 2.0f, 2.0f, 2.0f);
                gVar.j(2.0f, -0.9f, 2.0f, -2.0f);
                gVar.j(-0.9f, -2.0f, -2.0f, -2.0f);
                gVar.c();
                e2.e.a(eVar, gVar.f4168a, n0Var);
                fVarB = eVar.b();
                n3.l.f8745a = fVarB;
            }
            long j15 = ((c1.w) sVar.j(x2Var2)).A;
            r1.p pVarH = androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.a.f(0.0f, g5.a.n(-8, sVar), 1), g5.a.n(32, sVar));
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = ob.a.m(sVar);
            }
            b0.k kVar = (b0.k) objK;
            sVar.p(false);
            sVar.W(5004770);
            h9.a aVar = this.f8215h;
            boolean zF = sVar.f(aVar);
            Object objK2 = sVar.K();
            if (zF || objK2 == w0Var) {
                objK2 = new a8.n(aVar, 29);
                sVar.h0(objK2);
            }
            sVar.p(false);
            c1.k0.b(fVarB, null, androidx.compose.foundation.a.c(pVarH, kVar, null, false, (h9.a) objK2, 28), j15, sVar, 48, 0);
            sVar.p(true);
            sVar.p(true);
        }
        return t8.z.f12851a;
    }
}
