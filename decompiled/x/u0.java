package x;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2.u f14488a = new y2.u("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static r1.p b(h9.k kVar, h9.k kVar2, f1 f1Var) {
        return a() ? new MagnifierElement(kVar, kVar2, f1Var) : r1.m.f11116a;
    }
}
