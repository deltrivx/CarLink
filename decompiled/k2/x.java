package k2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f7303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7304j;
    public final long k;

    public x(long j5, long j10, long j11, long j12, boolean z10, float f10, int i7, boolean z11, ArrayList arrayList, long j13, long j14) {
        this.f7295a = j5;
        this.f7296b = j10;
        this.f7297c = j11;
        this.f7298d = j12;
        this.f7299e = z10;
        this.f7300f = f10;
        this.f7301g = i7;
        this.f7302h = z11;
        this.f7303i = arrayList;
        this.f7304j = j13;
        this.k = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return u.d(this.f7295a, xVar.f7295a) && this.f7296b == xVar.f7296b && x1.b.b(this.f7297c, xVar.f7297c) && x1.b.b(this.f7298d, xVar.f7298d) && this.f7299e == xVar.f7299e && Float.compare(this.f7300f, xVar.f7300f) == 0 && this.f7301g == xVar.f7301g && this.f7302h == xVar.f7302h && this.f7303i.equals(xVar.f7303i) && x1.b.b(this.f7304j, xVar.f7304j) && x1.b.b(this.k, xVar.k);
    }

    public final int hashCode() {
        long j5 = this.f7295a;
        long j10 = this.f7296b;
        return x1.b.f(this.k) + ((x1.b.f(this.f7304j) + ((this.f7303i.hashCode() + ((((ob.a.j(this.f7300f, (((x1.b.f(this.f7298d) + ((x1.b.f(this.f7297c) + (((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31)) * 31) + (this.f7299e ? 1231 : 1237)) * 31, 31) + this.f7301g) * 31) + (this.f7302h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) ("PointerId(value=" + this.f7295a + ')'));
        sb2.append(", uptime=");
        sb2.append(this.f7296b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) x1.b.j(this.f7297c));
        sb2.append(", position=");
        sb2.append((Object) x1.b.j(this.f7298d));
        sb2.append(", down=");
        sb2.append(this.f7299e);
        sb2.append(", pressure=");
        sb2.append(this.f7300f);
        sb2.append(", type=");
        int i7 = this.f7301g;
        if (i7 == 1) {
            str = "Touch";
        } else if (i7 == 2) {
            str = "Mouse";
        } else if (i7 != 3) {
            str = i7 != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb2.append((Object) str);
        sb2.append(", activeHover=");
        sb2.append(this.f7302h);
        sb2.append(", historical=");
        sb2.append(this.f7303i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) x1.b.j(this.f7304j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) x1.b.j(this.k));
        sb2.append(')');
        return sb2.toString();
    }
}
