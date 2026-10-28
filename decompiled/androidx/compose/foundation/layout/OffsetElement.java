package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.f0;
import kotlin.Metadata;
import n3.f;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "Lq2/z0;", "Ld0/f0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class OffsetElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f803b;

    public OffsetElement(float f10, float f11) {
        this.f802a = f10;
        this.f803b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && f.a(this.f802a, offsetElement.f802a) && f.a(this.f803b, offsetElement.f803b);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f803b) + (Float.floatToIntBits(this.f802a) * 31)) * 31) + 1231;
    }

    @Override // q2.z0
    public final o i() {
        f0 f0Var = new f0();
        f0Var.f3558o = this.f802a;
        f0Var.f3559p = this.f803b;
        f0Var.f3560q = true;
        return f0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        f0 f0Var = (f0) oVar;
        float f10 = f0Var.f3558o;
        float f11 = this.f802a;
        boolean zA = f.a(f10, f11);
        float f12 = this.f803b;
        if (!zA || !f.a(f0Var.f3559p, f12) || !f0Var.f3560q) {
            q2.f.v(f0Var).U(false);
        }
        f0Var.f3558o = f11;
        f0Var.f3559p = f12;
        f0Var.f3560q = true;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) f.b(this.f802a)) + ", y=" + ((Object) f.b(this.f803b)) + ", rtlAware=true)";
    }
}
