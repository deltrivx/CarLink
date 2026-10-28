package p4;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.r0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l0.o0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends c.o implements u3.b, u3.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o0 f10208s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10210u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10211v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final androidx.lifecycle.v f10209t = new androidx.lifecycle.v(this, true);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10212w = true;

    public l() {
        final j.j jVar = (j.j) this;
        this.f10208s = new o0(11, new k(jVar));
        this.f1774d.f46b.H("android:support:lifecycle", new c.f(1, jVar));
        final int i7 = 0;
        f(new d4.a() { // from class: p4.j
            @Override // d4.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        jVar.f10208s.Y();
                        break;
                    default:
                        jVar.f10208s.Y();
                        break;
                }
            }
        });
        final int i10 = 1;
        this.k.add(new d4.a() { // from class: p4.j
            @Override // d4.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        jVar.f10208s.Y();
                        break;
                    default:
                        jVar.f10208s.Y();
                        break;
                }
            }
        });
        h(new c.g(jVar, 1));
    }

    public static boolean k(u uVar) {
        boolean zK = false;
        for (i iVar : uVar.f10230c.x()) {
            if (iVar != null) {
                k kVar = iVar.f10193s;
                if ((kVar == null ? null : kVar.f10207g) != null) {
                    zK |= k(iVar.h());
                }
                if (iVar.M.f1072c.compareTo(androidx.lifecycle.o.f1059d) >= 0) {
                    androidx.lifecycle.v vVar = iVar.M;
                    vVar.c("setCurrentState");
                    vVar.e(androidx.lifecycle.o.f1058c);
                    zK = true;
                }
            }
        }
        return zK;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f10210u);
        printWriter.print(" mResumed=");
        printWriter.print(this.f10211v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f10212w);
        if (getApplication() != null) {
            r0 r0VarB = b();
            i9.l.e(r0VarB, "store");
            u4.a aVar = u4.a.f13061b;
            i9.l.e(aVar, "defaultCreationExtras");
            da.a aVar2 = new da.a(r0VarB, w4.a.f14135c, aVar);
            o9.c cVarO = g5.a.O(w4.a.class);
            String strK = cVarO.k();
            if (strK == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            s.r0 r0Var = ((w4.a) aVar2.z("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK), cVarO)).f14136b;
            if (r0Var.f12491c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (r0Var.f12491c > 0) {
                    if (r0Var.f(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(r0Var.f12489a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((k) this.f10208s.f7772b).f10206f.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // c.o, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        this.f10208s.Y();
        super.onActivityResult(i7, i10, intent);
    }

    @Override // c.o, u3.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10209t.d(androidx.lifecycle.n.ON_CREATE);
        u uVar = ((k) this.f10208s.f7772b).f10206f;
        uVar.E = false;
        uVar.F = false;
        uVar.L.f10267g = false;
        uVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((k) this.f10208s.f7772b).f10206f.f10233f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((k) this.f10208s.f7772b).f10206f.f10233f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((k) this.f10208s.f7772b).f10206f.k();
        this.f10209t.d(androidx.lifecycle.n.ON_DESTROY);
    }

    @Override // c.o, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return ((k) this.f10208s.f7772b).f10206f.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f10211v = false;
        ((k) this.f10208s.f7772b).f10206f.t(5);
        this.f10209t.d(androidx.lifecycle.n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f10209t.d(androidx.lifecycle.n.ON_RESUME);
        u uVar = ((k) this.f10208s.f7772b).f10206f;
        uVar.E = false;
        uVar.F = false;
        uVar.L.f10267g = false;
        uVar.t(7);
    }

    @Override // c.o, android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f10208s.Y();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        o0 o0Var = this.f10208s;
        o0Var.Y();
        super.onResume();
        this.f10211v = true;
        ((k) o0Var.f7772b).f10206f.w(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        o0 o0Var = this.f10208s;
        o0Var.Y();
        k kVar = (k) o0Var.f7772b;
        super.onStart();
        this.f10212w = false;
        if (!this.f10210u) {
            this.f10210u = true;
            u uVar = kVar.f10206f;
            uVar.E = false;
            uVar.F = false;
            uVar.L.f10267g = false;
            uVar.t(4);
        }
        kVar.f10206f.w(true);
        this.f10209t.d(androidx.lifecycle.n.ON_START);
        u uVar2 = kVar.f10206f;
        uVar2.E = false;
        uVar2.F = false;
        uVar2.L.f10267g = false;
        uVar2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f10208s.Y();
    }

    @Override // android.app.Activity
    public void onStop() {
        o0 o0Var;
        super.onStop();
        this.f10212w = true;
        do {
            o0Var = this.f10208s;
        } while (k(((k) o0Var.f7772b).f10206f));
        u uVar = ((k) o0Var.f7772b).f10206f;
        uVar.F = true;
        uVar.L.f10267g = true;
        uVar.t(4);
        this.f10209t.d(androidx.lifecycle.n.ON_STOP);
    }
}
