package g1;

import f1.e2;
import f1.l2;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r extends j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f5806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r f5807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r f5808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r f5809h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5810d;

    static {
        int i7 = 1;
        f5806e = new r(i7, 2, 0);
        int i10 = 1;
        f5807f = new r(i10, i10, 1);
        f5808g = new r(i7, 2, 2);
        int i11 = 1;
        f5809h = new r(i11, i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i7, int i10, int i11) {
        super(i7, i10, 0, (byte) 0);
        this.f5810d = i11;
    }

    @Override // g1.j0
    public final void c(com.google.protobuf.q qVar, f1.c cVar, l2 l2Var, n1.i iVar, k0 k0Var) {
        switch (this.f5810d) {
            case 0:
                Object objInvoke = ((h9.a) qVar.d(0)).invoke();
                f1.a aVar = (f1.a) qVar.d(1);
                int iC = qVar.c(0);
                aVar.getClass();
                l2Var.T(l2Var.c(aVar), objInvoke);
                cVar.l(iC, objInvoke);
                cVar.c(objInvoke);
                break;
            case 1:
                f1.a aVar2 = (f1.a) qVar.d(0);
                int iC2 = qVar.c(0);
                cVar.k();
                aVar2.getClass();
                cVar.b(iC2, l2Var.C(l2Var.c(aVar2)));
                break;
            case 2:
                Object objD = qVar.d(0);
                f1.a aVar3 = (f1.a) qVar.d(1);
                int iC3 = qVar.c(0);
                if (objD instanceof e2) {
                    e2 e2Var = (e2) objD;
                    iVar.f8719e.b(e2Var);
                    iVar.f8718d.a(e2Var);
                }
                Object objJ = l2Var.J(l2Var.c(aVar3), iC3, objD);
                if (objJ instanceof e2) {
                    iVar.e((e2) objJ);
                } else if (objJ instanceof w1) {
                    ((w1) objJ).d();
                }
                break;
            default:
                Object objD2 = qVar.d(0);
                int iC4 = qVar.c(0);
                if (objD2 instanceof e2) {
                    e2 e2Var2 = (e2) objD2;
                    iVar.f8719e.b(e2Var2);
                    iVar.f8718d.a(e2Var2);
                }
                Object objJ2 = l2Var.J(l2Var.f5036t, iC4, objD2);
                if (objJ2 instanceof e2) {
                    iVar.e((e2) objJ2);
                } else if (objJ2 instanceof w1) {
                    ((w1) objJ2).d();
                }
                break;
        }
    }

    @Override // g1.j0
    public f1.a d(com.google.protobuf.q qVar) {
        switch (this.f5810d) {
            case 0:
                return (f1.a) qVar.d(1);
            case 1:
                return (f1.a) qVar.d(0);
            default:
                return super.d(qVar);
        }
    }
}
