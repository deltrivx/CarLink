package f4;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f5290a.i(i7, new f(accessibilityNodeInfo), str, bundle);
    }
}
