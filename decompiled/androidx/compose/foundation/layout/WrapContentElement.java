package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.u;
import d0.y0;
import h9.n;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Lq2/z0;", "Ld0/y0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class WrapContentElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f818c;

    public WrapContentElement(u uVar, n nVar, Object obj) {
        this.f816a = uVar;
        this.f817b = nVar;
        this.f818c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f816a == wrapContentElement.f816a && l.a(this.f818c, wrapContentElement.f818c);
    }

    public final int hashCode() {
        return this.f818c.hashCode() + (((this.f816a.hashCode() * 31) + 1237) * 31);
    }

    @Override // q2.z0
    public final o i() {
        y0 y0Var = new y0();
        y0Var.f3673o = this.f816a;
        y0Var.f3674p = this.f817b;
        return y0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        y0 y0Var = (y0) oVar;
        y0Var.f3673o = this.f816a;
        y0Var.f3674p = this.f817b;
    }
}
