package e4;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets b(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void c(Window window, boolean z10) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z10 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z10);
    }

    public static void d(Window window, boolean z10) {
        window.setDecorFitsSystemWindows(z10);
    }

    public static void e(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void f(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
