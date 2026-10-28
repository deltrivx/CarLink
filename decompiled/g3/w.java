package g3;

import b3.g0;
import b3.q0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3.h f5889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f5891c;

    public w(b3.h hVar, long j5, q0 q0Var) {
        q0 q0Var2;
        this.f5889a = hVar;
        this.f5890b = g0.c(hVar.f1353b.length(), j5);
        if (q0Var != null) {
            q0Var2 = new q0(g0.c(hVar.f1353b.length(), q0Var.f1430a));
        } else {
            q0Var2 = null;
        }
        this.f5891c = q0Var2;
    }

    public w(String str, long j5, int i7) {
        this(new b3.h((i7 & 1) != 0 ? "" : str), (i7 & 2) != 0 ? q0.f1428b : j5, (q0) null);
    }

    public static w a(w wVar, b3.h hVar, long j5, int i7) {
        if ((i7 & 1) != 0) {
            hVar = wVar.f5889a;
        }
        if ((i7 & 2) != 0) {
            j5 = wVar.f5890b;
        }
        q0 q0Var = (i7 & 4) != 0 ? wVar.f5891c : null;
        wVar.getClass();
        return new w(hVar, j5, q0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return q0.b(this.f5890b, wVar.f5890b) && i9.l.a(this.f5891c, wVar.f5891c) && i9.l.a(this.f5889a, wVar.f5889a);
    }

    public final int hashCode() {
        int i7;
        int iHashCode = this.f5889a.hashCode() * 31;
        int i10 = q0.f1429c;
        long j5 = this.f5890b;
        int i11 = (((int) (j5 ^ (j5 >>> 32))) + iHashCode) * 31;
        q0 q0Var = this.f5891c;
        if (q0Var != null) {
            long j10 = q0Var.f1430a;
            i7 = (int) (j10 ^ (j10 >>> 32));
        } else {
            i7 = 0;
        }
        return i11 + i7;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f5889a) + "', selection=" + ((Object) q0.h(this.f5890b)) + ", composition=" + this.f5891c + ')';
    }
}
