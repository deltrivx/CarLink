package y1;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14944d;

    public o0(ArrayList arrayList, ArrayList arrayList2) {
        this.f14943c = arrayList;
        this.f14944d = arrayList2;
    }

    @Override // y1.j0
    public final Shader b(long j5) {
        long jX = n3.l.x(j5);
        ArrayList arrayList = this.f14944d;
        ArrayList arrayList2 = this.f14943c;
        h0.I(arrayList, arrayList2);
        int iL = h0.l(arrayList2);
        return new SweepGradient(Float.intBitsToFloat((int) (jX >> 32)), Float.intBitsToFloat((int) (jX & 4294967295L)), h0.s(iL, arrayList2), h0.t(arrayList, arrayList2, iL));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return x1.b.b(9205357640488583168L, 9205357640488583168L) && this.f14943c.equals(o0Var.f14943c) && this.f14944d.equals(o0Var.f14944d);
    }

    public final int hashCode() {
        return this.f14944d.hashCode() + ((this.f14943c.hashCode() + (x1.b.f(9205357640488583168L) * 31)) * 31);
    }

    public final String toString() {
        return "SweepGradient(colors=" + this.f14943c + ", stops=" + this.f14944d + ')';
    }
}
