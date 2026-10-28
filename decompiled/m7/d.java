package m7;

import f1.b1;
import f1.h1;
import h9.o;
import l8.j0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8570a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f8571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f8572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1 f8573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f8574e;

    public /* synthetic */ d(o oVar, b1 b1Var, b1 b1Var2, h1 h1Var) {
        this.f8571b = oVar;
        this.f8572c = b1Var;
        this.f8574e = b1Var2;
        this.f8573d = h1Var;
    }

    public /* synthetic */ d(o oVar, b1 b1Var, h1 h1Var, b1 b1Var2) {
        this.f8571b = oVar;
        this.f8572c = b1Var;
        this.f8573d = h1Var;
        this.f8574e = b1Var2;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f8570a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                b1 b1Var = this.f8572c;
                b1Var.setValue(bool);
                Boolean bool2 = (Boolean) this.f8574e.getValue();
                bool2.booleanValue();
                Integer numValueOf = Integer.valueOf(this.f8573d.f());
                Boolean bool3 = (Boolean) b1Var.getValue();
                bool3.getClass();
                this.f8571b.invoke(bool2, numValueOf, bool3);
                return Boolean.TRUE;
            default:
                j0 j0Var = (j0) obj;
                i9.l.e(j0Var, "it");
                Boolean boolValueOf = Boolean.valueOf(j0Var.f8197b.c());
                b1 b1Var2 = this.f8572c;
                b1Var2.setValue(boolValueOf);
                Boolean bool4 = (Boolean) b1Var2.getValue();
                bool4.booleanValue();
                Integer numValueOf2 = Integer.valueOf(this.f8573d.f());
                Boolean bool5 = (Boolean) this.f8574e.getValue();
                bool5.booleanValue();
                this.f8571b.invoke(bool4, numValueOf2, bool5);
                return z.f12851a;
        }
    }
}
