package e4;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1 f4385b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f4386a;

    static {
        h1 e1Var;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            e1Var = new g1();
        } else if (i7 >= 30) {
            e1Var = new f1();
        } else {
            e1Var = i7 >= 29 ? new e1() : new d1();
        }
        f4385b = e1Var.b().f4398a.a().f4398a.b().f4398a.c();
    }

    public o1(s1 s1Var) {
        this.f4386a = s1Var;
    }

    public s1 a() {
        return this.f4386a;
    }

    public s1 b() {
        return this.f4386a;
    }

    public s1 c() {
        return this.f4386a;
    }

    public void d(View view) {
    }

    public void e(s1 s1Var) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return p() == o1Var.p() && o() == o1Var.o() && Objects.equals(l(), o1Var.l()) && Objects.equals(j(), o1Var.j()) && Objects.equals(f(), o1Var.f());
    }

    public i f() {
        return null;
    }

    public x3.b g(int i7) {
        return x3.b.f14562e;
    }

    public x3.b h(int i7) {
        if ((i7 & 8) == 0) {
            return x3.b.f14562e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public x3.b i() {
        return l();
    }

    public x3.b j() {
        return x3.b.f14562e;
    }

    public x3.b k() {
        return l();
    }

    public x3.b l() {
        return x3.b.f14562e;
    }

    public x3.b m() {
        return l();
    }

    public s1 n(int i7, int i10, int i11, int i12) {
        return f4385b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i7) {
        return true;
    }

    public void r(x3.b[] bVarArr) {
    }

    public void s(x3.b bVar) {
    }

    public void t(s1 s1Var) {
    }

    public void u(x3.b bVar) {
    }

    public void v(int i7) {
    }
}
