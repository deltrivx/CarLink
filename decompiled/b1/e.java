package b1;

import android.view.View;
import android.view.ViewGroup;
import f1.b1;
import f1.s;
import x.n0;
import x.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b1 f1148c;

    public e(boolean z10, float f10, b1 b1Var) {
        this.f1146a = z10;
        this.f1147b = f10;
        this.f1148c = b1Var;
    }

    @Override // x.n0
    public final o0 b(b0.k kVar, s sVar) {
        long jB;
        sVar.W(988743187);
        m mVar = (m) sVar.j(o.f1173a);
        b1 b1Var = this.f1148c;
        if (((y1.q) b1Var.getValue()).f14960a != 16) {
            sVar.W(-303557454);
            sVar.p(false);
            jB = ((y1.q) b1Var.getValue()).f14960a;
        } else {
            sVar.W(-303499670);
            jB = mVar.b(sVar);
            sVar.p(false);
        }
        b1 b1VarV = f1.b.v(new y1.q(jB), sVar);
        b1 b1VarV2 = f1.b.v(mVar.a(sVar), sVar);
        sVar.W(331259447);
        ViewGroup viewGroupJ = g5.a.j((View) sVar.j(r2.n0.f11347f));
        boolean zF = sVar.f(kVar) | sVar.f(this) | sVar.f(viewGroupJ);
        Object objK = sVar.K();
        Object obj = f1.n.f5051a;
        if (zF || objK == obj) {
            Object bVar = new b(this.f1146a, this.f1147b, b1VarV, b1VarV2, viewGroupJ);
            sVar.h0(bVar);
            objK = bVar;
        }
        b bVar2 = (b) objK;
        sVar.p(false);
        boolean zF2 = sVar.f(kVar) | sVar.h(bVar2);
        Object objK2 = sVar.K();
        if (zF2 || objK2 == obj) {
            objK2 = new f(kVar, bVar2, (y8.c) null, 0);
            sVar.h0(objK2);
        }
        f1.b.g(bVar2, kVar, (h9.n) objK2, sVar);
        sVar.p(false);
        return bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f1146a == eVar.f1146a && n3.f.a(this.f1147b, eVar.f1147b) && this.f1148c.equals(eVar.f1148c);
    }

    public final int hashCode() {
        return this.f1148c.hashCode() + ob.a.j(this.f1147b, (this.f1146a ? 1231 : 1237) * 31, 31);
    }
}
