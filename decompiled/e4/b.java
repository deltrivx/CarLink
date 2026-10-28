package e4;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.baidu.carlifevehicle.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f4314c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f4315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4316b;

    public b() {
        this(f4314c);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4315a = accessibilityDelegate;
        this.f4316b = new a(this);
    }

    public a2.d a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f4315a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new a2.d(14, accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f4315a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, f4.f fVar) {
        this.f4315a.onInitializeAccessibilityNodeInfo(view, fVar.f5287a);
    }

    public boolean d(View view, int i7, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i10 = 0; i10 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((f4.d) list.get(i10)).f5283a).getId() != i7; i10++) {
        }
        boolean zPerformAccessibilityAction = this.f4315a.performAccessibilityAction(view, i7, bundle);
        if (zPerformAccessibilityAction || i7 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i12 = 0; clickableSpanArr != null && i12 < clickableSpanArr.length; i12++) {
                if (clickableSpan.equals(clickableSpanArr[i12])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }
}
