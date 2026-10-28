package k2;

import l0.o0;
import q2.c2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7211a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i9.t f7212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i9.t tVar) {
        super(1);
        this.f7212b = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o0 o0Var, u1.d dVar, i9.t tVar) {
        super(1);
        this.f7212b = tVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f7211a) {
            case 0:
                if (!((h) obj).f7216q) {
                    return c2.f10601a;
                }
                this.f7212b.f6684a = false;
                return c2.f10603c;
            default:
                u1.d dVar = (u1.d) obj;
                if (!dVar.f11129n) {
                    return c2.f10602b;
                }
                if (dVar.f13041p != null) {
                    n2.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                dVar.f13041p = null;
                i9.t tVar = this.f7212b;
                tVar.f6684a = tVar.f6684a;
                return c2.f10601a;
        }
    }
}
