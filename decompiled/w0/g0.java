package w0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0.b1 f13791b;

    public /* synthetic */ g0(l0.b1 b1Var, int i7) {
        this.f13790a = i7;
        this.f13791b = b1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(k2.z zVar, y8.c cVar) {
        switch (this.f13790a) {
            case 0:
                Object objL = l0.q0.l(zVar, this.f13791b, cVar);
                return objL == z8.a.f15774a ? objL : t8.z.f12851a;
            default:
                Object objL2 = l0.q0.l(zVar, this.f13791b, cVar);
                return objL2 == z8.a.f15774a ? objL2 : t8.z.f12851a;
        }
    }
}
