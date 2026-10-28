package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f9749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f9750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f9751g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f9752h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9753i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9754j;

    public h0(g0 g0Var) {
        super(g0Var);
        this.f9751g = null;
        this.f9752h = null;
        this.f9753i = false;
        this.f9754j = false;
        this.f9749e = g0Var;
    }

    @Override // p.c0
    public final void b(AttributeSet attributeSet, int i7) {
        super.b(attributeSet, R.attr.seekBarStyle);
        g0 g0Var = this.f9749e;
        Context context = g0Var.getContext();
        int[] iArr = i.a.f6550g;
        a2.b bVarP = a2.b.P(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        e4.l0.i(g0Var, g0Var.getContext(), iArr, attributeSet, (TypedArray) bVarP.f13c, R.attr.seekBarStyle);
        Drawable drawableE = bVarP.E(0);
        if (drawableE != null) {
            g0Var.setThumb(drawableE);
        }
        Drawable drawableD = bVarP.D(1);
        Drawable drawable = this.f9750f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f9750f = drawableD;
        if (drawableD != null) {
            drawableD.setCallback(g0Var);
            n3.r.V(drawableD, g0Var.getLayoutDirection());
            if (drawableD.isStateful()) {
                drawableD.setState(g0Var.getDrawableState());
            }
            f();
        }
        g0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f9752h = m1.b(typedArray.getInt(3, -1), this.f9752h);
            this.f9754j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f9751g = bVarP.A(2);
            this.f9753i = true;
        }
        bVarP.V();
        f();
    }

    public final void f() {
        Drawable drawable = this.f9750f;
        if (drawable != null) {
            if (this.f9753i || this.f9754j) {
                Drawable drawableF0 = n3.r.f0(drawable.mutate());
                this.f9750f = drawableF0;
                if (this.f9753i) {
                    drawableF0.setTintList(this.f9751g);
                }
                if (this.f9754j) {
                    this.f9750f.setTintMode(this.f9752h);
                }
                if (this.f9750f.isStateful()) {
                    this.f9750f.setState(this.f9749e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        if (this.f9750f != null) {
            g0 g0Var = this.f9749e;
            int max = g0Var.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f9750f.getIntrinsicWidth();
                int intrinsicHeight = this.f9750f.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f9750f.setBounds(-i7, -i10, i7, i10);
                float width = ((g0Var.getWidth() - g0Var.getPaddingLeft()) - g0Var.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(g0Var.getPaddingLeft(), g0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f9750f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
