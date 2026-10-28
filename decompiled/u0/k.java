package u0;

import a8.c1;
import aa.y0;
import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import cc.o1;
import cc.s;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import e4.l0;
import f1.a1;
import f1.k1;
import f1.l2;
import g1.k0;
import ga.b0;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l4.z;
import n3.r;
import nb.a0;
import nb.f0;
import nb.j0;
import nb.w;
import nb.x0;
import o2.m0;
import p.t;
import p4.u;
import q2.d0;
import q2.h0;
import ra.n0;
import s.q0;
import u8.c0;
import u8.x;
import v.w0;
import x9.r0;
import x9.v;
import x9.y;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public class k implements ac.h, d3.d, k0, b0, l4.o, o1.j, ta.f, o6.a, ob.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f12991c;

    public k(int i7) {
        this.f12989a = i7;
        switch (i7) {
            case 11:
                w0 w0Var = v.d.f13345j;
                Float fValueOf = Float.valueOf(0.0f);
                this.f12991c = new v.k(w0Var, fValueOf, (v.p) w0Var.f13471a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 17:
                this.f12990b = new ConcurrentHashMap();
                this.f12991c = new AtomicInteger(0);
                break;
            case 22:
                this.f12990b = new h1.e(new h0[16]);
                break;
            case 23:
                this.f12990b = new h1.e(new Reference[16]);
                this.f12991c = new ReferenceQueue();
                break;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                this.f12990b = f1.b.s(Boolean.FALSE);
                break;
            default:
                this.f12990b = new s.h0();
                this.f12991c = new s.h0();
                break;
        }
    }

    public /* synthetic */ k(int i7, Object obj, Object obj2) {
        this.f12989a = i7;
        this.f12990b = obj;
        this.f12991c = obj2;
    }

    public /* synthetic */ k(int i7, Object obj, Object obj2, boolean z10) {
        this.f12989a = i7;
        this.f12991c = obj;
        this.f12990b = obj2;
    }

    public k(View view) {
        this.f12989a = 0;
        this.f12990b = view;
        this.f12991c = t8.a.c(t8.i.f12828b, new a5.e(25, this));
    }

    public k(ec.h hVar, ec.b bVar) {
        this.f12989a = 14;
        ec.d dVar = ec.d.f4692i;
        ec.e eVar = ec.e.f4693i;
        this.f12990b = hVar;
        this.f12991c = bVar;
    }

    public k(g6.c cVar) {
        this.f12989a = 9;
        this.f12990b = new g6.c(cVar);
        this.f12991c = new g6.a[(cVar.f5944i - cVar.f5943h) + 1];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Enum r8) {
        this(26);
        this.f12989a = 26;
        this.f12991c = f1.b.s(r8);
        f1.b.s(r8);
    }

    public k(Object obj) {
        this.f12989a = 16;
        this.f12991c = obj;
        this.f12990b = Thread.currentThread();
    }

    public k(String str, String str2) {
        this.f12989a = 1;
        i9.l.e(str, "error");
        this.f12990b = str;
        this.f12991c = str2;
    }

    public k(HashMap map, ob.d dVar) {
        this.f12989a = 29;
        i9.l.e(dVar, "equalityAxioms");
        this.f12990b = map;
        this.f12991c = dVar;
    }

    public k(Map map) {
        this.f12989a = 10;
        this.f12991c = map;
        this.f12990b = new mb.k("Java nullability annotation states").c(new aa.a(8, this));
    }

    public k(t tVar, HashMap map, HashMap map2) {
        this.f12989a = 20;
        this.f12990b = tVar;
        this.f12991c = map;
    }

    public k(u uVar) {
        this.f12989a = 19;
        this.f12990b = new CopyOnWriteArrayList();
        this.f12991c = uVar;
    }

    public k(h0 h0Var, m0 m0Var) {
        this.f12989a = 21;
        this.f12990b = h0Var;
        this.f12991c = f1.b.s(m0Var);
    }

    public k(n0 n0Var, ra.m0 m0Var) {
        this.f12989a = 25;
        i9.l.e(n0Var, "strings");
        i9.l.e(m0Var, "qualifiedNames");
        this.f12990b = n0Var;
        this.f12991c = m0Var;
    }

    public k(t5.b bVar) {
        this.f12989a = 28;
        this.f12990b = bVar;
        this.f12991c = new u5.a(bVar);
    }

    public k(y yVar, da.a aVar) {
        this.f12989a = 13;
        i9.l.e(yVar, "module");
        i9.l.e(aVar, "notFoundClasses");
        this.f12990b = yVar;
        this.f12991c = aVar;
    }

    public static nb.h0 B0(List list) {
        return list.isEmpty() ? nb.h0.f8998c : new nb.h0(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [r1.o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h1.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void D0(h0 h0Var) {
        if (h0Var.O > 0) {
            if (h0Var.F.f10732d == d0.f10610e && !h0Var.q() && !h0Var.r() && !h0Var.P && h0Var.J()) {
                r1.o oVar = h0Var.E.f10617f;
                if ((oVar.f11120d & 256) != 0) {
                    while (oVar != null) {
                        if ((oVar.f11119c & 256) != 0) {
                            ?? F = oVar;
                            ?? eVar = 0;
                            while (F != 0) {
                                if (F instanceof q2.p) {
                                    q2.p pVar = (q2.p) F;
                                    pVar.U(q2.f.t(pVar, 256));
                                } else if ((F.f11119c & 256) != 0 && (F instanceof q2.m)) {
                                    r1.o oVar2 = ((q2.m) F).f10746p;
                                    int i7 = 0;
                                    F = F;
                                    eVar = eVar;
                                    while (oVar2 != null) {
                                        if ((oVar2.f11119c & 256) != 0) {
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
                                F = q2.f.f(eVar);
                            }
                        }
                        if ((oVar.f11120d & 256) == 0) {
                            break;
                        } else {
                            oVar = oVar.f11122f;
                        }
                    }
                }
            }
            h0Var.N = false;
            h1.e eVarZ = h0Var.z();
            Object[] objArr = eVarZ.f6421a;
            int i10 = eVarZ.f6423c;
            for (int i11 = 0; i11 < i10; i11++) {
                D0((h0) objArr[i11]);
            }
        }
    }

    public static n5.o Y0(n5.o oVar, float f10, float f11) {
        float f12 = oVar.f8854a;
        float f13 = oVar.f8855b;
        return new n5.o(f12 < f10 ? f12 - 1.0f : f12 + 1.0f, f13 < f11 ? f13 - 1.0f : f13 + 1.0f);
    }

    public static n5.o e1(n5.o oVar, n5.o oVar2, int i7) {
        float f10 = oVar2.f8854a;
        float f11 = oVar.f8854a;
        float f12 = i7 + 1;
        float f13 = oVar2.f8855b;
        float f14 = oVar.f8855b;
        return new n5.o(f11 + ((f10 - f11) / f12), f14 + ((f13 - f14) / f12));
    }

    @Override // ob.c
    public void A(qb.d dVar) {
        i9.l.e(dVar, "<this>");
        ob.h.g(dVar);
    }

    @Override // ob.c
    public a0 A0(qb.e eVar) {
        return ob.h.Y(eVar, false);
    }

    @Override // ob.c
    public boolean B(r0 r0Var, qb.h hVar) {
        return ob.h.v(r0Var, hVar);
    }

    @Override // ob.c
    public a0 C(qb.d dVar) {
        a0 a0VarN;
        i9.l.e(dVar, "<this>");
        nb.p pVarG = ob.h.g(dVar);
        if (pVarG != null && (a0VarN = ob.h.N(pVarG)) != null) {
            return a0VarN;
        }
        a0 a0VarH = ob.h.h(dVar);
        i9.l.b(a0VarH);
        return a0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0109  */
    public y9.c C0(ra.h hVar, ta.f fVar) {
        Map mapZ0;
        i9.l.e(hVar, "proto");
        i9.l.e(fVar, "nameResolver");
        x9.e eVarF = v.f((y) this.f12990b, i2.c.D(fVar, hVar.f11964c), (da.a) this.f12991c);
        if (hVar.f11965d.size() == 0 || pb.l.f(eVarF)) {
            mapZ0 = x.f13123a;
        } else {
            int i7 = za.d.f15791a;
            if (za.d.n(eVarF, x9.f.f14705e)) {
                Collection collectionW = eVarF.w();
                i9.l.d(collectionW, "getConstructors(...)");
                aa.m mVar = (aa.m) u8.p.B0(collectionW);
                if (mVar != null) {
                    List listX = mVar.X();
                    i9.l.d(listX, "getValueParameters(...)");
                    int iS0 = c0.S0(u8.q.a0(listX, 10));
                    if (iS0 < 16) {
                        iS0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS0);
                    for (Object obj : listX) {
                        linkedHashMap.put(((y0) obj).getName(), obj);
                    }
                    List<ra.f> list = hVar.f11965d;
                    i9.l.d(list, "getArgumentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (ra.f fVar2 : list) {
                        i9.l.b(fVar2);
                        y0 y0Var = (y0) linkedHashMap.get(i2.c.G(fVar, fVar2.f11930c));
                        Object jVar = null;
                        if (y0Var != null) {
                            wa.e eVarG = i2.c.G(fVar, fVar2.f11930c);
                            w type = y0Var.getType();
                            i9.l.d(type, "getType(...)");
                            ra.e eVar = fVar2.f11931d;
                            i9.l.d(eVar, "getValue(...)");
                            bb.g gVarD1 = d1(type, eVar, fVar);
                            jVar = R0(gVarD1, type, eVar) ? gVarD1 : null;
                            if (jVar == null) {
                                String str = "Unexpected argument value: actual type " + eVar.f11893c + " != expected type " + type;
                                i9.l.e(str, "message");
                                jVar = new bb.j(str);
                            }
                            jVar = new t8.j(eVarG, jVar);
                        }
                        if (jVar != null) {
                            arrayList.add(jVar);
                        }
                    }
                    mapZ0 = u8.b0.Z0(arrayList);
                } else {
                    mapZ0 = x.f13123a;
                }
            } else {
                mapZ0 = x.f13123a;
            }
        }
        return new y9.c(eVarF.n(), mapZ0, x9.n0.f14716e0);
    }

    @Override // ob.c
    public a0 D(qb.d dVar) {
        a0 a0VarX;
        i9.l.e(dVar, "<this>");
        nb.p pVarG = ob.h.g(dVar);
        if (pVarG != null && (a0VarX = ob.h.X(pVarG)) != null) {
            return a0VarX;
        }
        a0 a0VarH = ob.h.h(dVar);
        i9.l.b(a0VarH);
        return a0VarH;
    }

    @Override // ob.c
    public nb.w0 E(qb.c cVar) {
        return ob.h.O(cVar);
    }

    public void E0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.E0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ob.c
    public qb.b F(qb.c cVar) {
        return ob.h.k(cVar);
    }

    public void F0(boolean z10) {
        u uVar = (u) this.f12991c;
        j.j jVar = uVar.f10246t.f10204d;
        p4.i iVar = uVar.f10248v;
        if (iVar != null) {
            iVar.j().f10238l.F0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ob.c
    public f0 G(qb.d dVar) {
        return ob.h.i(dVar);
    }

    public void G0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.G0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ob.c
    public nb.n0 H(qb.e eVar, int i7) {
        i9.l.e(eVar, "<this>");
        if (i7 < 0 || i7 >= ob.h.c(eVar)) {
            return null;
        }
        return ob.h.p(eVar, i7);
    }

    public void H0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.H0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ta.f
    public String I(int i7) throws IOException {
        t8.p pVarG1 = g1(i7);
        List list = (List) pVarG1.f12839a;
        String strQ0 = u8.p.q0((List) pVarG1.f12840b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strQ0;
        }
        return u8.p.q0(list, "/", null, null, null, 62) + '/' + strQ0;
    }

    public void I0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.I0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // d3.d
    public int J(int i7) {
        CharSequence charSequence = (CharSequence) this.f12990b;
        do {
            i7 = ((d3.e) this.f12991c).t(i7);
            if (i7 == -1 || i7 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i7)));
        return i7;
    }

    public void J0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.J0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // d3.d
    public int K(int i7) {
        do {
            i7 = ((d3.e) this.f12991c).w(i7);
            if (i7 == -1 || i7 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f12990b).charAt(i7 - 1)));
        return i7;
    }

    public void K0(boolean z10) {
        u uVar = (u) this.f12991c;
        j.j jVar = uVar.f10246t.f10204d;
        p4.i iVar = uVar.f10248v;
        if (iVar != null) {
            iVar.j().f10238l.K0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ob.c
    public a0 L(qb.e eVar) {
        return ob.h.Y(eVar, true);
    }

    public void L0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.L0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ob.c
    public ob.b M(qb.e eVar) {
        return ob.h.T(this, eVar);
    }

    public void M0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.M0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ob.c
    public boolean N(nb.w0 w0Var) {
        i9.l.e(w0Var, "<this>");
        return ob.h.F(C(w0Var)) != ob.h.F(D(w0Var));
    }

    public void N0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.N0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // l4.o
    public Object O() {
        return (z) this.f12990b;
    }

    public void O0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.O0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ob.c
    public a0 P(nb.p pVar) {
        return ob.h.N(pVar);
    }

    public void P0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.P0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ob.c
    public a0 Q(w wVar) {
        return ob.h.h(wVar);
    }

    public void Q0(boolean z10) {
        p4.i iVar = ((u) this.f12991c).f10248v;
        if (iVar != null) {
            iVar.j().f10238l.Q0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f12990b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // l4.o
    public boolean R(CharSequence charSequence, int i7, int i10, l4.w wVar) {
        if ((wVar.f8050c & 4) > 0) {
            return true;
        }
        if (((z) this.f12990b) == null) {
            this.f12990b = new z(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((kb.d) this.f12991c).getClass();
        ((z) this.f12990b).setSpan(new l4.x(wVar), i7, i10, 33);
        return true;
    }

    public boolean R0(bb.g gVar, w wVar, ra.e eVar) {
        bb.g gVar2;
        ra.e eVar2;
        y yVar = (y) this.f12990b;
        ra.d dVar = eVar.f11893c;
        int i7 = dVar == null ? -1 : jb.b.f7003a[dVar.ordinal()];
        if (i7 == 10) {
            x9.h hVarL = wVar.D0().l();
            x9.e eVar3 = hVarL instanceof x9.e ? (x9.e) hVarL : null;
            if (eVar3 != null) {
                wa.e eVar4 = u9.i.f13141e;
                if (!u9.i.b(eVar3, u9.n.Q)) {
                    return false;
                }
            }
            return true;
        }
        if (i7 != 13) {
            return i9.l.a(gVar.a(yVar), wVar);
        }
        if (gVar instanceof bb.b) {
            Object obj = ((bb.b) gVar).f1683a;
            if (((List) obj).size() == eVar.k.size()) {
                w wVarG = yVar.k().g(wVar);
                if (wVarG != null) {
                    Collection collection = (Collection) obj;
                    i9.l.e(collection, "<this>");
                    Iterable dVar2 = new n9.d(0, collection.size() - 1, 1);
                    if (!(dVar2 instanceof Collection) || !((Collection) dVar2).isEmpty()) {
                        Iterator it = dVar2.iterator();
                        do {
                            n9.c cVar = (n9.c) it;
                            if (cVar.f8970c) {
                                int iNextInt = cVar.nextInt();
                                gVar2 = (bb.g) ((List) obj).get(iNextInt);
                                eVar2 = (ra.e) eVar.k.get(iNextInt);
                                i9.l.d(eVar2, "getArrayElement(...)");
                            }
                        } while (R0(gVar2, wVarG, eVar2));
                    }
                    return true;
                }
                return false;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
    }

    @Override // ob.c
    public nb.w0 S(ArrayList arrayList) {
        a0 a0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (nb.w0) u8.p.z0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            nb.w0 w0Var = (nb.w0) it.next();
            z10 = z10 || nb.c.j(w0Var);
            if (w0Var instanceof a0) {
                a0Var = (a0) w0Var;
            } else {
                if (!(w0Var instanceof nb.p)) {
                    throw new s();
                }
                a0Var = ((nb.p) w0Var).f9023b;
                z11 = true;
            }
            arrayList2.add(a0Var);
        }
        if (z10) {
            return pb.l.c(pb.k.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        ob.u uVar = ob.u.f9666a;
        if (!z11) {
            return uVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(nb.c.D((nb.w0) it2.next()));
        }
        return nb.c.e(uVar.b(arrayList2), uVar.b(arrayList3));
    }

    public g6.a S0(int i7) {
        g6.a aVar;
        g6.a aVar2;
        g6.a[] aVarArr = (g6.a[]) this.f12991c;
        g6.a aVar3 = aVarArr[W0(i7)];
        if (aVar3 != null) {
            return aVar3;
        }
        for (int i10 = 1; i10 < 5; i10++) {
            int iW0 = W0(i7) - i10;
            if (iW0 >= 0 && (aVar2 = aVarArr[iW0]) != null) {
                return aVar2;
            }
            int iW1 = W0(i7) + i10;
            if (iW1 < aVarArr.length && (aVar = aVarArr[iW1]) != null) {
                return aVar;
            }
        }
        return null;
    }

    @Override // ob.c
    public nb.w0 T(qb.d dVar) {
        return ob.h.P(dVar);
    }

    public int T0(String str) {
        int iIntValue;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f12990b;
        i9.l.e(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    int andIncrement = ((AtomicInteger) this.f12991c).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                    iIntValue = andIncrement;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // g1.k0
    public List U(Integer num) {
        List listU = ((k0) this.f12990b).U(null);
        l2 l2Var = (l2) this.f12991c;
        int i7 = l2Var.f5038v;
        return i7 < 0 ? listU : u8.p.x0(listU, n3.n.S(l2Var, num, i7, Integer.valueOf(l2Var.D(l2Var.f5019b, i7))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, t8.h] */
    public InputMethodManager U0() {
        return (InputMethodManager) this.f12991c.getValue();
    }

    @Override // ob.c
    public boolean V(qb.d dVar) {
        i9.l.e(dVar, "<this>");
        a0 a0VarH = ob.h.h(dVar);
        return (a0VarH != null ? ob.h.f(a0VarH) : null) != null;
    }

    public m0 V0() {
        return (m0) ((k1) this.f12991c).getValue();
    }

    @Override // o1.j
    public Object W(o1.a aVar, Object obj) {
        return ((h9.n) this.f12990b).invoke(aVar, obj);
    }

    public int W0(int i7) {
        return i7 - ((g6.c) this.f12990b).f5943h;
    }

    @Override // d3.d
    public int X(int i7) {
        do {
            i7 = ((d3.e) this.f12991c).w(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f12990b).charAt(i7)));
        return i7;
    }

    public boolean X0(n5.o oVar) {
        float f10 = oVar.f8854a;
        if (f10 < 0.0f) {
            return false;
        }
        t5.b bVar = (t5.b) this.f12990b;
        if (f10 >= bVar.f12761a) {
            return false;
        }
        float f11 = oVar.f8855b;
        return f11 > 0.0f && f11 < ((float) bVar.f12762b);
    }

    @Override // d3.d
    public int Y(int i7) {
        do {
            i7 = ((d3.e) this.f12991c).t(i7);
            if (i7 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f12990b).charAt(i7 - 1)));
        return i7;
    }

    @Override // ob.c
    public nb.n0 Z(qb.d dVar, int i7) {
        return ob.h.p(dVar, i7);
    }

    public j0 Z0() {
        return new j0(true, true, this, ob.f.f9638a, ob.g.f9640a);
    }

    @Override // ob.c
    public a0 a(nb.p pVar) {
        return ob.h.X(pVar);
    }

    @Override // ob.c
    public boolean a0(qb.c cVar) {
        return ob.h.J(cVar);
    }

    public void a1(n.a aVar) {
        da.a aVar2 = (da.a) this.f12990b;
        ((ActionMode.Callback) aVar2.f3847b).onDestroyActionMode(aVar2.t(aVar));
        j.b0 b0Var = (j.b0) this.f12991c;
        if (b0Var.f6742w != null) {
            b0Var.f6730l.getDecorView().removeCallbacks(b0Var.f6743x);
        }
        if (b0Var.f6741v != null) {
            e4.r0 r0Var = b0Var.f6744y;
            if (r0Var != null) {
                r0Var.b();
            }
            e4.r0 r0VarA = l0.a(b0Var.f6741v);
            r0VarA.a(0.0f);
            b0Var.f6744y = r0VarA;
            r0VarA.d(new j.t(2, this));
        }
        b0Var.f6740u = null;
        ViewGroup viewGroup = b0Var.A;
        WeakHashMap weakHashMap = l0.f4369a;
        e4.c0.c(viewGroup);
        b0Var.H();
    }

    @Override // ob.c
    public boolean b(qb.e eVar) {
        return ob.h.B(eVar);
    }

    @Override // ob.c
    public int b0(qb.g gVar) {
        i9.l.e(gVar, "<this>");
        if (gVar instanceof qb.e) {
            return ob.h.c((qb.d) gVar);
        }
        if (gVar instanceof qb.a) {
            return ((qb.a) gVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + i9.y.f6689a.b(gVar.getClass())).toString());
    }

    public boolean b1(n.a aVar, Menu menu) {
        ViewGroup viewGroup = ((j.b0) this.f12991c).A;
        WeakHashMap weakHashMap = l0.f4369a;
        e4.c0.c(viewGroup);
        da.a aVar2 = (da.a) this.f12990b;
        ActionMode.Callback callback = (ActionMode.Callback) aVar2.f3847b;
        n.e eVarT = aVar2.t(aVar);
        q0 q0Var = (q0) aVar2.f3850e;
        Menu b0Var = (Menu) q0Var.get(menu);
        if (b0Var == null) {
            b0Var = new o.b0((Context) aVar2.f3848c, (o.m) menu);
            q0Var.put(menu, b0Var);
        }
        return callback.onPrepareActionMode(eVarT, b0Var);
    }

    @Override // ob.c
    public void c(qb.e eVar, qb.h hVar) {
    }

    @Override // ob.c
    public int c0(qb.h hVar) {
        return ob.h.Q(hVar);
    }

    public void c1(b4.j jVar) {
        b4.p pVar = (b4.p) this.f12991c;
        wb.b bVar = (wb.b) this.f12990b;
        int i7 = jVar.f1496b;
        if (i7 != 0) {
            pVar.execute(new b4.b(bVar, i7));
        } else {
            pVar.execute(new b4.a(0, bVar, jVar.f1495a));
        }
    }

    @Override // ob.c
    public qb.i d(r0 r0Var) {
        i9.l.e(r0Var, "$receiver");
        x0 x0VarI = r0Var.I();
        i9.l.d(x0VarI, "getVariance(...)");
        return r.q(x0VarI);
    }

    @Override // ob.c
    public nb.n0 d0(ab.b bVar) {
        return ob.h.S(bVar);
    }

    public bb.g d1(w wVar, ra.e eVar, ta.f fVar) {
        i9.l.e(eVar, "value");
        i9.l.e(fVar, "nameResolver");
        boolean zBooleanValue = ta.d.N.i(eVar.f11902m).booleanValue();
        ra.d dVar = eVar.f11893c;
        switch (dVar == null ? -1 : jb.b.f7003a[dVar.ordinal()]) {
            case 1:
                byte b10 = (byte) eVar.f11894d;
                return zBooleanValue ? new bb.y(b10) : new bb.d(b10);
            case 2:
                return new bb.e(Character.valueOf((char) eVar.f11894d));
            case 3:
                short s2 = (short) eVar.f11894d;
                return zBooleanValue ? new bb.y(s2) : new bb.v(s2);
            case 4:
                int i7 = (int) eVar.f11894d;
                return zBooleanValue ? new bb.y(i7) : new bb.k(i7);
            case 5:
                long j5 = eVar.f11894d;
                return zBooleanValue ? new bb.y(j5) : new bb.t(j5);
            case 6:
                return new bb.c(eVar.f11895e);
            case 7:
                return new bb.c(eVar.f11896f);
            case 8:
                return new bb.c(Boolean.valueOf(eVar.f11894d != 0));
            case 9:
                return new bb.w(fVar.getString(eVar.f11897g));
            case 10:
                return new bb.s(i2.c.D(fVar, eVar.f11898h), eVar.f11901l);
            case 11:
                return new bb.i(i2.c.D(fVar, eVar.f11898h), i2.c.G(fVar, eVar.f11899i));
            case 12:
                ra.h hVar = eVar.f11900j;
                i9.l.d(hVar, "getAnnotation(...)");
                return new bb.a((Object) C0(hVar, fVar));
            case 13:
                List<ra.e> list = eVar.k;
                i9.l.d(list, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList(u8.q.a0(list, 10));
                for (ra.e eVar2 : list) {
                    a0 a0VarE = ((y) this.f12990b).k().e();
                    i9.l.b(eVar2);
                    arrayList.add(d1(a0VarE, eVar2, fVar));
                }
                return new bb.x(arrayList, wVar);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + eVar.f11893c + " (expected " + wVar + ')').toString());
        }
    }

    @Override // ob.c
    public Collection e(qb.e eVar) {
        return ob.h.R(this, eVar);
    }

    @Override // ob.c
    public boolean e0(qb.e eVar) {
        i9.l.e(eVar, "<this>");
        return ob.h.f(eVar) != null;
    }

    @Override // ob.c
    public boolean f(qb.h hVar) {
        return ob.h.y(hVar);
    }

    @Override // ob.c
    public boolean f0(nb.n0 n0Var) {
        return ob.h.K(n0Var);
    }

    public int f1(n5.o oVar, n5.o oVar2) {
        t5.b bVar = (t5.b) this.f12990b;
        int i7 = (int) oVar.f8854a;
        int i10 = (int) oVar.f8855b;
        int i11 = (int) oVar2.f8854a;
        int i12 = (int) oVar2.f8855b;
        int i13 = 0;
        boolean z10 = Math.abs(i12 - i10) > Math.abs(i11 - i7);
        if (z10) {
            i7 = i10;
            i10 = i7;
            i11 = i12;
            i12 = i11;
        }
        int iAbs = Math.abs(i11 - i7);
        int iAbs2 = Math.abs(i12 - i10);
        int i14 = (-iAbs) / 2;
        int i15 = i10 < i12 ? 1 : -1;
        int i16 = i7 >= i11 ? -1 : 1;
        boolean zB = bVar.b(z10 ? i10 : i7, z10 ? i7 : i10);
        while (i7 != i11) {
            boolean zB2 = bVar.b(z10 ? i10 : i7, z10 ? i7 : i10);
            if (zB2 != zB) {
                i13++;
                zB = zB2;
            }
            i14 += iAbs2;
            if (i14 > 0) {
                if (i10 == i12) {
                    return i13;
                }
                i10 += i15;
                i14 -= iAbs;
            }
            i7 += i16;
        }
        return i13;
    }

    @Override // ob.c
    public qb.i g(nb.n0 n0Var) {
        return ob.h.t(n0Var);
    }

    @Override // ob.c
    public boolean g0(qb.h hVar) {
        return ob.h.G(hVar);
    }

    public t8.p g1(int i7) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i7 != -1) {
            ra.l0 l0Var = (ra.l0) ((ra.m0) this.f12991c).f12091b.get(i7);
            n0 n0Var = (n0) this.f12990b;
            String str = (String) n0Var.f12106b.get(l0Var.f12079d);
            ra.k0 k0Var = l0Var.f12080e;
            i9.l.b(k0Var);
            int iOrdinal = k0Var.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    throw new s();
                }
                linkedList2.addFirst(str);
                z10 = true;
            }
            i7 = l0Var.f12078c;
        }
        return new t8.p(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // ta.f
    public String getString(int i7) {
        String str = (String) ((n0) this.f12990b).f12106b.get(i7);
        i9.l.d(str, "getString(...)");
        return str;
    }

    @Override // ob.c
    public boolean h(qb.h hVar) {
        return ob.h.E(hVar);
    }

    @Override // ob.c
    public qb.c h0(qb.e eVar) {
        qb.f fVar;
        i9.l.e(eVar, "<this>");
        i9.l.e(eVar, "<this>");
        nb.l lVarF = ob.h.f(eVar);
        if (lVarF == null || (fVar = lVarF.f9015b) == null) {
            fVar = (qb.f) eVar;
        }
        return ob.h.e(this, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h1(float f10, n3.c cVar, cc.y yVar) {
        if (f10 <= cVar.R(h0.k0.f6333a)) {
            return;
        }
        p1.f fVarH = n4.e.h();
        y8.c cVar2 = null;
        Object[] objArr = 0;
        h9.k kVarE = fVarH != null ? fVarH.e() : null;
        p1.f fVarK = n4.e.k(fVarH);
        try {
            float fFloatValue = ((Number) ((v.k) this.f12991c).f13387b.getValue()).floatValue();
            o1 o1Var = (o1) this.f12990b;
            if (o1Var != null) {
                o1Var.a(null);
            }
            v.k kVar = (v.k) this.f12991c;
            if (kVar.f13391f) {
                this.f12991c = v.d.g(kVar, fFloatValue - f10);
            } else {
                this.f12991c = new v.k(v.d.f13345j, Float.valueOf(-f10), objArr == true ? 1 : 0, 60);
            }
            this.f12990b = cc.b0.s(yVar, null, new c1(this, cVar2, 17), 3);
        } finally {
            n4.e.r(fVarH, fVarK, kVarE);
        }
    }

    @Override // ob.c
    public boolean i(qb.h hVar, qb.h hVar2) {
        i9.l.e(hVar, "c1");
        i9.l.e(hVar2, "c2");
        if (!(hVar instanceof nb.k0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(hVar2 instanceof nb.k0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (ob.h.b(hVar, hVar2)) {
            return true;
        }
        nb.k0 k0Var = (nb.k0) hVar;
        nb.k0 k0Var2 = (nb.k0) hVar2;
        Map map = (Map) this.f12990b;
        if (((ob.d) this.f12991c).b(k0Var, k0Var2)) {
            return true;
        }
        if (map == null) {
            return false;
        }
        nb.k0 k0Var3 = (nb.k0) map.get(k0Var);
        nb.k0 k0Var4 = (nb.k0) map.get(k0Var2);
        if (k0Var3 == null || !k0Var3.equals(k0Var2)) {
            return k0Var4 != null && k0Var4.equals(k0Var);
        }
        return true;
    }

    @Override // ob.c
    public boolean i0(qb.e eVar) {
        i9.l.e(eVar, "<this>");
        a0 a0VarH = ob.h.h(eVar);
        return (a0VarH != null ? h0(a0VarH) : null) != null;
    }

    public void i1(a1 a1Var) {
        Object objG = ((s.h0) this.f12991c).g(a1Var);
        if (objG != null) {
            if (!(objG instanceof s.d0)) {
                throw new ClassCastException();
            }
            s.d0 d0Var = (s.d0) objG;
            Object[] objArr = d0Var.f12407a;
            if (d0Var.f12408b <= 0) {
                return;
            }
            i9.l.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    @Override // ob.c
    public boolean j(qb.c cVar) {
        return cVar instanceof ab.a;
    }

    @Override // ob.c
    public boolean j0(qb.h hVar) {
        return ob.h.D(hVar);
    }

    public da.a j1(wa.e eVar, String str) {
        i9.l.e(eVar, "name");
        String strB = eVar.b();
        i9.l.d(strB, "asString(...)");
        return new da.a(this, new pa.p(strB.concat(str)));
    }

    @Override // ob.c
    public r0 k(qb.h hVar, int i7) {
        return ob.h.q(hVar, i7);
    }

    @Override // ob.c
    public boolean k0(qb.h hVar) {
        return ob.h.x(hVar);
    }

    @Override // ob.c
    public boolean l(qb.d dVar) {
        return ob.h.F(dVar);
    }

    @Override // ob.c
    public a0 l0(nb.p pVar) {
        return ob.h.N(pVar);
    }

    @Override // o1.j
    public Object m(Object obj) {
        return ((h9.k) this.f12991c).invoke(obj);
    }

    @Override // ob.c
    public boolean m0(qb.d dVar) {
        i9.l.e(dVar, "<this>");
        return !i9.l.a(ob.h.V(C(dVar)), ob.h.V(D(dVar)));
    }

    @Override // ob.c
    public ob.j n(qb.c cVar) {
        return ob.h.W(cVar);
    }

    @Override // ob.c
    public int n0(qb.d dVar) {
        return ob.h.c(dVar);
    }

    @Override // ob.c
    public boolean o(qb.e eVar) {
        return ob.h.D(ob.h.V(eVar));
    }

    @Override // ob.c
    public boolean o0(qb.e eVar) {
        i9.l.e(eVar, "<this>");
        return ob.h.G(w0(eVar)) && !ob.h.H(eVar);
    }

    @Override // ob.c
    public qb.d p(qb.d dVar) {
        return ob.h.Z(this, dVar);
    }

    @Override // ta.f
    public boolean p0(int i7) {
        return ((Boolean) g1(i7).f12841c).booleanValue();
    }

    @Override // ob.c
    public boolean q(qb.h hVar) {
        return ob.h.A(hVar);
    }

    @Override // ob.c
    public void q0(qb.e eVar) {
        ob.h.M(eVar);
    }

    @Override // ob.c
    public boolean r(qb.e eVar, qb.e eVar2) {
        return ob.h.w(eVar, eVar2);
    }

    @Override // ob.c
    public boolean r0(qb.d dVar) {
        i9.l.e(dVar, "$receiver");
        return dVar instanceof oa.g;
    }

    @Override // ob.c
    public Collection s(qb.h hVar) {
        return ob.h.U(hVar);
    }

    @Override // ob.c
    public nb.w0 s0(qb.f fVar, qb.f fVar2) {
        return ob.h.m(this, fVar, fVar2);
    }

    @Override // ob.c
    public a0 t(qb.e eVar) {
        return ob.h.j(eVar);
    }

    @Override // ob.c
    public boolean t0(qb.h hVar) {
        return ob.h.z(hVar);
    }

    @Override // ac.h
    public ac.d toInstant() {
        throw new ac.e(((String) this.f12990b) + " when parsing an Instant from \"" + ac.f.l(64, (String) this.f12991c) + '\"');
    }

    public String toString() {
        switch (this.f12989a) {
            case 9:
                Formatter formatter = new Formatter();
                try {
                    int i7 = 0;
                    for (g6.a aVar : (g6.a[]) this.f12991c) {
                        if (aVar == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i7));
                            i7++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i7), Integer.valueOf(aVar.f5934f), Integer.valueOf(aVar.f5933e));
                            i7++;
                        }
                    }
                    String string = formatter.toString();
                    formatter.close();
                    return string;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            formatter.close();
                            break;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            default:
                return super.toString();
        }
    }

    @Override // ob.c
    public nb.k0 u(qb.e eVar) {
        return ob.h.V(eVar);
    }

    @Override // ob.c
    public void u0(qb.e eVar) {
        ob.h.L(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ob.c
    public nb.n0 v(qb.g gVar, int i7) {
        i9.l.e(gVar, "<this>");
        if (gVar instanceof qb.f) {
            return ob.h.p((qb.d) gVar, i7);
        }
        if (gVar instanceof qb.a) {
            E e7 = ((qb.a) gVar).get(i7);
            i9.l.d(e7, "get(...)");
            return (nb.n0) e7;
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + i9.y.f6689a.b(gVar.getClass())).toString());
    }

    @Override // ob.c
    public boolean v0(qb.e eVar) {
        i9.l.e(eVar, "<this>");
        return ob.h.y(ob.h.V(eVar));
    }

    @Override // ob.c
    public nb.w0 w(nb.n0 n0Var) {
        return ob.h.r(this, n0Var);
    }

    @Override // ob.c
    public nb.k0 w0(qb.d dVar) {
        i9.l.e(dVar, "<this>");
        a0 a0VarH = ob.h.h(dVar);
        if (a0VarH == null) {
            a0VarH = C(dVar);
        }
        return ob.h.V(a0VarH);
    }

    @Override // ob.c
    public qb.c x(a0 a0Var) {
        return ob.h.e(this, a0Var);
    }

    @Override // ob.c
    public a0 x0(qb.d dVar) {
        return ob.h.h(dVar);
    }

    @Override // ob.c
    public qb.g y(qb.e eVar) {
        return ob.h.d(eVar);
    }

    @Override // o6.a
    public void y0(ArrayList arrayList, ArrayList arrayList2) {
        Activity activity = (Activity) this.f12990b;
        String str = (String) this.f12991c;
        if (arrayList2.isEmpty()) {
            hc.c cVar = n8.c.f8897a;
            n8.c.j(0, str + " 权限获取成功");
            return;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            if (((z6.a) it.next()).s(activity)) {
                hc.c cVar2 = n8.c.f8897a;
                n8.c.j(1, str + " 权限获取失败，请手动开启");
                g5.a.o0(activity, new a2.d(3, activity), d7.a.k(activity, arrayList2, true), 1025, null);
                return;
            }
        }
        hc.c cVar3 = n8.c.f8897a;
        n8.c.j(0, str + " 权限获取失败");
    }

    @Override // ob.c
    public a0 z(nb.p pVar) {
        return ob.h.X(pVar);
    }

    @Override // ob.c
    public nb.p z0(qb.d dVar) {
        return ob.h.g(dVar);
    }
}
