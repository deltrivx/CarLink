package p4;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.baidu.carlifevehicle.R;
import e4.l0;
import e4.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f10215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, u uVar) {
        super(context, attributeSet);
        i9.l.e(context, "context");
        i9.l.e(attributeSet, "attrs");
        this.f10213a = new ArrayList();
        this.f10214b = new ArrayList();
        this.f10216d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o4.a.f9457b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        i iVarY = uVar.y(id);
        if (classAttribute != null && iVarY == null) {
            if (id == -1) {
                throw new IllegalStateException(a2.f.G("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            r rVarA = uVar.A();
            context.getClassLoader();
            i iVarA = rVarA.a(classAttribute);
            i9.l.d(iVarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            iVarA.D = true;
            k kVar = iVarA.f10193s;
            if ((kVar == null ? null : kVar.f10203c) != null) {
                iVarA.D = true;
            }
            a aVar = new a(uVar);
            aVar.f10139o = true;
            iVarA.E = this;
            aVar.d(getId(), iVarA, string);
            if (aVar.f10132g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            u uVar2 = aVar.f10140p;
            if (uVar2.f10246t != null && !uVar2.G) {
                uVar2.v(true);
                aVar.f(uVar2.I, uVar2.J);
                uVar2.f10229b = true;
                try {
                    uVar2.M(uVar2.I, uVar2.J);
                    uVar2.d();
                    uVar2.X();
                    if (uVar2.H) {
                        uVar2.H = false;
                        uVar2.V();
                    }
                    ((HashMap) uVar2.f10230c.f3848c).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    uVar2.d();
                    throw th;
                }
            }
        }
        Iterator it = uVar.f10230c.u().iterator();
        while (it.hasNext()) {
            int i7 = ((z) it.next()).f10282c.f10197w;
            getId();
        }
    }

    public final void a(View view) {
        if (this.f10214b.contains(view)) {
            this.f10213a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        i9.l.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof i ? (i) tag : null) != null) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        s1 s1VarC;
        i9.l.e(windowInsets, "insets");
        s1 s1VarC2 = s1.c(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f10215c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            i9.l.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            s1VarC = s1.c(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = l0.f4369a;
            WindowInsets windowInsetsB = s1VarC2.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsB2 = e4.c0.b(this, windowInsetsB);
                if (!windowInsetsB2.equals(windowInsetsB)) {
                    s1VarC2 = s1.c(this, windowInsetsB2);
                }
            }
            s1VarC = s1VarC2;
        }
        if (!s1VarC.f4398a.o()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                l0.b(getChildAt(i7), s1VarC);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i9.l.e(canvas, "canvas");
        if (this.f10216d) {
            Iterator it = this.f10213a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        i9.l.e(canvas, "canvas");
        i9.l.e(view, "child");
        if (this.f10216d) {
            ArrayList arrayList = this.f10213a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j5);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        i9.l.e(view, "view");
        this.f10214b.remove(view);
        if (this.f10213a.remove(view)) {
            this.f10216d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends i> F getFragment() {
        l lVar;
        i iVar;
        u uVarH;
        View view = this;
        while (true) {
            lVar = null;
            if (view == null) {
                iVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            iVar = tag instanceof i ? (i) tag : null;
            if (iVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (iVar == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof l) {
                    lVar = (l) context;
                    break;
                }
            }
            if (lVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            uVarH = ((k) lVar.f10208s.f7772b).f10206f;
        } else {
            if (!iVar.isAdded()) {
                throw new IllegalStateException("The Fragment " + iVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            uVarH = iVar.h();
        }
        return (F) uVarH.y(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        i9.l.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                i9.l.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        i9.l.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        View childAt = getChildAt(i7);
        i9.l.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        i9.l.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i7, int i10) {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            i9.l.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i7, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i7, int i10) {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            i9.l.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i7, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f10216d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        i9.l.e(onApplyWindowInsetsListener, "listener");
        this.f10215c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        i9.l.e(view, "view");
        if (view.getParent() == this) {
            this.f10214b.add(view);
        }
        super.startViewTransition(view);
    }
}
