package androidx.compose.foundation;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import x.l1;
import x.o1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Lq2/z0;", "Lx/l1;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class ScrollingLayoutElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f775b;

    public ScrollingLayoutElement(o1 o1Var, boolean z10) {
        this.f774a = o1Var;
        this.f775b = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return l.a(this.f774a, scrollingLayoutElement.f774a) && this.f775b == scrollingLayoutElement.f775b;
    }

    public final int hashCode() {
        return (((this.f774a.hashCode() * 31) + 1237) * 31) + (this.f775b ? 1231 : 1237);
    }

    @Override // q2.z0
    public final o i() {
        l1 l1Var = new l1();
        l1Var.f14422o = this.f774a;
        l1Var.f14423p = this.f775b;
        return l1Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        l1 l1Var = (l1) oVar;
        l1Var.f14422o = this.f774a;
        l1Var.f14423p = this.f775b;
    }
}
