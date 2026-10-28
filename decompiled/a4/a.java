package a4;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c.g0;
import p4.l;
import r3.v;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static OnBackInvokedDispatcher a(l lVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = lVar.getOnBackInvokedDispatcher();
        i9.l.d(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    public static Object b(String str, Bundle bundle) {
        return bundle.getParcelable(str, f.a.class);
    }

    public static String c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void e(v vVar, g0 g0Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!ob.a.A(g0Var) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = vVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, g0Var);
    }

    public static final void f(v vVar, g0 g0Var) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!ob.a.A(g0Var) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = vVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(g0Var);
    }

    public static void g(Object obj, Object obj2) {
        i9.l.e(obj, "dispatcher");
        i9.l.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static void h(Object obj, Object obj2) {
        i9.l.e(obj, "dispatcher");
        i9.l.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
