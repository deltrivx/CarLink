package n3;

import aa.s0;
import aa.y0;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import b3.g0;
import b3.o0;
import b3.q0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.h2;
import f1.l2;
import f1.q1;
import f1.v;
import f1.w0;
import f1.w1;
import i9.y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l0.s1;
import nb.f0;
import nb.k0;
import nb.n0;
import nb.u0;
import nb.w;
import nb.x0;
import o2.d1;
import q2.a0;
import q2.h1;
import r2.j1;
import r2.r2;
import r9.l1;
import r9.x1;
import ra.i0;
import s.d0;
import s.h0;
import t8.z;
import u8.c0;
import x.m0;
import x9.r0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements oc.b, oc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e2.f f8747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e2.f f8748b;

    public static /* synthetic */ boolean A0(r0 r0Var, k0 k0Var, int i7) {
        if ((i7 & 2) != 0) {
            k0Var = null;
        }
        return z0(r0Var, k0Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00df  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x0121  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x014b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void B(final d2.b bVar, final String str, final r1.p pVar, r1.d dVar, o2.i iVar, float f10, f1.s sVar, final int i7, final int i10) {
        r1.d dVar2;
        int i11;
        o2.i iVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        final float f11;
        final r1.d dVar3;
        final o2.i iVar3;
        w1 w1VarR;
        int i17;
        r1.d dVar4;
        o2.i iVar4;
        float f12;
        w0 w0Var;
        r1.p pVarA;
        Object objK;
        int i18;
        a0 a0Var;
        q2.h hVar;
        Object objK2;
        sVar.Y(1142754848);
        int i19 = (sVar.h(bVar) ? 4 : 2) | i7;
        if ((i7 & 384) == 0) {
            i19 |= sVar.f(pVar) ? 256 : 128;
        }
        int i20 = i10 & 8;
        if (i20 != 0) {
            i11 = i19 | 3072;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i11 = i19 | (sVar.f(dVar2) ? 2048 : 1024);
        }
        int i21 = i10 & 16;
        if (i21 == 0) {
            if ((i7 & 24576) == 0) {
                iVar2 = iVar;
                i11 |= sVar.f(iVar2) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
            }
            i12 = i10 & 32;
            if (i12 != 0) {
                i14 = i11 | 196608;
            } else {
                if (sVar.c(f10)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i14 = i11 | i13;
            }
            if ((i10 & 64) != 0) {
                i15 = 1572864;
            } else if (sVar.f(null)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i16 = i14 | i15;
            if ((599187 & i16) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (sVar.N(i16 & 1, z10)) {
                if (i20 != 0) {
                    dVar4 = r1.c.f11096e;
                    i17 = i12;
                } else {
                    i17 = i12;
                    dVar4 = dVar2;
                }
                if (i21 != 0) {
                    iVar4 = o2.j.f9357b;
                } else {
                    iVar4 = iVar2;
                }
                if (i17 != 0) {
                    f12 = 1.0f;
                } else {
                    f12 = f10;
                }
                w0Var = f1.n.f5051a;
                pVarA = r1.m.f11116a;
                if (str != null) {
                    sVar.W(1899234820);
                    objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new l8.r(3, str);
                        sVar.h0(objK2);
                    }
                    pVarA = y2.k.a(pVarA, (h9.k) objK2);
                    sVar.p(false);
                } else {
                    sVar.W(1899393602);
                    sVar.p(false);
                }
                r1.p pVarD = androidx.compose.ui.draw.a.d(n4.h.p(pVar.a(pVarA)), bVar, dVar4, iVar4, f12, null, 2);
                objK = sVar.K();
                if (objK == w0Var) {
                    objK = m0.f14428a;
                    sVar.h0(objK);
                }
                o2.m0 m0Var = (o2.m0) objK;
                long j5 = sVar.T;
                i18 = (int) (j5 ^ (j5 >>> 32));
                r1.p pVarC = r1.a.c(sVar, pVarD);
                q1 q1VarL = sVar.l();
                q2.j.f10719d0.getClass();
                a0Var = q2.i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(a0Var);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, q2.i.f10708e, m0Var);
                f1.b.w(sVar, q2.i.f10707d, q1VarL);
                f1.b.w(sVar, q2.i.f10706c, pVarC);
                hVar = q2.i.f10709f;
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i18))) {
                    ob.a.w(i18, sVar, i18, hVar);
                }
                sVar.p(true);
                dVar3 = dVar4;
                iVar3 = iVar4;
                f11 = f12;
            } else {
                sVar.Q();
                f11 = f10;
                dVar3 = dVar2;
                iVar3 = iVar2;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new h9.n() { // from class: x.l0
                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n3.n.B(bVar, str, pVar, dVar3, iVar3, f11, (f1.s) obj, f1.b.y(i7 | 1), i10);
                        return t8.z.f12851a;
                    }
                };
            }
        }
        i11 |= 24576;
        iVar2 = iVar;
        i12 = i10 & 32;
        if (i12 != 0) {
            i14 = i11 | 196608;
        } else {
            if (sVar.c(f10)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i14 = i11 | i13;
        }
        if ((i10 & 64) != 0) {
            i15 = 1572864;
        } else if (sVar.f(null)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        i16 = i14 | i15;
        if ((599187 & i16) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (sVar.N(i16 & 1, z10)) {
            if (i20 != 0) {
                dVar4 = r1.c.f11096e;
                i17 = i12;
            } else {
                i17 = i12;
                dVar4 = dVar2;
            }
            if (i21 != 0) {
                iVar4 = o2.j.f9357b;
            } else {
                iVar4 = iVar2;
            }
            if (i17 != 0) {
                f12 = 1.0f;
            } else {
                f12 = f10;
            }
            w0Var = f1.n.f5051a;
            pVarA = r1.m.f11116a;
            if (str != null) {
                sVar.W(1899234820);
                objK2 = sVar.K();
                if (objK2 == w0Var) {
                    objK2 = new l8.r(3, str);
                    sVar.h0(objK2);
                }
                pVarA = y2.k.a(pVarA, (h9.k) objK2);
                sVar.p(false);
            } else {
                sVar.W(1899393602);
                sVar.p(false);
            }
            r1.p pVarD2 = androidx.compose.ui.draw.a.d(n4.h.p(pVar.a(pVarA)), bVar, dVar4, iVar4, f12, null, 2);
            objK = sVar.K();
            if (objK == w0Var) {
                objK = m0.f14428a;
                sVar.h0(objK);
            }
            o2.m0 m0Var2 = (o2.m0) objK;
            long j10 = sVar.T;
            i18 = (int) (j10 ^ (j10 >>> 32));
            r1.p pVarC2 = r1.a.c(sVar, pVarD2);
            q1 q1VarL2 = sVar.l();
            q2.j.f10719d0.getClass();
            a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0Var2);
            f1.b.w(sVar, q2.i.f10707d, q1VarL2);
            f1.b.w(sVar, q2.i.f10706c, pVarC2);
            hVar = q2.i.f10709f;
            if (sVar.S) {
                ob.a.w(i18, sVar, i18, hVar);
            } else {
                ob.a.w(i18, sVar, i18, hVar);
            }
            sVar.p(true);
            dVar3 = dVar4;
            iVar3 = iVar4;
            f11 = f12;
        } else {
            sVar.Q();
            f11 = f10;
            dVar3 = dVar2;
            iVar3 = iVar2;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n() { // from class: x.l0
                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n3.n.B(bVar, str, pVar, dVar3, iVar3, f11, (f1.s) obj, f1.b.y(i7 | 1), i10);
                    return t8.z.f12851a;
                }
            };
        }
    }

    public static final boolean B0(int i7) {
        int type = Character.getType(i7);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final void C(y1.f fVar, String str, r1.p pVar, f1.s sVar, int i7, int i10) {
        r1.h hVar = r1.c.f11096e;
        o2.i iVar = (i10 & 16) != 0 ? o2.j.f9357b : o2.j.f9356a;
        boolean zF = sVar.f(fVar);
        Object objK = sVar.K();
        if (zF || objK == f1.n.f5051a) {
            Bitmap bitmap = fVar.f14890a;
            d2.a aVar = new d2.a(fVar, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
            aVar.f3748g = 1;
            sVar.h0(aVar);
            objK = aVar;
        }
        B((d2.a) objK, str, pVar, hVar, iVar, 1.0f, sVar, i7 & 4194288, 0);
    }

    public static final boolean C0(int i7) {
        return Character.isWhitespace(i7) || i7 == 160;
    }

    public static final wa.b D(String str) {
        wa.c cVar = wa.h.f14258a;
        return new wa.b(wa.h.f14258a, wa.e.e(str));
    }

    public static final boolean D0(int i7) {
        int type;
        return (!C0(i7) || (type = Character.getType(i7)) == 14 || type == 13 || i7 == 10) ? false : true;
    }

    public static final wa.b E(String str) {
        wa.c cVar = wa.h.f14258a;
        return new wa.b(wa.h.f14260c, wa.e.e(str));
    }

    public static final nb.w0 E0(w wVar) {
        i9.l.e(wVar, "<this>");
        nb.w0 w0VarG = u0.g(wVar, true);
        i9.l.d(w0VarG, "makeNullable(...)");
        return w0VarG;
    }

    public static final int F(l0.u0 u0Var, long j5, r2 r2Var) {
        long jC;
        int iS0;
        s1 s1VarD = u0Var.d();
        if (s1VarD != null) {
            b3.p pVar = s1VarD.f7828a.f1409b;
            o2.w wVarC = u0Var.c();
            if (wVarC != null && (iS0 = s0(pVar, (jC = wVarC.C(j5)), r2Var)) != -1) {
                return pVar.g(x1.b.a(jC, (pVar.b(iS0) + pVar.f(iS0)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long G(l0.u0 u0Var, x1.c cVar, x1.c cVar2, int i7) {
        long jX0 = x0(u0Var, cVar, i7);
        if (q0.c(jX0)) {
            return q0.f1428b;
        }
        long jX1 = x0(u0Var, cVar2, i7);
        if (q0.c(jX1)) {
            return q0.f1428b;
        }
        int i10 = (int) (jX0 >> 32);
        int i11 = (int) (jX1 & 4294967295L);
        return g0.b(Math.min(i10, i10), Math.max(i11, i11));
    }

    public static final void H(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iS0 = c0.S0(u8.q.a0(setEntrySet, 10));
        if (iS0 < 16) {
            iS0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final w H0(w wVar, y9.h hVar) {
        return (wVar.getAnnotations().isEmpty() && hVar.isEmpty()) ? wVar : wVar.G0().J0(nb.c.r(wVar.C0(), hVar));
    }

    public static final boolean I(o0 o0Var, int i7) {
        b3.p pVar = o0Var.f1409b;
        int iD = pVar.d(i7);
        return i7 == o0Var.g(iD) || i7 == pVar.c(iD, false) ? o0Var.h(i7) != o0Var.a(i7) : o0Var.a(i7) != o0Var.a(i7 - 1);
    }

    public static final nb.w0 I0(w wVar) {
        nb.a0 a0Var;
        nb.w0 w0VarQ;
        i9.l.e(wVar, "<this>");
        nb.w0 w0VarG0 = wVar.G0();
        if (w0VarG0 instanceof nb.p) {
            nb.p pVar = (nb.p) w0VarG0;
            nb.a0 a0VarQ = pVar.f9023b;
            if (!a0VarQ.D0().n().isEmpty() && a0VarQ.D0().l() != null) {
                List listN = a0VarQ.D0().n();
                i9.l.d(listN, "getParameters(...)");
                ArrayList arrayList = new ArrayList(u8.q.a0(listN, 10));
                Iterator it = listN.iterator();
                while (it.hasNext()) {
                    arrayList.add(new f0((r0) it.next()));
                }
                a0VarQ = nb.c.q(a0VarQ, arrayList, null, 2);
            }
            nb.a0 a0VarQ2 = pVar.f9024c;
            if (!a0VarQ2.D0().n().isEmpty() && a0VarQ2.D0().l() != null) {
                List listN2 = a0VarQ2.D0().n();
                i9.l.d(listN2, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(u8.q.a0(listN2, 10));
                Iterator it2 = listN2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new f0((r0) it2.next()));
                }
                a0VarQ2 = nb.c.q(a0VarQ2, arrayList2, null, 2);
            }
            w0VarQ = nb.c.e(a0VarQ, a0VarQ2);
        } else {
            if (!(w0VarG0 instanceof nb.a0)) {
                throw new cc.s();
            }
            a0Var = (nb.a0) w0VarG0;
            if (!a0Var.D0().n().isEmpty() && a0Var.D0().l() != null) {
                w0VarQ = a0Var;
                w0VarQ = a0Var;
                List listN3 = a0Var.D0().n();
                i9.l.d(listN3, "getParameters(...)");
                ArrayList arrayList3 = new ArrayList(u8.q.a0(listN3, 10));
                Iterator it3 = listN3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new f0((r0) it3.next()));
                }
                w0VarQ = nb.c.q(a0Var, arrayList3, null, 2);
            }
        }
        w0VarQ = a0Var;
        w0VarQ = a0Var;
        w0VarQ = a0Var;
        return nb.c.h(w0VarQ, w0VarG0);
    }

    public static final boolean J(String str) {
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (i9.l.f(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final void J0(Object[] objArr, int i7, int i10) {
        i9.l.e(objArr, "<this>");
        while (i7 < i10) {
            objArr[i7] = null;
            i7++;
        }
    }

    public static final wa.b K(wa.e eVar) {
        wa.c cVar = wa.h.f14258a;
        wa.b bVar = wa.h.k;
        return new wa.b(bVar.f14236a, wa.e.e(eVar.c().concat(bVar.f().c())));
    }

    public static final Class K0(w wVar) {
        nb.a0 a0VarI;
        Class clsL0 = L0(wVar.D0().l());
        if (clsL0 == null) {
            return null;
        }
        if (u0.e(wVar) && ((a0VarI = za.f.i(wVar)) == null || u0.e(a0VarI) || u9.i.G(a0VarI))) {
            return null;
        }
        return clsL0;
    }

    public static final wa.b L(String str) {
        wa.c cVar = wa.h.f14258a;
        return new wa.b(wa.h.f14259b, wa.e.e(str));
    }

    public static final Class L0(x9.k kVar) {
        if (!(kVar instanceof x9.e) || !za.f.b(kVar)) {
            return null;
        }
        x9.e eVar = (x9.e) kVar;
        Class clsK = x1.k(eVar);
        if (clsK != null) {
            return clsK;
        }
        throw new cc.a0(2, "Class object for the class " + eVar.getName() + " cannot be found (classId=" + db.e.f((x9.h) kVar) + ')');
    }

    public static final String M(Object[] objArr, int i7, int i10, u8.g gVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i7 + i11];
            if (obj == gVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        i9.l.d(string, "toString(...)");
        return string;
    }

    public static final long M0(long j5) {
        return (((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j5 >> 32)) << 32);
    }

    public static final long N(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        return (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    public static final String N0(float f10) {
        if (Float.isNaN(f10)) {
            return "NaN";
        }
        if (Float.isInfinite(f10)) {
            return f10 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f11 = f10 * fPow;
        int i7 = (int) f11;
        if (f11 - i7 >= 0.5f) {
            i7++;
        }
        float f12 = i7 / fPow;
        return iMax > 0 ? String.valueOf(f12) : String.valueOf((int) f12);
    }

    public static final wa.b O(wa.b bVar) {
        wa.c cVar = wa.h.f14258a;
        return new wa.b(wa.h.f14258a, wa.e.e("U".concat(bVar.f().c())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [q1.a, q1.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList O0(h2 h2Var, int i7, Integer num) {
        ?? iVar = new q1.i(h2Var);
        i7 = h2Var.q(i7);
        f1.a aVarA = h2Var.a(i7);
        while (i7 >= 0) {
            iVar.e(h2Var.f4970a.o(i7), num);
            if (i7 >= 0) {
                f1.a aVar = aVarA;
                aVarA = h2Var.a(i7);
                i7 = h2Var.q(i7);
                num = aVar;
            } else {
                num = aVarA;
            }
        }
        return iVar.f10577a;
    }

    public static final void P0(String str, long j5) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j5);
        }
    }

    public static final f0 Q(w wVar) {
        i9.l.e(wVar, "<this>");
        return new f0(wVar);
    }

    public static final void Q0(y2.m mVar, int i7, x2.g gVar) {
        h1.e eVar = new h1.e(new y2.m[16]);
        List listI = mVar.i(false, false);
        while (true) {
            eVar.d(eVar.f6423c, listI);
            while (true) {
                int i10 = eVar.f6423c;
                if (i10 == 0) {
                    return;
                }
                y2.m mVar2 = (y2.m) eVar.l(i10 - 1);
                boolean zE = y2.p.e(mVar2);
                y2.j jVar = mVar2.f15020d;
                h0 h0Var = jVar.f15011a;
                if (!zE && !h0Var.c(y2.r.f15058i)) {
                    h1 h1VarD = mVar2.d();
                    if (h1VarD == null) {
                        throw ob.a.o("Expected semantics node to have a coordinator.");
                    }
                    k kVarQ = l.Q(d1.e(h1VarD));
                    if (kVarQ.f8741a < kVarQ.f8743c && kVarQ.f8742b < kVarQ.f8744d) {
                        Object objG = jVar.f15011a.g(y2.i.f14990e);
                        if (objG == null) {
                            objG = null;
                        }
                        h9.n nVar = (h9.n) objG;
                        Object objG2 = h0Var.g(y2.r.f15069u);
                        y2.h hVar = (y2.h) (objG2 != null ? objG2 : null);
                        if (nVar == null || hVar == null || ((Number) hVar.f14985b.invoke()).floatValue() <= 0.0f) {
                            listI = mVar2.i(false, false);
                        } else {
                            int i11 = i7 + 1;
                            gVar.invoke(new x2.h(mVar2, i11, kVarQ, h1VarD));
                            Q0(mVar2, i11, gVar);
                        }
                    }
                }
            }
        }
    }

    public static final Object R(q2.l lVar, h9.a aVar, a9.c cVar) {
        Object obj;
        h1 h1VarU;
        Object objV;
        q2.d1 d1Var;
        r1.o oVar = (r1.o) lVar;
        boolean z10 = oVar.f11117a.f11129n;
        if (z10) {
            if (!z10) {
                n2.a.b("visitAncestors called on an unattached node");
            }
            r1.o oVar2 = oVar.f11117a.f11121e;
            q2.h0 h0VarV = q2.f.v(lVar);
            loop0: while (true) {
                obj = null;
                if (h0VarV == null) {
                    break;
                }
                if ((h0VarV.E.f10617f.f11120d & 524288) != 0) {
                    while (oVar2 != null) {
                        if ((oVar2.f11119c & 524288) != 0) {
                            r1.o oVarF = oVar2;
                            h1.e eVar = null;
                            while (oVarF != null) {
                                if (oVarF instanceof v2.a) {
                                    obj = oVarF;
                                    break loop0;
                                }
                                if ((oVarF.f11119c & 524288) != 0 && (oVarF instanceof q2.m)) {
                                    int i7 = 0;
                                    for (r1.o oVar3 = ((q2.m) oVarF).f10746p; oVar3 != null; oVar3 = oVar3.f11122f) {
                                        if ((oVar3.f11119c & 524288) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                oVarF = oVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new h1.e(new r1.o[16]);
                                                }
                                                if (oVarF != null) {
                                                    eVar.b(oVarF);
                                                    oVarF = null;
                                                }
                                                eVar.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                oVarF = q2.f.f(eVar);
                            }
                        }
                        oVar2 = oVar2.f11121e;
                    }
                }
                h0VarV = h0VarV.v();
                oVar2 = (h0VarV == null || (d1Var = h0VarV.E) == null) ? null : d1Var.f10616e;
            }
            v2.a aVar2 = (v2.a) obj;
            if (aVar2 != null && (objV = aVar2.v((h1VarU = q2.f.u(lVar)), new k2.d(7, aVar, h1VarU), cVar)) == z8.a.f15774a) {
                return objV;
            }
        }
        return z.f12851a;
    }

    public static ya.g R0(h9.k kVar) {
        i9.l.e(kVar, "changeOptions");
        ya.k kVar2 = new ya.k();
        kVar.invoke(kVar2);
        kVar2.f15217a = true;
        return new ya.g(kVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [q1.a, q1.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [f1.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List S(l2 l2Var, Integer num, int i7, Integer num2) {
        int iD;
        d0 d0Var;
        if (l2Var.f5039w || l2Var.p() == 0) {
            return u8.w.f13122a;
        }
        ?? iVar = new q1.i(l2Var);
        if (num2 != null) {
            iD = num2.intValue();
        } else {
            iD = l2Var.f5038v;
            if (iD < 0) {
                iD = l2Var.D(l2Var.f5019b, i7);
            }
        }
        if (num == 0) {
            int iM = l2Var.f5026i - l2Var.M(l2Var.f5019b, l2Var.r(i7));
            s.w wVar = l2Var.f5035s;
            num = Integer.valueOf(iM + ((wVar == null || (d0Var = (d0) wVar.b(i7)) == null) ? 0 : d0Var.f12408b));
        }
        while (i7 >= 0) {
            iVar.e(l2Var.N(i7), num);
            num = l2Var.b(i7);
            if (iD >= 0) {
                int i10 = iD;
                iD = l2Var.D(l2Var.f5019b, iD);
                i7 = i10;
            } else {
                i7 = iD;
            }
        }
        return iVar.f10577a;
    }

    public static final Object W(Object obj, x9.c cVar) {
        w wVarM0;
        Class clsK0;
        return (((cVar instanceof x9.k0) && za.f.e((x9.u0) cVar)) || (wVarM0 = m0(cVar)) == null || (clsK0 = K0(wVarM0)) == null) ? obj : p0(clsK0, cVar).invoke(obj, null);
    }

    public static int X(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String Y(x9.t tVar, int i7) {
        String strB;
        boolean z10 = (i7 & 1) != 0;
        boolean z11 = (i7 & 2) != 0;
        i9.l.e(tVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (tVar instanceof x9.j) {
                strB = "<init>";
            } else {
                strB = ((aa.q) tVar).getName().b();
                i9.l.d(strB, "asString(...)");
            }
            sb2.append(strB);
        }
        sb2.append("(");
        aa.a0 a0VarE0 = tVar.e0();
        wb.d dVar = wb.d.f14286a;
        if (a0VarE0 != null) {
            w type = a0VarE0.getType();
            i9.l.d(type, "getType(...)");
            sb2.append((pa.k) r.H(type, pa.r.k, dVar));
        }
        Iterator it = tVar.X().iterator();
        while (it.hasNext()) {
            w type2 = ((y0) it.next()).getType();
            i9.l.d(type2, "getType(...)");
            sb2.append((pa.k) r.H(type2, pa.r.k, dVar));
        }
        sb2.append(")");
        if (z10) {
            if (tVar instanceof x9.j) {
                sb2.append("V");
            } else {
                w wVarP = tVar.p();
                i9.l.b(wVarP);
                wa.e eVar = u9.i.f13141e;
                if (u9.i.E(wVarP, u9.n.f13171d)) {
                    w wVarP2 = tVar.p();
                    i9.l.b(wVarP2);
                    if (!u0.e(wVarP2) && !(tVar instanceof aa.q0)) {
                        sb2.append("V");
                    }
                }
                w wVarP3 = tVar.p();
                i9.l.b(wVarP3);
                sb2.append((pa.k) r.H(wVarP3, pa.r.k, dVar));
            }
        }
        return sb2.toString();
    }

    public static final String Z(x9.b bVar) {
        i9.l.e(bVar, "<this>");
        if (!za.d.o(bVar)) {
            x9.k kVarL = bVar.l();
            x9.e eVar = kVarL instanceof x9.e ? (x9.e) kVarL : null;
            if (eVar != null && !eVar.getName().f14248b) {
                x9.b bVarA = bVar.a();
                s0 s0Var = bVarA instanceof s0 ? (s0) bVarA : null;
                if (s0Var != null) {
                    return l.W(eVar, Y(s0Var, 3));
                }
            }
        }
        return null;
    }

    public static final boolean a0(w wVar, k0 k0Var, Set set) {
        boolean zA0;
        if (i9.l.a(wVar.D0(), k0Var)) {
            return true;
        }
        x9.h hVarL = wVar.D0().l();
        x9.i iVar = hVarL instanceof x9.i ? (x9.i) hVarL : null;
        List listQ = iVar != null ? iVar.q() : null;
        Iterable iterableN0 = u8.p.N0(wVar.B0());
        if (!(iterableN0 instanceof Collection) || !((Collection) iterableN0).isEmpty()) {
            Iterator it = iterableN0.iterator();
            do {
                u8.a0 a0Var = (u8.a0) it;
                if (a0Var.f13099b.hasNext()) {
                    u8.z zVar = (u8.z) a0Var.next();
                    int i7 = zVar.f13125a;
                    n0 n0Var = (n0) zVar.f13126b;
                    r0 r0Var = listQ != null ? (r0) u8.p.n0(i7, listQ) : null;
                    if ((r0Var == null || set == null || !set.contains(r0Var)) && !n0Var.c()) {
                        w wVarB = n0Var.b();
                        i9.l.d(wVarB, "getType(...)");
                        zA0 = a0(wVarB, k0Var, set);
                    } else {
                        zA0 = false;
                    }
                }
            } while (!zA0);
            return true;
        }
        return false;
    }

    public static final f0 b0(w wVar, x0 x0Var, r0 r0Var) {
        i9.l.e(wVar, "type");
        if ((r0Var != null ? r0Var.I() : null) == x0Var) {
            x0Var = x0.INVARIANT;
        }
        return new f0(wVar, x0Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:1: B:17:0x004a->B:40:?, LOOP_END, SYNTHETIC] */
    public static final s9.g c0(s9.g gVar, x9.c cVar, boolean z10) {
        List listX;
        w wVarP;
        w wVarM0;
        Iterator it;
        w type;
        i9.l.e(cVar, "descriptor");
        if (!za.f.a(cVar)) {
            List listI0 = cVar.i0();
            i9.l.d(listI0, "getContextReceiverParameters(...)");
            if (!listI0.isEmpty()) {
                Iterator it2 = listI0.iterator();
                while (it2.hasNext()) {
                    if (za.f.g(((aa.a0) it2.next()).getType())) {
                    }
                }
                listX = cVar.X();
                i9.l.d(listX, "getValueParameters(...)");
                if (!listX.isEmpty()) {
                    wVarP = cVar.p();
                    if (wVarP != null) {
                    }
                }
                it = listX.iterator();
                while (it.hasNext()) {
                    type = ((y0) it.next()).getType();
                    i9.l.d(type, "getType(...)");
                    if (za.f.g(type)) {
                    }
                }
                wVarP = cVar.p();
                if (wVarP != null) {
                }
            }
            listX = cVar.X();
            i9.l.d(listX, "getValueParameters(...)");
            if (!listX.isEmpty()) {
                it = listX.iterator();
                while (it.hasNext()) {
                    type = ((y0) it.next()).getType();
                    i9.l.d(type, "getType(...)");
                    if (za.f.g(type)) {
                    }
                }
                wVarP = cVar.p();
                return wVarP != null ? gVar : gVar;
            }
            wVarP = cVar.p();
            if ((wVarP != null || !za.f.c(wVarP)) && ((wVarM0 = m0(cVar)) == null || !za.f.g(wVarM0))) {
            }
        }
        return new s9.c0(gVar, cVar, z10);
    }

    public static final void f0(w wVar, nb.a0 a0Var, LinkedHashSet linkedHashSet, Set set) {
        x9.h hVarL = wVar.D0().l();
        if (hVarL instanceof r0) {
            if (!i9.l.a(wVar.D0(), a0Var.D0())) {
                linkedHashSet.add(hVarL);
                return;
            }
            for (w wVar2 : ((r0) hVarL).getUpperBounds()) {
                i9.l.b(wVar2);
                f0(wVar2, a0Var, linkedHashSet, set);
            }
            return;
        }
        x9.h hVarL2 = wVar.D0().l();
        x9.i iVar = hVarL2 instanceof x9.i ? (x9.i) hVarL2 : null;
        List listQ = iVar != null ? iVar.q() : null;
        int i7 = 0;
        for (n0 n0Var : wVar.B0()) {
            int i10 = i7 + 1;
            r0 r0Var = listQ != null ? (r0) u8.p.n0(i7, listQ) : null;
            if ((r0Var == null || set == null || !set.contains(r0Var)) && !n0Var.c() && !u8.p.g0(linkedHashSet, n0Var.b().D0().l()) && !i9.l.a(n0Var.b().D0(), a0Var.D0())) {
                w wVarB = n0Var.b();
                i9.l.d(wVarB, "getType(...)");
                f0(wVarB, a0Var, linkedHashSet, set);
            }
            i7 = i10;
        }
    }

    public static final long g0(long j5, boolean z10, int i7, float f10) {
        int iH = ((z10 || i7 == 2 || i7 == 4 || i7 == 5) && a.d(j5)) ? a.h(j5) : Integer.MAX_VALUE;
        if (a.j(j5) != iH) {
            iH = r.m(l0.q0.k(f10), a.j(j5), iH);
        }
        return g5.a.D(0, iH, 0, a.g(j5));
    }

    public static final Integer h0(h2 h2Var, v vVar, int i7, int i10) {
        Integer numH0;
        int[] iArr = h2Var.f4971b;
        while (true) {
            if (i7 >= i10) {
                return null;
            }
            int i11 = iArr[(i7 * 5) + 3] + i7;
            if (h2Var.j(i7) && h2Var.i(i7) == 206 && i9.l.a(h2Var.p(iArr, i7), f1.t.f5146e)) {
                Object objH = h2Var.h(i7, 0);
                f1.p pVar = objH instanceof f1.p ? (f1.p) objH : null;
                if (pVar != null && pVar.f5077a.equals(vVar)) {
                    return Integer.valueOf(i7);
                }
            }
            if (h2Var.d(i7) && (numH0 = h0(h2Var, vVar, i7 + 1, i11)) != null) {
                return Integer.valueOf(numH0.intValue());
            }
            i7 = i11;
        }
    }

    public static z.h i0(f1.s sVar) {
        float f10 = u.h.f12965a;
        c cVar = (c) sVar.j(j1.f11276h);
        boolean zC = sVar.c(cVar.a());
        Object objK = sVar.K();
        Object obj = f1.n.f5051a;
        if (zC || objK == obj) {
            objK = new v.s(new l0.o0(cVar));
            sVar.h0(objK);
        }
        v.s sVar2 = (v.s) objK;
        boolean zF = sVar.f(sVar2);
        Object objK2 = sVar.K();
        if (zF || objK2 == obj) {
            objK2 = new z.h(sVar2);
            sVar.h0(objK2);
        }
        return (z.h) objK2;
    }

    public static n7.b j0(n7.c cVar, InputStream inputStream, int i7) throws IOException {
        byte[] bArr = new byte[i7];
        int i10 = 0;
        while (i10 < i7) {
            int i11 = i7 - i10;
            if (4096 <= i11) {
                i11 = ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
            }
            try {
                int i12 = inputStream.read(bArr, i10, i11);
                if (i12 <= 0) {
                    break;
                }
                i10 += i12;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    g5.a.m(inputStream, th);
                    throw th2;
                }
            }
        }
        inputStream.close();
        cVar.f8875d = (long) ((i7 / (((cVar.f8874c / 8) * cVar.f8873b) * cVar.f8872a)) * 1000);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        i9.l.d(byteBufferWrap, "wrap(...)");
        return new n7.b(byteBufferWrap, cVar);
    }

    public static f4.e k0(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new f4.e(e4.k.a(view));
        }
        return null;
    }

    public static final u9.i l0(w wVar) {
        i9.l.e(wVar, "<this>");
        u9.i iVarK = wVar.D0().k();
        i9.l.d(iVarK, "getBuiltIns(...)");
        return iVarK;
    }

    public static final w m0(x9.c cVar) {
        aa.a0 a0VarE0 = cVar.e0();
        aa.a0 a0VarB0 = cVar.b0();
        if (a0VarE0 != null) {
            return a0VarE0.getType();
        }
        if (a0VarB0 != null) {
            if (cVar instanceof x9.j) {
                return a0VarB0.getType();
            }
            x9.k kVarL = cVar.l();
            x9.e eVar = kVarL instanceof x9.e ? (x9.e) kVarL : null;
            if (eVar != null) {
                return eVar.n();
            }
        }
        return null;
    }

    public static final Object n0(xa.k kVar, xa.m mVar) {
        i9.l.e(kVar, "<this>");
        i9.l.e(mVar, "extension");
        if (kVar.j(mVar)) {
            return kVar.i(mVar);
        }
        return null;
    }

    public static final Object o0(xa.k kVar, xa.m mVar, int i7) {
        i9.l.e(kVar, "<this>");
        i9.l.e(mVar, "extension");
        kVar.m(mVar);
        xa.h hVar = kVar.f14795a;
        xa.l lVar = mVar.f14802d;
        hVar.getClass();
        xa.z zVar = hVar.f14789a;
        if (!lVar.f14798c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = zVar.get(lVar);
        if (i7 >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        kVar.m(mVar);
        if (!lVar.f14798c) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = zVar.get(lVar);
        if (obj2 != null) {
            return mVar.a(((List) obj2).get(i7));
        }
        throw new IndexOutOfBoundsException();
    }

    public static final Method p0(Class cls, x9.c cVar) {
        i9.l.e(cVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            i9.l.b(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new cc.a0(2, "No unbox method found in inline class: " + cls + " (calling " + cVar + ')');
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, t8.h] */
    public static final Field q0(o9.u uVar) {
        i9.l.e(uVar, "<this>");
        l1 l1VarC = x1.c(uVar);
        if (l1VarC != null) {
            return (Field) l1VarC.f11713g.getValue();
        }
        return null;
    }

    public static final Method r0(o9.f fVar) {
        s9.g gVarG;
        i9.l.e(fVar, "<this>");
        r9.r rVarA = x1.a(fVar);
        Member memberR = (rVarA == null || (gVarG = rVarA.g()) == null) ? null : gVarG.r();
        if (memberR instanceof Method) {
            return (Method) memberR;
        }
        return null;
    }

    public static final int s0(b3.p pVar, long j5, r2 r2Var) {
        float fG = r2Var != null ? r2Var.g() : 0.0f;
        int i7 = (int) (4294967295L & j5);
        int iE = pVar.e(Float.intBitsToFloat(i7));
        if (Float.intBitsToFloat(i7) < pVar.f(iE) - fG || Float.intBitsToFloat(i7) > pVar.b(iE) + fG) {
            return -1;
        }
        int i10 = (int) (j5 >> 32);
        if (Float.intBitsToFloat(i10) < (-fG) || Float.intBitsToFloat(i10) > pVar.f1417d + fG) {
            return -1;
        }
        return iE;
    }

    public static final ArrayList t0(nb.a0 a0Var) {
        ArrayList arrayListU0 = u0(nb.c.b(a0Var));
        if (arrayListU0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(u8.q.a0(arrayListU0, 10));
        Iterator it = arrayListU0.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        x9.h hVarL = a0Var.D0().l();
        i9.l.c(hVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class clsK = x1.k((x9.e) hVarL);
        i9.l.b(clsK);
        ArrayList arrayList2 = new ArrayList(u8.q.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsK.getDeclaredMethod((String) it2.next(), null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final ArrayList u0(nb.a0 a0Var) {
        ?? I;
        if (!za.f.h(a0Var)) {
            return null;
        }
        x9.h hVarL = a0Var.D0().l();
        i9.l.c(hVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        int i7 = db.e.f3900a;
        x9.s0 s0VarO0 = ((x9.e) hVarL).o0();
        x9.z zVar = s0VarO0 instanceof x9.z ? (x9.z) s0VarO0 : null;
        i9.l.b(zVar);
        ArrayList<t8.j> arrayList = zVar.f14754a;
        ArrayList arrayList2 = new ArrayList();
        for (t8.j jVar : arrayList) {
            wa.e eVar = (wa.e) jVar.f12830a;
            ArrayList arrayListU0 = u0((nb.a0) jVar.f12831b);
            if (arrayListU0 != null) {
                I = new ArrayList(u8.q.a0(arrayListU0, 10));
                Iterator it = arrayListU0.iterator();
                while (it.hasNext()) {
                    I.add(eVar.c() + '-' + ((String) it.next()));
                }
            } else {
                I = l.I(eVar.c());
            }
            u8.u.c0(I, arrayList2);
        }
        return arrayList2;
    }

    public static final pa.p v0(i0 i0Var, ta.f fVar, aa.f0 f0Var, boolean z10, boolean z11, boolean z12) {
        i9.l.e(i0Var, "proto");
        i9.l.e(fVar, "nameResolver");
        xa.m mVar = ua.k.f13303d;
        i9.l.d(mVar, "propertySignature");
        ua.e eVar = (ua.e) n0(i0Var, mVar);
        if (eVar != null) {
            if (z10) {
                xa.g gVar = va.g.f13718a;
                va.d dVarB = va.g.b(i0Var, fVar, f0Var, z12);
                if (dVarB != null) {
                    return n4.h.D(dVarB);
                }
            } else if (z11 && (eVar.f13256b & 2) == 2) {
                ua.c cVar = eVar.f13258d;
                i9.l.d(cVar, "getSyntheticMethod(...)");
                return new pa.p(fVar.getString(cVar.f13244c).concat(fVar.getString(cVar.f13245d)));
            }
        }
        return null;
    }

    public static final long x0(l0.u0 u0Var, x1.c cVar, int i7) {
        s1 s1VarD = u0Var.d();
        b3.p pVar = s1VarD != null ? s1VarD.f7828a.f1409b : null;
        o2.w wVarC = u0Var.c();
        return (pVar == null || wVarC == null) ? q0.f1428b : pVar.h(cVar.i(wVarC.C(0L)), i7, b3.m0.f1392b);
    }

    public static final w y0(r0 r0Var) {
        Object obj;
        List upperBounds = r0Var.getUpperBounds();
        i9.l.d(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = r0Var.getUpperBounds();
        i9.l.d(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            x9.h hVarL = ((w) next).D0().l();
            x9.e eVar = hVarL instanceof x9.e ? (x9.e) hVarL : null;
            if (eVar != null && eVar.f() != x9.f.f14702b && eVar.f() != x9.f.f14705e) {
                obj = next;
                break;
            }
        }
        w wVar = (w) obj;
        if (wVar != null) {
            return wVar;
        }
        List upperBounds3 = r0Var.getUpperBounds();
        i9.l.d(upperBounds3, "getUpperBounds(...)");
        Object objK0 = u8.p.k0(upperBounds3);
        i9.l.d(objK0, "first(...)");
        return (w) objK0;
    }

    public static final boolean z0(r0 r0Var, k0 k0Var, Set set) {
        i9.l.e(r0Var, "typeParameter");
        List<w> upperBounds = r0Var.getUpperBounds();
        i9.l.d(upperBounds, "getUpperBounds(...)");
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (w wVar : upperBounds) {
            i9.l.b(wVar);
            if (a0(wVar, r0Var.n().D0(), set) && (k0Var == null || i9.l.a(wVar.D0(), k0Var))) {
                return true;
            }
        }
        return false;
    }

    @Override // oc.b
    public double A() {
        e0();
        throw null;
    }

    public abstract void F0(s3.f fVar, s3.f fVar2);

    public abstract void G0(s3.f fVar, Thread thread);

    public abstract String P();

    public abstract boolean T(s3.g gVar, s3.c cVar);

    public abstract boolean U(s3.g gVar, Object obj, Object obj2);

    public abstract boolean V(s3.g gVar, s3.f fVar, s3.f fVar2);

    @Override // oc.a
    public long a(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return n();
    }

    @Override // oc.b
    public boolean b() {
        e0();
        throw null;
    }

    @Override // oc.b
    public char c() {
        e0();
        throw null;
    }

    @Override // oc.a
    public double d(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return A();
    }

    public Object d0(mc.a aVar) {
        i9.l.e(aVar, "deserializer");
        return aVar.c(this);
    }

    @Override // oc.a
    public byte e(pc.q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return x();
    }

    public void e0() {
        throw new mc.e(y.f6689a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // oc.a
    public short f(pc.q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return y();
    }

    @Override // oc.b
    public abstract int h();

    @Override // oc.a
    public float i(pc.q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return z();
    }

    @Override // oc.a
    public oc.b k(pc.q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return r(q0Var.n(i7));
    }

    @Override // oc.b
    public String l() {
        e0();
        throw null;
    }

    @Override // oc.b
    public oc.a m(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        return this;
    }

    @Override // oc.b
    public abstract long n();

    @Override // oc.b
    public boolean o() {
        return true;
    }

    @Override // oc.a
    public void p(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
    }

    @Override // oc.a
    public boolean q(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return b();
    }

    @Override // oc.b
    public oc.b r(nc.e eVar) {
        i9.l.e(eVar, "descriptor");
        return this;
    }

    @Override // oc.a
    public String s(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return l();
    }

    @Override // oc.a
    public Object t(nc.e eVar, int i7, mc.a aVar, Object obj) {
        i9.l.e(eVar, "descriptor");
        i9.l.e(aVar, "deserializer");
        return d0(aVar);
    }

    @Override // oc.a
    public int u(nc.e eVar, int i7) {
        i9.l.e(eVar, "descriptor");
        return h();
    }

    @Override // oc.a
    public char v(pc.q0 q0Var, int i7) {
        i9.l.e(q0Var, "descriptor");
        return c();
    }

    @Override // oc.b
    public abstract byte x();

    @Override // oc.b
    public abstract short y();

    @Override // oc.b
    public float z() {
        e0();
        throw null;
    }
}
