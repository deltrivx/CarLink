package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends y8.a implements cc.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.c f4956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f4957c;

    /* JADX WARN: Illegal instructions before constructor call */
    public f2(q1.c cVar, g2 g2Var) {
        cc.v vVar = cc.v.f2677a;
        this.f4956b = cVar;
        this.f4957c = g2Var;
        super(vVar);
    }

    @Override // cc.w
    public final void p(Throwable th, y8.h hVar) throws Throwable {
        q1.c cVar = this.f4956b;
        g2 g2Var = this.f4957c;
        n3.r.b0(th, new a8.f1(16, cVar, g2Var));
        cc.w wVar = (cc.w) g2Var.f4963a.l(cc.v.f2677a);
        if (wVar == null) {
            throw th;
        }
        wVar.p(th, hVar);
    }
}
