package androidx.compose.ui.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import kotlin.Metadata;
import o2.b1;
import o2.q;
import q2.f;
import q2.h0;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierElement;", "Lq2/z0;", "Lo2/b1;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class RulerProviderModifierElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f960a;

    public RulerProviderModifierElement(q qVar) {
        this.f960a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        RulerProviderModifierElement rulerProviderModifierElement = obj instanceof RulerProviderModifierElement ? (RulerProviderModifierElement) obj : null;
        return (rulerProviderModifierElement != null ? rulerProviderModifierElement.f960a : null) == this.f960a;
    }

    public final int hashCode() {
        return this.f960a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        return new b1(this.f960a);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        b1 b1Var = (b1) oVar;
        q qVar = b1Var.f9300o;
        q qVar2 = this.f960a;
        if (qVar != qVar2) {
            b1Var.f9300o = qVar2;
            h0.V(f.v(b1Var), false, 7);
        }
    }
}
