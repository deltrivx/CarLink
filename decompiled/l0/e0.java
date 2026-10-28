package l0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7630c;

    public /* synthetic */ e0(int i7, Object obj, Object obj2) {
        this.f7628a = i7;
        this.f7629b = obj;
        this.f7630c = obj2;
    }

    public e0(w0.n nVar, b1 b1Var) {
        this.f7628a = 1;
        this.f7630c = nVar;
        this.f7629b = b1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(k2.z zVar, y8.c cVar) {
        switch (this.f7628a) {
            case 0:
                Object objG = cc.b0.g(new d0(zVar, (b1) this.f7629b, (w0.t1) this.f7630c, null), cVar);
                return objG == z8.a.f15774a ? objG : t8.z.f12851a;
            case 1:
                k2.m0 m0Var = (k2.m0) zVar;
                m0Var.getClass();
                Object objL = n4.h.l(zVar, new q7.f((w0.n) this.f7630c, new g7.l(q2.f.v(m0Var).f10691z), (b1) this.f7629b, null, 2), cVar);
                return objL == z8.a.f15774a ? objL : t8.z.f12851a;
            default:
                Object objL2 = n4.h.l(zVar, new x0((w0.w0) this.f7629b, (w0.f0) this.f7630c, null, 1), cVar);
                return objL2 == z8.a.f15774a ? objL2 : t8.z.f12851a;
        }
    }
}
