package e4;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.baidu.carlifevehicle.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f4369a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f4370b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f4371c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f4372d = new y();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f4373e = new a0();

    public static r0 a(View view) {
        if (f4369a == null) {
            f4369a = new WeakHashMap();
        }
        r0 r0Var = (r0) f4369a.get(view);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(view);
        f4369a.put(view, r0Var2);
        return r0Var2;
    }

    public static void b(View view, s1 s1Var) {
        int i7 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsB = s1Var.b();
        if (windowInsetsB != null) {
            WindowInsets windowInsetsA = i7 >= 30 ? i0.a(view, windowInsetsB) : c0.a(view, windowInsetsB);
            if (windowInsetsA.equals(windowInsetsB)) {
                return;
            }
            s1.c(view, windowInsetsA);
        }
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = k0.f4365d;
        k0 k0Var = (k0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (k0Var == null) {
            k0Var = new k0();
            k0Var.f4366a = null;
            k0Var.f4367b = null;
            k0Var.f4368c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, k0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = k0Var.f4366a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = k0.f4365d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (k0Var.f4366a == null) {
                            k0Var.f4366a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = k0.f4365d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                k0Var.f4366a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    k0Var.f4366a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewA = k0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (k0Var.f4367b == null) {
                    k0Var.f4367b = new SparseArray();
                }
                k0Var.f4367b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h0.a(view);
        }
        if (f4371c) {
            return null;
        }
        if (f4370b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4370b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4371c = true;
                return null;
            }
        }
        try {
            Object obj = f4370b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4371c = true;
            return null;
        }
    }

    public static String[] e(p.w wVar) {
        return Build.VERSION.SDK_INT >= 31 ? j0.a(wVar) : (String[]) wVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static s1 f(View view) {
        return Build.VERSION.SDK_INT >= 23 ? f0.a(view) : e0.e(view);
    }

    public static void g(View view, int i7) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i10 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i10 >= 28) {
                tag = g0.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z10 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i7);
                if (z10) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i10 >= 28) {
                        objA = g0.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((CharSequence) objA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i7 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                        return;
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i7);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i10 >= 28) {
                objA = g0.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f h(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return j0.b(view, fVar);
        }
        i4.l lVar = (i4.l) view.getTag(R.id.tag_on_receive_content_listener);
        p pVar = f4372d;
        if (lVar == null) {
            if (view instanceof p) {
                pVar = (p) view;
            }
            return pVar.a(fVar);
        }
        f fVarA = i4.l.a(view, fVar);
        if (fVarA == null) {
            return null;
        }
        if (view instanceof p) {
            pVar = (p) view;
        }
        return pVar.a(fVarA);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            h0.b(view, context, iArr, attributeSet, typedArray, i7, 0);
        }
    }

    public static void j(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f4316b);
    }

    public static void k(View view, CharSequence charSequence) {
        new z(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        a0 a0Var = f4373e;
        if (charSequence == null) {
            a0Var.f4309a.remove(view);
            view.removeOnAttachStateChangeListener(a0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(a0Var);
        } else {
            a0Var.f4309a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(a0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(a0Var);
            }
        }
    }

    public static void l(View view, t0 t0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(t0Var != null ? new y0(t0Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = x0.f4425e;
        View.OnApplyWindowInsetsListener w0Var = t0Var != null ? new w0(view, t0Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, w0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(w0Var);
        }
    }
}
