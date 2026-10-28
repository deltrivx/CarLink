package f0;

import h0.l0;
import h0.o0;
import t8.z;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f4766a;

    public d(u uVar) {
        this.f4766a = uVar;
    }

    @Override // h0.l0
    public final int a() {
        u uVar = this.f4766a;
        return (int) (uVar.g().f4819o == x0.f15591a ? uVar.g().e() & 4294967295L : uVar.g().e() >> 32);
    }

    @Override // h0.l0
    public final float b() {
        u uVar = this.f4766a;
        return (uVar.f4856e.f4839b.f() * 500) + uVar.f4856e.f4840c.f();
    }

    @Override // h0.l0
    public final int c() {
        u uVar = this.f4766a;
        return (-uVar.g().f4816l) + uVar.g().f4820p;
    }

    @Override // h0.l0
    public final float d() {
        u uVar = this.f4766a;
        int iF = uVar.f4856e.f4839b.f();
        int iF2 = uVar.f4856e.f4840c.f();
        return uVar.d() ? (iF * 500) + iF2 + 100 : (iF * 500) + iF2;
    }

    @Override // h0.l0
    public final Object e(int i7, o0 o0Var) {
        Object objI = u.i(this.f4766a, i7, o0Var);
        return objI == z8.a.f15774a ? objI : z.f12851a;
    }

    @Override // h0.l0
    public final y2.b f() {
        return new y2.b(this.f4766a.g().f4818n, 1);
    }
}
