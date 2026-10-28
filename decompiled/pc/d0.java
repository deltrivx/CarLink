package pc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements nc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nc.e f10434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.e f10435b;

    public d0(nc.e eVar, nc.e eVar2) {
        i9.l.e(eVar, "keyDesc");
        i9.l.e(eVar2, "valueDesc");
        this.f10434a = eVar;
        this.f10435b = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return i9.l.a(this.f10434a, d0Var.f10434a) && i9.l.a(this.f10435b, d0Var.f10435b);
    }

    @Override // nc.e
    public final n4.h f() {
        return nc.i.f9092e;
    }

    @Override // nc.e
    public final boolean g() {
        return false;
    }

    @Override // nc.e
    public final List getAnnotations() {
        return u8.w.f13122a;
    }

    @Override // nc.e
    public final String h() {
        return "kotlin.collections.LinkedHashMap";
    }

    public final int hashCode() {
        return this.f10435b.hashCode() + ((this.f10434a.hashCode() + 710441009) * 31);
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
        throw new IllegalArgumentException(str.concat(" is not a valid map index"));
    }

    @Override // nc.e
    public final int k() {
        return 2;
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
        throw new IllegalArgumentException(a2.f.F("Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices", i7).toString());
    }

    @Override // nc.e
    public final nc.e n(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(a2.f.F("Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices", i7).toString());
        }
        int i10 = i7 % 2;
        if (i10 == 0) {
            return this.f10434a;
        }
        if (i10 == 1) {
            return this.f10435b;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // nc.e
    public final boolean o(int i7) {
        if (i7 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(a2.f.F("Illegal index ", ", kotlin.collections.LinkedHashMap expects only non-negative indices", i7).toString());
    }

    public final String toString() {
        return "kotlin.collections.LinkedHashMap(" + this.f10434a + ", " + this.f10435b + ')';
    }
}
