package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.e0;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Lq2/z0;", "Ld0/e0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class LayoutWeightElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f801b;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f800a = f10;
        this.f801b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f800a == layoutWeightElement.f800a && this.f801b == layoutWeightElement.f801b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f800a) * 31) + (this.f801b ? 1231 : 1237);
    }

    @Override // q2.z0
    public final o i() {
        e0 e0Var = new e0();
        e0Var.f3553o = this.f800a;
        e0Var.f3554p = this.f801b;
        return e0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        e0 e0Var = (e0) oVar;
        e0Var.f3553o = this.f800a;
        e0Var.f3554p = this.f801b;
    }
}
