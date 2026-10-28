package c;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i7) {
        return velocityTracker.getAxisVelocity(i7);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i7, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i7, i10, i11);
    }

    public static int f(ViewConfiguration viewConfiguration, int i7, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i7, i10, i11);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean h(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static float i(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void j(AccessibilityEvent accessibilityEvent, boolean z10) {
        accessibilityEvent.setAccessibilityDataSensitive(z10);
    }

    public static void k(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
    }

    public static void l(TextView textView, int i7, float f10) {
        textView.setLineHeight(i7, f10);
    }

    public static int m(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float n(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float o(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
