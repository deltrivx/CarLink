package h0;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f6396a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        i9.l.d(lowerCase, "toLowerCase(...)");
        f6396a = lowerCase.equals("robolectric") ? new u0() : null;
    }
}
