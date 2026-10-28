package jb;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f7014c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f7015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1.e f7016b;

    static {
        wa.c cVarG = u9.n.f13169c.g();
        f7014c = n3.r.W(new wa.b(cVarG.b(), cVarG.f14240a.f()));
    }

    public g(i iVar) {
        this.f7015a = iVar;
        this.f7016b = iVar.f7018a.c(new aa.a(13, this));
    }

    public final x9.e a(wa.b bVar, d dVar) {
        i9.l.e(bVar, "classId");
        return (x9.e) this.f7016b.invoke(new f(bVar, dVar));
    }
}
