package r2;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f11247a;

    public h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        i9.l.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f11247a = (ClipboardManager) systemService;
    }
}
