package d8;

import b3.b0;
import b8.a1;
import b8.n2;
import b8.u0;
import h0.g0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3806b;

    public /* synthetic */ g(int i7, int i10) {
        this.f3805a = i10;
        this.f3806b = i7;
    }

    public /* synthetic */ g(f0.u uVar, int i7) {
        this.f3805a = 2;
        this.f3806b = i7;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f3805a;
        Object obj2 = null;
        z zVar = z.f12851a;
        int i10 = this.f3806b;
        switch (i7) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                u0 u0VarA = l.a(i10, iIntValue);
                if (u0VarA != null) {
                    hc.c cVar = v.f3842a;
                    v.a(new u0(i10, iIntValue, u0VarA.f1658d));
                }
                break;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                n2.Companion.getClass();
                yb.g gVar = new yb.g(new yb.h(yb.l.S(yb.l.O(u8.p.f0((Iterable) n2.f1622h.getValue()), new b0(15)), new b0(10)), true, k.f3817c));
                while (gVar.hasNext()) {
                    Object next = gVar.next();
                    a1 a1Var = (a1) next;
                    if (a1Var.f1564b == i10 && a1Var.f1565c == iIntValue2) {
                        obj2 = next;
                        if (((a1) obj2) != null) {
                            hc.c cVar2 = v.f3842a;
                            v.a(new a1(i10, iIntValue2));
                        }
                        break;
                    }
                }
                if (((a1) obj2) != null) {
                    hc.c cVar3 = v.f3842a;
                    v.a(new a1(i10, iIntValue2));
                }
                break;
            default:
                g0 g0Var = (g0) obj;
                p1.f fVarH = n4.e.h();
                n4.e.r(fVarH, n4.e.k(fVarH), fVarH != null ? fVarH.e() : null);
                int i11 = g0Var.f6316a;
                if (i11 == -1) {
                    i11 = 2;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    g0Var.a(i10 + i12);
                }
                break;
        }
        return zVar;
    }
}
