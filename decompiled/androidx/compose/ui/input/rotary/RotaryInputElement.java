package androidx.compose.ui.input.rotary;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import r2.n;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Lq2/z0;", "Lm2/a;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class RotaryInputElement extends z0 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RotaryInputElement);
    }

    public final int hashCode() {
        return n.f11338d.hashCode() * 31;
    }

    @Override // q2.z0
    public final o i() {
        n nVar = n.f11338d;
        m2.a aVar = new m2.a();
        aVar.f8400o = nVar;
        return aVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((m2.a) oVar).f8400o = n.f11338d;
    }
}
