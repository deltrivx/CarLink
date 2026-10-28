package o7;

import a8.f1;
import a8.j0;
import a8.j1;
import a8.k0;
import a8.x;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.foundation.layout.FillElement;
import c1.u2;
import c1.y;
import c8.d0;
import com.baidu.carlifevehicle.R;
import d0.l0;
import d0.n0;
import e2.i0;
import f1.b1;
import f1.q1;
import f1.w0;
import f1.w1;
import f1.x2;
import java.io.File;
import java.util.List;
import java.util.Set;
import l8.f0;
import o2.m0;
import q2.a0;
import y1.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f9496a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f9497b = new j();

    public void a(int i7, f1.s sVar) {
        f1.s sVar2 = sVar;
        sVar2.Y(-1295440348);
        int i10 = 2;
        if ((i7 & 1) == 0 && sVar2.z()) {
            sVar2.Q();
        } else {
            r1.g gVar = r1.c.k;
            d0.d dVar = d0.h.f3570e;
            r1.p pVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(24, sVar2), 0.0f, 0.0f, 13), g5.a.n(24, sVar2), 0.0f, 2);
            n0 n0VarA = l0.a(dVar, gVar, sVar2, 54);
            long j5 = sVar2.T;
            int i11 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar2.l();
            r1.p pVarC = r1.a.c(sVar2, pVarJ);
            q2.j.f10719d0.getClass();
            a0 a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            q2.h hVar = q2.i.f10708e;
            f1.b.w(sVar2, hVar, n0VarA);
            q2.h hVar2 = q2.i.f10707d;
            f1.b.w(sVar2, hVar2, q1VarL);
            q2.h hVar3 = q2.i.f10709f;
            if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar2, i11, hVar3);
            }
            q2.h hVar4 = q2.i.f10706c;
            f1.b.w(sVar2, hVar4, pVarC);
            sVar2.W(1849434622);
            Object objK = sVar2.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar2.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar2.p(false);
            n0 n0VarA2 = l0.a(d0.h.f3566a, r1.c.f11101j, sVar2, 0);
            long j10 = sVar2.T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            q1 q1VarL2 = sVar2.l();
            r1.p pVarC2 = r1.a.c(sVar2, r1.m.f11116a);
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, hVar, n0VarA2);
            f1.b.w(sVar2, hVar2, q1VarL2);
            if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i12))) {
                ob.a.w(i12, sVar2, i12, hVar3);
            }
            f1.b.w(sVar2, hVar4, pVarC2);
            sVar2.W(5004770);
            Object objK2 = sVar2.K();
            if (objK2 == w0Var) {
                objK2 = new f0.k(b1Var, 27);
                sVar2.h0(objK2);
            }
            h9.a aVar = (h9.a) objK2;
            sVar2.p(false);
            e2.f fVarB = n3.u.f8764b;
            if (fVarB == null) {
                e2.e eVar = new e2.e("AutoMirrored.Filled.ExitToApp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i13 = i0.f4202a;
                y1.n0 n0Var = new y1.n0(y1.q.f14948b);
                e2.g gVar2 = new e2.g();
                gVar2.i(10.09f, 15.59f);
                gVar2.g(11.5f, 17.0f);
                gVar2.h(5.0f, -5.0f);
                gVar2.h(-5.0f, -5.0f);
                gVar2.h(-1.41f, 1.41f);
                gVar2.g(12.67f, 11.0f);
                gVar2.e(3.0f);
                gVar2.l(2.0f);
                gVar2.f(9.67f);
                gVar2.h(-2.58f, 2.59f);
                gVar2.c();
                gVar2.i(19.0f, 3.0f);
                gVar2.e(5.0f);
                gVar2.d(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                gVar2.l(4.0f);
                gVar2.f(2.0f);
                gVar2.k(5.0f);
                gVar2.f(14.0f);
                gVar2.l(14.0f);
                gVar2.e(5.0f);
                gVar2.l(-4.0f);
                gVar2.e(3.0f);
                gVar2.l(4.0f);
                gVar2.d(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                gVar2.f(14.0f);
                gVar2.d(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                gVar2.k(5.0f);
                gVar2.d(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                gVar2.c();
                e2.e.a(eVar, gVar2.f4168a, n0Var);
                fVarB = eVar.b();
                n3.u.f8764b = fVarB;
            }
            i2.c.n("退出", aVar, fVarB, 0L, 180.0f, 0, 0, sVar2, 24630, 104);
            l8.n.a(((Boolean) b1Var.getValue()).booleanValue(), null, 0L, false, 0, null, n1.h.e(-306431853, new f0(b1Var, i10), sVar2), c.f9474a, c.f9475b, c.f9477d, sVar, 918552576, 126);
            sVar2 = sVar;
            sVar2.W(1849434622);
            Object objK3 = sVar2.K();
            if (objK3 == w0Var) {
                objK3 = new n8.f(8);
                sVar2.h0(objK3);
            }
            h9.a aVar2 = (h9.a) objK3;
            sVar2.p(false);
            e2.f fVarB2 = n3.r.f8761f;
            if (fVarB2 == null) {
                e2.e eVar2 = new e2.e("Outlined.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i14 = i0.f4202a;
                y1.n0 n0Var2 = new y1.n0(y1.q.f14948b);
                e2.g gVar3 = new e2.g();
                gVar3.i(12.0f, 5.69f);
                gVar3.h(5.0f, 4.5f);
                gVar3.k(18.0f);
                gVar3.f(-2.0f);
                gVar3.l(-6.0f);
                gVar3.e(9.0f);
                gVar3.l(6.0f);
                gVar3.e(7.0f);
                gVar3.l(-7.81f);
                gVar3.h(5.0f, -4.5f);
                gVar3.i(12.0f, 3.0f);
                gVar3.g(2.0f, 12.0f);
                gVar3.f(3.0f);
                gVar3.l(8.0f);
                gVar3.f(6.0f);
                gVar3.l(-6.0f);
                gVar3.f(2.0f);
                gVar3.l(6.0f);
                gVar3.f(6.0f);
                gVar3.l(-8.0f);
                gVar3.f(3.0f);
                gVar3.g(12.0f, 3.0f);
                gVar3.c();
                e2.e.a(eVar2, gVar3.f4168a, n0Var2);
                fVarB2 = eVar2.b();
                n3.r.f8761f = fVarB2;
            }
            i2.c.n("返回桌面", aVar2, fVarB2, 0L, 0.0f, 0, 0, sVar2, 54, 120);
            Object objC = a2.f.C(sVar2, true, 1849434622);
            if (objC == w0Var) {
                objC = new n8.f(9);
                sVar2.h0(objC);
            }
            sVar2.p(false);
            i2.c.n("设置", (h9.a) objC, null, 0L, 0.0f, 0, 0, sVar2, 54, 124);
            sVar2.p(true);
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h(this, i7, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:43:0x0132  */
    /* JADX WARN: Code duplicated, block: B:44:0x0136  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:52:0x0167  */
    /* JADX WARN: Code duplicated, block: B:53:0x0185  */
    public void b(u uVar, f1.s sVar, int i7) {
        t8.j jVar;
        t8.j jVar2;
        String str;
        int iIntValue;
        boolean zF;
        Object objK;
        w0 w0Var;
        File file;
        Bitmap bitmapDecodeFile;
        y1.f fVar;
        Object objK2;
        Object objC;
        r1.m mVar;
        int i10;
        a0 a0Var;
        q2.h hVar;
        f1.s sVar2 = sVar;
        Integer numValueOf = Integer.valueOf(R.drawable.cover_wait);
        Integer numValueOf2 = Integer.valueOf(R.drawable.cover_success);
        i9.l.e(uVar, "state");
        String str2 = uVar.f9522b;
        String str3 = uVar.k;
        String str4 = uVar.f9531l;
        sVar2.Y(-1006595409);
        if (((i7 | (sVar2.h(uVar) ? 4 : 2)) & 3) == 2 && sVar2.z()) {
            sVar2.Q();
        } else {
            int iOrdinal = uVar.f9521a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    jVar2 = iOrdinal != 2 ? new t8.j(uVar.f9532m, Integer.valueOf(R.drawable.cover_fail)) : new t8.j(str4, numValueOf2);
                } else if (str2.equals("连接成功")) {
                    jVar2 = new t8.j(str4, numValueOf2);
                } else {
                    jVar = new t8.j(str3, numValueOf);
                }
                str = (String) jVar2.f12830a;
                iIntValue = ((Number) jVar2.f12831b).intValue();
                sVar2.W(5004770);
                zF = sVar2.f(str);
                objK = sVar2.K();
                w0Var = f1.n.f5051a;
                if (zF || objK == w0Var) {
                    objK = null;
                    if (str.length() > 0) {
                        file = new File(n8.a.b().getExternalFilesDir(null), "cover/".concat(str));
                        if (file.exists() && (bitmapDecodeFile = BitmapFactory.decodeFile(file.getCanonicalPath())) != null) {
                            objK = new y1.f(bitmapDecodeFile);
                        }
                    }
                    sVar2.h0(objK);
                }
                fVar = (y1.f) objK;
                sVar2.p(false);
                r1.f fVar2 = r1.c.f11104n;
                sVar2.W(1849434622);
                objK2 = sVar2.K();
                if (objK2 == w0Var) {
                    objK2 = ob.a.m(sVar2);
                }
                b0.k kVar = (b0.k) objK2;
                objC = a2.f.C(sVar2, false, 1849434622);
                if (objC == w0Var) {
                    objC = new n8.f(7);
                    sVar2.h0(objC);
                }
                sVar2.p(false);
                mVar = r1.m.f11116a;
                r1.p pVarC = androidx.compose.foundation.a.c(mVar, kVar, null, false, (h9.a) objC, 28);
                d0.s sVarA = d0.q.a(d0.h.f3568c, fVar2, sVar2, 48);
                long j5 = sVar2.T;
                i10 = (int) (j5 ^ (j5 >>> 32));
                q1 q1VarL = sVar2.l();
                r1.p pVarC2 = r1.a.c(sVar2, pVarC);
                q2.j.f10719d0.getClass();
                a0Var = q2.i.f10705b;
                sVar2.a0();
                if (sVar2.S) {
                    sVar2.k(a0Var);
                } else {
                    sVar2.k0();
                }
                f1.b.w(sVar2, q2.i.f10708e, sVarA);
                f1.b.w(sVar2, q2.i.f10707d, q1VarL);
                hVar = q2.i.f10709f;
                if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i10))) {
                    ob.a.w(i10, sVar2, i10, hVar);
                }
                f1.b.w(sVar2, q2.i.f10706c, pVarC2);
                if (fVar != null) {
                    sVar2.W(947228731);
                    n3.n.C(fVar, null, androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.j(mVar, g5.a.n(16, sVar2), 0.0f, 2), 1.7213115f), sVar2, 24624, 232);
                    sVar2.p(false);
                } else {
                    sVar2.W(947586533);
                    n3.n.B(n3.l.N(iIntValue, sVar2), null, androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.j(mVar, g5.a.n(16, sVar2), 0.0f, 2), 1.7213115f), null, o2.j.f9356a, 0.0f, sVar, 24624, 104);
                    sVar2 = sVar;
                    sVar2.p(false);
                }
                u2.b(str2, androidx.compose.foundation.layout.a.k(mVar, 0.0f, g5.a.n(16, sVar2), 0.0f, 0.0f, 13), ((c1.w) sVar2.j(y.f2319a)).f2238o, n3.r.K(g5.a.n(22, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131056);
                sVar2 = sVar;
                sVar2.p(true);
            } else {
                jVar = new t8.j(str3, numValueOf);
            }
            jVar2 = jVar;
            str = (String) jVar2.f12830a;
            iIntValue = ((Number) jVar2.f12831b).intValue();
            sVar2.W(5004770);
            zF = sVar2.f(str);
            objK = sVar2.K();
            w0Var = f1.n.f5051a;
            if (zF) {
                objK = null;
                if (str.length() > 0) {
                    file = new File(n8.a.b().getExternalFilesDir(null), "cover/".concat(str));
                    if (file.exists()) {
                        objK = new y1.f(bitmapDecodeFile);
                    }
                }
                sVar2.h0(objK);
            } else {
                objK = null;
                if (str.length() > 0) {
                    file = new File(n8.a.b().getExternalFilesDir(null), "cover/".concat(str));
                    if (file.exists()) {
                        objK = new y1.f(bitmapDecodeFile);
                    }
                }
                sVar2.h0(objK);
            }
            fVar = (y1.f) objK;
            sVar2.p(false);
            r1.f fVar3 = r1.c.f11104n;
            sVar2.W(1849434622);
            objK2 = sVar2.K();
            if (objK2 == w0Var) {
                objK2 = ob.a.m(sVar2);
            }
            b0.k kVar2 = (b0.k) objK2;
            objC = a2.f.C(sVar2, false, 1849434622);
            if (objC == w0Var) {
                objC = new n8.f(7);
                sVar2.h0(objC);
            }
            sVar2.p(false);
            mVar = r1.m.f11116a;
            r1.p pVarC3 = androidx.compose.foundation.a.c(mVar, kVar2, null, false, (h9.a) objC, 28);
            d0.s sVarA2 = d0.q.a(d0.h.f3568c, fVar3, sVar2, 48);
            long j10 = sVar2.T;
            i10 = (int) (j10 ^ (j10 >>> 32));
            q1 q1VarL2 = sVar2.l();
            r1.p pVarC4 = r1.a.c(sVar2, pVarC3);
            q2.j.f10719d0.getClass();
            a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, q2.i.f10708e, sVarA2);
            f1.b.w(sVar2, q2.i.f10707d, q1VarL2);
            hVar = q2.i.f10709f;
            if (sVar2.S) {
                ob.a.w(i10, sVar2, i10, hVar);
            } else {
                ob.a.w(i10, sVar2, i10, hVar);
            }
            f1.b.w(sVar2, q2.i.f10706c, pVarC4);
            if (fVar != null) {
                sVar2.W(947228731);
                n3.n.C(fVar, null, androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.j(mVar, g5.a.n(16, sVar2), 0.0f, 2), 1.7213115f), sVar2, 24624, 232);
                sVar2.p(false);
            } else {
                sVar2.W(947586533);
                n3.n.B(n3.l.N(iIntValue, sVar2), null, androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.j(mVar, g5.a.n(16, sVar2), 0.0f, 2), 1.7213115f), null, o2.j.f9356a, 0.0f, sVar, 24624, 104);
                sVar2 = sVar;
                sVar2.p(false);
            }
            u2.b(str2, androidx.compose.foundation.layout.a.k(mVar, 0.0f, g5.a.n(16, sVar2), 0.0f, 0.0f, 13), ((c1.w) sVar2.j(y.f2319a)).f2238o, n3.r.K(g5.a.n(22, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131056);
            sVar2 = sVar;
            sVar2.p(true);
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, uVar, i7, 0);
        }
    }

    public void c(u uVar, f1.s sVar, int i7) {
        long j5;
        u uVar2 = uVar;
        f1.s sVar2 = sVar;
        i9.l.e(uVar2, "state");
        sVar2.Y(-248050953);
        int i10 = 4;
        int i11 = 2;
        if (((i7 | (sVar2.h(uVar2) ? 4 : 2)) & 3) == 2 && sVar2.z()) {
            sVar2.Q();
        } else {
            Activity activity = (Activity) sVar2.j(d.c.f3530a);
            float fN = g5.a.n(48, sVar2);
            char c10 = ' ';
            float fN2 = g5.a.n(32, sVar2);
            r1.m mVar = r1.m.f11116a;
            r1.p pVarK = androidx.compose.foundation.layout.a.k(mVar, 0.0f, fN, 0.0f, fN2, 5);
            boolean z10 = false;
            n0 n0VarA = l0.a(d0.h.f3566a, r1.c.f11101j, sVar2, 0);
            long j10 = sVar2.T;
            int i12 = (int) (j10 ^ (j10 >>> 32));
            q1 q1VarL = sVar2.l();
            r1.p pVarC = r1.a.c(sVar2, pVarK);
            q2.j.f10719d0.getClass();
            a0 a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, q2.i.f10708e, n0VarA);
            f1.b.w(sVar2, q2.i.f10707d, q1VarL);
            q2.h hVar = q2.i.f10709f;
            if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i12))) {
                ob.a.w(i12, sVar2, i12, hVar);
            }
            f1.b.w(sVar2, q2.i.f10706c, pVarC);
            sVar2.W(932499449);
            b9.b bVar = w.f9543e;
            bVar.getClass();
            i9.b bVar2 = new i9.b(6, bVar);
            while (bVar2.hasNext()) {
                w wVar = (w) bVar2.next();
                r1.p pVarJ = androidx.compose.foundation.layout.a.j(mVar, g5.a.n(i10, sVar2), 0.0f, i11);
                sVar2.W(1849434622);
                Object objK = sVar2.K();
                w0 w0Var = f1.n.f5051a;
                if (objK == w0Var) {
                    objK = ob.a.m(sVar2);
                }
                b0.k kVar = (b0.k) objK;
                sVar2.p(z10);
                sVar2.W(-1746271574);
                boolean zD = sVar2.d(wVar.ordinal()) | sVar2.h(activity) | sVar2.h(uVar2);
                Object objK2 = sVar2.K();
                if (zD || objK2 == w0Var) {
                    objK2 = new j1(wVar, activity, uVar2, 8);
                    sVar2.h0(objK2);
                }
                sVar2.p(z10);
                r1.p pVarC2 = androidx.compose.foundation.a.c(pVarJ, kVar, null, false, (h9.a) objK2, 28);
                m0 m0VarD = d0.m.d(r1.c.f11092a, z10);
                long j11 = sVar2.T;
                int i13 = (int) (j11 ^ (j11 >>> c10));
                q1 q1VarL2 = sVar2.l();
                r1.p pVarC3 = r1.a.c(sVar2, pVarC2);
                q2.j.f10719d0.getClass();
                a0 a0Var2 = q2.i.f10705b;
                sVar2.a0();
                if (sVar2.S) {
                    sVar2.k(a0Var2);
                } else {
                    sVar2.k0();
                }
                f1.b.w(sVar2, q2.i.f10708e, m0VarD);
                f1.b.w(sVar2, q2.i.f10707d, q1VarL2);
                q2.h hVar2 = q2.i.f10709f;
                if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i13))) {
                    ob.a.w(i13, sVar2, i13, hVar2);
                }
                f1.b.w(sVar2, q2.i.f10706c, pVarC3);
                String str = wVar.f9544a;
                long jK = n3.r.K(g5.a.n(22, sVar2), 4294967296L);
                if (uVar2.f9523c == wVar.f9545b) {
                    sVar2.W(1965064981);
                    j5 = ((c1.w) sVar2.j(y.f2319a)).f2225a;
                } else {
                    sVar2.W(1965066234);
                    j5 = ((c1.w) sVar2.j(y.f2319a)).f2238o;
                }
                sVar2.p(z10);
                u2.b(str, androidx.compose.foundation.layout.a.i(mVar, g5.a.n(12, sVar2), g5.a.n(8, sVar2)), j5, jK, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 0, 0, 131056);
                sVar2 = sVar;
                sVar2.p(true);
                uVar2 = uVar;
                mVar = mVar;
                activity = activity;
                bVar2 = bVar2;
                i10 = 4;
                i11 = 2;
                c10 = ' ';
                z10 = false;
            }
            sVar2.p(false);
            sVar2.p(true);
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new i(this, uVar, i7, 1);
        }
    }

    public void d(int i7, f1.s sVar) {
        String str;
        int i10;
        f1.s sVar2 = sVar;
        sVar2.Y(-1494914052);
        int i11 = 1;
        if ((i7 & 1) == 0 && sVar2.z()) {
            sVar2.Q();
            i10 = 1;
        } else {
            b1 b1VarK = f1.b.k(u.f9520p, sVar2);
            int i12 = 0;
            if (((u) b1VarK.getValue()).f9521a == v.f9536c) {
                w1 w1VarR = sVar2.r();
                if (w1VarR != null) {
                    w1VarR.f5192d = new h(this, i7, i12);
                    return;
                }
                return;
            }
            r1.h hVar = r1.c.f11096e;
            FillElement fillElement = androidx.compose.foundation.layout.c.f822c;
            x2 x2Var = y.f2319a;
            r1.p pVarA = androidx.compose.foundation.a.a(fillElement, new z((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), n3.l.J(new y1.q(((c1.w) sVar2.j(x2Var)).F), new y1.q(((c1.w) sVar2.j(x2Var)).f2237n))));
            m0 m0VarD = d0.m.d(hVar, false);
            long j5 = sVar2.T;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar2.l();
            r1.p pVarC = r1.a.c(sVar2, pVarA);
            q2.j.f10719d0.getClass();
            a0 a0Var = q2.i.f10705b;
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            q2.h hVar2 = q2.i.f10708e;
            f1.b.w(sVar2, hVar2, m0VarD);
            q2.h hVar3 = q2.i.f10707d;
            f1.b.w(sVar2, hVar3, q1VarL);
            q2.h hVar4 = q2.i.f10709f;
            if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i13))) {
                ob.a.w(i13, sVar2, i13, hVar4);
            }
            q2.h hVar5 = q2.i.f10706c;
            f1.b.w(sVar2, hVar5, pVarC);
            r1.h hVar6 = r1.c.f11093b;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f819a;
            r1.m mVar = r1.m.f11116a;
            r1.p pVarA2 = r1.a.a(r1.a.a(bVar.a(mVar, hVar6), new d0.w0(i11)), new d0.w0(i12));
            r1.h hVar7 = r1.c.f11092a;
            m0 m0VarD2 = d0.m.d(hVar7, false);
            long j10 = sVar2.T;
            int i14 = (int) (j10 ^ (j10 >>> 32));
            q1 q1VarL2 = sVar2.l();
            r1.p pVarC2 = r1.a.c(sVar2, pVarA2);
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, hVar2, m0VarD2);
            f1.b.w(sVar2, hVar3, q1VarL2);
            if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i14))) {
                ob.a.w(i14, sVar2, i14, hVar4);
            }
            f1.b.w(sVar2, hVar5, pVarC2);
            j jVar = f9496a;
            jVar.a(6, sVar2);
            sVar2.p(true);
            r1.f fVar = r1.c.f11104n;
            d0.d dVar = d0.h.f3569d;
            r1.p pVarC3 = androidx.compose.foundation.layout.a.c(mVar, 1.0f);
            d0.s sVarA = d0.q.a(dVar, fVar, sVar2, 54);
            long j11 = sVar2.T;
            int i15 = (int) (j11 ^ (j11 >>> 32));
            q1 q1VarL3 = sVar2.l();
            r1.p pVarC4 = r1.a.c(sVar2, pVarC3);
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, hVar2, sVarA);
            f1.b.w(sVar2, hVar3, q1VarL3);
            if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i15))) {
                ob.a.w(i15, sVar2, i15, hVar4);
            }
            f1.b.w(sVar2, hVar5, pVarC4);
            jVar.b((u) b1VarK.getValue(), sVar2, 48);
            jVar.c((u) b1VarK.getValue(), sVar2, 48);
            sVar2.p(true);
            r1.p pVarA3 = r1.a.a(bVar.a(mVar, r1.c.f11100i), new d0.w0(0));
            m0 m0VarD3 = d0.m.d(hVar7, false);
            long j12 = sVar2.T;
            int i16 = (int) (j12 ^ (j12 >>> 32));
            q1 q1VarL4 = sVar2.l();
            r1.p pVarC5 = r1.a.c(sVar2, pVarA3);
            sVar2.a0();
            if (sVar2.S) {
                sVar2.k(a0Var);
            } else {
                sVar2.k0();
            }
            f1.b.w(sVar2, hVar2, m0VarD3);
            f1.b.w(sVar2, hVar3, q1VarL4);
            if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i16))) {
                ob.a.w(i16, sVar2, i16, hVar4);
            }
            f1.b.w(sVar2, hVar5, pVarC5);
            PackageInfo packageInfo = (PackageInfo) n8.a.f8893b.getValue();
            if (packageInfo == null || (str = packageInfo.versionName) == null) {
                str = "未知版本";
            }
            i10 = 1;
            u2.b("v".concat(str), androidx.compose.foundation.layout.a.h(mVar, g5.a.n(40, sVar2)), ((c1.w) sVar2.j(x2Var)).f2238o, n3.r.K(g5.a.n(20, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 0, 0, 131056);
            sVar2 = sVar2;
            sVar2.p(true);
            sVar2.p(true);
        }
        w1 w1VarR2 = sVar2.r();
        if (w1VarR2 != null) {
            w1VarR2.f5192d = new h(this, i7, i10);
        }
    }

    public void e(t8.j jVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(kVar, "callback");
        sVar.Y(1585728696);
        if (((i7 | (sVar.f(jVar) ? 4 : 2)) & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            String str = (String) jVar.f12831b;
            r1.p pVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(6, sVar), 0.0f, 0.0f, 13);
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == f1.n.f5051a) {
                objK = new j0(kVar, 9);
                sVar.h0(objK);
            }
            sVar.p(false);
            c1.b1.a(str, (h9.k) objK, pVarK, false, null, n1.h.e(1364887134, new c8.v(4, jVar), sVar), null, false, null, null, null, true, 0, 0, null, null, sVar, 1572864, 12582912, 8257464);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new p(this, jVar, kVar, i7, 1);
        }
    }

    public void f(t8.j jVar, h9.k kVar, f1.s sVar, int i7) {
        i9.l.e(kVar, "callback");
        sVar.Y(739669728);
        if (((i7 | (sVar.f(jVar) ? 4 : 2)) & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = f1.b.s("");
                sVar.h0(objC);
            }
            b1 b1Var2 = (b1) objC;
            sVar.p(false);
            String str = (String) jVar.f12831b;
            r1.p pVarK = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.f820a, 0.0f, g5.a.n(6, sVar), 0.0f, 0.0f, 13);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(-1746271574);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new x(kVar, b1Var, b1Var2, 2);
                sVar.h0(objK2);
            }
            sVar.p(false);
            c1.b1.a(str, (h9.k) objK2, pVarK, false, null, n1.h.e(518828166, new k0(18, jVar, b1Var2), sVar), null, zBooleanValue, null, null, null, true, 0, 0, null, null, sVar, 1572864, 12582912, 8249272);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new p(this, jVar, kVar, i7, 0);
        }
    }

    public void g(List list, f1.s sVar, int i7) {
        List listJ;
        sVar.Y(-1227357877);
        if (((i7 | 6) & 3) == 2 && sVar.z()) {
            sVar.Q();
            listJ = list;
        } else {
            listJ = n3.l.J("连接设置", "CarLife连接设置");
            Activity activity = (Activity) sVar.j(d.c.f3530a);
            b1 b1VarK = f1.b.k(u.f9520p, sVar);
            sVar.W(1849434622);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            n1.c cVarE = n1.h.e(2074455988, new a8.y(20, listJ), sVar);
            n1.c cVar = d.f9478a;
            sVar.W(5004770);
            Object objK2 = sVar.K();
            if (objK2 == obj) {
                objK2 = new f0.k(b1Var, 29);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, false, (h9.a) objK2, sVar, 3510, 0);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            sVar.W(-1633490746);
            boolean zF = sVar.f(b1VarK);
            Object objK3 = sVar.K();
            if (zF || objK3 == obj) {
                objK3 = new f1(10, b1Var, b1VarK);
                sVar.h0(objK3);
            }
            sVar.p(false);
            l8.n.a(zBooleanValue, (h9.a) objK3, 0L, false, 0, null, null, null, null, n1.h.e(-1799827340, new m7.h(b1VarK, activity), sVar), sVar, 0, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new n(this, listJ, i7, 0);
        }
    }

    public void h(List list, f1.s sVar, int i7) {
        sVar.Y(-308896136);
        int i10 = 1;
        if ((i7 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            Context context = (Context) sVar.j(r2.n0.f11343b);
            sVar.W(1849434622);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (objK == obj) {
                objK = f1.b.s(Boolean.FALSE);
                sVar.h0(objK);
            }
            b1 b1Var = (b1) objK;
            sVar.p(false);
            t8.o oVar = n8.d.f8898a;
            Set<String> set = u8.y.f13124a;
            try {
                Set<String> stringSet = n8.d.c().getStringSet("CONNECT_USB_DEVICE_IGNORE", null);
                if (stringSet != null) {
                    set = stringSet;
                }
            } catch (ClassCastException unused) {
                SharedPreferences sharedPreferencesC = n8.d.c();
                i9.l.d(sharedPreferencesC, "<get-sharedPreferences>(...)");
                SharedPreferences.Editor editorEdit = sharedPreferencesC.edit();
                editorEdit.remove("CONNECT_USB_DEVICE_IGNORE");
                editorEdit.apply();
            }
            sVar.W(1849434622);
            Object objK2 = sVar.K();
            Object obj2 = objK2;
            if (objK2 == obj) {
                p1.p pVar = new p1.p();
                pVar.addAll(set);
                sVar.h0(pVar);
                obj2 = pVar;
            }
            p1.p pVar2 = (p1.p) obj2;
            sVar.p(false);
            int i11 = 21;
            n1.c cVarE = n1.h.e(1074042863, new a8.y(i11, list), sVar);
            n1.c cVar = d.f9480c;
            sVar.W(5004770);
            Object objK3 = sVar.K();
            if (objK3 == obj) {
                objK3 = new o(b1Var, 0);
                sVar.h0(objK3);
            }
            sVar.p(false);
            a.a.h(cVarE, cVar, false, (h9.a) objK3, sVar, 3126, 4);
            l8.n.a(((Boolean) b1Var.getValue()).booleanValue(), null, 0L, false, 0, null, n1.h.e(44690143, new f0(b1Var, 3), sVar), n1.h.e(-1889516256, new c8.j(pVar2, 4), sVar), n1.h.e(471244641, new d0(pVar2, b1Var, i10), sVar), n1.h.e(1779375919, new k0(i11, context, pVar2), sVar), sVar, 918552576, 126);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new n(this, list, i7, 1);
        }
    }
}
