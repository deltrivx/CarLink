package r9;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final android.support.v4.media.session.r f11664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.support.v4.media.session.r f11665b;

    static {
        b bVar = b.f11651b;
        int i7 = a.f11646a;
        f11664a = new android.support.v4.media.session.r(bVar);
        f11665b = new android.support.v4.media.session.r(b.f11652c);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static final a0 a(Class cls) {
        Object objPutIfAbsent;
        i9.l.e(cls, "jClass");
        android.support.v4.media.session.r rVar = f11664a;
        rVar.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) rVar.f605c;
        Object objInvoke = concurrentHashMap.get(cls);
        if (objInvoke == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objInvoke = ((h9.k) rVar.f604b).invoke(cls)))) != null) {
            objInvoke = objPutIfAbsent;
        }
        i9.l.c(objInvoke, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (a0) objInvoke;
    }
}
