package f4;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f5275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f5276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f5277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f5278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f5279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f5280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f5281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d f5282j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5284b;

    static {
        new d(null, 1, null, null);
        new d(null, 2, null, null);
        new d(null, 4, null, null);
        new d(null, 8, null, null);
        new d(null, 16, null, null);
        new d(null, 32, null, null);
        f5275c = new d(null, 64, null, null);
        f5276d = new d(null, 128, null, null);
        new d(null, 256, null, i.class);
        new d(null, 512, null, i.class);
        new d(null, 1024, null, j.class);
        new d(null, 2048, null, j.class);
        f5277e = new d(null, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT, null, null);
        f5278f = new d(null, ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT, null, null);
        new d(null, 16384, null, null);
        new d(null, 32768, null, null);
        new d(null, 65536, null, null);
        new d(null, 131072, null, n.class);
        new d(null, 262144, null, null);
        new d(null, 524288, null, null);
        new d(null, 1048576, null, null);
        new d(null, 2097152, null, o.class);
        int i7 = Build.VERSION.SDK_INT;
        new d(i7 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null);
        new d(i7 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, l.class);
        f5279g = new d(i7 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null);
        f5280h = new d(i7 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null);
        f5281i = new d(i7 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null);
        f5282j = new d(i7 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null);
        new d(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new d(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new d(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new d(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new d(i7 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null);
        new d(i7 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, m.class);
        new d(i7 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, k.class);
        new d(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new d(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new d(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new d(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new d(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new d(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new d(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new d(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new d(i7 >= 34 ? c.a.a() : null, R.id.accessibilityActionScrollInDirection, null, null);
    }

    public d(int i7, String str) {
        this(null, i7, str, null);
    }

    public d(Object obj, int i7, CharSequence charSequence, Class cls) {
        this.f5284b = i7;
        if (obj == null) {
            this.f5283a = new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence);
        } else {
            this.f5283a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f5283a;
        Object obj3 = this.f5283a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f5283a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strC = f.c(this.f5284b);
        if (strC.equals("ACTION_UNKNOWN")) {
            Object obj = this.f5283a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strC = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strC);
        return sb2.toString();
    }
}
