package w7;

import a8.c1;
import a8.o;
import a8.x1;
import a8.y;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import c8.p;
import com.muyetuge.carlifevehicle.service.AccessService;
import f1.b1;
import f1.n;
import f1.s;
import f1.w0;
import f1.w1;
import fc.h0;
import h9.k;
import i9.l;
import java.util.Iterator;
import java.util.List;
import l8.f0;
import l8.z;
import n1.h;
import r2.j1;
import r2.n0;
import w0.e1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f14170a = new f();

    public final void a(List list, boolean z10, s sVar, int i7) {
        boolean z11;
        sVar.Y(1448593171);
        if (((i7 | 48) & 19) == 18 && sVar.z()) {
            sVar.Q();
            z11 = z10;
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s("未授权");
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            h0 h0Var = AccessService.f2915d;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new c1(b1Var, null, 23);
                sVar.h0(objK2);
            }
            sVar.p(false);
            f1.b.f(sVar, (h9.n) objK2, h0Var);
            n1.c cVarE = h.e(-1959260868, new y(22, list), sVar);
            n1.c cVarE2 = h.e(-1012093925, new f0(b1Var, 5), sVar);
            sVar.W(1849434622);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new e1(5);
                sVar.h0(objK3);
            }
            sVar.p(false);
            z11 = true;
            a.a.h(cVarE, cVarE2, true, (h9.a) objK3, sVar, 3510, 0);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q7.c(this, list, z11, i7);
        }
    }

    public final void b(List list, boolean z10, h9.a aVar, s sVar, int i7, int i10) {
        int i11;
        boolean z11;
        l.e(aVar, "callback");
        sVar.Y(-957662335);
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 = i7 | 48;
        } else if ((i7 & 48) == 0) {
            i11 = i7 | (sVar.g(z10) ? 32 : 16);
        } else {
            i11 = i7;
        }
        if ((i11 & 147) == 146 && sVar.z()) {
            sVar.Q();
            z11 = z10;
        } else {
            boolean z12 = i12 != 0 ? true : z10;
            n1.c cVarE = h.e(-984833430, new y(23, list), sVar);
            int i13 = i11;
            n1.c cVar = b.f14159f;
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == n.f5051a) {
                objK = new l8.y(aVar, 9);
                sVar.h0(objK);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, z12, (h9.a) objK, sVar, ((i13 << 3) & 896) | 54, 0);
            z11 = z12;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new z(this, list, z11, aVar, i7, i10, 2);
        }
    }

    public final void c(boolean z10, String str, String str2, h9.a aVar, s sVar, int i7) {
        int i10;
        sVar.Y(411792397);
        if ((i7 & 6) == 0) {
            i10 = (sVar.g(z10) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(str) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.f(str2) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i10 |= sVar.h(aVar) ? 2048 : 1024;
        }
        int i11 = i10;
        if ((i11 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            Context context = (Context) sVar.j(n0.f11343b);
            r2.e1 e1Var = (r2.e1) sVar.j(j1.f11274f);
            Object objK = sVar.K();
            if (objK == n.f5051a) {
                objK = f1.b.l(sVar);
                sVar.h0(objK);
            }
            String str3 = "adb shell pm grant " + context.getPackageName() + " " + str;
            l8.n.a(z10, null, 0L, false, 0, null, h.e(-818191244, new o(aVar, 19), sVar), b.f14158e, h.e(-798650122, new x1((cc.y) objK, e1Var, str, str3, 11), sVar), h.e(-2009376572, new e(str3, str2, 2), sVar), sVar, (i11 & 14) | 918552576, 126);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c8.o(this, z10, str, str2, aVar, i7);
        }
    }

    public final void d(int i7, s sVar) {
        sVar.Y(-801426410);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            g5.a.b(null, b.f14154a, sVar, 48, 1);
            g5.a.b("开机启动权限", b.f14155b, sVar, 54, 0);
            g5.a.b("无障碍权限", b.f14156c, sVar, 54, 0);
            g5.a.b("其他权限", b.f14157d, sVar, 54, 0);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 27, this);
        }
    }

    public final void e(List list, String str, String str2, boolean z10, s sVar, int i7) {
        List list2;
        boolean z11;
        sVar.Y(384764035);
        if (((i7 | 3072) & 9363) == 9362 && sVar.z()) {
            sVar.Q();
            list2 = list;
            z11 = z10;
        } else {
            boolean z12 = u3.f.a((Context) sVar.j(n0.f11343b), str) == 0;
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(z12 ? "已开启" : "未授权");
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s(Boolean.FALSE);
                sVar.h0(objC);
            }
            b1 b1Var2 = (b1) objC;
            sVar.p(false);
            list2 = list;
            n1.c cVarE = h.e(1523807852, new y(25, list2), sVar);
            n1.c cVarE2 = h.e(772258699, new f0(b1Var, 7), sVar);
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new o7.o(b1Var2, 12);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVarE2, true, (h9.a) objK2, sVar, 3510, 0);
            boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new o7.o(b1Var2, 13);
                sVar.h0(objK3);
            }
            sVar.p(false);
            c(zBooleanValue, str, str2, (h9.a) objK3, sVar, 28080);
            z11 = true;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new m7.c(this, list2, str, str2, z11, i7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x012a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public final void f(final List list, final List list2, boolean z10, s sVar, int i7, int i10) {
        boolean z11;
        int i11;
        boolean z12;
        final Context context;
        final Activity activity;
        final boolean zU;
        v vVarG;
        Object objK;
        Object obj;
        b1 b1Var;
        boolean zH;
        Object objK2;
        boolean zD;
        Object objK3;
        String str;
        boolean zG;
        Object objK4;
        w1 w1VarR;
        sVar.Y(-186880479);
        int i12 = (sVar.h(list2) ? 32 : 16) | i7;
        int i13 = i10 & 4;
        if (i13 == 0) {
            if ((i7 & 384) == 0) {
                z11 = z10;
                i12 |= sVar.g(z11) ? 256 : 128;
            }
            i11 = i12;
            if ((i11 & 1171) == 1170 || !sVar.z()) {
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                context = (Context) sVar.j(n0.f11343b);
                activity = (Activity) sVar.j(d.c.f3530a);
                zU = d7.a.u(context, list2);
                sVar.W(-601569629);
                vVarG = ((t) sVar.j(s4.a.f12577a)).g();
                sVar.W(1849434622);
                objK = sVar.K();
                obj = n.f5051a;
                if (objK == obj) {
                    objK = f1.b.s(vVarG.f1072c);
                    sVar.h0(objK);
                }
                b1Var = (b1) objK;
                sVar.p(false);
                sVar.W(-1633490746);
                zH = sVar.h(vVarG);
                objK2 = sVar.K();
                if (zH || objK2 == obj) {
                    objK2 = new p(22, vVarG, b1Var);
                    sVar.h0(objK2);
                }
                sVar.p(false);
                f1.b.c(vVarG, (k) objK2, sVar);
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) b1Var.getValue();
                sVar.p(false);
                sVar.W(5004770);
                zD = sVar.d(oVar.ordinal());
                objK3 = sVar.K();
                if (zD || objK3 == obj) {
                    if (zU) {
                        str = "已开启";
                    } else {
                        str = "未授权";
                    }
                    objK3 = f1.b.s(str);
                    sVar.h0(objK3);
                }
                sVar.p(false);
                n1.c cVarE = h.e(1890453016, new y(24, list), sVar);
                n1.c cVarE2 = h.e(-1702579687, new f0((b1) objK3, 6), sVar);
                sVar.W(-1224400529);
                zG = sVar.g(zU) | sVar.h(context) | sVar.h(list2) | sVar.h(activity) | sVar.h(list);
                objK4 = sVar.K();
                if (zG || objK4 == obj) {
                    Object obj2 = new h9.a() { // from class: w7.d
                        /* JADX INFO: Removed unreachable split cross block B:33:0x0086 */
                        @Override // h9.a
                        public final Object invoke() {
                            boolean z13 = zU;
                            List list3 = list2;
                            if (z13) {
                                Context context2 = context;
                                Activity activityG = d7.a.g(context2);
                                if (activityG != null) {
                                    g5.a.o0(activityG, new a2.d(3, activityG), d7.a.k(activityG, list3, true), 1025, null);
                                } else {
                                    List<Intent> listK = d7.a.k(context2, list3, true);
                                    Iterator it = listK.iterator();
                                    while (it.hasNext()) {
                                        if (!d7.a.a(context2, (Intent) it.next())) {
                                            it.remove();
                                        }
                                    }
                                    if (listK.isEmpty()) {
                                        listK.add(d7.a.h());
                                    }
                                    for (Intent intent : listK) {
                                        if (intent != null) {
                                            try {
                                                Activity activityG2 = d7.a.g(context2);
                                                if (activityG2 == null) {
                                                    intent.addFlags(268435456);
                                                    context2.startActivity(intent);
                                                    break;
                                                }
                                                activityG2.startActivity(intent);
                                                break;
                                            } catch (Exception e7) {
                                                e7.printStackTrace();
                                            }
                                        }
                                    }
                                }
                            } else {
                                t8.o oVar2 = g.f14171a;
                                g.b(activity, (String) u8.p.k0(list), list3);
                            }
                            return t8.z.f12851a;
                        }
                    };
                    sVar.h0(obj2);
                    objK4 = obj2;
                }
                sVar.p(false);
                boolean z13 = z12;
                a.a.h(cVarE, cVarE2, z13, (h9.a) objK4, sVar, (i11 & 896) | 54, 0);
                z11 = z13;
            } else {
                sVar.Q();
            }
            w1VarR = sVar.r();
            if (w1VarR != null) {
                w1VarR.f5192d = new z(this, list, list2, z11, i7, i10);
            }
        }
        i12 |= 384;
        z11 = z10;
        i11 = i12;
        if ((i11 & 1171) == 1170) {
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            context = (Context) sVar.j(n0.f11343b);
            activity = (Activity) sVar.j(d.c.f3530a);
            zU = d7.a.u(context, list2);
            sVar.W(-601569629);
            vVarG = ((t) sVar.j(s4.a.f12577a)).g();
            sVar.W(1849434622);
            objK = sVar.K();
            obj = n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(vVarG.f1072c);
                sVar.h0(objK);
            }
            b1Var = (b1) objK;
            sVar.p(false);
            sVar.W(-1633490746);
            zH = sVar.h(vVarG);
            objK2 = sVar.K();
            if (zH) {
                objK2 = new p(22, vVarG, b1Var);
                sVar.h0(objK2);
            } else {
                objK2 = new p(22, vVarG, b1Var);
                sVar.h0(objK2);
            }
            sVar.p(false);
            f1.b.c(vVarG, (k) objK2, sVar);
            androidx.lifecycle.o oVar2 = (androidx.lifecycle.o) b1Var.getValue();
            sVar.p(false);
            sVar.W(5004770);
            zD = sVar.d(oVar2.ordinal());
            objK3 = sVar.K();
            if (zD) {
                if (zU) {
                    str = "已开启";
                } else {
                    str = "未授权";
                }
                objK3 = f1.b.s(str);
                sVar.h0(objK3);
            } else {
                if (zU) {
                    str = "已开启";
                } else {
                    str = "未授权";
                }
                objK3 = f1.b.s(str);
                sVar.h0(objK3);
            }
            sVar.p(false);
            n1.c cVarE3 = h.e(1890453016, new y(24, list), sVar);
            n1.c cVarE4 = h.e(-1702579687, new f0((b1) objK3, 6), sVar);
            sVar.W(-1224400529);
            zG = sVar.g(zU) | sVar.h(context) | sVar.h(list2) | sVar.h(activity) | sVar.h(list);
            objK4 = sVar.K();
            if (zG) {
                Object obj3 = new h9.a() { // from class: w7.d
                    /* JADX INFO: Removed unreachable split cross block B:33:0x0086 */
                    @Override // h9.a
                    public final Object invoke() {
                        boolean z14 = zU;
                        List list3 = list2;
                        if (z14) {
                            Context context2 = context;
                            Activity activityG = d7.a.g(context2);
                            if (activityG != null) {
                                g5.a.o0(activityG, new a2.d(3, activityG), d7.a.k(activityG, list3, true), 1025, null);
                            } else {
                                List<Intent> listK = d7.a.k(context2, list3, true);
                                Iterator it = listK.iterator();
                                while (it.hasNext()) {
                                    if (!d7.a.a(context2, (Intent) it.next())) {
                                        it.remove();
                                    }
                                }
                                if (listK.isEmpty()) {
                                    listK.add(d7.a.h());
                                }
                                for (Intent intent : listK) {
                                    if (intent != null) {
                                        try {
                                            Activity activityG2 = d7.a.g(context2);
                                            if (activityG2 == null) {
                                                intent.addFlags(268435456);
                                                context2.startActivity(intent);
                                                break;
                                            }
                                            activityG2.startActivity(intent);
                                            break;
                                        } catch (Exception e7) {
                                            e7.printStackTrace();
                                        }
                                    }
                                }
                            }
                        } else {
                            t8.o oVar3 = g.f14171a;
                            g.b(activity, (String) u8.p.k0(list), list3);
                        }
                        return t8.z.f12851a;
                    }
                };
                sVar.h0(obj3);
                objK4 = obj3;
            } else {
                Object obj4 = new h9.a() { // from class: w7.d
                    /* JADX INFO: Removed unreachable split cross block B:33:0x0086 */
                    @Override // h9.a
                    public final Object invoke() {
                        boolean z14 = zU;
                        List list3 = list2;
                        if (z14) {
                            Context context2 = context;
                            Activity activityG = d7.a.g(context2);
                            if (activityG != null) {
                                g5.a.o0(activityG, new a2.d(3, activityG), d7.a.k(activityG, list3, true), 1025, null);
                            } else {
                                List<Intent> listK = d7.a.k(context2, list3, true);
                                Iterator it = listK.iterator();
                                while (it.hasNext()) {
                                    if (!d7.a.a(context2, (Intent) it.next())) {
                                        it.remove();
                                    }
                                }
                                if (listK.isEmpty()) {
                                    listK.add(d7.a.h());
                                }
                                for (Intent intent : listK) {
                                    if (intent != null) {
                                        try {
                                            Activity activityG2 = d7.a.g(context2);
                                            if (activityG2 == null) {
                                                intent.addFlags(268435456);
                                                context2.startActivity(intent);
                                                break;
                                            }
                                            activityG2.startActivity(intent);
                                            break;
                                        } catch (Exception e7) {
                                            e7.printStackTrace();
                                        }
                                    }
                                }
                            }
                        } else {
                            t8.o oVar3 = g.f14171a;
                            g.b(activity, (String) u8.p.k0(list), list3);
                        }
                        return t8.z.f12851a;
                    }
                };
                sVar.h0(obj4);
                objK4 = obj4;
            }
            sVar.p(false);
            boolean z14 = z12;
            a.a.h(cVarE3, cVarE4, z14, (h9.a) objK4, sVar, (i11 & 896) | 54, 0);
            z11 = z14;
        } else {
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            context = (Context) sVar.j(n0.f11343b);
            activity = (Activity) sVar.j(d.c.f3530a);
            zU = d7.a.u(context, list2);
            sVar.W(-601569629);
            vVarG = ((t) sVar.j(s4.a.f12577a)).g();
            sVar.W(1849434622);
            objK = sVar.K();
            obj = n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(vVarG.f1072c);
                sVar.h0(objK);
            }
            b1Var = (b1) objK;
            sVar.p(false);
            sVar.W(-1633490746);
            zH = sVar.h(vVarG);
            objK2 = sVar.K();
            if (zH) {
                objK2 = new p(22, vVarG, b1Var);
                sVar.h0(objK2);
            } else {
                objK2 = new p(22, vVarG, b1Var);
                sVar.h0(objK2);
            }
            sVar.p(false);
            f1.b.c(vVarG, (k) objK2, sVar);
            androidx.lifecycle.o oVar3 = (androidx.lifecycle.o) b1Var.getValue();
            sVar.p(false);
            sVar.W(5004770);
            zD = sVar.d(oVar3.ordinal());
            objK3 = sVar.K();
            if (zD) {
                if (zU) {
                    str = "已开启";
                } else {
                    str = "未授权";
                }
                objK3 = f1.b.s(str);
                sVar.h0(objK3);
            } else {
                if (zU) {
                    str = "已开启";
                } else {
                    str = "未授权";
                }
                objK3 = f1.b.s(str);
                sVar.h0(objK3);
            }
            sVar.p(false);
            n1.c cVarE5 = h.e(1890453016, new y(24, list), sVar);
            n1.c cVarE6 = h.e(-1702579687, new f0((b1) objK3, 6), sVar);
            sVar.W(-1224400529);
            zG = sVar.g(zU) | sVar.h(context) | sVar.h(list2) | sVar.h(activity) | sVar.h(list);
            objK4 = sVar.K();
            if (zG) {
                Object obj5 = new h9.a() { // from class: w7.d
                    /* JADX INFO: Removed unreachable split cross block B:33:0x0086 */
                    @Override // h9.a
                    public final Object invoke() {
                        boolean z15 = zU;
                        List list3 = list2;
                        if (z15) {
                            Context context2 = context;
                            Activity activityG = d7.a.g(context2);
                            if (activityG != null) {
                                g5.a.o0(activityG, new a2.d(3, activityG), d7.a.k(activityG, list3, true), 1025, null);
                            } else {
                                List<Intent> listK = d7.a.k(context2, list3, true);
                                Iterator it = listK.iterator();
                                while (it.hasNext()) {
                                    if (!d7.a.a(context2, (Intent) it.next())) {
                                        it.remove();
                                    }
                                }
                                if (listK.isEmpty()) {
                                    listK.add(d7.a.h());
                                }
                                for (Intent intent : listK) {
                                    if (intent != null) {
                                        try {
                                            Activity activityG2 = d7.a.g(context2);
                                            if (activityG2 == null) {
                                                intent.addFlags(268435456);
                                                context2.startActivity(intent);
                                                break;
                                            }
                                            activityG2.startActivity(intent);
                                            break;
                                        } catch (Exception e7) {
                                            e7.printStackTrace();
                                        }
                                    }
                                }
                            }
                        } else {
                            t8.o oVar4 = g.f14171a;
                            g.b(activity, (String) u8.p.k0(list), list3);
                        }
                        return t8.z.f12851a;
                    }
                };
                sVar.h0(obj5);
                objK4 = obj5;
            } else {
                Object obj6 = new h9.a() { // from class: w7.d
                    /* JADX INFO: Removed unreachable split cross block B:33:0x0086 */
                    @Override // h9.a
                    public final Object invoke() {
                        boolean z15 = zU;
                        List list3 = list2;
                        if (z15) {
                            Context context2 = context;
                            Activity activityG = d7.a.g(context2);
                            if (activityG != null) {
                                g5.a.o0(activityG, new a2.d(3, activityG), d7.a.k(activityG, list3, true), 1025, null);
                            } else {
                                List<Intent> listK = d7.a.k(context2, list3, true);
                                Iterator it = listK.iterator();
                                while (it.hasNext()) {
                                    if (!d7.a.a(context2, (Intent) it.next())) {
                                        it.remove();
                                    }
                                }
                                if (listK.isEmpty()) {
                                    listK.add(d7.a.h());
                                }
                                for (Intent intent : listK) {
                                    if (intent != null) {
                                        try {
                                            Activity activityG2 = d7.a.g(context2);
                                            if (activityG2 == null) {
                                                intent.addFlags(268435456);
                                                context2.startActivity(intent);
                                                break;
                                            }
                                            activityG2.startActivity(intent);
                                            break;
                                        } catch (Exception e7) {
                                            e7.printStackTrace();
                                        }
                                    }
                                }
                            }
                        } else {
                            t8.o oVar4 = g.f14171a;
                            g.b(activity, (String) u8.p.k0(list), list3);
                        }
                        return t8.z.f12851a;
                    }
                };
                sVar.h0(obj6);
                objK4 = obj6;
            }
            sVar.p(false);
            boolean z15 = z12;
            a.a.h(cVarE5, cVarE6, z15, (h9.a) objK4, sVar, (i11 & 896) | 54, 0);
            z11 = z15;
        }
        w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new z(this, list, list2, z11, i7, i10);
        }
    }
}
