package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import i.a;
import n3.u;
import o.b;
import o.c;
import o.m;
import o.o;
import o.z;
import p.c1;
import p.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends c1 implements z, View.OnClickListener, l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f610j;
    public o.l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f617r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f613n = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f6546c, 0, 0);
        this.f615p = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f617r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f616q = -1;
        setSaveEnabled(false);
    }

    @Override // o.z
    public final void a(o oVar) {
        this.f608h = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f9202a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.f611l == null) {
            this.f611l = new b(this);
        }
    }

    @Override // p.l
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.l
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f608h.getIcon() == null;
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i7 < 480) {
            return (i7 >= 640 && i10 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.z
    public o getItemData() {
        return this.f608h;
    }

    public final void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f609i);
        if (this.f610j != null && ((this.f608h.f9225y & 4) != 4 || (!this.f613n && !this.f614o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f609i : null);
        CharSequence charSequence = this.f608h.f9217q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z12 ? null : this.f608h.f9206e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f608h.f9218r;
        if (TextUtils.isEmpty(charSequence2)) {
            u.I(this, z12 ? null : this.f608h.f9206e);
        } else {
            u.I(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o.l lVar = this.k;
        if (lVar != null) {
            lVar.b(this.f608h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f613n = g();
        h();
    }

    @Override // p.c1, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i11 = this.f616q) >= 0) {
            super.setPadding(i11, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i10);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.f615p;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i12) : i12;
        if (mode != 1073741824 && i12 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i10);
        }
        if (!zIsEmpty || this.f610j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f610j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f608h.hasSubMenu() && (bVar = this.f611l) != null && bVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f614o != z10) {
            this.f614o = z10;
            o oVar = this.f608h;
            if (oVar != null) {
                m mVar = oVar.f9214n;
                mVar.k = true;
                mVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f610j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f617r;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(o.l lVar) {
        this.k = lVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f616q = i7;
        super.setPadding(i7, i10, i11, i12);
    }

    public void setPopupCallback(c cVar) {
        this.f612m = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f609i = charSequence;
        h();
    }
}
