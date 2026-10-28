package ga;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f6116c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f6117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6118b;

    static {
        wa.c cVar = r.f6107a;
        t8.g gVar = t8.g.f12822e;
        i9.l.e(gVar, "configuredKotlinVersion");
        s sVar = r.f6110d;
        t8.g gVar2 = sVar.f6113b;
        c0 c0Var = (gVar2 == null || gVar2.f12826d - gVar.f12826d > 0) ? sVar.f6112a : sVar.f6114c;
        i9.l.e(c0Var, "globalReportLevel");
        w wVar = new w(c0Var, c0Var == c0.WARN ? null : c0Var);
        t tVar = t.f6115i;
        f6116c = new u(wVar);
    }

    public u(w wVar) {
        t tVar = t.f6115i;
        this.f6117a = wVar;
        this.f6118b = wVar.f6123d || tVar.invoke(r.f6107a) == c0.IGNORE;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f6117a + ", getReportLevelForAnnotation=" + t.f6115i + ')';
    }
}
