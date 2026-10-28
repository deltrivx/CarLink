package androidx.compose.foundation.text.contextmenu.modifier;

import c8.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.n;
import kotlin.Metadata;
import q2.z0;
import r0.b;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;", "Lq2/z0;", "Lr0/b;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class AddTextContextMenuDataComponentsWithContextElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f868a;

    public AddTextContextMenuDataComponentsWithContextElement(n nVar) {
        this.f868a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddTextContextMenuDataComponentsWithContextElement) {
            return this.f868a == ((AddTextContextMenuDataComponentsWithContextElement) obj).f868a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f868a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        b bVar = new b();
        bVar.f11076q = this.f868a;
        k kVar = new k(27, bVar);
        r0.a aVar = new r0.a();
        aVar.f11075o = kVar;
        bVar.A0(aVar);
        return bVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((b) oVar).f11076q = this.f868a;
    }
}
