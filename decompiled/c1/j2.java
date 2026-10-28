package c1;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j2(int i7, y8.c cVar, int i10) {
        super(i7, cVar);
        this.f1953a = i10;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f1953a) {
            case 0:
                return new j2(2, cVar, 0);
            default:
                return new j2(2, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1953a) {
            case 0:
                j2 j2Var = (j2) create((k2.z) obj, (y8.c) obj2);
                t8.z zVar = t8.z.f12851a;
                j2Var.invokeSuspend(zVar);
                return zVar;
            default:
                return ((j2) create((cc.y) obj, (y8.c) obj2)).invokeSuspend(t8.z.f12851a);
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1953a) {
            case 0:
                t8.a.e(obj);
                return t8.z.f12851a;
            default:
                t8.a.e(obj);
                return Choreographer.getInstance();
        }
    }
}
