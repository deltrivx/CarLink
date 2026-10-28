package da;

import aa.y0;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.lifecycle.i0;
import androidx.lifecycle.m0;
import androidx.lifecycle.r0;
import c1.a1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import l0.o0;
import p.i3;
import ra.g0;
import s.q0;
import v.x0;
import x9.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements jb.e, pa.n, pa.l, pa.m, s1.f, x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3850e;

    public a() {
        this.f3846a = 8;
        this.f3847b = new ArrayList();
        this.f3848c = new HashMap();
        this.f3849d = new HashMap();
    }

    public /* synthetic */ a(int i7, Object obj) {
        this.f3846a = i7;
        this.f3847b = obj;
    }

    public a(Context context, ActionMode.Callback callback) {
        this.f3846a = 6;
        this.f3848c = context;
        this.f3847b = callback;
        this.f3849d = new ArrayList();
        this.f3850e = new q0(0);
    }

    public a(Typeface typeface, m4.b bVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f3846a = 4;
        this.f3850e = typeface;
        this.f3847b = bVar;
        this.f3849d = new l4.t(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i13 = iA + bVar.f4317a;
            i7 = ((ByteBuffer) bVar.f4320d).getInt(((ByteBuffer) bVar.f4320d).getInt(i13) + i13);
        } else {
            i7 = 0;
        }
        this.f3848c = new char[i7 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + bVar.f4317a;
            i10 = ((ByteBuffer) bVar.f4320d).getInt(((ByteBuffer) bVar.f4320d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            l4.w wVar = new l4.w(this, i15);
            m4.a aVarB = wVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f4320d).getInt(iA3 + aVarB.f4317a) : 0, (char[]) this.f3848c, i15 * 2);
            m4.a aVarB2 = wVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i16 = iA4 + aVarB2.f4317a;
                i11 = ((ByteBuffer) aVarB2.f4320d).getInt(((ByteBuffer) aVarB2.f4320d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (!(i11 > 0)) {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
            l4.t tVar = (l4.t) this.f3849d;
            m4.a aVarB3 = wVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i17 = iA5 + aVarB3.f4317a;
                i12 = ((ByteBuffer) aVarB3.f4320d).getInt(((ByteBuffer) aVarB3.f4320d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            tVar.a(wVar, 0, i12 - 1);
        }
    }

    public a(r0 r0Var, androidx.lifecycle.q0 q0Var, u4.b bVar) {
        this.f3846a = 13;
        i9.l.e(r0Var, "store");
        i9.l.e(bVar, "defaultExtras");
        this.f3847b = r0Var;
        this.f3848c = q0Var;
        this.f3849d = bVar;
        this.f3850e = new n4.e(17);
    }

    public a(ja.a aVar, ja.f fVar, t8.h hVar) {
        this.f3846a = 1;
        i9.l.e(fVar, "typeParameterResolver");
        this.f3847b = aVar;
        this.f3848c = fVar;
        this.f3849d = hVar;
        this.f3850e = new a2.b(this, fVar);
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f3846a = i7;
        this.f3847b = obj;
        this.f3848c = obj2;
        this.f3849d = obj3;
        this.f3850e = obj4;
    }

    public a(k2.c0 c0Var) {
        this.f3846a = 3;
        this.f3850e = c0Var;
        this.f3848c = k2.a0.f7183a;
    }

    public a(lb.h hVar) {
        this.f3846a = 5;
        this.f3850e = hVar;
        List list = hVar.f8315e.f12054t;
        i9.l.d(list, "getEnumEntryList(...)");
        int iS0 = u8.c0.S0(u8.q.a0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS0 < 16 ? 16 : iS0);
        for (Object obj : list) {
            linkedHashMap.put(i2.c.G(hVar.f8321l.f7044b, ((ra.v) obj).f12226d), obj);
        }
        this.f3847b = linkedHashMap;
        lb.h hVar2 = (lb.h) this.f3850e;
        this.f3848c = hVar2.f8321l.f7043a.f7018a.c(new c8.y(7, this, hVar2));
        mb.k kVar = ((lb.h) this.f3850e).f8321l.f7043a.f7018a;
        aa.e eVar = new aa.e(16, this);
        kVar.getClass();
        this.f3849d = new mb.i(kVar, eVar);
    }

    public a(mb.k kVar, x9.y yVar) {
        this.f3846a = 16;
        i9.l.e(yVar, "module");
        this.f3847b = kVar;
        this.f3848c = yVar;
        this.f3849d = kVar.b(new x9.a0(this, 0));
        this.f3850e = kVar.b(new x9.a0(this, 1));
    }

    public a(i3 i3Var, a aVar, ArrayList arrayList) {
        this.f3846a = 10;
        this.f3848c = i3Var;
        this.f3849d = aVar;
        this.f3850e = arrayList;
        this.f3847b = i3Var;
    }

    public a(p.t tVar, wa.e eVar, i3 i3Var) {
        this.f3846a = 11;
        this.f3848c = tVar;
        this.f3849d = eVar;
        this.f3850e = i3Var;
        this.f3847b = new ArrayList();
    }

    public a(r2.u uVar, s1.l lVar) {
        this.f3846a = 12;
        this.f3847b = uVar;
        this.f3848c = lVar;
        AutofillManager autofillManagerG = k8.b.g(uVar.getContext().getSystemService(k8.b.m()));
        if (autofillManagerG == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f3849d = autofillManagerG;
        uVar.setImportantForAutofill(1);
        f4.e eVarK0 = n3.n.k0(uVar);
        AutofillId autofillIdF = eVarK0 != null ? s1.i.f(eVarK0.f5285a) : null;
        if (autofillIdF == null) {
            throw ob.a.o("Required value was null.");
        }
        this.f3850e = autofillIdF;
    }

    public a(g0 g0Var, u0.k kVar, sa.a aVar, jb.b0 b0Var) {
        this.f3846a = 2;
        this.f3847b = kVar;
        this.f3848c = aVar;
        this.f3849d = b0Var;
        List list = g0Var.f11955g;
        i9.l.d(list, "getClass_List(...)");
        int iS0 = u8.c0.S0(u8.q.a0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS0 < 16 ? 16 : iS0);
        for (Object obj : list) {
            linkedHashMap.put(i2.c.D((u0.k) this.f3847b, ((ra.k) obj).f12040e), obj);
        }
        this.f3850e = linkedHashMap;
    }

    public a(u0.k kVar, pa.p pVar) {
        this.f3846a = 9;
        this.f3850e = kVar;
        this.f3846a = 9;
        this.f3849d = kVar;
        this.f3847b = pVar;
        this.f3848c = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(v.w wVar) {
        this(14, new o0(25, wVar));
        this.f3846a = 14;
    }

    public boolean A(x9.q0 q0Var) {
        if (((x9.q0) this.f3848c).equals(q0Var)) {
            return true;
        }
        a aVar = (a) this.f3847b;
        return aVar != null ? aVar.A(q0Var) : false;
    }

    public void B(p4.z zVar) {
        p4.i iVar = zVar.f10282c;
        String str = iVar.f10180e;
        HashMap map = (HashMap) this.f3848c;
        if (map.get(str) != null) {
            return;
        }
        map.put(iVar.f10180e, zVar);
        if (iVar.B) {
            if (iVar.A) {
                ((p4.w) this.f3850e).c(iVar);
            } else {
                ((p4.w) this.f3850e).f(iVar);
            }
            iVar.B = false;
        }
        if (p4.u.D(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + iVar);
        }
    }

    public void C(p4.z zVar) {
        p4.i iVar = zVar.f10282c;
        if (iVar.A) {
            ((p4.w) this.f3850e).f(iVar);
        }
        if (((p4.z) ((HashMap) this.f3848c).put(iVar.f10180e, null)) != null && p4.u.D(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + iVar);
        }
    }

    public boolean D(n.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f3847b).onActionItemClicked(t(aVar), new o.t((Context) this.f3848c, (z3.a) menuItem));
    }

    public boolean E(n.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f3847b;
        n.e eVarT = t(aVar);
        q0 q0Var = (q0) this.f3850e;
        Menu b0Var = (Menu) q0Var.get(menu);
        if (b0Var == null) {
            b0Var = new o.b0((Context) this.f3848c, (o.m) menu);
            q0Var.put(menu, b0Var);
        }
        return callback.onCreateActionMode(eVarT, b0Var);
    }

    @Override // v.x0
    public v.p F(long j5, v.p pVar, v.p pVar2, v.p pVar3) {
        if (((v.p) this.f3848c) == null) {
            this.f3848c = pVar.c();
        }
        v.p pVar4 = (v.p) this.f3848c;
        if (pVar4 == null) {
            i9.l.j("valueVector");
            throw null;
        }
        int iB = pVar4.b();
        for (int i7 = 0; i7 < iB; i7++) {
            v.p pVar5 = (v.p) this.f3848c;
            if (pVar5 == null) {
                i9.l.j("valueVector");
                throw null;
            }
            pVar5.e(((o0) this.f3847b).X(i7).e(j5, pVar.a(i7), pVar2.a(i7), pVar3.a(i7)), i7);
        }
        v.p pVar6 = (v.p) this.f3848c;
        if (pVar6 != null) {
            return pVar6;
        }
        i9.l.j("valueVector");
        throw null;
    }

    public void G(k2.n nVar) {
        if (((k2.a0) this.f3848c) == k2.a0.f7184b) {
            o2.w wVar = (o2.w) this.f3847b;
            if (wVar == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            k2.u.g(nVar, wVar.E(0L), new k2.b0((k2.c0) this.f3850e, 1), true);
        }
        this.f3848c = k2.a0.f7185c;
    }

    public i3 H(int i7, wa.b bVar, ca.a aVar) {
        pa.p pVar = new pa.p(((pa.p) this.f3847b).f10353a + '@' + i7);
        u0.k kVar = (u0.k) this.f3850e;
        HashMap map = (HashMap) kVar.f12991c;
        List arrayList = (List) map.get(pVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(pVar, arrayList);
        }
        return ((p.t) kVar.f12990b).v(bVar, aVar, arrayList);
    }

    @Override // v.x0
    public v.p T(long j5, v.p pVar, v.p pVar2, v.p pVar3) {
        if (((v.p) this.f3849d) == null) {
            this.f3849d = pVar3.c();
        }
        v.p pVar4 = (v.p) this.f3849d;
        if (pVar4 == null) {
            i9.l.j("velocityVector");
            throw null;
        }
        int iB = pVar4.b();
        for (int i7 = 0; i7 < iB; i7++) {
            v.p pVar5 = (v.p) this.f3849d;
            if (pVar5 == null) {
                i9.l.j("velocityVector");
                throw null;
            }
            pVar5.e(((o0) this.f3847b).X(i7).a(j5, pVar.a(i7), pVar2.a(i7), pVar3.a(i7)), i7);
        }
        v.p pVar6 = (v.p) this.f3849d;
        if (pVar6 != null) {
            return pVar6;
        }
        i9.l.j("velocityVector");
        throw null;
    }

    @Override // v.x0
    public /* synthetic */ boolean a() {
        return false;
    }

    @Override // pa.l
    public void b() {
        switch (this.f3846a) {
            case 9:
                ArrayList arrayList = (ArrayList) this.f3848c;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((u0.k) this.f3849d).f12991c).put((pa.p) this.f3847b, arrayList);
                }
                break;
            case 10:
                ((i3) this.f3848c).b();
                ((ArrayList) ((a) this.f3849d).f3847b).add(new bb.a((y9.b) u8.p.A0((ArrayList) this.f3850e)));
                break;
            default:
                i3 i3Var = (i3) this.f3850e;
                wa.e eVar = (wa.e) this.f3849d;
                ArrayList arrayList2 = (ArrayList) this.f3847b;
                i3Var.getClass();
                i9.l.e(arrayList2, "elements");
                if (eVar != null) {
                    y0 y0VarH = g5.a.H(eVar, (x9.e) i3Var.f9788e);
                    if (y0VarH != null) {
                        HashMap map = (HashMap) i3Var.f9786c;
                        List listD = wb.l.d(arrayList2);
                        nb.w type = y0VarH.getType();
                        i9.l.d(type, "getType(...)");
                        map.put(eVar, new bb.x(listD, type));
                        break;
                    } else if (((p.t) i3Var.f9787d).t((wa.b) i3Var.f9789f) && i9.l.a(eVar.b(), "value")) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (obj instanceof bb.a) {
                                arrayList3.add(obj);
                            }
                        }
                        List list = (List) i3Var.f9790g;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            list.add((y9.b) ((bb.a) it.next()).f1683a);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // pa.m
    public void c(bb.f fVar) {
        ((ArrayList) this.f3847b).add(new bb.s(new bb.q(fVar)));
    }

    @Override // pa.m
    public pa.l d(wa.b bVar) {
        ArrayList arrayList = new ArrayList();
        return new a(((p.t) this.f3848c).u(bVar, n0.f14716e0, arrayList), this, arrayList);
    }

    @Override // pa.l
    public void e(wa.e eVar, bb.f fVar) {
        ((i3) this.f3847b).e(eVar, fVar);
    }

    @Override // pa.l
    public void f(wa.e eVar, wa.b bVar, wa.e eVar2) {
        ((i3) this.f3847b).f(eVar, bVar, eVar2);
    }

    @Override // pa.l
    public void g(wa.e eVar, Object obj) {
        ((i3) this.f3847b).g(eVar, obj);
    }

    @Override // pa.m
    public void h(Object obj) {
        ((ArrayList) this.f3847b).add(p.t.g((p.t) this.f3848c, (wa.e) this.f3849d, obj));
    }

    @Override // pa.l
    public pa.l i(wa.b bVar, wa.e eVar) {
        return ((i3) this.f3847b).i(bVar, eVar);
    }

    @Override // jb.e
    public jb.d j(wa.b bVar) {
        i9.l.e(bVar, "classId");
        ra.k kVar = (ra.k) ((LinkedHashMap) this.f3850e).get(bVar);
        if (kVar == null) {
            return null;
        }
        u0.k kVar2 = (u0.k) this.f3847b;
        sa.a aVar = (sa.a) this.f3848c;
        ((jb.b0) this.f3849d).invoke(bVar);
        return new jb.d(kVar2, kVar, aVar, n0.f14716e0);
    }

    @Override // pa.m
    public void k(wa.b bVar, wa.e eVar) {
        ((ArrayList) this.f3847b).add(new bb.i(bVar, eVar));
    }

    @Override // pa.n
    public pa.l l(wa.b bVar, ca.a aVar) {
        return ((p.t) ((u0.k) this.f3849d).f12990b).v(bVar, aVar, (ArrayList) this.f3848c);
    }

    @Override // pa.l
    public pa.m m(wa.e eVar) {
        return ((i3) this.f3847b).m(eVar);
    }

    public void n(p4.i iVar) {
        if (((ArrayList) this.f3847b).contains(iVar)) {
            throw new IllegalStateException("Fragment already added: " + iVar);
        }
        synchronized (((ArrayList) this.f3847b)) {
            ((ArrayList) this.f3847b).add(iVar);
        }
        iVar.k = true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public void o(k2.n nVar, boolean z10) {
        k2.c0 c0Var = (k2.c0) this.f3850e;
        ?? r8 = nVar.f7264a;
        int size = r8.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((k2.v) r8.get(i7)).b()) {
                G(nVar);
                return;
            }
        }
        o2.w wVar = (o2.w) this.f3847b;
        if (wVar == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        k2.u.g(nVar, wVar.E(0L), new a1(3, this, c0Var), false);
        if (((k2.a0) this.f3848c) == k2.a0.f7184b) {
            if (z10) {
                int size2 = r8.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((k2.v) r8.get(i10)).a();
                }
            }
            k2.i iVar = nVar.f7265b;
            if (iVar != null) {
                iVar.f7218a = !c0Var.f7195c;
            }
        }
    }

    public p4.i p(String str) {
        p4.z zVar = (p4.z) ((HashMap) this.f3848c).get(str);
        if (zVar != null) {
            return zVar.f10282c;
        }
        return null;
    }

    public p4.i q(String str) {
        for (p4.z zVar : ((HashMap) this.f3848c).values()) {
            if (zVar != null) {
                p4.i iVarQ = zVar.f10282c;
                if (!str.equals(iVarQ.f10180e)) {
                    iVarQ = iVarQ.f10194t.f10230c.q(str);
                }
                if (iVarQ != null) {
                    return iVarQ;
                }
            }
        }
        return null;
    }

    @Override // v.x0
    public long r(v.p pVar, v.p pVar2, v.p pVar3) {
        int iB = pVar.b();
        long jMax = 0;
        for (int i7 = 0; i7 < iB; i7++) {
            jMax = Math.max(jMax, ((o0) this.f3847b).X(i7).b(pVar.a(i7), pVar2.a(i7), pVar3.a(i7)));
        }
        return jMax;
    }

    @Override // v.x0
    public v.p s(v.p pVar, v.p pVar2, v.p pVar3) {
        if (((v.p) this.f3850e) == null) {
            this.f3850e = pVar3.c();
        }
        v.p pVar4 = (v.p) this.f3850e;
        if (pVar4 == null) {
            i9.l.j("endVelocityVector");
            throw null;
        }
        int iB = pVar4.b();
        for (int i7 = 0; i7 < iB; i7++) {
            v.p pVar5 = (v.p) this.f3850e;
            if (pVar5 == null) {
                i9.l.j("endVelocityVector");
                throw null;
            }
            pVar5.e(((o0) this.f3847b).X(i7).c(pVar.a(i7), pVar2.a(i7), pVar3.a(i7)), i7);
        }
        v.p pVar6 = (v.p) this.f3850e;
        if (pVar6 != null) {
            return pVar6;
        }
        i9.l.j("endVelocityVector");
        throw null;
    }

    public n.e t(n.a aVar) {
        ArrayList arrayList = (ArrayList) this.f3849d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            n.e eVar = (n.e) arrayList.get(i7);
            if (eVar != null && eVar.f8655b == aVar) {
                return eVar;
            }
        }
        n.e eVar2 = new n.e((Context) this.f3848c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList u() {
        ArrayList arrayList = new ArrayList();
        for (p4.z zVar : ((HashMap) this.f3848c).values()) {
            if (zVar != null) {
                arrayList.add(zVar);
            }
        }
        return arrayList;
    }

    public ArrayList v() {
        ArrayList arrayList = new ArrayList();
        for (p4.z zVar : ((HashMap) this.f3848c).values()) {
            if (zVar != null) {
                arrayList.add(zVar.f10282c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public x9.e w(wa.b bVar, List list) {
        i9.l.e(bVar, "classId");
        return (x9.e) ((mb.e) this.f3850e).invoke(new x9.b0(bVar, list));
    }

    public List x() {
        ArrayList arrayList;
        if (((ArrayList) this.f3847b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f3847b)) {
            arrayList = new ArrayList((ArrayList) this.f3847b);
        }
        return arrayList;
    }

    public v.p y(long j5, v.p pVar, v.p pVar2) {
        if (((v.p) this.f3849d) == null) {
            this.f3849d = pVar.c();
        }
        v.p pVar3 = (v.p) this.f3849d;
        if (pVar3 == null) {
            i9.l.j("velocityVector");
            throw null;
        }
        int iB = pVar3.b();
        for (int i7 = 0; i7 < iB; i7++) {
            v.p pVar4 = (v.p) this.f3849d;
            if (pVar4 == null) {
                i9.l.j("velocityVector");
                throw null;
            }
            o0 o0Var = (o0) this.f3847b;
            pVar.getClass();
            long j10 = j5 / 1000000;
            u.d dVarA = ((u.e) o0Var.f7772b).a(pVar2.a(i7));
            long j11 = dVarA.f12961c;
            pVar4.e((((Math.signum(dVarA.f12959a) * u.b.a(j11 > 0 ? j10 / j11 : 1.0f).f12956b) * dVarA.f12960b) / j11) * 1000.0f, i7);
        }
        v.p pVar5 = (v.p) this.f3849d;
        if (pVar5 != null) {
            return pVar5;
        }
        i9.l.j("velocityVector");
        throw null;
    }

    public androidx.lifecycle.o0 z(String str, o9.c cVar) {
        androidx.lifecycle.o0 o0Var;
        androidx.lifecycle.o0 o0VarA;
        i9.l.e(str, "key");
        synchronized (((n4.e) this.f3850e)) {
            try {
                r0 r0Var = (r0) this.f3847b;
                r0Var.getClass();
                o0Var = (androidx.lifecycle.o0) r0Var.f1067a.get(str);
                if (cVar.m(o0Var)) {
                    androidx.lifecycle.q0 q0Var = (androidx.lifecycle.q0) this.f3848c;
                    if (q0Var instanceof m0) {
                        m0 m0Var = (m0) q0Var;
                        i9.l.b(o0Var);
                        androidx.lifecycle.v vVar = m0Var.f1052d;
                        if (vVar != null) {
                            android.support.v4.media.session.r rVar = m0Var.f1053e;
                            i9.l.b(rVar);
                            i0.a(o0Var, rVar, vVar);
                        }
                    }
                    i9.l.c(o0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    u4.c cVar2 = new u4.c((u4.b) this.f3849d);
                    cVar2.f13062a.put(i0.f1040d, str);
                    androidx.lifecycle.q0 q0Var2 = (androidx.lifecycle.q0) this.f3848c;
                    try {
                        try {
                            o0VarA = q0Var2.f(cVar, cVar2);
                        } catch (AbstractMethodError unused) {
                            o0VarA = q0Var2.c(g5.a.L(cVar), cVar2);
                        }
                    } catch (AbstractMethodError unused2) {
                        o0VarA = q0Var2.a(g5.a.L(cVar));
                    }
                    o0Var = o0VarA;
                    r0 r0Var2 = (r0) this.f3847b;
                    r0Var2.getClass();
                    i9.l.e(o0Var, "viewModel");
                    androidx.lifecycle.o0 o0Var2 = (androidx.lifecycle.o0) r0Var2.f1067a.put(str, o0Var);
                    if (o0Var2 != null) {
                        o0Var2.a();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0Var;
    }
}
