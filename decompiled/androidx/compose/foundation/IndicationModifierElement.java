package androidx.compose.foundation;

import b0.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import x.q0;
import x.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Lq2/z0;", "Lx/q0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class IndicationModifierElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f763b;

    public IndicationModifierElement(k kVar, r0 r0Var) {
        this.f762a = kVar;
        this.f763b = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return l.a(this.f762a, indicationModifierElement.f762a) && l.a(this.f763b, indicationModifierElement.f763b);
    }

    public final int hashCode() {
        return this.f763b.hashCode() + (this.f762a.hashCode() * 31);
    }

    @Override // q2.z0
    public final o i() {
        q2.l lVarA = this.f763b.a(this.f762a);
        q0 q0Var = new q0();
        q0Var.f14471q = lVarA;
        q0Var.A0(lVarA);
        return q0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        q0 q0Var = (q0) oVar;
        q2.l lVarA = this.f763b.a(this.f762a);
        q0Var.B0(q0Var.f14471q);
        q0Var.f14471q = lVarA;
        q0Var.A0(lVarA);
    }
}
