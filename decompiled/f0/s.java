package f0;

import z.n1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s implements r1.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f4845b;

    public /* synthetic */ s(n1 n1Var, int i7) {
        this.f4844a = i7;
        this.f4845b = n1Var;
    }

    @Override // r1.p
    public final /* synthetic */ r1.p a(r1.p pVar) {
        int i7 = this.f4844a;
        return ob.a.g(this, pVar);
    }

    @Override // r1.p
    public final Object g(h9.n nVar, Object obj) {
        switch (this.f4844a) {
            case 0:
                break;
        }
        return nVar.invoke(obj, this);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // r1.p
    public final boolean h(h9.k kVar) {
        switch (this.f4844a) {
        }
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
