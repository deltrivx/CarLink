package w9;

import aa.g0;
import aa.h0;
import i9.r;
import i9.y;
import o9.u;
import u8.p;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends u9.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f14202h = {y.f6689a.g(new r(i.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g0 f14203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mb.i f14204g;

    public i(mb.k kVar) {
        super(kVar);
        this.f14204g = new mb.i(kVar, new aa.j(18, this, kVar));
    }

    public final l K() {
        return (l) k9.a.z(this.f14204g, f14202h[0]);
    }

    @Override // u9.i
    public final z9.b d() {
        return K();
    }

    @Override // u9.i
    public final Iterable m() {
        Iterable iterableM = super.m();
        h0 h0VarL = l();
        i9.l.d(h0VarL, "getBuiltInsModule(...)");
        return p.w0(iterableM, new g(this.f13145d, h0VarL));
    }

    @Override // u9.i
    public final z9.d q() {
        return K();
    }
}
