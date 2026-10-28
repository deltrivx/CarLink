package h1;

import i9.l;
import java.util.NoSuchElementException;
import s.d0;
import s.h0;
import s.m0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f6411a;

    public /* synthetic */ a(h0 h0Var) {
        this.f6411a = h0Var;
    }

    public static final Object a(h0 h0Var) {
        Object objG = h0Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof d0)) {
            h0Var.k(null);
            return objG;
        }
        d0 d0Var = (d0) objG;
        if (d0Var.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i7 = d0Var.f12408b - 1;
        Object objE = d0Var.e(i7);
        d0Var.j(i7);
        l.c(objE, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (d0Var.g()) {
            h0Var.k(null);
        }
        if (d0Var.f12408b == 1) {
            h0Var.m(null, d0Var.d());
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085 A[LOOP:0: B:9:0x001e->B:28:0x0085, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[EDGE_INSN: B:31:0x0088->B:29:0x0088 BREAK  A[LOOP:0: B:9:0x001e->B:28:0x0085], SYNTHETIC] */
    public static final d0 b(h0 h0Var) {
        if (h0Var.i()) {
            d0 d0Var = m0.f12472b;
            l.c(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return d0Var;
        }
        d0 d0Var2 = new d0();
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
                            Object obj = objArr[(i7 << 3) + i11];
                            if (obj instanceof d0) {
                                d0 d0Var3 = (d0) obj;
                                if (!d0Var3.g()) {
                                    int i12 = d0Var2.f12408b + d0Var3.f12408b;
                                    Object[] objArr2 = d0Var2.f12407a;
                                    if (objArr2.length < i12) {
                                        d0Var2.l(objArr2, i12);
                                    }
                                    u8.l.p0(d0Var3.f12407a, d0Var2.f12407a, d0Var2.f12408b, 0, d0Var3.f12408b);
                                    d0Var2.f12408b += d0Var3.f12408b;
                                }
                            } else {
                                l.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                d0Var2.a(obj);
                            }
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
        return d0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return l.a(this.f6411a, ((a) obj).f6411a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6411a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f6411a + ')';
    }
}
