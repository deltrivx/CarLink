package o7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import d0.l0;
import d0.n0;
import f1.q1;
import java.io.File;
import q2.a0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f implements h9.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t8.j f9487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9488b;

    public f(t8.j jVar, int i7) {
        this.f9487a = jVar;
        this.f9488b = i7;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
    @Override // h9.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Bitmap bitmapDecodeFile;
        char c10;
        int i7;
        q2.h hVar;
        f1.s sVar = (f1.s) obj2;
        int iIntValue = ((Number) obj3).intValue();
        i9.l.e((d0.t) obj, "$this$Card");
        if ((iIntValue & 17) == 16 && sVar.z()) {
            sVar.Q();
        } else {
            r1.g gVar = r1.c.k;
            d0.d dVar = d0.h.f3570e;
            r1.p pVarH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.f820a, g5.a.n(16, sVar));
            n0 n0VarA = l0.a(dVar, gVar, sVar, 54);
            long j5 = sVar.T;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            q1 q1VarL = sVar.l();
            r1.p pVarC = r1.a.c(sVar, pVarH);
            q2.j.f10719d0.getClass();
            a0 a0Var = q2.i.f10705b;
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            q2.h hVar2 = q2.i.f10708e;
            f1.b.w(sVar, hVar2, n0VarA);
            q2.h hVar3 = q2.i.f10707d;
            f1.b.w(sVar, hVar3, q1VarL);
            q2.h hVar4 = q2.i.f10709f;
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i10))) {
                ob.a.w(i10, sVar, i10, hVar4);
            }
            q2.h hVar5 = q2.i.f10706c;
            f1.b.w(sVar, hVar5, pVarC);
            r1.m mVar = r1.m.f11116a;
            r1.p pVarO = n4.h.o(androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.c.b(mVar, 120), 1.7213115f), k0.e.a(g5.a.n(12, sVar)));
            Object obj4 = this.f9487a.f12831b;
            String str = (String) obj4;
            sVar.W(5004770);
            boolean zF = sVar.f(str);
            Object objK = sVar.K();
            if (zF || objK == f1.n.f5051a) {
                if (((CharSequence) obj4).length() > 0) {
                    File file = new File(g.f9490b.k, str);
                    if (!file.exists() || (bitmapDecodeFile = BitmapFactory.decodeFile(file.getCanonicalPath())) == null) {
                        objK = null;
                    } else {
                        objK = new y1.f(bitmapDecodeFile);
                    }
                } else {
                    objK = null;
                }
                sVar.h0(objK);
            }
            y1.f fVar = (y1.f) objK;
            sVar.p(false);
            if (fVar != null) {
                sVar.W(121918515);
                c10 = ' ';
                i7 = 0;
                n3.n.C(fVar, null, pVarO, sVar, 24624, 232);
                sVar.p(false);
                hVar = hVar5;
            } else {
                c10 = ' ';
                i7 = 0;
                sVar.W(122189920);
                hVar = hVar5;
                n3.n.B(n3.l.N(this.f9488b, sVar), null, pVarO, null, o2.j.f9356a, 0.0f, sVar, 24624, 104);
                sVar = sVar;
                sVar.p(false);
            }
            r1.p pVarK = androidx.compose.foundation.layout.a.k(mVar, g5.a.n(16, sVar), 0.0f, 0.0f, 0.0f, 14);
            n0 n0VarA2 = l0.a(d0.h.f3566a, r1.c.f11101j, sVar, i7);
            long j10 = sVar.T;
            int i11 = (int) (j10 ^ (j10 >>> c10));
            q1 q1VarL2 = sVar.l();
            r1.p pVarC2 = r1.a.c(sVar, pVarK);
            sVar.a0();
            if (sVar.S) {
                sVar.k(a0Var);
            } else {
                sVar.k0();
            }
            f1.b.w(sVar, hVar2, n0VarA2);
            f1.b.w(sVar, hVar3, q1VarL2);
            if (sVar.S || !i9.l.a(sVar.K(), Integer.valueOf(i11))) {
                ob.a.w(i11, sVar, i11, hVar4);
            }
            f1.b.w(sVar, hVar, pVarC2);
            i2.c.m("选择", null, sVar, 6, 2);
            i2.c.b(i7, sVar);
            sVar.p(true);
            sVar.p(true);
        }
        return z.f12851a;
    }
}
