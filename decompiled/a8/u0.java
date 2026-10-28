package a8;

import android.R;
import android.app.RemoteAction;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.usb.UsbManager;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.List;
import java.util.concurrent.CancellationException;
import z.g2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f252d;

    public /* synthetic */ u0(h9.n nVar, h9.a aVar, f1.b1 b1Var) {
        this.f249a = 8;
        this.f250b = nVar;
        this.f252d = aVar;
        this.f251c = b1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u0(i9.x xVar, h9.o oVar, m5.l lVar) {
        this.f249a = 6;
        this.f250b = xVar;
        this.f251c = (i9.j) oVar;
        this.f252d = lVar;
    }

    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, int i7) {
        this.f249a = i7;
        this.f250b = obj;
        this.f251c = obj2;
        this.f252d = obj3;
    }

    public /* synthetic */ u0(z.f fVar, g2 g2Var, cc.a1 a1Var, z.r1 r1Var) {
        this.f249a = 13;
        this.f250b = fVar;
        this.f251c = a1Var;
        this.f252d = r1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [h9.o, i9.j] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // h9.k
    public final Object invoke(Object obj) {
        y1.o oVar;
        Integer numD;
        Integer numE;
        Integer numE2;
        Integer numD2;
        b3.o0 o0Var;
        b3.o0 o0Var2;
        l0.s1 s1Var;
        l0.s1 s1Var2;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        b3.o0 o0Var3;
        b3.o0 o0Var4;
        l0.s1 s1Var3;
        l0.s1 s1Var4;
        g3.w wVar;
        android.support.v4.media.session.r rVar;
        g3.w wVar2;
        r2.d1 d1Var;
        int i7 = this.f249a;
        int i10 = 5;
        final int i11 = 2;
        int i12 = 3;
        y8.c cVar = null;
        final int i13 = 0;
        t8.z zVar = t8.z.f12851a;
        Object obj2 = this.f252d;
        Object obj3 = this.f251c;
        Object obj4 = this.f250b;
        final int i14 = 1;
        switch (i7) {
            case 0:
                f1.b1 b1Var = (f1.b1) obj3;
                l8.j0 j0Var = (l8.j0) obj;
                i9.l.e(j0Var, "it");
                b1Var.setValue(j0Var.f8196a);
                String str = (String) b1Var.getValue();
                Boolean bool = Boolean.FALSE;
                ((h9.n) obj4).invoke(str, bool);
                ((f1.b1) obj2).setValue(bool);
                return zVar;
            case 1:
                l0.u0 u0Var = (l0.u0) obj4;
                long j5 = ((g3.w) obj3).f5890b;
                g3.q qVar = (g3.q) obj2;
                a2.g gVar = (a2.g) obj;
                l0.s1 s1VarD = u0Var.d();
                if (s1VarD != null) {
                    y1.o oVarZ = gVar.W().z();
                    long j10 = ((b3.q0) u0Var.A.getValue()).f1430a;
                    long j11 = ((b3.q0) u0Var.B.getValue()).f1430a;
                    b3.o0 o0Var5 = s1VarD.f7828a;
                    b3.p pVar = o0Var5.f1409b;
                    b3.n0 n0Var = o0Var5.f1408a;
                    f7.q qVar2 = u0Var.f7871y;
                    long j12 = u0Var.f7872z;
                    if (!b3.q0.c(j10)) {
                        qVar2.k(j12);
                        int iB = qVar.b(b3.q0.f(j10));
                        int iB2 = qVar.b(b3.q0.e(j10));
                        if (iB != iB2) {
                            oVarZ.m(o0Var5.i(iB, iB2), qVar2);
                        }
                    } else if (!b3.q0.c(j11)) {
                        long jB = n0Var.f1394b.b();
                        y1.q qVar3 = jB == 16 ? null : new y1.q(jB);
                        long j13 = qVar3 != null ? qVar3.f14960a : y1.q.f14948b;
                        qVar2.k(y1.q.b(y1.q.d(j13) * 0.2f, j13));
                        int iB3 = qVar.b(b3.q0.f(j11));
                        int iB4 = qVar.b(b3.q0.e(j11));
                        if (iB3 != iB4) {
                            oVarZ.m(o0Var5.i(iB3, iB4), qVar2);
                        }
                    } else if (!b3.q0.c(j5)) {
                        qVar2.k(j12);
                        int iB5 = qVar.b(b3.q0.f(j5));
                        int iB6 = qVar.b(b3.q0.e(j5));
                        if (iB5 != iB6) {
                            oVarZ.m(o0Var5.i(iB5, iB6), qVar2);
                        }
                    }
                    boolean z10 = o0Var5.d() && n0Var.f1398f != 3;
                    if (z10) {
                        long j14 = o0Var5.f1410c;
                        x1.c cVarC = n3.u.c(0L, (((long) Float.floatToRawIntBits((int) (j14 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j14 >> 32))) << 32));
                        oVarZ.h();
                        oVarZ.e(cVarC);
                    }
                    b3.h0 h0Var = n0Var.f1394b.f1438a;
                    m3.l lVar = h0Var.f1367m;
                    m3.o oVar2 = h0Var.f1356a;
                    if (lVar == null) {
                        lVar = m3.l.f8420b;
                    }
                    m3.l lVar2 = lVar;
                    y1.k0 k0Var = h0Var.f1368n;
                    if (k0Var == null) {
                        k0Var = y1.k0.f14924d;
                    }
                    y1.k0 k0Var2 = k0Var;
                    a2.h hVar = h0Var.f1370p;
                    if (hVar == null) {
                        hVar = a2.j.f23a;
                    }
                    a2.h hVar2 = hVar;
                    try {
                        y1.m mVarE = oVar2.e();
                        m3.n nVar = m3.n.f8425a;
                        try {
                            if (mVarE != null) {
                                oVar = oVarZ;
                                b3.p.j(pVar, oVar, mVarE, oVar2 != nVar ? oVar2.a() : 1.0f, k0Var2, lVar2, hVar2);
                            } else {
                                oVar = oVarZ;
                                b3.p.i(pVar, oVar, oVar2 != nVar ? oVar2.b() : y1.q.f14948b, k0Var2, lVar2, hVar2);
                            }
                            if (z10) {
                                oVar.r();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (z10) {
                                oVarZ.r();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return zVar;
            case 2:
                h9.k kVar = (h9.k) obj3;
                g3.c0 c0Var = (g3.c0) ((i9.x) obj2).f6688a;
                g3.w wVarP = ((android.support.v4.media.session.r) obj4).p((List) obj);
                if (c0Var != null) {
                    c0Var.a(null, wVarP);
                }
                kVar.invoke(wVarP);
                return zVar;
            case 3:
                l0.g1 g1Var = (l0.g1) obj3;
                i9.t tVar = (i9.t) obj2;
                w0.j1 j1Var = (w0.j1) obj;
                switch (l0.f1.f7635a[((l0.l0) obj4).ordinal()]) {
                    case 1:
                        g1Var.f7640b.d(false);
                        return zVar;
                    case 2:
                        g1Var.f7640b.o();
                        return zVar;
                    case 3:
                        g1Var.f7640b.f();
                        return zVar;
                    case 4:
                        j1Var.f13819e.f14008a = null;
                        if (j1Var.f13821g.f1353b.length() > 0) {
                            if (b3.q0.c(j1Var.f13820f)) {
                                j1Var.i();
                            } else if (j1Var.f()) {
                                int iF = b3.q0.f(j1Var.f13820f);
                                j1Var.q(iF, iF);
                            } else {
                                int iE = b3.q0.e(j1Var.f13820f);
                                j1Var.q(iE, iE);
                            }
                        }
                        return zVar;
                    case 5:
                        j1Var.f13819e.f14008a = null;
                        if (j1Var.f13821g.f1353b.length() > 0) {
                            if (b3.q0.c(j1Var.f13820f)) {
                                j1Var.m();
                            } else if (j1Var.f()) {
                                int iE2 = b3.q0.e(j1Var.f13820f);
                                j1Var.q(iE2, iE2);
                            } else {
                                int iF2 = b3.q0.f(j1Var.f13820f);
                                j1Var.q(iF2, iF2);
                            }
                        }
                        return zVar;
                    case 6:
                        w0.x1 x1Var = j1Var.f13819e;
                        x1Var.f14008a = null;
                        b3.h hVar3 = j1Var.f13821g;
                        String str2 = hVar3.f1353b;
                        String str3 = hVar3.f1353b;
                        if (str2.length() > 0) {
                            if (j1Var.f()) {
                                x1Var.f14008a = null;
                                if (str3.length() > 0 && (numE = j1Var.e()) != null) {
                                    int iIntValue = numE.intValue();
                                    j1Var.q(iIntValue, iIntValue);
                                }
                            } else {
                                x1Var.f14008a = null;
                                if (str3.length() > 0 && (numD = j1Var.d()) != null) {
                                    int iIntValue2 = numD.intValue();
                                    j1Var.q(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        return zVar;
                    case 7:
                        w0.x1 x1Var2 = j1Var.f13819e;
                        x1Var2.f14008a = null;
                        b3.h hVar4 = j1Var.f13821g;
                        String str4 = hVar4.f1353b;
                        String str5 = hVar4.f1353b;
                        if (str4.length() > 0) {
                            if (j1Var.f()) {
                                x1Var2.f14008a = null;
                                if (str5.length() > 0 && (numD2 = j1Var.d()) != null) {
                                    int iIntValue3 = numD2.intValue();
                                    j1Var.q(iIntValue3, iIntValue3);
                                }
                            } else {
                                x1Var2.f14008a = null;
                                if (str5.length() > 0 && (numE2 = j1Var.e()) != null) {
                                    int iIntValue4 = numE2.intValue();
                                    j1Var.q(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        return zVar;
                    case 8:
                        j1Var.l();
                        return zVar;
                    case 9:
                        j1Var.j();
                        return zVar;
                    case 10:
                        if (j1Var.f13821g.f1353b.length() > 0 && (o0Var = j1Var.f13817c) != null) {
                            int iG = j1Var.g(o0Var, -1);
                            j1Var.q(iG, iG);
                        }
                        return zVar;
                    case 11:
                        if (j1Var.f13821g.f1353b.length() > 0 && (o0Var2 = j1Var.f13817c) != null) {
                            int iG2 = j1Var.g(o0Var2, 1);
                            j1Var.q(iG2, iG2);
                        }
                        return zVar;
                    case 12:
                        if (j1Var.f13821g.f1353b.length() > 0 && (s1Var = j1Var.f13823i) != null) {
                            int iH = j1Var.h(s1Var, -1);
                            j1Var.q(iH, iH);
                        }
                        return zVar;
                    case 13:
                        if (j1Var.f13821g.f1353b.length() > 0 && (s1Var2 = j1Var.f13823i) != null) {
                            int iH2 = j1Var.h(s1Var2, 1);
                            j1Var.q(iH2, iH2);
                        }
                        return zVar;
                    case 14:
                        j1Var.o();
                        return zVar;
                    case 15:
                        j1Var.n();
                        return zVar;
                    case 16:
                        j1Var.f13819e.f14008a = null;
                        if (j1Var.f13821g.f1353b.length() > 0) {
                            if (j1Var.f()) {
                                j1Var.o();
                            } else {
                                j1Var.n();
                            }
                        }
                        return zVar;
                    case 17:
                        j1Var.f13819e.f14008a = null;
                        if (j1Var.f13821g.f1353b.length() > 0) {
                            if (j1Var.f()) {
                                j1Var.n();
                            } else {
                                j1Var.o();
                            }
                        }
                        return zVar;
                    case 18:
                        j1Var.f13819e.f14008a = null;
                        if (j1Var.f13821g.f1353b.length() > 0) {
                            j1Var.q(0, 0);
                        }
                        return zVar;
                    case 19:
                        j1Var.f13819e.f14008a = null;
                        b3.h hVar5 = j1Var.f13821g;
                        if (hVar5.f1353b.length() > 0) {
                            int length = hVar5.f1353b.length();
                            j1Var.q(length, length);
                        }
                        return zVar;
                    case 20:
                        List listA = j1Var.a(new l0.t0(i14));
                        if (listA != null) {
                            g1Var.a(listA);
                        }
                        return zVar;
                    case 21:
                        List listA2 = j1Var.a(new l0.t0(i11));
                        if (listA2 != null) {
                            g1Var.a(listA2);
                        }
                        return zVar;
                    case 22:
                        List listA3 = j1Var.a(new l0.t0(i12));
                        if (listA3 != null) {
                            g1Var.a(listA3);
                        }
                        return zVar;
                    case 23:
                        List listA4 = j1Var.a(new l0.t0(4));
                        if (listA4 != null) {
                            g1Var.a(listA4);
                        }
                        return zVar;
                    case 24:
                        List listA5 = j1Var.a(new l0.t0(i10));
                        if (listA5 != null) {
                            g1Var.a(listA5);
                        }
                        return zVar;
                    case 25:
                        List listA6 = j1Var.a(new l0.t0(6));
                        if (listA6 != null) {
                            g1Var.a(listA6);
                        }
                        return zVar;
                    case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                        if (g1Var.f7643e) {
                            tVar.f6684a = g1Var.f7639a.f7870x.f7826b.f7864r.W(g1Var.f7649l);
                        } else {
                            g1Var.a(n3.l.I(new g3.a(1, "\n")));
                        }
                        return zVar;
                    case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                        if (g1Var.f7643e) {
                            tVar.f6684a = false;
                        } else {
                            g1Var.a(n3.l.I(new g3.a(1, "\t")));
                        }
                        return zVar;
                    case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                        j1Var.f13819e.f14008a = null;
                        b3.h hVar6 = j1Var.f13821g;
                        if (hVar6.f1353b.length() > 0) {
                            j1Var.q(0, hVar6.f1353b.length());
                        }
                        return zVar;
                    case ServiceTypes.KEYCODE_TEL /* 29 */:
                        j1Var.i();
                        j1Var.p();
                        return zVar;
                    case 30:
                        j1Var.m();
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_MEDIA_START /* 31 */:
                        w0.x1 x1Var3 = j1Var.f13819e;
                        x1Var3.f14008a = null;
                        b3.h hVar7 = j1Var.f13821g;
                        String str6 = hVar7.f1353b;
                        String str7 = hVar7.f1353b;
                        if (str6.length() > 0) {
                            if (j1Var.f()) {
                                x1Var3.f14008a = null;
                                if (str7.length() > 0 && (numE3 = j1Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    j1Var.q(iIntValue5, iIntValue5);
                                }
                            } else {
                                x1Var3.f14008a = null;
                                if (str7.length() > 0 && (numD3 = j1Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    j1Var.q(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        j1Var.p();
                        return zVar;
                    case 32:
                        w0.x1 x1Var4 = j1Var.f13819e;
                        x1Var4.f14008a = null;
                        b3.h hVar8 = j1Var.f13821g;
                        String str8 = hVar8.f1353b;
                        String str9 = hVar8.f1353b;
                        if (str8.length() > 0) {
                            if (j1Var.f()) {
                                x1Var4.f14008a = null;
                                if (str9.length() > 0 && (numD4 = j1Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    j1Var.q(iIntValue7, iIntValue7);
                                }
                            } else {
                                x1Var4.f14008a = null;
                                if (str9.length() > 0 && (numE4 = j1Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    j1Var.q(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_VR_START /* 33 */:
                        j1Var.l();
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_VR_STOP /* 34 */:
                        j1Var.j();
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_0 /* 35 */:
                        j1Var.o();
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_1 /* 36 */:
                        j1Var.n();
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_2 /* 37 */:
                        j1Var.f13819e.f14008a = null;
                        if (j1Var.f13821g.f1353b.length() > 0) {
                            if (j1Var.f()) {
                                j1Var.o();
                            } else {
                                j1Var.n();
                            }
                        }
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_3 /* 38 */:
                        j1Var.f13819e.f14008a = null;
                        if (j1Var.f13821g.f1353b.length() > 0) {
                            if (j1Var.f()) {
                                j1Var.n();
                            } else {
                                j1Var.o();
                            }
                        }
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_4 /* 39 */:
                        if (j1Var.f13821g.f1353b.length() > 0 && (o0Var3 = j1Var.f13817c) != null) {
                            int iG3 = j1Var.g(o0Var3, -1);
                            j1Var.q(iG3, iG3);
                        }
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_5 /* 40 */:
                        if (j1Var.f13821g.f1353b.length() > 0 && (o0Var4 = j1Var.f13817c) != null) {
                            int iG4 = j1Var.g(o0Var4, 1);
                            j1Var.q(iG4, iG4);
                        }
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_6 /* 41 */:
                        if (j1Var.f13821g.f1353b.length() > 0 && (s1Var3 = j1Var.f13823i) != null) {
                            int iH3 = j1Var.h(s1Var3, -1);
                            j1Var.q(iH3, iH3);
                        }
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_7 /* 42 */:
                        if (j1Var.f13821g.f1353b.length() > 0 && (s1Var4 = j1Var.f13823i) != null) {
                            int iH4 = j1Var.h(s1Var4, 1);
                            j1Var.q(iH4, iH4);
                        }
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_8 /* 43 */:
                        j1Var.f13819e.f14008a = null;
                        if (j1Var.f13821g.f1353b.length() > 0) {
                            j1Var.q(0, 0);
                        }
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_9 /* 44 */:
                        j1Var.f13819e.f14008a = null;
                        b3.h hVar9 = j1Var.f13821g;
                        if (hVar9.f1353b.length() > 0) {
                            int length2 = hVar9.f1353b.length();
                            j1Var.q(length2, length2);
                        }
                        j1Var.p();
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_STAR /* 45 */:
                        j1Var.f13819e.f14008a = null;
                        if (j1Var.f13821g.f1353b.length() > 0) {
                            long j15 = j1Var.f13820f;
                            int i15 = b3.q0.f1429c;
                            int i16 = (int) (j15 & 4294967295L);
                            j1Var.q(i16, i16);
                        }
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_POUND /* 46 */:
                        l0.t1 t1Var = g1Var.f7646h;
                        if (t1Var != null) {
                            t1Var.a(g3.w.a(j1Var.f13822h, j1Var.f13821g, j1Var.f13820f, 4));
                        }
                        l0.t1 t1Var2 = g1Var.f7646h;
                        if (t1Var2 != null) {
                            android.support.v4.media.session.r rVar2 = t1Var2.f7837a;
                            if (rVar2 == null || (rVar = (android.support.v4.media.session.r) rVar2.f604b) == null) {
                                wVar = null;
                            } else {
                                t1Var2.f7837a = rVar;
                                t1Var2.f7839c -= ((g3.w) rVar2.f605c).f5889a.f1353b.length();
                                t1Var2.f7838b = new android.support.v4.media.session.r(15, t1Var2.f7838b, (g3.w) rVar2.f605c);
                                wVar = (g3.w) rVar.f605c;
                            }
                            if (wVar != null) {
                                g1Var.k.invoke(wVar);
                            }
                        }
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_DEL /* 47 */:
                        l0.t1 t1Var3 = g1Var.f7646h;
                        if (t1Var3 != null) {
                            android.support.v4.media.session.r rVar3 = t1Var3.f7838b;
                            if (rVar3 != null) {
                                t1Var3.f7838b = (android.support.v4.media.session.r) rVar3.f604b;
                                g3.w wVar3 = (g3.w) rVar3.f605c;
                                t1Var3.f7837a = new android.support.v4.media.session.r(15, t1Var3.f7837a, wVar3);
                                t1Var3.f7839c = wVar3.f5889a.f1353b.length() + t1Var3.f7839c;
                                wVar2 = (g3.w) rVar3.f605c;
                            } else {
                                wVar2 = null;
                            }
                            if (wVar2 != null) {
                                g1Var.k.invoke(wVar2);
                            }
                        }
                        return zVar;
                    case ServiceTypes.KEYCODE_NUMBER_CLEAR /* 48 */:
                    case ServiceTypes.KEYCODE_NUMBER_ADD /* 49 */:
                        return zVar;
                    default:
                        throw new cc.s();
                }
            case 4:
                m5.l lVar3 = (m5.l) obj4;
                i9.l.e(lVar3, "$controller");
                i9.l.e((f1.i0) obj, "$this$DisposableEffect");
                cc.y yVar = lVar3.f8482a;
                jc.e eVar = cc.k0.f2635a;
                cc.b0.s(yVar, hc.m.f6531a, new b1.f(lVar3, (Long) obj3, (h9.k) obj2, (y8.c) null, 7), 2);
                return new e8.p(6, lVar3);
            case 5:
                m5.l lVar4 = (m5.l) obj4;
                f1.b1 b1Var2 = (f1.b1) obj3;
                f1.b1 b1Var3 = (f1.b1) obj2;
                i9.l.e(lVar4, "$controller");
                i9.l.e(b1Var2, "$center$delegate");
                i9.l.e(b1Var3, "$radius$delegate");
                i9.l.e((m5.l) obj, "$this$ColorPicker");
                long j16 = ((x1.b) b1Var2.getValue()).f14521a;
                lVar4.f8499s = new y1(b1Var2, b1Var3, 4);
                lVar4.b(j16, false);
                f1.h1 h1Var = lVar4.f8497q;
                h1Var.g(h1Var.f() + 1);
                return zVar;
            case 6:
                g5.a.h((i9.x) obj4, (i9.j) obj3, (m5.l) obj2, x1.b.d(((x1.b) obj).f14521a));
                return zVar;
            case 7:
                o1.d dVar = (o1.d) obj4;
                o1.i iVar = (o1.i) obj2;
                s.h0 h0Var2 = dVar.f9275b;
                if (!h0Var2.b(obj3)) {
                    dVar.f9274a.remove(obj3);
                    h0Var2.m(obj3, iVar);
                    return new o1.c(dVar, obj3, iVar);
                }
                throw new IllegalArgumentException(("Key " + obj3 + " was used multiple times ").toString());
            case 8:
                f1.b1 b1Var4 = (f1.b1) obj3;
                l8.j0 j0Var2 = (l8.j0) obj;
                i9.l.e(j0Var2, "it");
                String str10 = j0Var2.f8196a;
                o7.g gVar2 = o7.g.f9489a;
                b1Var4.setValue(str10);
                ((h9.n) obj4).invoke((String) b1Var4.getValue(), Boolean.FALSE);
                ((h9.a) obj2).invoke();
                return zVar;
            case 9:
                Context context = (Context) obj4;
                i9.l.e((f1.i0) obj, "$this$DisposableEffect");
                c2 c2Var = new c2(i14, (UsbManager) obj3, (p1.p) obj2);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
                intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
                u3.f.g(context, c2Var, intentFilter);
                return new d0.u0(i12, context, c2Var);
            case 10:
                Context context2 = (Context) obj3;
                s0.b bVar = (s0.b) obj2;
                y.e eVar2 = (y.e) obj;
                ?? r8 = ((o0.c) obj4).f9251a;
                int size = r8.size();
                int i17 = 0;
                while (i17 < size) {
                    o0.b bVar2 = (o0.b) r8.get(i17);
                    if (bVar2 instanceof o0.d) {
                        o0.d dVar2 = (o0.d) bVar2;
                        y.e.b(eVar2, new c8.v(i10, dVar2), dVar2.f9253c == 0 ? cVar : new n1.c(new e8.r0(i12, dVar2), -1930700965, true), new f1(14, dVar2, bVar), 6);
                    } else if (bVar2 instanceof o0.h) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            o0.h hVar10 = (o0.h) bVar2;
                            if (context2 != null) {
                                int i18 = hVar10.f9262c;
                                TextClassification textClassification = hVar10.f9261b;
                                if (i18 < 0) {
                                    c8.v vVar = new c8.v(6, textClassification);
                                    Drawable icon = textClassification.getIcon();
                                    y.e.b(eVar2, vVar, icon != null ? new n1.c(new e8.r0(4, icon), -1123224187, true) : null, new f1(15, context2, textClassification), 6);
                                } else {
                                    RemoteAction remoteActionC = k8.b.c(textClassification.getActions().get(i18));
                                    y.e.b(eVar2, new c8.v(7, remoteActionC), ((i18 == 0) || remoteActionC.shouldShowIcon()) ? new n1.c(new e8.r0(i10, remoteActionC), -1261173016, true) : null, new a5.e(23, remoteActionC), 6);
                                }
                            }
                        }
                    } else if (bVar2 instanceof o0.f) {
                        eVar2.f14857a.add(y.b.f14848a);
                    }
                    i17++;
                    cVar = null;
                }
                return zVar;
            case 11:
                i9.t tVar2 = (i9.t) obj2;
                k2.v vVar2 = (k2.v) obj;
                if (((w0.n) obj4).c(vVar2.f7280c, (w0.a0) obj3)) {
                    vVar2.a();
                    tVar2.f6684a = true;
                }
                return zVar;
            case 12:
                final w0.t1 t1Var4 = (w0.t1) obj4;
                cc.y yVar2 = (cc.y) obj3;
                Context context3 = (Context) obj2;
                n0.a aVar = (n0.a) obj;
                aVar.a();
                s.d0 d0Var = aVar.f8700a;
                l0.z0 z0Var = l0.z0.Autofill;
                boolean z11 = !b3.q0.c(t1Var4.m().f5890b) && ((Boolean) t1Var4.f13949l.getValue()).booleanValue();
                f1 f1Var = new f1(yVar2, new w0.l1(t1Var4, cVar, i14));
                Resources resources = context3.getResources();
                w0.z0 z0Var2 = new w0.z0(f1Var, null, 1);
                if (z11) {
                    d0Var.a(new o0.d(o0.e.f9255a, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, z0Var2));
                }
                l0.z0 z0Var3 = l0.z0.Autofill;
                boolean zC = b3.q0.c(t1Var4.m().f5890b);
                f1 f1Var2 = new f1(yVar2, new w0.l1(t1Var4, cVar, i11));
                Resources resources2 = context3.getResources();
                w0.z0 z0Var4 = new w0.z0(f1Var2, null, 1);
                if (!zC) {
                    d0Var.a(new o0.d(o0.e.f9256b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, z0Var4));
                }
                l0.z0 z0Var5 = l0.z0.Autofill;
                boolean z12 = ((Boolean) t1Var4.f13949l.getValue()).booleanValue() && (d1Var = (r2.d1) t1Var4.f13960w.getValue()) != null && d1Var.f11212a.getDescription().hasMimeType("text/*");
                f1 f1Var3 = new f1(yVar2, new w0.l1(t1Var4, cVar, i12));
                Resources resources3 = context3.getResources();
                w0.z0 z0Var6 = new w0.z0(f1Var3, null, 1);
                if (z12) {
                    d0Var.a(new o0.d(o0.e.f9257c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, z0Var6));
                }
                l0.z0 z0Var7 = l0.z0.Autofill;
                boolean z13 = b3.q0.d(t1Var4.m().f5890b) != t1Var4.m().f5889a.f1353b.length();
                h9.a aVar2 = new h9.a() { // from class: w0.w1
                    @Override // h9.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                return Boolean.valueOf(!t1Var4.A);
                            case 1:
                                t1 t1Var5 = t1Var4;
                                g3.w wVarE = t1.e(t1Var5.m().f5889a, b3.g0.b(0, t1Var5.m().f5889a.f1353b.length()));
                                t1Var5.f13941c.invoke(wVarE);
                                long j17 = wVarE.f5890b;
                                t1Var5.f13959v = new b3.q0(j17);
                                t1Var5.f13957t = g3.w.a(t1Var5.f13957t, null, j17, 5);
                                t1Var5.h(true);
                                return t8.z.f12851a;
                            default:
                                h9.a aVar3 = t1Var4.f13944f;
                                if (aVar3 != null) {
                                    aVar3.invoke();
                                }
                                return t8.z.f12851a;
                        }
                    }
                };
                h9.a aVar3 = new h9.a() { // from class: w0.w1
                    @Override // h9.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return Boolean.valueOf(!t1Var4.A);
                            case 1:
                                t1 t1Var5 = t1Var4;
                                g3.w wVarE = t1.e(t1Var5.m().f5889a, b3.g0.b(0, t1Var5.m().f5889a.f1353b.length()));
                                t1Var5.f13941c.invoke(wVarE);
                                long j17 = wVarE.f5890b;
                                t1Var5.f13959v = new b3.q0(j17);
                                t1Var5.f13957t = g3.w.a(t1Var5.f13957t, null, j17, 5);
                                t1Var5.h(true);
                                return t8.z.f12851a;
                            default:
                                h9.a aVar4 = t1Var4.f13944f;
                                if (aVar4 != null) {
                                    aVar4.invoke();
                                }
                                return t8.z.f12851a;
                        }
                    }
                };
                Resources resources4 = context3.getResources();
                w0.z0 z0Var8 = new w0.z0(aVar3, aVar2, 1);
                if (z13) {
                    d0Var.a(new o0.d(o0.e.f9258d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, z0Var8));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    l0.z0 z0Var9 = l0.z0.Autofill;
                    if (((Boolean) t1Var4.f13949l.getValue()).booleanValue() && b3.q0.c(t1Var4.m().f5890b)) {
                        i13 = 1;
                    }
                    h9.a aVar4 = new h9.a() { // from class: w0.w1
                        @Override // h9.a
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    return Boolean.valueOf(!t1Var4.A);
                                case 1:
                                    t1 t1Var5 = t1Var4;
                                    g3.w wVarE = t1.e(t1Var5.m().f5889a, b3.g0.b(0, t1Var5.m().f5889a.f1353b.length()));
                                    t1Var5.f13941c.invoke(wVarE);
                                    long j17 = wVarE.f5890b;
                                    t1Var5.f13959v = new b3.q0(j17);
                                    t1Var5.f13957t = g3.w.a(t1Var5.f13957t, null, j17, 5);
                                    t1Var5.h(true);
                                    return t8.z.f12851a;
                                default:
                                    h9.a aVar5 = t1Var4.f13944f;
                                    if (aVar5 != null) {
                                        aVar5.invoke();
                                    }
                                    return t8.z.f12851a;
                            }
                        }
                    };
                    Resources resources5 = context3.getResources();
                    w0.z0 z0Var10 = new w0.z0(aVar4, null, 1);
                    if (i13 != 0) {
                        d0Var.a(new o0.d(z0Var9.f7962a, resources5.getString(z0Var9.f7963b), z0Var9.f7964c, z0Var10));
                    }
                }
                aVar.a();
                return zVar;
            case 13:
                z.f fVar = (z.f) obj4;
                cc.a1 a1Var = (cc.a1) obj3;
                z.r1 r1Var = (z.r1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f10 = fVar.f15360q ? 1.0f : -1.0f;
                z.t1 t1Var5 = fVar.f15359p;
                long jE = t1Var5.e(t1Var5.h(f10 * fFloatValue));
                z.t1 t1Var6 = r1Var.f15482a;
                float fG = t1Var5.g(t1Var5.e(t1Var6.c(t1Var6.k, jE, 1))) * f10;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    a1Var.a(cancellationException);
                }
                return zVar;
            default:
                l2.d dVar3 = (l2.d) obj4;
                l2.c cVar2 = dVar3.f7989b;
                l2.c cVar3 = dVar3.f7988a;
                z.f0 f0Var = (z.f0) obj2;
                g5.a.l(dVar3, (k2.v) obj, 0L);
                k2.m0 m0Var = (k2.m0) ((k2.z) obj3);
                m0Var.getClass();
                float fE = q2.f.v(m0Var).f10691z.e();
                long jD = n3.u.d(fE, fE);
                if (n3.t.b(jD) <= 0.0f || n3.t.c(jD) <= 0.0f) {
                    n2.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) n3.t.g(jD)));
                }
                long jD2 = n3.u.d(cVar3.b(n3.t.b(jD)), cVar2.b(n3.t.c(jD)));
                l2.a[] aVarArr = cVar3.f7983d;
                u8.l.t0(0, aVarArr.length, null, aVarArr);
                cVar3.f7984e = 0;
                l2.a[] aVarArr2 = cVar2.f7983d;
                u8.l.t0(0, aVarArr2.length, null, aVarArr2);
                cVar2.f7984e = 0;
                dVar3.f7990c = 0L;
                ec.h hVar11 = f0Var.f15371u;
                if (hVar11 != null) {
                    z.g0 g0Var = z.h0.f15396a;
                    hVar11.x(new z.n(n3.u.d(Float.isNaN(n3.t.b(jD2)) ? 0.0f : n3.t.b(jD2), Float.isNaN(n3.t.c(jD2)) ? 0.0f : n3.t.c(jD2))));
                }
                return zVar;
        }
    }
}
