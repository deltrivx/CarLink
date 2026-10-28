package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f9963i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f9964j;
    public Drawable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9965l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9966m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9967n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9968o;

    public x1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9955a = true;
        this.f9956b = -1;
        this.f9957c = 0;
        this.f9959e = 8388659;
        int[] iArr = i.a.f6556n;
        a2.b bVarP = a2.b.P(context, attributeSet, iArr, 0);
        e4.l0.i(this, context, iArr, attributeSet, (TypedArray) bVarP.f13c, 0);
        TypedArray typedArray = (TypedArray) bVarP.f13c;
        int i7 = typedArray.getInt(1, -1);
        if (i7 >= 0) {
            setOrientation(i7);
        }
        int i10 = typedArray.getInt(0, -1);
        if (i10 >= 0) {
            setGravity(i10);
        }
        boolean z10 = typedArray.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f9961g = typedArray.getFloat(4, -1.0f);
        this.f9956b = typedArray.getInt(3, -1);
        this.f9962h = typedArray.getBoolean(7, false);
        setDividerDrawable(bVarP.D(5));
        this.f9967n = typedArray.getInt(8, 0);
        this.f9968o = typedArray.getDimensionPixelSize(6, 0);
        bVarP.V();
    }

    public final void c(Canvas canvas, int i7) {
        this.k.setBounds(getPaddingLeft() + this.f9968o, i7, (getWidth() - getPaddingRight()) - this.f9968o, this.f9966m + i7);
        this.k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w1;
    }

    public final void d(Canvas canvas, int i7) {
        this.k.setBounds(i7, getPaddingTop() + this.f9968o, this.f9965l + i7, (getHeight() - getPaddingBottom()) - this.f9968o);
        this.k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public w1 generateDefaultLayoutParams() {
        int i7 = this.f9958d;
        if (i7 == 0) {
            return new w1(-2, -2);
        }
        if (i7 == 1) {
            return new w1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public w1 generateLayoutParams(AttributeSet attributeSet) {
        return new w1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public w1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof w1) {
            return new w1((w1) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new w1((ViewGroup.MarginLayoutParams) layoutParams) : new w1(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f9956b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f9956b;
        if (childCount <= i10) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i10);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f9956b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f9957c;
        if (this.f9958d == 1 && (i7 = this.f9959e & 112) != 48) {
            if (i7 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f9960f) / 2;
            } else if (i7 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f9960f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f9956b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.f9968o;
    }

    public int getDividerWidth() {
        return this.f9965l;
    }

    public int getGravity() {
        return this.f9959e;
    }

    public int getOrientation() {
        return this.f9958d;
    }

    public int getShowDividers() {
        return this.f9967n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f9961g;
    }

    public final boolean h(int i7) {
        if (i7 == 0) {
            return (this.f9967n & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.f9967n & 4) != 0;
        }
        if ((this.f9967n & 2) != 0) {
            for (int i10 = i7 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i7;
        int bottom;
        if (this.k == null) {
            return;
        }
        int i10 = 0;
        if (this.f9958d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && h(i10)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((w1) childAt.getLayoutParams())).topMargin) - this.f9966m);
                }
                i10++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f9966m;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((w1) childAt2.getLayoutParams())).bottomMargin;
                }
                c(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z10 = m3.f9836a;
        boolean z11 = getLayoutDirection() == 1;
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i10)) {
                w1 w1Var = (w1) childAt3.getLayoutParams();
                d(canvas, z11 ? childAt3.getRight() + ((LinearLayout.LayoutParams) w1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) w1Var).leftMargin) - this.f9965l);
            }
            i10++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                w1 w1Var2 = (w1) childAt4.getLayoutParams();
                if (z11) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                    i7 = this.f9965l;
                    right = left - i7;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) w1Var2).rightMargin;
                }
            } else if (z11) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.f9965l;
                right = left - i7;
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:67:0x0166  */
    /* JADX WARN: Code duplicated, block: B:69:0x016a  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0176  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    /* JADX WARN: Code duplicated, block: B:77:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a8  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int paddingLeft;
        int i13;
        int i14;
        int i15;
        int i16;
        int baseline;
        int i17;
        int i18;
        int i19;
        int measuredHeight;
        int i20;
        int paddingTop;
        int i21;
        int i22;
        int i23;
        int i24 = 8;
        if (this.f9958d == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i25 = i11 - i7;
            int paddingRight = i25 - getPaddingRight();
            int paddingRight2 = (i25 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i26 = this.f9959e;
            int i27 = i26 & 112;
            int i28 = 8388615 & i26;
            if (i27 != 16) {
                paddingTop = i27 != 80 ? getPaddingTop() : ((getPaddingTop() + i12) - i10) - this.f9960f;
            } else {
                paddingTop = getPaddingTop() + (((i12 - i10) - this.f9960f) / 2);
            }
            int i29 = 0;
            while (i29 < virtualChildCount) {
                View childAt = getChildAt(i29);
                if (childAt != null && childAt.getVisibility() != i24) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    w1 w1Var = (w1) childAt.getLayoutParams();
                    int i30 = ((LinearLayout.LayoutParams) w1Var).gravity;
                    if (i30 < 0) {
                        i30 = i28;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i30, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i23 = ((LinearLayout.LayoutParams) w1Var).leftMargin + paddingLeft2;
                        } else {
                            i21 = paddingRight - measuredWidth;
                            i22 = ((LinearLayout.LayoutParams) w1Var).rightMargin;
                        }
                        if (h(i29)) {
                            paddingTop += this.f9966m;
                        }
                        int i31 = paddingTop + ((LinearLayout.LayoutParams) w1Var).topMargin;
                        childAt.layout(i23, i31, measuredWidth + i23, i31 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i31;
                    } else {
                        i21 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) w1Var).leftMargin;
                        i22 = ((LinearLayout.LayoutParams) w1Var).rightMargin;
                    }
                    i23 = i21 - i22;
                    if (h(i29)) {
                        paddingTop += this.f9966m;
                    }
                    int i32 = paddingTop + ((LinearLayout.LayoutParams) w1Var).topMargin;
                    childAt.layout(i23, i32, measuredWidth + i23, i32 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) w1Var).bottomMargin + i32;
                }
                i29++;
                i24 = 8;
            }
            return;
        }
        boolean z11 = m3.f9836a;
        boolean z12 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i33 = i12 - i10;
        int paddingBottom = i33 - getPaddingBottom();
        int paddingBottom2 = (i33 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i34 = this.f9959e;
        int i35 = 8388615 & i34;
        int i36 = i34 & 112;
        boolean z13 = this.f9955a;
        int[] iArr = this.f9963i;
        int[] iArr2 = this.f9964j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i35, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i11) - i7) - this.f9960f;
        } else {
            paddingLeft = getPaddingLeft() + (((i11 - i7) - this.f9960f) / 2);
        }
        if (z12) {
            i13 = virtualChildCount2 - 1;
            i14 = -1;
        } else {
            i13 = 0;
            i14 = 1;
        }
        int i37 = 0;
        while (i37 < virtualChildCount2) {
            int i38 = (i14 * i37) + i13;
            View childAt2 = getChildAt(i38);
            if (childAt2 == null) {
                i15 = i13;
            } else {
                i15 = i13;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    w1 w1Var2 = (w1) childAt2.getLayoutParams();
                    int i39 = paddingLeft;
                    if (z13) {
                        i16 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) w1Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i17 = ((LinearLayout.LayoutParams) w1Var2).gravity;
                        if (i17 < 0) {
                            i17 = i36;
                        }
                        i18 = i17 & 112;
                        if (i18 != 16) {
                            if (i18 != 48) {
                                i19 = i16 + ((LinearLayout.LayoutParams) w1Var2).topMargin;
                                if (baseline != -1) {
                                    i19 = (iArr[1] - baseline) + i19;
                                }
                            } else if (i18 != 80) {
                                i19 = i16;
                            } else {
                                i19 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (h(i38)) {
                                i20 = i39 + this.f9965l;
                            } else {
                                i20 = i39;
                            }
                            int i40 = i20 + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                            childAt2.layout(i40, i19, i40 + measuredWidth2, i19 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i40;
                        } else {
                            i19 = ((paddingBottom2 - measuredHeight3) / 2) + i16 + ((LinearLayout.LayoutParams) w1Var2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                        }
                        i19 -= measuredHeight;
                        if (h(i38)) {
                            i20 = i39 + this.f9965l;
                        } else {
                            i20 = i39;
                        }
                        int i41 = i20 + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                        childAt2.layout(i41, i19, i41 + measuredWidth2, i19 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i41;
                    } else {
                        i16 = paddingTop2;
                    }
                    i17 = ((LinearLayout.LayoutParams) w1Var2).gravity;
                    if (i17 < 0) {
                        i17 = i36;
                    }
                    i18 = i17 & 112;
                    if (i18 != 16) {
                        if (i18 != 48) {
                            i19 = i16 + ((LinearLayout.LayoutParams) w1Var2).topMargin;
                            if (baseline != -1) {
                                i19 = (iArr[1] - baseline) + i19;
                            }
                        } else if (i18 != 80) {
                            i19 = i16;
                        } else {
                            i19 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (h(i38)) {
                            i20 = i39 + this.f9965l;
                        } else {
                            i20 = i39;
                        }
                        int i42 = i20 + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                        childAt2.layout(i42, i19, i42 + measuredWidth2, i19 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i42;
                    } else {
                        i19 = ((paddingBottom2 - measuredHeight3) / 2) + i16 + ((LinearLayout.LayoutParams) w1Var2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) w1Var2).bottomMargin;
                    }
                    i19 -= measuredHeight;
                    if (h(i38)) {
                        i20 = i39 + this.f9965l;
                    } else {
                        i20 = i39;
                    }
                    int i43 = i20 + ((LinearLayout.LayoutParams) w1Var2).leftMargin;
                    childAt2.layout(i43, i19, i43 + measuredWidth2, i19 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) w1Var2).rightMargin + i43;
                }
                i37++;
                i13 = i15;
                paddingTop2 = i16;
            }
            i16 = paddingTop2;
            i37++;
            i13 = i15;
            paddingTop2 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x04df  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:233:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:235:0x0501  */
    /* JADX WARN: Code duplicated, block: B:237:0x0522  */
    /* JADX WARN: Code duplicated, block: B:243:0x0531  */
    /* JADX WARN: Code duplicated, block: B:246:0x0538 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x053b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0542 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x0545  */
    /* JADX WARN: Code duplicated, block: B:366:0x0795  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int iMax;
        int i13;
        int baseline;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        boolean z10;
        boolean z11;
        w1 w1Var;
        View view;
        int i18;
        int[] iArr2;
        int i19;
        int i20;
        boolean z12;
        int i21;
        int measuredHeight;
        boolean z13;
        boolean z14;
        int iMax2;
        int i22;
        int baseline2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z15;
        int i28;
        int i29;
        int i30;
        View view2;
        boolean z16;
        x1 x1Var = this;
        int i31 = -2;
        int iMax3 = 0;
        int i32 = 1073741824;
        int i33 = 8;
        if (x1Var.f9958d == 1) {
            x1Var.f9960f = 0;
            int virtualChildCount = x1Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i10);
            int i34 = x1Var.f9956b;
            boolean z17 = x1Var.f9962h;
            int i35 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            int iMax6 = 0;
            float f10 = 0.0f;
            boolean z18 = false;
            int i36 = 0;
            boolean z19 = false;
            boolean z20 = true;
            while (i35 < virtualChildCount) {
                int i37 = mode;
                View childAt = x1Var.getChildAt(i35);
                if (childAt == null) {
                    x1Var.f9960f = x1Var.f9960f;
                } else {
                    if (childAt.getVisibility() != i33) {
                        if (x1Var.h(i35)) {
                            x1Var.f9960f += x1Var.f9966m;
                        }
                        w1 w1Var2 = (w1) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) w1Var2).weight;
                        f10 += f11;
                        if (mode2 == i32 && ((LinearLayout.LayoutParams) w1Var2).height == 0 && f11 > 0.0f) {
                            int i38 = x1Var.f9960f;
                            x1Var.f9960f = Math.max(i38, ((LinearLayout.LayoutParams) w1Var2).topMargin + i38 + ((LinearLayout.LayoutParams) w1Var2).bottomMargin);
                            view2 = childAt;
                            i27 = mode2;
                            i28 = i34;
                            z15 = z17;
                            i29 = i35;
                            i30 = i37;
                            z18 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) w1Var2).height != 0 || f11 <= 0.0f) {
                                i26 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) w1Var2).height = i31;
                                i26 = 0;
                            }
                            i27 = mode2;
                            z15 = z17;
                            i28 = i34;
                            i29 = i35;
                            i30 = i37;
                            x1Var.measureChildWithMargins(childAt, i7, 0, i10, f10 == 0.0f ? x1Var.f9960f : 0);
                            if (i26 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) w1Var2).height = i26;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i39 = x1Var.f9960f;
                            view2 = childAt;
                            x1Var.f9960f = Math.max(i39, i39 + measuredHeight2 + ((LinearLayout.LayoutParams) w1Var2).topMargin + ((LinearLayout.LayoutParams) w1Var2).bottomMargin);
                            if (z15) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i28 >= 0 && i28 == i29 + 1) {
                            x1Var.f9957c = x1Var.f9960f;
                        }
                        if (i29 < i28 && ((LinearLayout.LayoutParams) w1Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i30 == 1073741824 || ((LinearLayout.LayoutParams) w1Var2).width != -1) {
                            z16 = false;
                        } else {
                            z16 = true;
                            z19 = true;
                        }
                        int i40 = ((LinearLayout.LayoutParams) w1Var2).leftMargin + ((LinearLayout.LayoutParams) w1Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i40;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z21 = z16;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i36, measuredState);
                        if (z20) {
                            i36 = iCombineMeasuredStates;
                            boolean z22 = ((LinearLayout.LayoutParams) w1Var2).width == -1;
                            if (((LinearLayout.LayoutParams) w1Var2).weight > 0.0f) {
                                if (!z21) {
                                    i40 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i40);
                            } else {
                                if (!z21) {
                                    i40 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i40);
                            }
                            z20 = z22;
                        } else {
                            i36 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) w1Var2).weight > 0.0f) {
                            if (!z21) {
                                i40 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i40);
                        } else {
                            if (!z21) {
                                i40 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i40);
                        }
                        z20 = z22;
                    }
                    i35 = i29 + 1;
                    i34 = i28;
                    mode = i30;
                    z17 = z15;
                    mode2 = i27;
                    i31 = -2;
                    i32 = 1073741824;
                    i33 = 8;
                }
                i27 = mode2;
                i28 = i34;
                z15 = z17;
                i29 = i35;
                i30 = i37;
                i35 = i29 + 1;
                i34 = i28;
                mode = i30;
                z17 = z15;
                mode2 = i27;
                i31 = -2;
                i32 = 1073741824;
                i33 = 8;
            }
            int i41 = mode;
            int i42 = mode2;
            boolean z23 = z17;
            int i43 = i36;
            int i44 = i10;
            if (x1Var.f9960f > 0 && x1Var.h(virtualChildCount)) {
                x1Var.f9960f += x1Var.f9966m;
            }
            if (z23 && (i42 == Integer.MIN_VALUE || i42 == 0)) {
                x1Var.f9960f = 0;
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View childAt2 = x1Var.getChildAt(i45);
                    if (childAt2 == null) {
                        x1Var.f9960f = x1Var.f9960f;
                    } else if (childAt2.getVisibility() != 8) {
                        w1 w1Var3 = (w1) childAt2.getLayoutParams();
                        int i46 = x1Var.f9960f;
                        x1Var.f9960f = Math.max(i46, i46 + iMax6 + ((LinearLayout.LayoutParams) w1Var3).topMargin + ((LinearLayout.LayoutParams) w1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = x1Var.getPaddingBottom() + x1Var.getPaddingTop() + x1Var.f9960f;
            x1Var.f9960f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, x1Var.getSuggestedMinimumHeight()), i44, 0);
            int i47 = (iResolveSizeAndState & 16777215) - x1Var.f9960f;
            if (z18 || (i47 != 0 && f10 > 0.0f)) {
                float f12 = x1Var.f9961g;
                if (f12 > 0.0f) {
                    f10 = f12;
                }
                x1Var.f9960f = 0;
                int iCombineMeasuredStates2 = i43;
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt3 = x1Var.getChildAt(i48);
                    if (childAt3.getVisibility() == 8) {
                        i48 = i48;
                    } else {
                        w1 w1Var4 = (w1) childAt3.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) w1Var4).weight;
                        if (f13 > 0.0f) {
                            int i49 = (int) ((i47 * f13) / f10);
                            f10 -= f13;
                            i47 -= i49;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, x1Var.getPaddingRight() + x1Var.getPaddingLeft() + ((LinearLayout.LayoutParams) w1Var4).leftMargin + ((LinearLayout.LayoutParams) w1Var4).rightMargin, ((LinearLayout.LayoutParams) w1Var4).width);
                            if (((LinearLayout.LayoutParams) w1Var4).height == 0) {
                                i25 = 1073741824;
                                if (i42 == 1073741824) {
                                    if (i49 <= 0) {
                                        i49 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i25 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i49;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i25));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i50 = ((LinearLayout.LayoutParams) w1Var4).leftMargin + ((LinearLayout.LayoutParams) w1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i50;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i41 != 1073741824) {
                            i24 = -1;
                            if (((LinearLayout.LayoutParams) w1Var4).width == -1) {
                                measuredWidth2 = i50;
                            }
                        } else {
                            i24 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z24 = z20 && ((LinearLayout.LayoutParams) w1Var4).width == i24;
                        int i51 = x1Var.f9960f;
                        x1Var.f9960f = Math.max(i51, childAt3.getMeasuredHeight() + i51 + ((LinearLayout.LayoutParams) w1Var4).topMargin + ((LinearLayout.LayoutParams) w1Var4).bottomMargin);
                        z20 = z24;
                    }
                    i48++;
                }
                x1Var.f9960f = x1Var.getPaddingBottom() + x1Var.getPaddingTop() + x1Var.f9960f;
                i43 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z23 && i42 != 1073741824) {
                    for (int i52 = 0; i52 < virtualChildCount; i52++) {
                        View childAt4 = x1Var.getChildAt(i52);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((w1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z20 || i41 == 1073741824) {
                iMax4 = iMax3;
            }
            x1Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(x1Var.getPaddingRight() + x1Var.getPaddingLeft() + iMax4, x1Var.getSuggestedMinimumWidth()), i7, i43), iResolveSizeAndState);
            if (z19) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(x1Var.getMeasuredWidth(), 1073741824);
                int i53 = 0;
                while (i53 < virtualChildCount) {
                    View childAt5 = x1Var.getChildAt(i53);
                    if (childAt5.getVisibility() != 8) {
                        w1 w1Var5 = (w1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) w1Var5).width == -1) {
                            int i54 = ((LinearLayout.LayoutParams) w1Var5).height;
                            ((LinearLayout.LayoutParams) w1Var5).height = childAt5.getMeasuredHeight();
                            x1Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i44, 0);
                            ((LinearLayout.LayoutParams) w1Var5).height = i54;
                        }
                    }
                    i53++;
                    i44 = i10;
                }
                return;
            }
            return;
        }
        int i55 = i7;
        x1Var.f9960f = 0;
        int virtualChildCount2 = x1Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i55);
        int mode4 = View.MeasureSpec.getMode(i10);
        if (x1Var.f9963i == null || x1Var.f9964j == null) {
            x1Var.f9963i = new int[4];
            x1Var.f9964j = new int[4];
        }
        int[] iArr3 = x1Var.f9963i;
        int[] iArr4 = x1Var.f9964j;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z25 = x1Var.f9955a;
        boolean z26 = x1Var.f9962h;
        boolean z27 = mode3 == 1073741824;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z28 = false;
        boolean z29 = false;
        float f14 = 0.0f;
        boolean z30 = true;
        while (i56 < virtualChildCount2) {
            View childAt6 = x1Var.getChildAt(i56);
            if (childAt6 == null) {
                x1Var.f9960f = x1Var.f9960f;
                i17 = i56;
                i22 = i58;
                iArr2 = iArr3;
                iArr = iArr4;
                z10 = z25;
                z11 = z26;
            } else {
                int i59 = i57;
                if (childAt6.getVisibility() == 8) {
                    i55 = i7;
                    i17 = i56;
                    i22 = i58;
                    iArr = iArr4;
                    z10 = z25;
                    z11 = z26;
                    i57 = i59;
                    iArr2 = iArr3;
                } else {
                    if (x1Var.h(i56)) {
                        x1Var.f9960f += x1Var.f9965l;
                    }
                    w1 w1Var6 = (w1) childAt6.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) w1Var6).weight;
                    f14 += f15;
                    int i60 = i56;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) w1Var6).width == 0 && f15 > 0.0f) {
                        if (z27) {
                            x1Var.f9960f = ((LinearLayout.LayoutParams) w1Var6).leftMargin + ((LinearLayout.LayoutParams) w1Var6).rightMargin + x1Var.f9960f;
                        } else {
                            int i61 = x1Var.f9960f;
                            x1Var.f9960f = Math.max(i61, ((LinearLayout.LayoutParams) w1Var6).leftMargin + i61 + ((LinearLayout.LayoutParams) w1Var6).rightMargin);
                        }
                        if (z25) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z10 = z25;
                            z11 = z26;
                            i18 = i59;
                            i17 = i60;
                            w1Var = w1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i55 = i7;
                            i19 = i58;
                            i16 = iMax7;
                        } else {
                            view = childAt6;
                            z10 = z25;
                            z11 = z26;
                            i18 = i59;
                            i17 = i60;
                            i20 = 1073741824;
                            z29 = true;
                            w1Var = w1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i55 = i7;
                            i19 = i58;
                            i16 = iMax7;
                        }
                        if (mode4 == i20 && ((LinearLayout.LayoutParams) w1Var).height == -1) {
                            z12 = true;
                            z28 = true;
                        } else {
                            z12 = false;
                        }
                        i21 = ((LinearLayout.LayoutParams) w1Var).topMargin + ((LinearLayout.LayoutParams) w1Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i21;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z10) {
                            baseline2 = view.getBaseline();
                            z13 = z12;
                            if (baseline2 != -1) {
                                i23 = ((LinearLayout.LayoutParams) w1Var).gravity;
                                if (i23 < 0) {
                                    i23 = x1Var.f9959e;
                                }
                                int i62 = (((i23 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i62] = Math.max(iArr2[i62], baseline2);
                                iArr[i62] = Math.max(iArr[i62], measuredHeight - baseline2);
                            }
                        } else {
                            z13 = z12;
                        }
                        int iMax9 = Math.max(i18, measuredHeight);
                        if (z30 || ((LinearLayout.LayoutParams) w1Var).height != -1) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (((LinearLayout.LayoutParams) w1Var).weight > 0.0f) {
                            if (!z13) {
                                i21 = measuredHeight;
                            }
                            iMax7 = Math.max(i16, i21);
                            iMax2 = i19;
                        } else {
                            if (!z13) {
                                i21 = measuredHeight;
                            }
                            iMax2 = Math.max(i19, i21);
                            iMax7 = i16;
                        }
                        int i63 = iMax2;
                        i57 = iMax9;
                        i22 = i63;
                        z30 = z14;
                    } else {
                        if (((LinearLayout.LayoutParams) w1Var6).width != 0 || f15 <= 0.0f) {
                            i15 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) w1Var6).width = -2;
                            i15 = 0;
                        }
                        iArr = iArr4;
                        i16 = iMax7;
                        i17 = i60;
                        z10 = z25;
                        z11 = z26;
                        int i64 = i15;
                        w1Var = w1Var6;
                        view = childAt6;
                        i18 = i59;
                        i55 = i7;
                        iArr2 = iArr3;
                        i19 = i58;
                        x1Var.measureChildWithMargins(view, i55, f14 == 0.0f ? x1Var.f9960f : 0, i10, 0);
                        if (i64 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) w1Var).width = i64;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z27) {
                            x1Var.f9960f = ((LinearLayout.LayoutParams) w1Var).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) w1Var).rightMargin + x1Var.f9960f;
                        } else {
                            int i65 = x1Var.f9960f;
                            x1Var.f9960f = Math.max(i65, i65 + measuredWidth3 + ((LinearLayout.LayoutParams) w1Var).leftMargin + ((LinearLayout.LayoutParams) w1Var).rightMargin);
                        }
                        if (z11) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i20 = 1073741824;
                    if (mode4 == i20) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    i21 = ((LinearLayout.LayoutParams) w1Var).topMargin + ((LinearLayout.LayoutParams) w1Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i21;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z10) {
                        baseline2 = view.getBaseline();
                        z13 = z12;
                        if (baseline2 != -1) {
                            i23 = ((LinearLayout.LayoutParams) w1Var).gravity;
                            if (i23 < 0) {
                                i23 = x1Var.f9959e;
                            }
                            int i66 = (((i23 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i66] = Math.max(iArr2[i66], baseline2);
                            iArr[i66] = Math.max(iArr[i66], measuredHeight - baseline2);
                        }
                    } else {
                        z13 = z12;
                    }
                    int iMax10 = Math.max(i18, measuredHeight);
                    if (z30) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (((LinearLayout.LayoutParams) w1Var).weight > 0.0f) {
                        if (!z13) {
                            i21 = measuredHeight;
                        }
                        iMax7 = Math.max(i16, i21);
                        iMax2 = i19;
                    } else {
                        if (!z13) {
                            i21 = measuredHeight;
                        }
                        iMax2 = Math.max(i19, i21);
                        iMax7 = i16;
                    }
                    int i67 = iMax2;
                    i57 = iMax10;
                    i22 = i67;
                    z30 = z14;
                }
            }
            i58 = i22;
            i56 = i17 + 1;
            iArr3 = iArr2;
            iArr4 = iArr;
            z25 = z10;
            z26 = z11;
        }
        int i68 = i57;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        boolean z31 = z25;
        boolean z32 = z26;
        int i69 = i58;
        int i70 = iMax7;
        if (x1Var.f9960f > 0 && x1Var.h(virtualChildCount2)) {
            x1Var.f9960f += x1Var.f9965l;
        }
        int i71 = iArr5[1];
        int iMax11 = (i71 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i68 : Math.max(i68, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i71, iArr5[2]))));
        if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            x1Var.f9960f = 0;
            for (int i72 = 0; i72 < virtualChildCount2; i72++) {
                View childAt7 = x1Var.getChildAt(i72);
                if (childAt7 == null) {
                    x1Var.f9960f = x1Var.f9960f;
                } else if (childAt7.getVisibility() != 8) {
                    w1 w1Var7 = (w1) childAt7.getLayoutParams();
                    if (z27) {
                        x1Var.f9960f = ((LinearLayout.LayoutParams) w1Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) w1Var7).rightMargin + x1Var.f9960f;
                    } else {
                        int i73 = x1Var.f9960f;
                        x1Var.f9960f = Math.max(i73, i73 + iMax8 + ((LinearLayout.LayoutParams) w1Var7).leftMargin + ((LinearLayout.LayoutParams) w1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = x1Var.getPaddingRight() + x1Var.getPaddingLeft() + x1Var.f9960f;
        x1Var.f9960f = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, x1Var.getSuggestedMinimumWidth()), i55, 0);
        int i74 = (iResolveSizeAndState2 & 16777215) - x1Var.f9960f;
        if (z29 || (i74 != 0 && f14 > 0.0f)) {
            float f16 = x1Var.f9961g;
            if (f16 > 0.0f) {
                f14 = f16;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            x1Var.f9960f = 0;
            iMax11 = -1;
            int i75 = 0;
            while (i75 < virtualChildCount2) {
                View childAt8 = x1Var.getChildAt(i75);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    w1 w1Var8 = (w1) childAt8.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) w1Var8).weight;
                    if (f17 > 0.0f) {
                        int i76 = (int) ((i74 * f17) / f14);
                        f14 -= f17;
                        i74 -= i76;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, x1Var.getPaddingBottom() + x1Var.getPaddingTop() + ((LinearLayout.LayoutParams) w1Var8).topMargin + ((LinearLayout.LayoutParams) w1Var8).bottomMargin, ((LinearLayout.LayoutParams) w1Var8).height);
                        if (((LinearLayout.LayoutParams) w1Var8).width == 0) {
                            i14 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i76 <= 0) {
                                    i76 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i76, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i14 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i76;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i14), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z27) {
                        x1Var.f9960f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) w1Var8).leftMargin + ((LinearLayout.LayoutParams) w1Var8).rightMargin + x1Var.f9960f;
                    } else {
                        int i77 = x1Var.f9960f;
                        x1Var.f9960f = Math.max(i77, childAt8.getMeasuredWidth() + i77 + ((LinearLayout.LayoutParams) w1Var8).leftMargin + ((LinearLayout.LayoutParams) w1Var8).rightMargin);
                    }
                    boolean z33 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) w1Var8).height == -1;
                    int i78 = ((LinearLayout.LayoutParams) w1Var8).topMargin + ((LinearLayout.LayoutParams) w1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i78;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z33) {
                        i78 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i69, i78);
                    if (z30) {
                        i13 = -1;
                        boolean z34 = ((LinearLayout.LayoutParams) w1Var8).height == -1;
                        if (!z31 && (baseline = childAt8.getBaseline()) != i13) {
                            int i79 = ((LinearLayout.LayoutParams) w1Var8).gravity;
                            if (i79 < 0) {
                                i79 = x1Var.f9959e;
                            }
                            int i80 = (((i79 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i80] = Math.max(iArr5[i80], baseline);
                            iArr6[i80] = Math.max(iArr6[i80], measuredHeight4 - baseline);
                        }
                        z30 = z34;
                        i69 = iMax12;
                    } else {
                        i13 = -1;
                    }
                    if (!z31) {
                    }
                    z30 = z34;
                    i69 = iMax12;
                }
                i75++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i11 = iResolveSizeAndState2;
            i12 = -16777216;
            x1Var.f9960f = x1Var.getPaddingRight() + x1Var.getPaddingLeft() + x1Var.f9960f;
            int i81 = iArr5[1];
            if (i81 != -1 || iArr5[0] != -1 || iArr5[2] != -1 || iArr5[3] != -1) {
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i81, iArr5[2]))));
            }
            iMax = i69;
        } else {
            iMax = Math.max(i69, i70);
            if (z32 && mode3 != 1073741824) {
                for (int i82 = 0; i82 < virtualChildCount2; i82++) {
                    View childAt9 = x1Var.getChildAt(i82);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((w1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i11 = iResolveSizeAndState2;
            i12 = -16777216;
        }
        if (!z30 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        x1Var.setMeasuredDimension(i11 | (iCombineMeasuredStates3 & i12), View.resolveSizeAndState(Math.max(x1Var.getPaddingBottom() + x1Var.getPaddingTop() + iMax11, x1Var.getSuggestedMinimumHeight()), i10, iCombineMeasuredStates3 << 16));
        if (z28) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(x1Var.getMeasuredHeight(), 1073741824);
            int i83 = 0;
            while (i83 < virtualChildCount2) {
                View childAt10 = x1Var.getChildAt(i83);
                if (childAt10.getVisibility() != 8) {
                    w1 w1Var9 = (w1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) w1Var9).height == -1) {
                        int i84 = ((LinearLayout.LayoutParams) w1Var9).width;
                        ((LinearLayout.LayoutParams) w1Var9).width = childAt10.getMeasuredWidth();
                        x1Var.measureChildWithMargins(childAt10, i55, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) w1Var9).width = i84;
                    }
                }
                i83++;
                x1Var = this;
                i55 = i7;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f9955a = z10;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f9956b = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        if (drawable != null) {
            this.f9965l = drawable.getIntrinsicWidth();
            this.f9966m = drawable.getIntrinsicHeight();
        } else {
            this.f9965l = 0;
            this.f9966m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.f9968o = i7;
    }

    public void setGravity(int i7) {
        if (this.f9959e != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f9959e = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i10 = i7 & 8388615;
        int i11 = this.f9959e;
        if ((8388615 & i11) != i10) {
            this.f9959e = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f9962h = z10;
    }

    public void setOrientation(int i7) {
        if (this.f9958d != i7) {
            this.f9958d = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.f9967n) {
            requestLayout();
        }
        this.f9967n = i7;
    }

    public void setVerticalGravity(int i7) {
        int i10 = i7 & 112;
        int i11 = this.f9959e;
        if ((i11 & 112) != i10) {
            this.f9959e = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f9961g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
