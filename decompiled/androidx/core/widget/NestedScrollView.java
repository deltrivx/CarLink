package androidx.core.widget;

import a2.d;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import b1.q;
import c.a;
import e4.g;
import e4.l;
import e4.l0;
import e4.m;
import e4.m0;
import e4.n;
import e4.t;
import e4.w;
import e4.x;
import i4.f;
import i4.h;
import i4.i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import o9.e0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements m {
    public static final float C = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final f D = new f();
    public static final int[] E = {R.attr.fillViewport};
    public float A;
    public final g B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OverScroller f989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f995j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VelocityTracker f997m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f998n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f999o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1001q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1002r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f1004t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f1005u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1006v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i f1008x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n f1009y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final q f1010z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.baidu.carlifevehicle.R.attr.nestedScrollViewStyle);
        this.f988c = new Rect();
        this.f994i = true;
        this.f995j = false;
        this.k = null;
        this.f996l = false;
        this.f999o = true;
        this.f1003s = -1;
        this.f1004t = new int[2];
        this.f1005u = new int[2];
        this.B = new g(getContext(), new d(24, this));
        int i7 = Build.VERSION.SDK_INT;
        this.f990e = i7 >= 31 ? i4.d.a(context, attributeSet) : new EdgeEffect(context);
        this.f991f = i7 >= 31 ? i4.d.a(context, attributeSet) : new EdgeEffect(context);
        this.f986a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f989d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1000p = viewConfiguration.getScaledTouchSlop();
        this.f1001q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1002r = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E, com.baidu.carlifevehicle.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1009y = new n(0);
        q qVar = new q();
        qVar.f1184d = this;
        this.f1010z = qVar;
        setNestedScrollingEnabled(true);
        l0.j(this, D);
    }

    private t getScrollFeedbackProvider() {
        if (this.f992g == null) {
            this.f992g = new t(this);
        }
        return this.f992g;
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // e4.l
    public final void a(NestedScrollView nestedScrollView, int i7, int i10, int i11, int i12, int i13) {
        o(i12, i13, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public final boolean b(int i7) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f988c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            t(c(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i7);
        }
        if (view != null && view.isFocused() && !n(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int c(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i7;
        int scrollRange;
        int i10;
        int overScrollMode;
        if (this.f989d.isFinished()) {
            return;
        }
        this.f989d.computeScrollOffset();
        int currY = this.f989d.getCurrY();
        int i11 = currY - this.f1007w;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f990e;
        EdgeEffect edgeEffect2 = this.f991f;
        if (i11 <= 0 || e0.y(edgeEffect) == 0.0f) {
            if (i11 < 0 && e0.y(edgeEffect2) != 0.0f) {
                float f10 = height;
                iRound = Math.round(e0.M(edgeEffect2, (i11 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i11) {
                    edgeEffect2.finish();
                }
            }
            this.f1007w = currY;
            iArr = this.f1005u;
            iArr[1] = 0;
            d(0, i11, 1, iArr, null);
            i7 = i11 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                i4.g.a(this, Math.abs(this.f989d.getCurrVelocity()));
            }
            if (i7 != 0) {
                int scrollY = getScrollY();
                q(i7, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i7 - scrollY2;
                iArr[1] = 0;
                i10 = 1;
                this.f1010z.b(0, scrollY2, 0, i12, this.f1004t, 1, iArr);
                i7 = i12 - iArr[1];
            } else {
                i10 = 1;
            }
            if (i7 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == i10 && scrollRange > 0)) {
                    if (i7 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.f989d.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.f989d.getCurrVelocity());
                    }
                }
                this.f989d.abortAnimation();
                y(i10);
            }
            if (this.f989d.isFinished()) {
                y(i10);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(e0.M(edgeEffect, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            edgeEffect.finish();
        }
        i11 -= iRound;
        this.f1007w = currY;
        iArr = this.f1005u;
        iArr[1] = 0;
        d(0, i11, 1, iArr, null);
        i7 = i11 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            i4.g.a(this, Math.abs(this.f989d.getCurrVelocity()));
        }
        if (i7 != 0) {
            int scrollY3 = getScrollY();
            q(i7, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i13 = i7 - scrollY4;
            iArr[1] = 0;
            i10 = 1;
            this.f1010z.b(0, scrollY4, 0, i13, this.f1004t, 1, iArr);
            i7 = i13 - iArr[1];
        } else {
            i10 = 1;
        }
        if (i7 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i7 < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.f989d.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.f989d.getCurrVelocity());
                }
            } else if (i7 < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.f989d.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.f989d.getCurrVelocity());
            }
            this.f989d.abortAnimation();
            y(i10);
        }
        if (this.f989d.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            y(i10);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final boolean d(int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent viewParentD;
        int i12;
        int i13;
        q qVar = this.f1010z;
        NestedScrollView nestedScrollView = (NestedScrollView) qVar.f1184d;
        if (!qVar.f1181a || (viewParentD = qVar.d(i11)) == null) {
            return false;
        }
        if (i7 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (((int[]) qVar.f1185e) == null) {
                qVar.f1185e = new int[2];
            }
            iArr = (int[]) qVar.f1185e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        NestedScrollView nestedScrollView2 = (NestedScrollView) qVar.f1184d;
        if (viewParentD instanceof l) {
            ((l) viewParentD).e(i7, i10, i11, iArr);
        } else if (i11 == 0) {
            try {
                viewParentD.onNestedPreScroll(nestedScrollView2, i7, i10, iArr);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentD + " does not implement interface method onNestedPreScroll", e7);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        ViewParent viewParentD;
        q qVar = this.f1010z;
        if (qVar.f1181a && (viewParentD = qVar.d(0)) != null) {
            try {
                return viewParentD.onNestedFling((NestedScrollView) qVar.f1184d, f10, f11, z10);
            } catch (AbstractMethodError e7) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentD + " does not implement interface method onNestedFling", e7);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f1010z.a(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i10, int[] iArr, int[] iArr2) {
        return d(i7, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i10, int i11, int i12, int[] iArr) {
        return this.f1010z.b(i7, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f990e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f991f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // e4.l
    public final void e(int i7, int i10, int i11, int[] iArr) {
        d(i7, i10, i11, iArr, null);
    }

    @Override // e4.l
    public final boolean f(View view, View view2, int i7, int i10) {
        return (i7 & 2) != 0;
    }

    @Override // e4.l
    public final void g(View view, View view2, int i7, int i10) {
        n nVar = this.f1009y;
        if (i10 == 1) {
            nVar.f4381c = i7;
        } else {
            nVar.f4380b = i7;
        }
        w(2, i10);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n nVar = this.f1009y;
        return nVar.f4381c | nVar.f4380b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.A;
    }

    @Override // e4.l
    public final void h(View view, int i7) {
        n nVar = this.f1009y;
        if (i7 == 1) {
            nVar.f4381c = 0;
        } else {
            nVar.f4380b = 0;
        }
        y(i7);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1010z.d(0) != null;
    }

    @Override // e4.m
    public final void i(NestedScrollView nestedScrollView, int i7, int i10, int i11, int i12, int i13, int[] iArr) {
        o(i12, i13, iArr);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1010z.f1181a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    public final boolean j(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f988c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? l(33) : b(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? l(130) : b(130);
                    }
                    if (keyCode == 62) {
                        r(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return l(33);
                    }
                    if (keyCode == 93) {
                        return l(130);
                    }
                    if (keyCode == 122) {
                        r(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        r(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    public final void k(int i7) {
        if (getChildCount() > 0) {
            this.f989d.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.f1007w = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                i4.g.a(this, Math.abs(this.f989d.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i7) {
        int childCount;
        boolean z10 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f988c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i7, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i7, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i7, int i10) {
        Rect rect = this.f988c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i7 >= getScrollY() && rect.top - i7 <= getScrollY() + i10;
    }

    public final void o(int i7, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1010z.b(0, scrollY2, 0, i7 - scrollY2, null, i10, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f995j = false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        int i7;
        int width;
        char c10;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z10;
        NestedScrollView nestedScrollView;
        float yVelocity;
        NestedScrollView nestedScrollView2;
        float f11;
        long j5;
        float f12;
        float fSqrt;
        if (motionEvent.getAction() != 8 || this.f996l) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            f10 = axisValue;
            i7 = 9;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f10 = axisValue2;
            i7 = 26;
        } else {
            f10 = 0.0f;
            i7 = 0;
            width = 0;
        }
        if (f10 == 0.0f) {
            return false;
        }
        t(-((int) (getVerticalScrollFactorCompat() * f10)), i7, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i7 != 0) {
            g gVar = this.B;
            NestedScrollView nestedScrollView3 = (NestedScrollView) gVar.f4344b.f20b;
            int[] iArr = gVar.f4350h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (gVar.f4348f == source && gVar.f4349g == deviceId && gVar.f4347e == i7) {
                z10 = false;
                c10 = 0;
            } else {
                Context context = gVar.f4343a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                c10 = 0;
                int source2 = motionEvent.getSource();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    Method method = m0.f4377a;
                    scaledMinimumFlingVelocity = a.f(viewConfiguration, deviceId2, i7, source2);
                } else {
                    Method method2 = m0.f4377a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i7, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i7 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i10 >= 34) {
                    scaledMaximumFlingVelocity = a.e(viewConfiguration, deviceId3, i7, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i7, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i7 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                gVar.f4348f = source;
                gVar.f4349g = deviceId;
                gVar.f4347e = i7;
                z10 = true;
            }
            if (iArr[c10] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = gVar.f4345c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                gVar.f4345c = null;
                return true;
            }
            if (gVar.f4345c == null) {
                gVar.f4345c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = gVar.f4345c;
            Map map = w.f4417a;
            velocityTracker2.addMovement(motionEvent);
            int i11 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = w.f4417a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new x());
                }
                x xVar = (x) map2.get(velocityTracker2);
                long[] jArr = xVar.f4421b;
                long eventTime = motionEvent.getEventTime();
                if (xVar.f4423d != 0 && eventTime - jArr[xVar.f4424e] > 40) {
                    xVar.f4423d = 0;
                    xVar.f4422c = 0.0f;
                }
                int i12 = (xVar.f4424e + 1) % 20;
                xVar.f4424e = i12;
                int i13 = xVar.f4423d;
                if (i13 != 20) {
                    xVar.f4423d = i13 + 1;
                }
                xVar.f4420a[i12] = motionEvent.getAxisValue(26);
                jArr[xVar.f4424e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
            x xVar2 = (x) w.f4417a.get(velocityTracker2);
            if (xVar2 != null) {
                float[] fArr = xVar2.f4420a;
                long[] jArr2 = xVar2.f4421b;
                int i14 = xVar2.f4423d;
                if (i14 < 2) {
                    nestedScrollView = nestedScrollView3;
                    f12 = Float.MAX_VALUE;
                    fSqrt = 0.0f;
                } else {
                    int i15 = xVar2.f4424e;
                    int i16 = ((i15 + 20) - (i14 - 1)) % 20;
                    long j10 = jArr2[i15];
                    while (true) {
                        j5 = jArr2[i16];
                        if (j10 - j5 <= 100) {
                            break;
                        }
                        xVar2.f4423d--;
                        i16 = (i16 + 1) % 20;
                    }
                    int i17 = xVar2.f4423d;
                    if (i17 < 2) {
                        nestedScrollView = nestedScrollView3;
                        f12 = Float.MAX_VALUE;
                        fSqrt = 0.0f;
                    } else if (i17 == 2) {
                        int i18 = (i16 + 1) % 20;
                        long j11 = jArr2[i18];
                        if (j5 == j11) {
                            nestedScrollView = nestedScrollView3;
                            f12 = Float.MAX_VALUE;
                            fSqrt = 0.0f;
                        } else {
                            nestedScrollView = nestedScrollView3;
                            fSqrt = fArr[i18] / (j11 - j5);
                            f12 = Float.MAX_VALUE;
                        }
                    } else {
                        f12 = Float.MAX_VALUE;
                        float f13 = 0.0f;
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            if (i19 >= xVar2.f4423d - 1) {
                                break;
                            }
                            int i21 = i19 + i16;
                            long j12 = jArr2[i21 % 20];
                            int i22 = (i21 + 1) % i11;
                            if (jArr2[i22] != j12) {
                                i20++;
                                float fSqrt2 = (f13 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f13) * 2.0f));
                                float f14 = fArr[i22] / (jArr2[i22] - j12);
                                float fAbs = (Math.abs(f14) * (f14 - fSqrt2)) + f13;
                                if (i20 == 1) {
                                    fAbs *= 0.5f;
                                }
                                f13 = fAbs;
                            }
                            i19++;
                            nestedScrollView3 = nestedScrollView3;
                            i11 = 20;
                        }
                        nestedScrollView = nestedScrollView3;
                        fSqrt = ((float) Math.sqrt(Math.abs(f13) * 2.0f)) * (f13 < 0.0f ? -1.0f : 1.0f);
                    }
                }
                float f15 = fSqrt * 1000;
                xVar2.f4422c = f15;
                if (f15 < (-Math.abs(f12))) {
                    xVar2.f4422c = -Math.abs(f12);
                } else if (xVar2.f4422c > Math.abs(f12)) {
                    xVar2.f4422c = Math.abs(f12);
                }
            } else {
                nestedScrollView = nestedScrollView3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = a.b(velocityTracker2, i7);
            } else if (i7 == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i7 == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                x xVar3 = (x) w.f4417a.get(velocityTracker2);
                yVelocity = (xVar3 == null || i7 != 26) ? 0.0f : xVar3.f4422c;
            }
            float f16 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f16);
            if (z10 || !(fSignum == Math.signum(gVar.f4346d) || fSignum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.f989d.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f16) >= iArr[0]) {
                int i23 = iArr[1];
                float fMax = Math.max(-i23, Math.min(f16, i23));
                if (fMax == 0.0f) {
                    f11 = 0.0f;
                } else {
                    nestedScrollView2.f989d.abortAnimation();
                    nestedScrollView2.k((int) fMax);
                    f11 = fMax;
                }
                gVar.f4346d = f11;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f996l) {
            return true;
        }
        int i7 = action & 255;
        if (i7 == 0) {
            int y5 = (int) motionEvent.getY();
            int x8 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y5 < childAt.getTop() - scrollY || y5 >= childAt.getBottom() - scrollY || x8 < childAt.getLeft() || x8 >= childAt.getRight()) {
                    if (!x(motionEvent) && this.f989d.isFinished()) {
                        z10 = false;
                    }
                    this.f996l = z10;
                    velocityTracker = this.f997m;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f997m = null;
                    }
                } else {
                    this.f993h = y5;
                    this.f1003s = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f997m;
                    if (velocityTracker3 == null) {
                        this.f997m = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f997m.addMovement(motionEvent);
                    this.f989d.computeScrollOffset();
                    if (!x(motionEvent) && this.f989d.isFinished()) {
                        z10 = false;
                    }
                    this.f996l = z10;
                    w(2, 0);
                }
            } else {
                if (!x(motionEvent)) {
                    z10 = false;
                }
                this.f996l = z10;
                velocityTracker = this.f997m;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f997m = null;
                }
            }
        } else if (i7 == 1) {
            this.f996l = false;
            this.f1003s = -1;
            velocityTracker2 = this.f997m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f997m = null;
            }
            if (this.f989d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i7 == 2) {
            int i10 = this.f1003s;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                } else {
                    int y6 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y6 - this.f993h) > this.f1000p && (2 & getNestedScrollAxes()) == 0) {
                        this.f996l = true;
                        this.f993h = y6;
                        if (this.f997m == null) {
                            this.f997m = VelocityTracker.obtain();
                        }
                        this.f997m.addMovement(motionEvent);
                        this.f1006v = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i7 == 3) {
            this.f996l = false;
            this.f1003s = -1;
            velocityTracker2 = this.f997m;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f997m = null;
            }
            if (this.f989d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            y(0);
        } else if (i7 == 6) {
            p(motionEvent);
        }
        return this.f996l;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredHeight;
        super.onLayout(z10, i7, i10, i11, i12);
        int i13 = 0;
        this.f994i = false;
        View view = this.k;
        if (view != null && m(view, this)) {
            View view2 = this.k;
            Rect rect = this.f988c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iC = c(rect);
            if (iC != 0) {
                scrollBy(0, iC);
            }
        }
        this.k = null;
        if (!this.f995j) {
            if (this.f1008x != null) {
                scrollTo(getScrollX(), this.f1008x.f6643a);
                this.f1008x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i13 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i13 != scrollY) {
                scrollTo(getScrollX(), i13);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f995j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (this.f998n && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        k((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.f1010z.a(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i10, int[] iArr) {
        d(i7, i10, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i10, int i11, int i12) {
        o(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        g(view, view2, i7, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i10, boolean z10, boolean z11) {
        super.scrollTo(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (viewFindNextFocus != null && n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i7, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f1008x = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f6643a = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i12)) {
            return;
        }
        Rect rect = this.f988c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iC = c(rect);
        if (iC != 0) {
            if (this.f999o) {
                v(0, iC, false);
            } else {
                scrollBy(0, iC);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        return f(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fM;
        int iRound;
        int i7;
        ViewParent parent2;
        if (this.f997m == null) {
            this.f997m = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1006v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1006v);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f990e;
            EdgeEffect edgeEffect2 = this.f991f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f997m;
                velocityTracker.computeCurrentVelocity(1000, this.f1002r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1003s);
                if (Math.abs(yVelocity) >= this.f1001q) {
                    if (e0.y(edgeEffect) != 0.0f) {
                        if (u(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (e0.y(edgeEffect2) != 0.0f) {
                        int i10 = -yVelocity;
                        if (u(edgeEffect2, i10)) {
                            edgeEffect2.onAbsorb(i10);
                        } else {
                            k(i10);
                        }
                    } else {
                        int i11 = -yVelocity;
                        float f11 = i11;
                        if (!this.f1010z.a(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            k(i11);
                        }
                    }
                } else if (this.f989d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1003s = -1;
                this.f996l = false;
                VelocityTracker velocityTracker2 = this.f997m;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f997m = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1003s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1003s + " in onTouchEvent");
                } else {
                    int y5 = (int) motionEvent.getY(iFindPointerIndex);
                    int i12 = this.f993h - y5;
                    float x8 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i12 / getHeight();
                    if (e0.y(edgeEffect) != 0.0f) {
                        fM = -e0.M(edgeEffect, -height, x8);
                        if (e0.y(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (e0.y(edgeEffect2) != 0.0f) {
                        fM = e0.M(edgeEffect2, height, 1.0f - x8);
                        if (e0.y(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f10 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i7 = i12 - iRound;
                        if (!this.f996l && Math.abs(i7) > this.f1000p) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f996l = true;
                            if (i7 > 0) {
                                i7 -= this.f1000p;
                            } else {
                                i7 += this.f1000p;
                            }
                        }
                        if (this.f996l) {
                            int iT = t(i7, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f993h = y5 - iT;
                            this.f1006v += iT;
                        }
                    }
                    f10 = fM;
                    iRound = Math.round(f10 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i7 = i12 - iRound;
                    if (!this.f996l) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f996l = true;
                        if (i7 > 0) {
                            i7 -= this.f1000p;
                        } else {
                            i7 += this.f1000p;
                        }
                    }
                    if (this.f996l) {
                        int iT2 = t(i7, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f993h = y5 - iT2;
                        this.f1006v += iT2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f996l && getChildCount() > 0) {
                    if (this.f989d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f1003s = -1;
                this.f996l = false;
                VelocityTracker velocityTracker3 = this.f997m;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f997m = null;
                }
                y(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f993h = (int) motionEvent.getY(actionIndex);
                this.f1003s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f993h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1003s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f996l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f989d.isFinished()) {
                this.f989d.abortAnimation();
                y(1);
            }
            int y6 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f993h = y6;
            this.f1003s = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f997m;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1003s) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f993h = (int) motionEvent.getY(i7);
            this.f1003s = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f997m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i7, int i10, int i11, int i12) {
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i15 = i11 + i7;
        if (i10 <= 0 && i10 >= 0) {
            i13 = i10;
            z10 = false;
        } else {
            z10 = true;
            i13 = 0;
        }
        if (i15 > i12) {
            i14 = i12;
            z11 = true;
        } else if (i15 < 0) {
            z11 = true;
            i14 = 0;
        } else {
            i14 = i15;
            z11 = false;
        }
        if (z11 && this.f1010z.d(1) == null) {
            this.f989d.springBack(i13, i14, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i13, i14);
        return z10 || z11;
    }

    public final void r(int i7) {
        boolean z10 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f988c;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        s(i7, i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f994i) {
            this.k = view2;
        } else {
            Rect rect = this.f988c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iC = c(rect);
            if (iC != 0) {
                scrollBy(0, iC);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iC = c(rect);
        boolean z11 = iC != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iC);
                return z11;
            }
            v(0, iC, false);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f997m) != null) {
            velocityTracker.recycle();
            this.f997m = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f994i = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean s(int i7, int i10, int i11) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z11 = i7 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z13 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i10 < scrollY || i11 > i12) {
            t(z11 ? i10 - scrollY : i11 - i12, -1, null, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i7);
        }
        return z10;
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i7 < 0) {
                i7 = 0;
            } else if (width + i7 > width2) {
                i7 = width2 - width;
            }
            if (height >= height2 || i10 < 0) {
                i10 = 0;
            } else if (height + i10 > height2) {
                i10 = height2 - height;
            }
            if (i7 == getScrollX() && i10 == getScrollY()) {
                return;
            }
            super.scrollTo(i7, i10);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f998n) {
            this.f998n = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        q qVar = this.f1010z;
        if (qVar.f1181a) {
            NestedScrollView nestedScrollView = (NestedScrollView) qVar.f1184d;
            WeakHashMap weakHashMap = l0.f4369a;
            e4.e0.j(nestedScrollView);
        }
        qVar.f1181a = z10;
    }

    public void setOnScrollChangeListener(h hVar) {
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f999o = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return w(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x0126  */
    public final int t(int i7, int i10, MotionEvent motionEvent, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        boolean z11;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            w(2, i12);
        }
        boolean zD = d(0, i7, i12, this.f1005u, this.f1004t);
        int[] iArr = this.f1004t;
        int[] iArr2 = this.f1005u;
        if (zD) {
            i13 = i7 - iArr2[1];
            i14 = iArr[1];
        } else {
            i13 = i7;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z12 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z13 = q(i13, 0, scrollY, scrollRange) && this.f1010z.d(i12) == null;
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f4399a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i10, scrollY2);
        }
        iArr2[1] = 0;
        this.f1010z.b(0, scrollY2, 0, i13 - scrollY2, this.f1004t, i12, iArr2);
        int i15 = i14 + iArr[1];
        int i16 = i13 - iArr2[1];
        int i17 = scrollY + i16;
        EdgeEffect edgeEffect = this.f991f;
        EdgeEffect edgeEffect2 = this.f990e;
        if (i17 >= 0) {
            if (i17 > scrollRange && z12) {
                e0.M(edgeEffect, i16 / getHeight(), 1.0f - (i11 / getWidth()));
                if (motionEvent != null) {
                    getScrollFeedbackProvider().f4399a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i10, false);
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z11 = false;
            } else {
                z11 = z13;
            }
            if (z11 && i12 == 0 && (velocityTracker = this.f997m) != null) {
                velocityTracker.clear();
            }
            if (i12 == 1) {
                y(i12);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i15;
        }
        if (z12) {
            e0.M(edgeEffect2, (-i16) / getHeight(), i11 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f4399a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i10, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z11 = false;
        } else {
            postInvalidateOnAnimation();
            z11 = false;
        }
        if (z11) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            y(i12);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i15;
    }

    public final boolean u(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        float fY = e0.y(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i7) * 0.35f;
        float f10 = this.f986a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = C;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fY;
    }

    public final void v(int i7, int i10, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f987b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f989d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z10) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f1007w = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f989d.isFinished()) {
                this.f989d.abortAnimation();
                y(1);
            }
            scrollBy(i7, i10);
        }
        this.f987b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(int i7, int i10) {
        boolean zOnStartNestedScroll;
        q qVar = this.f1010z;
        View view = (NestedScrollView) qVar.f1184d;
        if (qVar.d(i10) != null) {
            return true;
        }
        if (qVar.f1181a) {
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z10 = parent instanceof l;
                if (z10) {
                    zOnStartNestedScroll = ((l) parent).f(view2, view, i7, i10);
                } else if (i10 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i7);
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e7);
                        zOnStartNestedScroll = false;
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i10 == 0) {
                        qVar.f1182b = parent;
                    } else if (i10 == 1) {
                        qVar.f1183c = parent;
                    }
                    if (z10) {
                        ((l) parent).g(view2, view, i7, i10);
                        return true;
                    }
                    if (i10 != 0) {
                        return true;
                    }
                    try {
                        parent.onNestedScrollAccepted(view2, view, i7);
                        return true;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e10);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f990e;
        if (e0.y(edgeEffect) != 0.0f) {
            e0.M(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f991f;
        if (e0.y(edgeEffect2) == 0.0f) {
            return z10;
        }
        e0.M(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i7) {
        q qVar = this.f1010z;
        ViewParent viewParentD = qVar.d(i7);
        if (viewParentD != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) qVar.f1184d;
            if (viewParentD instanceof l) {
                ((l) viewParentD).h(nestedScrollView, i7);
            } else if (i7 == 0) {
                try {
                    viewParentD.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentD + " does not implement interface method onStopNestedScroll", e7);
                }
            }
            if (i7 == 0) {
                qVar.f1182b = null;
            } else {
                if (i7 != 1) {
                    return;
                }
                qVar.f1183c = null;
            }
        }
    }
}
