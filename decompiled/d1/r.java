package d1;

import b3.l0;
import b3.r0;
import c1.a0;
import c1.q2;
import c1.y2;
import c1.z2;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import d0.h0;
import f1.b1;
import f1.k1;
import f1.w0;
import f1.w1;
import g3.d0;
import o2.x;
import v.p0;
import v.s0;
import v.u0;
import v.v;
import v.v0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f3736b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f3741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f3742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r1.p f3743i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3735a = n3.b.a(0, 0, 0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f3737c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f3738d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f3739e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f3740f = 24;

    static {
        float f10 = 16;
        f3736b = f10;
        f3741g = f10;
        f3742h = f10;
        float f11 = 48;
        f3743i = androidx.compose.foundation.layout.c.a(r1.m.f11116a, f11, f11);
    }

    /* JADX WARN: Code duplicated, block: B:200:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:202:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:204:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:206:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:208:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:211:0x0315  */
    /* JADX WARN: Code duplicated, block: B:213:0x031a  */
    /* JADX WARN: Code duplicated, block: B:217:0x0320  */
    /* JADX WARN: Code duplicated, block: B:219:0x0326 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x032c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0348  */
    /* JADX WARN: Code duplicated, block: B:227:0x034b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0351  */
    /* JADX WARN: Code duplicated, block: B:233:0x0357 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x035a  */
    /* JADX WARN: Code duplicated, block: B:238:0x0388  */
    /* JADX WARN: Code duplicated, block: B:240:0x038b  */
    /* JADX WARN: Code duplicated, block: B:242:0x038e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0392  */
    /* JADX WARN: Code duplicated, block: B:246:0x0398 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:247:0x039a  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:252:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:255:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:257:0x03c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:261:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:263:0x0402  */
    /* JADX WARN: Code duplicated, block: B:266:0x041a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:269:0x0420  */
    /* JADX WARN: Code duplicated, block: B:272:0x044b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0450  */
    /* JADX WARN: Code duplicated, block: B:278:0x0471  */
    /* JADX WARN: Code duplicated, block: B:281:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:284:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:288:0x0529  */
    /* JADX WARN: Code duplicated, block: B:289:0x052e  */
    /* JADX WARN: Code duplicated, block: B:292:0x054e  */
    /* JADX WARN: Code duplicated, block: B:295:0x056d  */
    /* JADX WARN: Code duplicated, block: B:298:0x059b  */
    /* JADX WARN: Code duplicated, block: B:299:0x059e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:300:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:301:0x05a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:302:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:303:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:306:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:307:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:310:0x05db  */
    /* JADX WARN: Code duplicated, block: B:313:0x0603 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:314:0x0605  */
    /* JADX WARN: Instruction removed from duplicated block: B:242:0x038e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:254:0x03b8, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    public static final void a(String str, h9.n nVar, l0 l0Var, h9.n nVar2, h9.n nVar3, boolean z10, boolean z11, boolean z12, b0.k kVar, h0 h0Var, q2 q2Var, n1.c cVar, f1.s sVar, int i7, int i10) {
        int i11;
        l0 l0Var2;
        int i12;
        g gVar;
        long j5;
        s0 s0Var;
        float f10;
        int iOrdinal;
        float f11;
        int iOrdinal2;
        boolean z13;
        float f12;
        int iOrdinal3;
        float f13;
        p0 p0VarB;
        int iOrdinal4;
        float f14;
        int iOrdinal5;
        boolean z14;
        p0 p0VarB2;
        g gVar2;
        int[] iArr;
        long j10;
        z1.c cVarF;
        boolean zF;
        Object objK;
        u.c cVar2;
        g gVar3;
        long j11;
        g gVar4;
        p0 p0VarB3;
        boolean zF2;
        Object objK2;
        Object obj;
        p0 p0VarB4;
        float fFloatValue;
        ?? r13;
        n1.c cVarE;
        Object objK3;
        Object objK4;
        long j12;
        n1.c cVarE2;
        Object objK5;
        b1 b1Var;
        boolean zC;
        Object objK6;
        f1.s sVar2;
        sVar.Y(1514469103);
        if ((i7 & 6) == 0) {
            i11 = (sVar.f(s.f3744a) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        if ((i7 & 48) == 0) {
            i11 |= sVar.f(str) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i11 |= sVar.h(nVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            l0Var2 = l0Var;
            i11 |= sVar.f(l0Var2) ? 2048 : 1024;
        } else {
            l0Var2 = l0Var;
        }
        int i13 = i7 & 24576;
        int i14 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        if (i13 == 0) {
            i11 |= sVar.h(nVar2) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if ((i7 & 196608) == 0) {
            i11 |= sVar.h(null) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i11 |= sVar.h(null) ? 1048576 : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i11 |= sVar.h(nVar3) ? 8388608 : 4194304;
        }
        if ((i7 & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_DOOR) == 0) {
            i11 |= sVar.h(null) ? 67108864 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE;
        }
        if ((i7 & 805306368) == 0) {
            i11 |= sVar.h(null) ? 536870912 : 268435456;
        }
        if ((i10 & 6) == 0) {
            i12 = i10 | (sVar.h(null) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= sVar.g(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= sVar.g(z12) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            if (sVar.f(kVar)) {
                i14 = 16384;
            }
            i12 |= i14;
        }
        if ((i10 & 196608) == 0) {
            i12 |= sVar.f(h0Var) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= sVar.f(q2Var) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= sVar.h(cVar) ? 8388608 : 4194304;
        }
        int i15 = i12;
        if ((306783379 & i11) == 306783378 && (i15 & 4793491) == 4793490 && sVar.z()) {
            sVar.Q();
            sVar2 = sVar;
        } else {
            boolean z15 = ((i11 & 112) == 32) | ((i11 & 7168) == 2048);
            Object objK7 = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (z15 || objK7 == w0Var) {
                b3.h hVar = new b3.h(str, null, 6);
                l0Var2.getClass();
                objK7 = new d0(hVar, g3.p.f5874a);
                sVar.h0(objK7);
            }
            String str2 = ((d0) objK7).f5852a.f1353b;
            boolean zBooleanValue = ((Boolean) a.a.r(kVar, sVar, (i15 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                gVar = g.f3692a;
            } else {
                gVar = str2.length() == 0 ? g.f3693b : g.f3694c;
            }
            if (!z11) {
                j5 = q2Var.f2101z;
            } else if (z12) {
                j5 = q2Var.A;
            } else {
                j5 = zBooleanValue ? q2Var.f2099x : q2Var.f2100y;
            }
            y2 y2Var = (y2) sVar.j(z2.f2365a);
            r0 r0Var = y2Var.f2356j;
            r0 r0Var2 = y2Var.f2357l;
            int i16 = i11;
            long jB = r0Var.b();
            int i17 = y1.q.f14959n;
            long j13 = y1.q.f14958m;
            boolean z16 = (y1.q.c(jB, j13) && !y1.q.c(r0Var2.b(), j13)) || (!y1.q.c(r0Var.b(), j13) && y1.q.c(r0Var2.b(), j13));
            long jB2 = r0Var2.b();
            if (z16 && jB2 == 16) {
                jB2 = j5;
            }
            long jB3 = r0Var.b();
            long j14 = (z16 && jB3 == 16) ? j5 : jB3;
            boolean z17 = nVar2 != null;
            s0 s0VarC = u0.c(gVar, sVar, 48, 0);
            k1 k1Var = s0VarC.f13451b;
            v.w0 w0Var2 = v.d.f13345j;
            g gVar5 = (g) s0VarC.c();
            sVar.W(-2036730335);
            int iOrdinal6 = gVar5.ordinal();
            float f15 = 0.0f;
            if (iOrdinal6 != 0) {
                s0Var = s0VarC;
                if (iOrdinal6 == 1) {
                    f10 = 0.0f;
                } else if (iOrdinal6 != 2) {
                    throw new cc.s();
                }
                sVar.p(false);
                Float fValueOf = Float.valueOf(f10);
                g gVar6 = (g) k1Var.getValue();
                sVar.W(-2036730335);
                iOrdinal = gVar6.ordinal();
                if (iOrdinal == 0) {
                    f11 = 1.0f;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new cc.s();
                    }
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                sVar.p(false);
                Float fValueOf2 = Float.valueOf(f11);
                s0Var.e();
                sVar.W(1276209157);
                v0 v0VarK = v.d.k(150, 6, null);
                sVar.p(false);
                p0 p0VarB5 = u0.b(s0Var, fValueOf, fValueOf2, v0VarK, w0Var2, sVar, 196608);
                b bVar = b.f3683c;
                g gVar7 = (g) s0Var.c();
                sVar.W(1435837472);
                iOrdinal2 = gVar7.ordinal();
                if (iOrdinal2 != 0) {
                    z13 = z16;
                    if (iOrdinal2 != 1) {
                        if (z17) {
                        }
                        sVar.p(false);
                        Float fValueOf3 = Float.valueOf(f12);
                        g gVar8 = (g) k1Var.getValue();
                        sVar.W(1435837472);
                        iOrdinal3 = gVar8.ordinal();
                        if (iOrdinal3 == 0) {
                            f13 = 1.0f;
                        } else {
                            if (iOrdinal3 != 1) {
                                if (iOrdinal3 != 2) {
                                    throw new cc.s();
                                }
                            } else if (z17) {
                                f13 = 1.0f;
                            }
                            f13 = 0.0f;
                        }
                        sVar.p(false);
                        p0VarB = u0.b(s0Var, fValueOf3, Float.valueOf(f13), (v) bVar.invoke(s0Var.e(), sVar, 0), w0Var2, sVar, 196608);
                        g gVar9 = (g) s0Var.c();
                        sVar.W(1128033978);
                        iOrdinal4 = gVar9.ordinal();
                        if (iOrdinal4 == 0) {
                            if (iOrdinal4 == 1) {
                                f14 = z17 ? 0.0f : 1.0f;
                            } else if (iOrdinal4 != 2) {
                                throw new cc.s();
                            }
                        }
                        sVar.p(false);
                        Float fValueOf4 = Float.valueOf(f14);
                        g gVar10 = (g) k1Var.getValue();
                        sVar.W(1128033978);
                        iOrdinal5 = gVar10.ordinal();
                        if (iOrdinal5 == 0) {
                            f15 = 1.0f;
                        } else {
                            if (iOrdinal5 == 1) {
                                z14 = z17 ? false : false;
                            } else if (iOrdinal5 != 2) {
                                throw new cc.s();
                            }
                            f15 = 1.0f;
                        }
                        sVar.p(z14);
                        Float fValueOf5 = Float.valueOf(f15);
                        s0Var.e();
                        sVar.W(-1868044898);
                        v0 v0VarK2 = v.d.k(150, 6, null);
                        sVar.p(z14);
                        p0VarB2 = u0.b(s0Var, fValueOf4, fValueOf5, v0VarK2, w0Var2, sVar, 196608);
                        gVar2 = (g) k1Var.getValue();
                        sVar.W(-107432127);
                        iArr = q.f3734a;
                        if (iArr[gVar2.ordinal()] == 1) {
                            j10 = jB2;
                        } else {
                            j10 = j14;
                        }
                        sVar.p(false);
                        cVarF = y1.q.f(j10);
                        zF = sVar.f(cVarF);
                        objK = sVar.K();
                        cVar2 = u.c.f12958a;
                        if (zF || objK == w0Var) {
                            v.w0 w0Var3 = new v.w0(cVar2, new b2.a(17, cVarF));
                            sVar.h0(w0Var3);
                            objK = w0Var3;
                        }
                        v.w0 w0Var4 = (v.w0) objK;
                        gVar3 = (g) s0Var.c();
                        sVar.W(-107432127);
                        if (iArr[gVar3.ordinal()] == 1) {
                            j11 = jB2;
                        } else {
                            j11 = j14;
                        }
                        sVar.p(false);
                        y1.q qVar = new y1.q(j11);
                        gVar4 = (g) k1Var.getValue();
                        sVar.W(-107432127);
                        if (iArr[gVar4.ordinal()] != 1) {
                            jB2 = j14;
                        }
                        sVar.p(false);
                        y1.q qVar2 = new y1.q(jB2);
                        s0Var.e();
                        sVar.W(1528582156);
                        v0 v0VarK3 = v.d.k(150, 6, null);
                        sVar.p(false);
                        p0VarB3 = u0.b(s0Var, qVar, qVar2, v0VarK3, w0Var4, sVar, 196608);
                        sVar.W(1023351670);
                        sVar.p(false);
                        z1.c cVarF2 = y1.q.f(j5);
                        zF2 = sVar.f(cVarF2);
                        objK2 = sVar.K();
                        if (zF2) {
                            obj = w0Var;
                        } else {
                            if (objK2 == obj) {
                            }
                            obj = w0Var;
                            v.w0 w0Var5 = (v.w0) objK2;
                            sVar.W(1023351670);
                            sVar.p(false);
                            y1.q qVar3 = new y1.q(j5);
                            sVar.W(1023351670);
                            sVar.p(false);
                            y1.q qVar4 = new y1.q(j5);
                            s0Var.e();
                            sVar.W(-543659263);
                            v0 v0VarK4 = v.d.k(150, 6, null);
                            sVar.p(false);
                            p0VarB4 = u0.b(s0Var, qVar3, qVar4, v0VarK4, w0Var5, sVar, 196608);
                            fFloatValue = ((Number) p0VarB5.f13430h.getValue()).floatValue();
                            sVar.W(-156998101);
                            if (nVar2 == null) {
                                cVarE = null;
                                r13 = 0;
                            } else {
                                r13 = 0;
                                cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                            }
                            sVar.p(r13);
                            objK3 = sVar.K();
                            if (objK3 == obj) {
                                objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                                sVar.h0(objK3);
                            }
                            sVar.W(-156965270);
                            sVar.p(r13);
                            objK4 = sVar.K();
                            if (objK4 == obj) {
                                objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                                sVar.h0(objK4);
                            }
                            sVar.W(-156940524);
                            sVar.p(r13);
                            sVar.W(-156921964);
                            sVar.p(r13);
                            sVar.W(-156902962);
                            sVar.p(r13);
                            if (!z11) {
                                j12 = q2Var.f2097v;
                            } else if (z12) {
                                j12 = q2Var.f2098w;
                            } else if (zBooleanValue) {
                                j12 = q2Var.f2095t;
                            } else {
                                j12 = q2Var.f2096u;
                            }
                            sVar.W(-156893937);
                            if (nVar3 == null) {
                                cVarE2 = null;
                            } else {
                                cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                            }
                            sVar.p(r13);
                            sVar.W(-156884470);
                            sVar.p(r13);
                            sVar.W(-567018607);
                            objK5 = sVar.K();
                            if (objK5 == obj) {
                                objK5 = f1.b.s(new x1.e(0L));
                                sVar.h0(objK5);
                            }
                            b1Var = (b1) objK5;
                            n1.c cVarE3 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                            zC = sVar.c(fFloatValue);
                            objK6 = sVar.K();
                            if (zC || objK6 == obj) {
                                objK6 = new i(fFloatValue, b1Var);
                                sVar.h0(objK6);
                            }
                            c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE3, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                            f1.s sVar3 = sVar;
                            sVar3.p(false);
                            sVar2 = sVar3;
                        }
                        obj = w0Var;
                        v.w0 w0Var6 = new v.w0(cVar2, new b2.a(17, cVarF2));
                        sVar.h0(w0Var6);
                        objK2 = w0Var6;
                        obj = w0Var;
                        v.w0 w0Var7 = (v.w0) objK2;
                        sVar.W(1023351670);
                        sVar.p(false);
                        y1.q qVar5 = new y1.q(j5);
                        sVar.W(1023351670);
                        sVar.p(false);
                        y1.q qVar6 = new y1.q(j5);
                        s0Var.e();
                        sVar.W(-543659263);
                        v0 v0VarK5 = v.d.k(150, 6, null);
                        sVar.p(false);
                        p0VarB4 = u0.b(s0Var, qVar5, qVar6, v0VarK5, w0Var7, sVar, 196608);
                        fFloatValue = ((Number) p0VarB5.f13430h.getValue()).floatValue();
                        sVar.W(-156998101);
                        if (nVar2 == null) {
                            cVarE = null;
                            r13 = 0;
                        } else {
                            r13 = 0;
                            cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                        }
                        sVar.p(r13);
                        objK3 = sVar.K();
                        if (objK3 == obj) {
                            objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                            sVar.h0(objK3);
                        }
                        sVar.W(-156965270);
                        sVar.p(r13);
                        objK4 = sVar.K();
                        if (objK4 == obj) {
                            objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                            sVar.h0(objK4);
                        }
                        sVar.W(-156940524);
                        sVar.p(r13);
                        sVar.W(-156921964);
                        sVar.p(r13);
                        sVar.W(-156902962);
                        sVar.p(r13);
                        if (!z11) {
                            j12 = q2Var.f2097v;
                        } else if (z12) {
                            j12 = q2Var.f2098w;
                        } else if (zBooleanValue) {
                            j12 = q2Var.f2095t;
                        } else {
                            j12 = q2Var.f2096u;
                        }
                        sVar.W(-156893937);
                        if (nVar3 == null) {
                            cVarE2 = null;
                        } else {
                            cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                        }
                        sVar.p(r13);
                        sVar.W(-156884470);
                        sVar.p(r13);
                        sVar.W(-567018607);
                        objK5 = sVar.K();
                        if (objK5 == obj) {
                            objK5 = f1.b.s(new x1.e(0L));
                            sVar.h0(objK5);
                        }
                        b1Var = (b1) objK5;
                        n1.c cVarE4 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                        zC = sVar.c(fFloatValue);
                        objK6 = sVar.K();
                        if (zC) {
                            objK6 = new i(fFloatValue, b1Var);
                            sVar.h0(objK6);
                        } else {
                            objK6 = new i(fFloatValue, b1Var);
                            sVar.h0(objK6);
                        }
                        c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE4, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                        f1.s sVar4 = sVar;
                        sVar4.p(false);
                        sVar2 = sVar4;
                    } else if (iOrdinal2 != 2) {
                        throw new cc.s();
                    }
                    f12 = 0.0f;
                    sVar.p(false);
                    Float fValueOf6 = Float.valueOf(f12);
                    g gVar11 = (g) k1Var.getValue();
                    sVar.W(1435837472);
                    iOrdinal3 = gVar11.ordinal();
                    if (iOrdinal3 == 0) {
                        f13 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                throw new cc.s();
                            }
                        } else if (z17) {
                            f13 = 1.0f;
                        }
                        f13 = 0.0f;
                    }
                    sVar.p(false);
                    p0VarB = u0.b(s0Var, fValueOf6, Float.valueOf(f13), (v) bVar.invoke(s0Var.e(), sVar, 0), w0Var2, sVar, 196608);
                    g gVar12 = (g) s0Var.c();
                    sVar.W(1128033978);
                    iOrdinal4 = gVar12.ordinal();
                    if (iOrdinal4 == 0) {
                        if (iOrdinal4 == 1) {
                            if (iOrdinal4 != 2) {
                                throw new cc.s();
                            }
                        } else if (z17) {
                        }
                    }
                    sVar.p(false);
                    Float fValueOf7 = Float.valueOf(f14);
                    g gVar13 = (g) k1Var.getValue();
                    sVar.W(1128033978);
                    iOrdinal5 = gVar13.ordinal();
                    if (iOrdinal5 == 0) {
                        f15 = 1.0f;
                    } else {
                        if (iOrdinal5 == 1) {
                            if (iOrdinal5 != 2) {
                                throw new cc.s();
                            }
                        } else if (z17) {
                        }
                        f15 = 1.0f;
                    }
                    sVar.p(z14);
                    Float fValueOf8 = Float.valueOf(f15);
                    s0Var.e();
                    sVar.W(-1868044898);
                    v0 v0VarK6 = v.d.k(150, 6, null);
                    sVar.p(z14);
                    p0VarB2 = u0.b(s0Var, fValueOf7, fValueOf8, v0VarK6, w0Var2, sVar, 196608);
                    gVar2 = (g) k1Var.getValue();
                    sVar.W(-107432127);
                    iArr = q.f3734a;
                    if (iArr[gVar2.ordinal()] == 1) {
                        j10 = jB2;
                    } else {
                        j10 = j14;
                    }
                    sVar.p(false);
                    cVarF = y1.q.f(j10);
                    zF = sVar.f(cVarF);
                    objK = sVar.K();
                    cVar2 = u.c.f12958a;
                    if (zF) {
                        v.w0 w0Var8 = new v.w0(cVar2, new b2.a(17, cVarF));
                        sVar.h0(w0Var8);
                        objK = w0Var8;
                    } else {
                        v.w0 w0Var9 = new v.w0(cVar2, new b2.a(17, cVarF));
                        sVar.h0(w0Var9);
                        objK = w0Var9;
                    }
                    v.w0 w0Var10 = (v.w0) objK;
                    gVar3 = (g) s0Var.c();
                    sVar.W(-107432127);
                    if (iArr[gVar3.ordinal()] == 1) {
                        j11 = jB2;
                    } else {
                        j11 = j14;
                    }
                    sVar.p(false);
                    y1.q qVar7 = new y1.q(j11);
                    gVar4 = (g) k1Var.getValue();
                    sVar.W(-107432127);
                    if (iArr[gVar4.ordinal()] != 1) {
                        jB2 = j14;
                    }
                    sVar.p(false);
                    y1.q qVar8 = new y1.q(jB2);
                    s0Var.e();
                    sVar.W(1528582156);
                    v0 v0VarK7 = v.d.k(150, 6, null);
                    sVar.p(false);
                    p0VarB3 = u0.b(s0Var, qVar7, qVar8, v0VarK7, w0Var10, sVar, 196608);
                    sVar.W(1023351670);
                    sVar.p(false);
                    z1.c cVarF3 = y1.q.f(j5);
                    zF2 = sVar.f(cVarF3);
                    objK2 = sVar.K();
                    if (zF2) {
                        if (objK2 == obj) {
                        }
                        obj = w0Var;
                        v.w0 w0Var11 = (v.w0) objK2;
                        sVar.W(1023351670);
                        sVar.p(false);
                        y1.q qVar9 = new y1.q(j5);
                        sVar.W(1023351670);
                        sVar.p(false);
                        y1.q qVar10 = new y1.q(j5);
                        s0Var.e();
                        sVar.W(-543659263);
                        v0 v0VarK8 = v.d.k(150, 6, null);
                        sVar.p(false);
                        p0VarB4 = u0.b(s0Var, qVar9, qVar10, v0VarK8, w0Var11, sVar, 196608);
                        fFloatValue = ((Number) p0VarB5.f13430h.getValue()).floatValue();
                        sVar.W(-156998101);
                        if (nVar2 == null) {
                            cVarE = null;
                            r13 = 0;
                        } else {
                            r13 = 0;
                            cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                        }
                        sVar.p(r13);
                        objK3 = sVar.K();
                        if (objK3 == obj) {
                            objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                            sVar.h0(objK3);
                        }
                        sVar.W(-156965270);
                        sVar.p(r13);
                        objK4 = sVar.K();
                        if (objK4 == obj) {
                            objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                            sVar.h0(objK4);
                        }
                        sVar.W(-156940524);
                        sVar.p(r13);
                        sVar.W(-156921964);
                        sVar.p(r13);
                        sVar.W(-156902962);
                        sVar.p(r13);
                        if (!z11) {
                            j12 = q2Var.f2097v;
                        } else if (z12) {
                            j12 = q2Var.f2098w;
                        } else if (zBooleanValue) {
                            j12 = q2Var.f2095t;
                        } else {
                            j12 = q2Var.f2096u;
                        }
                        sVar.W(-156893937);
                        if (nVar3 == null) {
                            cVarE2 = null;
                        } else {
                            cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                        }
                        sVar.p(r13);
                        sVar.W(-156884470);
                        sVar.p(r13);
                        sVar.W(-567018607);
                        objK5 = sVar.K();
                        if (objK5 == obj) {
                            objK5 = f1.b.s(new x1.e(0L));
                            sVar.h0(objK5);
                        }
                        b1Var = (b1) objK5;
                        n1.c cVarE5 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                        zC = sVar.c(fFloatValue);
                        objK6 = sVar.K();
                        if (zC) {
                            objK6 = new i(fFloatValue, b1Var);
                            sVar.h0(objK6);
                        } else {
                            objK6 = new i(fFloatValue, b1Var);
                            sVar.h0(objK6);
                        }
                        c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE5, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                        f1.s sVar5 = sVar;
                        sVar5.p(false);
                        sVar2 = sVar5;
                    } else {
                        obj = w0Var;
                    }
                    obj = w0Var;
                    v.w0 w0Var12 = new v.w0(cVar2, new b2.a(17, cVarF3));
                    sVar.h0(w0Var12);
                    objK2 = w0Var12;
                    obj = w0Var;
                    v.w0 w0Var13 = (v.w0) objK2;
                    sVar.W(1023351670);
                    sVar.p(false);
                    y1.q qVar11 = new y1.q(j5);
                    sVar.W(1023351670);
                    sVar.p(false);
                    y1.q qVar12 = new y1.q(j5);
                    s0Var.e();
                    sVar.W(-543659263);
                    v0 v0VarK9 = v.d.k(150, 6, null);
                    sVar.p(false);
                    p0VarB4 = u0.b(s0Var, qVar11, qVar12, v0VarK9, w0Var13, sVar, 196608);
                    fFloatValue = ((Number) p0VarB5.f13430h.getValue()).floatValue();
                    sVar.W(-156998101);
                    if (nVar2 == null) {
                        cVarE = null;
                        r13 = 0;
                    } else {
                        r13 = 0;
                        cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                    }
                    sVar.p(r13);
                    objK3 = sVar.K();
                    if (objK3 == obj) {
                        objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                        sVar.h0(objK3);
                    }
                    sVar.W(-156965270);
                    sVar.p(r13);
                    objK4 = sVar.K();
                    if (objK4 == obj) {
                        objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                        sVar.h0(objK4);
                    }
                    sVar.W(-156940524);
                    sVar.p(r13);
                    sVar.W(-156921964);
                    sVar.p(r13);
                    sVar.W(-156902962);
                    sVar.p(r13);
                    if (!z11) {
                        j12 = q2Var.f2097v;
                    } else if (z12) {
                        j12 = q2Var.f2098w;
                    } else if (zBooleanValue) {
                        j12 = q2Var.f2095t;
                    } else {
                        j12 = q2Var.f2096u;
                    }
                    sVar.W(-156893937);
                    if (nVar3 == null) {
                        cVarE2 = null;
                    } else {
                        cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                    }
                    sVar.p(r13);
                    sVar.W(-156884470);
                    sVar.p(r13);
                    sVar.W(-567018607);
                    objK5 = sVar.K();
                    if (objK5 == obj) {
                        objK5 = f1.b.s(new x1.e(0L));
                        sVar.h0(objK5);
                    }
                    b1Var = (b1) objK5;
                    n1.c cVarE6 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                    zC = sVar.c(fFloatValue);
                    objK6 = sVar.K();
                    if (zC) {
                        objK6 = new i(fFloatValue, b1Var);
                        sVar.h0(objK6);
                    } else {
                        objK6 = new i(fFloatValue, b1Var);
                        sVar.h0(objK6);
                    }
                    c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE6, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                    f1.s sVar6 = sVar;
                    sVar6.p(false);
                    sVar2 = sVar6;
                } else {
                    z13 = z16;
                }
                f12 = 1.0f;
                sVar.p(false);
                Float fValueOf9 = Float.valueOf(f12);
                g gVar14 = (g) k1Var.getValue();
                sVar.W(1435837472);
                iOrdinal3 = gVar14.ordinal();
                if (iOrdinal3 == 0) {
                    f13 = 1.0f;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new cc.s();
                        }
                    } else if (z17) {
                        f13 = 1.0f;
                    }
                    f13 = 0.0f;
                }
                sVar.p(false);
                p0VarB = u0.b(s0Var, fValueOf9, Float.valueOf(f13), (v) bVar.invoke(s0Var.e(), sVar, 0), w0Var2, sVar, 196608);
                g gVar15 = (g) s0Var.c();
                sVar.W(1128033978);
                iOrdinal4 = gVar15.ordinal();
                if (iOrdinal4 == 0) {
                    if (iOrdinal4 == 1) {
                        if (iOrdinal4 != 2) {
                            throw new cc.s();
                        }
                    } else if (z17) {
                    }
                }
                sVar.p(false);
                Float fValueOf10 = Float.valueOf(f14);
                g gVar16 = (g) k1Var.getValue();
                sVar.W(1128033978);
                iOrdinal5 = gVar16.ordinal();
                if (iOrdinal5 == 0) {
                    f15 = 1.0f;
                } else {
                    if (iOrdinal5 == 1) {
                        if (iOrdinal5 != 2) {
                            throw new cc.s();
                        }
                    } else if (z17) {
                    }
                    f15 = 1.0f;
                }
                sVar.p(z14);
                Float fValueOf11 = Float.valueOf(f15);
                s0Var.e();
                sVar.W(-1868044898);
                v0 v0VarK10 = v.d.k(150, 6, null);
                sVar.p(z14);
                p0VarB2 = u0.b(s0Var, fValueOf10, fValueOf11, v0VarK10, w0Var2, sVar, 196608);
                gVar2 = (g) k1Var.getValue();
                sVar.W(-107432127);
                iArr = q.f3734a;
                if (iArr[gVar2.ordinal()] == 1) {
                    j10 = jB2;
                } else {
                    j10 = j14;
                }
                sVar.p(false);
                cVarF = y1.q.f(j10);
                zF = sVar.f(cVarF);
                objK = sVar.K();
                cVar2 = u.c.f12958a;
                if (zF) {
                    v.w0 w0Var14 = new v.w0(cVar2, new b2.a(17, cVarF));
                    sVar.h0(w0Var14);
                    objK = w0Var14;
                } else {
                    v.w0 w0Var15 = new v.w0(cVar2, new b2.a(17, cVarF));
                    sVar.h0(w0Var15);
                    objK = w0Var15;
                }
                v.w0 w0Var16 = (v.w0) objK;
                gVar3 = (g) s0Var.c();
                sVar.W(-107432127);
                if (iArr[gVar3.ordinal()] == 1) {
                    j11 = jB2;
                } else {
                    j11 = j14;
                }
                sVar.p(false);
                y1.q qVar13 = new y1.q(j11);
                gVar4 = (g) k1Var.getValue();
                sVar.W(-107432127);
                if (iArr[gVar4.ordinal()] != 1) {
                    jB2 = j14;
                }
                sVar.p(false);
                y1.q qVar14 = new y1.q(jB2);
                s0Var.e();
                sVar.W(1528582156);
                v0 v0VarK11 = v.d.k(150, 6, null);
                sVar.p(false);
                p0VarB3 = u0.b(s0Var, qVar13, qVar14, v0VarK11, w0Var16, sVar, 196608);
                sVar.W(1023351670);
                sVar.p(false);
                z1.c cVarF4 = y1.q.f(j5);
                zF2 = sVar.f(cVarF4);
                objK2 = sVar.K();
                if (zF2) {
                    if (objK2 == obj) {
                    }
                    obj = w0Var;
                    v.w0 w0Var17 = (v.w0) objK2;
                    sVar.W(1023351670);
                    sVar.p(false);
                    y1.q qVar15 = new y1.q(j5);
                    sVar.W(1023351670);
                    sVar.p(false);
                    y1.q qVar16 = new y1.q(j5);
                    s0Var.e();
                    sVar.W(-543659263);
                    v0 v0VarK12 = v.d.k(150, 6, null);
                    sVar.p(false);
                    p0VarB4 = u0.b(s0Var, qVar15, qVar16, v0VarK12, w0Var17, sVar, 196608);
                    fFloatValue = ((Number) p0VarB5.f13430h.getValue()).floatValue();
                    sVar.W(-156998101);
                    if (nVar2 == null) {
                        cVarE = null;
                        r13 = 0;
                    } else {
                        r13 = 0;
                        cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                    }
                    sVar.p(r13);
                    objK3 = sVar.K();
                    if (objK3 == obj) {
                        objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                        sVar.h0(objK3);
                    }
                    sVar.W(-156965270);
                    sVar.p(r13);
                    objK4 = sVar.K();
                    if (objK4 == obj) {
                        objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                        sVar.h0(objK4);
                    }
                    sVar.W(-156940524);
                    sVar.p(r13);
                    sVar.W(-156921964);
                    sVar.p(r13);
                    sVar.W(-156902962);
                    sVar.p(r13);
                    if (!z11) {
                        j12 = q2Var.f2097v;
                    } else if (z12) {
                        j12 = q2Var.f2098w;
                    } else if (zBooleanValue) {
                        j12 = q2Var.f2095t;
                    } else {
                        j12 = q2Var.f2096u;
                    }
                    sVar.W(-156893937);
                    if (nVar3 == null) {
                        cVarE2 = null;
                    } else {
                        cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                    }
                    sVar.p(r13);
                    sVar.W(-156884470);
                    sVar.p(r13);
                    sVar.W(-567018607);
                    objK5 = sVar.K();
                    if (objK5 == obj) {
                        objK5 = f1.b.s(new x1.e(0L));
                        sVar.h0(objK5);
                    }
                    b1Var = (b1) objK5;
                    n1.c cVarE7 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                    zC = sVar.c(fFloatValue);
                    objK6 = sVar.K();
                    if (zC) {
                        objK6 = new i(fFloatValue, b1Var);
                        sVar.h0(objK6);
                    } else {
                        objK6 = new i(fFloatValue, b1Var);
                        sVar.h0(objK6);
                    }
                    c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE7, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                    f1.s sVar7 = sVar;
                    sVar7.p(false);
                    sVar2 = sVar7;
                } else {
                    obj = w0Var;
                }
                obj = w0Var;
                v.w0 w0Var18 = new v.w0(cVar2, new b2.a(17, cVarF4));
                sVar.h0(w0Var18);
                objK2 = w0Var18;
                obj = w0Var;
                v.w0 w0Var19 = (v.w0) objK2;
                sVar.W(1023351670);
                sVar.p(false);
                y1.q qVar17 = new y1.q(j5);
                sVar.W(1023351670);
                sVar.p(false);
                y1.q qVar18 = new y1.q(j5);
                s0Var.e();
                sVar.W(-543659263);
                v0 v0VarK13 = v.d.k(150, 6, null);
                sVar.p(false);
                p0VarB4 = u0.b(s0Var, qVar17, qVar18, v0VarK13, w0Var19, sVar, 196608);
                fFloatValue = ((Number) p0VarB5.f13430h.getValue()).floatValue();
                sVar.W(-156998101);
                if (nVar2 == null) {
                    cVarE = null;
                    r13 = 0;
                } else {
                    r13 = 0;
                    cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                }
                sVar.p(r13);
                objK3 = sVar.K();
                if (objK3 == obj) {
                    objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                    sVar.h0(objK3);
                }
                sVar.W(-156965270);
                sVar.p(r13);
                objK4 = sVar.K();
                if (objK4 == obj) {
                    objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                    sVar.h0(objK4);
                }
                sVar.W(-156940524);
                sVar.p(r13);
                sVar.W(-156921964);
                sVar.p(r13);
                sVar.W(-156902962);
                sVar.p(r13);
                if (!z11) {
                    j12 = q2Var.f2097v;
                } else if (z12) {
                    j12 = q2Var.f2098w;
                } else if (zBooleanValue) {
                    j12 = q2Var.f2095t;
                } else {
                    j12 = q2Var.f2096u;
                }
                sVar.W(-156893937);
                if (nVar3 == null) {
                    cVarE2 = null;
                } else {
                    cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                }
                sVar.p(r13);
                sVar.W(-156884470);
                sVar.p(r13);
                sVar.W(-567018607);
                objK5 = sVar.K();
                if (objK5 == obj) {
                    objK5 = f1.b.s(new x1.e(0L));
                    sVar.h0(objK5);
                }
                b1Var = (b1) objK5;
                n1.c cVarE8 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                zC = sVar.c(fFloatValue);
                objK6 = sVar.K();
                if (zC) {
                    objK6 = new i(fFloatValue, b1Var);
                    sVar.h0(objK6);
                } else {
                    objK6 = new i(fFloatValue, b1Var);
                    sVar.h0(objK6);
                }
                c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE8, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                f1.s sVar8 = sVar;
                sVar8.p(false);
                sVar2 = sVar8;
            } else {
                s0Var = s0VarC;
            }
            f10 = 1.0f;
            sVar.p(false);
            Float fValueOf12 = Float.valueOf(f10);
            g gVar17 = (g) k1Var.getValue();
            sVar.W(-2036730335);
            iOrdinal = gVar17.ordinal();
            if (iOrdinal == 0) {
                f11 = 1.0f;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new cc.s();
                }
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            sVar.p(false);
            Float fValueOf13 = Float.valueOf(f11);
            s0Var.e();
            sVar.W(1276209157);
            v0 v0VarK14 = v.d.k(150, 6, null);
            sVar.p(false);
            p0 p0VarB6 = u0.b(s0Var, fValueOf12, fValueOf13, v0VarK14, w0Var2, sVar, 196608);
            b bVar2 = b.f3683c;
            g gVar18 = (g) s0Var.c();
            sVar.W(1435837472);
            iOrdinal2 = gVar18.ordinal();
            if (iOrdinal2 != 0) {
                z13 = z16;
                if (iOrdinal2 != 1) {
                    if (z17) {
                    }
                    sVar.p(false);
                    Float fValueOf14 = Float.valueOf(f12);
                    g gVar19 = (g) k1Var.getValue();
                    sVar.W(1435837472);
                    iOrdinal3 = gVar19.ordinal();
                    if (iOrdinal3 == 0) {
                        f13 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                throw new cc.s();
                            }
                        } else if (z17) {
                            f13 = 1.0f;
                        }
                        f13 = 0.0f;
                    }
                    sVar.p(false);
                    p0VarB = u0.b(s0Var, fValueOf14, Float.valueOf(f13), (v) bVar2.invoke(s0Var.e(), sVar, 0), w0Var2, sVar, 196608);
                    g gVar110 = (g) s0Var.c();
                    sVar.W(1128033978);
                    iOrdinal4 = gVar110.ordinal();
                    if (iOrdinal4 == 0) {
                        if (iOrdinal4 == 1) {
                            if (iOrdinal4 != 2) {
                                throw new cc.s();
                            }
                        } else if (z17) {
                        }
                    }
                    sVar.p(false);
                    Float fValueOf15 = Float.valueOf(f14);
                    g gVar111 = (g) k1Var.getValue();
                    sVar.W(1128033978);
                    iOrdinal5 = gVar111.ordinal();
                    if (iOrdinal5 == 0) {
                        f15 = 1.0f;
                    } else {
                        if (iOrdinal5 == 1) {
                            if (iOrdinal5 != 2) {
                                throw new cc.s();
                            }
                        } else if (z17) {
                        }
                        f15 = 1.0f;
                    }
                    sVar.p(z14);
                    Float fValueOf16 = Float.valueOf(f15);
                    s0Var.e();
                    sVar.W(-1868044898);
                    v0 v0VarK15 = v.d.k(150, 6, null);
                    sVar.p(z14);
                    p0VarB2 = u0.b(s0Var, fValueOf15, fValueOf16, v0VarK15, w0Var2, sVar, 196608);
                    gVar2 = (g) k1Var.getValue();
                    sVar.W(-107432127);
                    iArr = q.f3734a;
                    if (iArr[gVar2.ordinal()] == 1) {
                        j10 = jB2;
                    } else {
                        j10 = j14;
                    }
                    sVar.p(false);
                    cVarF = y1.q.f(j10);
                    zF = sVar.f(cVarF);
                    objK = sVar.K();
                    cVar2 = u.c.f12958a;
                    if (zF) {
                        v.w0 w0Var110 = new v.w0(cVar2, new b2.a(17, cVarF));
                        sVar.h0(w0Var110);
                        objK = w0Var110;
                    } else {
                        v.w0 w0Var111 = new v.w0(cVar2, new b2.a(17, cVarF));
                        sVar.h0(w0Var111);
                        objK = w0Var111;
                    }
                    v.w0 w0Var112 = (v.w0) objK;
                    gVar3 = (g) s0Var.c();
                    sVar.W(-107432127);
                    if (iArr[gVar3.ordinal()] == 1) {
                        j11 = jB2;
                    } else {
                        j11 = j14;
                    }
                    sVar.p(false);
                    y1.q qVar19 = new y1.q(j11);
                    gVar4 = (g) k1Var.getValue();
                    sVar.W(-107432127);
                    if (iArr[gVar4.ordinal()] != 1) {
                        jB2 = j14;
                    }
                    sVar.p(false);
                    y1.q qVar110 = new y1.q(jB2);
                    s0Var.e();
                    sVar.W(1528582156);
                    v0 v0VarK16 = v.d.k(150, 6, null);
                    sVar.p(false);
                    p0VarB3 = u0.b(s0Var, qVar19, qVar110, v0VarK16, w0Var112, sVar, 196608);
                    sVar.W(1023351670);
                    sVar.p(false);
                    z1.c cVarF5 = y1.q.f(j5);
                    zF2 = sVar.f(cVarF5);
                    objK2 = sVar.K();
                    if (zF2) {
                        if (objK2 == obj) {
                        }
                        obj = w0Var;
                        v.w0 w0Var113 = (v.w0) objK2;
                        sVar.W(1023351670);
                        sVar.p(false);
                        y1.q qVar111 = new y1.q(j5);
                        sVar.W(1023351670);
                        sVar.p(false);
                        y1.q qVar112 = new y1.q(j5);
                        s0Var.e();
                        sVar.W(-543659263);
                        v0 v0VarK17 = v.d.k(150, 6, null);
                        sVar.p(false);
                        p0VarB4 = u0.b(s0Var, qVar111, qVar112, v0VarK17, w0Var113, sVar, 196608);
                        fFloatValue = ((Number) p0VarB6.f13430h.getValue()).floatValue();
                        sVar.W(-156998101);
                        if (nVar2 == null) {
                            cVarE = null;
                            r13 = 0;
                        } else {
                            r13 = 0;
                            cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                        }
                        sVar.p(r13);
                        objK3 = sVar.K();
                        if (objK3 == obj) {
                            objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                            sVar.h0(objK3);
                        }
                        sVar.W(-156965270);
                        sVar.p(r13);
                        objK4 = sVar.K();
                        if (objK4 == obj) {
                            objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                            sVar.h0(objK4);
                        }
                        sVar.W(-156940524);
                        sVar.p(r13);
                        sVar.W(-156921964);
                        sVar.p(r13);
                        sVar.W(-156902962);
                        sVar.p(r13);
                        if (!z11) {
                            j12 = q2Var.f2097v;
                        } else if (z12) {
                            j12 = q2Var.f2098w;
                        } else if (zBooleanValue) {
                            j12 = q2Var.f2095t;
                        } else {
                            j12 = q2Var.f2096u;
                        }
                        sVar.W(-156893937);
                        if (nVar3 == null) {
                            cVarE2 = null;
                        } else {
                            cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                        }
                        sVar.p(r13);
                        sVar.W(-156884470);
                        sVar.p(r13);
                        sVar.W(-567018607);
                        objK5 = sVar.K();
                        if (objK5 == obj) {
                            objK5 = f1.b.s(new x1.e(0L));
                            sVar.h0(objK5);
                        }
                        b1Var = (b1) objK5;
                        n1.c cVarE9 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                        zC = sVar.c(fFloatValue);
                        objK6 = sVar.K();
                        if (zC) {
                            objK6 = new i(fFloatValue, b1Var);
                            sVar.h0(objK6);
                        } else {
                            objK6 = new i(fFloatValue, b1Var);
                            sVar.h0(objK6);
                        }
                        c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE9, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                        f1.s sVar9 = sVar;
                        sVar9.p(false);
                        sVar2 = sVar9;
                    } else {
                        obj = w0Var;
                    }
                    obj = w0Var;
                    v.w0 w0Var114 = new v.w0(cVar2, new b2.a(17, cVarF5));
                    sVar.h0(w0Var114);
                    objK2 = w0Var114;
                    obj = w0Var;
                    v.w0 w0Var115 = (v.w0) objK2;
                    sVar.W(1023351670);
                    sVar.p(false);
                    y1.q qVar113 = new y1.q(j5);
                    sVar.W(1023351670);
                    sVar.p(false);
                    y1.q qVar114 = new y1.q(j5);
                    s0Var.e();
                    sVar.W(-543659263);
                    v0 v0VarK18 = v.d.k(150, 6, null);
                    sVar.p(false);
                    p0VarB4 = u0.b(s0Var, qVar113, qVar114, v0VarK18, w0Var115, sVar, 196608);
                    fFloatValue = ((Number) p0VarB6.f13430h.getValue()).floatValue();
                    sVar.W(-156998101);
                    if (nVar2 == null) {
                        cVarE = null;
                        r13 = 0;
                    } else {
                        r13 = 0;
                        cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                    }
                    sVar.p(r13);
                    objK3 = sVar.K();
                    if (objK3 == obj) {
                        objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                        sVar.h0(objK3);
                    }
                    sVar.W(-156965270);
                    sVar.p(r13);
                    objK4 = sVar.K();
                    if (objK4 == obj) {
                        objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                        sVar.h0(objK4);
                    }
                    sVar.W(-156940524);
                    sVar.p(r13);
                    sVar.W(-156921964);
                    sVar.p(r13);
                    sVar.W(-156902962);
                    sVar.p(r13);
                    if (!z11) {
                        j12 = q2Var.f2097v;
                    } else if (z12) {
                        j12 = q2Var.f2098w;
                    } else if (zBooleanValue) {
                        j12 = q2Var.f2095t;
                    } else {
                        j12 = q2Var.f2096u;
                    }
                    sVar.W(-156893937);
                    if (nVar3 == null) {
                        cVarE2 = null;
                    } else {
                        cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                    }
                    sVar.p(r13);
                    sVar.W(-156884470);
                    sVar.p(r13);
                    sVar.W(-567018607);
                    objK5 = sVar.K();
                    if (objK5 == obj) {
                        objK5 = f1.b.s(new x1.e(0L));
                        sVar.h0(objK5);
                    }
                    b1Var = (b1) objK5;
                    n1.c cVarE10 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                    zC = sVar.c(fFloatValue);
                    objK6 = sVar.K();
                    if (zC) {
                        objK6 = new i(fFloatValue, b1Var);
                        sVar.h0(objK6);
                    } else {
                        objK6 = new i(fFloatValue, b1Var);
                        sVar.h0(objK6);
                    }
                    c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE10, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                    f1.s sVar10 = sVar;
                    sVar10.p(false);
                    sVar2 = sVar10;
                } else if (iOrdinal2 != 2) {
                    throw new cc.s();
                }
                f12 = 0.0f;
                sVar.p(false);
                Float fValueOf17 = Float.valueOf(f12);
                g gVar112 = (g) k1Var.getValue();
                sVar.W(1435837472);
                iOrdinal3 = gVar112.ordinal();
                if (iOrdinal3 == 0) {
                    f13 = 1.0f;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new cc.s();
                        }
                    } else if (z17) {
                        f13 = 1.0f;
                    }
                    f13 = 0.0f;
                }
                sVar.p(false);
                p0VarB = u0.b(s0Var, fValueOf17, Float.valueOf(f13), (v) bVar2.invoke(s0Var.e(), sVar, 0), w0Var2, sVar, 196608);
                g gVar113 = (g) s0Var.c();
                sVar.W(1128033978);
                iOrdinal4 = gVar113.ordinal();
                if (iOrdinal4 == 0) {
                    if (iOrdinal4 == 1) {
                        if (iOrdinal4 != 2) {
                            throw new cc.s();
                        }
                    } else if (z17) {
                    }
                }
                sVar.p(false);
                Float fValueOf18 = Float.valueOf(f14);
                g gVar114 = (g) k1Var.getValue();
                sVar.W(1128033978);
                iOrdinal5 = gVar114.ordinal();
                if (iOrdinal5 == 0) {
                    f15 = 1.0f;
                } else {
                    if (iOrdinal5 == 1) {
                        if (iOrdinal5 != 2) {
                            throw new cc.s();
                        }
                    } else if (z17) {
                    }
                    f15 = 1.0f;
                }
                sVar.p(z14);
                Float fValueOf19 = Float.valueOf(f15);
                s0Var.e();
                sVar.W(-1868044898);
                v0 v0VarK19 = v.d.k(150, 6, null);
                sVar.p(z14);
                p0VarB2 = u0.b(s0Var, fValueOf18, fValueOf19, v0VarK19, w0Var2, sVar, 196608);
                gVar2 = (g) k1Var.getValue();
                sVar.W(-107432127);
                iArr = q.f3734a;
                if (iArr[gVar2.ordinal()] == 1) {
                    j10 = jB2;
                } else {
                    j10 = j14;
                }
                sVar.p(false);
                cVarF = y1.q.f(j10);
                zF = sVar.f(cVarF);
                objK = sVar.K();
                cVar2 = u.c.f12958a;
                if (zF) {
                    v.w0 w0Var116 = new v.w0(cVar2, new b2.a(17, cVarF));
                    sVar.h0(w0Var116);
                    objK = w0Var116;
                } else {
                    v.w0 w0Var117 = new v.w0(cVar2, new b2.a(17, cVarF));
                    sVar.h0(w0Var117);
                    objK = w0Var117;
                }
                v.w0 w0Var118 = (v.w0) objK;
                gVar3 = (g) s0Var.c();
                sVar.W(-107432127);
                if (iArr[gVar3.ordinal()] == 1) {
                    j11 = jB2;
                } else {
                    j11 = j14;
                }
                sVar.p(false);
                y1.q qVar115 = new y1.q(j11);
                gVar4 = (g) k1Var.getValue();
                sVar.W(-107432127);
                if (iArr[gVar4.ordinal()] != 1) {
                    jB2 = j14;
                }
                sVar.p(false);
                y1.q qVar116 = new y1.q(jB2);
                s0Var.e();
                sVar.W(1528582156);
                v0 v0VarK110 = v.d.k(150, 6, null);
                sVar.p(false);
                p0VarB3 = u0.b(s0Var, qVar115, qVar116, v0VarK110, w0Var118, sVar, 196608);
                sVar.W(1023351670);
                sVar.p(false);
                z1.c cVarF6 = y1.q.f(j5);
                zF2 = sVar.f(cVarF6);
                objK2 = sVar.K();
                if (zF2) {
                    if (objK2 == obj) {
                    }
                    obj = w0Var;
                    v.w0 w0Var119 = (v.w0) objK2;
                    sVar.W(1023351670);
                    sVar.p(false);
                    y1.q qVar117 = new y1.q(j5);
                    sVar.W(1023351670);
                    sVar.p(false);
                    y1.q qVar118 = new y1.q(j5);
                    s0Var.e();
                    sVar.W(-543659263);
                    v0 v0VarK111 = v.d.k(150, 6, null);
                    sVar.p(false);
                    p0VarB4 = u0.b(s0Var, qVar117, qVar118, v0VarK111, w0Var119, sVar, 196608);
                    fFloatValue = ((Number) p0VarB6.f13430h.getValue()).floatValue();
                    sVar.W(-156998101);
                    if (nVar2 == null) {
                        cVarE = null;
                        r13 = 0;
                    } else {
                        r13 = 0;
                        cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                    }
                    sVar.p(r13);
                    objK3 = sVar.K();
                    if (objK3 == obj) {
                        objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                        sVar.h0(objK3);
                    }
                    sVar.W(-156965270);
                    sVar.p(r13);
                    objK4 = sVar.K();
                    if (objK4 == obj) {
                        objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                        sVar.h0(objK4);
                    }
                    sVar.W(-156940524);
                    sVar.p(r13);
                    sVar.W(-156921964);
                    sVar.p(r13);
                    sVar.W(-156902962);
                    sVar.p(r13);
                    if (!z11) {
                        j12 = q2Var.f2097v;
                    } else if (z12) {
                        j12 = q2Var.f2098w;
                    } else if (zBooleanValue) {
                        j12 = q2Var.f2095t;
                    } else {
                        j12 = q2Var.f2096u;
                    }
                    sVar.W(-156893937);
                    if (nVar3 == null) {
                        cVarE2 = null;
                    } else {
                        cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                    }
                    sVar.p(r13);
                    sVar.W(-156884470);
                    sVar.p(r13);
                    sVar.W(-567018607);
                    objK5 = sVar.K();
                    if (objK5 == obj) {
                        objK5 = f1.b.s(new x1.e(0L));
                        sVar.h0(objK5);
                    }
                    b1Var = (b1) objK5;
                    n1.c cVarE11 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                    zC = sVar.c(fFloatValue);
                    objK6 = sVar.K();
                    if (zC) {
                        objK6 = new i(fFloatValue, b1Var);
                        sVar.h0(objK6);
                    } else {
                        objK6 = new i(fFloatValue, b1Var);
                        sVar.h0(objK6);
                    }
                    c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE11, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                    f1.s sVar11 = sVar;
                    sVar11.p(false);
                    sVar2 = sVar11;
                } else {
                    obj = w0Var;
                }
                obj = w0Var;
                v.w0 w0Var1110 = new v.w0(cVar2, new b2.a(17, cVarF6));
                sVar.h0(w0Var1110);
                objK2 = w0Var1110;
                obj = w0Var;
                v.w0 w0Var1111 = (v.w0) objK2;
                sVar.W(1023351670);
                sVar.p(false);
                y1.q qVar119 = new y1.q(j5);
                sVar.W(1023351670);
                sVar.p(false);
                y1.q qVar1110 = new y1.q(j5);
                s0Var.e();
                sVar.W(-543659263);
                v0 v0VarK112 = v.d.k(150, 6, null);
                sVar.p(false);
                p0VarB4 = u0.b(s0Var, qVar119, qVar1110, v0VarK112, w0Var1111, sVar, 196608);
                fFloatValue = ((Number) p0VarB6.f13430h.getValue()).floatValue();
                sVar.W(-156998101);
                if (nVar2 == null) {
                    cVarE = null;
                    r13 = 0;
                } else {
                    r13 = 0;
                    cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                }
                sVar.p(r13);
                objK3 = sVar.K();
                if (objK3 == obj) {
                    objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                    sVar.h0(objK3);
                }
                sVar.W(-156965270);
                sVar.p(r13);
                objK4 = sVar.K();
                if (objK4 == obj) {
                    objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                    sVar.h0(objK4);
                }
                sVar.W(-156940524);
                sVar.p(r13);
                sVar.W(-156921964);
                sVar.p(r13);
                sVar.W(-156902962);
                sVar.p(r13);
                if (!z11) {
                    j12 = q2Var.f2097v;
                } else if (z12) {
                    j12 = q2Var.f2098w;
                } else if (zBooleanValue) {
                    j12 = q2Var.f2095t;
                } else {
                    j12 = q2Var.f2096u;
                }
                sVar.W(-156893937);
                if (nVar3 == null) {
                    cVarE2 = null;
                } else {
                    cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                }
                sVar.p(r13);
                sVar.W(-156884470);
                sVar.p(r13);
                sVar.W(-567018607);
                objK5 = sVar.K();
                if (objK5 == obj) {
                    objK5 = f1.b.s(new x1.e(0L));
                    sVar.h0(objK5);
                }
                b1Var = (b1) objK5;
                n1.c cVarE12 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                zC = sVar.c(fFloatValue);
                objK6 = sVar.K();
                if (zC) {
                    objK6 = new i(fFloatValue, b1Var);
                    sVar.h0(objK6);
                } else {
                    objK6 = new i(fFloatValue, b1Var);
                    sVar.h0(objK6);
                }
                c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE12, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                f1.s sVar12 = sVar;
                sVar12.p(false);
                sVar2 = sVar12;
            } else {
                z13 = z16;
            }
            f12 = 1.0f;
            sVar.p(false);
            Float fValueOf110 = Float.valueOf(f12);
            g gVar115 = (g) k1Var.getValue();
            sVar.W(1435837472);
            iOrdinal3 = gVar115.ordinal();
            if (iOrdinal3 == 0) {
                f13 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new cc.s();
                    }
                } else if (z17) {
                    f13 = 1.0f;
                }
                f13 = 0.0f;
            }
            sVar.p(false);
            p0VarB = u0.b(s0Var, fValueOf110, Float.valueOf(f13), (v) bVar2.invoke(s0Var.e(), sVar, 0), w0Var2, sVar, 196608);
            g gVar116 = (g) s0Var.c();
            sVar.W(1128033978);
            iOrdinal4 = gVar116.ordinal();
            if (iOrdinal4 == 0) {
                if (iOrdinal4 == 1) {
                    if (iOrdinal4 != 2) {
                        throw new cc.s();
                    }
                } else if (z17) {
                }
            }
            sVar.p(false);
            Float fValueOf111 = Float.valueOf(f14);
            g gVar117 = (g) k1Var.getValue();
            sVar.W(1128033978);
            iOrdinal5 = gVar117.ordinal();
            if (iOrdinal5 == 0) {
                f15 = 1.0f;
            } else {
                if (iOrdinal5 == 1) {
                    if (iOrdinal5 != 2) {
                        throw new cc.s();
                    }
                } else if (z17) {
                }
                f15 = 1.0f;
            }
            sVar.p(z14);
            Float fValueOf112 = Float.valueOf(f15);
            s0Var.e();
            sVar.W(-1868044898);
            v0 v0VarK113 = v.d.k(150, 6, null);
            sVar.p(z14);
            p0VarB2 = u0.b(s0Var, fValueOf111, fValueOf112, v0VarK113, w0Var2, sVar, 196608);
            gVar2 = (g) k1Var.getValue();
            sVar.W(-107432127);
            iArr = q.f3734a;
            if (iArr[gVar2.ordinal()] == 1) {
                j10 = jB2;
            } else {
                j10 = j14;
            }
            sVar.p(false);
            cVarF = y1.q.f(j10);
            zF = sVar.f(cVarF);
            objK = sVar.K();
            cVar2 = u.c.f12958a;
            if (zF) {
                v.w0 w0Var1112 = new v.w0(cVar2, new b2.a(17, cVarF));
                sVar.h0(w0Var1112);
                objK = w0Var1112;
            } else {
                v.w0 w0Var1113 = new v.w0(cVar2, new b2.a(17, cVarF));
                sVar.h0(w0Var1113);
                objK = w0Var1113;
            }
            v.w0 w0Var1114 = (v.w0) objK;
            gVar3 = (g) s0Var.c();
            sVar.W(-107432127);
            if (iArr[gVar3.ordinal()] == 1) {
                j11 = jB2;
            } else {
                j11 = j14;
            }
            sVar.p(false);
            y1.q qVar1111 = new y1.q(j11);
            gVar4 = (g) k1Var.getValue();
            sVar.W(-107432127);
            if (iArr[gVar4.ordinal()] != 1) {
                jB2 = j14;
            }
            sVar.p(false);
            y1.q qVar1112 = new y1.q(jB2);
            s0Var.e();
            sVar.W(1528582156);
            v0 v0VarK114 = v.d.k(150, 6, null);
            sVar.p(false);
            p0VarB3 = u0.b(s0Var, qVar1111, qVar1112, v0VarK114, w0Var1114, sVar, 196608);
            sVar.W(1023351670);
            sVar.p(false);
            z1.c cVarF7 = y1.q.f(j5);
            zF2 = sVar.f(cVarF7);
            objK2 = sVar.K();
            if (zF2) {
                if (objK2 == obj) {
                }
                obj = w0Var;
                v.w0 w0Var1115 = (v.w0) objK2;
                sVar.W(1023351670);
                sVar.p(false);
                y1.q qVar1113 = new y1.q(j5);
                sVar.W(1023351670);
                sVar.p(false);
                y1.q qVar1114 = new y1.q(j5);
                s0Var.e();
                sVar.W(-543659263);
                v0 v0VarK115 = v.d.k(150, 6, null);
                sVar.p(false);
                p0VarB4 = u0.b(s0Var, qVar1113, qVar1114, v0VarK115, w0Var1115, sVar, 196608);
                fFloatValue = ((Number) p0VarB6.f13430h.getValue()).floatValue();
                sVar.W(-156998101);
                if (nVar2 == null) {
                    cVarE = null;
                    r13 = 0;
                } else {
                    r13 = 0;
                    cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
                }
                sVar.p(r13);
                objK3 = sVar.K();
                if (objK3 == obj) {
                    objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                    sVar.h0(objK3);
                }
                sVar.W(-156965270);
                sVar.p(r13);
                objK4 = sVar.K();
                if (objK4 == obj) {
                    objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                    sVar.h0(objK4);
                }
                sVar.W(-156940524);
                sVar.p(r13);
                sVar.W(-156921964);
                sVar.p(r13);
                sVar.W(-156902962);
                sVar.p(r13);
                if (!z11) {
                    j12 = q2Var.f2097v;
                } else if (z12) {
                    j12 = q2Var.f2098w;
                } else if (zBooleanValue) {
                    j12 = q2Var.f2095t;
                } else {
                    j12 = q2Var.f2096u;
                }
                sVar.W(-156893937);
                if (nVar3 == null) {
                    cVarE2 = null;
                } else {
                    cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
                }
                sVar.p(r13);
                sVar.W(-156884470);
                sVar.p(r13);
                sVar.W(-567018607);
                objK5 = sVar.K();
                if (objK5 == obj) {
                    objK5 = f1.b.s(new x1.e(0L));
                    sVar.h0(objK5);
                }
                b1Var = (b1) objK5;
                n1.c cVarE13 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
                zC = sVar.c(fFloatValue);
                objK6 = sVar.K();
                if (zC) {
                    objK6 = new i(fFloatValue, b1Var);
                    sVar.h0(objK6);
                } else {
                    objK6 = new i(fFloatValue, b1Var);
                    sVar.h0(objK6);
                }
                c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE13, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
                f1.s sVar13 = sVar;
                sVar13.p(false);
                sVar2 = sVar13;
            } else {
                obj = w0Var;
            }
            obj = w0Var;
            v.w0 w0Var1116 = new v.w0(cVar2, new b2.a(17, cVarF7));
            sVar.h0(w0Var1116);
            objK2 = w0Var1116;
            obj = w0Var;
            v.w0 w0Var1117 = (v.w0) objK2;
            sVar.W(1023351670);
            sVar.p(false);
            y1.q qVar1115 = new y1.q(j5);
            sVar.W(1023351670);
            sVar.p(false);
            y1.q qVar1116 = new y1.q(j5);
            s0Var.e();
            sVar.W(-543659263);
            v0 v0VarK116 = v.d.k(150, 6, null);
            sVar.p(false);
            p0VarB4 = u0.b(s0Var, qVar1115, qVar1116, v0VarK116, w0Var1117, sVar, 196608);
            fFloatValue = ((Number) p0VarB6.f13430h.getValue()).floatValue();
            sVar.W(-156998101);
            if (nVar2 == null) {
                cVarE = null;
                r13 = 0;
            } else {
                r13 = 0;
                cVarE = n1.h.e(-1236585568, new l(r0Var, r0Var2, fFloatValue, p0VarB4, nVar2, z13, p0VarB3), sVar);
            }
            sVar.p(r13);
            objK3 = sVar.K();
            if (objK3 == obj) {
                objK3 = f1.b.n(w0.f5187f, new n(p0VarB, r13));
                sVar.h0(objK3);
            }
            sVar.W(-156965270);
            sVar.p(r13);
            objK4 = sVar.K();
            if (objK4 == obj) {
                objK4 = f1.b.n(w0.f5187f, new n(p0VarB2, 1));
                sVar.h0(objK4);
            }
            sVar.W(-156940524);
            sVar.p(r13);
            sVar.W(-156921964);
            sVar.p(r13);
            sVar.W(-156902962);
            sVar.p(r13);
            if (!z11) {
                j12 = q2Var.f2097v;
            } else if (z12) {
                j12 = q2Var.f2098w;
            } else if (zBooleanValue) {
                j12 = q2Var.f2095t;
            } else {
                j12 = q2Var.f2096u;
            }
            sVar.W(-156893937);
            if (nVar3 == null) {
                cVarE2 = null;
            } else {
                cVarE2 = n1.h.e(2079816678, new m(j12, nVar3), sVar);
            }
            sVar.p(r13);
            sVar.W(-156884470);
            sVar.p(r13);
            sVar.W(-567018607);
            objK5 = sVar.K();
            if (objK5 == obj) {
                objK5 = f1.b.s(new x1.e(0L));
                sVar.h0(objK5);
            }
            b1Var = (b1) objK5;
            n1.c cVarE14 = n1.h.e(157291737, new k(b1Var, h0Var, cVar, r13), sVar);
            zC = sVar.c(fFloatValue);
            objK6 = sVar.K();
            if (zC) {
                objK6 = new i(fFloatValue, b1Var);
                sVar.h0(objK6);
            } else {
                objK6 = new i(fFloatValue, b1Var);
                sVar.h0(objK6);
            }
            c1.b1.b(nVar, null, cVarE, null, cVarE2, null, null, z10, fFloatValue, (h9.k) objK6, cVarE14, null, h0Var, sVar, ((i16 >> 3) & 112) | 6 | ((i15 << 21) & 234881024), ((i15 >> 6) & 7168) | 48);
            f1.s sVar14 = sVar;
            sVar14.p(false);
            sVar2 = sVar14;
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new o(str, nVar, l0Var, nVar2, nVar3, z10, z11, z12, kVar, h0Var, q2Var, cVar, i7, i10);
        }
    }

    public static final void b(long j5, r0 r0Var, h9.n nVar, f1.s sVar, int i7) {
        int i10;
        f1.s sVar2;
        long j10;
        r0 r0Var2;
        h9.n nVar2;
        sVar.Y(1208685580);
        if ((i7 & 6) == 0) {
            i10 = (sVar.e(j5) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(r0Var) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(nVar) ? 256 : 128;
        }
        if ((i10 & 147) == 146 && sVar.z()) {
            sVar.Q();
            j10 = j5;
            r0Var2 = r0Var;
            nVar2 = nVar;
            sVar2 = sVar;
        } else {
            sVar2 = sVar;
            e.a(j5, r0Var, nVar, sVar2, i10 & 1022);
            j10 = j5;
            r0Var2 = r0Var;
            nVar2 = nVar;
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h(j10, r0Var2, nVar2, i7, 1);
        }
    }

    public static final void c(long j5, h9.n nVar, f1.s sVar, int i7) {
        int i10;
        sVar.Y(660142980);
        if ((i7 & 6) == 0) {
            i10 = (sVar.e(j5) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(nVar) ? 32 : 16;
        }
        if ((i10 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            f1.b.a(a0.f1805a.a(new y1.q(j5)), nVar, sVar, (i10 & 112) | 8);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new p(j5, nVar, i7);
        }
    }

    public static final Object d(o2.l0 l0Var) {
        Object objW = l0Var.w();
        x xVar = objW instanceof x ? (x) objW : null;
        if (xVar != null) {
            return xVar.f9443o;
        }
        return null;
    }
}
