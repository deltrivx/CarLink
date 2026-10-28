package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.baidu.carlifevehicle.R;
import e4.l0;
import i.a;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f703c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f703c = -1;
        int[] iArr = a.k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        l0.i(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f701a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f701a);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f702b != z10) {
            if (!z10 || this.f701a) {
                this.f702b = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int iMakeMeasureSpec;
        boolean z10;
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        int paddingBottom = 0;
        if (this.f701a) {
            if (size > this.f703c && this.f702b) {
                setStacked(false);
            }
            this.f703c = size;
        }
        if (this.f702b || View.MeasureSpec.getMode(i7) != 1073741824) {
            iMakeMeasureSpec = i7;
            z10 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i10);
        if (this.f701a && !this.f702b && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i7, i10);
        }
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            i11 = -1;
            if (i12 >= childCount) {
                i12 = -1;
                break;
            } else if (getChildAt(i12).getVisibility() == 0) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f702b) {
                int childCount2 = getChildCount();
                for (int i13 = i12 + 1; i13 < childCount2; i13++) {
                    if (getChildAt(i13).getVisibility() == 0) {
                        i11 = i13;
                        break;
                    }
                }
                paddingBottom = i11 >= 0 ? getChildAt(i11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = l0.f4369a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i10 == 0) {
                super.onMeasure(i7, i10);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f701a != z10) {
            this.f701a = z10;
            if (!z10 && this.f702b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
