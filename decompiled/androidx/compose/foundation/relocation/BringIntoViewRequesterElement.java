package androidx.compose.foundation.relocation;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i0.b;
import i0.c;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Lq2/z0;", "Li0/c;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class BringIntoViewRequesterElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f851a;

    public BringIntoViewRequesterElement(b bVar) {
        this.f851a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return l.a(this.f851a, ((BringIntoViewRequesterElement) obj).f851a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f851a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        c cVar = new c();
        cVar.f6577o = this.f851a;
        return cVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        c cVar = (c) oVar;
        b bVar = cVar.f6577o;
        if (bVar != null) {
            bVar.f6576a.k(cVar);
        }
        b bVar2 = this.f851a;
        if (bVar2 != null) {
            bVar2.f6576a.b(cVar);
        }
        cVar.f6577o = bVar2;
    }
}
