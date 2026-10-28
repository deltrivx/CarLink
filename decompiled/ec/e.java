package ec;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e extends i9.j implements h9.o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f4693i = new e(3, h.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f4700b;
        hVar.getClass();
        if (obj3 == j.f4721l) {
            obj3 = new m(hVar.p());
        }
        return new o(obj3);
    }
}
