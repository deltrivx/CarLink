package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.c0;
import d0.d0;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Lq2/z0;", "Ld0/d0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class IntrinsicWidthElement extends z0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    public final int hashCode() {
        return (c0.f3547b.hashCode() * 31) + 1231;
    }

    @Override // q2.z0
    public final o i() {
        d0 d0Var = new d0();
        d0Var.f3551o = c0.f3547b;
        d0Var.f3552p = true;
        return d0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        d0 d0Var = (d0) oVar;
        d0Var.f3551o = c0.f3547b;
        d0Var.f3552p = true;
    }
}
