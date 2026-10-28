package ga;

import aa.s0;
import aa.y0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h9.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f6053b = new d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f6054c = new d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f6055d = new d(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f6056e = new d(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f6057f = new d(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f6058g = new d(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f6059h = new d(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6060a;

    public /* synthetic */ d(int i7) {
        this.f6060a = i7;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        x9.c cVarB;
        String strZ;
        boolean z10 = false;
        switch (this.f6060a) {
            case 0:
                x9.c cVar = (x9.c) obj;
                int i7 = e.f6066l;
                i9.l.e(cVar, "it");
                return Boolean.valueOf(u8.p.g0(h0.f6087f, n3.n.Z(cVar)));
            case 1:
                x9.c cVar2 = (x9.c) obj;
                int i10 = e.f6066l;
                i9.l.e(cVar2, "it");
                if ((cVar2 instanceof x9.t) && u8.p.g0(h0.f6087f, n3.n.Z(cVar2))) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                x9.c cVar3 = (x9.c) obj;
                i9.l.e(cVar3, "it");
                return Boolean.valueOf(k9.a.A(cVar3));
            case 3:
                return ((y0) obj).getType();
            case 4:
                x9.c cVar4 = (x9.c) obj;
                i9.l.e(cVar4, "it");
                return Boolean.valueOf(k9.a.A(db.e.k(cVar4)));
            case 5:
                x9.c cVar5 = (x9.c) obj;
                i9.l.e(cVar5, "it");
                int i11 = c.f6047l;
                s0 s0Var = (s0) cVar5;
                if (u9.i.A(s0Var) && db.e.b(s0Var, new aa.a(7, s0Var)) != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                x9.c cVar6 = (x9.c) obj;
                i9.l.e(cVar6, "it");
                if (u9.i.A(cVar6)) {
                    int i12 = e.f6066l;
                    e0 e0Var = null;
                    if (h0.f6086e.contains(cVar6.getName()) && (cVarB = db.e.b(cVar6, f6054c)) != null && (strZ = n3.n.Z(cVarB)) != null) {
                        if (h0.f6083b.contains(strZ)) {
                            e0Var = e0.f6067a;
                        } else {
                            e0Var = ((g0) u8.b0.V0(strZ, h0.f6085d)) == g0.f6075b ? e0.f6069c : e0.f6068b;
                        }
                    }
                    if (e0Var != null) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
