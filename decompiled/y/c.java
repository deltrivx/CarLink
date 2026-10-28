package y;

import t8.u;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14853e;

    public c(long j5, long j10, long j11, long j12, long j13) {
        this.f14849a = j5;
        this.f14850b = j10;
        this.f14851c = j11;
        this.f14852d = j12;
        this.f14853e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return q.c(this.f14849a, cVar.f14849a) && q.c(this.f14850b, cVar.f14850b) && q.c(this.f14851c, cVar.f14851c) && q.c(this.f14852d, cVar.f14852d) && q.c(this.f14853e, cVar.f14853e);
    }

    public final int hashCode() {
        int i7 = q.f14959n;
        return u.a(this.f14853e) + ob.a.k(ob.a.k(ob.a.k(u.a(this.f14849a) * 31, 31, this.f14850b), 31, this.f14851c), 31, this.f14852d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        ob.a.x(this.f14849a, sb2, ", textColor=");
        ob.a.x(this.f14850b, sb2, ", iconColor=");
        ob.a.x(this.f14851c, sb2, ", disabledTextColor=");
        ob.a.x(this.f14852d, sb2, ", disabledIconColor=");
        sb2.append((Object) q.i(this.f14853e));
        sb2.append(')');
        return sb2.toString();
    }
}
