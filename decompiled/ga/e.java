package ga;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends h0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f6066l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final x9.t a(x9.t tVar) {
        i9.l.e(tVar, "functionDescriptor");
        wa.e name = ((aa.q) tVar).getName();
        i9.l.d(name, "getName(...)");
        if (b(name)) {
            return (x9.t) db.e.b(tVar, d.f6053b);
        }
        return null;
    }

    public static boolean b(wa.e eVar) {
        i9.l.e(eVar, "<this>");
        return h0.f6086e.contains(eVar);
    }
}
