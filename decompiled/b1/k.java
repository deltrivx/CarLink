package b1;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.z;
import java.lang.reflect.Method;
import y1.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f1164f = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f1165g = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f1166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f1167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f1168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f1169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h9.a f1170e;

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f1169d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f1168c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f1164f : f1165g;
            r rVar = this.f1166a;
            if (rVar != null) {
                rVar.setState(iArr);
            }
        } else {
            z zVar = new z(1, this);
            this.f1169d = zVar;
            postDelayed(zVar, 50L);
        }
        this.f1168c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(k kVar) {
        r rVar = kVar.f1166a;
        if (rVar != null) {
            rVar.setState(f1165g);
        }
        kVar.f1169d = null;
    }

    public final void b(b0.m mVar, boolean z10, long j5, int i7, long j10, float f10, h9.a aVar) {
        if (this.f1166a == null || !Boolean.valueOf(z10).equals(this.f1167b)) {
            r rVar = new r(z10);
            setBackground(rVar);
            this.f1166a = rVar;
            this.f1167b = Boolean.valueOf(z10);
        }
        r rVar2 = this.f1166a;
        i9.l.b(rVar2);
        this.f1170e = aVar;
        e(j5, i7, j10, f10);
        if (z10) {
            rVar2.setHotspot(x1.b.d(mVar.f1117a), x1.b.e(mVar.f1117a));
        } else {
            rVar2.setHotspot(rVar2.getBounds().centerX(), rVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f1170e = null;
        z zVar = this.f1169d;
        if (zVar != null) {
            removeCallbacks(zVar);
            z zVar2 = this.f1169d;
            i9.l.b(zVar2);
            zVar2.run();
        } else {
            r rVar = this.f1166a;
            if (rVar != null) {
                rVar.setState(f1165g);
            }
        }
        r rVar2 = this.f1166a;
        if (rVar2 == null) {
            return;
        }
        rVar2.setVisible(false, false);
        unscheduleDrawable(rVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j5, int i7, long j10, float f10) {
        r rVar = this.f1166a;
        if (rVar == null) {
            return;
        }
        Integer num = rVar.f1190c;
        if (num == null || num.intValue() != i7) {
            rVar.f1190c = Integer.valueOf(i7);
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!r.f1187f) {
                        r.f1187f = true;
                        r.f1186e = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    Method method = r.f1186e;
                    if (method != null) {
                        method.invoke(rVar, Integer.valueOf(i7));
                    }
                } catch (Exception unused) {
                }
            } else {
                rVar.setRadius(i7);
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        long jB = y1.q.b(f10, j10);
        y1.q qVar = rVar.f1189b;
        if (!(qVar == null ? false : y1.q.c(qVar.f14960a, jB))) {
            rVar.f1189b = new y1.q(jB);
            rVar.setColor(ColorStateList.valueOf(h0.C(jB)));
        }
        Rect rect = new Rect(0, 0, k9.a.M(x1.e.d(j5)), k9.a.M(x1.e.b(j5)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        rVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        h9.a aVar = this.f1170e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
