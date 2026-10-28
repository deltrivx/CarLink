package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import s.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends e6.f implements Menu {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f9110c;

    public b0(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f9110c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7) {
        return i(this.f9110c.add(i7));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, int i12) {
        return i(this.f9110c.add(i7, i10, i11, i12));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i7, int i10, int i11, CharSequence charSequence) {
        return i(this.f9110c.a(i7, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return i(this.f9110c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i7, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f9110c.addIntentOptions(i7, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = i(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7) {
        return this.f9110c.addSubMenu(i7);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, int i12) {
        return this.f9110c.addSubMenu(i7, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i7, int i10, int i11, CharSequence charSequence) {
        return this.f9110c.addSubMenu(i7, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f9110c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        q0 q0Var = (q0) this.f4440b;
        if (q0Var != null) {
            q0Var.clear();
        }
        this.f9110c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f9110c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i7) {
        return i(this.f9110c.findItem(i7));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i7) {
        return i(this.f9110c.getItem(i7));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f9110c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f9110c.isShortcutKey(i7, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i7, int i10) {
        return this.f9110c.performIdentifierAction(i7, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i7, KeyEvent keyEvent, int i10) {
        return this.f9110c.performShortcut(i7, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i7) {
        if (((q0) this.f4440b) != null) {
            int i10 = 0;
            while (true) {
                q0 q0Var = (q0) this.f4440b;
                if (i10 >= q0Var.f12485c) {
                    break;
                }
                if (((z3.a) q0Var.e(i10)).getGroupId() == i7) {
                    ((q0) this.f4440b).f(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f9110c.removeGroup(i7);
    }

    @Override // android.view.Menu
    public final void removeItem(int i7) {
        if (((q0) this.f4440b) != null) {
            int i10 = 0;
            while (true) {
                q0 q0Var = (q0) this.f4440b;
                if (i10 >= q0Var.f12485c) {
                    break;
                }
                if (((z3.a) q0Var.e(i10)).getItemId() == i7) {
                    ((q0) this.f4440b).f(i10);
                    break;
                }
                i10++;
            }
        }
        this.f9110c.removeItem(i7);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i7, boolean z10, boolean z11) {
        this.f9110c.setGroupCheckable(i7, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i7, boolean z10) {
        this.f9110c.setGroupEnabled(i7, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i7, boolean z10) {
        this.f9110c.setGroupVisible(i7, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f9110c.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f9110c.size();
    }
}
