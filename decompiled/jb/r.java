package jb;

import java.util.List;
import ra.i0;

/* JADX INFO: loaded from: classes.dex */
public final class r implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f7067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f7069c;

    public r(t tVar, boolean z10, i0 i0Var) {
        this.f7067a = tVar;
        this.f7068b = z10;
        this.f7069c = i0Var;
    }

    @Override // h9.a
    public final Object invoke() {
        List listJ0;
        t tVar = this.f7067a;
        k kVar = tVar.f7076a;
        x9.k kVar2 = kVar.f7045c;
        i iVar = kVar.f7043a;
        w wVarA = tVar.a(kVar2);
        if (wVarA != null) {
            boolean z10 = this.f7068b;
            i0 i0Var = this.f7069c;
            listJ0 = z10 ? u8.p.J0(iVar.f7022e.b(wVarA, i0Var)) : u8.p.J0(iVar.f7022e.d(wVarA, i0Var));
        } else {
            listJ0 = null;
        }
        return listJ0 == null ? u8.w.f13122a : listJ0;
    }
}
