package nb;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8994d;

    public /* synthetic */ g0(int i7, Object obj) {
        this.f8993c = i7;
        this.f8994d = obj;
    }

    @Override // nb.p0
    public boolean a() {
        switch (this.f8993c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // nb.p0
    public boolean e() {
        switch (this.f8993c) {
            case 1:
                return ((Map) this.f8994d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // nb.l0
    public final n0 g(k0 k0Var) {
        switch (this.f8993c) {
            case 0:
                i9.l.e(k0Var, "key");
                if (!((ArrayList) this.f8994d).contains(k0Var)) {
                    return null;
                }
                x9.h hVarL = k0Var.l();
                i9.l.c(hVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return u0.j((x9.r0) hVarL);
            default:
                i9.l.e(k0Var, "key");
                return (n0) ((Map) this.f8994d).get(k0Var);
        }
    }
}
