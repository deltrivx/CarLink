package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.k;
import kotlin.Metadata;
import q2.z0;
import r1.d;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Lq2/z0;", "Ld0/k;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class BoxChildDataElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f798a;

    public BoxChildDataElement(d dVar) {
        this.f798a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.f798a.equals(boxChildDataElement.f798a);
    }

    public final int hashCode() {
        return (this.f798a.hashCode() * 31) + 1237;
    }

    @Override // q2.z0
    public final o i() {
        k kVar = new k();
        kVar.f3579o = this.f798a;
        return kVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((k) oVar).f3579o = this.f798a;
    }
}
