package e6;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.media.session.r;
import android.view.MenuItem;
import e8.z0;
import j.b0;
import java.util.ArrayList;
import java.util.List;
import o.t;
import s.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4440b;

    public f() {
        this.f4440b = new int[2];
    }

    public f(Context context) {
        this.f4439a = context;
    }

    public f(b0 b0Var) {
        this.f4440b = b0Var;
    }

    public f(t5.a aVar) {
        this.f4439a = aVar;
        this.f4440b = new a2.b(aVar);
    }

    public static Bundle g(int i7, List list) {
        Bundle bundle = new Bundle();
        bundle.putInt("request_code", i7);
        if (list instanceof ArrayList) {
            bundle.putParcelableArrayList("request_permissions", (ArrayList) list);
            return bundle;
        }
        bundle.putParcelableArrayList("request_permissions", new ArrayList<>(list));
        return bundle;
    }

    public void c() {
        z0 z0Var = (z0) this.f4439a;
        if (z0Var != null) {
            try {
                ((b0) this.f4440b).k.unregisterReceiver(z0Var);
            } catch (IllegalArgumentException unused) {
            }
            this.f4439a = null;
        }
    }

    public abstract void d(List list, int i7, r rVar);

    public abstract IntentFilter e();

    public abstract int[] f(int i7);

    public abstract int h();

    public MenuItem i(MenuItem menuItem) {
        if (!(menuItem instanceof z3.a)) {
            return menuItem;
        }
        z3.a aVar = (z3.a) menuItem;
        if (((q0) this.f4440b) == null) {
            this.f4440b = new q0(0);
        }
        MenuItem menuItem2 = (MenuItem) ((q0) this.f4440b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        t tVar = new t((Context) this.f4439a, aVar);
        ((q0) this.f4440b).put(aVar, tVar);
        return tVar;
    }

    public int[] j(int i7, int i10) {
        if (i7 < 0 || i10 < 0 || i7 == i10) {
            return null;
        }
        int[] iArr = (int[]) this.f4440b;
        iArr[0] = i7;
        iArr[1] = i10;
        return iArr;
    }

    public String k() {
        String str = (String) this.f4439a;
        if (str != null) {
            return str;
        }
        i9.l.j("text");
        throw null;
    }

    public abstract void l();

    public abstract String m();

    public abstract int[] n(int i7);

    public void o() {
        c();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((z0) this.f4439a) == null) {
            this.f4439a = new z0(1, this);
        }
        ((b0) this.f4440b).k.registerReceiver((z0) this.f4439a, intentFilterE);
    }
}
