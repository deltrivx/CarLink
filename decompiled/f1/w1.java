package f1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f5189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f5191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h9.n f5192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s.c0 f5194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s.h0 f5195g;

    public w1(y yVar) {
        this.f5189a = yVar;
    }

    public static boolean a(f0 f0Var, s.h0 h0Var) {
        i9.l.c(f0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        q2 q2Var = f0Var.f4953c;
        if (q2Var == null) {
            q2Var = w0.f5187f;
        }
        return !q2Var.a(f0Var.g().f4941f, h0Var.g(f0Var));
    }

    public final boolean b() {
        if (this.f5189a != null) {
            a aVar = this.f5191c;
            if (aVar != null ? aVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final q0 c(Object obj) {
        q0 q0VarS;
        y yVar = this.f5189a;
        return (yVar == null || (q0VarS = yVar.s(this, obj)) == null) ? q0.f5095a : q0VarS;
    }

    public final void d() {
        y yVar = this.f5189a;
        if (yVar != null) {
            yVar.f5217o = true;
            yVar.f5222t.m();
        }
        this.f5189a = null;
        this.f5194f = null;
        this.f5195g = null;
        this.f5192d = null;
    }

    public final void e(boolean z10) {
        int i7 = this.f5190b;
        this.f5190b = z10 ? i7 | 32 : i7 & (-33);
    }
}
