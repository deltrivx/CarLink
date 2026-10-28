package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f9877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9878b;

    public final void a(Canvas canvas) {
        this.f9877a.draw(canvas);
    }

    public final void b(float f10, float f11) {
        this.f9877a.setHotspot(f10, f11);
    }

    public final void c(int i7, int i10, int i11, int i12) {
        this.f9877a.setHotspotBounds(i7, i10, i11, i12);
    }

    public final boolean d(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f9877a.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f9878b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f9877a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f9877a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9877a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9877a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f9877a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f9877a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f9877a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f9877a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f9877a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f9877a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f9877a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f9877a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f9877a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f9877a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        return this.f9877a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        scheduleSelf(runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f9877a.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        this.f9877a.setAutoMirrored(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i7) {
        this.f9877a.setChangingConfigurations(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9877a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f9877a.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f9877a.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        if (this.f9878b) {
            b(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        if (this.f9878b) {
            c(i7, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f9878b) {
            return this.f9877a.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        this.f9877a.setTint(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f9877a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f9877a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        if (this.f9878b) {
            return d(z10, z11);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
