package w0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f13777b;

    public /* synthetic */ e0(w0 w0Var, int i7) {
        this.f13776a = i7;
        this.f13777b = w0Var;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        y yVar;
        y yVar2;
        switch (this.f13776a) {
            case 0:
                return new e8.p(13, this.f13777b);
            case 1:
                o2.w wVar = (o2.w) obj;
                w0 w0Var = this.f13777b;
                x1.c cVar = (x1.c) w0Var.f13988j.getValue();
                if (cVar == null) {
                    return null;
                }
                o2.w wVar2 = w0Var.f13989l;
                if (wVar2 != null) {
                    return androidx.compose.foundation.text.contextmenu.modifier.a.d(cVar, wVar2, wVar);
                }
                c0.b.d("Required value was null.");
                throw new cc.s();
            case 2:
                long jLongValue = ((Long) obj).longValue();
                w0 w0Var2 = this.f13777b;
                if (w0Var2.f13979a.a().b(jLongValue)) {
                    w0Var2.j();
                    w0Var2.m(null);
                }
                return t8.z.f12851a;
            case 3:
                long jLongValue2 = ((Long) obj).longValue();
                w0 w0Var3 = this.f13777b;
                z zVarG = w0Var3.g();
                if (zVarG != null && (yVar2 = zVarG.f14018a) != null && jLongValue2 == yVar2.f14011c) {
                    w0Var3.f13993p.setValue(null);
                }
                z zVarG2 = w0Var3.g();
                if (zVarG2 != null && (yVar = zVarG2.f14019b) != null && jLongValue2 == yVar.f14011c) {
                    w0Var3.f13994q.setValue(null);
                }
                if (w0Var3.f13979a.a().b(jLongValue2)) {
                    w0Var3.p();
                }
                return t8.z.f12851a;
            case 4:
                o2.w wVar3 = (o2.w) obj;
                w0 w0Var4 = this.f13777b;
                w0Var4.f13989l = wVar3;
                if (((Boolean) w0Var4.f13987i.getValue()).booleanValue() && w0Var4.g() != null) {
                    x1.b bVar = wVar3 != null ? new x1.b(wVar3.d(0L)) : null;
                    if (!i9.l.a(w0Var4.k, bVar)) {
                        w0Var4.k = bVar;
                        w0Var4.n();
                        w0Var4.p();
                    }
                }
                return t8.z.f12851a;
            case 5:
                w0 w0Var5 = this.f13777b;
                f1.k1 k1Var = w0Var5.f13987i;
                w1.r rVar = (w1.r) obj;
                if (!rVar.a() && ((Boolean) k1Var.getValue()).booleanValue()) {
                    w0Var5.j();
                }
                k1Var.setValue(Boolean.valueOf(rVar.a()));
                return t8.z.f12851a;
            case 6:
                this.f13777b.l(((Boolean) obj).booleanValue());
                return t8.z.f12851a;
            case 7:
                this.f13777b.m((z) obj);
                return t8.z.f12851a;
            default:
                long jLongValue3 = ((Long) obj).longValue();
                w0 w0Var6 = this.f13777b;
                boolean zB = w0Var6.f13979a.a().b(jLongValue3);
                t8.z zVar = t8.z.f12851a;
                if (zB) {
                    w0Var6.f13990m.setValue(zVar);
                    w0Var6.n();
                    w0Var6.p();
                }
                return zVar;
        }
    }
}
