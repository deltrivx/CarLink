package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import e4.r0;
import j.b0;
import j.s;
import o.m;
import p.e3;
import p.g;
import p.j1;
import p.k;
import p.k1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f710g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j1 f711h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f710g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f708e == null) {
            this.f708e = new TypedValue();
        }
        return this.f708e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f709f == null) {
            this.f709f = new TypedValue();
        }
        return this.f709f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f706c == null) {
            this.f706c = new TypedValue();
        }
        return this.f706c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f707d == null) {
            this.f707d = new TypedValue();
        }
        return this.f707d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f704a == null) {
            this.f704a = new TypedValue();
        }
        return this.f704a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f705b == null) {
            this.f705b = new TypedValue();
        }
        return this.f705b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j1 j1Var = this.f711h;
        if (j1Var != null) {
            j1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k kVar;
        super.onDetachedFromWindow();
        j1 j1Var = this.f711h;
        if (j1Var != null) {
            b0 b0Var = ((s) j1Var).f6851b;
            k1 k1Var = b0Var.f6737r;
            if (k1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) k1Var;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((e3) actionBarOverlayLayout.f668e).f9704a.f715a;
                if (actionMenuView != null && (kVar = actionMenuView.f693t) != null) {
                    kVar.f();
                    g gVar = kVar.f9816t;
                    if (gVar != null && gVar.b()) {
                        gVar.f9246i.dismiss();
                    }
                }
            }
            if (b0Var.f6742w != null) {
                b0Var.f6730l.getDecorView().removeCallbacks(b0Var.f6743x);
                if (b0Var.f6742w.isShowing()) {
                    try {
                        b0Var.f6742w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                b0Var.f6742w = null;
            }
            r0 r0Var = b0Var.f6744y;
            if (r0Var != null) {
                r0Var.b();
            }
            m mVar = b0Var.y(0).f6710h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int iMakeMeasureSpec;
        boolean z10;
        int iMakeMeasureSpec2;
        int i11;
        int i12;
        float fraction;
        int i13;
        int i14;
        float fraction2;
        int i15;
        int i16;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.f710g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i7;
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f707d : this.f706c;
            if (typedValue == null || (i15 = typedValue.type) == 0) {
                iMakeMeasureSpec = i7;
                z10 = false;
            } else {
                if (i15 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i17 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i17, i17);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                        z10 = true;
                    } else {
                        iMakeMeasureSpec = i7;
                        z10 = false;
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                    z10 = true;
                } else {
                    iMakeMeasureSpec = i7;
                    z10 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i10;
        } else {
            TypedValue typedValue2 = z12 ? this.f708e : this.f709f;
            if (typedValue2 == null || (i13 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i10;
            } else {
                if (i13 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i18 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i18, i18);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i10;
                    }
                }
                i14 = (int) fraction2;
                if (i14 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i10;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f705b : this.f704a;
            if (typedValue3 == null || (i11 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i11 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i11 == 6) {
                        int i19 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i19, i19);
                    } else {
                        i12 = 0;
                    }
                    if (i12 > 0) {
                        i12 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i12) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i12 = (int) fraction;
                if (i12 > 0) {
                    i12 -= rect.left + rect.right;
                }
                if (measuredWidth < i12) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(j1 j1Var) {
        this.f711h = j1Var;
    }
}
