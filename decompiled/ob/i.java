package ob;

import java.util.List;
import nb.a0;
import nb.h0;
import nb.k0;
import nb.n0;
import nb.w0;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a0 implements qb.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb.b f9642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f9643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f9644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f9645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9647g;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(qb.b bVar, j jVar, w0 w0Var, h0 h0Var, boolean z10, int i7) {
        if ((i7 & 8) != 0) {
            h0.f8997b.getClass();
            h0Var = h0.f8998c;
        }
        this(bVar, jVar, w0Var, h0Var, (i7 & 16) != 0 ? false : z10, false);
    }

    public i(qb.b bVar, j jVar, w0 w0Var, h0 h0Var, boolean z10, boolean z11) {
        i9.l.e(bVar, "captureStatus");
        i9.l.e(jVar, "constructor");
        i9.l.e(h0Var, "attributes");
        this.f9642b = bVar;
        this.f9643c = jVar;
        this.f9644d = w0Var;
        this.f9645e = h0Var;
        this.f9646f = z10;
        this.f9647g = z11;
    }

    @Override // nb.w
    public final List B0() {
        return w.f13122a;
    }

    @Override // nb.w
    public final h0 C0() {
        return this.f9645e;
    }

    @Override // nb.w
    public final k0 D0() {
        return this.f9643c;
    }

    @Override // nb.w
    public final boolean E0() {
        return this.f9646f;
    }

    @Override // nb.a0, nb.w0
    public final w0 H0(boolean z10) {
        return new i(this.f9642b, this.f9643c, this.f9644d, this.f9645e, z10, 32);
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: K0 */
    public final a0 H0(boolean z10) {
        return new i(this.f9642b, this.f9643c, this.f9644d, this.f9645e, z10, 32);
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        i9.l.e(h0Var, "newAttributes");
        return new i(this.f9642b, this.f9643c, this.f9644d, h0Var, this.f9646f, this.f9647g);
    }

    @Override // nb.w0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final i F0(g gVar) {
        i9.l.e(gVar, "kotlinTypeRefiner");
        j jVar = this.f9643c;
        jVar.getClass();
        n0 n0VarD = jVar.f9648a.d(gVar);
        aa.j jVar2 = jVar.f9649b != null ? new aa.j(13, jVar, gVar) : null;
        j jVar3 = jVar.f9650c;
        if (jVar3 == null) {
            jVar3 = jVar;
        }
        j jVar4 = new j(n0VarD, jVar2, jVar3, jVar.f9651d);
        w0 w0Var = this.f9644d;
        return new i(this.f9642b, jVar4, w0Var != null ? w0Var : null, this.f9645e, this.f9646f, 32);
    }

    @Override // nb.w
    public final gb.o U() {
        return pb.l.a(pb.h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }
}
