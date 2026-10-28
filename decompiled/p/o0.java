package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.baidu.carlifevehicle.R;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends f2 implements q0 {
    public CharSequence C;
    public l0 D;
    public final Rect E;
    public int F;
    public final /* synthetic */ r0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r0 r0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.G = r0Var;
        this.E = new Rect();
        this.f9732o = r0Var;
        this.f9741x = true;
        this.f9742y.setFocusable(true);
        this.f9733p = new m0(this);
    }

    @Override // p.q0
    public final CharSequence e() {
        return this.C;
    }

    @Override // p.q0
    public final void i(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // p.q0
    public final void l(int i7) {
        this.F = i7;
    }

    @Override // p.q0
    public final void m(int i7, int i10) {
        ViewTreeObserver viewTreeObserver;
        b0 b0Var = this.f9742y;
        boolean zIsShowing = b0Var.isShowing();
        r();
        b0Var.setInputMethodMode(2);
        f();
        s1 s1Var = this.f9721c;
        s1Var.setChoiceMode(1);
        s1Var.setTextDirection(i7);
        s1Var.setTextAlignment(i10);
        r0 r0Var = this.G;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        s1 s1Var2 = this.f9721c;
        if (b0Var.isShowing() && s1Var2 != null) {
            s1Var2.setListSelectionHidden(false);
            s1Var2.setSelection(selectedItemPosition);
            if (s1Var2.getChoiceMode() != 0) {
                s1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = r0Var.getViewTreeObserver()) == null) {
            return;
        }
        o.d dVar = new o.d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        b0Var.setOnDismissListener(new n0(this, dVar));
    }

    @Override // p.f2, p.q0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.D = (l0) listAdapter;
    }

    public final void r() {
        int i7;
        r0 r0Var = this.G;
        Rect rect = r0Var.f9891h;
        b0 b0Var = this.f9742y;
        Drawable background = b0Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z10 = m3.f9836a;
            i7 = r0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i7 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = r0Var.getPaddingLeft();
        int paddingRight = r0Var.getPaddingRight();
        int width = r0Var.getWidth();
        int i10 = r0Var.f9890g;
        if (i10 == -2) {
            int iA = r0Var.a(this.D, b0Var.getBackground());
            int i11 = (r0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i11) {
                iA = i11;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i10);
        }
        boolean z11 = m3.f9836a;
        this.f9724f = r0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f9723e) - this.F) + i7 : paddingLeft + this.F + i7;
    }
}
