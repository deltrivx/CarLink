package y9;

import java.util.Map;
import nb.w;
import x9.l0;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9.i f15132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.c f15133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f15134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15135d;

    public j(u9.i iVar, wa.c cVar, Map map) {
        i9.l.e(iVar, "builtIns");
        i9.l.e(cVar, "fqName");
        this.f15132a = iVar;
        this.f15133b = cVar;
        this.f15134c = map;
        this.f15135d = t8.a.c(t8.i.f12827a, new l0(1, this));
    }

    @Override // y9.b
    public final wa.c a() {
        return this.f15133b;
    }

    @Override // y9.b
    public final Map b() {
        return this.f15134c;
    }

    @Override // y9.b
    public final n0 getSource() {
        return n0.f14716e0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // y9.b
    public final w getType() {
        Object value = this.f15135d.getValue();
        i9.l.d(value, "getValue(...)");
        return (w) value;
    }
}
