package x9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f14694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f14695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14696c;

    public d(r0 r0Var, i iVar, int i7) {
        this.f14694a = r0Var;
        this.f14695b = iVar;
        this.f14696c = i7;
    }

    @Override // x9.r0
    public final boolean B() {
        return this.f14694a.B();
    }

    @Override // x9.r0
    public final nb.x0 I() {
        nb.x0 x0VarI = this.f14694a.I();
        i9.l.d(x0VarI, "getVariance(...)");
        return x0VarI;
    }

    @Override // x9.k
    public final Object J(m mVar, Object obj) {
        return this.f14694a.J(mVar, obj);
    }

    @Override // x9.h, x9.k, x9.b
    public final h a() {
        return this.f14694a.a();
    }

    @Override // x9.k, x9.b
    public final k a() {
        return this.f14694a.a();
    }

    @Override // x9.r0, x9.h, x9.k, x9.b
    public final r0 a() {
        return this.f14694a.a();
    }

    @Override // x9.r0
    public final mb.n c0() {
        mb.n nVarC0 = this.f14694a.c0();
        i9.l.d(nVarC0, "getStorageManager(...)");
        return nVarC0;
    }

    @Override // x9.r0
    public final boolean g0() {
        return true;
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        return this.f14694a.getAnnotations();
    }

    @Override // x9.r0
    public final int getIndex() {
        return this.f14694a.getIndex() + this.f14696c;
    }

    @Override // x9.k
    public final wa.e getName() {
        wa.e name = this.f14694a.getName();
        i9.l.d(name, "getName(...)");
        return name;
    }

    @Override // x9.l
    public final n0 getSource() {
        n0 source = this.f14694a.getSource();
        i9.l.d(source, "getSource(...)");
        return source;
    }

    @Override // x9.r0
    public final List getUpperBounds() {
        List upperBounds = this.f14694a.getUpperBounds();
        i9.l.d(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // x9.k
    public final k l() {
        return this.f14695b;
    }

    @Override // x9.h
    public final nb.a0 n() {
        nb.a0 a0VarN = this.f14694a.n();
        i9.l.d(a0VarN, "getDefaultType(...)");
        return a0VarN;
    }

    @Override // x9.h
    public final nb.k0 t() {
        nb.k0 k0VarT = this.f14694a.t();
        i9.l.d(k0VarT, "getTypeConstructor(...)");
        return k0VarT;
    }

    public final String toString() {
        return this.f14694a + "[inner-copy]";
    }
}
