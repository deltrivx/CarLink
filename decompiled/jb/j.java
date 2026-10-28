package jb;

import java.util.ArrayList;
import ra.s0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j implements l, n, m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f7037c = new j(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f7038d = new j(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f7039e = new j(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f7040f = new j(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f7041g = new j(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7042b;

    public /* synthetic */ j(int i7) {
        this.f7042b = i7;
    }

    public static x9.x e(ra.c0 c0Var) {
        int i7 = c0Var == null ? -1 : x.f7087a[c0Var.ordinal()];
        x9.x xVar = x9.x.f14747b;
        if (i7 == 1) {
            return xVar;
        }
        if (i7 == 2) {
            return x9.x.f14749d;
        }
        if (i7 != 3) {
            return i7 != 4 ? xVar : x9.x.f14748c;
        }
        return x9.x.f14750e;
    }

    @Override // jb.m
    public void a(x9.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // jb.m
    public void b(x9.e eVar, ArrayList arrayList) {
    }

    @Override // jb.l
    public Boolean c() {
        switch (this.f7042b) {
            case 1:
                return null;
            default:
                return Boolean.TRUE;
        }
    }

    @Override // jb.n
    public nb.w d(s0 s0Var, String str, nb.a0 a0Var, nb.a0 a0Var2) {
        i9.l.e(s0Var, "proto");
        i9.l.e(str, "flexibleId");
        i9.l.e(a0Var, "lowerBound");
        i9.l.e(a0Var2, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }
}
