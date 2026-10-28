package f1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4886a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0 f4887b = new i0();

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(u1 u1Var, h9.n nVar, s sVar, int i7) {
        z2 z2Var;
        boolean z10;
        w1 w1VarR;
        sVar.Y(-149765515);
        o0 o0Var = sVar.f5128x;
        q1 q1VarL = sVar.l();
        sVar.T(201, t.f5143b);
        Object objK = sVar.K();
        if (i9.l.a(objK, n.f5051a)) {
            z2Var = null;
        } else {
            i9.l.c(objK, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            z2Var = (z2) objK;
        }
        t1 t1Var = (t1) u1Var.f5162d;
        z2 z2VarC = t1Var.c(u1Var, z2Var);
        boolean zEquals = z2VarC.equals(z2Var);
        if (!zEquals) {
            sVar.h0(z2VarC);
        }
        if (!sVar.S) {
            h2 h2Var = sVar.G;
            Object objB = h2Var.b(h2Var.f4971b, h2Var.f4976g);
            i9.l.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            q1 q1Var = (q1) objB;
            if (!(sVar.z() && zEquals) && (u1Var.f5161c || !((n1.g) q1VarL).containsKey(t1Var))) {
                q1VarL = ((n1.g) q1VarL).c(t1Var, z2VarC);
            } else if ((zEquals && !sVar.f5127w) || !sVar.f5127w) {
                q1VarL = q1Var;
            }
            z10 = sVar.f5129y || q1Var != q1VarL;
            if (z10 && !sVar.S) {
                sVar.I(q1VarL);
            }
            o0Var.c(sVar.f5127w ? 1 : 0);
            sVar.f5127w = z10;
            sVar.K = q1VarL;
            sVar.R(202, 0, t.f5144c, q1VarL);
            nVar.invoke(sVar, Integer.valueOf((i7 >> 3) & 14));
            sVar.p(false);
            sVar.p(false);
            sVar.f5127w = o0Var.b() != 0;
            sVar.K = null;
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new f0.h(i7, 1, u1Var, nVar);
            }
        }
        if (u1Var.f5161c || !((n1.g) q1VarL).containsKey(t1Var)) {
            q1VarL = ((n1.g) q1VarL).c(t1Var, z2VarC);
        }
        sVar.J = true;
        if (z10) {
            sVar.I(q1VarL);
        }
        o0Var.c(sVar.f5127w ? 1 : 0);
        sVar.f5127w = z10;
        sVar.K = q1VarL;
        sVar.R(202, 0, t.f5144c, q1VarL);
        nVar.invoke(sVar, Integer.valueOf((i7 >> 3) & 14));
        sVar.p(false);
        sVar.p(false);
        sVar.f5127w = o0Var.b() != 0;
        sVar.K = null;
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.h(i7, 1, u1Var, nVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void b(u1[] u1VarArr, h9.n nVar, s sVar, int i7) {
        q1 q1VarG0;
        boolean z10;
        w1 w1VarR;
        sVar.Y(415205898);
        o0 o0Var = sVar.f5128x;
        q1 q1VarL = sVar.l();
        sVar.T(201, t.f5143b);
        if (sVar.S) {
            q1VarG0 = sVar.g0(q1VarL, z(u1VarArr, q1VarL, n1.g.f8712d));
            sVar.J = true;
        } else {
            h2 h2Var = sVar.G;
            Object objH = h2Var.h(h2Var.f4976g, 0);
            i9.l.c(objH, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            q1 q1Var = (q1) objH;
            h2 h2Var2 = sVar.G;
            Object objH2 = h2Var2.h(h2Var2.f4976g, 1);
            i9.l.c(objH2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            q1 q1Var2 = (q1) objH2;
            n1.g gVarZ = z(u1VarArr, q1VarL, q1Var2);
            if (!sVar.z() || sVar.f5129y || !q1Var2.equals(gVarZ)) {
                q1VarG0 = sVar.g0(q1VarL, gVarZ);
                z10 = sVar.f5129y || !i9.l.a(q1VarG0, q1Var);
                if (z10 && !sVar.S) {
                    sVar.I(q1VarG0);
                }
                o0Var.c(sVar.f5127w ? 1 : 0);
                sVar.f5127w = z10;
                sVar.K = q1VarG0;
                sVar.R(202, 0, t.f5144c, q1VarG0);
                nVar.invoke(sVar, Integer.valueOf((i7 >> 3) & 14));
                sVar.p(false);
                sVar.p(false);
                sVar.f5127w = o0Var.b() != 0;
                sVar.K = null;
                w1VarR = sVar.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new f0.h(i7, 2, u1VarArr, nVar);
                }
            }
            sVar.f5116l = sVar.G.s() + sVar.f5116l;
            q1VarG0 = q1Var;
        }
        if (z10) {
            sVar.I(q1VarG0);
        }
        o0Var.c(sVar.f5127w ? 1 : 0);
        sVar.f5127w = z10;
        sVar.K = q1VarG0;
        sVar.R(202, 0, t.f5144c, q1VarG0);
        nVar.invoke(sVar, Integer.valueOf((i7 >> 3) & 14));
        sVar.p(false);
        sVar.p(false);
        sVar.f5127w = o0Var.b() != 0;
        sVar.K = null;
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new f0.h(i7, 2, u1VarArr, nVar);
        }
    }

    public static final void c(Object obj, h9.k kVar, s sVar) {
        boolean zF = sVar.f(obj);
        Object objK = sVar.K();
        if (zF || objK == n.f5051a) {
            objK = new g0(kVar);
            sVar.h0(objK);
        }
    }

    public static final void d(Object obj, Object obj2, h9.k kVar, s sVar) {
        boolean zF = sVar.f(obj) | sVar.f(obj2);
        Object objK = sVar.K();
        if (zF || objK == n.f5051a) {
            objK = new g0(kVar);
            sVar.h0(objK);
        }
    }

    public static final void e(Object[] objArr, h9.k kVar, s sVar) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= sVar.f(obj);
        }
        Object objK = sVar.K();
        if (zF || objK == n.f5051a) {
            sVar.h0(new g0(kVar));
        }
    }

    public static final void f(s sVar, h9.n nVar, Object obj) {
        y8.h hVar = sVar.R;
        boolean zF = sVar.f(obj);
        Object objK = sVar.K();
        if (zF || objK == n.f5051a) {
            objK = new u0(hVar, nVar);
            sVar.h0(objK);
        }
    }

    public static final void g(Object obj, Object obj2, h9.n nVar, s sVar) {
        y8.h hVar = sVar.R;
        boolean zF = sVar.f(obj) | sVar.f(obj2);
        Object objK = sVar.K();
        if (zF || objK == n.f5051a) {
            objK = new u0(hVar, nVar);
            sVar.h0(objK);
        }
    }

    public static final void h(h9.a aVar, s sVar) {
        g1.l0 l0Var = sVar.M.f5764b.f5761g;
        l0Var.a0(g1.b0.f5774d);
        k9.a.Q(l0Var, 0, aVar);
    }

    public static final void i(s.v vVar, int i7) {
        if (vVar.f12509b == 0 || !(vVar.b(0) == i7 || vVar.b(vVar.f12509b - 1) == i7)) {
            int i10 = vVar.f12509b;
            vVar.a(i7);
            while (i10 > 0) {
                int i11 = ((i10 + 1) >>> 1) - 1;
                int iB = vVar.b(i11);
                if (i7 <= iB) {
                    break;
                }
                vVar.d(i10, iB);
                i10 = i11;
            }
            vVar.d(i10, i7);
        }
    }

    public static void j(l2 l2Var, List list, y yVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            int iC = l2Var.c((a) list.get(i7));
            int iM = l2Var.M(l2Var.f5019b, l2Var.r(iC));
            Object obj = iM < l2Var.g(l2Var.f5019b, l2Var.r(iC + 1)) ? l2Var.f5020c[l2Var.h(iM)] : n.f5051a;
            w1 w1Var = obj instanceof w1 ? (w1) obj : null;
            if (w1Var != null) {
                w1Var.f5189a = yVar;
            }
        }
    }

    public static final b1 k(fc.f0 f0Var, s sVar) {
        Object value = f0Var.getValue();
        Object obj = y8.i.f15108a;
        boolean zH = sVar.h(obj) | sVar.h(f0Var);
        Object objK = sVar.K();
        y8.c cVar = null;
        Object obj2 = n.f5051a;
        if (zH || objK == obj2) {
            objK = new b1.f(obj, f0Var, cVar, 2);
            sVar.h0(objK);
        }
        h9.n nVar = (h9.n) objK;
        Object objK2 = sVar.K();
        if (objK2 == obj2) {
            objK2 = s(value);
            sVar.h0(objK2);
        }
        b1 b1Var = (b1) objK2;
        boolean zH2 = sVar.h(nVar);
        Object objK3 = sVar.K();
        if (zH2 || objK3 == obj2) {
            objK3 = new s2(nVar, b1Var, cVar, 1);
            sVar.h0(objK3);
        }
        g(f0Var, obj, (h9.n) objK3, sVar);
        return b1Var;
    }

    public static final cc.y l(s sVar) {
        return new g2(sVar.R);
    }

    public static final h1.e m() {
        a2.b bVar = r2.f5105b;
        h1.e eVar = (h1.e) bVar.y();
        if (eVar != null) {
            return eVar;
        }
        h1.e eVar2 = new h1.e(new r[0]);
        bVar.X(eVar2);
        return eVar2;
    }

    public static final f0 n(q2 q2Var, h9.a aVar) {
        a2.b bVar = r2.f5104a;
        return new f0(q2Var, aVar);
    }

    public static final f0 o(h9.a aVar) {
        a2.b bVar = r2.f5104a;
        return new f0(null, aVar);
    }

    public static final int p(s sVar) {
        long j5 = sVar.T;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static final x0 q(y8.h hVar) {
        x0 x0Var = (x0) hVar.l(w0.f5183b);
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static List r(l2 l2Var, int i7, l2 l2Var2, boolean z10, boolean z11, boolean z12) {
        List list;
        boolean z13;
        int iT = l2Var.t(i7);
        int i10 = i7 + iT;
        int iF = l2Var.f(i7);
        int iF2 = l2Var.f(i10);
        int i11 = iF2 - iF;
        boolean z14 = i7 >= 0 && (l2Var.f5019b[(l2Var.r(i7) * 5) + 1] & 201326592) != 0;
        l2Var2.v(iT);
        l2Var2.w(i11, l2Var2.f5036t);
        if (l2Var.f5024g < i10) {
            l2Var.A(i10);
        }
        if (l2Var.k < iF2) {
            l2Var.B(iF2, i10);
        }
        int[] iArr = l2Var2.f5019b;
        int i12 = l2Var2.f5036t;
        int i13 = i12 * 5;
        u8.l.m0(i13, i7 * 5, i10 * 5, l2Var.f5019b, iArr);
        Object[] objArr = l2Var2.f5020c;
        int i14 = l2Var2.f5026i;
        System.arraycopy(l2Var.f5020c, iF, objArr, i14, i11);
        int i15 = l2Var2.f5038v;
        iArr[i13 + 2] = i15;
        int i16 = i12 - i7;
        int i17 = i12 + iT;
        int iG = i14 - l2Var2.g(iArr, i12);
        int i18 = l2Var2.f5029m;
        int i19 = l2Var2.f5028l;
        int length = objArr.length;
        boolean z15 = z14;
        int i20 = i18;
        int i21 = i12;
        while (i21 < i17) {
            if (i21 != i12) {
                int i22 = (i21 * 5) + 2;
                iArr[i22] = iArr[i22] + i16;
            }
            int[] iArr2 = iArr;
            iArr2[(i21 * 5) + 4] = l2.i(l2Var2.g(iArr, i21) + iG, i20 < i21 ? 0 : l2Var2.k, i19, length);
            if (i21 == i20) {
                i20++;
            }
            i21++;
            i12 = i12;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        l2Var2.f5029m = i20;
        int iB = k2.b(l2Var.f5021d, i7, l2Var.p());
        int iB2 = k2.b(l2Var.f5021d, i10, l2Var.p());
        if (iB < iB2) {
            ArrayList arrayList = l2Var.f5021d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i23 = iB; i23 < iB2; i23++) {
                a aVar = (a) arrayList.get(i23);
                aVar.f4875a += i16;
                arrayList2.add(aVar);
            }
            l2Var2.f5021d.addAll(k2.b(l2Var2.f5021d, l2Var2.f5036t, l2Var2.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = u8.w.f13122a;
        }
        if (!list.isEmpty()) {
            HashMap map = l2Var.f5022e;
            HashMap map2 = l2Var2.f5022e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i24 = 0; i24 < size; i24++) {
                }
            }
        }
        int i25 = l2Var2.f5038v;
        l2Var2.N(i15);
        int iD = l2Var.D(l2Var.f5019b, i7);
        if (!z12) {
            z13 = false;
        } else if (z10) {
            boolean z16 = iD >= 0;
            if (z16) {
                l2Var.O();
                l2Var.a(iD - l2Var.f5036t);
                l2Var.O();
            }
            l2Var.a(i7 - l2Var.f5036t);
            boolean zG = l2Var.G();
            if (z16) {
                l2Var.L();
                l2Var.j();
                l2Var.L();
                l2Var.j();
            }
            z13 = zG;
        } else {
            boolean zH = l2Var.H(i7, iT);
            l2Var.I(iF, i11, i7 - 1);
            z13 = zH;
        }
        if (z13) {
            t.c("Unexpectedly removed anchors");
        }
        int i26 = l2Var2.f5031o;
        int i27 = iArr3[i13 + 1];
        l2Var2.f5031o = i26 + ((1073741824 & i27) != 0 ? 1 : i27 & 67108863);
        if (z11) {
            l2Var2.f5036t = i17;
            l2Var2.f5026i = i14 + i11;
        }
        if (z15) {
            l2Var2.S(i15);
        }
        return list;
    }

    public static k1 s(Object obj) {
        return new k1(obj, w0.f5187f);
    }

    public static final Object t(q1 q1Var, t1 t1Var) {
        i9.l.c(t1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        n1.g gVar = (n1.g) q1Var;
        Object objB = gVar.get(t1Var);
        if (objB == null) {
            objB = t1Var.b();
        }
        return ((z2) objB).a(gVar);
    }

    public static final q u(s sVar) {
        s sVar2;
        sVar.T(206, t.f5146e);
        if (sVar.S) {
            l2.y(sVar.I);
        }
        Object objC = sVar.C();
        p pVar = objC instanceof p ? (p) objC : null;
        if (pVar == null) {
            sVar2 = sVar;
            pVar = new p(new q(sVar2, sVar.T, sVar.f5121q, sVar.C, sVar.f5113h.f5222t));
            sVar2.i0(pVar);
        } else {
            sVar2 = sVar;
        }
        q qVar = pVar.f5077a;
        qVar.f5093f.setValue(sVar2.l());
        sVar2.p(false);
        return qVar;
    }

    public static final b1 v(Object obj, s sVar) {
        Object objK = sVar.K();
        if (objK == n.f5051a) {
            objK = s(obj);
            sVar.h0(objK);
        }
        b1 b1Var = (b1) objK;
        b1Var.setValue(obj);
        return b1Var;
    }

    public static final void w(s sVar, h9.n nVar, Object obj) {
        if (sVar.S || !i9.l.a(sVar.K(), obj)) {
            sVar.h0(obj);
            sVar.b(nVar, obj);
        }
    }

    public static final int x(s.v vVar) {
        int iB;
        int i7 = vVar.f12509b;
        int iB2 = vVar.b(0);
        while (vVar.f12509b != 0 && vVar.b(0) == iB2) {
            int i10 = vVar.f12509b;
            if (i10 == 0) {
                t.a.e("IntList is empty.");
                throw null;
            }
            vVar.d(0, vVar.f12508a[i10 - 1]);
            vVar.c(vVar.f12509b - 1);
            int i11 = vVar.f12509b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iB3 = vVar.b(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iB4 = vVar.b(i15);
                if (i14 < i11 && (iB = vVar.b(i14)) > iB4) {
                    if (iB <= iB3) {
                        break;
                    }
                    vVar.d(i13, iB);
                    vVar.d(i14, iB3);
                    i13 = i14;
                } else {
                    if (iB4 <= iB3) {
                        break;
                    }
                    vVar.d(i13, iB4);
                    vVar.d(i15, iB3);
                    i13 = i15;
                }
            }
        }
        return iB2;
    }

    public static final int y(int i7) {
        int i10 = 306783378 & i7;
        int i11 = 613566756 & i7;
        return (i7 & (-920350135)) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }

    public static final n1.g z(u1[] u1VarArr, q1 q1Var, q1 q1Var2) {
        n1.g gVar = n1.g.f8712d;
        n1.f fVar = new n1.f(gVar);
        fVar.f8711g = gVar;
        for (u1 u1Var : u1VarArr) {
            t1 t1Var = (t1) u1Var.f5162d;
            if (u1Var.f5161c || !((n1.g) q1Var).containsKey(t1Var)) {
                fVar.put(t1Var, t1Var.c(u1Var, (z2) ((n1.g) q1Var2).get(t1Var)));
            }
        }
        return fVar.build();
    }
}
