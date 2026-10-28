package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.baidu.carlifevehicle.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k implements o.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f9799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o.m f9800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f9801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o.x f9802e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o.a0 f9805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f9806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f9807j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9811o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9813q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g f9815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g f9816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i f9817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h f9818v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9803f = R.layout.abc_action_menu_layout;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9804g = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f9814r = new SparseBooleanArray();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l0.o0 f9819w = new l0.o0(7, this);

    public k(Context context) {
        this.f9798a = context;
        this.f9801d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(o.o oVar, View view, ViewGroup viewGroup) {
        View actionView = oVar.getActionView();
        if (actionView == null || oVar.e()) {
            o.z zVar = view instanceof o.z ? (o.z) view : (o.z) this.f9801d.inflate(this.f9804g, viewGroup, false);
            zVar.a(oVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) zVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f9805h);
            if (this.f9818v == null) {
                this.f9818v = new h(this);
            }
            actionMenuItemView.setPopupCallback(this.f9818v);
            actionView = (View) zVar;
        }
        actionView.setVisibility(oVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof m)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // o.y
    public final void b(o.m mVar, boolean z10) {
        f();
        g gVar = this.f9816t;
        if (gVar != null && gVar.b()) {
            gVar.f9246i.dismiss();
        }
        o.x xVar = this.f9802e;
        if (xVar != null) {
            xVar.b(mVar, z10);
        }
    }

    @Override // o.y
    public final void c(Context context, o.m mVar) {
        this.f9799b = context;
        LayoutInflater.from(context);
        this.f9800c = mVar;
        Resources resources = context.getResources();
        if (!this.f9809m) {
            this.f9808l = true;
        }
        int i7 = 2;
        this.f9810n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i7 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i7 = 4;
        } else if (i10 >= 360) {
            i7 = 3;
        }
        this.f9812p = i7;
        int measuredWidth = this.f9810n;
        if (this.f9808l) {
            if (this.f9806i == null) {
                j jVar = new j(this, this.f9798a);
                this.f9806i = jVar;
                if (this.k) {
                    jVar.setImageDrawable(this.f9807j);
                    this.f9807j = null;
                    this.k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f9806i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f9806i.getMeasuredWidth();
        } else {
            this.f9806i = null;
        }
        this.f9811o = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // o.y
    public final boolean d() {
        ArrayList arrayListL;
        int size;
        int i7;
        boolean z10;
        k kVar = this;
        o.m mVar = kVar.f9800c;
        if (mVar != null) {
            arrayListL = mVar.l();
            size = arrayListL.size();
        } else {
            arrayListL = null;
            size = 0;
        }
        int i10 = kVar.f9812p;
        int i11 = kVar.f9811o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) kVar.f9805h;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i7 = 2;
            z10 = true;
            if (i12 >= size) {
                break;
            }
            o.o oVar = (o.o) arrayListL.get(i12);
            int i15 = oVar.f9225y;
            if ((i15 & 2) == 2) {
                i13++;
            } else if ((i15 & 1) == 1) {
                i14++;
            } else {
                z11 = true;
            }
            if (kVar.f9813q && oVar.C) {
                i10 = 0;
            }
            i12++;
        }
        if (kVar.f9808l && (z11 || i14 + i13 > i10)) {
            i10--;
        }
        int i16 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = kVar.f9814r;
        sparseBooleanArray.clear();
        int i17 = 0;
        int i18 = 0;
        while (i17 < size) {
            o.o oVar2 = (o.o) arrayListL.get(i17);
            int i19 = oVar2.f9225y;
            boolean z12 = (i19 & 2) == i7;
            int i20 = oVar2.f9203b;
            if (z12) {
                View viewA = kVar.a(oVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i18 == 0) {
                    i18 = measuredWidth;
                }
                if (i20 != 0) {
                    sparseBooleanArray.put(i20, z10);
                }
                oVar2.f(z10);
            } else {
                if ((i19 & 1) == z10) {
                    boolean z13 = sparseBooleanArray.get(i20);
                    boolean z14 = (i16 > 0 || z13) && i11 > 0;
                    if (z14) {
                        View viewA2 = kVar.a(oVar2, null, viewGroup);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i11 -= measuredWidth2;
                        if (i18 == 0) {
                            i18 = measuredWidth2;
                        }
                        z14 &= i11 + i18 > 0;
                    }
                    if (z14 && i20 != 0) {
                        sparseBooleanArray.put(i20, true);
                    } else if (z13) {
                        sparseBooleanArray.put(i20, false);
                        for (int i21 = 0; i21 < i17; i21++) {
                            o.o oVar3 = (o.o) arrayListL.get(i21);
                            if (oVar3.f9203b == i20) {
                                if ((oVar3.f9224x & 32) == 32) {
                                    i16++;
                                }
                                oVar3.f(false);
                            }
                        }
                    }
                    if (z14) {
                        i16--;
                    }
                    oVar2.f(z14);
                } else {
                    oVar2.f(false);
                }
                i17++;
                i7 = 2;
                kVar = this;
                z10 = true;
            }
            i17++;
            i7 = 2;
            kVar = this;
            z10 = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.y
    public final boolean e(o.e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            o.e0 e0Var2 = e0Var;
            while (true) {
                o.m mVar = e0Var2.f9133z;
                if (mVar == this.f9800c) {
                    break;
                }
                e0Var2 = (o.e0) mVar;
            }
            o.o oVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.f9805h;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = viewGroup.getChildAt(i7);
                    if ((childAt instanceof o.z) && ((o.z) childAt).getItemData() == oVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f9181f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                g gVar = new g(this, this.f9799b, e0Var, view);
                this.f9816t = gVar;
                gVar.f9244g = z10;
                o.u uVar = gVar.f9246i;
                if (uVar != null) {
                    uVar.o(z10);
                }
                g gVar2 = this.f9816t;
                if (!gVar2.b()) {
                    if (gVar2.f9242e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    gVar2.d(0, 0, false, false);
                }
                o.x xVar = this.f9802e;
                if (xVar != null) {
                    xVar.J(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        Object obj;
        i iVar = this.f9817u;
        if (iVar != null && (obj = this.f9805h) != null) {
            ((View) obj).removeCallbacks(iVar);
            this.f9817u = null;
            return true;
        }
        g gVar = this.f9815s;
        if (gVar == null) {
            return false;
        }
        if (gVar.b()) {
            gVar.f9246i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.y
    public final void g() {
        int i7;
        ViewGroup viewGroup = (ViewGroup) this.f9805h;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            o.m mVar = this.f9800c;
            if (mVar != null) {
                mVar.i();
                ArrayList arrayListL = this.f9800c.l();
                int size = arrayListL.size();
                i7 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    o.o oVar = (o.o) arrayListL.get(i10);
                    if ((oVar.f9224x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i7);
                        o.o itemData = childAt instanceof o.z ? ((o.z) childAt).getItemData() : null;
                        View viewA = a(oVar, childAt, viewGroup);
                        if (oVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.f9805h).addView(viewA, i7);
                        }
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            while (i7 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i7) == this.f9806i) {
                    i7++;
                } else {
                    viewGroup.removeViewAt(i7);
                }
            }
        }
        ((View) this.f9805h).requestLayout();
        o.m mVar2 = this.f9800c;
        if (mVar2 != null) {
            mVar2.i();
            ArrayList arrayList2 = mVar2.f9184i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                o.p pVar = ((o.o) arrayList2.get(i11)).A;
            }
        }
        o.m mVar3 = this.f9800c;
        if (mVar3 != null) {
            mVar3.i();
            arrayList = mVar3.f9185j;
        }
        if (this.f9808l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((o.o) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f9806i == null) {
                this.f9806i = new j(this, this.f9798a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f9806i.getParent();
            if (viewGroup3 != this.f9805h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f9806i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f9805h;
                j jVar = this.f9806i;
                actionMenuView.getClass();
                m mVarI = ActionMenuView.i();
                mVarI.f9826a = true;
                actionMenuView.addView(jVar, mVarI);
            }
        } else {
            j jVar2 = this.f9806i;
            if (jVar2 != null) {
                Object parent = jVar2.getParent();
                Object obj = this.f9805h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f9806i);
                }
            }
        }
        ((ActionMenuView) this.f9805h).setOverflowReserved(this.f9808l);
    }

    public final boolean h() {
        g gVar = this.f9815s;
        return gVar != null && gVar.b();
    }

    @Override // o.y
    public final boolean i(o.o oVar) {
        return false;
    }

    @Override // o.y
    public final void j(o.x xVar) {
        throw null;
    }

    @Override // o.y
    public final boolean k(o.o oVar) {
        return false;
    }

    public final boolean l() {
        o.m mVar;
        if (!this.f9808l || h() || (mVar = this.f9800c) == null || this.f9805h == null || this.f9817u != null) {
            return false;
        }
        mVar.i();
        if (mVar.f9185j.isEmpty()) {
            return false;
        }
        i iVar = new i(this, new g(this, this.f9799b, this.f9800c, this.f9806i));
        this.f9817u = iVar;
        ((View) this.f9805h).post(iVar);
        return true;
    }
}
