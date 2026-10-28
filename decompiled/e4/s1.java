package e4;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f4397b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f4398a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            f4397b = n1.f4383s;
        } else if (i7 >= 30) {
            f4397b = m1.f4378r;
        } else {
            f4397b = o1.f4385b;
        }
    }

    public s1(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            this.f4398a = new n1(this, windowInsets);
            return;
        }
        if (i7 >= 30) {
            this.f4398a = new m1(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.f4398a = new l1(this, windowInsets);
        } else if (i7 >= 28) {
            this.f4398a = new k1(this, windowInsets);
        } else {
            this.f4398a = new j1(this, windowInsets);
        }
    }

    public s1(s1 s1Var) {
        if (s1Var == null) {
            this.f4398a = new o1(this);
            return;
        }
        o1 o1Var = s1Var.f4398a;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34 && (o1Var instanceof n1)) {
            this.f4398a = new n1(this, (n1) o1Var);
        } else if (i7 >= 30 && (o1Var instanceof m1)) {
            this.f4398a = new m1(this, (m1) o1Var);
        } else if (i7 >= 29 && (o1Var instanceof l1)) {
            this.f4398a = new l1(this, (l1) o1Var);
        } else if (i7 >= 28 && (o1Var instanceof k1)) {
            this.f4398a = new k1(this, (k1) o1Var);
        } else if (o1Var instanceof j1) {
            this.f4398a = new j1(this, (j1) o1Var);
        } else if (o1Var instanceof i1) {
            this.f4398a = new i1(this, (i1) o1Var);
        } else {
            this.f4398a = new o1(this);
        }
        o1Var.e(this);
    }

    public static x3.b a(x3.b bVar, int i7, int i10, int i11, int i12) {
        int iMax = Math.max(0, bVar.f14563a - i7);
        int iMax2 = Math.max(0, bVar.f14564b - i10);
        int iMax3 = Math.max(0, bVar.f14565c - i11);
        int iMax4 = Math.max(0, bVar.f14566d - i12);
        return (iMax == i7 && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? bVar : x3.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static s1 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        s1 s1Var = new s1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            s1 s1VarF = l0.f(view);
            o1 o1Var = s1Var.f4398a;
            o1Var.t(s1VarF);
            o1Var.d(view.getRootView());
            o1Var.v(view.getWindowSystemUiVisibility());
        }
        return s1Var;
    }

    public final WindowInsets b() {
        o1 o1Var = this.f4398a;
        if (o1Var instanceof i1) {
            return ((i1) o1Var).f4358c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s1) {
            return Objects.equals(this.f4398a, ((s1) obj).f4398a);
        }
        return false;
    }

    public final int hashCode() {
        o1 o1Var = this.f4398a;
        if (o1Var == null) {
            return 0;
        }
        return o1Var.hashCode();
    }
}
