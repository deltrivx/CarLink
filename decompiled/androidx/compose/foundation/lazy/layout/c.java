package androidx.compose.foundation.lazy.layout;

import a8.z;
import android.support.v4.media.session.r;
import android.view.View;
import com.baidu.carlifevehicle.R;
import f0.k;
import f0.m;
import f1.b1;
import f1.n;
import f1.s;
import f1.w0;
import h0.i0;
import h0.j0;
import h0.t;
import h0.t0;
import h0.v0;
import h9.o;
import o2.d1;
import o2.h1;
import r1.p;
import r2.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f850d;

    public c(i0 i0Var, p pVar, m mVar, b1 b1Var) {
        this.f847a = i0Var;
        this.f848b = pVar;
        this.f849c = mVar;
        this.f850d = b1Var;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p pVarA;
        o1.b bVar = (o1.b) obj;
        s sVar = (s) obj2;
        ((Number) obj3).intValue();
        Object objK = sVar.K();
        int i7 = 10;
        w0 w0Var = n.f5051a;
        if (objK == w0Var) {
            objK = new t(bVar, new k(this.f850d, 10));
            sVar.h0(objK);
        }
        t tVar = (t) objK;
        Object objK2 = sVar.K();
        if (objK2 == w0Var) {
            objK2 = new h1(new r(tVar));
            sVar.h0(objK2);
        }
        h1 h1Var = (h1) objK2;
        i0 i0Var = this.f847a;
        if (i0Var != null) {
            sVar.W(1743490539);
            sVar.W(887527095);
            Object obj4 = v0.f6396a;
            if (obj4 != null) {
                sVar.W(1345648624);
                sVar.p(false);
            } else {
                sVar.W(1345697697);
                View view = (View) sVar.j(n0.f11347f);
                boolean zF = sVar.f(view);
                Object objK3 = sVar.K();
                if (zF || objK3 == w0Var) {
                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                    objK3 = tag instanceof t0 ? (t0) tag : null;
                    if (objK3 == null) {
                        objK3 = new h0.b(view);
                        view.setTag(R.id.compose_prefetch_scheduler, objK3);
                    }
                    sVar.h0(objK3);
                }
                obj4 = (t0) objK3;
                sVar.p(false);
            }
            Object obj5 = obj4;
            sVar.p(false);
            Object[] objArr = {i0Var, tVar, h1Var, obj5};
            boolean zF2 = sVar.f(i0Var) | sVar.h(tVar) | sVar.h(h1Var) | sVar.h(obj5);
            Object objK4 = sVar.K();
            if (zF2 || objK4 == w0Var) {
                z zVar = new z(i0Var, tVar, h1Var, obj5, 3);
                sVar.h0(zVar);
                objK4 = zVar;
            }
            f1.b.e(objArr, (h9.k) objK4, sVar);
            sVar.p(false);
        } else {
            sVar.W(1744076749);
            sVar.p(false);
        }
        int i10 = j0.f6331a;
        p pVar = this.f848b;
        if (i0Var != null && (pVarA = pVar.a(new TraversablePrefetchStateModifierElement(i0Var))) != null) {
            pVar = pVarA;
        }
        boolean zF3 = sVar.f(tVar);
        m mVar = this.f849c;
        boolean zF4 = zF3 | sVar.f(mVar);
        Object objK5 = sVar.K();
        if (zF4 || objK5 == w0Var) {
            objK5 = new a8.m(i7, tVar, mVar);
            sVar.h0(objK5);
        }
        d1.a(h1Var, pVar, (h9.n) objK5, sVar, 8);
        return t8.z.f12851a;
    }
}
