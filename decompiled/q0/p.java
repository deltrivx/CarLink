package q0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import f1.s;
import f1.w1;
import r2.n0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f10575a = new p();

    public final void a(Drawable drawable, s sVar, int i7) {
        sVar.Y(257732500);
        int i10 = (sVar.h(drawable) ? 4 : 2) | i7;
        if (sVar.N(i10 & 1, (i10 & 3) != 2)) {
            r1.p pVarH = androidx.compose.foundation.layout.c.h(r1.m.f11116a, y.f.f14867j);
            boolean zH = sVar.h(drawable);
            Object objK = sVar.K();
            if (zH || objK == f1.n.f5051a) {
                objK = new c8.k(26, drawable);
                sVar.h0(objK);
            }
            d0.m.a(androidx.compose.ui.draw.a.a(pVarH, (h9.k) objK), sVar, 0);
        } else {
            sVar.Q();
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.m(i7, 16, this, drawable);
        }
    }

    public final void b(final Icon icon, s sVar, final int i7) {
        w1 w1VarR;
        h9.n nVar;
        sVar.Y(2116504409);
        int i10 = (sVar.h(icon) ? 4 : 2) | i7;
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            Context context = (Context) sVar.j(n0.f11343b);
            boolean zF = sVar.f(icon) | sVar.f(context);
            Object objK = sVar.K();
            if (zF || objK == f1.n.f5051a) {
                objK = icon.loadDrawable(context);
                sVar.h0(objK);
            }
            Drawable drawable = (Drawable) objK;
            if (drawable == null) {
                w1VarR = sVar.r();
                if (w1VarR == null) {
                    return;
                }
                final int i11 = 0;
                nVar = new h9.n(this, icon, i7, i11) { // from class: q0.o

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f10572a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ p f10573b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ Icon f10574c;

                    {
                        this.f10572a = i11;
                        this.f10573b = this;
                    }

                    @Override // h9.n
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f10572a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iY = f1.b.y(49);
                                this.f10573b.b(this.f10574c, (s) obj, iY);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iY2 = f1.b.y(49);
                                this.f10573b.b(this.f10574c, (s) obj, iY2);
                                break;
                        }
                        return z.f12851a;
                    }
                };
            } else {
                a(drawable, sVar, 48);
            }
            w1VarR.f5192d = nVar;
        }
        sVar.Q();
        w1VarR = sVar.r();
        if (w1VarR != null) {
            final int i12 = 1;
            nVar = new h9.n(this, icon, i7, i12) { // from class: q0.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f10572a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f10573b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Icon f10574c;

                {
                    this.f10572a = i12;
                    this.f10573b = this;
                }

                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f10572a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iY = f1.b.y(49);
                            this.f10573b.b(this.f10574c, (s) obj, iY);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iY2 = f1.b.y(49);
                            this.f10573b.b(this.f10574c, (s) obj, iY2);
                            break;
                    }
                    return z.f12851a;
                }
            };
            w1VarR.f5192d = nVar;
        }
    }
}
