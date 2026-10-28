package l0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c1.u2;
import com.baidu.carlifevehicle.R;
import f1.w2;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7763c;

    public /* synthetic */ m1(int i7, Object obj, Object obj2) {
        this.f7761a = i7;
        this.f7762b = obj;
        this.f7763c = obj2;
    }

    public m1(h9.a aVar, h9.k kVar) {
        this.f7761a = 2;
        this.f7763c = aVar;
        this.f7762b = kVar;
    }

    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i7;
        q2.a0 a0Var;
        q2.h hVar;
        int i10 = this.f7761a;
        y8.c cVar = null;
        t8.z zVar = t8.z.f12851a;
        Object obj4 = this.f7763c;
        Object obj5 = this.f7762b;
        f1.w0 w0Var = f1.n.f5051a;
        switch (i10) {
            case 0:
                f1.s sVar = (f1.s) obj2;
                ((Number) obj3).intValue();
                b0.k kVar = (b0.k) obj4;
                sVar.W(-102778667);
                Object objK = sVar.K();
                if (objK == w0Var) {
                    objK = f1.b.l(sVar);
                    sVar.h0(objK);
                }
                cc.y yVar = (cc.y) objK;
                Object objK2 = sVar.K();
                if (objK2 == w0Var) {
                    objK2 = f1.b.s(null);
                    sVar.h0(objK2);
                }
                f1.b1 b1Var = (f1.b1) objK2;
                f1.b1 b1VarV = f1.b.v((h9.k) obj5, sVar);
                boolean zF = sVar.f(kVar);
                Object objK3 = sVar.K();
                if (zF || objK3 == w0Var) {
                    objK3 = new c8.p(13, b1Var, kVar, false);
                    sVar.h0(objK3);
                }
                f1.b.c(kVar, (h9.k) objK3, sVar);
                boolean zH = sVar.h(yVar) | sVar.f(kVar) | sVar.f(b1VarV);
                Object objK4 = sVar.K();
                if (zH || objK4 == w0Var) {
                    objK4 = new l1(yVar, b1Var, kVar, b1VarV);
                    sVar.h0(objK4);
                }
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(kVar, null, (PointerInputEventHandler) objK4, 6);
                sVar.p(false);
                return suspendPointerInputElement;
            case 1:
                l8.j0 j0Var = (l8.j0) obj;
                f1.s sVar2 = (f1.s) obj2;
                ((Number) obj3).intValue();
                i9.l.e(j0Var, "item");
                d0.d dVar = d0.h.f3570e;
                r1.g gVar = r1.c.k;
                r1.p pVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.f820a, g5.a.n(16, sVar2), g5.a.n(8, sVar2));
                f1.b1 b1Var2 = (f1.b1) obj5;
                f1.b1 b1Var3 = (f1.b1) obj4;
                d0.n0 n0VarA = d0.l0.a(dVar, gVar, sVar2, 54);
                long j5 = sVar2.T;
                int i11 = (int) (j5 ^ (j5 >>> 32));
                f1.q1 q1VarL = sVar2.l();
                r1.p pVarC = r1.a.c(sVar2, pVarI);
                q2.j.f10719d0.getClass();
                q2.a0 a0Var2 = q2.i.f10705b;
                sVar2.a0();
                if (sVar2.S) {
                    sVar2.k(a0Var2);
                } else {
                    sVar2.k0();
                }
                q2.h hVar2 = q2.i.f10708e;
                f1.b.w(sVar2, hVar2, n0VarA);
                q2.h hVar3 = q2.i.f10707d;
                f1.b.w(sVar2, hVar3, q1VarL);
                q2.h hVar4 = q2.i.f10709f;
                if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i11))) {
                    ob.a.w(i11, sVar2, i11, hVar4);
                }
                q2.h hVar5 = q2.i.f10706c;
                f1.b.w(sVar2, hVar5, pVarC);
                d0.b bVar = d0.h.f3566a;
                d0.n0 n0VarA2 = d0.l0.a(bVar, gVar, sVar2, 48);
                long j10 = sVar2.T;
                int i12 = (int) (j10 ^ (j10 >>> 32));
                f1.q1 q1VarL2 = sVar2.l();
                r1.m mVar = r1.m.f11116a;
                r1.p pVarC2 = r1.a.c(sVar2, mVar);
                sVar2.a0();
                if (sVar2.S) {
                    sVar2.k(a0Var2);
                } else {
                    sVar2.k0();
                }
                f1.b.w(sVar2, hVar2, n0VarA2);
                f1.b.w(sVar2, hVar3, q1VarL2);
                if (sVar2.S || !i9.l.a(sVar2.K(), Integer.valueOf(i12))) {
                    ob.a.w(i12, sVar2, i12, hVar4);
                }
                f1.b.w(sVar2, hVar5, pVarC2);
                o7.g gVar2 = o7.g.f9489a;
                String str = (String) b1Var2.getValue();
                sVar2.W(5004770);
                boolean zF2 = sVar2.f(str);
                Object objK5 = sVar2.K();
                if (zF2 || objK5 == w0Var) {
                    objK5 = BitmapFactory.decodeFile(j0Var.f8198c);
                    sVar2.h0(objK5);
                }
                Bitmap bitmap = (Bitmap) objK5;
                sVar2.p(false);
                if (bitmap != null) {
                    sVar2.W(-2123064777);
                    a0Var = a0Var2;
                    n3.n.C(new y1.f(bitmap), null, n4.h.o(androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.b(mVar, 60), 1.7213115f), k0.e.a(g5.a.n(12, sVar2))), sVar2, 24624, 232);
                    sVar2.p(false);
                    hVar = hVar4;
                    i7 = 12;
                } else {
                    sVar2.W(-2122494656);
                    i7 = 12;
                    a0Var = a0Var2;
                    hVar = hVar4;
                    n3.n.B(n3.l.N(R.drawable.cover_error, sVar2), null, n4.h.o(androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.b(mVar, 60), 1.7213115f), k0.e.a(g5.a.n(12, sVar2))), null, o2.j.f9356a, 0.0f, sVar2, 24624, 104);
                    sVar2 = sVar2;
                    sVar2.p(false);
                }
                d0.c.a(sVar2, androidx.compose.foundation.layout.c.k(mVar, g5.a.n(i7, sVar2)));
                f1.s sVar3 = sVar2;
                u2.b(j0Var.f8196a, null, 0L, n3.r.K(g5.a.n(18, sVar2), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 0, 0, 131062);
                sVar3.p(true);
                d0.n0 n0VarA3 = d0.l0.a(bVar, gVar, sVar3, 48);
                long j11 = sVar3.T;
                int i13 = (int) (j11 ^ (j11 >>> 32));
                f1.q1 q1VarL3 = sVar3.l();
                r1.p pVarC3 = r1.a.c(sVar3, mVar);
                sVar3.a0();
                if (sVar3.S) {
                    sVar3.k(a0Var);
                } else {
                    sVar3.k0();
                }
                f1.b.w(sVar3, hVar2, n0VarA3);
                f1.b.w(sVar3, hVar3, q1VarL3);
                if (sVar3.S || !i9.l.a(sVar3.K(), Integer.valueOf(i13))) {
                    ob.a.w(i13, sVar3, i13, hVar);
                }
                f1.b.w(sVar3, hVar5, pVarC3);
                u2.b("选择", null, 0L, n3.r.K(g5.a.n(18, sVar3), 4294967296L), null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 6, 0, 131062);
                d0.c.a(sVar3, androidx.compose.foundation.layout.c.k(mVar, g5.a.n(24, sVar3)));
                long jK = n3.r.K(g5.a.n(18, sVar3), 4294967296L);
                r1.p pVarK = androidx.compose.foundation.layout.a.k(mVar, 0.0f, 0.0f, g5.a.n(16, sVar3), 0.0f, 11);
                sVar3.W(1849434622);
                Object objK6 = sVar3.K();
                if (objK6 == w0Var) {
                    objK6 = ob.a.m(sVar3);
                }
                b0.k kVar2 = (b0.k) objK6;
                sVar3.p(false);
                sVar3.W(-1633490746);
                boolean zH2 = sVar3.h(j0Var);
                Object objK7 = sVar3.K();
                if (zH2 || objK7 == w0Var) {
                    objK7 = new a8.f1(9, j0Var, b1Var3);
                    sVar3.h0(objK7);
                }
                sVar3.p(false);
                u2.b("删除", androidx.compose.foundation.a.c(pVarK, kVar2, null, false, (h9.a) objK7, 28), 0L, jK, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 6, 0, 131060);
                sVar3.p(true);
                sVar3.p(true);
                return zVar;
            case 2:
                f1.s sVar4 = (f1.s) obj2;
                ((Number) obj3).intValue();
                sVar4.W(759876635);
                h9.a aVar = (h9.a) obj4;
                Object objK8 = sVar4.K();
                if (objK8 == w0Var) {
                    objK8 = f1.b.o(aVar);
                    sVar4.h0(objK8);
                }
                w2 w2Var = (w2) objK8;
                Object objK9 = sVar4.K();
                if (objK9 == w0Var) {
                    objK9 = new v.c(new x1.b(((x1.b) w2Var.getValue()).f14521a), w0.t0.f13936b, new x1.b(w0.t0.f13937c), 8);
                    sVar4.h0(objK9);
                }
                v.c cVar2 = (v.c) objK9;
                boolean zH3 = sVar4.h(cVar2);
                Object objK10 = sVar4.K();
                if (zH3 || objK10 == w0Var) {
                    objK10 = new b1.f(w2Var, cVar2, cVar, 11);
                    sVar4.h0(objK10);
                }
                f1.b.f(sVar4, (h9.n) objK10, zVar);
                v.k kVar3 = cVar2.f13326c;
                h9.k kVar4 = (h9.k) obj5;
                boolean zF3 = sVar4.f(kVar3);
                Object objK11 = sVar4.K();
                if (zF3 || objK11 == w0Var) {
                    objK11 = new w0.s0(kVar3, 0);
                    sVar4.h0(objK11);
                }
                r1.p pVar = (r1.p) kVar4.invoke((h9.a) objK11);
                sVar4.p(false);
                return pVar;
            case 3:
                f1.s sVar5 = (f1.s) obj2;
                ((Number) obj3).intValue();
                sVar5.W(-353972293);
                x.o0 o0VarB = ((x.n0) obj5).b((b0.k) obj4, sVar5);
                boolean zF4 = sVar5.f(o0VarB);
                Object objK12 = sVar5.K();
                if (zF4 || objK12 == w0Var) {
                    objK12 = new x.p0(o0VarB);
                    sVar5.h0(objK12);
                }
                x.p0 p0Var = (x.p0) objK12;
                sVar5.p(false);
                return p0Var;
            default:
                f1.s sVar6 = (f1.s) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (sVar6.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objK13 = sVar6.K();
                    if (objK13 == w0Var) {
                        objK13 = new y.e();
                        sVar6.h0(objK13);
                    }
                    y.e eVar = (y.e) objK13;
                    eVar.f14857a.clear();
                    ((h9.k) obj5).invoke(eVar);
                    eVar.a((y.c) obj4, sVar6, 0);
                } else {
                    sVar6.Q();
                }
                return zVar;
        }
    }
}
