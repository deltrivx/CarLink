package b1;

import android.view.View;
import c1.b0;
import c1.c0;
import java.util.LinkedHashMap;
import q2.j0;
import q2.w;
import r2.n0;
import s.d0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r1.o implements j, q2.k, q2.o, w {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0.k f1133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f1134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f1135q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b0 f1136r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f1137s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q f1138t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f1139u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1141w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f1143y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k f1144z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1140v = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d0 f1142x = new d0();

    public c(b0.k kVar, boolean z10, float f10, b0 b0Var, c0 c0Var) {
        this.f1133o = kVar;
        this.f1134p = z10;
        this.f1135q = f10;
        this.f1136r = b0Var;
        this.f1137s = c0Var;
    }

    public final void A0(b0.o oVar) {
        k kVar;
        if (!(oVar instanceof b0.m)) {
            if (oVar instanceof b0.n) {
                k kVar2 = this.f1144z;
                if (kVar2 != null) {
                    kVar2.d();
                    return;
                }
                return;
            }
            if (!(oVar instanceof b0.l) || (kVar = this.f1144z) == null) {
                return;
            }
            kVar.d();
            return;
        }
        b0.m mVar = (b0.m) oVar;
        long j5 = this.f1140v;
        float f10 = this.f1139u;
        i iVarI = this.f1143y;
        if (iVarI == null) {
            iVarI = g5.a.i(g5.a.j((View) q2.f.i(this, n0.f11347f)));
            this.f1143y = iVarI;
        }
        k kVarA = iVarI.a(this);
        int iM = k9.a.M(f10);
        long jA = this.f1136r.a();
        this.f1137s.invoke();
        kVarA.b(mVar, this.f1134p, j5, iM, jA, 0.1f, new a(1, this));
        this.f1144z = kVarA;
        q2.f.l(this);
    }

    @Override // b1.j
    public final void D() {
        this.f1144z = null;
        q2.f.l(this);
    }

    @Override // q2.o
    public final /* synthetic */ void H() {
    }

    @Override // q2.w
    public final /* synthetic */ void T(o2.w wVar) {
    }

    @Override // q2.w
    public final void n(long j5) {
        this.f1141w = true;
        n3.c cVar = q2.f.v(this).f10689x;
        this.f1140v = n3.n.M0(j5);
        float f10 = this.f1135q;
        this.f1139u = Float.isNaN(f10) ? h.a(cVar, this.f1134p, this.f1140v) : cVar.R(f10);
        d0 d0Var = this.f1142x;
        Object[] objArr = d0Var.f12407a;
        int i7 = d0Var.f12408b;
        for (int i10 = 0; i10 < i7; i10++) {
            A0((b0.o) objArr[i10]);
        }
        d0Var.c();
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    @Override // r1.o
    public final void q0() {
        cc.b0.s(m0(), null, new b0.g(this, (y8.c) null, 1), 3);
    }

    @Override // r1.o
    public final void s0() {
        i iVar = this.f1143y;
        if (iVar != null) {
            D();
            android.support.v4.media.session.r rVar = iVar.f1162d;
            k kVar = (k) ((LinkedHashMap) rVar.f604b).get(this);
            if (kVar != null) {
                kVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) rVar.f604b;
                k kVar2 = (k) linkedHashMap.get(this);
                if (kVar2 != null) {
                }
                linkedHashMap.remove(this);
                iVar.f1161c.add(kVar);
            }
        }
    }

    @Override // q2.o
    public final void x(j0 j0Var) {
        j0Var.b();
        q qVar = this.f1138t;
        if (qVar != null) {
            qVar.c(j0Var, this.f1139u, this.f1136r.a());
        }
        y1.o oVarZ = j0Var.f10720a.f16b.z();
        k kVar = this.f1144z;
        if (kVar != null) {
            long j5 = this.f1140v;
            int iM = k9.a.M(this.f1139u);
            long jA = this.f1136r.a();
            this.f1137s.invoke();
            kVar.e(j5, iM, jA, 0.1f);
            kVar.draw(y1.c.a(oVarZ));
        }
    }
}
