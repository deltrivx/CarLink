package cc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f2608a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [dc.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [cc.c0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [cc.g0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [cc.c0] */
    static {
        String property;
        ?? r8;
        int i7 = hc.t.f6539a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            jc.e eVar = k0.f2635a;
            r8 = hc.m.f6531a;
            dc.d dVar = r8.f3906f;
            if (!(r8 != 0)) {
                r8 = c0.f2605j;
            }
        } else {
            r8 = c0.f2605j;
        }
        f2608a = r8;
    }
}
