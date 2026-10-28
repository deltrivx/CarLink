package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f9883i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f9884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f9886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f9887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q0 f9889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f9891h;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public r0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.baidu.carlifevehicle.R.attr.spinnerStyle);
        this.f9891h = new Rect();
        s2.a(this, getContext());
        int[] iArr = i.a.f6563u;
        a2.b bVarP = a2.b.P(context, attributeSet, iArr, com.baidu.carlifevehicle.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        this.f9884a = new p(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f9885b = new n.c(context, resourceId);
        } else {
            this.f9885b = context;
        }
        int i7 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9883i, com.baidu.carlifevehicle.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i7 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e7) {
                    e = e7;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i7 != 0) {
                        k0 k0Var = new k0(this);
                        this.f9889f = k0Var;
                        k0Var.f9822c = typedArray.getString(2);
                    } else if (i7 == 1) {
                        o0 o0Var = new o0(this, this.f9885b, attributeSet);
                        a2.b bVarP2 = a2.b.P(this.f9885b, attributeSet, iArr, com.baidu.carlifevehicle.R.attr.spinnerStyle);
                        this.f9890g = ((TypedArray) bVarP2.f13c).getLayoutDimension(3, -2);
                        o0Var.j(bVarP2.D(1));
                        o0Var.C = typedArray.getString(2);
                        bVarP2.V();
                        this.f9889f = o0Var;
                        this.f9886c = new i0(this, this, o0Var);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.baidu.carlifevehicle.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    bVarP.V();
                    this.f9888e = true;
                    spinnerAdapter = this.f9887d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f9887d = null;
                    }
                    this.f9884a.d(attributeSet, com.baidu.carlifevehicle.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i7 != 0) {
            k0 k0Var2 = new k0(this);
            this.f9889f = k0Var2;
            k0Var2.f9822c = typedArray.getString(2);
        } else if (i7 == 1) {
            o0 o0Var2 = new o0(this, this.f9885b, attributeSet);
            a2.b bVarP3 = a2.b.P(this.f9885b, attributeSet, iArr, com.baidu.carlifevehicle.R.attr.spinnerStyle);
            this.f9890g = ((TypedArray) bVarP3.f13c).getLayoutDimension(3, -2);
            o0Var2.j(bVarP3.D(1));
            o0Var2.C = typedArray.getString(2);
            bVarP3.V();
            this.f9889f = o0Var2;
            this.f9886c = new i0(this, this, o0Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.baidu.carlifevehicle.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        bVarP.V();
        this.f9888e = true;
        spinnerAdapter = this.f9887d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f9887d = null;
        }
        this.f9884a.d(attributeSet, com.baidu.carlifevehicle.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f9891h;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f9884a;
        if (pVar != null) {
            pVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        q0 q0Var = this.f9889f;
        return q0Var != null ? q0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        q0 q0Var = this.f9889f;
        return q0Var != null ? q0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f9889f != null ? this.f9890g : super.getDropDownWidth();
    }

    public final q0 getInternalPopup() {
        return this.f9889f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        q0 q0Var = this.f9889f;
        return q0Var != null ? q0Var.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f9885b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        q0 q0Var = this.f9889f;
        return q0Var != null ? q0Var.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f9884a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f9884a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q0 q0Var = this.f9889f;
        if (q0Var == null || !q0Var.a()) {
            return;
        }
        q0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f9889f == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.getSuperState());
        if (!p0Var.f9865a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new o.d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        p0 p0Var = new p0(super.onSaveInstanceState());
        q0 q0Var = this.f9889f;
        p0Var.f9865a = q0Var != null && q0Var.a();
        return p0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.f9886c;
        if (i0Var == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        q0 q0Var = this.f9889f;
        if (q0Var == null) {
            return super.performClick();
        }
        if (q0Var.a()) {
            return true;
        }
        q0Var.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f9888e) {
            this.f9887d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        q0 q0Var = this.f9889f;
        if (q0Var != null) {
            Context context = this.f9885b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            l0 l0Var = new l0();
            l0Var.f9824a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                l0Var.f9825b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && i4.j.y(spinnerAdapter)) {
                j0.a(i4.j.n(spinnerAdapter), theme);
            }
            q0Var.o(l0Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f9884a;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        p pVar = this.f9884a;
        if (pVar != null) {
            pVar.f(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        q0 q0Var = this.f9889f;
        if (q0Var == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            q0Var.l(i7);
            q0Var.c(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        q0 q0Var = this.f9889f;
        if (q0Var != null) {
            q0Var.k(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f9889f != null) {
            this.f9890g = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        q0 q0Var = this.f9889f;
        if (q0Var != null) {
            q0Var.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(o9.e0.z(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        q0 q0Var = this.f9889f;
        if (q0Var != null) {
            q0Var.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f9884a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f9884a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }
}
