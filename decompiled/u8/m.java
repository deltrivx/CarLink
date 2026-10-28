package u8;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends e implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f13116a;

    public m(int[] iArr) {
        this.f13116a = iArr;
    }

    @Override // u8.a
    public final int c() {
        return this.f13116a.length;
    }

    @Override // u8.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f13116a;
        i9.l.e(iArr, "<this>");
        return l.D0(iArr, iIntValue) >= 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return Integer.valueOf(this.f13116a[i7]);
    }

    @Override // u8.e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return l.D0(this.f13116a, ((Number) obj).intValue());
    }

    @Override // u8.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f13116a.length == 0;
    }

    @Override // u8.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f13116a;
        i9.l.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i7 >= 0) {
                    length = i7;
                }
            }
        }
        return -1;
    }
}
