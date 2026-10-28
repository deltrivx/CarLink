package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ o9.u[] f11746g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f11747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r1 f11748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f11749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11750f;

    static {
        i9.r rVar = new i9.r(q0.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
        i9.z zVar = i9.y.f6689a;
        f11746g = new o9.u[]{zVar.g(rVar), ob.a.v(q0.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, zVar), ob.a.v(q0.class, "members", "getMembers()Ljava/util/Collection;", 0, zVar)};
    }

    public q0(s0 s0Var) {
        super(s0Var);
        this.f11747c = n4.h.R(null, new n0(s0Var, 1));
        this.f11748d = n4.h.R(null, new o0(this, 0));
        p0 p0Var = new p0(this, s0Var);
        t8.i iVar = t8.i.f12827a;
        this.f11749e = t8.a.c(iVar, p0Var);
        this.f11750f = t8.a.c(iVar, new o0(this, 1));
        n4.h.R(null, new p0(s0Var, this));
    }
}
