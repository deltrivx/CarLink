package androidx.compose.foundation;

import b0.k;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import r1.o;
import x.c0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Lq2/z0;", "Lx/c0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class FocusableElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f760a;

    public FocusableElement(k kVar) {
        this.f760a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return l.a(this.f760a, ((FocusableElement) obj).f760a);
        }
        return false;
    }

    public final int hashCode() {
        k kVar = this.f760a;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }

    @Override // q2.z0
    public final o i() {
        return new c0(this.f760a, 1, null);
    }

    @Override // q2.z0
    public final void j(o oVar) {
        ((c0) oVar).F0(this.f760a);
    }
}
