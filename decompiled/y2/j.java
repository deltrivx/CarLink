package y2;

import java.util.Iterator;
import r2.j0;
import s.h0;
import s.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Iterable, j9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f15011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s.t f15012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15014d;

    public j() {
        long[] jArr = o0.f12476a;
        this.f15011a = new h0();
    }

    public final boolean c(u uVar) {
        return this.f15011a.c(uVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0028->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[EDGE_INSN: B:18:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0028->B:15:0x005f], SYNTHETIC] */
    public final j d() {
        j jVar = new j();
        jVar.f15013c = this.f15013c;
        jVar.f15014d = this.f15014d;
        h0 h0Var = jVar.f15011a;
        h0Var.getClass();
        h0 h0Var2 = this.f15011a;
        i9.l.e(h0Var2, "from");
        Object[] objArr = h0Var2.f12438b;
        Object[] objArr2 = h0Var2.f12439c;
        long[] jArr = h0Var2.f12437a;
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
                            int i12 = (i7 << 3) + i11;
                            h0Var.m(objArr[i12], objArr2[i12]);
                        }
                        j5 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i7 != length) {
                        break;
                    }
                    i7++;
                }
            }
        }
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i9.l.a(this.f15011a, jVar.f15011a) && this.f15013c == jVar.f15013c && this.f15014d == jVar.f15014d;
    }

    public final int hashCode() {
        return (((this.f15011a.hashCode() * 31) + (this.f15013c ? 1231 : 1237)) * 31) + (this.f15014d ? 1231 : 1237);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        s.t tVar = this.f15012b;
        if (tVar == null) {
            h0 h0Var = this.f15011a;
            h0Var.getClass();
            s.t tVar2 = new s.t(h0Var);
            this.f15012b = tVar2;
            tVar = tVar2;
        }
        return ((s.h) tVar.entrySet()).iterator();
    }

    public final Object k(u uVar) {
        Object objG = this.f15011a.g(uVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + uVar + " - consider getOrElse or getOrNull");
    }

    public final void m(j jVar) {
        h0 h0Var = jVar.f15011a;
        Object[] objArr = h0Var.f12438b;
        Object[] objArr2 = h0Var.f12439c;
        long[] jArr = h0Var.f12437a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
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
                        u uVar = (u) obj;
                        h0 h0Var2 = this.f15011a;
                        Object objG = h0Var2.g(uVar);
                        i9.l.c(uVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = uVar.f15079b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            h0Var2.m(uVar, objInvoke);
                        }
                    }
                    j5 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void n(u uVar, Object obj) {
        boolean z10 = obj instanceof a;
        h0 h0Var = this.f15011a;
        if (z10 && h0Var.c(uVar)) {
            Object objG = h0Var.g(uVar);
            i9.l.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.f14969a;
            if (str == null) {
                str = aVar.f14969a;
            }
            t8.e eVar = aVar2.f14970b;
            if (eVar == null) {
                eVar = aVar.f14970b;
            }
            h0Var.m(uVar, new a(str, eVar));
        } else {
            h0Var.m(uVar, obj);
        }
        uVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f15013c) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f15014d) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        h0 h0Var = this.f15011a;
        Object[] objArr = h0Var.f12438b;
        Object[] objArr2 = h0Var.f12439c;
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
                            int i12 = (i7 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            sb2.append(str);
                            sb2.append(((u) obj).f15078a);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j5 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i7 != length) {
                        break;
                    }
                    i7++;
                }
            }
        }
        return j0.v(this) + "{ " + ((Object) sb2) + " }";
    }
}
