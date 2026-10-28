package r9;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class e1 extends l1 implements h9.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f11674j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(e0 e0Var, x9.k0 k0Var) {
        super(e0Var, k0Var);
        i9.l.e(k0Var, "descriptor");
        c1 c1Var = new c1(this, 0);
        t8.i iVar = t8.i.f12827a;
        this.f11674j = t8.a.c(iVar, c1Var);
        t8.a.c(iVar, new c1(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // o9.u
    public final o9.p b() {
        return (d1) this.f11674j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) this.f11674j.getValue()).f(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // r9.l1
    public final i1 q() {
        return (d1) this.f11674j.getValue();
    }
}
