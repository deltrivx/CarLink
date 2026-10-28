package jb;

import p.i3;
import ra.s0;
import x9.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f7002b;

    public /* synthetic */ a0(i3 i3Var, int i7) {
        this.f7001a = i7;
        this.f7002b = i3Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f7001a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                k kVar = (k) this.f7002b.f9785b;
                ta.f fVar = kVar.f7044b;
                i iVar = kVar.f7043a;
                wa.b bVarD = i2.c.D(fVar, iIntValue);
                return bVarD.f14238c ? iVar.b(bVarD) : x9.v.e(iVar.f7019b, bVarD);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                k kVar2 = (k) this.f7002b.f9785b;
                wa.b bVarD2 = i2.c.D(kVar2.f7044b, iIntValue2);
                if (!bVarD2.f14238c) {
                    x9.y yVar = kVar2.f7043a.f7019b;
                    i9.l.e(yVar, "<this>");
                    x9.h hVarE = x9.v.e(yVar, bVarD2);
                    if (hVarE instanceof q0) {
                        return (q0) hVarE;
                    }
                }
                return null;
            default:
                s0 s0Var = (s0) obj;
                i9.l.e(s0Var, "it");
                return n3.r.J(s0Var, ((k) this.f7002b.f9785b).f7046d);
        }
    }
}
