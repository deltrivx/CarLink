package androidx.compose.material3;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.selection.b;
import c1.h1;
import c1.l0;
import c1.l1;
import c1.n2;
import c1.o2;
import c1.p2;
import c1.w;
import c1.y;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import e1.n;
import f1.q1;
import f1.s;
import f1.w1;
import f1.x2;
import h9.k;
import i9.l;
import o2.m0;
import q2.a0;
import q2.h;
import q2.i;
import q2.j;
import r1.m;
import r1.p;
import v.e0;
import v.t;
import v.v0;
import y1.h0;
import y1.n0;
import y1.q;
import y2.g;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e0 f922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v0 f923g;

    static {
        float f10 = n.f4025b;
        f917a = f10;
        f918b = n.f4030g;
        f919c = n.f4029f;
        float f11 = n.f4027d;
        f920d = f11;
        f921e = (f11 - f10) / 2;
        f922f = new e0(0);
        f923g = new v0(100, (t) null, 6);
    }

    public static final void a(boolean z10, k kVar, p pVar, boolean z11, n2 n2Var, s sVar, int i7) {
        int i10;
        n2 n2Var2;
        int i11;
        boolean z12;
        p pVar2;
        int i12;
        boolean z13;
        n2 n2Var3;
        p pVar3;
        sVar.Y(1580463220);
        int i13 = i7 | (sVar.g(z10) ? 4 : 2);
        if ((i7 & 48) == 0) {
            i13 |= sVar.h(kVar) ? 32 : 16;
        }
        int i14 = i13 | 1666432;
        if ((599187 & i14) == 599186 && sVar.z()) {
            sVar.Q();
            pVar3 = pVar;
            z13 = z11;
            n2Var3 = n2Var;
        } else {
            sVar.S();
            int i15 = i7 & 1;
            p pVarA = m.f11116a;
            if (i15 == 0 || sVar.x()) {
                w wVar = (w) sVar.j(y.f2319a);
                n2 n2Var4 = wVar.O;
                long j5 = wVar.f2239p;
                if (n2Var4 == null) {
                    float f10 = n.f4024a;
                    long jC = y.c(wVar, 10);
                    long jC2 = y.c(wVar, 26);
                    long j10 = q.f14957l;
                    i10 = -458753;
                    n2Var2 = new n2(jC, jC2, j10, y.c(wVar, 11), y.c(wVar, 24), y.c(wVar, 39), y.c(wVar, 24), y.c(wVar, 39), h0.k(q.b(1.0f, y.c(wVar, 35)), j5), h0.k(q.b(0.12f, y.c(wVar, 18)), j5), j10, h0.k(q.b(0.38f, y.c(wVar, 18)), j5), h0.k(q.b(0.38f, y.c(wVar, 18)), j5), h0.k(q.b(0.12f, y.c(wVar, 39)), j5), h0.k(q.b(0.12f, y.c(wVar, 18)), j5), h0.k(q.b(0.38f, y.c(wVar, 39)), j5));
                    wVar.O = n2Var2;
                } else {
                    i10 = -458753;
                    n2Var2 = n2Var4;
                }
                i11 = i14 & i10;
                z12 = true;
                pVar2 = pVarA;
            } else {
                sVar.Q();
                i11 = i14 & (-458753);
                pVar2 = pVar;
                z12 = z11;
                n2Var2 = n2Var;
            }
            int i16 = i11;
            sVar.q();
            sVar.W(783532531);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = ob.a.m(sVar);
            }
            b0.k kVar2 = (b0.k) objK;
            sVar.p(false);
            if (kVar != null) {
                x2 x2Var = l0.f1978a;
                i12 = 2;
                pVarA = b.a(MinimumInteractiveModifier.f914a, z10, kVar2, z12, new g(2), kVar);
                kVar2 = kVar2;
            } else {
                i12 = 2;
            }
            boolean z14 = z12;
            p pVarF = c.f(c.n(pVar2.a(pVarA), i12), f919c, f920d);
            float f11 = n.f4024a;
            n2 n2Var5 = n2Var2;
            b(pVarF, z10, z14, n2Var5, kVar2, l1.a(5, sVar), sVar, ((i16 << 3) & 112) | 24960);
            z13 = z14;
            n2Var3 = n2Var5;
            pVar3 = pVar2;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new o2(z10, kVar, pVar3, z13, n2Var3, i7);
        }
    }

    public static final void b(p pVar, boolean z10, boolean z11, n2 n2Var, b0.k kVar, y1.l0 l0Var, s sVar, int i7) {
        int i10;
        long j5;
        long j10;
        long j11;
        sVar.Y(-1594099146);
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.g(z10) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.f(n2Var) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i10 |= sVar.h(null) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((196608 & i7) == 0) {
            i10 |= sVar.f(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i10 |= sVar.f(l0Var) ? 1048576 : 524288;
        }
        if ((i10 & 599187) == 599186 && sVar.z()) {
            sVar.Q();
        } else {
            if (z11) {
                j5 = z10 ? n2Var.f2016b : n2Var.f2020f;
            } else {
                j5 = z10 ? n2Var.f2024j : n2Var.f2027n;
            }
            if (z11) {
                j10 = z10 ? n2Var.f2015a : n2Var.f2019e;
            } else {
                j10 = z10 ? n2Var.f2023i : n2Var.f2026m;
            }
            float f10 = n.f4024a;
            y1.l0 l0VarA = l1.a(5, sVar);
            float f11 = n.f4028e;
            if (z11) {
                j11 = z10 ? n2Var.f2017c : n2Var.f2021g;
            } else {
                j11 = z10 ? n2Var.k : n2Var.f2028o;
            }
            p pVarB = androidx.compose.foundation.a.b(pVar.a(new BorderModifierNodeElement(f11, new n0(j11), l0VarA)), j5, l0VarA);
            m0 m0VarD = d0.m.d(r1.c.f11092a, false);
            int iP = f1.b.p(sVar);
            q1 q1VarL = sVar.l();
            p pVarC = r1.a.c(sVar, pVarB);
            j.f10719d0.getClass();
            a0 a0Var = i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            h hVar = i.f10708e;
            f1.b.w(sVar, hVar, m0VarD);
            h hVar2 = i.f10707d;
            f1.b.w(sVar, hVar2, q1VarL);
            h hVar3 = i.f10709f;
            if (sVar.S || !l.a(sVar.K(), Integer.valueOf(iP))) {
                ob.a.w(iP, sVar, iP, hVar3);
            }
            h hVar4 = i.f10706c;
            f1.b.w(sVar, hVar4, pVarC);
            p pVarB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.c.a(androidx.compose.foundation.layout.b.f819a.a(m.f11116a, r1.c.f11095d).a(new ThumbElement(kVar, z10)), kVar, h1.a(n.f4026c / 2, sVar, 54, 4)), j10, l0Var);
            m0 m0VarD2 = d0.m.d(r1.c.f11096e, false);
            int iP2 = f1.b.p(sVar);
            q1 q1VarL2 = sVar.l();
            p pVarC2 = r1.a.c(sVar, pVarB2);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar, m0VarD2);
            f1.b.w(sVar, hVar2, q1VarL2);
            if (sVar.S || !l.a(sVar.K(), Integer.valueOf(iP2))) {
                ob.a.w(iP2, sVar, iP2, hVar3);
            }
            f1.b.w(sVar, hVar4, pVarC2);
            sVar.W(1163457794);
            sVar.p(false);
            sVar.p(true);
            sVar.p(true);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new p2(pVar, z10, z11, n2Var, kVar, l0Var, i7);
        }
    }
}
