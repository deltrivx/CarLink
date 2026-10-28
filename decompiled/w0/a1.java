package w0;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a1 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n3.c f13725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f13726c;

    public /* synthetic */ a1(n3.c cVar, f1.b1 b1Var, int i7) {
        this.f13724a = i7;
        this.f13725b = cVar;
        this.f13726c = b1Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f13724a) {
            case 0:
                b1 b1Var = new b1((h9.a) obj, 0);
                a1 a1Var = new a1(this.f13725b, this.f13726c, 1);
                if (x.u0.a()) {
                    return x.u0.b(b1Var, a1Var, Build.VERSION.SDK_INT == 28 ? x.h1.f14384b : x.h1.f14385c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            case 1:
                n3.h hVar = (n3.h) obj;
                float fB = n3.h.b(hVar.f8738a);
                n3.c cVar = this.f13725b;
                this.f13726c.setValue(new n3.m((((long) cVar.a0(fB)) << 32) | (((long) cVar.a0(n3.h.a(hVar.f8738a))) & 4294967295L)));
                break;
            case 2:
                b1 b1Var2 = new b1((h9.a) obj, 1);
                a1 a1Var2 = new a1(this.f13725b, this.f13726c, 3);
                if (x.u0.a()) {
                    return x.u0.b(b1Var2, a1Var2, Build.VERSION.SDK_INT == 28 ? x.h1.f14384b : x.h1.f14385c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                n3.h hVar2 = (n3.h) obj;
                float fB2 = n3.h.b(hVar2.f8738a);
                n3.c cVar2 = this.f13725b;
                this.f13726c.setValue(new n3.m((((long) cVar2.a0(fB2)) << 32) | (((long) cVar2.a0(n3.h.a(hVar2.f8738a))) & 4294967295L)));
                break;
        }
        return t8.z.f12851a;
    }
}
