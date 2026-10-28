package w1;

import java.util.Comparator;
import q2.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f14078a = new t();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        int i7 = 0;
        if (f.r(sVar) && f.r(sVar2)) {
            h0 h0VarV = q2.f.v(sVar);
            h0 h0VarV2 = q2.f.v(sVar2);
            if (!i9.l.a(h0VarV, h0VarV2)) {
                Object[] objArr = new h0[16];
                int i10 = 0;
                while (h0VarV != null) {
                    int i11 = i10 + 1;
                    if (objArr.length < i11) {
                        int length = objArr.length;
                        Object[] objArr2 = new Object[Math.max(i11, length * 2)];
                        System.arraycopy(objArr, 0, objArr2, 0, length);
                        objArr = objArr2;
                    }
                    if (i10 != 0) {
                        System.arraycopy(objArr, 0, objArr, 0 + 1, i10 + 0);
                    }
                    objArr[0] = h0VarV;
                    i10++;
                    h0VarV = h0VarV.v();
                }
                Object[] objArr3 = new h0[16];
                int i12 = 0;
                while (h0VarV2 != null) {
                    int i13 = i12 + 1;
                    if (objArr3.length < i13) {
                        int length2 = objArr3.length;
                        Object[] objArr4 = new Object[Math.max(i13, length2 * 2)];
                        System.arraycopy(objArr3, 0, objArr4, 0, length2);
                        objArr3 = objArr4;
                    }
                    if (i12 != 0) {
                        System.arraycopy(objArr3, 0, objArr3, 0 + 1, i12 + 0);
                    }
                    objArr3[0] = h0VarV2;
                    i12++;
                    h0VarV2 = h0VarV2.v();
                }
                int iMin = Math.min(i10 - 1, i12 - 1);
                if (iMin >= 0) {
                    while (i9.l.a(objArr[i7], objArr3[i7])) {
                        if (i7 != iMin) {
                            i7++;
                        }
                    }
                    return i9.l.f(((h0) objArr[i7]).w(), ((h0) objArr3[i7]).w());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (f.r(sVar)) {
                return -1;
            }
            if (f.r(sVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
