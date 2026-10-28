package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class q extends Button implements i4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f9874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f9875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f9876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        t2.a(context);
        s2.a(this, getContext());
        p pVar = new p(this);
        this.f9874a = pVar;
        pVar.d(attributeSet, R.attr.buttonStyle);
        y0 y0Var = new y0(this);
        this.f9875b = y0Var;
        y0Var.f(attributeSet, R.attr.buttonStyle);
        y0Var.b();
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyle);
    }

    private x getEmojiTextViewHelper() {
        if (this.f9876c == null) {
            this.f9876c = new x(this);
        }
        return this.f9876c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f9874a;
        if (pVar != null) {
            pVar.a();
        }
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (m3.f9838c) {
            return super.getAutoSizeMaxTextSize();
        }
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            return Math.round(y0Var.f9981i.f9761e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (m3.f9838c) {
            return super.getAutoSizeMinTextSize();
        }
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            return Math.round(y0Var.f9981i.f9760d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (m3.f9838c) {
            return super.getAutoSizeStepGranularity();
        }
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            return Math.round(y0Var.f9981i.f9759c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (m3.f9838c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y0 y0Var = this.f9875b;
        return y0Var != null ? y0Var.f9981i.f9762f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (m3.f9838c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            return y0Var.f9981i.f9757a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g5.a.q0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f9874a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f9874a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9875b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9875b.e();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        y0 y0Var = this.f9875b;
        if (y0Var == null || m3.f9838c) {
            return;
        }
        y0Var.f9981i.a();
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            h1 h1Var = y0Var.f9981i;
            if (m3.f9838c || !h1Var.f()) {
                return;
            }
            h1Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i7, int i10, int i11, int i12) {
        if (m3.f9838c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i7, i10, i11, i12);
            return;
        }
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            y0Var.h(i7, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i7) {
        if (m3.f9838c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i7);
            return;
        }
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            y0Var.i(iArr, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i7) {
        if (m3.f9838c) {
            super.setAutoSizeTextTypeWithDefaults(i7);
            return;
        }
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            y0Var.j(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f9874a;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        p pVar = this.f9874a;
        if (pVar != null) {
            pVar.f(i7);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g5.a.t0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((n4.h) getEmojiTextViewHelper().f9954b.f7772b).F(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z10) {
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            y0Var.f9973a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f9874a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f9874a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f9875b;
        y0Var.k(colorStateList);
        y0Var.b();
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f9875b;
        y0Var.l(mode);
        y0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            y0Var.g(context, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f10) {
        boolean z10 = m3.f9838c;
        if (z10) {
            super.setTextSize(i7, f10);
            return;
        }
        y0 y0Var = this.f9875b;
        if (y0Var != null) {
            h1 h1Var = y0Var.f9981i;
            if (z10 || h1Var.f()) {
                return;
            }
            h1Var.g(f10, i7);
        }
    }
}
