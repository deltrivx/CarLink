package y1;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14892d;

    public f0(ArrayList arrayList, ArrayList arrayList2) {
        this.f14891c = arrayList;
        this.f14892d = arrayList2;
    }

    @Override // y1.j0
    public final Shader b(long j5) {
        long jX = n3.l.x(j5);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jX & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fC = x1.e.c(j5) / 2;
        ArrayList arrayList = this.f14892d;
        ArrayList arrayList2 = this.f14891c;
        h0.I(arrayList, arrayList2);
        int iL = h0.l(arrayList2);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), fC, h0.s(iL, arrayList2), h0.t(arrayList, arrayList2, iL), h0.B(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f14891c.equals(f0Var.f14891c) && this.f14892d.equals(f0Var.f14892d) && x1.b.b(9205357640488583168L, 9205357640488583168L);
    }

    public final int hashCode() {
        return ob.a.j(Float.POSITIVE_INFINITY, (x1.b.f(9205357640488583168L) + ((this.f14892d.hashCode() + (this.f14891c.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "RadialGradient(colors=" + this.f14891c + ", stops=" + this.f14892d + ", " + ((Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & Integer.MAX_VALUE) < 2139095040 ? "radius=Infinity, " : "") + "tileMode=Clamp)";
    }
}
