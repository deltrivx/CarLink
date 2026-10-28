package r3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c1.a1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.b1;
import f1.c0;
import f1.q1;
import f1.w1;
import java.util.Arrays;
import java.util.UUID;
import o2.m0;
import r2.j1;
import r2.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f11571a = new c0(e.f11547c);

    /* JADX WARN: Code duplicated, block: B:101:0x0223  */
    /* JADX WARN: Code duplicated, block: B:102:0x0227  */
    /* JADX WARN: Code duplicated, block: B:107:0x0248  */
    /* JADX WARN: Code duplicated, block: B:109:0x0255  */
    /* JADX WARN: Code duplicated, block: B:112:0x025f  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0150  */
    /* JADX WARN: Code duplicated, block: B:72:0x0156  */
    /* JADX WARN: Code duplicated, block: B:73:0x0158  */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX WARN: Code duplicated, block: B:82:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fa  */
    public static final void a(y yVar, h9.a aVar, z zVar, n1.c cVar, f1.s sVar, int i7, int i10) {
        int i11;
        h9.a aVar2;
        z zVar2;
        int i12;
        boolean z10;
        h9.a aVar3;
        w1 w1VarR;
        h9.a aVar4;
        View view;
        n3.c cVar2;
        String str;
        n3.o oVar;
        f1.q qVarU;
        b1 b1VarV;
        Object objK;
        Object obj;
        UUID uuid;
        Object objK2;
        boolean z11;
        String str2;
        v vVar;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        boolean zF;
        Object objK3;
        h9.a aVar5;
        boolean z14;
        v vVar2;
        boolean z15;
        boolean z16;
        boolean zF2;
        Object objK4;
        boolean z17;
        Object objK5;
        boolean zH;
        Object objK6;
        boolean zH2;
        Object objK7;
        boolean zH3;
        Object objK8;
        int i15;
        h9.a aVar6;
        q2.h hVar;
        int i16;
        int i17;
        y yVar2 = yVar;
        sVar.Y(-1772091631);
        if ((i7 & 6) == 0) {
            i11 = (sVar.f(yVar2) ? 4 : 2) | i7;
        } else {
            i11 = i7;
        }
        int i18 = i10 & 2;
        if (i18 == 0) {
            if ((i7 & 48) == 0) {
                aVar2 = aVar;
                i11 |= sVar.h(aVar2) ? 32 : 16;
            }
            if ((i7 & 384) == 0) {
                zVar2 = zVar;
                if (sVar.f(zVar2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i11 |= i17;
            } else {
                zVar2 = zVar;
            }
            if ((i7 & 3072) == 0) {
                if (sVar.h(cVar)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i11 |= i16;
            }
            i12 = i11;
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (sVar.N(i12 & 1, z10)) {
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                view = (View) sVar.j(n0.f11347f);
                cVar2 = (n3.c) sVar.j(j1.f11276h);
                str = (String) sVar.j(f11571a);
                oVar = (n3.o) sVar.j(j1.f11281n);
                qVarU = f1.b.u(sVar);
                b1VarV = f1.b.v(cVar, sVar);
                Object[] objArr = new Object[0];
                objK = sVar.K();
                obj = f1.n.f5051a;
                if (objK == obj) {
                    objK = e.f11548d;
                    sVar.h0(objK);
                }
                uuid = (UUID) o1.k.c(Arrays.copyOf(objArr, 0), o1.k.f9286a, (h9.a) objK, sVar, 3456);
                objK2 = sVar.K();
                if (objK2 == obj) {
                    z11 = true;
                    v vVar3 = new v(aVar4, zVar2, str, view, cVar2, yVar, uuid);
                    str2 = str;
                    yVar2 = yVar;
                    vVar3.i(qVarU, new n1.c(new c1.h(6, vVar3, b1VarV), -297523940, true));
                    sVar.h0(vVar3);
                    objK2 = vVar3;
                } else {
                    z11 = true;
                    str2 = str;
                    yVar2 = yVar;
                }
                vVar = (v) objK2;
                boolean zH4 = sVar.h(vVar);
                i13 = i12 & 112;
                if (i13 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z18 = zH4 | z12;
                i14 = i12 & 896;
                if (i14 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zF = z18 | z13 | sVar.f(str2) | sVar.d(oVar.ordinal());
                objK3 = sVar.K();
                if (!zF || objK3 == obj) {
                    aVar5 = aVar4;
                    z14 = false;
                    vVar2 = vVar;
                    Object gVar = new g(vVar2, aVar5, zVar, str2, oVar);
                    sVar.h0(gVar);
                    objK3 = gVar;
                } else {
                    aVar5 = aVar4;
                    z14 = false;
                    vVar2 = vVar;
                }
                f1.b.c(vVar2, (h9.k) objK3, sVar);
                boolean zH5 = sVar.h(vVar2);
                if (i13 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z19 = zH5 | z15;
                if (i14 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zF2 = z19 | z16 | sVar.f(str2) | sVar.d(oVar.ordinal());
                objK4 = sVar.K();
                if (zF2 || objK4 == obj) {
                    Object hVar2 = new h(vVar2, aVar5, zVar, str2, oVar);
                    sVar.h0(hVar2);
                    objK4 = hVar2;
                }
                f1.b.h((h9.a) objK4, sVar);
                boolean zH6 = sVar.h(vVar2);
                if ((i12 & 14) == 4) {
                    z14 = true;
                }
                z17 = zH6 | z14;
                objK5 = sVar.K();
                if (z17 || objK5 == obj) {
                    objK5 = new a1(14, vVar2, yVar2);
                    sVar.h0(objK5);
                }
                f1.b.c(yVar2, (h9.k) objK5, sVar);
                zH = sVar.h(vVar2);
                objK6 = sVar.K();
                if (zH || objK6 == obj) {
                    objK6 = new b0.g(vVar2, (y8.c) null, 15);
                    sVar.h0(objK6);
                }
                f1.b.f(sVar, (h9.n) objK6, vVar2);
                zH2 = sVar.h(vVar2);
                objK7 = sVar.K();
                if (zH2 || objK7 == obj) {
                    objK7 = new j(vVar2, 0);
                    sVar.h0(objK7);
                }
                r1.p pVarD = androidx.compose.ui.layout.a.d(r1.m.f11116a, (h9.k) objK7);
                zH3 = sVar.h(vVar2) | sVar.d(oVar.ordinal());
                objK8 = sVar.K();
                if (zH3 || objK8 == obj) {
                    objK8 = new q3.d(vVar2, oVar, 1);
                    sVar.h0(objK8);
                }
                m0 m0Var = (m0) objK8;
                long j5 = sVar.T;
                i15 = (int) (j5 ^ (j5 >>> 32));
                q1 q1VarL = sVar.l();
                r1.p pVarC = r1.a.c(sVar, pVarD);
                q2.j.f10719d0.getClass();
                aVar6 = q2.i.f10705b;
                sVar.a0();
                if (sVar.S) {
                    sVar.k(aVar6);
                } else {
                    sVar.k0();
                }
                f1.b.w(sVar, q2.i.f10708e, m0Var);
                f1.b.w(sVar, q2.i.f10707d, q1VarL);
                hVar = q2.i.f10709f;
                if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i15))) {
                    ob.a.w(i15, sVar, i15, hVar);
                }
                f1.b.w(sVar, q2.i.f10706c, pVarC);
                sVar.p(z11);
                aVar3 = aVar5;
            } else {
                sVar.Q();
                aVar3 = aVar2;
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new k(yVar2, aVar3, zVar, cVar, i7, i10);
            }
        }
        i11 |= 48;
        aVar2 = aVar;
        if ((i7 & 384) == 0) {
            zVar2 = zVar;
            if (sVar.f(zVar2)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i11 |= i17;
        } else {
            zVar2 = zVar;
        }
        if ((i7 & 3072) == 0) {
            if (sVar.h(cVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i11 |= i16;
        }
        i12 = i11;
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (sVar.N(i12 & 1, z10)) {
            if (i18 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            view = (View) sVar.j(n0.f11347f);
            cVar2 = (n3.c) sVar.j(j1.f11276h);
            str = (String) sVar.j(f11571a);
            oVar = (n3.o) sVar.j(j1.f11281n);
            qVarU = f1.b.u(sVar);
            b1VarV = f1.b.v(cVar, sVar);
            Object[] objArr2 = new Object[0];
            objK = sVar.K();
            obj = f1.n.f5051a;
            if (objK == obj) {
                objK = e.f11548d;
                sVar.h0(objK);
            }
            uuid = (UUID) o1.k.c(Arrays.copyOf(objArr2, 0), o1.k.f9286a, (h9.a) objK, sVar, 3456);
            objK2 = sVar.K();
            if (objK2 == obj) {
                z11 = true;
                v vVar4 = new v(aVar4, zVar2, str, view, cVar2, yVar, uuid);
                str2 = str;
                yVar2 = yVar;
                vVar4.i(qVarU, new n1.c(new c1.h(6, vVar4, b1VarV), -297523940, true));
                sVar.h0(vVar4);
                objK2 = vVar4;
            } else {
                z11 = true;
                str2 = str;
                yVar2 = yVar;
            }
            vVar = (v) objK2;
            boolean zH7 = sVar.h(vVar);
            i13 = i12 & 112;
            if (i13 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z110 = zH7 | z12;
            i14 = i12 & 896;
            if (i14 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zF = z110 | z13 | sVar.f(str2) | sVar.d(oVar.ordinal());
            objK3 = sVar.K();
            if (zF) {
                aVar5 = aVar4;
                z14 = false;
                vVar2 = vVar;
                Object gVar2 = new g(vVar2, aVar5, zVar, str2, oVar);
                sVar.h0(gVar2);
                objK3 = gVar2;
            } else {
                aVar5 = aVar4;
                z14 = false;
                vVar2 = vVar;
                Object gVar3 = new g(vVar2, aVar5, zVar, str2, oVar);
                sVar.h0(gVar3);
                objK3 = gVar3;
            }
            f1.b.c(vVar2, (h9.k) objK3, sVar);
            boolean zH8 = sVar.h(vVar2);
            if (i13 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z111 = zH8 | z15;
            if (i14 == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            zF2 = z111 | z16 | sVar.f(str2) | sVar.d(oVar.ordinal());
            objK4 = sVar.K();
            if (zF2) {
                Object hVar3 = new h(vVar2, aVar5, zVar, str2, oVar);
                sVar.h0(hVar3);
                objK4 = hVar3;
            } else {
                Object hVar4 = new h(vVar2, aVar5, zVar, str2, oVar);
                sVar.h0(hVar4);
                objK4 = hVar4;
            }
            f1.b.h((h9.a) objK4, sVar);
            boolean zH9 = sVar.h(vVar2);
            if ((i12 & 14) == 4) {
                z14 = true;
            }
            z17 = zH9 | z14;
            objK5 = sVar.K();
            if (z17) {
                objK5 = new a1(14, vVar2, yVar2);
                sVar.h0(objK5);
            } else {
                objK5 = new a1(14, vVar2, yVar2);
                sVar.h0(objK5);
            }
            f1.b.c(yVar2, (h9.k) objK5, sVar);
            zH = sVar.h(vVar2);
            objK6 = sVar.K();
            if (zH) {
                objK6 = new b0.g(vVar2, (y8.c) null, 15);
                sVar.h0(objK6);
            } else {
                objK6 = new b0.g(vVar2, (y8.c) null, 15);
                sVar.h0(objK6);
            }
            f1.b.f(sVar, (h9.n) objK6, vVar2);
            zH2 = sVar.h(vVar2);
            objK7 = sVar.K();
            if (zH2) {
                objK7 = new j(vVar2, 0);
                sVar.h0(objK7);
            } else {
                objK7 = new j(vVar2, 0);
                sVar.h0(objK7);
            }
            r1.p pVarD2 = androidx.compose.ui.layout.a.d(r1.m.f11116a, (h9.k) objK7);
            zH3 = sVar.h(vVar2) | sVar.d(oVar.ordinal());
            objK8 = sVar.K();
            if (zH3) {
                objK8 = new q3.d(vVar2, oVar, 1);
                sVar.h0(objK8);
            } else {
                objK8 = new q3.d(vVar2, oVar, 1);
                sVar.h0(objK8);
            }
            m0 m0Var2 = (m0) objK8;
            long j10 = sVar.T;
            i15 = (int) (j10 ^ (j10 >>> 32));
            q1 q1VarL2 = sVar.l();
            r1.p pVarC2 = r1.a.c(sVar, pVarD2);
            q2.j.f10719d0.getClass();
            aVar6 = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(aVar6);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, q2.i.f10708e, m0Var2);
            f1.b.w(sVar, q2.i.f10707d, q1VarL2);
            hVar = q2.i.f10709f;
            if (sVar.S) {
                ob.a.w(i15, sVar, i15, hVar);
            } else {
                ob.a.w(i15, sVar, i15, hVar);
            }
            f1.b.w(sVar, q2.i.f10706c, pVarC2);
            sVar.p(z11);
            aVar3 = aVar5;
        } else {
            sVar.Q();
            aVar3 = aVar2;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new k(yVar2, aVar3, zVar, cVar, i7, i10);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) == 0) ? false : true;
    }
}
