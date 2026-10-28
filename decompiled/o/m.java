package o;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import e4.m0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class m implements Menu {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f9175y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f9177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k f9180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f9182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f9184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f9185j;
    public boolean k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f9187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f9188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f9189o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o f9196v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9198x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9186l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9190p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9191q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9192r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9193s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f9194t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f9195u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9197w = false;

    public m(Context context) {
        boolean zL;
        boolean z10 = false;
        this.f9176a = context;
        Resources resources = context.getResources();
        this.f9177b = resources;
        this.f9181f = new ArrayList();
        this.f9182g = new ArrayList();
        this.f9183h = true;
        this.f9184i = new ArrayList();
        this.f9185j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = m0.f4377a;
            if (Build.VERSION.SDK_INT >= 28) {
                zL = a4.b.l(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zL = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zL) {
                z10 = true;
            }
        }
        this.f9179d = z10;
    }

    public final o a(int i7, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (f9175y[i13] << 16) | (65535 & i11);
        o oVar = new o(this, i7, i10, i11, i14, charSequence, this.f9186l);
        ArrayList arrayList = this.f9181f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((o) arrayList.get(size)).f9205d <= i14) {
                i12 = size + 1;
                arrayList.add(i12, oVar);
                p(true);
                return oVar;
            }
        }
        i12 = 0;
        arrayList.add(i12, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return a(0, 0, 0, this.f9177b.getString(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return a(i7, i10, i11, this.f9177b.getString(i12));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return a(i7, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f9176a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o oVarA = a(i7, i10, i11, resolveInfo.loadLabel(packageManager));
            oVarA.setIcon(resolveInfo.loadIcon(packageManager));
            oVarA.f9208g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = oVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f9177b.getString(i7));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return addSubMenu(i7, i10, i11, this.f9177b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        o oVarA = a(i7, i10, i11, charSequence);
        e0 e0Var = new e0(this.f9176a, this, oVarA);
        oVarA.f9215o = e0Var;
        e0Var.setHeaderTitle(oVarA.f9206e);
        return e0Var;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f9195u.add(new WeakReference(yVar));
        yVar.c(context, this);
        this.k = true;
    }

    public final void c(boolean z10) {
        if (this.f9193s) {
            return;
        }
        this.f9193s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9195u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.b(this, z10);
            }
        }
        this.f9193s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f9196v;
        if (oVar != null) {
            d(oVar);
        }
        this.f9181f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f9188n = null;
        this.f9187m = null;
        this.f9189o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9195u;
        boolean zK = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f9196v == oVar) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar != null) {
                    zK = yVar.k(oVar);
                    if (zK) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zK) {
                this.f9196v = null;
            }
        }
        return zK;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f9180e;
        return kVar != null && kVar.q(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9195u;
        boolean zI = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar != null) {
                zI = yVar.i(oVar);
                if (zI) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zI) {
            this.f9196v = oVar;
        }
        return zI;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f9181f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            if (oVar.f9202a == i7) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (menuItemFindItem = oVar.f9215o.findItem(i7)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final o g(int i7, KeyEvent keyEvent) {
        ArrayList arrayList = this.f9194t;
        arrayList.clear();
        h(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean zN = n();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            char c10 = zN ? oVar.f9211j : oVar.f9209h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i7 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return (MenuItem) this.f9181f.get(i7);
    }

    public final void h(List list, int i7, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            ArrayList arrayList = this.f9181f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList.get(i10);
                if (oVar.hasSubMenu()) {
                    oVar.f9215o.h(list, i7, keyEvent);
                }
                char c10 = zN ? oVar.f9211j : oVar.f9209h;
                if ((modifiers & 69647) == ((zN ? oVar.k : oVar.f9210i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zN && c10 == '\b' && i7 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f9198x) {
            return true;
        }
        ArrayList arrayList = this.f9181f;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((o) arrayList.get(i7)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9195u;
            boolean zD = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= yVar.d();
                }
            }
            ArrayList arrayList = this.f9184i;
            ArrayList arrayList2 = this.f9185j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i7 = 0; i7 < size; i7++) {
                    o oVar = (o) arrayListL.get(i7);
                    if ((oVar.f9224x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return g(i7, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public m k() {
        return this;
    }

    public final ArrayList l() {
        boolean z10 = this.f9183h;
        ArrayList arrayList = this.f9182g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f9181f;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            o oVar = (o) arrayList2.get(i7);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f9183h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f9197w;
    }

    public boolean n() {
        return this.f9178c;
    }

    public boolean o() {
        return this.f9179d;
    }

    public final void p(boolean z10) {
        if (this.f9190p) {
            this.f9191q = true;
            if (z10) {
                this.f9192r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f9183h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9195u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.g();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return q(findItem(i7), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        o oVarG = g(i7, keyEvent);
        boolean zQ = oVarG != null ? q(oVarG, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, y yVar, int i7) {
        p pVar;
        boolean zExpandActionView;
        p pVar2;
        boolean z10;
        e0 e0Var;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        y yVar2;
        o oVar = (o) menuItem;
        boolean zE = false;
        if (oVar == null || !oVar.isEnabled()) {
            return false;
        }
        m mVar = oVar.f9214n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = oVar.f9216p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(oVar)) && !mVar.e(mVar, oVar)) {
            Intent intent = oVar.f9208g;
            if (intent != null) {
                try {
                    mVar.f9176a.startActivity(intent);
                } catch (ActivityNotFoundException e7) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
                    pVar = oVar.A;
                    if (pVar == null) {
                    }
                    zExpandActionView = false;
                    pVar2 = oVar.A;
                    if (pVar2 == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (oVar.e()) {
                        zExpandActionView |= oVar.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (oVar.hasSubMenu()) {
                        if ((i7 & 4) == 0) {
                            c(false);
                        }
                        if (!oVar.hasSubMenu()) {
                            e0 e0Var2 = new e0(this.f9176a, this, oVar);
                            oVar.f9215o = e0Var2;
                            e0Var2.setHeaderTitle(oVar.f9206e);
                        }
                        e0Var = oVar.f9215o;
                        if (z10) {
                            pVar2.f9228b.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.f9195u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (yVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zE) {
                                    zE = yVar2.e(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zE;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i7 & 4) == 0) {
                            c(false);
                        }
                        if (!oVar.hasSubMenu()) {
                            e0 e0Var3 = new e0(this.f9176a, this, oVar);
                            oVar.f9215o = e0Var3;
                            e0Var3.setHeaderTitle(oVar.f9206e);
                        }
                        e0Var = oVar.f9215o;
                        if (z10) {
                            pVar2.f9228b.onPrepareSubMenu(e0Var);
                        }
                        copyOnWriteArrayList = this.f9195u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zE = yVar != null ? yVar.e(e0Var) : false;
                            while (r8.hasNext()) {
                                yVar2 = (y) weakReference.get();
                                if (yVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zE) {
                                    zE = yVar2.e(e0Var);
                                }
                            }
                        }
                        zExpandActionView |= zE;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                pVar = oVar.A;
                if (pVar == null && pVar.f9228b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        pVar2 = oVar.A;
        if (pVar2 == null && pVar2.f9228b.hasSubMenu()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (oVar.e()) {
            zExpandActionView |= oVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (oVar.hasSubMenu() || z10) {
            if ((i7 & 4) == 0) {
                c(false);
            }
            if (!oVar.hasSubMenu()) {
                e0 e0Var4 = new e0(this.f9176a, this, oVar);
                oVar.f9215o = e0Var4;
                e0Var4.setHeaderTitle(oVar.f9206e);
            }
            e0Var = oVar.f9215o;
            if (z10) {
                pVar2.f9228b.onPrepareSubMenu(e0Var);
            }
            copyOnWriteArrayList = this.f9195u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (yVar != null) {
                }
                while (r8.hasNext()) {
                    yVar2 = (y) weakReference.get();
                    if (yVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zE) {
                        zE = yVar2.e(e0Var);
                    }
                }
            }
            zExpandActionView |= zE;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i7 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f9195u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        ArrayList arrayList = this.f9181f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((o) arrayList.get(i11)).f9203b == i7) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((o) arrayList.get(i11)).f9203b != i7) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        ArrayList arrayList = this.f9181f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((o) arrayList.get(i10)).f9202a == i7) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i10);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f9181f.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (menuItemFindItem = findItem(i10)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z10, boolean z11) {
        ArrayList arrayList = this.f9181f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            if (oVar.f9203b == i7) {
                oVar.f9224x = (oVar.f9224x & (-5)) | (z11 ? 4 : 0);
                oVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f9197w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z10) {
        ArrayList arrayList = this.f9181f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            if (oVar.f9203b == i7) {
                oVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z10) {
        ArrayList arrayList = this.f9181f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            if (oVar.f9203b == i7) {
                int i11 = oVar.f9224x;
                int i12 = (i11 & (-9)) | (z10 ? 0 : 8);
                oVar.f9224x = i12;
                if (i11 != i12) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f9178c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f9181f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f9181f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i7, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f9189o = view;
            this.f9187m = null;
            this.f9188n = null;
        } else {
            if (i7 > 0) {
                this.f9187m = this.f9177b.getText(i7);
            } else if (charSequence != null) {
                this.f9187m = charSequence;
            }
            if (i10 > 0) {
                this.f9188n = this.f9176a.getDrawable(i10);
            } else if (drawable != null) {
                this.f9188n = drawable;
            }
            this.f9189o = null;
        }
        p(false);
    }

    public final void v() {
        this.f9190p = false;
        if (this.f9191q) {
            this.f9191q = false;
            p(this.f9192r);
        }
    }

    public final void w() {
        if (this.f9190p) {
            return;
        }
        this.f9190p = true;
        this.f9191q = false;
        this.f9192r = false;
    }
}
