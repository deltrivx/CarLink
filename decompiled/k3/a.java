package k3;

import a2.b;
import android.graphics.Typeface;
import android.text.Spannable;
import b3.h0;
import cc.b0;
import ec.h;
import f3.e;
import f3.i;
import f3.j;
import f3.k;
import f3.n;
import f3.p;
import h9.o;
import i9.l;
import j3.c;
import j3.d;
import k2.v;
import t8.z;
import z.e0;
import z.f0;
import z.m;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7307c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f7305a = i7;
        this.f7306b = obj;
        this.f7307c = obj2;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f7305a) {
            case 0:
                Spannable spannable = (Spannable) this.f7306b;
                c cVar = (c) this.f7307c;
                h0 h0Var = (h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                n nVar = h0Var.f1361f;
                k kVar = h0Var.f1358c;
                if (kVar == null) {
                    kVar = k.f5258c;
                }
                i iVar = h0Var.f1359d;
                int i7 = iVar != null ? iVar.f5255a : 0;
                j jVar = h0Var.f1360e;
                int i10 = jVar != null ? jVar.f5256a : 65535;
                d dVar = (d) cVar.f6922b;
                p pVarB = ((e) dVar.f6927e).b(nVar, kVar, i7, i10);
                if (pVarB instanceof p) {
                    Object obj4 = pVarB.f5270a;
                    l.c(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                } else {
                    b bVar = new b(pVarB, dVar.f6932j);
                    dVar.f6932j = bVar;
                    Object obj5 = bVar.f14d;
                    l.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj5;
                }
                spannable.setSpan(new e3.b(1, typeface), iIntValue, iIntValue2, 33);
                break;
            default:
                f0 f0Var = (f0) this.f7306b;
                l2.d dVar2 = (l2.d) this.f7307c;
                v vVar = (v) obj;
                v vVar2 = (v) obj2;
                x1.b bVar2 = (x1.b) obj3;
                f0Var.f15374x = 0L;
                if (((Boolean) f0Var.f15368r.invoke(vVar)).booleanValue()) {
                    if (!f0Var.f15373w) {
                        if (f0Var.f15371u == null) {
                            f0Var.f15371u = i2.c.c(Integer.MAX_VALUE, 6, null);
                        }
                        f0Var.f15373w = true;
                        b0.s(f0Var.m0(), null, new e0(f0Var, null), 3);
                    }
                    g5.a.l(dVar2, vVar, 0L);
                    long jG = x1.b.g(vVar2.f7280c, bVar2.f14521a);
                    h hVar = f0Var.f15371u;
                    if (hVar != null) {
                        hVar.x(new m(jG));
                    }
                }
                break;
        }
        return z.f12851a;
    }
}
