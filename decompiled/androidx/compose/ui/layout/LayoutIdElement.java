package androidx.compose.ui.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import o2.x;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Lq2/z0;", "Lo2/x;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final /* data */ class LayoutIdElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f957a;

    public LayoutIdElement(Object obj) {
        this.f957a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && l.a(this.f957a, ((LayoutIdElement) obj).f957a);
    }

    public final int hashCode() {
        return this.f957a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        x xVar = new x();
        xVar.f9443o = this.f957a;
        return xVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((x) oVar).f9443o = this.f957a;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f957a + ')';
    }
}
