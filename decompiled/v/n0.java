package v;

import f1.i1;
import f1.o2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f13416b;

    public /* synthetic */ n0(s0 s0Var, int i7) {
        this.f13415a = i7;
        this.f13416b = s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    @Override // h9.a
    public final Object invoke() {
        boolean z10;
        switch (this.f13415a) {
            case 0:
                s0 s0Var = this.f13416b;
                if (i9.l.a(s0Var.f13451b.getValue(), s0Var.c())) {
                    i1 i1Var = s0Var.f13454e;
                    if (((o2) p1.l.u(i1Var.f4984b, i1Var)).f5076c == Long.MIN_VALUE && !((Boolean) s0Var.f13455f.getValue()).booleanValue()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                return Long.valueOf(this.f13416b.b());
        }
    }
}
