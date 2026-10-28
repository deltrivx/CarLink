package q0;

import a8.f1;
import a8.k0;
import a8.u0;
import android.content.Context;
import android.os.Build;
import f1.c0;
import f1.s;
import f1.w0;
import f1.w1;
import h0.u;
import java.io.IOException;
import n3.r;
import org.xmlpull.v1.XmlPullParserException;
import r2.n0;
import r3.a0;
import r3.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f10564a;

    static {
        f10564a = new z((14 & 1) == 0, a0.f11527a, true);
    }

    public static final void a(s0.b bVar, o0.c cVar, s sVar, int i7) {
        s sVar2;
        Context context;
        sVar.Y(1904307118);
        int i10 = (sVar.f(bVar) ? 4 : 2) | i7 | (sVar.h(cVar) ? 32 : 16);
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                sVar.W(-1009462744);
                context = (Context) sVar.j(n0.f11343b);
                sVar.p(false);
            } else {
                sVar.W(-1009413640);
                sVar.p(false);
                context = null;
            }
            boolean zH = sVar.h(cVar) | ((i10 & 14) == 4) | sVar.h(context);
            Object objK = sVar.K();
            if (zH || objK == f1.n.f5051a) {
                objK = new u0(cVar, context, bVar, 10);
                sVar.h0(objK);
            }
            sVar2 = sVar;
            y.g.b(null, null, (h9.k) objK, sVar2, 0, 3);
        } else {
            sVar2 = sVar;
            sVar2.Q();
        }
        w1 w1VarR = sVar2.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 15, bVar, cVar);
        }
    }

    public static final void b(final int i7, final long j5, s sVar, final int i10) throws XmlPullParserException, IOException {
        final int i11;
        int i12;
        w1 w1VarR;
        h9.n nVar;
        sVar.Y(-1240244237);
        if ((i10 & 6) == 0) {
            i11 = i7;
            i12 = i10 | (sVar.d(i11) ? 4 : 2);
        } else {
            i11 = i7;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= sVar.e(j5) ? 32 : 16;
        }
        if (sVar.N(i12 & 1, (i12 & 19) != 18)) {
            Context context = (Context) sVar.j(n0.f11343b);
            boolean zF = ((i12 & 14) == 4) | sVar.f(context);
            Object objK = sVar.K();
            Object obj = f1.n.f5051a;
            if (zF || objK == obj) {
                objK = Integer.valueOf(context.obtainStyledAttributes(new int[]{i11}).getResourceId(0, -1));
                sVar.h0(objK);
            }
            int iIntValue = ((Number) objK).intValue();
            if (iIntValue == -1) {
                w1VarR = sVar.r();
                if (w1VarR == null) {
                    return;
                }
                final int i13 = 0;
                nVar = new h9.n() { // from class: q0.j
                    @Override // h9.n
                    public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, IOException {
                        int i14 = i13;
                        s sVar2 = (s) obj2;
                        ((Integer) obj3).getClass();
                        switch (i14) {
                            case 0:
                                k.b(i11, j5, sVar2, f1.b.y(i10 | 1));
                                break;
                            default:
                                k.b(i11, j5, sVar2, f1.b.y(i10 | 1));
                                break;
                        }
                        return t8.z.f12851a;
                    }
                };
            } else {
                d2.b bVarN = n3.l.N(iIntValue, sVar);
                boolean z10 = (i12 & 112) == 32;
                Object objK2 = sVar.K();
                if (z10 || objK2 == obj) {
                    objK2 = j5 == 16 ? null : new y1.k(5, j5);
                    sVar.h0(objK2);
                }
                d0.m.a(androidx.compose.ui.draw.a.d(androidx.compose.foundation.layout.c.h(r1.m.f11116a, y.f.f14867j), bVarN, null, o2.j.f9357b, 0.0f, (y1.k) objK2, 22), sVar, 0);
            }
            w1VarR.f5192d = nVar;
        }
        sVar.Q();
        w1VarR = sVar.r();
        if (w1VarR != null) {
            final int i14 = 1;
            nVar = new h9.n() { // from class: q0.j
                @Override // h9.n
                public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, IOException {
                    int i15 = i14;
                    s sVar2 = (s) obj2;
                    ((Integer) obj3).getClass();
                    switch (i15) {
                        case 0:
                            k.b(i7, j5, sVar2, f1.b.y(i10 | 1));
                            break;
                        default:
                            k.b(i7, j5, sVar2, f1.b.y(i10 | 1));
                            break;
                    }
                    return t8.z.f12851a;
                }
            };
            w1VarR.f5192d = nVar;
        }
    }

    public static final void c(s0.b bVar, s0.e eVar, h9.a aVar, s sVar, int i7) {
        int i10;
        sVar.Y(-2040393164);
        if ((i7 & 6) == 0) {
            i10 = ((i7 & 8) == 0 ? sVar.f(bVar) : sVar.h(bVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= (i7 & 64) == 0 ? sVar.f(eVar) : sVar.h(eVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 |= sVar.h(aVar) ? 256 : 128;
        }
        boolean z10 = false;
        if (sVar.N(i10 & 1, (i10 & 147) != 146)) {
            boolean z11 = (i10 & 112) == 32 || ((i10 & 64) != 0 && sVar.f(eVar));
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (z11 || objK == w0Var) {
                objK = new m(new wb.b(new f1(13, eVar, aVar)));
                sVar.h0(objK);
            }
            m mVar = (m) objK;
            if ((i10 & 14) == 4 || ((i10 & 8) != 0 && sVar.h(bVar))) {
                z10 = true;
            }
            Object objK2 = sVar.K();
            if (z10 || objK2 == w0Var) {
                objK2 = new a5.e(22, bVar);
                sVar.h0(objK2);
            }
            r3.l.a(mVar, (h9.a) objK2, f10564a, n1.h.e(1315155414, new k0(22, eVar, bVar), sVar), sVar, 3456, 0);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new u(bVar, eVar, aVar, i7, 6);
        }
    }

    public static final void d(r1.p pVar, n1.c cVar, s sVar, int i7) {
        int i10;
        sVar.Y(1392105195);
        int i11 = 2;
        if ((i7 & 6) == 0) {
            i10 = (sVar.f(pVar) ? 4 : 2) | i7;
        } else {
            i10 = i7;
        }
        if ((i7 & 48) == 0) {
            i10 |= sVar.h(cVar) ? 32 : 16;
        }
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            c0 c0Var = s0.g.f12534a;
            n1.c cVar2 = i.f10558a;
            r.b(pVar, c0Var, cVar, sVar, ((i10 << 6) & 7168) | (i10 & 14) | 432);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new g(pVar, cVar, i7, i11);
        }
    }
}
