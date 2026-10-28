package n1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f8726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f8727c;

    public j(int i7, long[] jArr, Object[] objArr) {
        this.f8725a = i7;
        this.f8726b = jArr;
        this.f8727c = objArr;
    }

    public final int a(long j5) {
        int i7 = this.f8725a - 1;
        if (i7 != -1) {
            long[] jArr = this.f8726b;
            int i10 = 0;
            if (i7 != 0) {
                while (i10 <= i7) {
                    int i11 = (i10 + i7) >>> 1;
                    long j10 = jArr[i11] - j5;
                    if (j10 < 0) {
                        i10 = i11 + 1;
                    } else {
                        if (j10 <= 0) {
                            return i11;
                        }
                        i7 = i11 - 1;
                    }
                }
                return -(i10 + 1);
            }
            long j11 = jArr[0];
            if (j11 == j5) {
                return 0;
            }
            if (j11 > j5) {
                return -2;
            }
        }
        return -1;
    }

    public final j b(long j5, Object obj) {
        long[] jArr;
        int i7;
        Object[] objArr = this.f8727c;
        int i10 = 0;
        int i11 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr2 = new long[i12];
        Object[] objArr2 = new Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (true) {
                jArr = this.f8726b;
                i7 = this.f8725a;
                if (i10 >= i12 || i13 >= i7) {
                    break;
                }
                long j10 = jArr[i13];
                Object obj3 = objArr[i13];
                if (j10 > j5) {
                    jArr2[i10] = j5;
                    objArr2[i10] = obj;
                    i10++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i10] = j10;
                    objArr2[i10] = obj3;
                    i10++;
                }
                i13++;
            }
            if (i13 == i7) {
                jArr2[i11] = j5;
                objArr2[i11] = obj;
            } else {
                while (i10 < i12) {
                    long j11 = jArr[i13];
                    Object obj4 = objArr[i13];
                    if (obj4 != null) {
                        jArr2[i10] = j11;
                        objArr2[i10] = obj4;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr2[0] = j5;
            objArr2[0] = obj;
        }
        return new j(i12, jArr2, objArr2);
    }
}
