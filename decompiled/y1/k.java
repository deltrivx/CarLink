package y1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorFilter f14921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14923c;

    public k(int i7, long j5) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            a.d();
            porterDuffColorFilter = a.c(h0.C(j5), h0.x(i7));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(h0.C(j5), h0.G(i7));
        }
        this.f14921a = porterDuffColorFilter;
        this.f14922b = j5;
        this.f14923c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return q.c(this.f14922b, kVar.f14922b) && this.f14923c == kVar.f14923c;
    }

    public final int hashCode() {
        int i7 = q.f14959n;
        return (t8.u.a(this.f14922b) * 31) + this.f14923c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        ob.a.x(this.f14922b, sb2, ", blendMode=");
        sb2.append((Object) h0.H(this.f14923c));
        sb2.append(')');
        return sb2.toString();
    }
}
