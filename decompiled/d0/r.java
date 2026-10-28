package d0;

import f1.b1;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3619a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f3621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3624f;

    public /* synthetic */ r(int i7, t8.j jVar, h9.k kVar, b1 b1Var, b1 b1Var2) {
        this.f3620b = i7;
        this.f3621c = jVar;
        this.f3622d = kVar;
        this.f3623e = b1Var;
        this.f3624f = b1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r(o2.v0[] v0VarArr, s sVar, int i7, o2.o0 o0Var, int[] iArr) {
        this.f3621c = v0VarArr;
        this.f3622d = sVar;
        this.f3620b = i7;
        this.f3623e = o0Var;
        this.f3624f = iArr;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f3619a;
        t8.z zVar = t8.z.f12851a;
        Object obj2 = this.f3624f;
        Object obj3 = this.f3623e;
        Object obj4 = this.f3622d;
        Object obj5 = this.f3621c;
        int i10 = this.f3620b;
        switch (i7) {
            case 0:
                o2.v0[] v0VarArr = (o2.v0[]) obj5;
                s sVar = (s) obj4;
                o2.o0 o0Var = (o2.o0) obj3;
                int[] iArr = (int[]) obj2;
                o2.u0 u0Var = (o2.u0) obj;
                int length = v0VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    o2.v0 v0Var = v0VarArr[i11];
                    i9.l.b(v0Var);
                    v0Var.w();
                    o2.u0.f(u0Var, v0Var, sVar.f3628b.a(0, i10 - v0Var.f9435a, o0Var.getLayoutDirection()), iArr[i12]);
                    i11++;
                    i12++;
                }
                break;
            default:
                t8.j jVar = (t8.j) obj5;
                h9.k kVar = (h9.k) obj4;
                b1 b1Var = (b1) obj2;
                String str = (String) obj;
                i9.l.e(str, "it");
                Integer num = (Integer) ((b1) obj3).getValue();
                if (num != null && num.intValue() == i10) {
                    t8.o oVar = n8.d.f8898a;
                    n8.d.g((String) jVar.f12830a, str);
                    kVar.invoke(str);
                    b1Var.setValue(Boolean.FALSE);
                }
                break;
        }
        return zVar;
    }
}
