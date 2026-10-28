package androidx.compose.ui.draw;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import v1.b;
import v1.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Lq2/z0;", "Lv1/b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class DrawWithCacheElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f926a;

    public DrawWithCacheElement(k kVar) {
        this.f926a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.f926a == ((DrawWithCacheElement) obj).f926a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f926a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        return new b(new c(), this.f926a);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        b bVar = (b) oVar;
        bVar.f13591q = this.f926a;
        bVar.A0();
    }
}
