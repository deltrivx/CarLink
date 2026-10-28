package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends RadioButton implements i4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.u1 f9695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f9696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f9697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f9698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        t2.a(context);
        s2.a(this, getContext());
        f1.u1 u1Var = new f1.u1(this);
        this.f9695a = u1Var;
        u1Var.d(attributeSet, R.attr.radioButtonStyle);
        p pVar = new p(this);
        this.f9696b = pVar;
        pVar.d(attributeSet, R.attr.radioButtonStyle);
        y0 y0Var = new y0(this);
        this.f9697c = y0Var;
        y0Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private x getEmojiTextViewHelper() {
        if (this.f9698d == null) {
            this.f9698d = new x(this);
        }
        return this.f9698d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f9696b;
        if (pVar != null) {
            pVar.a();
        }
        y0 y0Var = this.f9697c;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f9696b;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f9696b;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        f1.u1 u1Var = this.f9695a;
        if (u1Var != null) {
            return (ColorStateList) u1Var.f5163e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        f1.u1 u1Var = this.f9695a;
        if (u1Var != null) {
            return (PorterDuff.Mode) u1Var.f5164f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9697c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9697c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f9696b;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        p pVar = this.f9696b;
        if (pVar != null) {
            pVar.f(i7);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i7) {
        setButtonDrawable(o9.e0.z(getContext(), i7));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        f1.u1 u1Var = this.f9695a;
        if (u1Var != null) {
            if (u1Var.f5161c) {
                u1Var.f5161c = false;
            } else {
                u1Var.f5161c = true;
                u1Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9697c;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9697c;
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
        p pVar = this.f9696b;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f9696b;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        f1.u1 u1Var = this.f9695a;
        if (u1Var != null) {
            u1Var.f5163e = colorStateList;
            u1Var.f5159a = true;
            u1Var.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        f1.u1 u1Var = this.f9695a;
        if (u1Var != null) {
            u1Var.f5164f = mode;
            u1Var.f5160b = true;
            u1Var.a();
        }
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f9697c;
        y0Var.k(colorStateList);
        y0Var.b();
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f9697c;
        y0Var.l(mode);
        y0Var.b();
    }
}
