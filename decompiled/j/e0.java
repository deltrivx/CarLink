package j;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import s.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f6763b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f6764c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f6765d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f6766e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f6767f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f6768g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q0 f6769h = new q0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f6770a = new Object[2];

    public final View a(Context context, String str, String str2) {
        String strConcat;
        q0 q0Var = f6769h;
        Constructor constructor = (Constructor) q0Var.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6763b);
            q0Var.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f6770a);
    }
}
