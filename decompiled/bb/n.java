package bb;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import nb.h0;
import nb.k0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class n implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t8.o f1689b;

    public n(Set set) {
        h0.f8997b.getClass();
        h0 h0Var = h0.f8998c;
        i9.l.e(h0Var, "attributes");
        nb.c.u(pb.l.a(pb.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), u8.w.f13122a, h0Var, this, false);
        this.f1689b = t8.a.d(new l());
        this.f1688a = set;
    }

    @Override // nb.k0
    public final u9.i k() {
        throw null;
    }

    @Override // nb.k0
    public final x9.h l() {
        return null;
    }

    @Override // nb.k0
    public final Collection m() {
        return (List) this.f1689b.getValue();
    }

    @Override // nb.k0
    public final List n() {
        return u8.w.f13122a;
    }

    @Override // nb.k0
    public final boolean o() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append("[" + u8.p.q0(this.f1688a, ",", null, null, m.f1687a, 30) + ']');
        return sb2.toString();
    }
}
