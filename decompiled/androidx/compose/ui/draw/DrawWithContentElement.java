package androidx.compose.ui.draw;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import v1.e;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithContentElement;", "Lq2/z0;", "Lv1/e;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class DrawWithContentElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f927a;

    public DrawWithContentElement(k kVar) {
        this.f927a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithContentElement) {
            return this.f927a == ((DrawWithContentElement) obj).f927a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f927a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        e eVar = new e();
        eVar.f13595o = this.f927a;
        return eVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((e) oVar).f13595o = this.f927a;
    }
}
