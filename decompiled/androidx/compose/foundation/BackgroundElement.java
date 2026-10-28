package androidx.compose.foundation;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.f;
import q2.z0;
import r1.o;
import t8.u;
import y1.l0;
import y1.m;
import y1.q;
import y1.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Lq2/z0;", "Lx/l;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final class BackgroundElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f747d;

    public BackgroundElement(long j5, z zVar, l0 l0Var, int i7) {
        j5 = (i7 & 1) != 0 ? q.f14958m : j5;
        zVar = (i7 & 2) != 0 ? null : zVar;
        this.f744a = j5;
        this.f745b = zVar;
        this.f746c = 1.0f;
        this.f747d = l0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && q.c(this.f744a, backgroundElement.f744a) && l.a(this.f745b, backgroundElement.f745b) && this.f746c == backgroundElement.f746c && l.a(this.f747d, backgroundElement.f747d);
    }

    public final int hashCode() {
        int i7 = q.f14959n;
        int iA = u.a(this.f744a) * 31;
        m mVar = this.f745b;
        return this.f747d.hashCode() + ob.a.j(this.f746c, (iA + (mVar != null ? mVar.hashCode() : 0)) * 31, 31);
    }

    @Override // q2.z0
    public final o i() {
        x.l lVar = new x.l();
        lVar.f14405o = this.f744a;
        lVar.f14406p = this.f745b;
        lVar.f14407q = this.f746c;
        lVar.f14408r = this.f747d;
        lVar.f14409s = 9205357640488583168L;
        return lVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        x.l lVar = (x.l) oVar;
        lVar.f14405o = this.f744a;
        lVar.f14406p = this.f745b;
        lVar.f14407q = this.f746c;
        lVar.f14408r = this.f747d;
        f.l(lVar);
    }
}
