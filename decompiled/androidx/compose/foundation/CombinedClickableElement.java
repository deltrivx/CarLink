package androidx.compose.foundation;

import b0.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import k2.m0;
import kotlin.Metadata;
import q2.f;
import q2.z0;
import r1.o;
import x.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Lq2/z0;", "Lx/x;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class CombinedClickableElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h9.a f758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h9.a f759c;

    public CombinedClickableElement(k kVar, h9.a aVar, h9.a aVar2) {
        this.f757a = kVar;
        this.f758b = aVar;
        this.f759c = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return l.a(this.f757a, combinedClickableElement.f757a) && this.f758b == combinedClickableElement.f758b && this.f759c == combinedClickableElement.f759c;
    }

    public final int hashCode() {
        k kVar = this.f757a;
        int iHashCode = (this.f758b.hashCode() + ((((((kVar != null ? kVar.hashCode() : 0) * 961) + 1237) * 31) + 1231) * 29791)) * 961;
        h9.a aVar = this.f759c;
        return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 961) + 1231;
    }

    @Override // q2.z0
    public final o i() {
        return new x(this.f757a, this.f758b, this.f759c);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        m0 m0Var;
        x xVar = (x) oVar;
        xVar.L = true;
        boolean z10 = false;
        boolean z11 = xVar.K == null;
        h9.a aVar = this.f759c;
        if (z11 != (aVar == null)) {
            xVar.G0();
            f.n(xVar);
            z10 = true;
        }
        xVar.K = aVar;
        boolean z12 = xVar.f14354v ? z10 : true;
        xVar.M0(this.f757a, null, false, true, null, null, this.f758b);
        if (!z12 || (m0Var = xVar.f14358z) == null) {
            return;
        }
        m0Var.C0();
    }
}
