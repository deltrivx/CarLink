package d0;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3663a;

    public /* synthetic */ w0(int i7) {
        this.f3663a = i7;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i7 = this.f3663a;
        f1.w0 w0Var = f1.n.f5051a;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj2;
                ((Number) obj3).intValue();
                sVar.W(359872873);
                WeakHashMap weakHashMap = v0.f3641u;
                v0 v0VarF = b.f(sVar);
                boolean zF = sVar.f(v0VarF);
                Object objK = sVar.K();
                if (zF || objK == w0Var) {
                    objK = new a0(v0VarF.f3646e);
                    sVar.h0(objK);
                }
                a0 a0Var = (a0) objK;
                sVar.p(false);
                return a0Var;
            default:
                f1.s sVar2 = (f1.s) obj2;
                ((Number) obj3).intValue();
                sVar2.W(359872873);
                WeakHashMap weakHashMap2 = v0.f3641u;
                v0 v0VarF2 = b.f(sVar2);
                boolean zF2 = sVar2.f(v0VarF2);
                Object objK2 = sVar2.K();
                if (zF2 || objK2 == w0Var) {
                    objK2 = new a0(v0VarF2.f3647f);
                    sVar2.h0(objK2);
                }
                a0 a0Var2 = (a0) objK2;
                sVar2.p(false);
                return a0Var2;
        }
    }
}
