package ab;

import gb.o;
import i9.l;
import java.util.List;
import nb.a0;
import nb.h0;
import nb.k0;
import nb.n0;
import nb.w0;
import ob.g;
import pb.h;
import u8.w;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a0 implements qb.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f501e;

    public a(n0 n0Var, c cVar, boolean z10, h0 h0Var) {
        l.e(n0Var, "typeProjection");
        l.e(h0Var, "attributes");
        this.f498b = n0Var;
        this.f499c = cVar;
        this.f500d = z10;
        this.f501e = h0Var;
    }

    @Override // nb.w
    public final List B0() {
        return w.f13122a;
    }

    @Override // nb.w
    public final h0 C0() {
        return this.f501e;
    }

    @Override // nb.w
    public final k0 D0() {
        return this.f499c;
    }

    @Override // nb.w
    public final boolean E0() {
        return this.f500d;
    }

    @Override // nb.w
    public final nb.w F0(g gVar) {
        l.e(gVar, "kotlinTypeRefiner");
        return new a(this.f498b.d(gVar), this.f499c, this.f500d, this.f501e);
    }

    @Override // nb.a0, nb.w0
    public final w0 H0(boolean z10) {
        if (z10 == this.f500d) {
            return this;
        }
        return new a(this.f498b, this.f499c, z10, this.f501e);
    }

    @Override // nb.w0
    /* JADX INFO: renamed from: I0 */
    public final w0 F0(g gVar) {
        l.e(gVar, "kotlinTypeRefiner");
        return new a(this.f498b.d(gVar), this.f499c, this.f500d, this.f501e);
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: K0 */
    public final a0 H0(boolean z10) {
        if (z10 == this.f500d) {
            return this;
        }
        return new a(this.f498b, this.f499c, z10, this.f501e);
    }

    @Override // nb.a0
    /* JADX INFO: renamed from: L0 */
    public final a0 J0(h0 h0Var) {
        l.e(h0Var, "newAttributes");
        return new a(this.f498b, this.f499c, this.f500d, h0Var);
    }

    @Override // nb.w
    public final o U() {
        return pb.l.a(h.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // nb.a0
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f498b);
        sb2.append(')');
        sb2.append(this.f500d ? "?" : "");
        return sb2.toString();
    }
}
