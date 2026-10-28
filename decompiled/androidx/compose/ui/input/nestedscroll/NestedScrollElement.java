package androidx.compose.ui.input.nestedscroll;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import j2.d;
import j2.g;
import kotlin.Metadata;
import q2.z0;
import q3.j;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Lq2/z0;", "Lj2/g;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class NestedScrollElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f951a;

    public NestedScrollElement(d dVar) {
        this.f951a = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        Object obj2 = j.f10920a;
        return obj2.equals(obj2) && nestedScrollElement.f951a.equals(this.f951a);
    }

    public final int hashCode() {
        return this.f951a.hashCode() + (j.f10920a.hashCode() * 31);
    }

    @Override // q2.z0
    public final o i() {
        return new g(j.f10920a, this.f951a);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        g gVar = (g) oVar;
        gVar.f6914o = j.f10920a;
        d dVar = gVar.f6915p;
        if (dVar.f6901a == gVar) {
            dVar.f6901a = null;
        }
        d dVar2 = this.f951a;
        if (!dVar2.equals(dVar)) {
            gVar.f6915p = dVar2;
        }
        if (gVar.f11129n) {
            d dVar3 = gVar.f6915p;
            dVar3.f6901a = gVar;
            dVar3.f6902b = null;
            gVar.f6916q = null;
            dVar3.f6903c = new b1.a(8, gVar);
            dVar3.f6904d = gVar.m0();
        }
    }
}
