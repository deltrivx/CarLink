package ob;

import java.util.Collection;
import java.util.List;
import nb.n0;
import nb.w;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements ab.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f9648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h9.a f9649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f9650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f9651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9652e;

    public j(n0 n0Var, h9.a aVar, j jVar, r0 r0Var) {
        i9.l.e(n0Var, "projection");
        this.f9648a = n0Var;
        this.f9649b = aVar;
        this.f9650c = jVar;
        this.f9651d = r0Var;
        this.f9652e = t8.a.c(t8.i.f12827a, new aa.e(22, this));
    }

    public /* synthetic */ j(n0 n0Var, lb.e eVar, r0 r0Var, int i7) {
        this(n0Var, (i7 & 2) != 0 ? null : eVar, (j) null, (i7 & 8) != 0 ? null : r0Var);
    }

    @Override // ab.b
    public final n0 a() {
        return this.f9648a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        i9.l.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        j jVar = (j) obj;
        j jVar2 = this.f9650c;
        if (jVar2 == null) {
            jVar2 = this;
        }
        j jVar3 = jVar.f9650c;
        if (jVar3 != null) {
            obj = jVar3;
        }
        return jVar2 == obj;
    }

    public final int hashCode() {
        j jVar = this.f9650c;
        return jVar != null ? jVar.hashCode() : super.hashCode();
    }

    @Override // nb.k0
    public final u9.i k() {
        w wVarB = this.f9648a.b();
        i9.l.d(wVarB, "getType(...)");
        return n3.n.l0(wVarB);
    }

    @Override // nb.k0
    public final x9.h l() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    @Override // nb.k0
    public final Collection m() {
        List list = (List) this.f9652e.getValue();
        return list == null ? u8.w.f13122a : list;
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
        return "CapturedType(" + this.f9648a + ')';
    }
}
