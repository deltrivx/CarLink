package androidx.compose.foundation.lazy.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h0.l0;
import h0.p0;
import i9.l;
import kotlin.Metadata;
import q2.f;
import q2.z0;
import r1.o;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Lq2/z0;", "Lh0/p0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class LazyLayoutSemanticsModifier extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.a f833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f836d;

    public LazyLayoutSemanticsModifier(h9.a aVar, l0 l0Var, x0 x0Var, boolean z10) {
        this.f833a = aVar;
        this.f834b = l0Var;
        this.f835c = x0Var;
        this.f836d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f833a == lazyLayoutSemanticsModifier.f833a && l.a(this.f834b, lazyLayoutSemanticsModifier.f834b) && this.f835c == lazyLayoutSemanticsModifier.f835c && this.f836d == lazyLayoutSemanticsModifier.f836d;
    }

    public final int hashCode() {
        return ((((this.f835c.hashCode() + ((this.f834b.hashCode() + (this.f833a.hashCode() * 31)) * 31)) * 31) + (this.f836d ? 1231 : 1237)) * 31) + 1237;
    }

    @Override // q2.z0
    public final o i() {
        return new p0(this.f833a, this.f834b, this.f835c, this.f836d);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        p0 p0Var = (p0) oVar;
        p0Var.f6349o = this.f833a;
        p0Var.f6350p = this.f834b;
        x0 x0Var = p0Var.f6351q;
        x0 x0Var2 = this.f835c;
        if (x0Var != x0Var2) {
            p0Var.f6351q = x0Var2;
            f.n(p0Var);
        }
        boolean z10 = p0Var.f6352r;
        boolean z11 = this.f836d;
        if (z10 == z11) {
            return;
        }
        p0Var.f6352r = z11;
        p0Var.A0();
        f.n(p0Var);
    }
}
