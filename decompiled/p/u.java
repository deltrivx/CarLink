package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f9926b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static u f9927c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2 f9928a;

    public static synchronized u a() {
        try {
            if (f9927c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f9927c;
    }

    public static synchronized void c() {
        if (f9927c == null) {
            u uVar = new u();
            f9927c = uVar;
            uVar.f9928a = n2.d();
            f9927c.f9928a.m(new t());
        }
    }

    public static void d(Drawable drawable, u2 u2Var, int[] iArr) {
        PorterDuff.Mode mode = n2.f9841h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = u2Var.f9934d;
        if (z10 || u2Var.f9933c) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z10 ? u2Var.f9931a : null;
            PorterDuff.Mode mode2 = u2Var.f9933c ? u2Var.f9932b : n2.f9841h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = n2.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i7) {
        return this.f9928a.f(context, i7);
    }
}
