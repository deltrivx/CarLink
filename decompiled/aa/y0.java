package aa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class y0 extends z0 implements x9.i0, x9.u0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nb.w f475j;
    public final y0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(x9.b bVar, y0 y0Var, int i7, y9.h hVar, wa.e eVar, nb.w wVar, boolean z10, boolean z11, boolean z12, nb.w wVar2, x9.n0 n0Var) {
        super(bVar, hVar, eVar, wVar, n0Var);
        i9.l.e(bVar, "containingDeclaration");
        i9.l.e(hVar, "annotations");
        i9.l.e(eVar, "name");
        i9.l.e(wVar, "outType");
        i9.l.e(n0Var, "source");
        this.f471f = i7;
        this.f472g = z10;
        this.f473h = z11;
        this.f474i = z12;
        this.f475j = wVar2;
        this.k = y0Var == null ? this : y0Var;
    }

    public y0 C0(v9.f fVar, wa.e eVar, int i7) {
        y9.h annotations = getAnnotations();
        i9.l.d(annotations, "<get-annotations>(...)");
        nb.w type = getType();
        i9.l.d(type, "getType(...)");
        return new y0(fVar, null, i7, annotations, eVar, type, D0(), this.f473h, this.f474i, this.f475j, x9.n0.f14716e0);
    }

    public final boolean D0() {
        return this.f472g && ((x9.c) l()).f() != 2;
    }

    @Override // aa.r, x9.k
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final x9.b l() {
        x9.k kVarL = super.l();
        i9.l.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (x9.b) kVarL;
    }

    @Override // aa.r, aa.q, x9.k, x9.b
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final y0 a() {
        y0 y0Var = this.k;
        return y0Var == this ? this : y0Var.a();
    }

    @Override // x9.k
    public final Object J(x9.m mVar, Object obj) {
        return mVar.A(this, obj);
    }

    @Override // x9.u0
    public final /* bridge */ /* synthetic */ bb.g T() {
        return null;
    }

    @Override // x9.n
    public final ga.o d() {
        ga.o oVar = x9.o.f14722f;
        i9.l.d(oVar, "LOCAL");
        return oVar;
    }

    @Override // x9.u0
    public final boolean d0() {
        return false;
    }

    @Override // x9.p0
    public final x9.l e(nb.r0 r0Var) {
        i9.l.e(r0Var, "substitutor");
        if (r0Var.f9029a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // x9.b
    public final Collection m() {
        Collection collectionM = l().m();
        i9.l.d(collectionM, "getOverriddenDescriptors(...)");
        Collection collection = collectionM;
        ArrayList arrayList = new ArrayList(u8.q.a0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((y0) ((x9.b) it.next()).X().get(this.f471f));
        }
        return arrayList;
    }
}
