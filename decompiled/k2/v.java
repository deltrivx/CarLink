package k2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7287j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f7288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f7291o;

    public v(long j5, long j10, long j11, boolean z10, float f10, long j12, long j13, boolean z11, int i7, ArrayList arrayList, long j14, long j15) {
        this(j5, j10, j11, z10, f10, j12, j13, z11, false, i7, j14);
        this.k = arrayList;
        this.f7288l = j15;
    }

    public v(long j5, long j10, long j11, boolean z10, float f10, long j12, long j13, boolean z11, boolean z12, int i7, long j14) {
        this.f7278a = j5;
        this.f7279b = j10;
        this.f7280c = j11;
        this.f7281d = z10;
        this.f7282e = f10;
        this.f7283f = j12;
        this.f7284g = j13;
        this.f7285h = z11;
        this.f7286i = i7;
        this.f7287j = j14;
        this.f7288l = 0L;
        this.f7289m = z12;
        this.f7290n = z12;
    }

    public final void a() {
        v vVar = this.f7291o;
        if (vVar == null) {
            this.f7289m = true;
            this.f7290n = true;
        } else if (vVar != null) {
            vVar.a();
        }
    }

    public final boolean b() {
        v vVar = this.f7291o;
        if (vVar != null) {
            return vVar.b();
        }
        return this.f7289m || this.f7290n;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) ("PointerId(value=" + this.f7278a + ')'));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f7279b);
        sb2.append(", position=");
        sb2.append((Object) x1.b.j(this.f7280c));
        sb2.append(", pressed=");
        sb2.append(this.f7281d);
        sb2.append(", pressure=");
        sb2.append(this.f7282e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f7283f);
        sb2.append(", previousPosition=");
        sb2.append((Object) x1.b.j(this.f7284g));
        sb2.append(", previousPressed=");
        sb2.append(this.f7285h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        int i7 = this.f7286i;
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
        sb2.append(", historical=");
        Object obj = this.k;
        if (obj == null) {
            obj = u8.w.f13122a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) x1.b.j(this.f7287j));
        sb2.append(')');
        return sb2.toString();
    }
}
