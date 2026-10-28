package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class c1 extends TextView implements i4.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f9685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f9686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f9687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f9688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0.o0 f9690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Future f9691g;

    public c1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        t2.a(context);
        this.f9689e = false;
        this.f9690f = null;
        s2.a(this, getContext());
        p pVar = new p(this);
        this.f9685a = pVar;
        pVar.d(attributeSet, i7);
        y0 y0Var = new y0(this);
        this.f9686b = y0Var;
        y0Var.f(attributeSet, i7);
        y0Var.b();
        c0 c0Var = new c0();
        c0Var.f9683b = this;
        this.f9687c = c0Var;
        getEmojiTextViewHelper().a(attributeSet, i7);
    }

    private x getEmojiTextViewHelper() {
        if (this.f9688d == null) {
            this.f9688d = new x(this);
        }
        return this.f9688d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f9685a;
        if (pVar != null) {
            pVar.a();
        }
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (m3.f9838c) {
            return super.getAutoSizeMaxTextSize();
        }
        y0 y0Var = this.f9686b;
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
        y0 y0Var = this.f9686b;
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
        y0 y0Var = this.f9686b;
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
        y0 y0Var = this.f9686b;
        return y0Var != null ? y0Var.f9981i.f9762f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (m3.f9838c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            return y0Var.f9981i.f9757a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g5.a.q0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public z0 getSuperCaller() {
        if (this.f9690f == null) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 34) {
                this.f9690f = new b1(this);
            } else if (i7 >= 28) {
                this.f9690f = new a1(this);
            } else if (i7 >= 26) {
                this.f9690f = new l0.o0(9, this);
            }
        }
        return this.f9690f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f9685a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f9685a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9686b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9686b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f9691g;
        if (future != null) {
            try {
                this.f9691g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                g5.a.Q(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f9687c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0Var.f9684c;
        return textClassifier == null ? s0.a((TextView) c0Var.f9683b) : textClassifier;
    }

    public c4.a getTextMetricsParamsCompat() {
        return g5.a.Q(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f9686b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            g4.d.a(editorInfo, getText());
        }
        n3.r.I(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        y0 y0Var = this.f9686b;
        if (y0Var == null || m3.f9838c) {
            return;
        }
        y0Var.f9981i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i7, int i10) {
        Future future = this.f9691g;
        if (future != null) {
            try {
                this.f9691g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                g5.a.Q(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i7, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        y0 y0Var = this.f9686b;
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
        y0 y0Var = this.f9686b;
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
        y0 y0Var = this.f9686b;
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
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            y0Var.j(i7);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f9685a;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        p pVar = this.f9685a;
        if (pVar != null) {
            pVar.f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i7 != 0 ? o9.e0.z(context, i7) : null, i10 != 0 ? o9.e0.z(context, i10) : null, i11 != 0 ? o9.e0.z(context, i11) : null, i12 != 0 ? o9.e0.z(context, i12) : null);
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i7, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i7 != 0 ? o9.e0.z(context, i7) : null, i10 != 0 ? o9.e0.z(context, i10) : null, i11 != 0 ? o9.e0.z(context, i11) : null, i12 != 0 ? o9.e0.z(context, i12) : null);
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            y0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y0 y0Var = this.f9686b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((n4.h) getEmojiTextViewHelper().f9954b.f7772b).F(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().L(i7);
        } else {
            g5.a.j0(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().B(i7);
        } else {
            g5.a.l0(this, i7);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        g5.a.m0(this, i7);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i7, float f10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().Q(i7, f10);
        } else if (i10 >= 34) {
            c.a.l(this, i7, f10);
        } else {
            g5.a.m0(this, Math.round(TypedValue.applyDimension(i7, f10, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(c4.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        g5.a.Q(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f9685a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f9685a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y0 y0Var = this.f9686b;
        y0Var.k(colorStateList);
        y0Var.b();
    }

    @Override // i4.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y0 y0Var = this.f9686b;
        y0Var.l(mode);
        y0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            y0Var.g(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        c0 c0Var;
        if (Build.VERSION.SDK_INT >= 28 || (c0Var = this.f9687c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0Var.f9684c = textClassifier;
        }
    }

    public void setTextFuture(Future<c4.b> future) {
        this.f9691g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c4.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f2422b;
        TextPaint textPaint = aVar.f2421a;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i7 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i7 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i7 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i7 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i7 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i7 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i7 = 7;
            }
        }
        setTextDirection(i7);
        if (Build.VERSION.SDK_INT >= 23) {
            getPaint().set(textPaint);
            i4.b.h(this, aVar.f2423c);
            i4.b.n(this, aVar.f2424d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i7, float f10) {
        boolean z10 = m3.f9838c;
        if (z10) {
            super.setTextSize(i7, f10);
            return;
        }
        y0 y0Var = this.f9686b;
        if (y0Var != null) {
            h1 h1Var = y0Var.f9981i;
            if (z10 || h1Var.f()) {
                return;
            }
            h1Var.g(f10, i7);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i7) {
        Typeface typefaceCreate;
        if (this.f9689e) {
            return;
        }
        if (typeface == null || i7 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            n3.u uVar = x3.e.f14570a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i7);
        }
        this.f9689e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i7);
        } finally {
            this.f9689e = false;
        }
    }
}
