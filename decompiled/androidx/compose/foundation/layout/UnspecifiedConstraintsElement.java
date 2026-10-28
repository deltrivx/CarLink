package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.r0;
import kotlin.Metadata;
import n3.f;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Lq2/z0;", "Ld0/r0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class UnspecifiedConstraintsElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f815b;

    public UnspecifiedConstraintsElement(float f10, float f11) {
        this.f814a = f10;
        this.f815b = f11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return f.a(this.f814a, unspecifiedConstraintsElement.f814a) && f.a(this.f815b, unspecifiedConstraintsElement.f815b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f815b) + (Float.floatToIntBits(this.f814a) * 31);
    }

    @Override // q2.z0
    public final o i() {
        r0 r0Var = new r0();
        r0Var.f3625o = this.f814a;
        r0Var.f3626p = this.f815b;
        return r0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        r0 r0Var = (r0) oVar;
        r0Var.f3625o = this.f814a;
        r0Var.f3626p = this.f815b;
    }
}
