package qc;

import l0.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11032d = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.r f11033a = new oa.r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n4.e f11034b = sc.a.f12718a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f11035c = new o0(18);

    public final Object a(pc.c cVar, String str) {
        this.f11033a.getClass();
        ja.e eVar = new ja.e(str);
        Object objD0 = new rc.r(this, rc.v.OBJ, eVar, cVar.f10428b, null).d0(cVar);
        if (eVar.f() == 10) {
            return objD0;
        }
        ja.e.n(eVar, "Expected EOF after parsing, but had " + str.charAt(eVar.f6996b - 1) + " instead", 0, null, 6);
        throw null;
    }
}
