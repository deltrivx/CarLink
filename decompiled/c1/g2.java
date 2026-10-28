package c1;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f1892a = e1.m.f4022d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f1893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f1894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f1895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f1896e;

    static {
        float f10 = e1.m.f4021c;
        f1893b = f10;
        f1894c = k9.a.b(f10, e1.m.f4020b);
        f1895d = e1.m.f4019a;
        f1896e = 2;
    }

    public static final void a(float f10, h9.k kVar, r1.p pVar, boolean z10, h9.a aVar, m1 m1Var, b0.k kVar2, int i7, n1.c cVar, n1.c cVar2, n9.a aVar2, f1.s sVar, int i10, int i11) {
        int i12;
        m1 m1Var2;
        b0.k kVar3;
        n1.c cVar3;
        int i13;
        sVar.Y(1191170377);
        if ((i10 & 6) == 0) {
            i12 = (sVar.c(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= sVar.h(kVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= sVar.f(pVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= sVar.g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= sVar.h(aVar) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i10) == 0) {
            m1Var2 = m1Var;
            i12 |= sVar.f(m1Var2) ? 131072 : 65536;
        } else {
            m1Var2 = m1Var;
        }
        if ((1572864 & i10) == 0) {
            kVar3 = kVar2;
            i12 |= sVar.f(kVar3) ? 1048576 : 524288;
        } else {
            kVar3 = kVar2;
        }
        if ((12582912 & i10) == 0) {
            i12 |= sVar.d(i7) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            cVar3 = cVar;
            i12 |= sVar.h(cVar3) ? 67108864 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        } else {
            cVar3 = cVar;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= sVar.h(cVar2) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (sVar.f(aVar2) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i10 & 1) != 0 && !sVar.x()) {
                sVar.Q();
            }
            sVar.q();
            boolean z11 = ((29360128 & i12) == 8388608) | ((((i13 & 14) ^ 6) > 4 && sVar.f(aVar2)) || (i13 & 6) == 4);
            Object objK = sVar.K();
            if (z11 || objK == f1.n.f5051a) {
                objK = new i2(f10, i7, aVar, aVar2);
                sVar.h0(objK);
            }
            i2 i2Var = (i2) objK;
            i2Var.f1923b = aVar;
            i2Var.f1926e = kVar;
            i2Var.c(f10);
            int i14 = ((i12 >> 3) & 1008) | ((i12 >> 6) & 57344);
            int i15 = i12 >> 9;
            c(i2Var, pVar, z10, null, kVar3, cVar3, cVar2, sVar, i14 | (458752 & i15) | (i15 & 3670016));
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new y1(f10, kVar, pVar, z10, aVar, m1Var2, kVar2, i7, cVar, cVar2, aVar2, i10, i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void b(float f10, h9.k kVar, r1.p pVar, boolean z10, n9.a aVar, int i7, h9.a aVar2, m1 m1Var, b0.k kVar2, f1.s sVar, int i10, int i11) {
        h9.a aVar3;
        int i12;
        int i13;
        Object objK;
        boolean z11;
        m1 m1Var2;
        b0.k kVar3;
        h9.a aVar4;
        m1 m1Var3;
        b0.k kVar4;
        boolean z12;
        f1.w1 w1VarR;
        sVar.Y(-202044027);
        int i14 = (sVar.c(f10) ? 4 : 2) | i10;
        if ((i10 & 384) == 0) {
            i14 |= sVar.f(pVar) ? 256 : 128;
        }
        int i15 = i14 | 3072 | (sVar.f(aVar) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
        if ((196608 & i10) == 0) {
            i15 |= sVar.d(i7) ? 131072 : 65536;
        }
        int i16 = i11 & 64;
        if (i16 == 0) {
            if ((i10 & 1572864) == 0) {
                aVar3 = aVar2;
                i15 |= sVar.h(aVar3) ? 1048576 : 524288;
            }
            i12 = i15 | 104857600;
            if ((38347923 & i12) == 38347922 || !sVar.z()) {
                sVar.S();
                if ((i10 & 1) != 0 || sVar.x()) {
                    if (i16 != 0) {
                        aVar3 = null;
                    }
                    t1 t1Var = t1.f2165a;
                    m1 m1VarC = t1.c(sVar);
                    i13 = i12 & (-29360129);
                    objK = sVar.K();
                    if (objK == f1.n.f5051a) {
                        objK = ob.a.m(sVar);
                    }
                    z11 = true;
                    m1Var2 = m1VarC;
                    kVar3 = (b0.k) objK;
                } else {
                    sVar.Q();
                    i13 = i12 & (-29360129);
                    z11 = z10;
                    m1Var2 = m1Var;
                    kVar3 = kVar2;
                }
                sVar.q();
                boolean z13 = z11;
                a(f10, kVar, pVar, z13, aVar3, m1Var2, kVar3, i7, n1.h.e(308249025, new v1(kVar3, m1Var2, z11), sVar), n1.h.e(-1843234110, new w1(m1Var2, z11), sVar), aVar, sVar, 1572864 | (i13 & 14) | 905969712 | (i13 & 896) | 3072 | ((i13 >> 6) & 57344) | (29360128 & (i13 << 6)), (i13 >> 12) & 14);
                aVar4 = aVar3;
                m1Var3 = m1Var2;
                kVar4 = kVar3;
                z12 = z13;
            } else {
                sVar.Q();
                m1Var3 = m1Var;
                kVar4 = kVar2;
                aVar4 = aVar3;
                z12 = z10;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new x1(f10, kVar, pVar, z12, aVar, i7, aVar4, m1Var3, kVar4, i10, i11);
            }
        }
        i15 |= 1572864;
        aVar3 = aVar2;
        i12 = i15 | 104857600;
        if ((38347923 & i12) == 38347922) {
            sVar.S();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    aVar3 = null;
                }
                t1 t1Var2 = t1.f2165a;
                m1 m1VarC2 = t1.c(sVar);
                i13 = i12 & (-29360129);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = ob.a.m(sVar);
                }
                z11 = true;
                m1Var2 = m1VarC2;
                kVar3 = (b0.k) objK;
            } else {
                if (i16 != 0) {
                    aVar3 = null;
                }
                t1 t1Var3 = t1.f2165a;
                m1 m1VarC3 = t1.c(sVar);
                i13 = i12 & (-29360129);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = ob.a.m(sVar);
                }
                z11 = true;
                m1Var2 = m1VarC3;
                kVar3 = (b0.k) objK;
            }
            sVar.q();
            boolean z14 = z11;
            a(f10, kVar, pVar, z14, aVar3, m1Var2, kVar3, i7, n1.h.e(308249025, new v1(kVar3, m1Var2, z11), sVar), n1.h.e(-1843234110, new w1(m1Var2, z11), sVar), aVar, sVar, 1572864 | (i13 & 14) | 905969712 | (i13 & 896) | 3072 | ((i13 >> 6) & 57344) | (29360128 & (i13 << 6)), (i13 >> 12) & 14);
            aVar4 = aVar3;
            m1Var3 = m1Var2;
            kVar4 = kVar3;
            z12 = z14;
        } else {
            sVar.S();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    aVar3 = null;
                }
                t1 t1Var4 = t1.f2165a;
                m1 m1VarC4 = t1.c(sVar);
                i13 = i12 & (-29360129);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = ob.a.m(sVar);
                }
                z11 = true;
                m1Var2 = m1VarC4;
                kVar3 = (b0.k) objK;
            } else {
                if (i16 != 0) {
                    aVar3 = null;
                }
                t1 t1Var5 = t1.f2165a;
                m1 m1VarC5 = t1.c(sVar);
                i13 = i12 & (-29360129);
                objK = sVar.K();
                if (objK == f1.n.f5051a) {
                    objK = ob.a.m(sVar);
                }
                z11 = true;
                m1Var2 = m1VarC5;
                kVar3 = (b0.k) objK;
            }
            sVar.q();
            boolean z15 = z11;
            a(f10, kVar, pVar, z15, aVar3, m1Var2, kVar3, i7, n1.h.e(308249025, new v1(kVar3, m1Var2, z11), sVar), n1.h.e(-1843234110, new w1(m1Var2, z11), sVar), aVar, sVar, 1572864 | (i13 & 14) | 905969712 | (i13 & 896) | 3072 | ((i13 >> 6) & 57344) | (29360128 & (i13 << 6)), (i13 >> 12) & 14);
            aVar4 = aVar3;
            m1Var3 = m1Var2;
            kVar4 = kVar3;
            z12 = z15;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new x1(f10, kVar, pVar, z12, aVar, i7, aVar4, m1Var3, kVar4, i10, i11);
        }
    }

    public static final void c(i2 i2Var, r1.p pVar, boolean z10, m1 m1Var, b0.k kVar, n1.c cVar, n1.c cVar2, f1.s sVar, int i7) {
        int i10;
        int i11;
        m1 m1VarC;
        m1 m1Var2;
        sVar.Y(-1303883986);
        if ((i7 & 6) == 0) {
            i10 = (sVar.h(i2Var) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(pVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.g(z10) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= sVar.f(kVar) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i7) == 0) {
            i10 |= sVar.h(cVar) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i10 |= sVar.h(cVar2) ? 1048576 : 524288;
        }
        if ((599187 & i10) == 599186 && sVar.z()) {
            sVar.Q();
            m1Var2 = m1Var;
        } else {
            sVar.S();
            if ((i7 & 1) == 0 || sVar.x()) {
                t1 t1Var = t1.f2165a;
                i11 = i10 & (-7169);
                m1VarC = t1.c(sVar);
            } else {
                sVar.Q();
                i11 = i10 & (-7169);
                m1VarC = m1Var;
            }
            sVar.q();
            if (i2Var.f1922a < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            int i12 = i11 >> 3;
            d(pVar, i2Var, z10, kVar, cVar, cVar2, sVar, (i11 & 896) | (i12 & 14) | ((i11 << 3) & 112) | (i12 & 7168) | (57344 & i12) | (i12 & 458752));
            m1Var2 = m1VarC;
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new u1(i2Var, pVar, z10, m1Var2, kVar, cVar, cVar2, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(r1.p pVar, i2 i2Var, boolean z10, b0.k kVar, n1.c cVar, n1.c cVar2, f1.s sVar, int i7) {
        int i10;
        r1.p suspendPointerInputElement;
        boolean z11;
        i2 i2Var2 = i2Var;
        sVar.Y(1390990089);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(i2Var2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.g(z10) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.f(kVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= sVar.h(cVar) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i7) == 0) {
            i10 |= sVar.h(cVar2) ? 131072 : 65536;
        }
        int i11 = i10;
        if ((74899 & i11) == 74898 && sVar.z()) {
            sVar.Q();
        } else {
            i2Var2.f1929h = sVar.j(r2.j1.f11281n) == n3.o.f8750b;
            y8.c cVar3 = null;
            r1.m mVar = r1.m.f11116a;
            if (z10) {
                b0.g gVar = new b0.g(i2Var2, cVar3, 3);
                k2.n nVar = k2.h0.f7217a;
                suspendPointerInputElement = new SuspendPointerInputElement(i2Var2, kVar, new k2.g0(gVar), 4);
            } else {
                suspendPointerInputElement = mVar;
            }
            boolean z12 = i2Var2.f1929h;
            boolean zBooleanValue = ((Boolean) i2Var2.k.getValue()).booleanValue();
            boolean zH = sVar.h(i2Var2);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (zH || objK == w0Var) {
                objK = new d2(i2Var2, null);
                sVar.h0(objK);
            }
            DraggableElement draggableElement = new DraggableElement(i2Var, z10, kVar, zBooleanValue, z.h0.f15396a, (h9.o) objK, z12);
            i2Var2 = i2Var;
            f1.x2 x2Var = l0.f1978a;
            r1.p pVarA = y2.k.a(androidx.compose.foundation.layout.c.g(pVar.a(MinimumInteractiveModifier.f914a), f1893b, f1892a, 0.0f, 0.0f, 12), new e2(z10, i2Var2)).a(d1.d.f3687b);
            final float f10 = i2Var2.f1925d.f();
            n9.a aVar = i2Var2.f1924c;
            final n9.a aVar2 = new n9.a(aVar.f8963a, aVar.f8964b);
            final int i12 = i2Var2.f1922a;
            r1.p pVarA2 = androidx.compose.foundation.a.f(pVarA.a(new AppendedSemanticsElement(new h9.k() { // from class: x.j1
                @Override // h9.k
                public final Object invoke(Object obj) {
                    y2.j jVar = (y2.j) obj;
                    Float fValueOf = Float.valueOf(f10);
                    n9.a aVar3 = aVar2;
                    float f11 = aVar3.f8964b;
                    float f12 = aVar3.f8963a;
                    if (f12 > f11) {
                        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar3 + '.');
                    }
                    if (n9.a.a(fValueOf, Float.valueOf(f12)) && !n9.a.a(Float.valueOf(f12), fValueOf)) {
                        fValueOf = Float.valueOf(f12);
                    } else if (n9.a.a(Float.valueOf(f11), fValueOf) && !n9.a.a(fValueOf, Float.valueOf(f11))) {
                        fValueOf = Float.valueOf(f11);
                    }
                    y2.f fVar = new y2.f(fValueOf.floatValue(), aVar3, i12);
                    o9.u[] uVarArr = y2.t.f15077a;
                    y2.u uVar = y2.r.f15052c;
                    o9.u uVar2 = y2.t.f15077a[1];
                    uVar.a(jVar, fVar);
                    return t8.z.f12851a;
                }
            }, true)), z10, kVar).a(suspendPointerInputElement).a(draggableElement);
            boolean zH2 = sVar.h(i2Var2);
            Object objK2 = sVar.K();
            if (zH2 || objK2 == w0Var) {
                objK2 = new b2(i2Var2);
                sVar.h0(objK2);
            }
            o2.m0 m0Var = (o2.m0) objK2;
            int iP = f1.b.p(sVar);
            f1.q1 q1VarL = sVar.l();
            r1.p pVarC = r1.a.c(sVar, pVarA2);
            q2.j.f10719d0.getClass();
            q2.a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            q2.h hVar = q2.i.f10708e;
            f1.b.w(sVar, hVar, m0Var);
            q2.h hVar2 = q2.i.f10707d;
            f1.b.w(sVar, hVar2, q1VarL);
            q2.h hVar3 = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP))) {
                ob.a.w(iP, sVar, iP, hVar3);
            }
            q2.h hVar4 = q2.i.f10706c;
            f1.b.w(sVar, hVar4, pVarC);
            r1.p pVarO = androidx.compose.foundation.layout.c.o(androidx.compose.ui.layout.a.c(mVar, n1.f2012a));
            boolean zH3 = sVar.h(i2Var2);
            Object objK3 = sVar.K();
            if (zH3 || objK3 == w0Var) {
                z11 = false;
                objK3 = new z1(i2Var2, 0 == true ? 1 : 0);
                sVar.h0(objK3);
            } else {
                z11 = false;
            }
            r1.p pVarE = androidx.compose.ui.layout.a.e(pVarO, (h9.k) objK3);
            r1.h hVar5 = r1.c.f11092a;
            o2.m0 m0VarD = d0.m.d(hVar5, z11);
            int iP2 = f1.b.p(sVar);
            f1.q1 q1VarL2 = sVar.l();
            r1.p pVarC2 = r1.a.c(sVar, pVarE);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar, m0VarD);
            f1.b.w(sVar, hVar2, q1VarL2);
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP2))) {
                ob.a.w(iP2, sVar, iP2, hVar3);
            }
            f1.b.w(sVar, hVar4, pVarC2);
            int i13 = (i11 >> 3) & 14;
            cVar.invoke(i2Var2, sVar, Integer.valueOf(((i11 >> 9) & 112) | i13));
            sVar.p(true);
            r1.p pVarC3 = androidx.compose.ui.layout.a.c(mVar, n1.f2013b);
            o2.m0 m0VarD2 = d0.m.d(hVar5, false);
            int iP3 = f1.b.p(sVar);
            f1.q1 q1VarL3 = sVar.l();
            r1.p pVarC4 = r1.a.c(sVar, pVarC3);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar, m0VarD2);
            f1.b.w(sVar, hVar2, q1VarL3);
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(iP3))) {
                ob.a.w(iP3, sVar, iP3, hVar3);
            }
            f1.b.w(sVar, hVar4, pVarC4);
            cVar2.invoke(i2Var2, sVar, Integer.valueOf(i13 | ((i11 >> 12) & 112)));
            sVar.p(true);
            sVar.p(true);
        }
        f1.w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c2(pVar, i2Var2, z10, kVar, cVar, cVar2, i7);
        }
    }

    public static final float e(float f10, float[] fArr, float f11, float f12) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f13 = fArr[0];
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f13);
            } else {
                float fAbs = Math.abs(n3.r.E(f11, f12, f13) - f10);
                n9.d dVar = new n9.d(1, length, 1);
                int i7 = dVar.f8966b;
                int i10 = dVar.f8967c;
                boolean z10 = i10 <= 0 ? 1 >= i7 : 1 <= i7;
                int i11 = z10 ? 1 : i7;
                while (z10) {
                    if (i11 != i7) {
                        i11 += i10;
                    } else {
                        if (!z10) {
                            throw new NoSuchElementException();
                        }
                        i11 = i11;
                        z10 = false;
                    }
                    float f14 = fArr[i11];
                    float fAbs2 = Math.abs(n3.r.E(f11, f12, f14) - f10);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        f13 = f14;
                        fAbs = fAbs2;
                    }
                }
                fValueOf = Float.valueOf(f13);
            }
        }
        return fValueOf != null ? n3.r.E(f11, f12, fValueOf.floatValue()) : f10;
    }
}
