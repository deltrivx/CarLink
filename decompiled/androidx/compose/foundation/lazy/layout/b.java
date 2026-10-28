package androidx.compose.foundation.lazy.layout;

import a2.f;
import g7.l;
import h0.a0;
import h0.q;
import h0.r;
import h0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import q2.z0;
import r1.o;
import r1.p;
import s.h0;
import s.i0;
import s.o0;
import s.p0;
import u8.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f846i;

    public b() {
        long[] jArr = o0.f12476a;
        this.f838a = new h0();
        i0 i0Var = p0.f12478a;
        this.f840c = new i0();
        this.f841d = new ArrayList();
        this.f842e = new ArrayList();
        this.f843f = new ArrayList();
        this.f844g = new ArrayList();
        this.f845h = new ArrayList();
        this.f846i = new z0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f832a;

            {
                this.f832a = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && i9.l.a(this.f832a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f832a);
            }

            public final int hashCode() {
                return this.f832a.hashCode();
            }

            @Override // q2.z0
            public final o i() {
                q qVar = new q();
                qVar.f6356o = this.f832a;
                return qVar;
            }

            @Override // q2.z0
            public final void j(o oVar) {
                q qVar = (q) oVar;
                b bVar = qVar.f6356o;
                b bVar2 = this.f832a;
                if (i9.l.a(bVar, bVar2) || !qVar.f11117a.f11129n) {
                    return;
                }
                b bVar3 = qVar.f6356o;
                bVar3.d();
                bVar3.f839b = null;
                qVar.f6356o = bVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f832a + ')';
            }
        };
    }

    public static int e(int[] iArr, y yVar) {
        int iJ = yVar.j();
        int iD = yVar.d() + iJ;
        int iMax = 0;
        while (iJ < iD) {
            int iC = yVar.c() + iArr[iJ];
            iArr[iJ] = iC;
            iMax = Math.max(iMax, iC);
            iJ++;
        }
        return iMax;
    }

    public final void a(int i7, Object obj) {
        f.N(this.f838a.g(obj));
    }

    public final long b() {
        ArrayList arrayList = this.f845h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        f.N(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0092 A[EDGE_INSN: B:108:0x0092->B:33:0x0092 BREAK  A[LOOP:2: B:21:0x005a->B:32:0x008f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[LOOP:2: B:21:0x005a->B:32:0x008f, LOOP_END] */
    public final void c(int i7, int i10, ArrayList arrayList, l lVar, a0 a0Var, boolean z10, int i11, boolean z11, int i12, int i13) throws Throwable {
        Throwable th;
        l lVar2 = this.f839b;
        this.f839b = lVar;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            y yVar = (y) arrayList.get(i14);
            int iB = yVar.b();
            for (int i15 = 0; i15 < iB; i15++) {
                yVar.e(i15);
            }
        }
        h0 h0Var = this.f838a;
        if (h0Var.i()) {
            d();
            return;
        }
        boolean z12 = z10 || !z11;
        Object[] objArr = h0Var.f12438b;
        long[] jArr = h0Var.f12437a;
        int length = jArr.length - 2;
        i0 i0Var = this.f840c;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j5 = jArr[i16];
                int i17 = i16;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i17 != length) {
                        break;
                        break;
                    }
                    i16 = i17 + 1;
                } else {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    long j10 = j5;
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j10 & 255) < 128) {
                            i0Var.a(objArr[(i17 << 3) + i19]);
                        }
                        j10 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    } else if (i17 != length) {
                        break;
                    } else {
                        i16 = i17 + 1;
                    }
                }
            }
        }
        int size2 = arrayList.size();
        for (int i20 = 0; i20 < size2; i20++) {
            y yVar2 = (y) arrayList.get(i20);
            i0Var.l(yVar2.getKey());
            int iB2 = yVar2.b();
            for (int i21 = 0; i21 < iB2; i21++) {
                yVar2.e(i21);
            }
            f.N(this.f838a.k(yVar2.getKey()));
        }
        int[] iArr = new int[i11];
        ArrayList arrayList2 = this.f842e;
        ArrayList arrayList3 = this.f841d;
        if (z12 && lVar2 != null) {
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    t.b0(arrayList3, new r(lVar2, 2));
                }
                if (arrayList3.size() > 0) {
                    y yVar3 = (y) arrayList3.get(0);
                    e(iArr, yVar3);
                    Object objG = h0Var.g(yVar3.getKey());
                    i9.l.b(objG);
                    f.N(objG);
                    yVar3.i(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, i11, 0);
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    t.b0(arrayList2, new r(lVar2, 0));
                }
                if (arrayList2.size() > 0) {
                    y yVar4 = (y) arrayList2.get(0);
                    e(iArr, yVar4);
                    Object objG2 = h0Var.g(yVar4.getKey());
                    i9.l.b(objG2);
                    f.N(objG2);
                    yVar4.i(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, i11, 0);
            }
        }
        Object[] objArr2 = i0Var.f12445b;
        long[] jArr2 = i0Var.f12444a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            Throwable th2 = null;
            int i22 = 0;
            while (true) {
                long j11 = jArr2[i22];
                th = th2;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                    long j12 = j11;
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j12 & 255) < 128) {
                            f.N(h0Var.g(objArr2[(i22 << 3) + i24]));
                        }
                        j12 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length2) {
                    break;
                }
                i22++;
                th2 = th;
            }
        } else {
            th = null;
        }
        ArrayList arrayList4 = this.f843f;
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                t.b0(arrayList4, new r(lVar, 3));
            }
            if (arrayList4.size() > 0) {
                y yVar5 = (y) arrayList4.get(0);
                Object objG3 = h0Var.g(yVar5.getKey());
                i9.l.b(objG3);
                f.N(objG3);
                e(iArr, yVar5);
                if (!z10) {
                    throw th;
                }
                ((y) u8.p.k0(arrayList)).i(0);
                throw th;
            }
            Arrays.fill(iArr, 0, i11, 0);
        }
        ArrayList arrayList5 = this.f844g;
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                t.b0(arrayList5, new r(lVar, 1));
            }
            if (arrayList5.size() > 0) {
                y yVar6 = (y) arrayList5.get(0);
                Object objG4 = h0Var.g(yVar6.getKey());
                i9.l.b(objG4);
                f.N(objG4);
                e(iArr, yVar6);
                if (!z10) {
                    throw th;
                }
                ((y) u8.p.s0(arrayList)).i(0);
                throw th;
            }
        }
        Collections.reverse(arrayList4);
        arrayList.addAll(0, arrayList4);
        arrayList.addAll(arrayList5);
        arrayList3.clear();
        arrayList2.clear();
        arrayList4.clear();
        arrayList5.clear();
        i0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[LOOP:0: B:7:0x0015->B:18:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x004f A[EDGE_INSN: B:22:0x004f->B:19:0x004f BREAK  A[LOOP:0: B:7:0x0015->B:18:0x004c], SYNTHETIC] */
    public final void d() {
        h0 h0Var = this.f838a;
        if (h0Var.j()) {
            Object[] objArr = h0Var.f12439c;
            long[] jArr = h0Var.f12437a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j5 = jArr[i7];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i7 != length) {
                            break;
                            break;
                        }
                        i7++;
                    } else {
                        int i10 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j5) < 128) {
                                f.N(objArr[(i7 << 3) + i11]);
                                throw null;
                            }
                            j5 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        } else if (i7 != length) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
            h0Var.a();
        }
    }
}
