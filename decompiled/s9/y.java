package s9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class y extends z {
    @Override // s9.g
    public final Object t(Object[] objArr) {
        i9.l.e(objArr, "args");
        n4.h.m(this, objArr);
        Object obj = objArr[0];
        Object[] objArrS0 = objArr.length <= 1 ? new Object[0] : u8.l.s0(objArr, 1, objArr.length);
        return this.f12697a.invoke(obj, Arrays.copyOf(objArrS0, objArrS0.length));
    }
}
