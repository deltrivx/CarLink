package y9;

import bb.w;
import u8.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wa.e f15124a = wa.e.e("message");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa.e f15125b = wa.e.e("replaceWith");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wa.e f15126c = wa.e.e("level");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wa.e f15127d = wa.e.e("expression");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wa.e f15128e = wa.e.e("imports");

    public static final j a(u9.i iVar, String str, String str2, String str3) {
        i9.l.e(iVar, "<this>");
        i9.l.e(str, "message");
        i9.l.e(str2, "replaceWith");
        j jVar = new j(iVar, u9.n.f13185o, b0.W0(new t8.j(f15127d, new w(str2)), new t8.j(f15128e, new bb.b(u8.w.f13122a, new u9.g(iVar, 1)))));
        wa.c cVar = u9.n.f13183m;
        t8.j jVar2 = new t8.j(f15124a, new w(str));
        t8.j jVar3 = new t8.j(f15125b, new bb.a((Object) jVar));
        wa.c cVar2 = u9.n.f13184n;
        i9.l.e(cVar2, "topLevelFqName");
        return new j(iVar, cVar, b0.W0(jVar2, jVar3, new t8.j(f15126c, new bb.i(new wa.b(cVar2.b(), cVar2.f14240a.f()), wa.e.e(str3)))));
    }
}
