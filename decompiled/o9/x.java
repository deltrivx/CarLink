package o9;

import r9.n1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f9567c = new x(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f9568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i9.m f9569b;

    public x(y yVar, n1 n1Var) {
        String str;
        this.f9568a = yVar;
        this.f9569b = n1Var;
        if ((yVar == null) == (n1Var == null)) {
            return;
        }
        if (yVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + yVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f9568a == xVar.f9568a && i9.l.a(this.f9569b, xVar.f9569b);
    }

    public final int hashCode() {
        y yVar = this.f9568a;
        int iHashCode = (yVar == null ? 0 : yVar.hashCode()) * 31;
        i9.m mVar = this.f9569b;
        return iHashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        y yVar = this.f9568a;
        int i7 = yVar == null ? -1 : w.f9566a[yVar.ordinal()];
        if (i7 == -1) {
            return "*";
        }
        i9.m mVar = this.f9569b;
        if (i7 == 1) {
            return String.valueOf(mVar);
        }
        if (i7 == 2) {
            return "in " + mVar;
        }
        if (i7 != 3) {
            throw new cc.s();
        }
        return "out " + mVar;
    }
}
