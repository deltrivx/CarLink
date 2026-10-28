package l0;

import android.util.DisplayMetrics;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import f1.z1;
import z.e2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7749a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f7750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f7752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7753e;

    public l1(DisplayMetrics displayMetrics, f1.g1 g1Var, f1.b1 b1Var, f1.g1 g1Var2) {
        this.f7751c = displayMetrics;
        this.f7752d = g1Var;
        this.f7750b = b1Var;
        this.f7753e = g1Var2;
    }

    public l1(cc.y yVar, f1.b1 b1Var, b0.k kVar, f1.b1 b1Var2) {
        this.f7751c = yVar;
        this.f7750b = b1Var;
        this.f7753e = kVar;
        this.f7752d = b1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(k2.z zVar, y8.c cVar) {
        int i7 = this.f7749a;
        t8.z zVar2 = t8.z.f12851a;
        z8.a aVar = z8.a.f15774a;
        Object obj = this.f7753e;
        f1.b1 b1Var = this.f7750b;
        f1.b1 b1Var2 = this.f7752d;
        Object obj2 = this.f7751c;
        switch (i7) {
            case 0:
                k1 k1Var = new k1((cc.y) obj2, b1Var, (b0.k) obj, null);
                f8.h hVar = new f8.h(b1Var2, 1);
                z.g0 g0Var = e2.f15357a;
                Object objG = cc.b0.g(new z1(zVar, k1Var, hVar, new z.a1(zVar), null), cVar);
                if (objG != aVar) {
                    objG = zVar2;
                }
                return objG == aVar ? objG : zVar2;
            default:
                Object objE = z.y.e(zVar, new h0.w((DisplayMetrics) obj2, (f1.g1) b1Var2, b1Var, (f1.g1) obj), cVar);
                return objE == aVar ? objE : zVar2;
        }
    }
}
