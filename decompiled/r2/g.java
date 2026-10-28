package r2;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11234a;

    public g(h hVar) {
        this.f11234a = hVar;
    }

    public final void a(d1 d1Var) {
        ClipboardManager clipboardManager = this.f11234a.f11247a;
        if (d1Var != null) {
            clipboardManager.setPrimaryClip(d1Var.f11212a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
