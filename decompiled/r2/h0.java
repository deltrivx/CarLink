package r2;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f11248a = new h0();

    public final void a(View view, k2.s sVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = sVar instanceof k2.a ? PointerIcon.getSystemIcon(context, ((k2.a) sVar).f7182b) : PointerIcon.getSystemIcon(context, 1000);
        if (i9.l.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
