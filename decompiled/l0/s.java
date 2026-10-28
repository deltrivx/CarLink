package l0;

import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f7826b;

    public /* synthetic */ s(u0 u0Var, int i7) {
        this.f7825a = i7;
        this.f7826b = u0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f7825a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f7826b.f7863q.setValue(bool);
                return t8.z.f12851a;
            case 1:
                u0 u0Var = this.f7826b;
                f1.k1 k1Var = u0Var.f7866t;
                g3.w wVar = (g3.w) obj;
                String str = wVar.f5889a.f1353b;
                b3.h hVar = u0Var.f7857j;
                if (!i9.l.a(str, hVar != null ? hVar.f1353b : null)) {
                    u0Var.k.setValue(i0.f7678a);
                    if (((Boolean) k1Var.getValue()).booleanValue()) {
                        k1Var.setValue(Boolean.FALSE);
                    } else {
                        u0Var.f7865s.setValue(Boolean.FALSE);
                    }
                }
                long j5 = b3.q0.f1428b;
                u0Var.f(j5);
                u0Var.e(j5);
                u0Var.f7867u.invoke(wVar);
                w1 w1Var = u0Var.f7849b;
                f1.y yVar = w1Var.f5189a;
                if (yVar != null) {
                    yVar.s(w1Var, null);
                }
                return t8.z.f12851a;
            case 2:
                this.f7826b.f7864r.W(((g3.j) obj).f5864a);
                return t8.z.f12851a;
            default:
                return Boolean.valueOf(this.f7826b.f7864r.W(((g3.j) obj).f5864a));
        }
    }
}
