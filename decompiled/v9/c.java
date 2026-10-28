package v9;

import aa.w0;
import gb.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nb.k0;
import nb.x0;
import t8.z;
import u8.p;
import u8.q;
import u8.w;
import u9.o;
import x9.d0;
import x9.n0;
import x9.s0;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends aa.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final wa.b f13687l = new wa.b(o.k, wa.e.e("Function"));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final wa.b f13688m = new wa.b(o.f13205i, wa.e.e("KFunction"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mb.k f13689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0 f13690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f13691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f13693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f13694j;
    public final List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mb.k kVar, kb.c cVar, k kVar2, int i7) {
        super(kVar, kVar2.a(i7));
        i9.l.e(cVar, "containingDeclaration");
        this.f13689e = kVar;
        this.f13690f = cVar;
        this.f13691g = kVar2;
        this.f13692h = i7;
        this.f13693i = new b(this);
        this.f13694j = new e(kVar, this);
        ArrayList arrayList = new ArrayList();
        n9.d dVar = new n9.d(1, i7, 1);
        ArrayList arrayList2 = new ArrayList(q.a0(dVar, 10));
        Iterator it = dVar.iterator();
        while (true) {
            n9.c cVar2 = (n9.c) it;
            if (!cVar2.f8970c) {
                break;
            }
            arrayList.add(w0.F0(this, x0.IN_VARIANCE, wa.e.e("P" + cVar2.nextInt()), arrayList.size(), this.f13689e));
            arrayList2.add(z.f12851a);
        }
        arrayList.add(w0.F0(this, x0.OUT_VARIANCE, wa.e.e("R"), arrayList.size(), this.f13689e));
        this.k = p.J0(arrayList);
        k kVar3 = this.f13691g;
        d.f13695a.getClass();
        i9.l.e(kVar3, "functionTypeKind");
        if (kVar3.equals(g.f13697c) || kVar3.equals(j.f13700c) || kVar3.equals(h.f13698c)) {
            return;
        }
        kVar3.equals(i.f13699c);
    }

    @Override // x9.e
    public final /* bridge */ /* synthetic */ Collection E() {
        return w.f13122a;
    }

    @Override // x9.w
    public final boolean G() {
        return false;
    }

    @Override // x9.i
    public final boolean H() {
        return false;
    }

    @Override // x9.e
    public final /* bridge */ /* synthetic */ aa.m P() {
        return null;
    }

    @Override // x9.e
    public final /* bridge */ /* synthetic */ gb.o Q() {
        return n.f6198b;
    }

    @Override // x9.e, x9.w, x9.n
    public final ga.o d() {
        ga.o oVar = x9.o.f14721e;
        i9.l.d(oVar, "PUBLIC");
        return oVar;
    }

    @Override // x9.e
    public final x9.f f() {
        return x9.f.f14702b;
    }

    @Override // x9.e
    public final boolean g() {
        return false;
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        return y9.g.f15129a;
    }

    @Override // x9.l
    public final n0 getSource() {
        return n0.f14716e0;
    }

    @Override // x9.e, x9.w
    public final x i() {
        return x.f14750e;
    }

    @Override // x9.e
    public final boolean j() {
        return false;
    }

    @Override // x9.k
    public final x9.k l() {
        return this.f13690f;
    }

    @Override // x9.e
    public final s0 o0() {
        return null;
    }

    @Override // aa.e0
    public final gb.o p0(ob.g gVar) {
        return this.f13694j;
    }

    @Override // x9.e, x9.i
    public final List q() {
        return this.k;
    }

    @Override // x9.w
    public final boolean s() {
        return false;
    }

    @Override // x9.h
    public final k0 t() {
        return this.f13693i;
    }

    public final String toString() {
        String strB = getName().b();
        i9.l.d(strB, "asString(...)");
        return strB;
    }

    @Override // x9.e
    public final boolean u() {
        return false;
    }

    @Override // x9.w
    public final boolean u0() {
        return false;
    }

    @Override // x9.e
    public final /* bridge */ /* synthetic */ Collection w() {
        return w.f13122a;
    }

    @Override // x9.e
    public final boolean z() {
        return false;
    }

    @Override // x9.e
    public final boolean z0() {
        return false;
    }
}
