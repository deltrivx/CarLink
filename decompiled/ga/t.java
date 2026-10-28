package ga;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t extends i9.j implements h9.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t f6115i = new t(1, r.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);

    @Override // h9.k
    public final Object invoke(Object obj) {
        wa.c cVar = (wa.c) obj;
        i9.l.e(cVar, "p0");
        wa.c cVar2 = r.f6107a;
        b0.f6046c0.getClass();
        u0.k kVar = a0.f6042b;
        t8.g gVar = new t8.g(1, 7, 20);
        i9.l.e(kVar, "configuredReportLevels");
        c0 c0Var = (c0) ((f1.e) kVar.f12990b).invoke(cVar);
        if (c0Var != null) {
            return c0Var;
        }
        u0.k kVar2 = r.f6109c;
        kVar2.getClass();
        s sVar = (s) ((f1.e) kVar2.f12990b).invoke(cVar);
        if (sVar == null) {
            return c0.IGNORE;
        }
        t8.g gVar2 = sVar.f6113b;
        return (gVar2 == null || gVar2.f12826d - gVar.f12826d > 0) ? sVar.f6112a : sVar.f6114c;
    }
}
