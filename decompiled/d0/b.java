package d0;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3538a;

    public /* synthetic */ b(int i7) {
        this.f3538a = i7;
    }

    public static final a d(int i7, String str) {
        WeakHashMap weakHashMap = v0.f3641u;
        return new a(i7, str);
    }

    public static final s0 e(int i7, String str) {
        WeakHashMap weakHashMap = v0.f3641u;
        return new s0(new b0(0, 0, 0, 0), str);
    }

    public static v0 f(f1.s sVar) {
        v0 v0Var;
        View view = (View) sVar.j(r2.n0.f11347f);
        WeakHashMap weakHashMap = v0.f3641u;
        synchronized (weakHashMap) {
            try {
                Object v0Var2 = weakHashMap.get(view);
                if (v0Var2 == null) {
                    v0Var2 = new v0(view);
                    weakHashMap.put(view, v0Var2);
                }
                v0Var = (v0) v0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zH = sVar.h(v0Var) | sVar.h(view);
        Object objK = sVar.K();
        if (zH || objK == f1.n.f5051a) {
            objK = new c8.p(4, v0Var, view);
            sVar.h0(objK);
        }
        f1.b.c(v0Var, (h9.k) objK, sVar);
        return v0Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // d0.e, d0.g
    public float a() {
        switch (this.f3538a) {
        }
        return 0;
    }

    @Override // d0.g
    public void b(int i7, o2.o0 o0Var, int[] iArr, int[] iArr2) {
        switch (this.f3538a) {
            case 2:
                h.c(i7, iArr, iArr2, false);
                break;
            default:
                h.b(iArr, iArr2, false);
                break;
        }
    }

    @Override // d0.e
    public void c(n3.c cVar, int i7, int[] iArr, n3.o oVar, int[] iArr2) {
        switch (this.f3538a) {
            case 0:
                h.b(iArr, iArr2, false);
                break;
            case 1:
                h.c(i7, iArr, iArr2, false);
                break;
            case 2:
            default:
                if (oVar != n3.o.f8749a) {
                    h.c(i7, iArr, iArr2, true);
                } else {
                    h.b(iArr, iArr2, false);
                }
                break;
            case 3:
                if (oVar != n3.o.f8749a) {
                    h.b(iArr, iArr2, true);
                } else {
                    h.c(i7, iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f3538a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#Bottom";
            case 3:
                return "Arrangement#End";
            case 4:
                return "Arrangement#Start";
            case 5:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
