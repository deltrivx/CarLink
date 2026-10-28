package androidx.compose.foundation.selection;

import b0.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import j0.c;
import kotlin.Metadata;
import q2.f;
import q2.z0;
import r1.o;
import x.r0;
import y2.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "Lq2/z0;", "Lj0/c;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class TriStateToggleableElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3.a f857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h9.a f862f;

    public TriStateToggleableElement(a3.a aVar, k kVar, r0 r0Var, boolean z10, g gVar, h9.a aVar2) {
        this.f857a = aVar;
        this.f858b = kVar;
        this.f859c = r0Var;
        this.f860d = z10;
        this.f861e = gVar;
        this.f862f = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f857a == triStateToggleableElement.f857a && l.a(this.f858b, triStateToggleableElement.f858b) && l.a(this.f859c, triStateToggleableElement.f859c) && this.f860d == triStateToggleableElement.f860d && this.f861e.equals(triStateToggleableElement.f861e) && this.f862f == triStateToggleableElement.f862f;
    }

    public final int hashCode() {
        int iHashCode = this.f857a.hashCode() * 31;
        k kVar = this.f858b;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        r0 r0Var = this.f859c;
        return this.f862f.hashCode() + ((((((((iHashCode2 + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + 1237) * 31) + (this.f860d ? 1231 : 1237)) * 31) + this.f861e.f14983a) * 31);
    }

    @Override // q2.z0
    public final o i() {
        c cVar = new c(this.f858b, this.f859c, false, this.f860d, null, this.f861e, this.f862f);
        cVar.L = this.f857a;
        return cVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        c cVar = (c) oVar;
        a3.a aVar = cVar.L;
        a3.a aVar2 = this.f857a;
        if (aVar != aVar2) {
            cVar.L = aVar2;
            f.n(cVar);
        }
        cVar.M0(this.f858b, this.f859c, false, this.f860d, null, this.f861e, this.f862f);
    }
}
