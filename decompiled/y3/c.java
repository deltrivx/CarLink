package y3;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable implements Drawable.Callback, b, a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final PorterDuff.Mode f15083g = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Method f15084h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f15086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f15088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f15090f;

    public static void a() {
        if (f15084h == null) {
            try {
                f15084h = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e7) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e7);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f15090f;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final d c() {
        d dVar = this.f15088d;
        d dVar2 = new d();
        dVar2.f15093c = null;
        dVar2.f15094d = f15083g;
        if (dVar != null) {
            dVar2.f15091a = dVar.f15091a;
            dVar2.f15092b = dVar.f15092b;
            dVar2.f15093c = dVar.f15093c;
            dVar2.f15094d = dVar.f15094d;
        }
        return dVar2;
    }

    public final boolean d(int[] iArr) {
        return i(iArr) || this.f15090f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f15090f.draw(canvas);
    }

    public final void e(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    public final void f(ColorStateList colorStateList) {
        this.f15088d.f15093c = colorStateList;
        i(this.f15090f.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.f15088d.f15094d = mode;
        i(this.f15090f.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        d dVar = this.f15088d;
        return changingConfigurations | (dVar != null ? dVar.getChangingConfigurations() : 0) | this.f15090f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        d dVar = this.f15088d;
        if (dVar == null || dVar.f15092b == null) {
            return null;
        }
        dVar.f15091a = getChangingConfigurations();
        return this.f15088d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f15090f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f15090f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f15090f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f15090f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return r.B(this.f15090f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f15090f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f15090f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f15090f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f15090f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f15090f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f15090f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f15090f.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f15090f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f15090f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            d dVar = this.f15088d;
            if (dVar != null) {
                dVar.f15092b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        if (b()) {
            d dVar = this.f15088d;
            ColorStateList colorStateList = dVar.f15093c;
            PorterDuff.Mode mode = dVar.f15094d;
            if (colorStateList == null || mode == null) {
                this.f15087c = false;
                clearColorFilter();
                return false;
            }
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f15087c || colorForState != this.f15085a || mode != this.f15086b) {
                setColorFilter(colorForState, mode);
                this.f15085a = colorForState;
                this.f15086b = mode;
                this.f15087c = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f15090f.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f15090f;
        if (drawable == null || (method = f15084h) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e7) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e7);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        d dVar;
        ColorStateList colorStateList = (!b() || (dVar = this.f15088d) == null) ? null : dVar.f15093c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f15090f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f15090f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f15089e && super.mutate() == this) {
            this.f15088d = c();
            Drawable drawable = this.f15090f;
            if (drawable != null) {
                drawable.mutate();
            }
            d dVar = this.f15088d;
            if (dVar != null) {
                Drawable drawable2 = this.f15090f;
                dVar.f15092b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f15089e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f15090f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        return r.V(this.f15090f, i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        return this.f15090f.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        scheduleSelf(runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f15090f.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        this.f15090f.setAutoMirrored(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i7) {
        this.f15090f.setChangingConfigurations(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15090f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f15090f.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f15090f.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        this.f15090f.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        this.f15090f.setHotspotBounds(i7, i10, i11, i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        if (b()) {
            e(i7);
        } else {
            this.f15090f.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f15090f.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f15090f.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f15090f.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
