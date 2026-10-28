package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a2 f2712f = new a2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f2715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2717e;

    public a2() {
        this(0, new int[8], new Object[8], true);
    }

    public a2(int i7, int[] iArr, Object[] objArr, boolean z10) {
        this.f2716d = -1;
        this.f2713a = i7;
        this.f2714b = iArr;
        this.f2715c = objArr;
        this.f2717e = z10;
    }

    public static a2 e(a2 a2Var, a2 a2Var2) {
        int i7 = a2Var.f2713a + a2Var2.f2713a;
        int[] iArrCopyOf = Arrays.copyOf(a2Var.f2714b, i7);
        System.arraycopy(a2Var2.f2714b, 0, iArrCopyOf, a2Var.f2713a, a2Var2.f2713a);
        Object[] objArrCopyOf = Arrays.copyOf(a2Var.f2715c, i7);
        System.arraycopy(a2Var2.f2715c, 0, objArrCopyOf, a2Var.f2713a, a2Var2.f2713a);
        return new a2(i7, iArrCopyOf, objArrCopyOf, true);
    }

    public final void a() {
        if (!this.f2717e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i7) {
        int[] iArr = this.f2714b;
        if (i7 > iArr.length) {
            int i10 = this.f2713a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i7) {
                i7 = i11;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f2714b = Arrays.copyOf(iArr, i7);
            this.f2715c = Arrays.copyOf(this.f2715c, i7);
        }
    }

    public final int c() {
        int iC0;
        int iF0;
        int iY;
        int i7 = this.f2716d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2713a; i11++) {
            int i12 = this.f2714b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f2715c[i11]).getClass();
                    iY = u.Y(i13);
                } else if (i14 == 2) {
                    iY = u.V(i13, (l) this.f2715c[i11]);
                } else if (i14 == 3) {
                    iC0 = u.c0(i13) * 2;
                    iF0 = ((a2) this.f2715c[i11]).c();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(w0.c());
                    }
                    ((Integer) this.f2715c[i11]).getClass();
                    iY = u.X(i13);
                }
                i10 = iY + i10;
            } else {
                long jLongValue = ((Long) this.f2715c[i11]).longValue();
                iC0 = u.c0(i13);
                iF0 = u.f0(jLongValue);
            }
            i10 = iF0 + iC0 + i10;
        }
        this.f2716d = i10;
        return i10;
    }

    public final boolean d(int i7, p pVar) throws v0 {
        int iZ;
        a();
        int i10 = i7 >>> 3;
        int i11 = i7 & 7;
        if (i11 == 0) {
            f(i7, Long.valueOf(pVar.r()));
            return true;
        }
        if (i11 == 1) {
            f(i7, Long.valueOf(pVar.o()));
            return true;
        }
        if (i11 == 2) {
            f(i7, pVar.k());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw w0.c();
            }
            f(i7, Integer.valueOf(pVar.n()));
            return true;
        }
        a2 a2Var = new a2();
        do {
            iZ = pVar.z();
            if (iZ == 0) {
                break;
            }
        } while (a2Var.d(iZ, pVar));
        pVar.a((i10 << 3) | 4);
        f(i7, a2Var);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        int i7 = this.f2713a;
        if (i7 == a2Var.f2713a) {
            int[] iArr = this.f2714b;
            int[] iArr2 = a2Var.f2714b;
            for (int i10 = 0; i10 < i7; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.f2715c;
            Object[] objArr2 = a2Var.f2715c;
            int i11 = this.f2713a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i7, Object obj) {
        a();
        b(this.f2713a + 1);
        int[] iArr = this.f2714b;
        int i10 = this.f2713a;
        iArr[i10] = i7;
        this.f2715c[i10] = obj;
        this.f2713a = i10 + 1;
    }

    public final void g(f1 f1Var) {
        if (this.f2713a == 0) {
            return;
        }
        f1Var.getClass();
        for (int i7 = 0; i7 < this.f2713a; i7++) {
            int i10 = this.f2714b[i7];
            Object obj = this.f2715c[i7];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                f1Var.f(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                f1Var.c(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                f1Var.a(i11, (l) obj);
            } else if (i12 == 3) {
                u uVar = (u) f1Var.f2744a;
                uVar.s0(i11, 3);
                ((a2) obj).g(f1Var);
                uVar.s0(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(w0.c());
                }
                f1Var.b(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final int hashCode() {
        int i7 = this.f2713a;
        int i10 = (527 + i7) * 31;
        int[] iArr = this.f2714b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i7; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f2715c;
        int i14 = this.f2713a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
