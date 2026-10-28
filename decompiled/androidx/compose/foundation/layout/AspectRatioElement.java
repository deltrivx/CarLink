package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.j;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Lq2/z0;", "Ld0/j;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class AspectRatioElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f797a;

    public AspectRatioElement(float f10) {
        this.f797a = f10;
        if (f10 > 0.0f) {
            return;
        }
        e0.a.a("aspectRatio " + f10 + " must be > 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null || this.f797a != aspectRatioElement.f797a) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f797a) * 31) + 1237;
    }

    @Override // q2.z0
    public final o i() {
        j jVar = new j();
        jVar.f3578o = this.f797a;
        return jVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((j) oVar).f3578o = this.f797a;
    }
}
