package l0;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7688a = 0;

    static {
        float f10 = 40;
        k9.a.b(f10, f10);
    }

    public static final void a(final String str, final h9.k kVar, final r1.p pVar, final boolean z10, final b3.r0 r0Var, final s0 s0Var, final r0 r0Var2, final boolean z11, final int i7, final int i10, final b3.l0 l0Var, h9.k kVar2, final b0.k kVar3, final y1.n0 n0Var, final n1.c cVar, f1.s sVar, final int i11) {
        final h9.k kVar4;
        int i12;
        h9.k kVar5;
        int i13;
        sVar.Y(2026950908);
        int i14 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.h(kVar) ? 32 : 16) | (sVar.f(pVar) ? 256 : 128) | (sVar.g(z10) ? 2048 : 1024) | (sVar.g(false) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT) | (sVar.f(r0Var) ? 131072 : 65536) | (sVar.f(s0Var) ? 1048576 : 524288) | (sVar.f(r0Var2) ? 8388608 : 4194304) | (sVar.g(z11) ? 67108864 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_ID_ZONE) | (sVar.d(i7) ? 536870912 : 268435456);
        int i15 = 196608 | (sVar.d(i10) ? 4 : 2) | (sVar.f(l0Var) ? 32 : 16) | 384 | (sVar.f(kVar3) ? 2048 : 1024) | (sVar.f(n0Var) ? 16384 : ServiceTypes.MSG_VEHICLE_CONTROL_AREA_WINDOW_ROW_3_RIGHT);
        if (sVar.N(i14 & 1, ((306783379 & i14) == 306783378 && (i15 & 74899) == 74898) ? false : true)) {
            sVar.S();
            int i16 = i11 & 1;
            Object obj = f1.n.f5051a;
            if (i16 == 0 || sVar.x()) {
                Object objK = sVar.K();
                if (objK == obj) {
                    i12 = 1;
                    objK = new b3.b0(28);
                    sVar.h0(objK);
                } else {
                    i12 = 1;
                }
                kVar5 = (h9.k) objK;
            } else {
                sVar.Q();
                kVar5 = kVar2;
                i12 = 1;
            }
            sVar.q();
            Object objK2 = sVar.K();
            if (objK2 == obj) {
                i13 = i14;
                objK2 = f1.b.s(new g3.w(str, 0L, 6));
                sVar.h0(objK2);
            } else {
                i13 = i14;
            }
            f1.b1 b1Var = (f1.b1) objK2;
            g3.w wVar = (g3.w) b1Var.getValue();
            g3.w wVar2 = new g3.w(new b3.h(str), wVar.f5890b, wVar.f5891c);
            boolean zF = sVar.f(wVar2);
            Object objK3 = sVar.K();
            if (zF || objK3 == obj) {
                objK3 = new a8.f1(6, wVar2, b1Var);
                sVar.h0(objK3);
            }
            f1.b.h((h9.a) objK3, sVar);
            boolean z12 = (i13 & 14) == 4;
            Object objK4 = sVar.K();
            if (z12 || objK4 == obj) {
                objK4 = f1.b.s(str);
                sVar.h0(objK4);
            }
            f1.b1 b1Var2 = (f1.b1) objK4;
            s0Var.getClass();
            int i17 = i13;
            g3.k kVar6 = new g3.k(z11, 0, true, i12, i12, i3.b.f6613c);
            boolean z13 = !z11;
            int i18 = z11 ? 1 : i10;
            int i19 = z11 ? 1 : i7;
            boolean zF2 = sVar.f(b1Var2) | ((i17 & 112) == 32);
            Object objK5 = sVar.K();
            if (zF2 || objK5 == obj) {
                objK5 = new a8.x(kVar, b1Var, b1Var2, 1);
                sVar.h0(objK5);
            }
            int i20 = i15 << 9;
            h9.k kVar7 = kVar5;
            q0.e(wVar2, (h9.k) objK5, pVar, r0Var, l0Var, kVar7, kVar3, n0Var, z13, i19, i18, kVar6, r0Var2, z10, cVar, sVar, (i17 & 896) | ((i17 >> 6) & 7168) | (i20 & 57344) | 196608 | (3670016 & i20) | (i20 & 29360128), (i17 & 57344) | ((i17 >> 15) & 896) | (i17 & 7168) | 196608);
            kVar4 = kVar7;
        } else {
            sVar.Q();
            kVar4 = kVar2;
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new h9.n(str, kVar, pVar, z10, r0Var, s0Var, r0Var2, z11, i7, i10, l0Var, kVar4, kVar3, n0Var, cVar, i11) { // from class: l0.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f7664a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h9.k f7665b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ r1.p f7666c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f7667d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ b3.r0 f7668e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ s0 f7669f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ r0 f7670g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ boolean f7671h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ int f7672i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ int f7673j;
                public final /* synthetic */ b3.l0 k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ h9.k f7674l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ b0.k f7675m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ y1.n0 f7676n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ n1.c f7677o;

                @Override // h9.n
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = f1.b.y(1);
                    j.a(this.f7664a, this.f7665b, this.f7666c, this.f7667d, this.f7668e, this.f7669f, this.f7670g, this.f7671h, this.f7672i, this.f7673j, this.k, this.f7674l, this.f7675m, this.f7676n, this.f7677o, (f1.s) obj2, iY);
                    return t8.z.f12851a;
                }
            };
        }
    }
}
