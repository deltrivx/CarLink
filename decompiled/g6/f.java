package g6;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f5949a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i7;
        for (int i10 = 0; i10 < 2787; i10++) {
            int i11 = f6.a.f5374b[i10];
            int i12 = i11 & 1;
            int i13 = 0;
            while (i13 < 8) {
                float f10 = 0.0f;
                while (true) {
                    i7 = i11 & 1;
                    if (i7 == i12) {
                        f10 += 1.0f;
                        i11 >>= 1;
                    }
                }
                f5949a[i10][7 - i13] = f10 / 17.0f;
                i13++;
                i12 = i7;
            }
        }
    }
}
