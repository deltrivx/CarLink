package androidx.compose.ui.focus;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import w1.o;
import w1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Lq2/z0;", "Lw1/q;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final /* data */ class FocusRequesterElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f939a;

    public FocusRequesterElement(o oVar) {
        this.f939a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && l.a(this.f939a, ((FocusRequesterElement) obj).f939a);
    }

    public final int hashCode() {
        return this.f939a.hashCode();
    }

    @Override // q2.z0
    public final r1.o i() {
        q qVar = new q();
        qVar.f14068o = this.f939a;
        return qVar;
    }

    @Override // q2.z0
    public final void j(r1.o oVar) {
        q qVar = (q) oVar;
        qVar.f14068o.f14067a.k(qVar);
        o oVar2 = this.f939a;
        qVar.f14068o = oVar2;
        oVar2.f14067a.b(qVar);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f939a + ')';
    }
}
