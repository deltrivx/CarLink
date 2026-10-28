package v4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import n4.e;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13605a = new e(17);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13606b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f13607c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f13608d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                ob.a.z(autoCloseable);
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }
}
