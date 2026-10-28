package y1;

import c1.a1;
import o2.v0;
import q2.y1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends r1.o implements q2.x, y1 {
    public b2.a A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f14929o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f14930p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f14931q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14932r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14933s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f14934t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f14935u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l0 f14936v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f14938x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f14939y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f14940z;

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
    }

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        v0 v0VarU = l0Var.u(j5);
        return o0Var.i(v0VarU.f9435a, v0VarU.f9436b, u8.x.f13123a, new a1(16, v0VarU, this));
    }

    @Override // q2.x
    public final /* synthetic */ int c(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.f(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int d(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.e(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int e(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.c(this, p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final /* synthetic */ int f(q2.p0 p0Var, o2.l0 l0Var, int i7) {
        return ob.a.d(this, p0Var, l0Var, i7);
    }

    @Override // q2.y1
    public final boolean h() {
        return false;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // r1.o
    public final boolean n0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f14929o);
        sb2.append(", scaleY=");
        sb2.append(this.f14930p);
        sb2.append(", alpha = ");
        sb2.append(this.f14931q);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.f14932r);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.f14933s);
        sb2.append(", cameraDistance=");
        sb2.append(this.f14934t);
        sb2.append(", transformOrigin=");
        long j5 = this.f14935u;
        int i7 = p0.f14947b;
        sb2.append((Object) ("TransformOrigin(packedValue=" + j5 + ')'));
        sb2.append(", shape=");
        sb2.append(this.f14936v);
        sb2.append(", clip=");
        sb2.append(this.f14937w);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        ob.a.x(this.f14938x, sb2, ", spotShadowColor=");
        ob.a.x(this.f14939y, sb2, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb2.append((Object) h0.H(this.f14940z));
        sb2.append(", colorFilter=null)");
        return sb2.toString();
    }
}
