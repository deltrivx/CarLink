package n1;

import f1.s;
import f1.w1;
import f1.y;
import h9.n;
import i9.b0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f8713a = new StackTraceElement[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f8714b = new j(0, new long[0], new Object[0]);

    public static final int a(int i7, int i10) {
        return i7 << (((i10 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(s sVar, n nVar) {
        i9.l.c(nVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        b0.d(2, nVar);
        nVar.invoke(sVar, 1);
    }

    public static final boolean d(float f10) {
        return (Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) > 2139095040;
    }

    public static final c e(int i7, t8.e eVar, s sVar) {
        Object objK = sVar.K();
        if (objK == f1.n.f5051a) {
            objK = new c(eVar, i7, true);
            sVar.h0(objK);
        }
        c cVar = (c) objK;
        if (!i9.l.a(cVar.f8705c, eVar)) {
            boolean z10 = cVar.f8705c == null;
            cVar.f8705c = eVar;
            if (!z10 && cVar.f8704b) {
                w1 w1Var = cVar.f8706d;
                if (w1Var != null) {
                    y yVar = w1Var.f5189a;
                    if (yVar != null) {
                        yVar.s(w1Var, null);
                    }
                    cVar.f8706d = null;
                }
                ArrayList arrayList = cVar.f8707e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        w1 w1Var2 = (w1) arrayList.get(i10);
                        y yVar2 = w1Var2.f5189a;
                        if (yVar2 != null) {
                            yVar2.s(w1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return cVar;
    }

    public static final boolean f(w1 w1Var, w1 w1Var2) {
        if (w1Var == null) {
            return true;
        }
        if (w1Var instanceof w1) {
            return !w1Var.b() || w1Var.equals(w1Var2) || i9.l.a(w1Var.f5191c, w1Var2.f5191c);
        }
        return false;
    }
}
