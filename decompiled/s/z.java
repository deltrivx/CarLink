package s;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f12522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12523b;

    public z(int i7) {
        this.f12522a = i7 == 0 ? p.f12477a : new long[i7];
    }

    public final void a(long j5) {
        int i7 = this.f12523b + 1;
        long[] jArr = this.f12522a;
        if (jArr.length < i7) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i7, (jArr.length * 3) / 2));
            i9.l.d(jArrCopyOf, "copyOf(...)");
            this.f12522a = jArrCopyOf;
        }
        long[] jArr2 = this.f12522a;
        int i10 = this.f12523b;
        jArr2[i10] = j5;
        this.f12523b = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            int i7 = zVar.f12523b;
            int i10 = this.f12523b;
            if (i7 == i10) {
                long[] jArr = this.f12522a;
                long[] jArr2 = zVar.f12522a;
                n9.d dVarE0 = n3.r.e0(0, i10);
                int i11 = dVarE0.f8965a;
                int i12 = dVarE0.f8966b;
                if (i11 > i12) {
                    return true;
                }
                while (jArr[i11] == jArr2[i11]) {
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
        long[] jArr = this.f12522a;
        int i7 = this.f12523b;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            long j5 = jArr[i11];
            i10 += ((int) (j5 ^ (j5 >>> 32))) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f12522a;
        int i7 = this.f12523b;
        for (int i10 = 0; i10 < i7; i10++) {
            long j5 = jArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                String string = sb2.toString();
                i9.l.d(string, "toString(...)");
                return string;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j5);
        }
        sb2.append((CharSequence) "]");
        String string2 = sb2.toString();
        i9.l.d(string2, "toString(...)");
        return string2;
    }
}
