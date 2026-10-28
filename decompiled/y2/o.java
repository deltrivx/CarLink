package y2;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import l0.o0;
import q2.h0;
import s.d0;
import s.w;
import s.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f15026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f15027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.k f15028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f15029d = new d0(2);

    public o(h0 h0Var, d dVar, w wVar) {
        this.f15026a = h0Var;
        this.f15027b = dVar;
        this.f15028c = wVar;
    }

    public final m a() {
        return new m(this.f15027b, false, this.f15026a, new j());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public final void b(h0 h0Var, j jVar) {
        String str;
        d0 d0Var = this.f15029d;
        Object[] objArr = d0Var.f12407a;
        int i7 = d0Var.f12408b;
        for (int i10 = 0; i10 < i7; i10++) {
            s1.c cVar = (s1.c) objArr[i10];
            x xVar = cVar.f12547h;
            r2.u uVar = cVar.f12542c;
            o0 o0Var = cVar.f12540a;
            j jVarX = h0Var.x();
            int i11 = h0Var.f10668b;
            String str2 = null;
            if (jVar != null) {
                Object objG = jVar.f15011a.g(r.D);
                if (objG == null) {
                    objG = null;
                }
                b3.h hVar = (b3.h) objG;
                if (hVar != null) {
                    str = hVar.f1353b;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (jVarX != null) {
                Object objG2 = jVarX.f15011a.g(r.D);
                if (objG2 == null) {
                    objG2 = null;
                }
                b3.h hVar2 = (b3.h) objG2;
                if (hVar2 != null) {
                    str2 = hVar2.f1353b;
                }
            }
            if (str != str2) {
                if (str == null) {
                    o0Var.Z(uVar, i11, true);
                } else if (str2 == null) {
                    o0Var.Z(uVar, i11, false);
                } else if (i9.l.a((s1.d) p.d(jVarX, r.f15066r), s1.m.f12552a)) {
                    ((AutofillManager) o0Var.f7772b).notifyValueChanged(uVar, i11, AutofillValue.forText(str2.toString()));
                }
            }
            boolean z10 = jVar != null && jVar.f15011a.b(r.f15065q);
            boolean z11 = jVarX != null && jVarX.f15011a.b(r.f15065q);
            if (z10 != z11) {
                if (z11) {
                    xVar.a(i11);
                } else {
                    xVar.e(i11);
                }
            }
        }
    }
}
