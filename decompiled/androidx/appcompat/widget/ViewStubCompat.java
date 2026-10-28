package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import i.a;
import java.lang.ref.WeakReference;
import p.k3;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f743d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f740a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f6568z, 0, 0);
        this.f741b = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f740a = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f740a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f743d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f740a, viewGroup, false);
        int i7 = this.f741b;
        if (i7 != -1) {
            viewInflate.setId(i7);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f742c = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f741b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f743d;
    }

    public int getLayoutResource() {
        return this.f740a;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.f741b = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f743d = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.f740a = i7;
    }

    public void setOnInflateListener(k3 k3Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        WeakReference weakReference = this.f742c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i7);
            return;
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            a();
        }
    }
}
