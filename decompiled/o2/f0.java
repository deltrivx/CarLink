package o2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends q2.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f9326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h9.n f9327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, h9.n nVar, String str) {
        super(str);
        this.f9326b = i0Var;
        this.f9327c = nVar;
    }

    @Override // o2.m0
    public final n0 c(o0 o0Var, List list, long j5) {
        i0 i0Var = this.f9326b;
        d0 d0Var = i0Var.f9348h;
        d0Var.f9312a = o0Var.getLayoutDirection();
        d0Var.f9313b = o0Var.a();
        d0Var.f9314c = o0Var.O();
        boolean zQ = o0Var.Q();
        h9.n nVar = this.f9327c;
        if (zQ || i0Var.f9341a.f10673g == null) {
            i0Var.f9344d = 0;
            n0 n0Var = (n0) nVar.invoke(d0Var, new n3.a(j5));
            return new e0(n0Var, i0Var, i0Var.f9344d, n0Var, 1);
        }
        i0Var.f9345e = 0;
        n0 n0Var2 = (n0) nVar.invoke(i0Var.f9349i, new n3.a(j5));
        return new e0(n0Var2, i0Var, i0Var.f9345e, n0Var2, 0);
    }
}
