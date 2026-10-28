package y1;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f14890a;

    public f(Bitmap bitmap) {
        this.f14890a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.f14890a.getConfig();
        i9.l.b(config);
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i7 < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
