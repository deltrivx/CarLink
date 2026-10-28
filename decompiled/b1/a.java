package b1;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import c1.i2;
import e2.k0;
import f1.b1;
import f1.h1;
import f1.k1;
import f1.y;
import java.util.HashSet;
import java.util.Iterator;
import o2.b0;
import o2.i0;
import o2.w;
import q2.h0;
import q2.l0;
import q2.u0;
import r2.p0;
import r3.v;
import t8.z;
import w1.s;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i9.n implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1120b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, Object obj) {
        super(0);
        this.f1119a = i7;
        this.f1120b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x015a A[LOOP:3: B:60:0x0124->B:70:0x015a, LOOP_END] */
    @Override // h9.a
    public final Object invoke() {
        h9.a aVar;
        y yVar;
        switch (this.f1119a) {
            case 0:
                k1 k1Var = ((b) this.f1120b).f1130j;
                k1Var.setValue(Boolean.valueOf(!((Boolean) k1Var.getValue()).booleanValue()));
                return z.f12851a;
            case 1:
                q2.f.l((c) this.f1120b);
                return z.f12851a;
            case 2:
                return (g) ((b1) this.f1120b).getValue();
            case 3:
                i2 i2Var = (i2) this.f1120b;
                if (!((Boolean) i2Var.k.getValue()).booleanValue() && (aVar = i2Var.f1923b) != null) {
                    aVar.invoke();
                }
                return z.f12851a;
            case 4:
                k0 k0Var = (k0) this.f1120b;
                int i7 = k0Var.k;
                h1 h1Var = k0Var.f4214h;
                if (i7 == h1Var.f()) {
                    h1Var.g(h1Var.f() + 1);
                }
                return z.f12851a;
            case 5:
                Object systemService = ((View) ((a2.b) this.f1120b).f12b).getContext().getSystemService("input_method");
                i9.l.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 6:
                return new BaseInputConnection(((g3.z) this.f1120b).f5899a, false);
            case 7:
                return ((j2.d) this.f1120b).f6904d;
            case 8:
                return ((j2.g) this.f1120b).A0();
            case 9:
                b0 b0Var = (b0) this.f1120b;
                if (!((Boolean) b0Var.f9298g.getValue()).booleanValue() && (yVar = b0Var.f9294c) != null) {
                    yVar.l();
                }
                return z.f12851a;
            case 10:
                i0 i0VarA = ((o2.h1) this.f1120b).a();
                h0 h0Var = i0VarA.f9341a;
                if (i0VarA.f9353n != ((h1.e) ((h1.b) h0Var.o()).f6413b).f6423c) {
                    s.h0 h0Var2 = i0VarA.f9346f;
                    Object[] objArr = h0Var2.f12439c;
                    long[] jArr = h0Var2.f12437a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j5 = jArr[i10];
                            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((255 & j5) < 128) {
                                        ((b0) objArr[(i10 << 3) + i12]).f9295d = true;
                                    }
                                    j5 >>= 8;
                                }
                                if (i11 == 8) {
                                    if (i10 != length) {
                                        i10++;
                                    }
                                }
                            } else if (i10 != length) {
                                i10++;
                            }
                        }
                    }
                    if (h0Var.f10673g != null) {
                        if (!h0Var.F.f10733e) {
                            h0.T(h0Var, false, 7);
                        }
                    } else if (!h0Var.r()) {
                        h0.V(h0Var, false, 7);
                    }
                }
                return z.f12851a;
            case 11:
                p2.c cVar = (p2.c) this.f1120b;
                h1.e eVar = cVar.f10119c;
                h1.e eVar2 = cVar.f10118b;
                h1.e eVar3 = cVar.f10121e;
                cVar.f10122f = false;
                HashSet hashSet = new HashSet();
                h1.e eVar4 = cVar.f10120d;
                Object[] objArr2 = eVar4.f6421a;
                int i13 = eVar4.f6423c;
                for (int i14 = 0; i14 < i13; i14++) {
                    h0 h0Var3 = (h0) objArr2[i14];
                    p2.f fVar = (p2.f) eVar3.f6421a[i14];
                    r1.o oVar = h0Var3.E.f10617f;
                    if (oVar.f11129n) {
                        p2.c.b(oVar, fVar, hashSet);
                    }
                }
                eVar4.h();
                eVar3.h();
                Object[] objArr3 = eVar2.f6421a;
                int i15 = eVar2.f6423c;
                for (int i16 = 0; i16 < i15; i16++) {
                    q2.c cVar2 = (q2.c) objArr3[i16];
                    p2.f fVar2 = (p2.f) eVar.f6421a[i16];
                    if (cVar2.f11129n) {
                        p2.c.b(cVar2, fVar2, hashSet);
                    }
                }
                eVar2.h();
                eVar.h();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((q2.c) it.next()).C0();
                }
                return z.f12851a;
            case 12:
                l0 l0Var = ((h0) this.f1120b).F;
                l0Var.f10743p.f10867y = true;
                u0 u0Var = l0Var.f10744q;
                if (u0Var != null) {
                    u0Var.f10822s = true;
                }
                return z.f12851a;
            case 13:
                h9.k kVar = (h9.k) this.f1120b;
                y1.i0 i0Var = q2.h1.J;
                kVar.invoke(i0Var);
                i0Var.f14918q = i0Var.k.a(i0Var.f14914m, i0Var.f14916o, i0Var.f14915n);
                return z.f12851a;
            case 14:
                cc.b0.e(((p0) this.f1120b).f11361c, null);
                return z.f12851a;
            case 15:
                return z.f12851a;
            case 16:
                v vVar = (v) this.f1120b;
                w parentLayoutCoordinates = vVar.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || vVar.m33getPopupContentSizebOM6tXw() == null) ? false : true);
            case 17:
                ((s) this.f1120b).B0();
                return z.f12851a;
            default:
                z2.a aVar2 = (z2.a) this.f1120b;
                aVar2.f15700g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar2.a();
                    return z.f12851a;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
