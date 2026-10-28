package androidx.compose.ui.draw;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.h1;
import q2.z0;
import r1.o;
import t8.u;
import y.f;
import y1.l0;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Lq2/z0;", "Ly1/l;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final /* data */ class ShadowGraphicsLayerElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f936d;

    public ShadowGraphicsLayerElement(l0 l0Var, boolean z10, long j5, long j10) {
        float f10 = f.f14858a;
        this.f933a = l0Var;
        this.f934b = z10;
        this.f935c = j5;
        this.f936d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        float f10 = f.f14861d;
        return n3.f.a(f10, f10) && l.a(this.f933a, shadowGraphicsLayerElement.f933a) && this.f934b == shadowGraphicsLayerElement.f934b && q.c(this.f935c, shadowGraphicsLayerElement.f935c) && q.c(this.f936d, shadowGraphicsLayerElement.f936d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f933a.hashCode() + (Float.floatToIntBits(f.f14861d) * 31)) * 31) + (this.f934b ? 1231 : 1237)) * 31;
        int i7 = q.f14959n;
        return u.a(this.f936d) + ob.a.k(iHashCode, 31, this.f935c);
    }

    @Override // q2.z0
    public final o i() {
        b2.a aVar = new b2.a(20, this);
        y1.l lVar = new y1.l();
        lVar.f14928o = aVar;
        return lVar;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        y1.l lVar = (y1.l) oVar;
        lVar.f14928o = new b2.a(20, this);
        h1 h1Var = q2.f.t(lVar, 2).f10693p;
        if (h1Var != null) {
            h1Var.d1(lVar.f14928o, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb2.append((Object) n3.f.b(f.f14861d));
        sb2.append(", shape=");
        sb2.append(this.f933a);
        sb2.append(", clip=");
        sb2.append(this.f934b);
        sb2.append(", ambientColor=");
        ob.a.x(this.f935c, sb2, ", spotColor=");
        sb2.append((Object) q.i(this.f936d));
        sb2.append(')');
        return sb2.toString();
    }
}
