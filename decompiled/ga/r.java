package ga;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wa.c f6107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa.c[] f6108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0.k f6109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f6110d;

    static {
        wa.c cVar = new wa.c("org.jspecify.nullness");
        wa.c cVar2 = new wa.c("org.jspecify.annotations");
        f6107a = cVar2;
        wa.c cVar3 = new wa.c("io.reactivex.rxjava3.annotations");
        wa.c cVar4 = new wa.c("org.checkerframework.checker.nullness.compatqual");
        String str = cVar3.f14240a.f14243a;
        f6108b = new wa.c[]{new wa.c(ob.a.B(str, ".Nullable")), new wa.c(ob.a.B(str, ".NonNull"))};
        wa.c cVar5 = new wa.c("org.jetbrains.annotations");
        s sVar = s.f6111d;
        t8.j jVar = new t8.j(cVar5, sVar);
        t8.j jVar2 = new t8.j(new wa.c("androidx.annotation"), sVar);
        t8.j jVar3 = new t8.j(new wa.c("android.support.annotation"), sVar);
        t8.j jVar4 = new t8.j(new wa.c("android.annotation"), sVar);
        t8.j jVar5 = new t8.j(new wa.c("com.android.annotations"), sVar);
        t8.j jVar6 = new t8.j(new wa.c("org.eclipse.jdt.annotation"), sVar);
        t8.j jVar7 = new t8.j(new wa.c("org.checkerframework.checker.nullness.qual"), sVar);
        t8.j jVar8 = new t8.j(cVar4, sVar);
        t8.j jVar9 = new t8.j(new wa.c("javax.annotation"), sVar);
        t8.j jVar10 = new t8.j(new wa.c("edu.umd.cs.findbugs.annotations"), sVar);
        t8.j jVar11 = new t8.j(new wa.c("io.reactivex.annotations"), sVar);
        wa.c cVar6 = new wa.c("androidx.annotation.RecentlyNullable");
        c0 c0Var = c0.WARN;
        t8.j jVar12 = new t8.j(cVar6, new s(c0Var, 4));
        t8.j jVar13 = new t8.j(new wa.c("androidx.annotation.RecentlyNonNull"), new s(c0Var, 4));
        t8.j jVar14 = new t8.j(new wa.c("lombok"), sVar);
        t8.g gVar = new t8.g(2, 1, 0);
        c0 c0Var2 = c0.STRICT;
        f6109c = new u0.k(u8.b0.W0(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, new t8.j(cVar, new s(c0Var, gVar, c0Var2)), new t8.j(cVar2, new s(c0Var, new t8.g(2, 1, 0), c0Var2)), new t8.j(cVar3, new s(c0Var, new t8.g(1, 8, 0), c0Var2))));
        f6110d = new s(c0Var, 4);
    }
}
