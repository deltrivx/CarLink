package c;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import com.baidu.carlifevehicle.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends u3.h implements s0, androidx.lifecycle.j, a5.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f1771r = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e.a f1772b = new e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.b f1773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a5.f f1774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r0 f1775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f1776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t8.o f1777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f1778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f1779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f1780j;
    public final CopyOnWriteArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList f1781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArrayList f1782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t8.o f1786q;

    public o() {
        p4.l lVar = (p4.l) this;
        int i7 = 0;
        this.f1773c = new a2.b((Runnable) new d(lVar, i7));
        c5.a aVar = new c5.a(this, new a5.e(i7, this));
        a5.f fVar = new a5.f(aVar);
        this.f1774d = fVar;
        this.f1776f = new j(lVar);
        this.f1777g = t8.a.d(new m(lVar, 2));
        new AtomicInteger();
        this.f1778h = new l(lVar);
        this.f1779i = new CopyOnWriteArrayList();
        this.f1780j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.f1781l = new CopyOnWriteArrayList();
        this.f1782m = new CopyOnWriteArrayList();
        this.f1783n = new CopyOnWriteArrayList();
        androidx.lifecycle.v vVar = this.f13057a;
        if (vVar == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        vVar.a(new e(0, lVar));
        this.f13057a.a(new e(1, lVar));
        this.f13057a.a(new a5.b(3, lVar));
        aVar.a();
        androidx.lifecycle.i0.d(this);
        if (Build.VERSION.SDK_INT <= 23) {
            this.f13057a.a(new d0(lVar));
        }
        fVar.f46b.H("android:support:activity-result", new f(0, lVar));
        int i10 = 0;
        h(new g(lVar, i10));
        t8.a.d(new m(lVar, i10));
        this.f1786q = t8.a.d(new m(lVar, 3));
    }

    @Override // androidx.lifecycle.j
    public final u4.c a() {
        u4.c cVar = new u4.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f13062a;
        if (application != null) {
            Application application2 = getApplication();
            i9.l.d(application2, "application");
            linkedHashMap.put(p0.f1064h, application2);
        }
        linkedHashMap.put(androidx.lifecycle.i0.f1037a, this);
        linkedHashMap.put(androidx.lifecycle.i0.f1038b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(androidx.lifecycle.i0.f1039c, extras);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.s0
    public final r0 b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f1775e == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f1775e = iVar.f1729a;
            }
            if (this.f1775e == null) {
                this.f1775e = new r0();
            }
        }
        r0 r0Var = this.f1775e;
        i9.l.b(r0Var);
        return r0Var;
    }

    @Override // a5.g
    public final android.support.v4.media.session.r d() {
        return this.f1774d.f46b;
    }

    public final void f(d4.a aVar) {
        i9.l.e(aVar, "listener");
        this.f1779i.add(aVar);
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v g() {
        return this.f13057a;
    }

    public final void h(e.b bVar) {
        e.a aVar = this.f1772b;
        aVar.getClass();
        o oVar = aVar.f3909b;
        if (oVar != null) {
            bVar.a(oVar);
        }
        aVar.f3908a.add(bVar);
    }

    public final l0 i() {
        return (l0) this.f1786q.getValue();
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        i9.l.d(decorView, "window.decorView");
        androidx.lifecycle.i0.h(decorView, this);
        View decorView2 = getWindow().getDecorView();
        i9.l.d(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        i9.l.d(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        i9.l.d(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        i9.l.d(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        if (this.f1778h.a(i7, i10, intent)) {
            return;
        }
        super.onActivityResult(i7, i10, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        i().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        i9.l.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f1779i.iterator();
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(configuration);
        }
    }

    @Override // u3.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f1774d.a(bundle);
        e.a aVar = this.f1772b;
        aVar.getClass();
        aVar.f3909b = this;
        Iterator it = aVar.f3908a.iterator();
        while (it.hasNext()) {
            ((e.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i7 = androidx.lifecycle.f0.f1028b;
        androidx.lifecycle.d0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        i9.l.e(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i7, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f1773c.f13c).iterator();
        while (it.hasNext()) {
            ((p4.q) it.next()).f10222a.j();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        i9.l.e(menuItem, "item");
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f1773c.f13c).iterator();
            while (it.hasNext()) {
                if (((p4.q) it.next()).f10222a.o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        if (this.f1784o) {
            return;
        }
        Iterator it = this.f1781l.iterator();
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(new u3.i(z10));
        }
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        i9.l.e(configuration, "newConfig");
        this.f1784o = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f1784o = false;
            Iterator it = this.f1781l.iterator();
            while (it.hasNext()) {
                ((d4.a) it.next()).accept(new u3.i(z10));
            }
        } catch (Throwable th) {
            this.f1784o = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        i9.l.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        i9.l.e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f1773c.f13c).iterator();
        while (it.hasNext()) {
            ((p4.q) it.next()).f10222a.p();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.f1785p) {
            return;
        }
        Iterator it = this.f1782m.iterator();
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(new u3.l(z10));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        i9.l.e(configuration, "newConfig");
        this.f1785p = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f1785p = false;
            Iterator it = this.f1782m.iterator();
            while (it.hasNext()) {
                ((d4.a) it.next()).accept(new u3.l(z10));
            }
        } catch (Throwable th) {
            this.f1785p = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        i9.l.e(menu, "menu");
        if (i7 != 0) {
            return true;
        }
        super.onPreparePanel(i7, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f1773c.f13c).iterator();
        while (it.hasNext()) {
            ((p4.q) it.next()).f10222a.s();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        i9.l.e(strArr, "permissions");
        i9.l.e(iArr, "grantResults");
        if (this.f1778h.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        r0 r0Var = this.f1775e;
        if (r0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            r0Var = iVar.f1729a;
        }
        if (r0Var == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f1729a = r0Var;
        return iVar2;
    }

    @Override // u3.h, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        i9.l.e(bundle, "outState");
        androidx.lifecycle.v vVar = this.f13057a;
        if (vVar != null) {
            i9.l.c(vVar, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            vVar.c("setCurrentState");
            vVar.e(androidx.lifecycle.o.f1058c);
        }
        super.onSaveInstanceState(bundle);
        this.f1774d.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f1780j.iterator();
        while (it.hasNext()) {
            ((d4.a) it.next()).accept(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f1783n.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (o9.e0.J()) {
                o9.e0.m("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            y yVar = (y) this.f1777g.getValue();
            synchronized (yVar.f1795a) {
                try {
                    yVar.f1796b = true;
                    Iterator it = yVar.f1797c.iterator();
                    while (it.hasNext()) {
                        ((h9.a) it.next()).invoke();
                    }
                    yVar.f1797c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        j();
        View decorView = getWindow().getDecorView();
        i9.l.d(decorView, "window.decorView");
        j jVar = this.f1776f;
        jVar.getClass();
        if (!jVar.f1736c) {
            jVar.f1736c = true;
            decorView.getViewTreeObserver().addOnDrawListener(jVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7) {
        i9.l.e(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        i9.l.e(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        i9.l.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i7, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        i9.l.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i7, intent, i10, i11, i12, bundle);
    }
}
