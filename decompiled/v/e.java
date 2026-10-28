package v;

import a8.f1;
import f1.b1;
import f1.w2;
import r2.a3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13353a = 0;

    static {
        Object obj = z0.f13482a;
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final w2 a(Object obj, w0 w0Var, j jVar, String str, f1.s sVar, int i7) {
        Object objK = sVar.K();
        Object obj2 = f1.n.f5051a;
        if (objK == obj2) {
            objK = f1.b.s(null);
            sVar.h0(objK);
        }
        b1 b1Var = (b1) objK;
        Object objK2 = sVar.K();
        if (objK2 == obj2) {
            objK2 = new c(obj, w0Var, null);
            sVar.h0(objK2);
        }
        c cVar = (c) objK2;
        b1 b1VarV = f1.b.v(null, sVar);
        b1 b1VarV2 = f1.b.v(jVar, sVar);
        Object objK3 = sVar.K();
        if (objK3 == obj2) {
            objK3 = i2.c.c(-1, 6, null);
            sVar.h0(objK3);
        }
        ec.l lVar = (ec.l) objK3;
        boolean zH = sVar.h(lVar) | sVar.h(obj);
        Object objK4 = sVar.K();
        if (zH || objK4 == obj2) {
            objK4 = new f1(19, lVar, obj);
            sVar.h0(objK4);
        }
        f1.b.h((h9.a) objK4, sVar);
        boolean zH2 = sVar.h(lVar) | sVar.h(cVar) | sVar.f(b1VarV2) | sVar.f(b1VarV);
        Object objK5 = sVar.K();
        if (zH2 || objK5 == obj2) {
            Object a3Var = new a3(lVar, cVar, b1VarV2, b1VarV, null);
            sVar.h0(a3Var);
            objK5 = a3Var;
        }
        f1.b.f(sVar, (h9.n) objK5, lVar);
        w2 w2Var = (w2) b1Var.getValue();
        return w2Var == null ? cVar.f13326c : w2Var;
    }
}
