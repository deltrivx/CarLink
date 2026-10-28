package pc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 implements nc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nc.e f10444a;

    public f0(nc.e eVar) {
        this.f10444a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return i9.l.a(this.f10444a, f0Var.f10444a) && i9.l.a(h(), f0Var.h());
    }

    @Override // nc.e
    public final n4.h f() {
        return nc.i.f9091d;
    }

    @Override // nc.e
    public final boolean g() {
        return false;
    }

    @Override // nc.e
    public final List getAnnotations() {
        return u8.w.f13122a;
    }

    public final int hashCode() {
        return h().hashCode() + (this.f10444a.hashCode() * 31);
    }

    @Override // nc.e
    public final void i() {
    }

    @Override // nc.e
    public final int j(String str) {
        i9.l.e(str, "name");
        Integer numP0 = zb.q.p0(str);
        if (numP0 != null) {
            return numP0.intValue();
        }
        throw new IllegalArgumentException(str.concat(" is not a valid list index"));
    }

    @Override // nc.e
    public final int k() {
        return 1;
    }

    @Override // nc.e
    public final String l(int i7) {
        return String.valueOf(i7);
    }

    @Override // nc.e
    public final List m(int i7) {
        if (i7 >= 0) {
            return u8.w.f13122a;
        }
        StringBuilder sbT = ob.a.t("Illegal index ", ", ", i7);
        sbT.append(h());
        sbT.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    @Override // nc.e
    public final nc.e n(int i7) {
        if (i7 >= 0) {
            return this.f10444a;
        }
        StringBuilder sbT = ob.a.t("Illegal index ", ", ", i7);
        sbT.append(h());
        sbT.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    @Override // nc.e
    public final boolean o(int i7) {
        if (i7 >= 0) {
            return false;
        }
        StringBuilder sbT = ob.a.t("Illegal index ", ", ", i7);
        sbT.append(h());
        sbT.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbT.toString().toString());
    }

    public final String toString() {
        return h() + '(' + this.f10444a + ')';
    }
}
