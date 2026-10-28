package jc;

import hc.t;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f7126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f7129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f7130f;

    static {
        String property;
        int i7 = t.f6539a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f7125a = property;
        f7126b = hc.a.i("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i10 = t.f6539a;
        if (i10 < 2) {
            i10 = 2;
        }
        f7127c = hc.a.j("kotlinx.coroutines.scheduler.core.pool.size", i10, 8);
        f7128d = hc.a.j("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f7129e = TimeUnit.SECONDS.toNanos(hc.a.i("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f7130f = g.f7120a;
    }
}
