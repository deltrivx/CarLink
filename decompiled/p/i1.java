package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends ToggleButton implements i4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f9781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f9782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f9783c;

    public i1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        s2.a(this, getContext());
        p pVar = new p(this);
        this.f9781a = pVar;
        pVar.d(attributeSet, R.attr.buttonStyleToggle);
        y0 y0Var = new y0(this);
        this.f9782b = y0Var;
        y0Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private x getEmojiTextViewHelper() {
        if (this.f9783c == null) {
            this.f9783c = new x(this);
        }
        return this.f9783c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f9781a;
        if (pVar != null) {
            pVar.a();
        }
        y0 y0Var = this.f9782b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f9781a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f9781a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9782b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9782b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f9781a;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        p pVar = this.f9781a;
        if (pVar != null) {
            pVar.f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9782b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9782b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((n4.h) getEmojiTextViewHelper().f9954b.f7772b).F(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f9781a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f9781a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f9782b;
        y0Var.k(colorStateList);
        y0Var.b();
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f9782b;
        y0Var.l(mode);
        y0Var.b();
    }
}
