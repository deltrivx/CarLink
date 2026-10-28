package e4;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class k1 extends j1 {
    public k1(s1 s1Var, WindowInsets windowInsets) {
        super(s1Var, windowInsets);
    }

    public k1(s1 s1Var, k1 k1Var) {
        super(s1Var, k1Var);
    }

    @Override // e4.o1
    public s1 a() {
        return s1.c(null, this.f4358c.consumeDisplayCutout());
    }

    @Override // e4.i1, e4.o1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Objects.equals(this.f4358c, k1Var.f4358c) && Objects.equals(this.f4362g, k1Var.f4362g) && i1.C(this.f4363h, k1Var.f4363h);
    }

    @Override // e4.o1
    public i f() {
        DisplayCutout displayCutout = this.f4358c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // e4.o1
    public int hashCode() {
        return this.f4358c.hashCode();
    }
}
