package s;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f12508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12509b;

    public /* synthetic */ v() {
        this(16);
    }

    public v(int i7) {
        this.f12508a = i7 == 0 ? m.f12470a : new int[i7];
    }

    public final void a(int i7) {
        int i10 = this.f12509b + 1;
        int[] iArr = this.f12508a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            i9.l.d(iArrCopyOf, "copyOf(...)");
            this.f12508a = iArrCopyOf;
        }
        int[] iArr2 = this.f12508a;
        int i11 = this.f12509b;
        iArr2[i11] = i7;
        this.f12509b = i11 + 1;
    }

    public final int b(int i7) {
        if (i7 >= 0 && i7 < this.f12509b) {
            return this.f12508a[i7];
        }
        t.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void c(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.f12509b)) {
            t.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f12508a;
        int i11 = iArr[i7];
        if (i7 != i10 - 1) {
            u8.l.m0(i7, i7 + 1, i10, iArr, iArr);
        }
        this.f12509b--;
    }

    public final void d(int i7, int i10) {
        if (i7 < 0 || i7 >= this.f12509b) {
            t.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f12508a;
        int i11 = iArr[i7];
        iArr[i7] = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            int i7 = vVar.f12509b;
            int i10 = this.f12509b;
            if (i7 == i10) {
                int[] iArr = this.f12508a;
                int[] iArr2 = vVar.f12508a;
                n9.d dVarE0 = n3.r.e0(0, i10);
                int i11 = dVarE0.f8965a;
                int i12 = dVarE0.f8966b;
                if (i11 > i12) {
                    return true;
                }
                while (iArr[i11] == iArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f12508a;
        int i7 = this.f12509b;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            i10 += iArr[i11] * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f12508a;
        int i7 = this.f12509b;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = iArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                i9.l.d(string, "toString(...)");
                return string;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i11);
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        i9.l.d(string2, "toString(...)");
        return string2;
    }
}
