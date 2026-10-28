package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.u;
import d0.w;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Lq2/z0;", "Ld0/w;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class FillElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f799a;

    public FillElement(u uVar) {
        this.f799a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FillElement) {
            return this.f799a == ((FillElement) obj).f799a;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + (this.f799a.hashCode() * 31);
    }

    @Override // q2.z0
    public final o i() {
        w wVar = new w();
        wVar.f3661o = this.f799a;
        wVar.f3662p = 1.0f;
        return wVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        w wVar = (w) oVar;
        wVar.f3661o = this.f799a;
        wVar.f3662p = 1.0f;
    }
}
