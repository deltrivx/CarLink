package a8;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import b8.m2;
import b8.n2;
import com.baidu.carlife.sdk.receiver.CarLife;
import f1.h2;
import f1.i2;
import f1.k2;
import f1.w2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f1 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123c;

    public /* synthetic */ f1(int i7, Object obj, Object obj2) {
        this.f121a = i7;
        this.f122b = obj;
        this.f123c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f1(cc.y yVar, h9.k kVar) {
        this.f121a = 21;
        this.f122b = yVar;
        this.f123c = (a9.i) kVar;
    }

    public /* synthetic */ f1(f1.h1 h1Var, f1.h1 h1Var2) {
        this.f121a = 7;
        this.f123c = h1Var;
        this.f122b = h1Var2;
    }

    public /* synthetic */ f1(h9.k kVar, i1 i1Var, f1.h1 h1Var) {
        this.f121a = 0;
        this.f122b = kVar;
        this.f123c = h1Var;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02da  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:155:0x02fc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x047e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x0480 A[LOOP:5: B:200:0x044b->B:210:0x0480, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:240:0x0483 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v20, types: [a9.i, h9.k] */
    @Override // h9.a
    public final Object invoke() throws PendingIntent.CanceledException {
        int i7;
        Integer num;
        h2 h2VarK;
        String[] strArrNames;
        long j5;
        l0.s1 s1VarD;
        l0.u0 u0Var;
        b3.h hVar;
        int i10 = this.f121a;
        u8.x xVar = u8.x.f13123a;
        q1.h hVar2 = null;
        long jR = 9205357640488583168L;
        t8.z zVar = t8.z.f12851a;
        Object obj = this.f123c;
        Object obj2 = this.f122b;
        switch (i10) {
            case 0:
                f1.h1 h1Var = (f1.h1) obj;
                ((h9.k) obj2).invoke(new m2("Delay", "延迟执行", a2.f.F("延迟", "秒", h1Var.f()), new b8.l0(h1Var.f())));
                return zVar;
            case 1:
                ((p1.p) obj).remove((n2) obj2);
                return zVar;
            case 2:
                ((f1.b1) obj).setValue((n2) obj2);
                return zVar;
            case 3:
                s.i0 i0Var = (s.i0) obj2;
                f1.y yVar = (f1.y) obj;
                Object[] objArr = i0Var.f12445b;
                long[] jArr = i0Var.f12444a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr[i11];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j10) < 128) {
                                    yVar.A(objArr[(i11 << 3) + i13]);
                                }
                                j10 >>= 8;
                            }
                            if (i12 == 8) {
                                if (i11 != length) {
                                    i11++;
                                }
                            }
                        } else if (i11 != length) {
                            i11++;
                        }
                    }
                }
                return zVar;
            case 4:
                g0.v vVar = (g0.v) obj;
                g0.h hVar3 = (g0.h) ((f1.f0) obj2).getValue();
                return new g0.i(vVar, hVar3, new g7.l((n9.d) vVar.f5741d.f4843f.getValue(), hVar3));
            case 5:
                return new h0.q0((o1.f) obj2, xVar, (o1.d) obj);
            case 6:
                g3.w wVar = (g3.w) obj2;
                f1.b1 b1Var = (f1.b1) obj;
                if (!b3.q0.b(wVar.f5890b, ((g3.w) b1Var.getValue()).f5890b) || !i9.l.a(wVar.f5891c, ((g3.w) b1Var.getValue()).f5891c)) {
                    b1Var.setValue(wVar);
                }
                return zVar;
            case 7:
                ((f1.h1) obj2).g(((f1.h1) obj).f());
                return zVar;
            case 8:
                o7.g gVar = o7.g.f9489a;
                ((h9.n) obj2).invoke((String) ((f1.b1) obj).getValue(), Boolean.TRUE);
                return zVar;
            case 9:
                n8.q qVar = o7.g.f9490b;
                String str = ((l8.j0) obj2).f8198c;
                f0.k kVar = new f0.k((f1.b1) obj, 26);
                qVar.getClass();
                n8.q.h(str, kVar);
                return zVar;
            case 10:
                w2 w2Var = (w2) obj;
                ((f1.b1) obj2).setValue(Boolean.FALSE);
                if (!CarLife.receiver().isConnected()) {
                    CarLife.receiver().setConnectType(((o7.u) w2Var.getValue()).f9523c);
                }
                return zVar;
            case 11:
                t8.o oVar = w7.g.f14171a;
                return Boolean.valueOf(w7.g.a((Activity) obj2, "直连相关", ((o7.u) ((w2) obj).getValue()).f9533n));
            case 12:
                ((i9.x) obj2).f6688a = ((h9.a) obj).invoke();
                return zVar;
            case 13:
                return new n3.j(o9.e0.O(((s0.e) obj2).E((o2.w) ((h9.a) obj).invoke())));
            case 14:
                ((o0.d) obj2).f9254d.invoke((s0.b) obj);
                return zVar;
            case 15:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e7) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e7);
                    }
                    break;
                } else {
                    activity.send();
                }
                return zVar;
            case 16:
                f1.s sVar = ((q1.c) obj2).f10580a;
                i2 i2Var = sVar.f5108c;
                boolean z10 = sVar.C;
                Collection collectionO0 = u8.w.f13122a;
                if (!z10) {
                    return collectionO0;
                }
                h2 h2VarK2 = i2Var.k();
                int i14 = 0;
                while (true) {
                    try {
                        if (i14 < i2Var.f4986b) {
                            if (h2VarK2.l(i14)) {
                                Object objN = h2VarK2.n(i14);
                                if (objN != obj) {
                                    f1.e2 e2Var = objN instanceof f1.e2 ? (f1.e2) objN : null;
                                    if ((e2Var != null ? e2Var.f4944a : null) == obj) {
                                    }
                                }
                                q1.h hVar4 = new q1.h(i14, null);
                                h2VarK2.c();
                                hVar2 = hVar4;
                                if (hVar2 != null) {
                                    return collectionO0;
                                }
                                i7 = hVar2.f10584a;
                                num = hVar2.f10585b;
                                if (sVar.C) {
                                    h2VarK = i2Var.k();
                                    try {
                                        collectionO0 = n3.n.O0(h2VarK, i7, num);
                                    } finally {
                                        h2VarK.c();
                                    }
                                }
                                return u8.p.x0(sVar.D(), collectionO0);
                            }
                            int[] iArr = h2VarK2.f4971b;
                            int i15 = i14 + 1;
                            int iC = (i15 < h2VarK2.f4972c ? iArr[(i15 * 5) + 4] : h2VarK2.f4974e) - k2.c(iArr, i14);
                            int i16 = 0;
                            while (true) {
                                if (i16 >= iC) {
                                    i14 = i15;
                                } else {
                                    Object objH = h2VarK2.h(i14, i16);
                                    if (objH != obj) {
                                        f1.e2 e2Var2 = objH instanceof f1.e2 ? (f1.e2) objH : null;
                                        if ((e2Var2 != null ? e2Var2.f4944a : null) != obj) {
                                            i16++;
                                        }
                                    }
                                    hVar2 = new q1.h(i14, Integer.valueOf(i16));
                                }
                            }
                        }
                        h2VarK2.c();
                        if (hVar2 != null) {
                            return collectionO0;
                        }
                        i7 = hVar2.f10584a;
                        num = hVar2.f10585b;
                        if (sVar.C) {
                            h2VarK = i2Var.k();
                            collectionO0 = n3.n.O0(h2VarK, i7, num);
                        }
                        return u8.p.x0(sVar.D(), collectionO0);
                    } catch (Throwable th) {
                        h2VarK2.c();
                        throw th;
                    }
                }
            case 17:
                nc.e eVar = (nc.e) obj2;
                qc.b bVar = (qc.b) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar.f11033a.getClass();
                rc.j.l(eVar, bVar);
                int iK = eVar.k();
                for (int i17 = 0; i17 < iK; i17++) {
                    List listM = eVar.m(i17);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listM) {
                        if (obj3 instanceof qc.q) {
                            arrayList.add(obj3);
                        }
                    }
                    qc.q qVar2 = (qc.q) u8.p.C0(arrayList);
                    if (qVar2 != null && (strArrNames = qVar2.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = i9.l.a(eVar.f(), nc.h.f9089c) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                String str4 = "The suggested name '" + str2 + "' for " + str3 + ' ' + eVar.l(i17) + " is already one of the names for " + str3 + ' ' + eVar.l(((Number) u8.b0.V0(str2, linkedHashMap)).intValue()) + " in " + eVar;
                                i9.l.e(str4, "message");
                                throw new mc.f(str4);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i17));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? xVar : linkedHashMap;
            case 18:
                ((f1.b1) obj).setValue(((t7.g) obj2).getName());
                return zVar;
            case 19:
                ((ec.l) obj2).x(obj);
                return zVar;
            case 20:
                w0.w0 w0Var = (w0.w0) obj2;
                long j11 = ((n3.m) ((f1.b1) obj).getValue()).f8746a;
                w0.z zVarG = w0Var.g();
                if (zVarG != null) {
                    l0.h0 h0VarF = w0Var.f();
                    int i18 = h0VarF == null ? -1 : w0.x0.f14007a[h0VarF.ordinal()];
                    if (i18 != -1) {
                        if (i18 == 1) {
                            jR = w0.y0.r(w0Var, j11, zVarG.f14018a);
                        } else {
                            if (i18 != 2) {
                                if (i18 != 3) {
                                    throw new cc.s();
                                }
                                throw new IllegalStateException("SelectionContainer does not support cursor");
                            }
                            jR = w0.y0.r(w0Var, j11, zVarG.f14019b);
                        }
                    }
                }
                return new x1.b(jR);
            case 21:
                cc.b0.s((cc.y) obj2, null, new c1((a9.i) obj, null), 1);
                return zVar;
            case 22:
                w0.t1 t1Var = (w0.t1) obj2;
                long j12 = ((n3.m) ((f1.b1) obj).getValue()).f8746a;
                x1.b bVarI = t1Var.i();
                if (bVarI != null) {
                    long j13 = bVarI.f14521a;
                    b3.h hVarL = t1Var.l();
                    if (hVarL != null && hVarL.f1353b.length() != 0) {
                        l0.h0 h0Var = (l0.h0) t1Var.f13954q.getValue();
                        int i19 = h0Var == null ? -1 : w0.v1.f13972a[h0Var.ordinal()];
                        if (i19 != -1) {
                            if (i19 == 1 || i19 == 2) {
                                long j14 = t1Var.m().f5890b;
                                int i20 = b3.q0.f1429c;
                                j5 = j14 >> 32;
                            } else {
                                if (i19 != 3) {
                                    throw new cc.s();
                                }
                                long j15 = t1Var.m().f5890b;
                                int i21 = b3.q0.f1429c;
                                j5 = j15 & 4294967295L;
                            }
                            int i22 = (int) j5;
                            l0.u0 u0Var2 = t1Var.f13942d;
                            if (u0Var2 != null && (s1VarD = u0Var2.d()) != null && (u0Var = t1Var.f13942d) != null && (hVar = u0Var.f7848a.f7591a) != null) {
                                int iM = n3.r.m(t1Var.f13940b.b(i22), 0, hVar.f1353b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (s1VarD.d(j13) >> 32));
                                b3.o0 o0Var = s1VarD.f7828a;
                                b3.p pVar = o0Var.f1409b;
                                int iD = pVar.d(iM);
                                float fE = o0Var.e(iD);
                                float f10 = o0Var.f(iD);
                                float fL = n3.r.l(fIntBitsToFloat, Math.min(fE, f10), Math.max(fE, f10));
                                if (n3.m.a(j12, 0L) || Math.abs(fIntBitsToFloat - fL) <= ((int) (j12 >> 32)) / 2) {
                                    float f11 = pVar.f(iD);
                                    jR = (((long) Float.floatToRawIntBits(((pVar.b(iD) - f11) / 2) + f11)) & 4294967295L) | (((long) Float.floatToRawIntBits(fL)) << 32);
                                }
                            }
                        }
                    }
                }
                return new x1.b(jR);
            case 23:
                x.l lVar = (x.l) obj2;
                q2.j0 j0Var = (q2.j0) obj;
                lVar.f14413w = lVar.f14408r.a(j0Var.f10720a.f16b.J(), j0Var.getLayoutDirection(), j0Var);
                return zVar;
            default:
                ((i9.x) obj2).f6688a = q2.f.i((x.c0) obj, o2.t0.f9427a);
                return zVar;
        }
    }
}
