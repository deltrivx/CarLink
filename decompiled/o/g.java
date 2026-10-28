package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.baidu.carlifevehicle.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import l0.o0;
import p.h2;
import p.i2;
import p.k2;
import p.s1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g extends u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f9137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f9141f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f9144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f9145j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f9148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f9149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9151q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9154t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9156v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x f9157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ViewTreeObserver f9158x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PopupWindow.OnDismissListener f9159y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9160z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f9142g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f9143h = new ArrayList();
    public final o0 k = new o0(5, this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9146l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9147m = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9155u = false;

    public g(Context context, View view, int i7, boolean z10) {
        int i10 = 0;
        this.f9144i = new d(i10, this);
        this.f9145j = new e(i10, this);
        this.f9137b = context;
        this.f9148n = view;
        this.f9139d = i7;
        this.f9140e = z10;
        this.f9150p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f9138c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f9141f = new Handler();
    }

    @Override // o.c0
    public final boolean a() {
        ArrayList arrayList = this.f9143h;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f9134a.f9742y.isShowing();
    }

    @Override // o.y
    public final void b(m mVar, boolean z10) {
        ArrayList arrayList = this.f9143h;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (mVar == ((f) arrayList.get(i7)).f9135b) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            return;
        }
        int i10 = i7 + 1;
        if (i10 < arrayList.size()) {
            ((f) arrayList.get(i10)).f9135b.c(false);
        }
        f fVar = (f) arrayList.remove(i7);
        m mVar2 = fVar.f9135b;
        k2 k2Var = fVar.f9134a;
        p.b0 b0Var = k2Var.f9742y;
        mVar2.r(this);
        if (this.f9160z) {
            if (Build.VERSION.SDK_INT >= 23) {
                h2.b(b0Var, null);
            }
            b0Var.setAnimationStyle(0);
        }
        k2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f9150p = ((f) arrayList.get(size2 - 1)).f9136c;
        } else {
            this.f9150p = this.f9148n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((f) arrayList.get(0)).f9135b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.f9157w;
        if (xVar != null) {
            xVar.b(mVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f9158x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f9158x.removeGlobalOnLayoutListener(this.f9144i);
            }
            this.f9158x = null;
        }
        this.f9149o.removeOnAttachStateChangeListener(this.f9145j);
        this.f9159y.onDismiss();
    }

    @Override // o.y
    public final boolean d() {
        return false;
    }

    @Override // o.c0
    public final void dismiss() {
        ArrayList arrayList = this.f9143h;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                f fVar = fVarArr[i7];
                if (fVar.f9134a.f9742y.isShowing()) {
                    fVar.f9134a.dismiss();
                }
            }
        }
    }

    @Override // o.y
    public final boolean e(e0 e0Var) {
        for (f fVar : this.f9143h) {
            if (e0Var == fVar.f9135b) {
                fVar.f9134a.f9721c.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        l(e0Var);
        x xVar = this.f9157w;
        if (xVar != null) {
            xVar.J(e0Var);
        }
        return true;
    }

    @Override // o.c0
    public final void f() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f9142g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((m) it.next());
        }
        arrayList.clear();
        View view = this.f9148n;
        this.f9149o = view;
        if (view != null) {
            boolean z10 = this.f9158x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f9158x = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f9144i);
            }
            this.f9149o.addOnAttachStateChangeListener(this.f9145j);
        }
    }

    @Override // o.y
    public final void g() {
        Iterator it = this.f9143h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((f) it.next()).f9134a.f9721c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((j) adapter).notifyDataSetChanged();
        }
    }

    @Override // o.c0
    public final s1 h() {
        ArrayList arrayList = this.f9143h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f9134a.f9721c;
    }

    @Override // o.y
    public final void j(x xVar) {
        this.f9157w = xVar;
    }

    @Override // o.u
    public final void l(m mVar) {
        mVar.b(this, this.f9137b);
        if (a()) {
            u(mVar);
        } else {
            this.f9142g.add(mVar);
        }
    }

    @Override // o.u
    public final void n(View view) {
        if (this.f9148n != view) {
            this.f9148n = view;
            this.f9147m = Gravity.getAbsoluteGravity(this.f9146l, view.getLayoutDirection());
        }
    }

    @Override // o.u
    public final void o(boolean z10) {
        this.f9155u = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f9143h;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i7);
            if (!fVar.f9134a.f9742y.isShowing()) {
                break;
            } else {
                i7++;
            }
        }
        if (fVar != null) {
            fVar.f9135b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // o.u
    public final void p(int i7) {
        if (this.f9146l != i7) {
            this.f9146l = i7;
            this.f9147m = Gravity.getAbsoluteGravity(i7, this.f9148n.getLayoutDirection());
        }
    }

    @Override // o.u
    public final void q(int i7) {
        this.f9151q = true;
        this.f9153s = i7;
    }

    @Override // o.u
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f9159y = onDismissListener;
    }

    @Override // o.u
    public final void s(boolean z10) {
        this.f9156v = z10;
    }

    @Override // o.u
    public final void t(int i7) {
        this.f9152r = true;
        this.f9154t = i7;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0167  */
    /* JADX WARN: Code duplicated, block: B:72:0x016a  */
    public final void u(m mVar) {
        boolean z10;
        char c10;
        View childAt;
        f fVar;
        int i7;
        int i10;
        int i11;
        int width;
        MenuItem item;
        j jVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f9137b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        j jVar2 = new j(mVar, layoutInflaterFrom, this.f9140e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.f9155u) {
            jVar2.f9171c = true;
        } else if (a()) {
            int size = mVar.f9181f.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item2 = mVar.getItem(i12);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i12++;
            }
            jVar2.f9171c = z10;
        }
        int iM = u.m(jVar2, context, this.f9138c);
        k2 k2Var = new k2(context, null, this.f9139d);
        k2Var.C = this.k;
        k2Var.f9733p = this;
        p.b0 b0Var = k2Var.f9742y;
        b0Var.setOnDismissListener(this);
        k2Var.f9732o = this.f9148n;
        k2Var.f9729l = this.f9147m;
        k2Var.f9741x = true;
        b0Var.setFocusable(true);
        b0Var.setInputMethodMode(2);
        k2Var.o(jVar2);
        k2Var.q(iM);
        k2Var.f9729l = this.f9147m;
        ArrayList arrayList = this.f9143h;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            m mVar2 = fVar.f9135b;
            int size2 = mVar2.f9181f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size2) {
                    item = null;
                    break;
                }
                item = mVar2.getItem(i13);
                if (item.hasSubMenu() && mVar == item.getSubMenu()) {
                    break;
                } else {
                    i13++;
                }
            }
            if (item == null) {
                childAt = null;
                c10 = 0;
            } else {
                s1 s1Var = fVar.f9134a.f9721c;
                ListAdapter adapter = s1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    jVar = (j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    jVar = (j) adapter;
                    headersCount = 0;
                }
                int count = jVar.getCount();
                int i14 = 0;
                c10 = 0;
                while (true) {
                    if (i14 >= count) {
                        i14 = -1;
                        break;
                    } else if (item == jVar.getItem(i14)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                childAt = (i14 != -1 && (firstVisiblePosition = (i14 + headersCount) - s1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < s1Var.getChildCount()) ? s1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c10 = 0;
            childAt = null;
            fVar = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = k2.D;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c10] = Boolean.FALSE;
                        method.invoke(b0Var, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                i2.a(b0Var, false);
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 23) {
                h2.a(b0Var, null);
            }
            s1 s1Var2 = ((f) arrayList.get(arrayList.size() - 1)).f9134a.f9721c;
            int[] iArr = new int[2];
            s1Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f9149o.getWindowVisibleDisplayFrame(rect);
            if (this.f9150p == 1) {
                if (s1Var2.getWidth() + iArr[0] + iM > rect.right) {
                    i7 = 0;
                } else {
                    i7 = 1;
                }
            } else if (iArr[0] - iM < 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            boolean z11 = i7 == 1;
            this.f9150p = i7;
            if (i15 >= 26) {
                k2Var.f9732o = childAt;
                i10 = 0;
                i11 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.f9148n.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f9147m & 7) == 5) {
                    iArr2[0] = this.f9148n.getWidth() + iArr2[0];
                    iArr3[0] = childAt.getWidth() + iArr3[0];
                }
                int i16 = iArr3[0] - iArr2[0];
                i10 = iArr3[1] - iArr2[1];
                i11 = i16;
            }
            if ((this.f9147m & 5) != 5) {
                width = z11 ? i11 + childAt.getWidth() : i11 - iM;
            } else if (z11) {
                width = i11 + iM;
            } else {
                iM = childAt.getWidth();
            }
            k2Var.f9724f = width;
            k2Var.k = true;
            k2Var.f9728j = true;
            k2Var.k(i10);
        } else {
            if (this.f9151q) {
                k2Var.f9724f = this.f9153s;
            }
            if (this.f9152r) {
                k2Var.k(this.f9154t);
            }
            Rect rect2 = this.f9236a;
            k2Var.f9740w = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new f(k2Var, mVar, this.f9150p));
        k2Var.f();
        s1 s1Var3 = k2Var.f9721c;
        s1Var3.setOnKeyListener(this);
        if (fVar == null && this.f9156v && mVar.f9187m != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) s1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(mVar.f9187m);
            s1Var3.addHeaderView(frameLayout, null, false);
            k2Var.f();
        }
    }
}
