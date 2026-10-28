package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.baidu.carlifevehicle.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class s1 extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f9897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q1 f9903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9906j;
    public i4.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.tencent.bugly.proguard.c0 f9907l;

    public s1(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f9897a = new Rect();
        this.f9898b = 0;
        this.f9899c = 0;
        this.f9900d = 0;
        this.f9901e = 0;
        this.f9905i = z10;
        setCacheColorHint(0);
    }

    public final int a(int i7, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i11 = 0;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i7, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return i10;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0160  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Code duplicated, block: B:88:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x017b  */
    /* JADX WARN: Code duplicated, block: B:92:0x017f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0183  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public final boolean b(MotionEvent motionEvent, int i7) {
        boolean z10;
        boolean zA;
        View childAt;
        View childAt2;
        i4.e eVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z11) {
                this.f9906j = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f9902f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                if (this.k == null) {
                    this.k = new i4.e(this);
                }
                i4.e eVar2 = this.k;
                boolean z12 = eVar2.f6641p;
                eVar2.f6641p = true;
                eVar2.onTouch(this, motionEvent);
            } else {
                eVar = this.k;
                if (eVar != null) {
                    if (eVar.f6641p) {
                        eVar.d();
                    }
                    eVar.f6641p = false;
                }
            }
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i7);
        if (iFindPointerIndex < 0) {
            z10 = false;
        } else {
            int x8 = (int) motionEvent.getX(iFindPointerIndex);
            int y5 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x8, y5);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f10 = x8;
                float f11 = y5;
                this.f9906j = true;
                int i10 = Build.VERSION.SDK_INT;
                n1.a(this, f10, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i11 = this.f9902f;
                if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f9902f = iPointToPosition;
                n1.a(childAt3, f10 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f9897a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f9898b;
                rect.top -= this.f9899c;
                rect.right += this.f9900d;
                rect.bottom += this.f9901e;
                if (i10 >= 33) {
                    zA = p1.a(this);
                } else {
                    Field field = r1.f9892a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e7) {
                            e7.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z14 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        p1.b(this, z14);
                    } else {
                        Field field2 = r1.f9892a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f10, f11);
                }
                q1 q1Var = this.f9903g;
                if (q1Var != null) {
                    q1Var.f9878b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            this.f9906j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f9902f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f9906j = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f9902f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.k == null) {
                this.k = new i4.e(this);
            }
            i4.e eVar3 = this.k;
            boolean z15 = eVar3.f6641p;
            eVar3.f6641p = true;
            eVar3.onTouch(this, motionEvent);
        } else {
            eVar = this.k;
            if (eVar != null) {
                if (eVar.f6641p) {
                    eVar.d();
                }
                eVar.f6641p = false;
            }
        }
        return z10;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f9897a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f9907l != null) {
            return;
        }
        super.drawableStateChanged();
        q1 q1Var = this.f9903g;
        if (q1Var != null) {
            q1Var.f9878b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f9906j && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f9905i || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f9905i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f9905i || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f9905i && this.f9904h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f9907l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 4;
        if (actionMasked == 10 && this.f9907l == null) {
            com.tencent.bugly.proguard.c0 c0Var = new com.tencent.bugly.proguard.c0(i10, this);
            this.f9907l = c0Var;
            post(c0Var);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i7 < 30 || !o1.f9858d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        o1.f9855a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        o1.f9856b.invoke(this, Integer.valueOf(iPointToPosition));
                        o1.f9857c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f9906j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9902f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        com.tencent.bugly.proguard.c0 c0Var = this.f9907l;
        if (c0Var != null) {
            s1 s1Var = (s1) c0Var.f3400b;
            s1Var.f9907l = null;
            s1Var.removeCallbacks(c0Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f9904h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        q1 q1Var = null;
        if (drawable != null) {
            q1 q1Var2 = new q1();
            Drawable drawable2 = q1Var2.f9877a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            q1Var2.f9877a = drawable;
            drawable.setCallback(q1Var2);
            q1Var2.f9878b = true;
            q1Var = q1Var2;
        }
        this.f9903g = q1Var;
        super.setSelector(q1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9898b = rect.left;
        this.f9899c = rect.top;
        this.f9900d = rect.right;
        this.f9901e = rect.bottom;
    }
}
