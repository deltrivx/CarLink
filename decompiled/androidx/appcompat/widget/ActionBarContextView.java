package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.baidu.carlifevehicle.R;
import e4.l0;
import e4.r0;
import i.a;
import o.a0;
import o.m;
import o9.e0;
import oa.c;
import p.g;
import p.k;
import p.m3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f654j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f655l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f656m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f657n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f658o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f659p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f660q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f661r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f662s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f663t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f645a = new c(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f646b = context;
        } else {
            this.f646b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f6547d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : e0.z(context, resourceId));
        this.f660q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f661r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f649e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f663t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i7, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i10);
        return Math.max(0, i7 - view.getMeasuredWidth());
    }

    public static int g(View view, int i7, int i10, int i11, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z10) {
            view.layout(i7 - measuredWidth, i12, i7, measuredHeight + i12);
        } else {
            view.layout(i7, i12, i7 + measuredWidth, measuredHeight + i12);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public final void c(n.a aVar) {
        View view = this.k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f663t, (ViewGroup) this, false);
            this.k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.k);
        }
        View viewFindViewById = this.k.findViewById(R.id.action_mode_close_button);
        this.f655l = viewFindViewById;
        viewFindViewById.setOnClickListener(new j.a(1, aVar));
        m mVarE = aVar.e();
        k kVar = this.f648d;
        if (kVar != null) {
            kVar.f();
            g gVar = kVar.f9816t;
            if (gVar != null && gVar.b()) {
                gVar.f9246i.dismiss();
            }
        }
        k kVar2 = new k(getContext());
        this.f648d = kVar2;
        kVar2.f9808l = true;
        kVar2.f9809m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mVarE.b(this.f648d, this.f646b);
        k kVar3 = this.f648d;
        a0 a0Var = kVar3.f9805h;
        if (a0Var == null) {
            a0 a0Var2 = (a0) kVar3.f9801d.inflate(kVar3.f9803f, (ViewGroup) this, false);
            kVar3.f9805h = a0Var2;
            a0Var2.a(kVar3.f9800c);
            kVar3.g();
        }
        a0 a0Var3 = kVar3.f9805h;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(kVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.f647c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f647c, layoutParams);
    }

    public final void d() {
        if (this.f657n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f657n = linearLayout;
            this.f658o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f659p = (TextView) this.f657n.findViewById(R.id.action_bar_subtitle);
            int i7 = this.f660q;
            if (i7 != 0) {
                this.f658o.setTextAppearance(getContext(), i7);
            }
            int i10 = this.f661r;
            if (i10 != 0) {
                this.f659p.setTextAppearance(getContext(), i10);
            }
        }
        this.f658o.setText(this.f653i);
        this.f659p.setText(this.f654j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f653i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f654j);
        this.f659p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f657n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f657n.getParent() == null) {
            addView(this.f657n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f656m = null;
        this.f647c = null;
        this.f648d = null;
        View view = this.f655l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f650f != null ? this.f645a.f9580b : getVisibility();
    }

    public int getContentHeight() {
        return this.f649e;
    }

    public CharSequence getSubtitle() {
        return this.f654j;
    }

    public CharSequence getTitle() {
        return this.f653i;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            r0 r0Var = this.f650f;
            if (r0Var != null) {
                r0Var.b();
            }
            super.setVisibility(i7);
        }
    }

    public final r0 i(int i7, long j5) {
        r0 r0Var = this.f650f;
        if (r0Var != null) {
            r0Var.b();
        }
        c cVar = this.f645a;
        if (i7 != 0) {
            r0 r0VarA = l0.a(this);
            r0VarA.a(0.0f);
            r0VarA.c(j5);
            ((ActionBarContextView) cVar.f9581c).f650f = r0VarA;
            cVar.f9580b = i7;
            r0VarA.d(cVar);
            return r0VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        r0 r0VarA2 = l0.a(this);
        r0VarA2.a(1.0f);
        r0VarA2.c(j5);
        ((ActionBarContextView) cVar.f9581c).f650f = r0VarA2;
        cVar.f9580b = i7;
        r0VarA2.d(cVar);
        return r0VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f6544a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        k kVar = this.f648d;
        if (kVar != null) {
            Configuration configuration2 = kVar.f9799b.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
                i7 = 5;
            } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
                i7 = 4;
            } else {
                i7 = i10 >= 360 ? 3 : 2;
            }
            kVar.f9812p = i7;
            m mVar = kVar.f9800c;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f648d;
        if (kVar != null) {
            kVar.f();
            g gVar = this.f648d.f9816t;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f9246i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f652h = false;
        }
        if (!this.f652h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f652h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f652h = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11 = m3.f9836a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingRight = z12 ? (i11 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            int i13 = z12 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = z12 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = z12 ? paddingRight - i13 : paddingRight + i13;
            int iG = g(this.k, i15, paddingTop, paddingTop2, z12) + i15;
            paddingRight = z12 ? iG - i14 : iG + i14;
        }
        LinearLayout linearLayout = this.f657n;
        if (linearLayout != null && this.f656m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f657n, paddingRight, paddingTop, paddingTop2, z12);
        }
        View view2 = this.f656m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z12);
        }
        int paddingLeft = z12 ? getPaddingLeft() : (i11 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f647c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z12);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i7);
        int size2 = this.f649e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.k;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f647c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f647c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f657n;
        if (linearLayout != null && this.f656m == null) {
            if (this.f662s) {
                this.f657n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f657n.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f657n.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f656m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = Math.min(i13, iMin);
            }
            this.f656m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.f649e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f651g = false;
        }
        if (!this.f651g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f651g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f651g = false;
        return true;
    }

    public void setContentHeight(int i7) {
        this.f649e = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f656m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f656m = view;
        if (view != null && (linearLayout = this.f657n) != null) {
            removeView(linearLayout);
            this.f657n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f654j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f653i = charSequence;
        d();
        l0.k(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f662s) {
            requestLayout();
        }
        this.f662s = z10;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
