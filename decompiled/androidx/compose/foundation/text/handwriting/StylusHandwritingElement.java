package androidx.compose.foundation.text.handwriting;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import kotlin.Metadata;
import q2.z0;
import r1.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;", "Lq2/z0;", "Lt0/a;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class StylusHandwritingElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9.a f874a;

    public StylusHandwritingElement(h9.a aVar) {
        this.f874a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StylusHandwritingElement) {
            return this.f874a == ((StylusHandwritingElement) obj).f874a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f874a.hashCode();
    }

    @Override // q2.z0
    public final o i() {
        return new t0.a(this.f874a);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((t0.a) oVar).f12722q = this.f874a;
    }
}
