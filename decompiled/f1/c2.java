package f1;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends v {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final fc.h0 f4901y = fc.y.b(l1.b.f7967d);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final AtomicReference f4902z = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f4903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public cc.a1 f4905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f4906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f4907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s.i0 f4909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1.e f4910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f4912j;
    public final s.h0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u0.k f4913l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s.h0 f4914m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s.h0 f4915n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f4916o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedHashSet f4917p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public cc.l f4918q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2.d f4919r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4920s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fc.h0 f4921t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a2.b f4922u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final cc.c1 f4923v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y8.h f4924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w0 f4925x;

    public c2(y8.h hVar) {
        f fVar = new f(new a5.e(4, this));
        this.f4903a = fVar;
        this.f4904b = new Object();
        this.f4907e = new ArrayList();
        this.f4909g = new s.i0();
        this.f4910h = new h1.e(new y[16]);
        this.f4911i = new ArrayList();
        this.f4912j = new ArrayList();
        this.k = new s.h0();
        this.f4913l = new u0.k(5);
        this.f4914m = new s.h0();
        this.f4915n = new s.h0();
        this.f4921t = fc.y.b(x1.f5199c);
        this.f4922u = new a2.b(17);
        cc.c1 c1Var = new cc.c1((cc.a1) hVar.l(cc.v.f2678b));
        c1Var.t(new c8.k(6, this));
        this.f4923v = c1Var;
        this.f4924w = hVar.s(fVar).s(c1Var);
        this.f4925x = new w0(8);
    }

    public static final void H(ArrayList arrayList, c2 c2Var, y yVar) {
        arrayList.clear();
        synchronized (c2Var.f4904b) {
            Iterator it = c2Var.f4912j.iterator();
            if (it.hasNext()) {
                ((a1) it.next()).getClass();
                throw null;
            }
        }
    }

    public static final Object u(c2 c2Var, b2 b2Var) {
        cc.l lVar;
        if (c2Var.D()) {
            return t8.z.f12851a;
        }
        cc.l lVar2 = new cc.l(1, n4.h.L(b2Var));
        lVar2.p();
        synchronized (c2Var.f4904b) {
            if (c2Var.D()) {
                lVar = lVar2;
            } else {
                c2Var.f4918q = lVar2;
                lVar = null;
            }
        }
        if (lVar != null) {
            lVar.resumeWith(t8.z.f12851a);
        }
        Object objO = lVar2.o();
        return objO == z8.a.f15774a ? objO : t8.z.f12851a;
    }

    public static final void v(c2 c2Var) {
        int i7;
        s.d0 d0Var;
        synchronized (c2Var.f4904b) {
            try {
                if (c2Var.k.j()) {
                    s.d0 d0VarB = h1.a.b(c2Var.k);
                    c2Var.k.a();
                    u0.k kVar = c2Var.f4913l;
                    ((s.h0) kVar.f12990b).a();
                    ((s.h0) kVar.f12991c).a();
                    c2Var.f4915n.a();
                    d0Var = new s.d0(d0VarB.f12408b);
                    Object[] objArr = d0VarB.f12407a;
                    int i10 = d0VarB.f12408b;
                    for (int i11 = 0; i11 < i10; i11++) {
                        a1 a1Var = (a1) objArr[i11];
                        d0Var.a(new t8.j(a1Var, c2Var.f4914m.g(a1Var)));
                    }
                    c2Var.f4914m.a();
                } else {
                    d0Var = s.m0.f12472b;
                    i9.l.c(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = d0Var.f12407a;
        int i12 = d0Var.f12408b;
        for (i7 = 0; i7 < i12; i7++) {
            t8.j jVar = (t8.j) objArr2[i7];
        }
    }

    public static final boolean w(c2 c2Var) {
        boolean zC;
        synchronized (c2Var.f4904b) {
            zC = c2Var.C();
        }
        return zC;
    }

    public static final List x(c2 c2Var) {
        List listE;
        synchronized (c2Var.f4904b) {
            listE = c2Var.E();
        }
        return listE;
    }

    public static final void y(c2 c2Var, cc.a1 a1Var) {
        synchronized (c2Var.f4904b) {
            Throwable th = c2Var.f4906d;
            if (th != null) {
                throw th;
            }
            if (((x1) c2Var.f4921t.getValue()).compareTo(x1.f5198b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (c2Var.f4905c != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            c2Var.f4905c = a1Var;
            c2Var.B();
        }
    }

    public static void z(p1.b bVar) {
        try {
            if (bVar.w() instanceof p1.g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            bVar.c();
        } catch (Throwable th) {
            bVar.c();
            throw th;
        }
    }

    public final void A() {
        synchronized (this.f4904b) {
            if (((x1) this.f4921t.getValue()).compareTo(x1.f5201e) >= 0) {
                fc.h0 h0Var = this.f4921t;
                x1 x1Var = x1.f5198b;
                h0Var.getClass();
                h0Var.j(null, x1Var);
            }
        }
        this.f4923v.a(null);
    }

    public final cc.j B() {
        fc.h0 h0Var = this.f4921t;
        int iCompareTo = ((x1) h0Var.getValue()).compareTo(x1.f5198b);
        ArrayList arrayList = this.f4912j;
        ArrayList arrayList2 = this.f4911i;
        h1.e eVar = this.f4910h;
        if (iCompareTo <= 0) {
            for (y yVar : E()) {
            }
            this.f4907e.clear();
            this.f4908f = u8.w.f13122a;
            this.f4909g = new s.i0();
            eVar.h();
            arrayList2.clear();
            arrayList.clear();
            this.f4916o = null;
            cc.l lVar = this.f4918q;
            if (lVar != null) {
                lVar.w(null);
            }
            this.f4918q = null;
            this.f4919r = null;
            return null;
        }
        a2.d dVar = this.f4919r;
        x1 x1Var = x1.f5202f;
        x1 x1Var2 = x1.f5199c;
        if (dVar == null) {
            if (this.f4905c == null) {
                this.f4909g = new s.i0();
                eVar.h();
                if (C()) {
                    x1Var2 = x1.f5200d;
                }
            } else {
                x1Var2 = (eVar.f6423c == 0 && !this.f4909g.h() && arrayList2.isEmpty() && arrayList.isEmpty() && !C() && !this.k.j()) ? x1.f5201e : x1Var;
            }
        }
        h0Var.getClass();
        h0Var.j(null, x1Var2);
        if (x1Var2 != x1Var) {
            return null;
        }
        cc.l lVar2 = this.f4918q;
        this.f4918q = null;
        return lVar2;
    }

    public final boolean C() {
        return !this.f4920s && (this.f4903a.f4949d.get() & 134217727) > 0;
    }

    public final boolean D() {
        boolean z10;
        synchronized (this.f4904b) {
            z10 = this.f4909g.h() || this.f4910h.f6423c != 0 || C();
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final List E() {
        ?? r8 = this.f4908f;
        if (r8 != 0) {
            return r8;
        }
        ArrayList arrayList = this.f4907e;
        List arrayList2 = arrayList.isEmpty() ? u8.w.f13122a : new ArrayList(arrayList);
        this.f4908f = arrayList2;
        return arrayList2;
    }

    public final void F() {
        synchronized (this.f4904b) {
            this.f4920s = true;
        }
    }

    public final void G(y yVar) {
        synchronized (this.f4904b) {
            ArrayList arrayList = this.f4912j;
            if (arrayList.size() > 0) {
                ((a1) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List I(List list, s.i0 i0Var) {
        p1.b bVarD;
        ArrayList<t8.j> arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            ((a1) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            y yVar = (y) entry.getKey();
            List list2 = (List) entry.getValue();
            if (yVar.f5224v.F) {
                t.c("Check failed");
            }
            c8.k kVar = new c8.k(5, yVar);
            c8.p pVar = new c8.p(7, yVar, i0Var);
            p1.f fVarK = p1.l.k();
            p1.b bVar = fVarK instanceof p1.b ? (p1.b) fVarK : null;
            if (bVar == null || (bVarD = bVar.D(kVar, pVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                p1.f fVarJ = bVarD.j();
                try {
                    synchronized (this.f4904b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                a1 a1Var = (a1) list2.get(i10);
                                s.h0 h0Var = this.k;
                                a1Var.getClass();
                                Object objA = h1.a.a(h0Var);
                                arrayList.add(new t8.j(a1Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                t8.j jVar = (t8.j) arrayList.get(i11);
                                if (jVar.f12831b == null) {
                                    u0.k kVar2 = this.f4913l;
                                    ((a1) jVar.f12830a).getClass();
                                    if (((s.h0) kVar2.f12990b).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(u8.q.a0(arrayList, 10));
                                        for (t8.j jVar2 : arrayList) {
                                            if (jVar2.f12831b == null) {
                                                u0.k kVar3 = this.f4913l;
                                                ((a1) jVar2.f12830a).getClass();
                                                s.h0 h0Var2 = (s.h0) kVar3.f12990b;
                                                if (h0Var2.i()) {
                                                    ((s.h0) kVar3.f12991c).a();
                                                }
                                            }
                                            arrayList3.add(jVar2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size4 = arrayList.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        if (((t8.j) arrayList.get(i12)).f12831b != null) {
                            int size5 = arrayList.size();
                            for (int i13 = 0; i13 < size5; i13++) {
                                if (((t8.j) arrayList.get(i13)).f12831b == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i14 = 0; i14 < size6; i14++) {
                                        t8.j jVar3 = (t8.j) arrayList.get(i14);
                                        if (jVar3.f12831b == null) {
                                        }
                                    }
                                    synchronized (this.f4904b) {
                                        u8.u.c0(arrayList4, this.f4912j);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i15 = 0; i15 < size7; i15++) {
                                        Object obj2 = arrayList.get(i15);
                                        if (((t8.j) obj2).f12831b != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    yVar.r(arrayList);
                    p1.f.q(fVarJ);
                    z(bVarD);
                } catch (Throwable th2) {
                    p1.f.q(fVarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                z(bVarD);
                throw th3;
            }
        }
        return u8.p.J0(map.keySet());
    }

    public final y J(y yVar, s.i0 i0Var) {
        p1.b bVarD;
        if (yVar.f5224v.F || yVar.f5225w == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f4917p;
        if (linkedHashSet == null || !linkedHashSet.contains(yVar)) {
            c8.k kVar = new c8.k(5, yVar);
            c8.p pVar = new c8.p(7, yVar, i0Var);
            p1.f fVarK = p1.l.k();
            p1.b bVar = fVarK instanceof p1.b ? (p1.b) fVarK : null;
            if (bVar == null || (bVarD = bVar.D(kVar, pVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                p1.f fVarJ = bVarD.j();
                if (i0Var != null) {
                    try {
                        if (i0Var.h()) {
                            a8.f1 f1Var = new a8.f1(3, i0Var, yVar);
                            s sVar = yVar.f5224v;
                            if (sVar.F) {
                                t.c("Preparing a composition while composing is not supported");
                            }
                            sVar.F = true;
                            try {
                                f1Var.invoke();
                                sVar.F = false;
                            } catch (Throwable th) {
                                sVar.F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        p1.f.q(fVarJ);
                        throw th2;
                    }
                }
                boolean zX = yVar.x();
                p1.f.q(fVarJ);
                z(bVarD);
                if (zX) {
                    return yVar;
                }
            } catch (Throwable th3) {
                z(bVarD);
                throw th3;
            }
        }
        return null;
    }

    public final void K(Throwable th, y yVar) throws Throwable {
        if (!((Boolean) f4902z.get()).booleanValue() || (th instanceof m)) {
            synchronized (this.f4904b) {
                a2.d dVar = this.f4919r;
                if (dVar != null) {
                    throw ((Throwable) dVar.f20b);
                }
                this.f4919r = new a2.d(12, th);
            }
            throw th;
        }
        synchronized (this.f4904b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f4911i.clear();
                this.f4910h.h();
                this.f4909g = new s.i0();
                this.f4912j.clear();
                this.k.a();
                this.f4914m.a();
                this.f4919r = new a2.d(12, th);
                if (yVar != null) {
                    M(yVar);
                }
                B();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean L() {
        synchronized (this.f4904b) {
            boolean z10 = true;
            if (this.f4909g.g()) {
                if (this.f4910h.f6423c == 0 && !C() && !this.k.j()) {
                    z10 = false;
                }
                return z10;
            }
            List listE = E();
            h1.h hVar = new h1.h(this.f4909g);
            this.f4909g = new s.i0();
            try {
                int size = listE.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((y) listE.get(i7)).y(hVar);
                    if (((x1) this.f4921t.getValue()).compareTo(x1.f5198b) <= 0) {
                        break;
                    }
                }
                synchronized (this.f4904b) {
                    if (B() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (this.f4910h.f6423c == 0 && !C() && !this.k.j()) {
                        z10 = false;
                    }
                }
                return z10;
            } catch (Throwable th) {
                synchronized (this.f4904b) {
                    s.i0 i0Var = this.f4909g;
                    i0Var.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        i0Var.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void M(y yVar) {
        ArrayList arrayList = this.f4916o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4916o = arrayList;
        }
        if (!arrayList.contains(yVar)) {
            arrayList.add(yVar);
        }
        if (this.f4907e.remove(yVar)) {
            this.f4908f = null;
        }
    }

    public final void N() {
        cc.j jVarB;
        synchronized (this.f4904b) {
            if (this.f4920s) {
                this.f4920s = false;
                jVarB = B();
            } else {
                jVarB = null;
            }
        }
        if (jVarB != null) {
            ((cc.l) jVarB).resumeWith(t8.z.f12851a);
        }
    }

    @Override // f1.v
    public final void a(y yVar, h9.n nVar) throws Throwable {
        x1 x1Var;
        boolean zContains;
        p1.b bVarD;
        boolean z10 = yVar.f5224v.F;
        synchronized (this.f4904b) {
            x1 x1Var2 = (x1) this.f4921t.getValue();
            x1Var = x1.f5198b;
            zContains = x1Var2.compareTo(x1Var) > 0 ? true ^ E().contains(yVar) : true;
        }
        try {
            c8.k kVar = new c8.k(5, yVar);
            c8.p pVar = new c8.p(7, yVar, (Object) null);
            p1.f fVarK = p1.l.k();
            p1.b bVar = fVarK instanceof p1.b ? (p1.b) fVarK : null;
            if (bVar == null || (bVarD = bVar.D(kVar, pVar)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                p1.f fVarJ = bVarD.j();
                try {
                    yVar.j(nVar);
                    p1.f.q(fVarJ);
                    z(bVarD);
                    synchronized (this.f4904b) {
                        if (((x1) this.f4921t.getValue()).compareTo(x1Var) > 0 && !E().contains(yVar)) {
                            this.f4907e.add(yVar);
                            this.f4908f = null;
                        }
                    }
                    if (!z10) {
                        p1.l.k().m();
                    }
                    try {
                        G(yVar);
                        try {
                            yVar.d();
                            yVar.f();
                            if (z10) {
                                return;
                            }
                            p1.l.k().m();
                        } catch (Throwable th) {
                            K(th, null);
                        }
                    } catch (Throwable th2) {
                        K(th2, yVar);
                    }
                } catch (Throwable th3) {
                    p1.f.q(fVarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                z(bVarD);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.f4904b) {
                }
            }
            K(th5, yVar);
        }
    }

    @Override // f1.v
    public final s.i0 b(y yVar, b3.l0 l0Var, h9.n nVar) {
        a2.b bVar = this.f4922u;
        try {
            b3.l0 l0Var2 = yVar.f5218p;
            yVar.f5218p = l0Var;
            try {
                a(yVar, nVar);
                s.i0 i0Var = (s.i0) bVar.y();
                if (i0Var == null) {
                    i0Var = s.p0.f12478a;
                    i9.l.c(i0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                yVar.f5218p = l0Var2;
                bVar.X(null);
                return i0Var;
            } catch (Throwable th) {
                yVar.f5218p = l0Var2;
                throw th;
            }
        } catch (Throwable th2) {
            bVar.X(null);
            throw th2;
        }
    }

    @Override // f1.v
    public final boolean d() {
        return ((Boolean) f4902z.get()).booleanValue();
    }

    @Override // f1.v
    public final boolean e() {
        return false;
    }

    @Override // f1.v
    public final boolean f() {
        return false;
    }

    @Override // f1.v
    public final long g() {
        return 1000;
    }

    @Override // f1.v
    public final u h() {
        return null;
    }

    @Override // f1.v
    public final y8.h j() {
        return this.f4924w;
    }

    @Override // f1.v
    public final void k(y yVar) {
        cc.j jVarB;
        synchronized (this.f4904b) {
            if (this.f4910h.i(yVar)) {
                jVarB = null;
            } else {
                this.f4910h.b(yVar);
                jVarB = B();
            }
        }
        if (jVarB != null) {
            ((cc.l) jVarB).resumeWith(t8.z.f12851a);
        }
    }

    @Override // f1.v
    public final z0 l(a1 a1Var) {
        z0 z0Var;
        synchronized (this.f4904b) {
            z0Var = (z0) this.f4914m.k(a1Var);
        }
        return z0Var;
    }

    @Override // f1.v
    public final s.i0 m(y yVar, b3.l0 l0Var, s.i0 i0Var) {
        a2.b bVar = this.f4922u;
        try {
            L();
            yVar.y(new h1.h(i0Var));
            b3.l0 l0Var2 = yVar.f5218p;
            yVar.f5218p = l0Var;
            try {
                y yVarJ = J(yVar, null);
                if (yVarJ != null) {
                    G(yVar);
                    yVarJ.d();
                    yVarJ.f();
                }
                s.i0 i0Var2 = (s.i0) bVar.y();
                if (i0Var2 == null) {
                    i0Var2 = s.p0.f12478a;
                    i9.l.c(i0Var2, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                yVar.f5218p = l0Var2;
                bVar.X(null);
                return i0Var2;
            } catch (Throwable th) {
                yVar.f5218p = l0Var2;
                throw th;
            }
        } catch (Throwable th2) {
            bVar.X(null);
            throw th2;
        }
    }

    @Override // f1.v
    public final void n(Set set) {
    }

    @Override // f1.v
    public final void p(w1 w1Var) {
        a2.b bVar = this.f4922u;
        s.i0 i0Var = (s.i0) bVar.y();
        if (i0Var == null) {
            s.i0 i0Var2 = s.p0.f12478a;
            i0Var = new s.i0();
            bVar.X(i0Var);
        }
        i0Var.a(w1Var);
    }

    @Override // f1.v
    public final void q(y yVar) {
        synchronized (this.f4904b) {
            try {
                LinkedHashSet linkedHashSet = this.f4917p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f4917p = linkedHashSet;
                }
                linkedHashSet.add(yVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f1.v
    public final void t(y yVar) {
        synchronized (this.f4904b) {
            if (this.f4907e.remove(yVar)) {
                this.f4908f = null;
            }
            this.f4910h.k(yVar);
            this.f4911i.remove(yVar);
        }
    }
}
