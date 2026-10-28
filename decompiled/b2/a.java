package b2;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.CancellationSignal;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import c1.a1;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import e2.d0;
import f1.b1;
import h0.n0;
import java.util.List;
import java.util.Map;
import k2.l0;
import l0.o0;
import q2.c2;
import q2.e2;
import q2.h0;
import q2.h1;
import q2.i0;
import r2.j0;
import r2.m1;
import r2.s1;
import r2.t1;
import r2.v1;
import t8.z;
import u0.q;
import y1.e0;
import y1.m0;
import y1.p0;
import y2.t;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i9.n implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, Object obj) {
        super(1);
        this.f1192a = i7;
        this.f1193b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [o2.v0, q2.a] */
    @Override // h9.k
    public final Object invoke(Object obj) {
        int i7 = this.f1192a;
        int i10 = 0;
        z zVar = z.f12851a;
        Object obj2 = this.f1193b;
        switch (i7) {
            case 0:
                a2.g gVar = (a2.g) obj;
                c cVar = (c) obj2;
                e0 e0Var = cVar.f1207l;
                if (cVar.f1209n && cVar.f1218w && e0Var != null) {
                    a2.b bVarW = gVar.W();
                    long J = bVarW.J();
                    bVarW.z().h();
                    try {
                        ((a2.b) ((a2.d) bVarW.f12b).f20b).z().j(e0Var);
                        cVar.c(gVar);
                    } finally {
                        ob.a.y(bVarW, J);
                    }
                } else {
                    cVar.c(gVar);
                }
                return zVar;
            case 1:
                d0 d0Var = (d0) obj;
                e2.c cVar2 = (e2.c) obj2;
                cVar2.g(d0Var);
                h9.k kVar = cVar2.f4111i;
                if (kVar != null) {
                    kVar.invoke(d0Var);
                }
                return zVar;
            case 2:
                Throwable th = (Throwable) obj;
                l0 l0Var = (l0) obj2;
                cc.l lVar = l0Var.f7248c;
                if (lVar != null) {
                    lVar.w(th);
                }
                l0Var.f7248c = null;
                return zVar;
            case 3:
                q2.a aVar = (q2.a) obj;
                i0 i0Var = (i0) obj2;
                if (aVar.B()) {
                    if (aVar.b().f10711b) {
                        aVar.A();
                    }
                    for (Map.Entry entry : aVar.b().f10716g.entrySet()) {
                        i0.a(i0Var, (o2.m) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar.f());
                    }
                    h1 h1Var = aVar.f().f10694q;
                    i9.l.b(h1Var);
                    while (!h1Var.equals(i0Var.f10710a.f())) {
                        for (o2.m mVar : i0Var.b(h1Var).keySet()) {
                            i0.a(i0Var, mVar, i0Var.c(h1Var, mVar), h1Var);
                        }
                        h1Var = h1Var.f10694q;
                        i9.l.b(h1Var);
                    }
                }
                return zVar;
            case 4:
                ((h1.e) obj2).b((r1.n) obj);
                return Boolean.TRUE;
            case 5:
                ((h0) obj2).Z((n3.c) obj);
                return zVar;
            case 6:
                return Boolean.valueOf(((s.k) obj2).a(((y2.m) obj).f15023g));
            case 7:
                return Boolean.valueOf(j0.c((y2.m) obj, (Resources) obj2));
            case 8:
                ((b1) obj2).setValue(new Configuration((Configuration) obj));
                return zVar;
            case 9:
                return new e8.p(8, (m1) obj2);
            case 10:
                if (s1.f11401b.compareAndSet(false, true)) {
                    ((ec.h) obj2).x(zVar);
                }
                return zVar;
            case 11:
                a2.g gVar2 = (a2.g) obj;
                y1.o oVarZ = gVar2.W().z();
                h9.n nVar = ((t1) obj2).f11431d;
                if (nVar != null) {
                    nVar.invoke(oVarZ, (c) gVar2.W().f13c);
                }
                return zVar;
            case 12:
                g3.l lVar2 = (g3.l) obj;
                q qVar = lVar2.f5873b;
                if (qVar != null) {
                    lVar2.a(qVar);
                    lVar2.f5873b = null;
                }
                v1 v1Var = (v1) obj2;
                h1.e eVar = v1Var.f11498d;
                Object[] objArr = eVar.f6421a;
                int i11 = eVar.f6423c;
                while (true) {
                    if (i10 >= i11) {
                        i10 = -1;
                    } else if (!i9.l.a((e2) objArr[i10], lVar2)) {
                        i10++;
                    }
                }
                if (i10 >= 0) {
                    eVar.l(i10);
                }
                if (eVar.f6423c == 0) {
                    v1Var.f11496b.invoke();
                }
                return zVar;
            case 13:
                ((h9.n) obj2).invoke((y1.o) obj, null);
                return zVar;
            case 14:
                return obj == ((s.d0) obj2) ? "(this)" : String.valueOf(obj);
            case 15:
                return obj == ((s.e0) obj2) ? "(this)" : String.valueOf(obj);
            case 16:
                return obj == ((s.i0) obj2) ? "(this)" : String.valueOf(obj);
            case 17:
                v.o oVar = (v.o) obj;
                float f10 = oVar.f13418b;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                float f11 = oVar.f13419c;
                if (f11 < -0.5f) {
                    f11 = -0.5f;
                }
                if (f11 > 0.5f) {
                    f11 = 0.5f;
                }
                float f12 = oVar.f13420d;
                float f13 = f12 >= -0.5f ? f12 : -0.5f;
                float f14 = f13 <= 0.5f ? f13 : 0.5f;
                float f15 = oVar.f13417a;
                float f16 = f15 >= 0.0f ? f15 : 0.0f;
                return new y1.q(y1.q.a(y1.h0.b(f10, f11, f14, f16 <= 1.0f ? f16 : 1.0f, z1.d.f15643x), (z1.c) obj2));
            case 18:
                u1.d dVar = (u1.d) obj;
                if (!dVar.f11117a.f11129n) {
                    return c2.f10602b;
                }
                u1.d dVar2 = dVar.f13041p;
                c2 c2Var = c2.f10601a;
                if (dVar2 != null) {
                    a aVar2 = new a(18, (o0) obj2);
                    if (aVar2.invoke(dVar2) == c2Var) {
                        q2.f.A(dVar2, aVar2);
                    }
                }
                dVar.f13041p = null;
                dVar.f13040o = null;
                return c2Var;
            case 19:
                q2.j0 j0Var = (q2.j0) obj;
                ((a1) obj2).invoke(j0Var);
                j0Var.b();
                return zVar;
            case 20:
                y1.i0 i0Var2 = (y1.i0) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj2;
                i0Var2.d(i0Var2.f14915n.a() * y.f.f14861d);
                i0Var2.e(shadowGraphicsLayerElement.f933a);
                boolean z10 = shadowGraphicsLayerElement.f934b;
                if (i0Var2.f14913l != z10) {
                    i0Var2.f14903a |= 16384;
                    i0Var2.f14913l = z10;
                }
                i0Var2.c(shadowGraphicsLayerElement.f935c);
                i0Var2.f(shadowGraphicsLayerElement.f936d);
                return zVar;
            case 21:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return zVar;
            case 22:
                y1.i0 i0Var3 = (y1.i0) obj;
                m0 m0Var = (m0) obj2;
                float f17 = m0Var.f14929o;
                if (i0Var3.f14904b != f17) {
                    i0Var3.f14903a |= 1;
                    i0Var3.f14904b = f17;
                }
                float f18 = m0Var.f14930p;
                if (i0Var3.f14905c != f18) {
                    i0Var3.f14903a |= 2;
                    i0Var3.f14905c = f18;
                }
                i0Var3.b(m0Var.f14931q);
                i0Var3.d(m0Var.f14932r);
                float f19 = m0Var.f14933s;
                if (i0Var3.f14910h != f19) {
                    i0Var3.f14903a |= 1024;
                    i0Var3.f14910h = f19;
                }
                float f20 = m0Var.f14934t;
                if (i0Var3.f14911i != f20) {
                    i0Var3.f14903a |= 2048;
                    i0Var3.f14911i = f20;
                }
                long j5 = m0Var.f14935u;
                long j10 = i0Var3.f14912j;
                int i12 = p0.f14947b;
                if (j10 != j5) {
                    i0Var3.f14903a |= ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_LEFT;
                    i0Var3.f14912j = j5;
                }
                i0Var3.e(m0Var.f14936v);
                boolean z11 = m0Var.f14937w;
                if (i0Var3.f14913l != z11) {
                    i0Var3.f14903a |= 16384;
                    i0Var3.f14913l = z11;
                }
                i0Var3.c(m0Var.f14938x);
                i0Var3.f(m0Var.f14939y);
                int i13 = m0Var.f14940z;
                if (i0Var3.f14917p != i13) {
                    i0Var3.f14903a |= 524288;
                    i0Var3.f14917p = i13;
                }
                return zVar;
            case 23:
                t.b((y2.j) obj, ((y2.g) obj2).f14983a);
                return zVar;
            default:
                ((List) obj).add((Float) ((n0) obj2).invoke());
                return true;
        }
    }
}
