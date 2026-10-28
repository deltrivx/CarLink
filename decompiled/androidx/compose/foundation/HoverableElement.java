package androidx.compose.foundation;

import b0.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import x.k0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "Lq2/z0;", "Lx/k0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class HoverableElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f761a;

    public HoverableElement(k kVar) {
        this.f761a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && l.a(((HoverableElement) obj).f761a, this.f761a);
    }

    public final int hashCode() {
        return this.f761a.hashCode() * 31;
    }

    @Override // q2.z0
    public final o i() {
        k0 k0Var = new k0();
        k0Var.f14401o = this.f761a;
        return k0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        k0 k0Var = (k0) oVar;
        k kVar = k0Var.f14401o;
        k kVar2 = this.f761a;
        if (l.a(kVar, kVar2)) {
            return;
        }
        k0Var.C0();
        k0Var.f14401o = kVar2;
    }
}
