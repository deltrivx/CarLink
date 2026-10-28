package kc;

import cc.b0;
import h9.o;
import i9.j;
import i9.l;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a extends j implements o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f7505i = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j5 = bVar.f7506a;
        z zVar = z.f12851a;
        if (j5 <= 0) {
            ((e) fVar).f7525e = zVar;
            return zVar;
        }
        b4.a aVar = new b4.a(8, fVar, bVar);
        l.c(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        e eVar = (e) fVar;
        y8.h hVar = eVar.f7521a;
        eVar.f7523c = b0.k(hVar).c(j5, aVar, hVar);
        return zVar;
    }
}
