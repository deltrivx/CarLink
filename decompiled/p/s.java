package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s extends CheckedTextView implements i4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.u1 f9893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f9894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f9895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f9896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        t2.a(context);
        s2.a(this, getContext());
        y0 y0Var = new y0(this);
        this.f9895c = y0Var;
        y0Var.f(attributeSet, R.attr.checkedTextViewStyle);
        y0Var.b();
        p pVar = new p(this);
        this.f9894b = pVar;
        pVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f9893a = new f1.u1(this);
        Context context2 = getContext();
        int[] iArr = i.a.f6554l;
        a2.b bVarP = a2.b.P(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        e4.l0.i(this, getContext(), iArr, attributeSet, (TypedArray) bVarP.f13c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(o9.e0.z(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(o9.e0.z(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(o9.e0.z(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(bVarP.A(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(m1.b(typedArray.getInt(3, -1), null));
            }
            bVarP.V();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            bVarP.V();
            throw th;
        }
    }

    private x getEmojiTextViewHelper() {
        if (this.f9896d == null) {
            this.f9896d = new x(this);
        }
        return this.f9896d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y0 y0Var = this.f9895c;
        if (y0Var != null) {
            y0Var.b();
        }
        p pVar = this.f9894b;
        if (pVar != null) {
            pVar.a();
        }
        f1.u1 u1Var = this.f9893a;
        if (u1Var != null) {
            u1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g5.a.q0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f9894b;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f9894b;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        f1.u1 u1Var = this.f9893a;
        if (u1Var != null) {
            return (ColorStateList) u1Var.f5163e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        f1.u1 u1Var = this.f9893a;
        if (u1Var != null) {
            return (PorterDuff.Mode) u1Var.f5164f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9895c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9895c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        n3.r.I(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f9894b;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        p pVar = this.f9894b;
        if (pVar != null) {
            pVar.f(i7);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i7) {
        setCheckMarkDrawable(o9.e0.z(getContext(), i7));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        f1.u1 u1Var = this.f9893a;
        if (u1Var != null) {
            if (u1Var.f5161c) {
                u1Var.f5161c = false;
            } else {
                u1Var.f5161c = true;
                u1Var.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9895c;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9895c;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g5.a.t0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f9894b;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f9894b;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        f1.u1 u1Var = this.f9893a;
        if (u1Var != null) {
            u1Var.f5163e = colorStateList;
            u1Var.f5159a = true;
            u1Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        f1.u1 u1Var = this.f9893a;
        if (u1Var != null) {
            u1Var.f5164f = mode;
            u1Var.f5160b = true;
            u1Var.b();
        }
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f9895c;
        y0Var.k(colorStateList);
        y0Var.b();
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f9895c;
        y0Var.l(mode);
        y0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        y0 y0Var = this.f9895c;
        if (y0Var != null) {
            y0Var.g(context, i7);
        }
    }
}
