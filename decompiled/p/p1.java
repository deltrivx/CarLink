package p;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class p1 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z10) {
        absListView.setSelectedChildViewEnabled(z10);
    }
}
