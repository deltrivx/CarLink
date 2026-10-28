package androidx.compose.foundation.lazy.layout;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h0.k;
import h0.n;
import h0.o;
import i9.l;
import kotlin.Metadata;
import q2.z0;
import z.x0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Lq2/z0;", "Lh0/n;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class LazyLayoutBeyondBoundsModifierElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f831c;

    public LazyLayoutBeyondBoundsModifierElement(o oVar, k kVar, x0 x0Var) {
        this.f829a = oVar;
        this.f830b = kVar;
        this.f831c = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return l.a(this.f829a, lazyLayoutBeyondBoundsModifierElement.f829a) && l.a(this.f830b, lazyLayoutBeyondBoundsModifierElement.f830b) && this.f831c == lazyLayoutBeyondBoundsModifierElement.f831c;
    }

    public final int hashCode() {
        return this.f831c.hashCode() + ((((this.f830b.hashCode() + (this.f829a.hashCode() * 31)) * 31) + 1237) * 31);
    }

    @Override // q2.z0
    public final r1.o i() {
        n nVar = new n();
        nVar.f6340o = this.f829a;
        nVar.f6341p = this.f830b;
        nVar.f6342q = this.f831c;
        return nVar;
    }

    @Override // q2.z0
    public final void j(r1.o oVar) {
        n nVar = (n) oVar;
        nVar.f6340o = this.f829a;
        nVar.f6341p = this.f830b;
        nVar.f6342q = this.f831c;
    }
}
