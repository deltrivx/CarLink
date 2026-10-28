package ra;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends xa.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11800a;

    public /* synthetic */ a(int i7) {
        this.f11800a = i7;
    }

    @Override // xa.v
    public final Object a(xa.e eVar, xa.g gVar) {
        switch (this.f11800a) {
            case 0:
                return new h(eVar, gVar);
            case 1:
                return new f(eVar, gVar);
            case 2:
                return new e(eVar, gVar);
            case 3:
                return new k(eVar, gVar);
            case 4:
                return new l(eVar);
            case 5:
                return new n(eVar, gVar);
            case 6:
                return new p(eVar, gVar);
            case 7:
                return new t(eVar, gVar);
            case 8:
                return new v(eVar, gVar);
            case 9:
                return new y(eVar, gVar);
            case 10:
                return new a0(eVar, gVar);
            case 11:
                return new e0(eVar, gVar);
            case 12:
                return new g0(eVar, gVar);
            case 13:
                return new i0(eVar, gVar);
            case 14:
                return new m0(eVar, gVar);
            case 15:
                return new l0(eVar);
            case 16:
                return new n0(eVar);
            case 17:
                return new s0(eVar, gVar);
            case 18:
                return new q0(eVar, gVar);
            case 19:
                return new u0(eVar, gVar);
            case 20:
                return new x0(eVar, gVar);
            case 21:
                return new y0(eVar, gVar);
            case 22:
                return new a1(eVar, gVar);
            case 23:
                return new e1(eVar);
            case 24:
                return new f1(eVar, gVar);
            case 25:
                return new ua.b(eVar);
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                return new ua.c(eVar);
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                return new ua.e(eVar, gVar);
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                return new ua.j(eVar, gVar);
            default:
                return new ua.i(eVar);
        }
    }
}
