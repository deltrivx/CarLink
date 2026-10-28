package d1;

import o2.l0;
import o2.o0;
import o2.v0;
import u8.x;
import v.u;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i9.n implements h9.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f3683c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3684a;

    static {
        int i7 = 3;
        f3682b = new b(i7, 0);
        f3683c = new b(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i10) {
        super(i7);
        this.f3684a = i10;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object v0Var;
        switch (this.f3684a) {
            case 0:
                o0 o0Var = (o0) obj;
                long j5 = ((n3.a) obj3).f8730a;
                int iA0 = o0Var.a0(d.f3686a);
                int i7 = iA0 * 2;
                v0 v0VarU = ((l0) obj2).u(n3.b.i(i7, 0, j5));
                return o0Var.i(v0VarU.f9435a - i7, v0VarU.f9436b, x.f13123a, new a(iA0, 0, v0VarU));
            default:
                v.o0 o0Var2 = (v.o0) obj;
                f1.s sVar = (f1.s) obj2;
                ((Number) obj3).intValue();
                sVar.W(-1154662212);
                g gVar = g.f3692a;
                g gVar2 = g.f3693b;
                if (o0Var2.a(gVar, gVar2)) {
                    v0Var = v.d.k(67, 2, u.f13467b);
                } else {
                    v0Var = (o0Var2.a(gVar2, gVar) || o0Var2.a(g.f3694c, gVar2)) ? new v.v0(83, 67, u.f13467b) : v.d.j(7, null);
                }
                sVar.p(false);
                return v0Var;
        }
    }
}
