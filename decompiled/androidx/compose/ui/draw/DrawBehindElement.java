package androidx.compose.ui.draw;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import v1.d;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Lq2/z0;", "Lv1/d;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class DrawBehindElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f925a;

    public DrawBehindElement(k kVar) {
        this.f925a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.f925a == ((DrawBehindElement) obj).f925a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f925a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        d dVar = new d();
        dVar.f13594o = this.f925a;
        return dVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((d) oVar).f13594o = this.f925a;
    }
}
