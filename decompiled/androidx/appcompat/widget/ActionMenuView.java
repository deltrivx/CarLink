package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l0.o0;
import n4.e;
import o.a0;
import o.l;
import o.m;
import o.o;
import p.g;
import p.j;
import p.k;
import p.m3;
import p.n;
import p.w1;
import p.x1;
import p.x2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends x1 implements l, a0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public k f693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x2 f694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f695v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f696w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f697x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f698y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n f699z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f697x = (int) (56.0f * f10);
        this.f698y = (int) (f10 * 4.0f);
        this.f690q = context;
        this.f691r = 0;
    }

    public static p.m i() {
        p.m mVar = new p.m(-2, -2);
        mVar.f9826a = false;
        ((LinearLayout.LayoutParams) mVar).gravity = 16;
        return mVar;
    }

    public static p.m j(ViewGroup.LayoutParams layoutParams) {
        p.m mVar;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof p.m) {
            p.m mVar2 = (p.m) layoutParams;
            mVar = new p.m(mVar2);
            mVar.f9826a = mVar2.f9826a;
        } else {
            mVar = new p.m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) mVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) mVar).gravity = 16;
        }
        return mVar;
    }

    @Override // o.a0
    public final void a(m mVar) {
        this.f689p = mVar;
    }

    @Override // o.l
    public final boolean b(o oVar) {
        return this.f689p.q(oVar, null, 0);
    }

    @Override // p.x1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p.m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p.x1
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ w1 generateDefaultLayoutParams() {
        return i();
    }

    @Override // p.x1
    /* JADX INFO: renamed from: f */
    public final w1 generateLayoutParams(AttributeSet attributeSet) {
        return new p.m(getContext(), attributeSet);
    }

    @Override // p.x1
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ w1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // p.x1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // p.x1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new p.m(getContext(), attributeSet);
    }

    @Override // p.x1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f689p == null) {
            Context context = getContext();
            m mVar = new m(context);
            this.f689p = mVar;
            mVar.f9180e = new o0(8, this);
            k kVar = new k(context);
            this.f693t = kVar;
            kVar.f9808l = true;
            kVar.f9809m = true;
            kVar.f9802e = new e(4);
            this.f689p.b(kVar, this.f690q);
            k kVar2 = this.f693t;
            kVar2.f9805h = this;
            this.f689p = kVar2.f9800c;
        }
        return this.f689p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        k kVar = this.f693t;
        j jVar = kVar.f9806i;
        if (jVar != null) {
            return jVar.getDrawable();
        }
        if (kVar.k) {
            return kVar.f9807j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f691r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i7) {
        boolean zB = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof p.l)) {
            zB = ((p.l) childAt).b();
        }
        return (i7 <= 0 || !(childAt2 instanceof p.l)) ? zB : ((p.l) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k kVar = this.f693t;
        if (kVar != null) {
            kVar.g();
            if (this.f693t.h()) {
                this.f693t.f();
                this.f693t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k kVar = this.f693t;
        if (kVar != null) {
            kVar.f();
            g gVar = kVar.f9816t;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f9246i.dismiss();
        }
    }

    @Override // p.x1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.f695v) {
            super.onLayout(z10, i7, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i7;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean z11 = m3.f9836a;
        boolean z12 = getLayoutDirection() == 1;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                p.m mVar = (p.m) childAt.getLayoutParams();
                if (mVar.f9826a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z12) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) mVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) mVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) mVar).leftMargin) + ((LinearLayout.LayoutParams) mVar).rightMargin;
                    k(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (z12) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                p.m mVar2 = (p.m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !mVar2.f9826a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) mVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) mVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            p.m mVar3 = (p.m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !mVar3.f9826a) {
                int i26 = paddingLeft2 + ((LinearLayout.LayoutParams) mVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) mVar3).rightMargin + iMax + i26;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p.x1, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        m mVar;
        boolean z10 = this.f695v;
        boolean z11 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.f695v = z11;
        if (z10 != z11) {
            this.f696w = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.f695v && (mVar = this.f689p) != null && size != this.f696w) {
            this.f696w = size;
            mVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f695v || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                p.m mVar2 = (p.m) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) mVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) mVar2).leftMargin = 0;
            }
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.f697x;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        boolean z12 = false;
        int i23 = 0;
        long j5 = 0;
        while (true) {
            i11 = this.f698y;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z13) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                p.m mVar3 = (p.m) childAt.getLayoutParams();
                mVar3.f9831f = false;
                mVar3.f9828c = 0;
                mVar3.f9827b = 0;
                mVar3.f9829d = false;
                ((LinearLayout.LayoutParams) mVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) mVar3).rightMargin = 0;
                mVar3.f9830e = z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = mVar3.f9826a ? 1 : i18;
                p.m mVar4 = (p.m) childAt.getLayoutParams();
                int i27 = i18;
                i13 = i20;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z13 ? (ActionMenuItemView) childAt : null;
                boolean z14 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z15 = z14;
                if (i26 <= 0 || (z14 && i26 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i26, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z15 && i14 < 2) {
                        i14 = 2;
                    }
                }
                mVar4.f9829d = !mVar4.f9826a && z15;
                mVar4.f9827b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i14);
                if (mVar3.f9829d) {
                    i23++;
                }
                if (mVar3.f9826a) {
                    z12 = true;
                }
                i18 = i27 - i14;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j5 |= (long) (1 << i22);
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i20 = i13;
        }
        int i28 = size3;
        int i29 = i18;
        int i30 = i20;
        boolean z16 = z12 && i21 == 2;
        int i31 = i29;
        boolean z17 = false;
        while (true) {
            if (i23 <= 0 || i31 <= 0) {
                i12 = iMax;
                break;
            }
            int i32 = Integer.MAX_VALUE;
            long j10 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                int i35 = iMax;
                p.m mVar5 = (p.m) getChildAt(i34).getLayoutParams();
                boolean z18 = z16;
                if (mVar5.f9829d) {
                    int i36 = mVar5.f9827b;
                    if (i36 < i32) {
                        j10 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j10 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z16 = z18;
                iMax = i35;
            }
            i12 = iMax;
            boolean z19 = z16;
            j5 |= j10;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                p.m mVar6 = (p.m) childAt2.getLayoutParams();
                boolean z20 = z12;
                long j11 = 1 << i38;
                if ((j10 & j11) != 0) {
                    if (z19 && mVar6.f9830e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i11 + i30, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    mVar6.f9827b += r11;
                    mVar6.f9831f = r11;
                    i31--;
                } else if (mVar6.f9827b == i37) {
                    j5 |= j11;
                }
                i38++;
                z12 = z20;
            }
            z16 = z19;
            iMax = i12;
            z17 = true;
        }
        boolean z21 = !z12 && i21 == 1;
        if (i31 > 0 && j5 != 0 && (i31 < i21 - 1 || z21 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j5);
            if (!z21) {
                if ((j5 & 1) != 0 && !((p.m) getChildAt(0).getLayoutParams()).f9830e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j5 & ((long) (1 << i39))) != 0 && !((p.m) getChildAt(i39).getLayoutParams()).f9830e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i31 * i30) / fBitCount) : 0;
            boolean z22 = z17;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j5 & ((long) (1 << i41))) != 0) {
                    View childAt3 = getChildAt(i41);
                    p.m mVar7 = (p.m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        mVar7.f9828c = i40;
                        mVar7.f9831f = true;
                        if (i41 == 0 && !mVar7.f9830e) {
                            ((LinearLayout.LayoutParams) mVar7).leftMargin = (-i40) / 2;
                        }
                        z22 = true;
                    } else if (mVar7.f9826a) {
                        mVar7.f9828c = i40;
                        mVar7.f9831f = true;
                        ((LinearLayout.LayoutParams) mVar7).rightMargin = (-i40) / 2;
                        z22 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) mVar7).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) mVar7).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z17 = z22;
        }
        if (z17) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                p.m mVar8 = (p.m) childAt4.getLayoutParams();
                if (mVar8.f9831f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((mVar8.f9827b * i30) + mVar8.f9828c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f693t.f9813q = z10;
    }

    public void setOnMenuItemClickListener(n nVar) {
        this.f699z = nVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        k kVar = this.f693t;
        j jVar = kVar.f9806i;
        if (jVar != null) {
            jVar.setImageDrawable(drawable);
        } else {
            kVar.k = true;
            kVar.f9807j = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.f692s = z10;
    }

    public void setPopupTheme(int i7) {
        if (this.f691r != i7) {
            this.f691r = i7;
            if (i7 == 0) {
                this.f690q = getContext();
            } else {
                this.f690q = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(k kVar) {
        this.f693t = kVar;
        kVar.f9805h = this;
        this.f689p = kVar.f9800c;
    }
}
