package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.baidu.carlifevehicle.R;
import p.a;
import p.q2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f644i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f6544a);
        boolean z10 = false;
        this.f639d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f640e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f644i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f642g = true;
            this.f641f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f642g ? !(this.f639d != null || this.f640e != null) : this.f641f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f639d;
        if (drawable != null && drawable.isStateful()) {
            this.f639d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f640e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f640e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f641f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f641f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f639d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f640e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f641f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f637b = findViewById(R.id.action_bar);
        this.f638c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f636a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        boolean z11 = true;
        if (this.f642g) {
            Drawable drawable = this.f641f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f639d == null) {
                z11 = false;
            } else if (this.f637b.getVisibility() == 0) {
                this.f639d.setBounds(this.f637b.getLeft(), this.f637b.getTop(), this.f637b.getRight(), this.f637b.getBottom());
            } else {
                View view = this.f638c;
                if (view == null || view.getVisibility() != 0) {
                    this.f639d.setBounds(0, 0, 0, 0);
                } else {
                    this.f639d.setBounds(this.f638c.getLeft(), this.f638c.getTop(), this.f638c.getRight(), this.f638c.getBottom());
                }
            }
            this.f643h = false;
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (this.f637b == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f644i) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i10);
        if (this.f637b == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f639d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f639d);
        }
        this.f639d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f637b;
            if (view != null) {
                this.f639d.setBounds(view.getLeft(), this.f637b.getTop(), this.f637b.getRight(), this.f637b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f642g ? !(this.f639d != null || this.f640e != null) : this.f641f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f641f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f641f);
        }
        this.f641f = drawable;
        boolean z10 = this.f642g;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z10 && (drawable2 = this.f641f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z10 ? !(this.f639d != null || this.f640e != null) : this.f641f == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f640e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f640e);
        }
        this.f640e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f643h && this.f640e != null) {
                throw null;
            }
        }
        boolean z10 = false;
        if (!this.f642g ? !(this.f639d != null || this.f640e != null) : this.f641f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(q2 q2Var) {
    }

    public void setTransitioning(boolean z10) {
        this.f636a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z10 = i7 == 0;
        Drawable drawable = this.f639d;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f640e;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f641f;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f639d;
        boolean z10 = this.f642g;
        if (drawable == drawable2 && !z10) {
            return true;
        }
        if (drawable == this.f640e && this.f643h) {
            return true;
        }
        return (drawable == this.f641f && z10) || super.verifyDrawable(drawable);
    }
}
