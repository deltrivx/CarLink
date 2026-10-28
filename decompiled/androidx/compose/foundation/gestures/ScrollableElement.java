package androidx.compose.foundation.gestures;

import b0.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import z.m1;
import z.n1;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "Lq2/z0;", "Lz/m1;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class ScrollableElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f792e;

    public ScrollableElement(n1 n1Var, x0 x0Var, boolean z10, boolean z11, k kVar) {
        this.f788a = n1Var;
        this.f789b = x0Var;
        this.f790c = z10;
        this.f791d = z11;
        this.f792e = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return l.a(this.f788a, scrollableElement.f788a) && this.f789b == scrollableElement.f789b && this.f790c == scrollableElement.f790c && this.f791d == scrollableElement.f791d && l.a(this.f792e, scrollableElement.f792e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f789b.hashCode() + (this.f788a.hashCode() * 31)) * 961) + (this.f790c ? 1231 : 1237)) * 31) + (this.f791d ? 1231 : 1237)) * 961;
        k kVar = this.f792e;
        return (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
    }

    @Override // q2.z0
    public final o i() {
        return new m1(this.f792e, null, null, this.f789b, this.f788a, this.f790c, this.f791d);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((m1) oVar).M0(this.f792e, null, null, this.f789b, this.f788a, this.f790c, this.f791d);
    }
}
