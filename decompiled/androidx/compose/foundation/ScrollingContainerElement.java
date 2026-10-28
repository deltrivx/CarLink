package androidx.compose.foundation;

import b0.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import x.p1;
import z.h;
import z.n1;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "Lq2/z0;", "Lx/p1;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class ScrollingContainerElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x.h f773g;

    public ScrollingContainerElement(k kVar, x.h hVar, h hVar2, x0 x0Var, n1 n1Var, boolean z10, boolean z11) {
        this.f767a = n1Var;
        this.f768b = x0Var;
        this.f769c = z10;
        this.f770d = hVar2;
        this.f771e = kVar;
        this.f772f = z11;
        this.f773g = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return l.a(this.f767a, scrollingContainerElement.f767a) && this.f768b == scrollingContainerElement.f768b && this.f769c == scrollingContainerElement.f769c && l.a(this.f770d, scrollingContainerElement.f770d) && l.a(this.f771e, scrollingContainerElement.f771e) && this.f772f == scrollingContainerElement.f772f && l.a(this.f773g, scrollingContainerElement.f773g);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f768b.hashCode() + (this.f767a.hashCode() * 31)) * 31) + (this.f769c ? 1231 : 1237)) * 31) + 1237) * 31;
        h hVar = this.f770d;
        int iHashCode2 = (iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        k kVar = this.f771e;
        int iHashCode3 = (((iHashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 961) + (this.f772f ? 1231 : 1237)) * 31;
        x.h hVar2 = this.f773g;
        return iHashCode3 + (hVar2 != null ? hVar2.hashCode() : 0);
    }

    @Override // q2.z0
    public final o i() {
        p1 p1Var = new p1();
        p1Var.f14459q = this.f767a;
        p1Var.f14460r = this.f768b;
        p1Var.f14461s = this.f769c;
        p1Var.f14462t = this.f770d;
        p1Var.f14463u = this.f771e;
        p1Var.f14464v = this.f772f;
        p1Var.f14465w = this.f773g;
        return p1Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((p1) oVar).F0(this.f771e, this.f773g, this.f770d, this.f768b, this.f767a, this.f772f, this.f769c);
    }
}
