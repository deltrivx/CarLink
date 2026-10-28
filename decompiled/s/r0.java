package s;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f12489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f12490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f12491c;

    public r0(int i7) {
        int i10;
        int i11 = 4;
        while (true) {
            i10 = 40;
            if (i11 >= 32) {
                break;
            }
            int i12 = (1 << i11) - 12;
            if (40 <= i12) {
                i10 = i12;
                break;
            }
            i11++;
        }
        int i13 = i10 / 4;
        this.f12489a = new int[i13];
        this.f12490b = new Object[i13];
    }

    public final void a(int i7, Object obj) {
        int i10 = this.f12491c;
        if (i10 != 0 && i7 <= this.f12489a[i10 - 1]) {
            e(i7, obj);
            return;
        }
        if (i10 >= this.f12489a.length) {
            int i11 = (i10 + 1) * 4;
            for (int i12 = 4; i12 < 32; i12++) {
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
            }
            int i14 = i11 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f12489a, i14);
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f12489a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12490b, i14);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            this.f12490b = objArrCopyOf;
        }
        this.f12489a[i10] = i7;
        this.f12490b[i10] = obj;
        this.f12491c = i10 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        i9.l.c(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        r0 r0Var = (r0) objClone;
        r0Var.f12489a = (int[]) this.f12489a.clone();
        r0Var.f12490b = (Object[]) this.f12490b.clone();
        return r0Var;
    }

    public final boolean c(int i7) {
        return t.a.a(this.f12491c, i7, this.f12489a) >= 0;
    }

    public final Object d(int i7) {
        Object obj;
        int iA = t.a.a(this.f12491c, i7, this.f12489a);
        if (iA < 0 || (obj = this.f12490b[iA]) == r.f12488c) {
            return null;
        }
        return obj;
    }

    public final void e(int i7, Object obj) {
        int iA = t.a.a(this.f12491c, i7, this.f12489a);
        if (iA >= 0) {
            this.f12490b[iA] = obj;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f12491c;
        if (i10 < i11) {
            Object[] objArr = this.f12490b;
            if (objArr[i10] == r.f12488c) {
                this.f12489a[i10] = i7;
                objArr[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f12489a.length) {
            int i12 = (i11 + 1) * 4;
            for (int i13 = 4; i13 < 32; i13++) {
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f12489a, i15);
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f12489a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12490b, i15);
            i9.l.d(objArrCopyOf, "copyOf(...)");
            this.f12490b = objArrCopyOf;
        }
        int i16 = this.f12491c;
        if (i16 - i10 != 0) {
            int[] iArr = this.f12489a;
            int i17 = i10 + 1;
            u8.l.m0(i17, i10, i16, iArr, iArr);
            Object[] objArr2 = this.f12490b;
            u8.l.p0(objArr2, objArr2, i17, i10, this.f12491c);
        }
        this.f12489a[i10] = i7;
        this.f12490b[i10] = obj;
        this.f12491c++;
    }

    public final Object f(int i7) {
        Object[] objArr = this.f12490b;
        if (i7 < objArr.length) {
            return objArr[i7];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i7 = this.f12491c;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i7 * 28);
        sb2.append('{');
        int i10 = this.f12491c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f12489a[i11]);
            sb2.append('=');
            Object objF = f(i11);
            if (objF != this) {
                sb2.append(objF);
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
