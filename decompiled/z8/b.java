package z8;

import a9.g;
import h9.n;
import i9.b0;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f15779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y8.c f15780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, y8.c cVar, y8.c cVar2) {
        super(cVar);
        this.f15779b = nVar;
        this.f15780c = cVar2;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f15778a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f15778a = 2;
            t8.a.e(obj);
            return obj;
        }
        this.f15778a = 1;
        t8.a.e(obj);
        n nVar = this.f15779b;
        l.c(nVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        b0.d(2, nVar);
        return nVar.invoke(this.f15780c, this);
    }
}
