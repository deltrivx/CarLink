package s0;

import a9.i;
import cc.b0;
import f1.k1;
import f1.s;
import f1.w1;
import fc.h;
import h9.n;
import r2.a3;
import t8.z;
import x.z0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.c f12529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f12530b = new z0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f12531c = f1.b.s(null);

    public c(n1.c cVar) {
        this.f12529a = cVar;
    }

    @Override // s0.f
    public final Object a(e eVar, i iVar) {
        h hVar = new h(this, new b(eVar), null, 2);
        z0 z0Var = this.f12530b;
        z0Var.getClass();
        Object objG = b0.g(new a3(z0Var, hVar, (y8.c) null), iVar);
        return objG == z8.a.f15774a ? objG : z.f12851a;
    }

    public final void b(final h9.a aVar, s sVar, final int i7) {
        final h9.a aVar2;
        s sVar2;
        sVar.Y(723898654);
        int i10 = (sVar.f(this) ? 32 : 16) | i7;
        if (sVar.N(i10 & 1, (i10 & 19) != 18)) {
            b bVar = (b) this.f12531c.getValue();
            if (bVar == null) {
                w1 w1VarR = sVar.r();
                if (w1VarR != null) {
                    final int i11 = 0;
                    w1VarR.f5192d = new n(this, aVar, i7, i11) { // from class: s0.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f12524a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ c f12525b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ h9.a f12526c;

                        {
                            this.f12524a = i11;
                            this.f12525b = this;
                        }

                        @Override // h9.n
                        public final Object invoke(Object obj, Object obj2) {
                            int i12 = this.f12524a;
                            s sVar3 = (s) obj;
                            ((Integer) obj2).getClass();
                            switch (i12) {
                                case 0:
                                    this.f12525b.b(this.f12526c, sVar3, f1.b.y(7));
                                    break;
                                default:
                                    this.f12525b.b(this.f12526c, sVar3, f1.b.y(7));
                                    break;
                            }
                            return z.f12851a;
                        }
                    };
                    return;
                }
                return;
            }
            aVar2 = aVar;
            sVar2 = sVar;
            this.f12529a.d(bVar, bVar.f12527a, aVar2, sVar2, 384);
        } else {
            aVar2 = aVar;
            sVar2 = sVar;
            sVar2.Q();
        }
        w1 w1VarR2 = sVar2.r();
        if (w1VarR2 != null) {
            final int i12 = 1;
            w1VarR2.f5192d = new n(this, aVar2, i7, i12) { // from class: s0.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f12524a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f12525b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h9.a f12526c;

                {
                    this.f12524a = i12;
                    this.f12525b = this;
                }

                @Override // h9.n
                public final Object invoke(Object obj, Object obj2) {
                    int i13 = this.f12524a;
                    s sVar3 = (s) obj;
                    ((Integer) obj2).getClass();
                    switch (i13) {
                        case 0:
                            this.f12525b.b(this.f12526c, sVar3, f1.b.y(7));
                            break;
                        default:
                            this.f12525b.b(this.f12526c, sVar3, f1.b.y(7));
                            break;
                    }
                    return z.f12851a;
                }
            };
        }
    }
}
