package xa;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14785b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f14786a;

    static {
        new g(0);
    }

    public g() {
        this.f14786a = new HashMap();
    }

    public g(int i7) {
        this.f14786a = Collections.EMPTY_MAP;
    }

    public final void a(m mVar) {
        this.f14786a.put(new f(mVar.f14802d.f14796a, mVar.f14799a), mVar);
    }
}
