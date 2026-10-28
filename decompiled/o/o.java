package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.ArrayList;
import l0.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o implements z3.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f9206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f9207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f9208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f9209h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f9211j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f9212l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f9214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e0 f9215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f9216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f9217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f9218r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9225y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f9226z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9210i = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
    public int k = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9213m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f9219s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f9220t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9221u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9222v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9223w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9224x = 16;
    public boolean C = false;

    public o(m mVar, int i7, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f9214n = mVar;
        this.f9202a = i10;
        this.f9203b = i7;
        this.f9204c = i11;
        this.f9205d = i12;
        this.f9206e = charSequence;
        this.f9225y = i13;
    }

    public static void c(StringBuilder sb2, int i7, int i10, String str) {
        if ((i7 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // z3.a
    public final p a() {
        return this.A;
    }

    @Override // z3.a
    public final z3.a b(p pVar) {
        this.f9226z = null;
        this.A = pVar;
        this.f9214n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f9227a = new o0(6, this);
            pVar2.f9228b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f9225y & 8) == 0) {
            return false;
        }
        if (this.f9226z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f9214n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f9223w && (this.f9221u || this.f9222v)) {
            drawable = n3.r.f0(drawable).mutate();
            if (this.f9221u) {
                drawable.setTintList(this.f9219s);
            }
            if (this.f9222v) {
                drawable.setTintMode(this.f9220t);
            }
            this.f9223w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f9225y & 8) != 0) {
            if (this.f9226z == null && (pVar = this.A) != null) {
                this.f9226z = pVar.f9228b.onCreateActionView(this);
            }
            if (this.f9226z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f9214n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f9224x |= 32;
        } else {
            this.f9224x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f9226z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar == null) {
            return null;
        }
        View viewOnCreateActionView = pVar.f9228b.onCreateActionView(this);
        this.f9226z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // z3.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f9211j;
    }

    @Override // z3.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9217q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f9203b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f9212l;
        if (drawable != null) {
            return d(drawable);
        }
        int i7 = this.f9213m;
        if (i7 == 0) {
            return null;
        }
        Drawable drawableZ = o9.e0.z(this.f9214n.f9176a, i7);
        this.f9213m = 0;
        this.f9212l = drawableZ;
        return d(drawableZ);
    }

    @Override // z3.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9219s;
    }

    @Override // z3.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9220t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9208g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f9202a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // z3.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9210i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9209h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f9204c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f9215o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9206e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9207f;
        return charSequence != null ? charSequence : this.f9206e;
    }

    @Override // z3.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9218r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f9215o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f9224x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9224x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9224x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        if (pVar == null || !pVar.f9228b.overridesItemVisibility()) {
            return (this.f9224x & 8) == 0;
        }
        return (this.f9224x & 8) == 0 && this.A.f9228b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i7) {
        int i10;
        m mVar = this.f9214n;
        Context context = mVar.f9176a;
        View viewInflate = LayoutInflater.from(context).inflate(i7, (ViewGroup) new LinearLayout(context), false);
        this.f9226z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i10 = this.f9202a) > 0) {
            viewInflate.setId(i10);
        }
        mVar.k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i7;
        this.f9226z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i7 = this.f9202a) > 0) {
            view.setId(i7);
        }
        m mVar = this.f9214n;
        mVar.k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f9211j == c10) {
            return this;
        }
        this.f9211j = Character.toLowerCase(c10);
        this.f9214n.p(false);
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i7) {
        if (this.f9211j == c10 && this.k == i7) {
            return this;
        }
        this.f9211j = Character.toLowerCase(c10);
        this.k = KeyEvent.normalizeMetaState(i7);
        this.f9214n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i7 = this.f9224x;
        int i10 = (z10 ? 1 : 0) | (i7 & (-2));
        this.f9224x = i10;
        if (i7 != i10) {
            this.f9214n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i7 = this.f9224x;
        int i10 = i7 & 4;
        m mVar = this.f9214n;
        if (i10 == 0) {
            int i11 = (i7 & (-3)) | (z10 ? 2 : 0);
            this.f9224x = i11;
            if (i7 != i11) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f9181f;
        int size = arrayList.size();
        mVar.w();
        for (int i12 = 0; i12 < size; i12++) {
            o oVar = (o) arrayList.get(i12);
            if (oVar.f9203b == this.f9203b && (oVar.f9224x & 4) != 0 && oVar.isCheckable()) {
                boolean z11 = oVar == this;
                int i13 = oVar.f9224x;
                int i14 = (z11 ? 2 : 0) | (i13 & (-3));
                oVar.f9224x = i14;
                if (i13 != i14) {
                    oVar.f9214n.p(false);
                }
            }
        }
        mVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final z3.a setContentDescription(CharSequence charSequence) {
        this.f9217q = charSequence;
        this.f9214n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f9224x |= 16;
        } else {
            this.f9224x &= -17;
        }
        this.f9214n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i7) {
        this.f9212l = null;
        this.f9213m = i7;
        this.f9223w = true;
        this.f9214n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9213m = 0;
        this.f9212l = drawable;
        this.f9223w = true;
        this.f9214n.p(false);
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9219s = colorStateList;
        this.f9221u = true;
        this.f9223w = true;
        this.f9214n.p(false);
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9220t = mode;
        this.f9222v = true;
        this.f9223w = true;
        this.f9214n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9208g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f9209h == c10) {
            return this;
        }
        this.f9209h = c10;
        this.f9214n.p(false);
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i7) {
        if (this.f9209h == c10 && this.f9210i == i7) {
            return this;
        }
        this.f9209h = c10;
        this.f9210i = KeyEvent.normalizeMetaState(i7);
        this.f9214n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9216p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f9209h = c10;
        this.f9211j = Character.toLowerCase(c11);
        this.f9214n.p(false);
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i7, int i10) {
        this.f9209h = c10;
        this.f9210i = KeyEvent.normalizeMetaState(i7);
        this.f9211j = Character.toLowerCase(c11);
        this.k = KeyEvent.normalizeMetaState(i10);
        this.f9214n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i7) {
        int i10 = i7 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f9225y = i7;
        m mVar = this.f9214n;
        mVar.k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i7) {
        setTitle(this.f9214n.f9176a.getString(i7));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9206e = charSequence;
        this.f9214n.p(false);
        e0 e0Var = this.f9215o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9207f = charSequence;
        this.f9214n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // z3.a, android.view.MenuItem
    public final z3.a setTooltipText(CharSequence charSequence) {
        this.f9218r = charSequence;
        this.f9214n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i7 = this.f9224x;
        int i10 = (z10 ? 0 : 8) | (i7 & (-9));
        this.f9224x = i10;
        if (i7 != i10) {
            m mVar = this.f9214n;
            mVar.f9183h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f9206e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
