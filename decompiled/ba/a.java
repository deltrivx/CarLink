package ba;

import i9.l;
import v8.e;
import x9.a1;
import x9.b1;
import x9.e1;
import x9.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends n.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f1676d = new a("package", false);

    @Override // n.a
    public final Integer a(n.a aVar) {
        l.e(aVar, "visibility");
        if (this == aVar) {
            return 0;
        }
        e eVar = e1.f14700a;
        return (aVar == z0.f14756d || aVar == a1.f14686d) ? 1 : -1;
    }

    @Override // n.a
    public final String d() {
        return "public/*package*/";
    }

    @Override // n.a
    public final n.a k() {
        return b1.f14689d;
    }
}
