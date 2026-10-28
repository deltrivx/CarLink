package q2;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r1.o implements x, o, y1, v1, p2.d, p2.e, t1, w, p, w1.e, w1.n, w1.p, r1, v1.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r1.n f10598o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p2.a f10599p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashSet f10600q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // p2.e
    public final Object A(p2.f fVar) {
        d1 d1Var;
        this.f10600q.add(fVar);
        if (!this.f11117a.f11129n) {
            n2.a.b("visitAncestors called on an unattached node");
        }
        r1.o oVar = this.f11117a.f11121e;
        h0 h0VarV = f.v(this);
        while (h0VarV != null) {
            if ((h0VarV.E.f10617f.f11120d & 32) != 0) {
                while (oVar != null) {
                    if ((oVar.f11119c & 32) != 0) {
                        ?? F = oVar;
                        ?? eVar = 0;
                        while (F != 0) {
                            if (F instanceof p2.d) {
                                p2.d dVar = (p2.d) F;
                                if (dVar.N().s(fVar)) {
                                    return dVar.N().v(fVar);
                                }
                            } else if ((F.f11119c & 32) != 0 && (F instanceof m)) {
                                r1.o oVar2 = ((m) F).f10746p;
                                int i7 = 0;
                                F = F;
                                eVar = eVar;
                                while (oVar2 != null) {
                                    if ((oVar2.f11119c & 32) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            eVar = eVar;
                                            F = oVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new h1.e(new r1.o[16]);
                                            }
                                            if (F != 0) {
                                                eVar.b(F);
                                                F = 0;
                                            }
                                            eVar.b(oVar2);
                                        }
                                    }
                                    oVar2 = oVar2.f11122f;
                                    F = F;
                                    eVar = eVar;
                                }
                                if (i7 == 1) {
                                }
                            }
                            F = f.f(eVar);
                        }
                    }
                    oVar = oVar.f11121e;
                }
            }
            h0VarV = h0VarV.v();
            oVar = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
        }
        return fVar.f10123a.invoke();
    }

    public final void A0(boolean z10) {
        p2.f fVar = d0.c.f3545c;
        if (!this.f11129n) {
            n2.a.b("initializeModifier called on unattached node");
        }
        r1.n nVar = this.f10598o;
        if ((this.f11119c & 32) != 0) {
            if (nVar instanceof d0.a0) {
                b bVar = new b(this, 0);
                s.d0 d0Var = ((r2.u) f.w(this)).C0;
                if (d0Var.f(bVar) < 0) {
                    d0Var.a(bVar);
                }
            }
            if (nVar instanceof d0.a0) {
                d0.a0 a0Var = (d0.a0) nVar;
                p2.a aVar = this.f10599p;
                if (aVar == null || !aVar.s(fVar)) {
                    p2.a aVar2 = new p2.a();
                    aVar2.f10115b = a0Var;
                    this.f10599p = aVar2;
                    if (f.d(this)) {
                        p2.c modifierLocalManager = ((r2.u) f.w(this)).getModifierLocalManager();
                        modifierLocalManager.f10118b.b(this);
                        modifierLocalManager.f10119c.b(fVar);
                        modifierLocalManager.a();
                    }
                } else {
                    aVar.f10115b = a0Var;
                    p2.c modifierLocalManager2 = ((r2.u) f.w(this)).getModifierLocalManager();
                    modifierLocalManager2.f10118b.b(this);
                    modifierLocalManager2.f10119c.b(fVar);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f11119c & 4) != 0 && !z10) {
            f.t(this, 2).N0();
        }
        if ((this.f11119c & 2) != 0) {
            if (f.d(this)) {
                h1 h1Var = this.f11124h;
                i9.l.b(h1Var);
                ((z) h1Var).g1(this);
                p1 p1Var = h1Var.I;
                if (p1Var != null) {
                    p1Var.invalidate();
                }
            }
            if (!z10) {
                f.t(this, 2).N0();
                f.v(this).E();
            }
        }
        if (nVar instanceof f0.s) {
            f0.s sVar = (f0.s) nVar;
            h0 h0VarV = f.v(this);
            switch (sVar.f4844a) {
                case 0:
                    ((f0.u) sVar.f4845b).k = h0VarV;
                    break;
                default:
                    ((g0.v) sVar.f4845b).f5747j = h0VarV;
                    break;
            }
        }
        if ((this.f11119c & 256) != 0 && (nVar instanceof h0.e) && f.d(this)) {
            f.v(this).E();
        }
        int i7 = this.f11119c;
        if ((i7 & 16) != 0 && (nVar instanceof k2.c0)) {
            ((k2.c0) nVar).f7196d.f3847b = this.f11124h;
        }
        if ((i7 & 8) != 0) {
            ((r2.u) f.w(this)).F();
        }
    }

    @Override // q2.y1
    public final /* synthetic */ boolean B() {
        return false;
    }

    public final void B0() {
        p2.f fVar = d0.c.f3545c;
        if (!this.f11129n) {
            n2.a.b("unInitializeModifier called on unattached node");
        }
        r1.n nVar = this.f10598o;
        if ((this.f11119c & 32) != 0) {
            if (nVar instanceof d0.a0) {
                p2.c modifierLocalManager = ((r2.u) f.w(this)).getModifierLocalManager();
                modifierLocalManager.f10120d.b(f.v(this));
                modifierLocalManager.f10121e.b(fVar);
                modifierLocalManager.a();
            }
            if (nVar instanceof d0.a0) {
                d0.a0 a0Var = (d0.a0) nVar;
                d0.t0 t0Var = (d0.t0) fVar.f10123a.invoke();
                d0.t0 t0Var2 = a0Var.f3535a;
                a0Var.f3536b.setValue(new d0.v(t0Var2, t0Var));
                a0Var.f3537c.setValue(new d0.q0(t0Var, t0Var2));
            }
        }
        if ((this.f11119c & 8) != 0) {
            ((r2.u) f.w(this)).F();
        }
    }

    public final void C0() {
        if (this.f11129n) {
            this.f10600q.clear();
            ((r2.u) f.w(this)).getSnapshotObserver().a(this, e.f10622b, new b(this, 1));
        }
    }

    @Override // q2.o
    public final void H() {
        f.l(this);
    }

    @Override // q2.v1
    public final void I() {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((k2.c0) nVar).f7196d.getClass();
    }

    @Override // p2.d
    public final n3.l N() {
        p2.a aVar = this.f10599p;
        return aVar != null ? aVar : p2.b.f10116b;
    }

    @Override // q2.w
    public final void T(o2.w wVar) {
    }

    @Override // q2.p
    public final void U(h1 h1Var) {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        h0.e eVar = (h0.e) nVar;
        ArrayList arrayList = eVar.f6308b;
        if (eVar.f6307a) {
            return;
        }
        eVar.f6307a = true;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((y8.c) arrayList.get(i7)).resumeWith(t8.z.f12851a);
        }
        arrayList.clear();
    }

    @Override // q2.y1
    public final void Y(y2.j jVar) {
        char c10;
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) nVar;
        y2.j jVar2 = new y2.j();
        jVar2.f15013c = appendedSemanticsElement.f965a;
        appendedSemanticsElement.f966b.invoke(jVar2);
        i9.l.c(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        s.h0 h0Var = jVar.f15011a;
        if (jVar2.f15013c) {
            jVar.f15013c = true;
        }
        if (jVar2.f15014d) {
            jVar.f15014d = true;
        }
        s.h0 h0Var2 = jVar2.f15011a;
        Object[] objArr = h0Var2.f12438b;
        Object[] objArr2 = h0Var2.f12439c;
        long[] jArr = h0Var2.f12437a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j5 = jArr[i7];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j5) < 128) {
                        int i12 = (i7 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        y2.u uVar = (y2.u) obj;
                        if (!h0Var.b(uVar)) {
                            h0Var.m(uVar, obj2);
                        } else if (obj2 instanceof y2.a) {
                            Object objG = h0Var.g(uVar);
                            i9.l.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            y2.a aVar = (y2.a) objG;
                            c10 = '\b';
                            String str = aVar.f14969a;
                            if (str == null) {
                                str = ((y2.a) obj2).f14969a;
                            }
                            t8.e eVar = aVar.f14970b;
                            if (eVar == null) {
                                eVar = ((y2.a) obj2).f14970b;
                            }
                            h0Var.m(uVar, new y2.a(str, eVar));
                        }
                        c10 = '\b';
                    } else {
                        c10 = '\b';
                    }
                    j5 >>= c10;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    @Override // v1.a
    public final n3.c a() {
        return f.v(this).f10689x;
    }

    @Override // q2.x
    public final o2.n0 b(o2.o0 o0Var, o2.l0 l0Var, long j5) {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((o2.y) nVar).b(o0Var, l0Var, j5);
    }

    @Override // q2.x
    public final int c(p0 p0Var, o2.l0 l0Var, int i7) {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((o2.y) nVar).c(p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final int d(p0 p0Var, o2.l0 l0Var, int i7) {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((o2.y) nVar).d(p0Var, l0Var, i7);
    }

    @Override // q2.v1
    public final boolean d0() {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((k2.c0) nVar).f7196d.getClass();
        return true;
    }

    @Override // q2.x
    public final int e(p0 p0Var, o2.l0 l0Var, int i7) {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((o2.y) nVar).e(p0Var, l0Var, i7);
    }

    @Override // q2.x
    public final int f(p0 p0Var, o2.l0 l0Var, int i7) {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((o2.y) nVar).f(p0Var, l0Var, i7);
    }

    @Override // v1.a
    public final long g() {
        return n3.n.M0(f.t(this, 128).f9437c);
    }

    @Override // q2.v1
    public final void g0() {
        z();
    }

    @Override // v1.a
    public final n3.o getLayoutDirection() {
        return f.v(this).f10690y;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // q2.y1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // q2.t1
    public final Object k0(Object obj) {
        i9.l.c(this.f10598o, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        throw new ClassCastException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // q2.v1
    public final void l0(k2.n nVar, k2.o oVar, long j5) {
        boolean z10;
        boolean z11;
        boolean z12;
        r1.n nVar2 = this.f10598o;
        i9.l.c(nVar2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        da.a aVar = ((k2.c0) nVar2).f7196d;
        k2.c0 c0Var = (k2.c0) aVar.f3850e;
        ?? r8 = nVar.f7264a;
        int size = r8.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                z10 = true;
                break;
            }
            k2.v vVar = (k2.v) r8.get(i7);
            if (k2.u.a(vVar) || k2.u.c(vVar)) {
                z10 = false;
                break;
            }
            i7++;
        }
        if (!z10) {
            z11 = false;
            break;
        }
        int size2 = r8.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                z11 = true;
                break;
            } else {
                if (((k2.v) r8.get(i10)).b()) {
                    z11 = false;
                    break;
                }
                i10++;
            }
        }
        if (c0Var.f7195c) {
            z12 = true;
            break;
        }
        int size3 = r8.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                if (!z11) {
                    z12 = false;
                    break;
                }
                break;
            } else {
                k2.v vVar2 = (k2.v) r8.get(i11);
                if (!k2.u.a(vVar2) && !k2.u.c(vVar2)) {
                    i11++;
                }
            }
            z12 = true;
            break;
        }
        k2.a0 a0Var = (k2.a0) aVar.f3848c;
        k2.a0 a0Var2 = k2.a0.f7185c;
        k2.o oVar2 = k2.o.f7271c;
        if (a0Var != a0Var2) {
            if (oVar == k2.o.f7269a && z12) {
                aVar.f3849d = nVar;
                aVar.o(nVar, !z10 || c0Var.f7195c);
            }
            if (oVar == k2.o.f7270b && z10 && nVar.equals((k2.n) aVar.f3849d) && c0Var.f7195c) {
                int size4 = r8.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    ((k2.v) r8.get(i12)).a();
                }
            }
            if (oVar == oVar2 && !z12 && !nVar.equals((k2.n) aVar.f3849d)) {
                aVar.o(nVar, true);
            }
        }
        if (oVar == oVar2) {
            int size5 = r8.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size5) {
                    aVar.f3848c = k2.a0.f7183a;
                    ((k2.c0) aVar.f3850e).f7195c = false;
                    aVar.f3849d = null;
                    break;
                } else if (!k2.u.c((k2.v) r8.get(i13))) {
                    break;
                } else {
                    i13++;
                }
            }
            if (nVar.equals((k2.n) aVar.f3849d) && z10) {
                int size6 = r8.size();
                for (int i14 = 0; i14 < size6; i14++) {
                    if (((k2.v) r8.get(i14)).b()) {
                        if (c0Var.f7195c) {
                            break;
                        }
                        aVar.G(nVar);
                        return;
                    }
                }
                int size7 = r8.size();
                for (int i15 = 0; i15 < size7; i15++) {
                    ((k2.v) r8.get(i15)).a();
                }
            }
        }
    }

    @Override // q2.v1
    public final long m() {
        return b2.f10596a;
    }

    @Override // q2.w
    public final void n(long j5) {
    }

    @Override // q2.r1
    public final boolean p() {
        return this.f11129n;
    }

    @Override // r1.o
    public final void q0() {
        A0(true);
    }

    @Override // w1.e
    public final void r(w1.r rVar) {
        r1.n nVar = this.f10598o;
        n2.a.b("onFocusEvent called on wrong node");
        nVar.getClass();
        throw new ClassCastException();
    }

    @Override // r1.o
    public final void r0() {
        if (this.f10598o instanceof k2.c0) {
            z();
        }
    }

    @Override // r1.o
    public final void s0() {
        B0();
    }

    @Override // w1.n
    public final void t(w1.k kVar) {
        r1.n nVar = this.f10598o;
        n2.a.b("applyFocusProperties called on wrong node");
        nVar.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.f10598o.toString();
    }

    @Override // q2.o
    public final void x(j0 j0Var) {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((x.p0) nVar).f14458a.a(j0Var);
    }

    @Override // q2.v1
    public final void z() {
        r1.n nVar = this.f10598o;
        i9.l.c(nVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        da.a aVar = ((k2.c0) nVar).f7196d;
        k2.a0 a0Var = (k2.a0) aVar.f3848c;
        k2.c0 c0Var = (k2.c0) aVar.f3850e;
        if (a0Var == k2.a0.f7184b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            k2.b0 b0Var = new k2.b0(c0Var, 0);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            b0Var.invoke(motionEventObtain);
            motionEventObtain.recycle();
            aVar.f3848c = k2.a0.f7183a;
            c0Var.f7195c = false;
            aVar.f3849d = null;
        }
    }
}
