package s;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f12479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f12480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f12481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f12482d;

    public q(int i7) {
        if (i7 == 0) {
            this.f12480b = t.a.f12720b;
            this.f12481c = t.a.f12721c;
            return;
        }
        int i10 = i7 * 8;
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                i10 = i12;
                break;
            }
        }
        int i13 = i10 / 8;
        this.f12480b = new long[i13];
        this.f12481c = new Object[i13];
    }

    public /* synthetic */ q(Object obj) {
        this(10);
    }

    public final void a(long j5, Long l10) {
        int i7 = this.f12482d;
        if (i7 != 0 && j5 <= this.f12480b[i7 - 1]) {
            f(j5, l10);
            return;
        }
        if (this.f12479a) {
            long[] jArr = this.f12480b;
            if (i7 >= jArr.length) {
                Object[] objArr = this.f12481c;
                int i10 = 0;
                for (int i11 = 0; i11 < i7; i11++) {
                    Object obj = objArr[i11];
                    if (obj != r.f12486a) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f12479a = false;
                this.f12482d = i10;
            }
        }
        int i12 = this.f12482d;
        if (i12 >= this.f12480b.length) {
            int i13 = (i12 + 1) * 8;
            for (int i14 = 4; i14 < 32; i14++) {
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
            }
            int i16 = i13 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f12480b, i16);
            i9.l.d(jArrCopyOf, "copyOf(...)");
            this.f12480b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12481c, i16);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            this.f12481c = objArrCopyOf;
        }
        this.f12480b[i12] = j5;
        this.f12481c[i12] = l10;
        this.f12482d = i12 + 1;
    }

    public final void b() {
        int i7 = this.f12482d;
        Object[] objArr = this.f12481c;
        for (int i10 = 0; i10 < i7; i10++) {
            objArr[i10] = null;
        }
        this.f12482d = 0;
        this.f12479a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final q clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        i9.l.c(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        q qVar = (q) objClone;
        qVar.f12480b = (long[]) this.f12480b.clone();
        qVar.f12481c = (Object[]) this.f12481c.clone();
        return qVar;
    }

    public final Object d(long j5) {
        Object obj;
        int iB = t.a.b(this.f12480b, this.f12482d, j5);
        if (iB < 0 || (obj = this.f12481c[iB]) == r.f12486a) {
            return -1L;
        }
        return obj;
    }

    public final long e(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f12482d)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f12479a) {
            long[] jArr = this.f12480b;
            Object[] objArr = this.f12481c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != r.f12486a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f12479a = false;
            this.f12482d = i11;
        }
        return this.f12480b[i7];
    }

    public final void f(long j5, Object obj) {
        Object obj2 = r.f12486a;
        int iB = t.a.b(this.f12480b, this.f12482d, j5);
        if (iB >= 0) {
            this.f12481c[iB] = obj;
            return;
        }
        int i7 = ~iB;
        int i10 = this.f12482d;
        if (i7 < i10) {
            Object[] objArr = this.f12481c;
            if (objArr[i7] == obj2) {
                this.f12480b[i7] = j5;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f12479a) {
            long[] jArr = this.f12480b;
            if (i10 >= jArr.length) {
                Object[] objArr2 = this.f12481c;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj3 = objArr2[i12];
                    if (obj3 != obj2) {
                        if (i12 != i11) {
                            jArr[i11] = jArr[i12];
                            objArr2[i11] = obj3;
                            objArr2[i12] = null;
                        }
                        i11++;
                    }
                }
                this.f12479a = false;
                this.f12482d = i11;
                i7 = ~t.a.b(this.f12480b, i11, j5);
            }
        }
        int i13 = this.f12482d;
        if (i13 >= this.f12480b.length) {
            int i14 = (i13 + 1) * 8;
            for (int i15 = 4; i15 < 32; i15++) {
                int i16 = (1 << i15) - 12;
                if (i14 <= i16) {
                    i14 = i16;
                    break;
                }
            }
            int i17 = i14 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f12480b, i17);
            i9.l.d(jArrCopyOf, "copyOf(...)");
            this.f12480b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12481c, i17);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            this.f12481c = objArrCopyOf;
        }
        int i18 = this.f12482d;
        if (i18 - i7 != 0) {
            long[] jArr2 = this.f12480b;
            int i19 = i7 + 1;
            u8.l.o0(jArr2, jArr2, i19, i7, i18);
            Object[] objArr3 = this.f12481c;
            u8.l.p0(objArr3, objArr3, i19, i7, this.f12482d);
        }
        this.f12480b[i7] = j5;
        this.f12481c[i7] = obj;
        this.f12482d++;
    }

    public final void g(long j5) {
        int iB = t.a.b(this.f12480b, this.f12482d, j5);
        if (iB >= 0) {
            Object[] objArr = this.f12481c;
            Object obj = objArr[iB];
            Object obj2 = r.f12486a;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f12479a = true;
            }
        }
    }

    public final int h() {
        if (this.f12479a) {
            int i7 = this.f12482d;
            long[] jArr = this.f12480b;
            Object[] objArr = this.f12481c;
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                Object obj = objArr[i11];
                if (obj != r.f12486a) {
                    if (i11 != i10) {
                        jArr[i10] = jArr[i11];
                        objArr[i10] = obj;
                        objArr[i11] = null;
                    }
                    i10++;
                }
            }
            this.f12479a = false;
            this.f12482d = i10;
        }
        return this.f12482d;
    }

    public final Object i(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f12482d)) {
            t.a.c("Expected index to be within 0..size()-1, but was " + i7);
            throw null;
        }
        if (this.f12479a) {
            long[] jArr = this.f12480b;
            Object[] objArr = this.f12481c;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != r.f12486a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.f12479a = false;
            this.f12482d = i11;
        }
        return this.f12481c[i7];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12482d * 28);
        sb2.append('{');
        int i7 = this.f12482d;
        for (int i10 = 0; i10 < i7; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(e(i10));
            sb2.append('=');
            Object objI = i(i10);
            if (objI != sb2) {
                sb2.append(objI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }
}
