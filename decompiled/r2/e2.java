package r2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.x2 f11217a = new f1.x2(k0.E);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(u0.l lVar, fc.i iVar, a9.c cVar) {
        c2 c2Var;
        if (cVar instanceof c2) {
            c2Var = (c2) cVar;
            int i7 = c2Var.f11208b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c2Var.f11208b = i7 - Integer.MIN_VALUE;
            } else {
                c2Var = new c2(cVar);
            }
        } else {
            c2Var = new c2(cVar);
        }
        Object obj = c2Var.f11207a;
        int i10 = c2Var.f11208b;
        if (i10 != 0) {
            if (i10 == 1) {
                throw ob.a.n(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t8.a.e(obj);
        if (!lVar.f11117a.f11129n) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        q2.q1 q1VarW = q2.f.w(lVar);
        n1.g gVar = (n1.g) q2.f.v(lVar).A;
        gVar.getClass();
        if (f1.b.t(gVar, f11217a) != null) {
            throw new ClassCastException();
        }
        c2Var.f11208b = 1;
        b(q1VarW, iVar, c2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(q2.q1 q1Var, h9.n nVar, a9.c cVar) {
        d2 d2Var;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i7 = d2Var.f11214b;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                d2Var.f11214b = i7 - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(cVar);
            }
        } else {
            d2Var = new d2(cVar);
        }
        Object obj = d2Var.f11213a;
        int i10 = d2Var.f11214b;
        if (i10 == 0) {
            t8.a.e(obj);
            d2Var.f11214b = 1;
            ((u) q1Var).O(nVar, d2Var);
        } else {
            if (i10 == 1) {
                throw ob.a.n(obj);
            }
            if (i10 == 2) {
                throw ob.a.n(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
