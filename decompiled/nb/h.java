package nb;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f8995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tb.p f8996b;

    static {
        i9.r rVar = new i9.r(h.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1);
        i9.z zVar = i9.y.f6689a;
        f8995a = new o9.u[]{zVar.g(rVar)};
        u0.k kVar = h0.f8997b;
        o9.c cVarB = zVar.b(g.class);
        kVar.getClass();
        String strK = cVarB.k();
        i9.l.b(strK);
        f8996b = new tb.p(kVar.T0(strK));
    }

    public static final y9.h a(h0 h0Var) {
        y9.h hVar;
        i9.l.e(h0Var, "<this>");
        o9.u uVar = f8995a[0];
        tb.p pVar = f8996b;
        pVar.getClass();
        i9.l.e(uVar, "property");
        g gVar = (g) h0Var.f12893a.get(pVar.f12922a);
        return (gVar == null || (hVar = gVar.f8992a) == null) ? y9.g.f15129a : hVar;
    }
}
