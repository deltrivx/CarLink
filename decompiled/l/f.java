package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.bugly.proguard.c0;
import n3.r;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f7576m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f7577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f7578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f7579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f7580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c0 f7585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7586j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f5.b f7587l;

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        long j5;
        boolean z12 = true;
        this.f7582f = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f7579c;
        if (drawable2 != null) {
            long j10 = this.f7586j;
            if (j10 != 0) {
                if (j10 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f7581e);
                    this.f7586j = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j10 - jUptimeMillis) * 255)) / this.f7577a.f7562y)) * this.f7581e) / 255);
                    z11 = true;
                }
            }
            drawable = this.f7580d;
            if (drawable != null) {
                j5 = this.k;
                if (j5 == 0) {
                    if (j5 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f7580d = null;
                        this.k = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j5 - jUptimeMillis) * 255)) / this.f7577a.f7563z) * this.f7581e) / 255);
                    }
                }
                if (z10 || !z12) {
                }
                scheduleSelf(this.f7585i, jUptimeMillis + 16);
                return;
            }
            this.k = 0L;
            z12 = z11;
            if (z10) {
            }
        }
        this.f7586j = 0L;
        z11 = false;
        drawable = this.f7580d;
        if (drawable != null) {
            j5 = this.k;
            if (j5 == 0) {
                if (j5 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f7580d = null;
                    this.k = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j5 - jUptimeMillis) * 255)) / this.f7577a.f7563z) * this.f7581e) / 255);
                }
            }
            if (z10) {
            }
        }
        this.k = 0L;
        z12 = z11;
        if (z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        b bVar = this.f7577a;
        if (theme == null) {
            bVar.getClass();
            return;
        }
        bVar.c();
        int i7 = bVar.f7546h;
        Drawable[] drawableArr = bVar.f7545g;
        for (int i10 = 0; i10 < i7; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i10].applyTheme(theme);
                bVar.f7543e |= drawableArr[i10].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            bVar.f7540b = resources;
            int i11 = resources.getDisplayMetrics().densityDpi;
            if (i11 == 0) {
                i11 = 160;
            }
            int i12 = bVar.f7541c;
            bVar.f7541c = i11;
            if (i12 != i11) {
                bVar.f7550m = false;
                bVar.f7548j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.f7587l == null) {
            this.f7587l = new f5.b();
        }
        f5.b bVar = this.f7587l;
        bVar.f5302b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f7577a.f7562y <= 0 && this.f7582f) {
                drawable.setAlpha(this.f7581e);
            }
            b bVar2 = this.f7577a;
            if (bVar2.C) {
                drawable.setColorFilter(bVar2.B);
            } else {
                if (bVar2.F) {
                    drawable.setTintList(bVar2.D);
                }
                b bVar3 = this.f7577a;
                if (bVar3.G) {
                    drawable.setTintMode(bVar3.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f7577a.f7560w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                r.V(drawable, r.B(this));
            }
            drawable.setAutoMirrored(this.f7577a.A);
            Rect rect = this.f7578b;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            f5.b bVar4 = this.f7587l;
            Drawable.Callback callback = (Drawable.Callback) bVar4.f5302b;
            bVar4.f5302b = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean c(int i7) {
        if (i7 == this.f7583g) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f7577a.f7563z > 0) {
            Drawable drawable = this.f7580d;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f7579c;
            if (drawable2 != null) {
                this.f7580d = drawable2;
                this.k = ((long) this.f7577a.f7563z) + jUptimeMillis;
            } else {
                this.f7580d = null;
                this.k = 0L;
            }
        } else {
            Drawable drawable3 = this.f7579c;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i7 >= 0) {
            b bVar = this.f7577a;
            if (i7 < bVar.f7546h) {
                Drawable drawableD = bVar.d(i7);
                this.f7579c = drawableD;
                this.f7583g = i7;
                if (drawableD != null) {
                    int i10 = this.f7577a.f7562y;
                    if (i10 > 0) {
                        this.f7586j = jUptimeMillis + ((long) i10);
                    }
                    b(drawableD);
                }
            } else {
                this.f7579c = null;
                this.f7583g = -1;
            }
        } else {
            this.f7579c = null;
            this.f7583g = -1;
        }
        if (this.f7586j != 0 || this.k != 0) {
            c0 c0Var = this.f7585i;
            if (c0Var == null) {
                this.f7585i = new c0(3, (e) this);
            } else {
                unscheduleSelf(c0Var);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f7577a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7579c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f7580d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7581e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f7577a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        b bVar = this.f7577a;
        if (!bVar.f7558u) {
            bVar.c();
            bVar.f7558u = true;
            int i7 = bVar.f7546h;
            Drawable[] drawableArr = bVar.f7545g;
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    bVar.f7559v = true;
                    z10 = true;
                    break;
                }
                if (drawableArr[i10].getConstantState() == null) {
                    bVar.f7559v = false;
                    z10 = false;
                    break;
                }
                i10++;
            }
        } else {
            z10 = bVar.f7559v;
        }
        if (!z10) {
            return null;
        }
        this.f7577a.f7542d = getChangingConfigurations();
        return this.f7577a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f7579c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f7578b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        b bVar = this.f7577a;
        if (bVar.f7549l) {
            if (!bVar.f7550m) {
                bVar.b();
            }
            return bVar.f7552o;
        }
        Drawable drawable = this.f7579c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        b bVar = this.f7577a;
        if (bVar.f7549l) {
            if (!bVar.f7550m) {
                bVar.b();
            }
            return bVar.f7551n;
        }
        Drawable drawable = this.f7579c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        b bVar = this.f7577a;
        if (bVar.f7549l) {
            if (!bVar.f7550m) {
                bVar.b();
            }
            return bVar.f7554q;
        }
        Drawable drawable = this.f7579c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        b bVar = this.f7577a;
        if (bVar.f7549l) {
            if (!bVar.f7550m) {
                bVar.b();
            }
            return bVar.f7553p;
        }
        Drawable drawable = this.f7579c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7579c;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            b bVar = this.f7577a;
            if (bVar.f7555r) {
                return bVar.f7556s;
            }
            bVar.c();
            int i7 = bVar.f7546h;
            Drawable[] drawableArr = bVar.f7545g;
            opacity = i7 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i10 = 1; i10 < i7; i10++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i10].getOpacity());
            }
            bVar.f7556s = opacity;
            bVar.f7555r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f7579c;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b bVar = this.f7577a;
        Rect rect2 = null;
        boolean padding = false;
        if (!bVar.f7547i) {
            Rect rect3 = bVar.k;
            if (rect3 != null || bVar.f7548j) {
                rect2 = rect3;
            } else {
                bVar.c();
                Rect rect4 = new Rect();
                int i7 = bVar.f7546h;
                Drawable[] drawableArr = bVar.f7545g;
                for (int i10 = 0; i10 < i7; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
                        }
                    }
                }
                bVar.f7548j = true;
                bVar.k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f7579c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f7577a.A && r.B(this) == 1) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        b bVar = this.f7577a;
        if (bVar != null) {
            bVar.f7555r = false;
            bVar.f7557t = false;
        }
        if (drawable != this.f7579c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f7577a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f7580d;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f7580d = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f7579c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f7582f) {
                this.f7579c.setAlpha(this.f7581e);
            }
        }
        if (this.k != 0) {
            this.k = 0L;
            z10 = true;
        }
        if (this.f7586j != 0) {
            this.f7586j = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f7584h && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.f7571p, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f7584h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7580d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f7579c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i7) {
        b bVar = this.f7577a;
        int i10 = this.f7583g;
        int i11 = bVar.f7546h;
        Drawable[] drawableArr = bVar.f7545g;
        boolean z10 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                boolean zV = Build.VERSION.SDK_INT >= 23 ? r.V(drawable, i7) : false;
                if (i12 == i10) {
                    z10 = zV;
                }
            }
        }
        bVar.f7561x = i7;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f7580d;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f7579c;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        if (drawable != this.f7579c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f7582f && this.f7581e == i7) {
            return;
        }
        this.f7582f = true;
        this.f7581e = i7;
        Drawable drawable = this.f7579c;
        if (drawable != null) {
            if (this.f7586j == 0) {
                drawable.setAlpha(i7);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        b bVar = this.f7577a;
        if (bVar.A != z10) {
            bVar.A = z10;
            Drawable drawable = this.f7579c;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b bVar = this.f7577a;
        bVar.C = true;
        if (bVar.B != colorFilter) {
            bVar.B = colorFilter;
            Drawable drawable = this.f7579c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        b bVar = this.f7577a;
        if (bVar.f7560w != z10) {
            bVar.f7560w = z10;
            Drawable drawable = this.f7579c;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f7579c;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i7, int i10, int i11, int i12) {
        Rect rect = this.f7578b;
        if (rect == null) {
            this.f7578b = new Rect(i7, i10, i11, i12);
        } else {
            rect.set(i7, i10, i11, i12);
        }
        Drawable drawable = this.f7579c;
        if (drawable != null) {
            drawable.setHotspotBounds(i7, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        b bVar = this.f7577a;
        bVar.F = true;
        if (bVar.D != colorStateList) {
            bVar.D = colorStateList;
            this.f7579c.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f7577a;
        bVar.G = true;
        if (bVar.E != mode) {
            bVar.E = mode;
            this.f7579c.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f7580d;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f7579c;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f7579c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
