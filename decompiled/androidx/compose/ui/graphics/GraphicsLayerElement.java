package androidx.compose.ui.graphics;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.l;
import kotlin.Metadata;
import q2.f;
import q2.h1;
import q2.z0;
import r1.o;
import t8.u;
import y1.h0;
import y1.l0;
import y1.m0;
import y1.p0;
import y1.q;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Lq2/z0;", "Ly1/m0;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
final /* data */ class GraphicsLayerElement extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f948h;

    public GraphicsLayerElement(float f10, float f11, float f12, long j5, l0 l0Var, boolean z10, long j10, long j11) {
        this.f941a = f10;
        this.f942b = f11;
        this.f943c = f12;
        this.f944d = j5;
        this.f945e = l0Var;
        this.f946f = z10;
        this.f947g = j10;
        this.f948h = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GraphicsLayerElement) {
            GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
            if (Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f941a, graphicsLayerElement.f941a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f942b, graphicsLayerElement.f942b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f943c, graphicsLayerElement.f943c) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                long j5 = graphicsLayerElement.f944d;
                int i7 = p0.f14947b;
                if (this.f944d == j5 && l.a(this.f945e, graphicsLayerElement.f945e) && this.f946f == graphicsLayerElement.f946f && q.c(this.f947g, graphicsLayerElement.f947g) && q.c(this.f948h, graphicsLayerElement.f948h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ = ob.a.j(8.0f, ob.a.j(this.f943c, ob.a.j(0.0f, ob.a.j(0.0f, ob.a.j(this.f942b, ob.a.j(0.0f, ob.a.j(0.0f, ob.a.j(this.f941a, ob.a.j(1.0f, Float.floatToIntBits(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i7 = p0.f14947b;
        long j5 = this.f944d;
        int iHashCode = (((this.f945e.hashCode() + ((iJ + ((int) (j5 ^ (j5 >>> 32)))) * 31)) * 31) + (this.f946f ? 1231 : 1237)) * 961;
        int i10 = q.f14959n;
        return (((u.a(this.f948h) + ob.a.k(iHashCode, 31, this.f947g)) * 961) + 3) * 31;
    }

    @Override // q2.z0
    public final o i() {
        m0 m0Var = new m0();
        m0Var.f14929o = 1.0f;
        m0Var.f14930p = 1.0f;
        m0Var.f14931q = this.f941a;
        m0Var.f14932r = this.f942b;
        m0Var.f14933s = this.f943c;
        m0Var.f14934t = 8.0f;
        m0Var.f14935u = this.f944d;
        m0Var.f14936v = this.f945e;
        m0Var.f14937w = this.f946f;
        m0Var.f14938x = this.f947g;
        m0Var.f14939y = this.f948h;
        m0Var.f14940z = 3;
        m0Var.A = new b2.a(22, m0Var);
        return m0Var;
    }

    @Override // q2.z0
    public final void j(o oVar) {
        m0 m0Var = (m0) oVar;
        m0Var.f14929o = 1.0f;
        m0Var.f14930p = 1.0f;
        m0Var.f14931q = this.f941a;
        m0Var.f14932r = this.f942b;
        m0Var.f14933s = this.f943c;
        m0Var.f14934t = 8.0f;
        m0Var.f14935u = this.f944d;
        m0Var.f14936v = this.f945e;
        m0Var.f14937w = this.f946f;
        m0Var.f14938x = this.f947g;
        m0Var.f14939y = this.f948h;
        m0Var.f14940z = 3;
        h1 h1Var = f.t(m0Var, 2).f10693p;
        if (h1Var != null) {
            h1Var.d1(m0Var.A, true);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb2.append(this.f941a);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f942b);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.f943c);
        sb2.append(", cameraDistance=8.0, transformOrigin=");
        int i7 = p0.f14947b;
        sb2.append((Object) ("TransformOrigin(packedValue=" + this.f944d + ')'));
        sb2.append(", shape=");
        sb2.append(this.f945e);
        sb2.append(", clip=");
        sb2.append(this.f946f);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        ob.a.x(this.f947g, sb2, ", spotShadowColor=");
        sb2.append((Object) q.i(this.f948h));
        sb2.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) h0.H(3));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }
}
