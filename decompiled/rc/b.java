package rc;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f12316a;

    static {
        Object objB;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objB = property != null ? zb.q.p0(property) : null;
        } catch (Throwable th) {
            objB = t8.a.b(th);
        }
        Integer num = (Integer) (objB instanceof t8.l ? null : objB);
        f12316a = num != null ? num.intValue() : 2097152;
    }
}
