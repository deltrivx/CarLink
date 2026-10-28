package androidx.compose.ui.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.o;
import kotlin.Metadata;
import o2.z;
import q2.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Lq2/z0;", "Lo2/z;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class LayoutElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f956a;

    public LayoutElement(o oVar) {
        this.f956a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.f956a == ((LayoutElement) obj).f956a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f956a.hashCode();
    }

    @Override // q2.z0
    public final r1.o i() {
        z zVar = new z();
        zVar.f9448o = this.f956a;
        return zVar;
    }

    @Override // q2.z0
    public final void j(r1.o oVar) {
        ((z) oVar).f9448o = this.f956a;
    }
}
