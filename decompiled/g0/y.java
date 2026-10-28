package g0;

import a8.c1;
import h0.l0;
import h0.o0;
import t8.z;
import x.v0;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f5760a;

    public y(v vVar) {
        this.f5760a = vVar;
    }

    @Override // h0.l0
    public final int a() {
        v vVar = this.f5760a;
        return (int) (vVar.g().f5690q == x0.f15591a ? vVar.g().e() & 4294967295L : vVar.g().e() >> 32);
    }

    @Override // h0.l0
    public final float b() {
        v vVar = this.f5760a;
        return (vVar.f5741d.f4839b.f() * 500) + vVar.f5741d.f4840c.f();
    }

    @Override // h0.l0
    public final int c() {
        v vVar = this.f5760a;
        return (-vVar.g().f5687n) + vVar.g().f5691r;
    }

    @Override // h0.l0
    public final float d() {
        v vVar = this.f5760a;
        int iF = vVar.f5741d.f4839b.f();
        int iF2 = vVar.f5741d.f4840c.f();
        return vVar.d() ? (iF * 500) + iF2 + 100 : (iF * 500) + iF2;
    }

    @Override // h0.l0
    public final Object e(int i7, o0 o0Var) {
        u0.k kVar = v.f5737w;
        v vVar = this.f5760a;
        vVar.getClass();
        Object objC = vVar.c(v0.f14491a, new c1(vVar, i7, null, 16), o0Var);
        z zVar = z.f12851a;
        z8.a aVar = z8.a.f15774a;
        if (objC != aVar) {
            objC = zVar;
        }
        return objC == aVar ? objC : zVar;
    }

    @Override // h0.l0
    public final y2.b f() {
        return new y2.b(-1, -1);
    }
}
