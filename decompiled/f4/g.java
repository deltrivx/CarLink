package f4;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class g extends AccessibilityNodeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2.d f5290a;

    public g(a2.d dVar) {
        this.f5290a = dVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        f fVarK = this.f5290a.k(i7);
        if (fVarK == null) {
            return null;
        }
        return fVarK.f5287a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i7) {
        this.f5290a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i7) {
        f fVarN = this.f5290a.n(i7);
        if (fVarN == null) {
            return null;
        }
        return fVarN.f5287a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        return this.f5290a.t(i7, i10, bundle);
    }
}
