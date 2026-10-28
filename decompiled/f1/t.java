package f1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f5142a = new e1("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f5143b = new e1("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f5144c = new e1("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1 f5145d = new e1("providers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e1 f5146e = new e1("reference");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b4.c f5147f = new b4.c(2);

    public static final void a(List list, int i7, int i10) {
        int iE = e(i7, list);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < list.size() && ((p0) list.get(iE)).f5079b < i10) {
        }
    }

    public static final void b(h2 h2Var, ArrayList arrayList, int i7) {
        boolean zL = h2Var.l(i7);
        int[] iArr = h2Var.f4971b;
        if (zL) {
            arrayList.add(h2Var.n(i7));
            return;
        }
        int i10 = iArr[(i7 * 5) + 3] + i7;
        for (int i11 = i7 + 1; i11 < i10; i11 += iArr[(i11 * 5) + 3]) {
            b(h2Var, arrayList, i11);
        }
    }

    public static final void c(String str) {
        throw new m(a2.f.G("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new m(a2.f.G("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int e(int i7, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int iF = i9.l.f(((p0) list.get(i11)).f5079b, i7);
            if (iF < 0) {
                i10 = i11 + 1;
            } else {
                if (iF <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final Object f(Object obj, Object obj2, Object obj3) {
        r0 r0Var = obj instanceof r0 ? (r0) obj : null;
        if (r0Var == null) {
            return null;
        }
        Object obj4 = r0Var.f5103b;
        Object obj5 = r0Var.f5102a;
        if (i9.l.a(obj5, obj2) && i9.l.a(obj4, obj3)) {
            return obj;
        }
        Object objF = f(obj5, obj2, obj3);
        return objF == null ? f(obj4, obj2, obj3) : objF;
    }

    public static final void g(l2 l2Var, int i7, Object obj) {
        int iH = l2Var.h(i7);
        Object[] objArr = l2Var.f5020c;
        Object obj2 = objArr[iH];
        objArr[iH] = n.f5051a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
