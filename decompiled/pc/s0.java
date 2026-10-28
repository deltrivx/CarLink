package pc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements nc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc.d f10505b;

    public s0(String str, nc.d dVar) {
        i9.l.e(dVar, "kind");
        this.f10504a = str;
        this.f10505b = dVar;
    }

    public final void a() {
        throw new IllegalStateException(ob.a.s(new StringBuilder("Primitive descriptor "), this.f10504a, " does not have elements"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return i9.l.a(this.f10504a, s0Var.f10504a) && i9.l.a(this.f10505b, s0Var.f10505b);
    }

    @Override // nc.e
    public final n4.h f() {
        return this.f10505b;
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
        return this.f10504a;
    }

    public final int hashCode() {
        return (this.f10505b.hashCode() * 31) + this.f10504a.hashCode();
    }

    @Override // nc.e
    public final void i() {
    }

    @Override // nc.e
    public final int j(String str) {
        i9.l.e(str, "name");
        a();
        throw null;
    }

    @Override // nc.e
    public final int k() {
        return 0;
    }

    @Override // nc.e
    public final String l(int i7) {
        a();
        throw null;
    }

    @Override // nc.e
    public final List m(int i7) {
        a();
        throw null;
    }

    @Override // nc.e
    public final nc.e n(int i7) {
        a();
        throw null;
    }

    @Override // nc.e
    public final boolean o(int i7) {
        a();
        throw null;
    }

    public final String toString() {
        return a2.f.I(new StringBuilder("PrimitiveDescriptor("), this.f10504a, ')');
    }
}
