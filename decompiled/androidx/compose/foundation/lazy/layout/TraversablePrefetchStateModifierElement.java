package androidx.compose.foundation.lazy.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h0.i0;
import h0.y0;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Lq2/z0;", "Lh0/y0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final /* data */ class TraversablePrefetchStateModifierElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f837a;

    public TraversablePrefetchStateModifierElement(i0 i0Var) {
        this.f837a = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && l.a(this.f837a, ((TraversablePrefetchStateModifierElement) obj).f837a);
    }

    public final int hashCode() {
        return this.f837a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        y0 y0Var = new y0();
        y0Var.f6409o = this.f837a;
        return y0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((y0) oVar).f6409o = this.f837a;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f837a + ')';
    }
}
