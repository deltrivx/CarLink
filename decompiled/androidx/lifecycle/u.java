package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f1068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f1069b;

    public final void a(t tVar, n nVar) {
        o oVarA = nVar.a();
        o oVar = this.f1068a;
        i9.l.e(oVar, "state1");
        if (oVarA.compareTo(oVar) < 0) {
            oVar = oVarA;
        }
        this.f1068a = oVar;
        this.f1069b.c(tVar, nVar);
        this.f1068a = oVarA;
    }
}
