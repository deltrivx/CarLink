package androidx.compose.ui.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import kotlin.Metadata;
import o2.s0;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Lq2/z0;", "Lo2/s0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class OnSizeChangedModifier extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f959a;

    public OnSizeChangedModifier(k kVar) {
        this.f959a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f959a == ((OnSizeChangedModifier) obj).f959a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f959a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        s0 s0Var = new s0();
        s0Var.f9422o = this.f959a;
        long j5 = Integer.MIN_VALUE;
        s0Var.f9423p = (j5 & 4294967295L) | (j5 << 32);
        return s0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        s0 s0Var = (s0) oVar;
        s0Var.f9422o = this.f959a;
        long j5 = Integer.MIN_VALUE;
        s0Var.f9423p = (j5 & 4294967295L) | (j5 << 32);
    }
}
