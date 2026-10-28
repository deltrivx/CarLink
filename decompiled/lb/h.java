package lb;

import aa.f0;
import cc.d1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nb.a0;
import ra.c0;
import ra.f1;
import ra.g1;
import ra.y0;
import x9.k0;
import x9.m0;
import x9.n0;
import x9.o0;
import x9.s0;
import x9.x;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends aa.c implements x9.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ra.k f8315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ta.a f8316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f8317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wa.b f8318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f8319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ga.o f8320j;
    public final x9.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jb.k f8321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gb.p f8322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ka.h f8323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m0 f8324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final da.a f8325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x9.k f8326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mb.h f8327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mb.i f8328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mb.i f8329t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final mb.h f8330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final jb.u f8331v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y9.h f8332w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public h(jb.k kVar, ra.k kVar2, ta.f fVar, ta.a aVar, n0 n0Var) {
        x9.f fVar2;
        ta.g gVar;
        gb.p sVar;
        super(kVar.f7043a.f7018a, i2.c.D(fVar, kVar2.f12040e).f());
        i9.l.e(kVar, "outerContext");
        i9.l.e(kVar2, "classProto");
        i9.l.e(fVar, "nameResolver");
        i9.l.e(n0Var, "sourceElement");
        this.f8315e = kVar2;
        this.f8316f = aVar;
        this.f8317g = n0Var;
        this.f8318h = i2.c.D(fVar, kVar2.f12040e);
        this.f8319i = jb.j.e((c0) ta.d.f12864e.i(kVar2.f12039d));
        this.f8320j = k9.a.r((g1) ta.d.f12863d.i(kVar2.f12039d));
        ra.j jVar = (ra.j) ta.d.f12865f.i(kVar2.f12039d);
        int i7 = jVar == null ? -1 : jb.x.f7088b[jVar.ordinal()];
        x9.f fVar3 = x9.f.f14703c;
        x9.f fVar4 = x9.f.f14701a;
        switch (i7) {
            case 1:
            default:
                fVar2 = fVar4;
                break;
            case 2:
                fVar4 = x9.f.f14702b;
                fVar2 = fVar4;
                break;
            case 3:
                fVar2 = fVar3;
                break;
            case 4:
                fVar4 = x9.f.f14704d;
                fVar2 = fVar4;
                break;
            case 5:
                fVar4 = x9.f.f14705e;
                fVar2 = fVar4;
                break;
            case 6:
            case 7:
                fVar4 = x9.f.f14706f;
                fVar2 = fVar4;
                break;
        }
        this.k = fVar2;
        List list = kVar2.f12042g;
        i9.l.d(list, "getTypeParameterList(...)");
        y0 y0Var = kVar2.E;
        i9.l.d(y0Var, "getTypeTable(...)");
        f0 f0Var = new f0(y0Var);
        f1 f1Var = kVar2.G;
        i9.l.d(f1Var, "getVersionRequirementTable(...)");
        if (f1Var.f11942b.size() == 0) {
            gVar = ta.g.f12888a;
        } else {
            i9.l.d(f1Var.f11942b, "getRequirementList(...)");
            gVar = new ta.g();
        }
        jb.k kVarA = kVar.a(this, list, fVar, f0Var, gVar, aVar);
        jb.i iVar = kVarA.f7043a;
        this.f8321l = kVarA;
        boolean zBooleanValue = ta.d.f12871m.i(kVar2.f12039d).booleanValue();
        if (fVar2 == fVar3) {
            sVar = new gb.s(iVar.f7018a, this, zBooleanValue || i9.l.a(iVar.f7035s.c(), Boolean.TRUE));
        } else {
            sVar = gb.n.f6198b;
        }
        this.f8322m = sVar;
        this.f8323n = new ka.h(this);
        o0 o0Var = m0.f14711d;
        mb.k kVar3 = iVar.f7018a;
        mb.k kVar4 = iVar.f7018a;
        ((ob.m) iVar.f7033q).getClass();
        d1 d1Var = new d1(1, this, g.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0, 0, 4);
        o0Var.getClass();
        i9.l.e(kVar3, "storageManager");
        this.f8324o = new m0(this, kVar3, d1Var);
        this.f8325p = fVar2 == fVar3 ? new da.a(this) : null;
        x9.k kVar5 = kVar.f7045c;
        this.f8326q = kVar5;
        d dVar = new d(this, 0);
        kVar4.getClass();
        this.f8327r = new mb.h(kVar4, dVar);
        this.f8328s = new mb.i(kVar4, new d(this, 1));
        new mb.h(kVar4, new d(this, 2));
        this.f8329t = new mb.i(kVar4, new d(this, 3));
        this.f8330u = new mb.h(kVar4, new d(this, 4));
        ta.f fVar5 = kVarA.f7044b;
        f0 f0Var2 = kVarA.f7046d;
        h hVar = kVar5 instanceof h ? (h) kVar5 : null;
        this.f8331v = new jb.u(kVar2, fVar5, f0Var2, n0Var, hVar != null ? hVar.f8331v : null);
        this.f8332w = !ta.d.f12862c.i(kVar2.f12039d).booleanValue() ? y9.g.f15129a : new u(kVar4, new d(this, 5));
    }

    public final g B0() {
        ((ob.m) this.f8321l.f7043a.f7033q).getClass();
        m0 m0Var = this.f8324o;
        db.e.j(m0Var.f14713a);
        return (g) ((gb.o) k9.a.z(m0Var.f14715c, m0.f14712e[0]));
    }

    public final a0 C0(wa.e eVar) {
        Iterator it = B0().b(eVar, fa.b.f5508g).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((k0) next).e0() == null) {
                if (!z10) {
                    z10 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        k0 k0Var = (k0) obj;
        return (a0) (k0Var != null ? k0Var.getType() : null);
    }

    @Override // x9.e
    public final Collection E() {
        return (Collection) this.f8329t.invoke();
    }

    @Override // x9.w
    public final boolean G() {
        return ta.d.f12869j.i(this.f8315e.f12039d).booleanValue();
    }

    @Override // x9.i
    public final boolean H() {
        return ta.d.f12866g.i(this.f8315e.f12039d).booleanValue();
    }

    @Override // x9.e
    public final aa.m P() {
        return (aa.m) this.f8327r.invoke();
    }

    @Override // x9.e
    public final gb.o Q() {
        return this.f8322m;
    }

    @Override // x9.e, x9.w, x9.n
    public final ga.o d() {
        return this.f8320j;
    }

    @Override // x9.e
    public final x9.f f() {
        return this.k;
    }

    @Override // x9.e
    public final boolean g() {
        if (!ta.d.k.i(this.f8315e.f12039d).booleanValue()) {
            return false;
        }
        ta.a aVar = this.f8316f;
        int i7 = aVar.f12855b;
        if (i7 >= 1) {
            if (i7 > 1) {
                return false;
            }
            int i10 = aVar.f12856c;
            if (i10 >= 4 && (i10 > 4 || aVar.f12857d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // y9.a
    public final y9.h getAnnotations() {
        return this.f8332w;
    }

    @Override // x9.l
    public final n0 getSource() {
        return this.f8317g;
    }

    @Override // x9.e, x9.w
    public final x i() {
        return this.f8319i;
    }

    @Override // x9.e
    public final boolean j() {
        return ta.d.k.i(this.f8315e.f12039d).booleanValue() && this.f8316f.a(1, 4, 2);
    }

    @Override // x9.k
    public final x9.k l() {
        return this.f8326q;
    }

    @Override // x9.e
    public final s0 o0() {
        return (s0) this.f8330u.invoke();
    }

    @Override // aa.e0
    public final gb.o p0(ob.g gVar) {
        m0 m0Var = this.f8324o;
        db.e.j(m0Var.f14713a);
        return (gb.o) k9.a.z(m0Var.f14715c, m0.f14712e[0]);
    }

    @Override // x9.e, x9.i
    public final List q() {
        return this.f8321l.f7050h.c();
    }

    @Override // x9.w
    public final boolean s() {
        return ta.d.f12868i.i(this.f8315e.f12039d).booleanValue();
    }

    @Override // x9.h
    public final nb.k0 t() {
        return this.f8323n;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("deserialized ");
        sb2.append(G() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // x9.e
    public final boolean u() {
        return ta.d.f12865f.i(this.f8315e.f12039d) == ra.j.COMPANION_OBJECT;
    }

    @Override // x9.w
    public final boolean u0() {
        return false;
    }

    @Override // x9.e
    public final Collection w() {
        return (Collection) this.f8328s.invoke();
    }

    @Override // aa.c, x9.e
    public final List x0() {
        jb.k kVar = this.f8321l;
        f0 f0Var = kVar.f7046d;
        ra.k kVar2 = this.f8315e;
        i9.l.e(kVar2, "<this>");
        List list = kVar2.f12047m;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = kVar2.f12048n;
            i9.l.d(list2, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList = new ArrayList(u8.q.a0(list2, 10));
            for (Integer num : list2) {
                i9.l.b(num);
                arrayList.add(f0Var.a(num.intValue()));
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new aa.a0(A0(), new hb.a(this, kVar.f7050h.l((ra.s0) it.next()), (wa.e) null), y9.g.f15129a));
        }
        return arrayList2;
    }

    @Override // x9.e
    public final boolean z() {
        return ta.d.f12870l.i(this.f8315e.f12039d).booleanValue();
    }

    @Override // x9.e
    public final boolean z0() {
        return ta.d.f12867h.i(this.f8315e.f12039d).booleanValue();
    }
}
