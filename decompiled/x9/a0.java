package x9;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final da.a f14685b;

    public /* synthetic */ a0(da.a aVar, int i7) {
        this.f14684a = i7;
        this.f14685b = aVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f14684a) {
            case 0:
                wa.c cVar = (wa.c) obj;
                i9.l.e(cVar, "fqName");
                return new aa.s((y) this.f14685b.f3848c, cVar, 0);
            default:
                b0 b0Var = (b0) obj;
                i9.l.e(b0Var, "<destruct>");
                wa.b bVar = b0Var.f14687a;
                List list = b0Var.f14688b;
                if (bVar.f14238c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                wa.b bVarE = bVar.e();
                da.a aVar = this.f14685b;
                g gVarW = bVarE != null ? aVar.w(bVarE, u8.p.h0(list)) : (g) ((mb.e) aVar.f3849d).invoke(bVar.f14236a);
                boolean zG = bVar.g();
                mb.k kVar = (mb.k) aVar.f3847b;
                wa.e eVarF = bVar.f();
                Integer num = (Integer) u8.p.m0(list);
                return new c0(kVar, gVarW, eVarF, zG, num != null ? num.intValue() : 0);
        }
    }
}
