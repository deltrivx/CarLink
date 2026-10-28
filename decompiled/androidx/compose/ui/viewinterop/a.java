package androidx.compose.ui.viewinterop;

import a5.g;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.lifecycle.t;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.n;
import f1.q;
import f1.q1;
import f1.s;
import f1.w1;
import h9.k;
import i9.l;
import n3.c;
import o1.f;
import o1.h;
import q2.h0;
import q2.i;
import q2.j;
import q2.z0;
import q3.b;
import q3.m;
import r1.o;
import r1.p;
import r2.j1;
import r2.n0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(int i7, s sVar, k kVar, p pVar) {
        int i10;
        Object obj = b.f10874e;
        sVar.Y(-180024211);
        if ((i7 & 6) == 0) {
            i10 = (sVar.h(kVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.f(pVar) ? 32 : 16;
        }
        int i11 = i10 | 384;
        if ((i7 & 3072) == 0) {
            i11 |= sVar.h(obj) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i11 |= sVar.h(obj) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT;
        }
        if (sVar.N(i11 & 1, (i11 & 9363) != 9362)) {
            long j5 = sVar.T;
            int i12 = (int) ((j5 >>> 32) ^ j5);
            p pVarA = pVar.a(FocusGroupPropertiesElement.f968a);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = new z0() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
                public final boolean equals(Object obj2) {
                    return obj2 == this;
                }

                public final int hashCode() {
                    return 1739042953;
                }

                @Override // q2.z0
                public final o i() {
                    return new w1.s(0, null, 7);
                }

                @Override // q2.z0
                public final /* bridge */ /* synthetic */ void j(o oVar) {
                }
            };
            p pVarC = r1.a.c(sVar, pVarA.a(focusTargetNode$FocusTargetElement).a(FocusTargetPropertiesElement.f969a).a(focusTargetNode$FocusTargetElement));
            c cVar = (c) sVar.j(j1.f11276h);
            n3.o oVar = (n3.o) sVar.j(j1.f11281n);
            q1 q1VarL = sVar.l();
            t tVar = (t) sVar.j(s4.a.f12577a);
            g gVar = (g) sVar.j(b5.a.f1515a);
            sVar.W(1314800527);
            int i13 = i11 & 14;
            long j10 = sVar.T;
            int i14 = (int) (j10 ^ (j10 >>> 32));
            Context context = (Context) sVar.j(n0.f11343b);
            q qVarU = f1.b.u(sVar);
            f fVar = (f) sVar.j(h.f9281a);
            View view = (View) sVar.j(n0.f11347f);
            boolean zH = sVar.h(context) | ((((i13 & 14) ^ 6) > 4 && sVar.f(kVar)) || (i13 & 6) == 4) | sVar.h(qVarU) | sVar.h(fVar) | sVar.d(i14) | sVar.h(view);
            Object objK = sVar.K();
            if (zH || objK == n.f5051a) {
                objK = new m(context, kVar, qVarU, fVar, i14, view);
                sVar.h0(objK);
            }
            h9.a aVar = (h9.a) objK;
            sVar.R(125, 1, null, null);
            sVar.f5122r = true;
            if (sVar.S) {
                sVar.k(aVar);
            } else {
                sVar.k0();
            }
            j.f10719d0.getClass();
            f1.b.w(sVar, i.f10707d, q1VarL);
            f1.b.w(sVar, q3.k.f10923d, pVarC);
            f1.b.w(sVar, q3.k.f10924e, cVar);
            f1.b.w(sVar, q3.k.f10925f, tVar);
            f1.b.w(sVar, q3.k.f10926g, gVar);
            f1.b.w(sVar, q3.k.f10927h, oVar);
            q2.h hVar = i.f10709f;
            if (sVar.S || !l.a(sVar.K(), Integer.valueOf(i12))) {
                ob.a.w(i12, sVar, i12, hVar);
            }
            f1.b.w(sVar, q3.k.f10921b, obj);
            f1.b.w(sVar, q3.k.f10922c, obj);
            sVar.p(true);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new q3.l(kVar, pVar, i7);
        }
    }

    public static final void b(k kVar, p pVar, k kVar2, s sVar, int i7) {
        k kVar3;
        b bVar = b.f10874e;
        sVar.Y(-1783766393);
        int i10 = (sVar.h(kVar) ? 4 : 2) | i7 | 384;
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            a((i10 & 14) | 27696, sVar, kVar, pVar);
            kVar3 = bVar;
        } else {
            sVar.Q();
            kVar3 = kVar2;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new d1.k(kVar, pVar, kVar3, i7, 2);
        }
    }

    public static final q3.q c(h0 h0Var) {
        q3.q qVar = h0Var.f10679n;
        if (qVar != null) {
            return qVar;
        }
        throw ob.a.o("Required value was null.");
    }
}
