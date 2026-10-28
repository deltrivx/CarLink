package ta;

import i9.l;
import java.util.ArrayList;
import java.util.List;
import u8.m;
import u8.p;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12858e;

    public a(int... iArr) {
        List listJ0;
        l.e(iArr, "numbers");
        this.f12854a = iArr;
        Integer numA0 = u8.l.A0(iArr, 0);
        this.f12855b = numA0 != null ? numA0.intValue() : -1;
        Integer numA1 = u8.l.A0(iArr, 1);
        this.f12856c = numA1 != null ? numA1.intValue() : -1;
        Integer numA2 = u8.l.A0(iArr, 2);
        this.f12857d = numA2 != null ? numA2.intValue() : -1;
        if (iArr.length <= 3) {
            listJ0 = w.f13122a;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(a2.f.H(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            listJ0 = p.J0(new u8.d(new m(iArr), 3, iArr.length));
        }
        this.f12858e = listJ0;
    }

    public final boolean a(int i7, int i10, int i11) {
        int i12 = this.f12855b;
        if (i12 > i7) {
            return true;
        }
        if (i12 < i7) {
            return false;
        }
        int i13 = this.f12856c;
        if (i13 > i10) {
            return true;
        }
        return i13 >= i10 && this.f12857d >= i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12855b == aVar.f12855b && this.f12856c == aVar.f12856c && this.f12857d == aVar.f12857d && l.a(this.f12858e, aVar.f12858e);
    }

    public final int hashCode() {
        int i7 = this.f12855b;
        int i10 = (i7 * 31) + this.f12856c + i7;
        int i11 = (i10 * 31) + this.f12857d + i10;
        return this.f12858e.hashCode() + (i11 * 31) + i11;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f12854a) {
            if (i7 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i7));
        }
        return arrayList.isEmpty() ? "unknown" : p.q0(arrayList, ".", null, null, null, 62);
    }
}
