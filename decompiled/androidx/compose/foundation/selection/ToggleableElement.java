package androidx.compose.foundation.selection;

import b0.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.f;
import q2.z0;
import r1.o;
import y2.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Lq2/z0;", "Lj0/b;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class ToggleableElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h9.k f856e;

    public ToggleableElement(boolean z10, k kVar, boolean z11, g gVar, h9.k kVar2) {
        this.f852a = z10;
        this.f853b = kVar;
        this.f854c = z11;
        this.f855d = gVar;
        this.f856e = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f852a == toggleableElement.f852a && l.a(this.f853b, toggleableElement.f853b) && this.f854c == toggleableElement.f854c && this.f855d.equals(toggleableElement.f855d) && this.f856e == toggleableElement.f856e;
    }

    public final int hashCode() {
        int i7 = (this.f852a ? 1231 : 1237) * 31;
        k kVar = this.f853b;
        return this.f856e.hashCode() + ((((((((i7 + (kVar != null ? kVar.hashCode() : 0)) * 961) + 1237) * 31) + (this.f854c ? 1231 : 1237)) * 31) + this.f855d.f14983a) * 31);
    }

    @Override // q2.z0
    public final o i() {
        return new j0.b(this.f852a, this.f853b, this.f854c, this.f855d, this.f856e);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        j0.b bVar = (j0.b) oVar;
        boolean z10 = bVar.L;
        boolean z11 = this.f852a;
        if (z10 != z11) {
            bVar.L = z11;
            f.n(bVar);
        }
        bVar.M = this.f856e;
        bVar.M0(this.f853b, null, false, this.f854c, null, this.f855d, bVar.N);
    }
}
