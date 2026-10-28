package jb;

import ra.i0;

/* JADX INFO: loaded from: classes.dex */
public final class p implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f7060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f7061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb.q f7062d;

    public /* synthetic */ p(t tVar, i0 i0Var, lb.q qVar, int i7) {
        this.f7059a = i7;
        this.f7060b = tVar;
        this.f7061c = i0Var;
        this.f7062d = qVar;
    }

    @Override // h9.a
    public final Object invoke() {
        switch (this.f7059a) {
            case 0:
                t tVar = this.f7060b;
                mb.k kVar = tVar.f7076a.f7043a.f7018a;
                p pVar = new p(tVar, this.f7061c, this.f7062d, 2);
                kVar.getClass();
                return new mb.h(kVar, pVar);
            case 1:
                t tVar2 = this.f7060b;
                mb.k kVar2 = tVar2.f7076a.f7043a.f7018a;
                p pVar2 = new p(tVar2, this.f7061c, this.f7062d, 3);
                kVar2.getClass();
                return new mb.h(kVar2, pVar2);
            case 2:
                t tVar3 = this.f7060b;
                k kVar3 = tVar3.f7076a;
                w wVarA = tVar3.a(kVar3.f7045c);
                i9.l.b(wVarA);
                a aVar = kVar3.f7043a.f7022e;
                nb.w wVarP = this.f7062d.p();
                i9.l.d(wVarP, "getReturnType(...)");
                return (bb.g) aVar.i(wVarA, this.f7061c, wVarP);
            default:
                t tVar4 = this.f7060b;
                k kVar4 = tVar4.f7076a;
                w wVarA2 = tVar4.a(kVar4.f7045c);
                i9.l.b(wVarA2);
                a aVar2 = kVar4.f7043a.f7022e;
                nb.w wVarP2 = this.f7062d.p();
                i9.l.d(wVarP2, "getReturnType(...)");
                return (bb.g) aVar2.c(wVarA2, this.f7061c, wVarP2);
        }
    }
}
