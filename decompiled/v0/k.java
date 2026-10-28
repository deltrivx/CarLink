package v0;

import b3.o0;
import o2.w;
import q2.h1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f13548c = new k(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f13549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f13550b;

    public k(o0 o0Var, w wVar) {
        this.f13549a = wVar;
        this.f13550b = o0Var;
    }

    public static k a(k kVar, h1 h1Var, o0 o0Var, int i7) {
        w wVar = h1Var;
        if ((i7 & 1) != 0) {
            wVar = kVar.f13549a;
        }
        if ((i7 & 2) != 0) {
            o0Var = kVar.f13550b;
        }
        return new k(o0Var, wVar);
    }
}
