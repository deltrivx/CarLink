package y2;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import o2.d1;
import q2.h0;
import q2.h1;
import q2.y1;
import s.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1.c f15030a = new x1.c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Code duplicated, block: B:35:0x0061 A[LOOP:0: B:4:0x000b->B:35:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0064 A[EDGE_INSN: B:43:0x0064->B:36:0x0064 BREAK  A[LOOP:0: B:4:0x000b->B:35:0x0061], SYNTHETIC] */
    public static final m a(h0 h0Var, boolean z10) {
        r1.o oVar = h0Var.E.f10617f;
        Object obj = null;
        if ((oVar.f11120d & 8) != 0) {
            loop0: while (oVar != null) {
                if ((oVar.f11119c & 8) == 0) {
                    if ((oVar.f11120d & 8) != 0) {
                        break;
                        break;
                    }
                    oVar = oVar.f11122f;
                } else {
                    r1.o oVarF = oVar;
                    h1.e eVar = null;
                    while (oVarF != null) {
                        if (oVarF instanceof y1) {
                            obj = oVarF;
                            break loop0;
                        }
                        if ((oVarF.f11119c & 8) != 0 && (oVarF instanceof q2.m)) {
                            int i7 = 0;
                            for (r1.o oVar2 = ((q2.m) oVarF).f10746p; oVar2 != null; oVar2 = oVar2.f11122f) {
                                if ((oVar2.f11119c & 8) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        oVarF = oVar2;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new h1.e(new r1.o[16]);
                                        }
                                        if (oVarF != null) {
                                            eVar.b(oVarF);
                                            oVarF = null;
                                        }
                                        eVar.b(oVar2);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        oVarF = q2.f.f(eVar);
                    }
                    if ((oVar.f11120d & 8) != 0) {
                        break;
                    }
                    oVar = oVar.f11122f;
                }
            }
        }
        i9.l.b(obj);
        r1.o oVar3 = ((r1.o) ((y1) obj)).f11117a;
        j jVarX = h0Var.x();
        if (jVarX == null) {
            jVarX = new j();
        }
        return new m(oVar3, z10, h0Var, jVarX);
    }

    public static final w b(o oVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            m mVarA = oVar.a();
            h0 h0Var = mVarA.f15019c;
            if (h0Var.J() && h0Var.I()) {
                w wVar = new w(48);
                wb.b bVar = new wb.b(6);
                n3.k kVarQ = n3.l.Q(mVarA.g());
                ((Region) bVar.f14284a).set(kVarQ.f8741a, kVarQ.f8742b, kVarQ.f8743c, kVarQ.f8744d);
                c(bVar, mVarA, wVar, mVarA, new wb.b(6));
                return wVar;
            }
            w wVar2 = s.l.f12468a;
            i9.l.c(wVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return wVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(wb.b bVar, m mVar, w wVar, m mVar2, wb.b bVar2) {
        x1.c cVarA1;
        h0 h0Var;
        int i7 = mVar.f15023g;
        Region region = (Region) bVar2.f14284a;
        h0 h0Var2 = mVar2.f15019c;
        int i10 = mVar2.f15023g;
        boolean z10 = (h0Var2.J() && h0Var2.I()) ? false : true;
        Region region2 = (Region) bVar.f14284a;
        if (!region2.isEmpty() || i10 == i7) {
            if (!z10 || mVar2.f15021e) {
                Object objF = mVar2.f();
                if (objF == null) {
                    cVarA1 = h0Var2.E.f10614c.a1();
                } else {
                    r1.o oVar = ((r1.o) objF).f11117a;
                    Object objG = mVar2.f15020d.f15011a.g(i.f14987b);
                    if (objG == null) {
                        objG = null;
                    }
                    boolean z11 = objG != null;
                    if (!oVar.f11117a.f11129n) {
                        cVarA1 = x1.c.f14522e;
                    } else if (z11) {
                        cVarA1 = q2.f.t(oVar, 8).a1();
                    } else {
                        h1 h1VarT = q2.f.t(oVar, 8);
                        cVarA1 = d1.g(h1VarT).h(h1VarT, true);
                    }
                }
                n3.k kVarQ = n3.l.Q(cVarA1);
                region.set(kVarQ.f8741a, kVarQ.f8742b, kVarQ.f8743c, kVarQ.f8744d);
                if (i10 == i7) {
                    i10 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (mVar2.f15021e) {
                        m mVarL = mVar2.l();
                        wVar.h(i10, new n(mVar2, n3.l.Q((mVarL == null || (h0Var = mVarL.f15019c) == null || !h0Var.J()) ? f15030a : mVarL.g())));
                        return;
                    } else {
                        if (i10 == -1) {
                            Rect bounds = region.getBounds();
                            wVar.h(i10, new n(mVar2, new n3.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                wVar.h(i10, new n(mVar2, new n3.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listJ = m.j(4, mVar2);
                for (int size = listJ.size() - 1; -1 < size; size--) {
                    if (!((m) listJ.get(size)).k().f15011a.c(r.f15074z)) {
                        c(bVar, mVar, wVar, (m) listJ.get(size), bVar2);
                    }
                }
                if (f(mVar2)) {
                    region2.op(kVarQ.f8741a, kVarQ.f8742b, kVarQ.f8743c, kVarQ.f8744d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(j jVar, u uVar) {
        Object objG = jVar.f15011a.g(uVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final boolean e(m mVar) {
        h1 h1VarD = mVar.d();
        j jVar = mVar.f15020d;
        if (h1VarD != null ? h1VarD.O0() : false) {
            return true;
        }
        u uVar = r.f15050a;
        if (jVar.f15011a.c(r.f15064p)) {
            return true;
        }
        return jVar.f15011a.c(r.f15063o);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean f(m mVar) {
        if (!e(mVar)) {
            j jVar = mVar.f15020d;
            if (jVar.f15013c) {
                return true;
            }
            s.h0 h0Var = jVar.f15011a;
            Object[] objArr = h0Var.f12438b;
            Object[] objArr2 = h0Var.f12439c;
            long[] jArr = h0Var.f12437a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j5 = jArr[i7];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j5) < 128) {
                                int i12 = (i7 << 3) + i11;
                                Object obj = objArr[i12];
                                Object obj2 = objArr2[i12];
                                if (((u) obj).f15080c) {
                                    return true;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i10 == 8) {
                            if (i7 != length) {
                                i7++;
                            }
                        }
                    } else if (i7 != length) {
                        i7++;
                    }
                }
            }
        }
        return false;
    }
}
