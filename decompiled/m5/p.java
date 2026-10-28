package m5;

import k2.v;
import t8.z;
import y1.f0;
import y1.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f8516b;

    public /* synthetic */ p(l lVar, int i7) {
        this.f8515a = i7;
        this.f8516b = lVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f8515a;
        z zVar = z.f12851a;
        l lVar = this.f8516b;
        switch (i7) {
            case 0:
                lVar.b(((v) obj).f7280c, true);
                break;
            default:
                y1.o oVar = (y1.o) obj;
                i9.l.e(lVar, "$controller");
                i9.l.e(oVar, "$this$ColorPicker");
                long j5 = lVar.f8483b;
                f7.q qVar = r.f8519a;
                long jX = n3.l.x(j5);
                float fC = x1.e.c(j5) * 0.5f;
                o0 o0Var = r.f8521c;
                f7.q qVar2 = r.f8519a;
                o0Var.a(1.0f, j5, qVar2);
                f0 f0Var = r.f8522d;
                f7.q qVar3 = r.f8520b;
                f0Var.a(1.0f, j5, qVar3);
                oVar.g(fC, jX, qVar2);
                oVar.g(fC, jX, qVar3);
                break;
        }
        return zVar;
    }
}
