package androidx.compose.foundation.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.h0;
import d0.i0;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Lq2/z0;", "Ld0/i0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class PaddingValuesElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f808a;

    public PaddingValuesElement(h0 h0Var) {
        this.f808a = h0Var;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return l.a(this.f808a, paddingValuesElement.f808a);
    }

    public final int hashCode() {
        return this.f808a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        i0 i0Var = new i0();
        i0Var.f3577o = this.f808a;
        return i0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((i0) oVar).f3577o = this.f808a;
    }
}
