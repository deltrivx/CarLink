package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.g0;
import kotlin.Metadata;
import n3.f;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "Lq2/z0;", "Ld0/g0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class PaddingElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f807d;

    public PaddingElement(float f10, float f11, float f12, float f13) {
        this.f804a = f10;
        this.f805b = f11;
        this.f806c = f12;
        this.f807d = f13;
        boolean z10 = true;
        boolean z11 = (f10 >= 0.0f || Float.isNaN(f10)) & (f11 >= 0.0f || Float.isNaN(f11)) & (f12 >= 0.0f || Float.isNaN(f12));
        if (f13 < 0.0f && !Float.isNaN(f13)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            e0.a.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && f.a(this.f804a, paddingElement.f804a) && f.a(this.f805b, paddingElement.f805b) && f.a(this.f806c, paddingElement.f806c) && f.a(this.f807d, paddingElement.f807d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f807d) + ob.a.j(this.f806c, ob.a.j(this.f805b, Float.floatToIntBits(this.f804a) * 31, 31), 31)) * 31) + 1231;
    }

    @Override // q2.z0
    public final o i() {
        g0 g0Var = new g0();
        g0Var.f3561o = this.f804a;
        g0Var.f3562p = this.f805b;
        g0Var.f3563q = this.f806c;
        g0Var.f3564r = this.f807d;
        g0Var.f3565s = true;
        return g0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        g0 g0Var = (g0) oVar;
        g0Var.f3561o = this.f804a;
        g0Var.f3562p = this.f805b;
        g0Var.f3563q = this.f806c;
        g0Var.f3564r = this.f807d;
        g0Var.f3565s = true;
    }
}
