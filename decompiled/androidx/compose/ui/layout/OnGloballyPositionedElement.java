package androidx.compose.ui.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import kotlin.Metadata;
import o2.r0;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Lq2/z0;", "Lo2/r0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class OnGloballyPositionedElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f958a;

    public OnGloballyPositionedElement(k kVar) {
        this.f958a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.f958a == ((OnGloballyPositionedElement) obj).f958a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f958a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        r0 r0Var = new r0();
        r0Var.f9418o = this.f958a;
        return r0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((r0) oVar).f9418o = this.f958a;
    }
}
