package n8;

import android.net.wifi.WifiManager;
import android.view.WindowManager;
import cc.k0;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.muyetuge.carlifevehicle.activity.MainActivity;
import f1.c0;
import f1.x2;
import fc.h0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import pc.m0;
import pc.o0;
import t8.z;
import w0.d1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8899a;

    public /* synthetic */ f(int i7) {
        this.f8899a = i7;
    }

    public /* synthetic */ f(o0 o0Var) {
        this.f8899a = 11;
    }

    @Override // h9.a
    public final Object invoke() {
        Object value;
        v7.g gVar;
        Object value2;
        v7.g gVar2;
        Object value3;
        v7.g gVar3;
        Object value4;
        v7.g gVar4;
        int i7 = this.f8899a;
        z zVar = z.f12851a;
        switch (i7) {
            case 0:
                t8.o oVar = h.f8903a;
                return Integer.valueOf(h.b().densityDpi);
            case 1:
                Object systemService = a.b().getSystemService("window");
                i9.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                return (WindowManager) systemService;
            case 2:
                Object systemService2 = a.b().getSystemService("wifi");
                if (systemService2 instanceof WifiManager) {
                    return (WifiManager) systemService2;
                }
                return null;
            case 3:
                return new o1.d(new LinkedHashMap());
            case 4:
                x2 x2Var = o1.h.f9281a;
                return null;
            case 5:
                hc.c cVar = c.f8897a;
                c.a();
                throw null;
            case 6:
                hc.c cVar2 = c.f8897a;
                c.i();
                return zVar;
            case 7:
                h0 h0Var = v7.g.f13646c;
                h0 h0Var2 = v7.g.f13646c;
                do {
                    value = h0Var2.getValue();
                    gVar = (v7.g) value;
                    i9.l.e(gVar, "$this$update");
                } while (!h0Var2.f(value, v7.g.a(gVar, true)));
                return zVar;
            case 8:
                hc.c cVar3 = c.f8897a;
                c.f();
                return zVar;
            case 9:
                h0 h0Var3 = v7.g.f13646c;
                h0 h0Var4 = v7.g.f13646c;
                do {
                    value2 = h0Var4.getValue();
                    gVar2 = (v7.g) value2;
                    i9.l.e(gVar2, "$this$update");
                } while (!h0Var4.f(value2, v7.g.a(gVar2, true)));
                return zVar;
            case 10:
                hc.c cVar4 = c.f8897a;
                c.a();
                throw null;
            case 11:
                return m0.b(new ArrayList(0));
            case 12:
                x2 x2Var2 = q1.d.f10581a;
                return null;
            case 13:
                x2 x2Var3 = q1.f.f10583a;
                return null;
            case 14:
                n.b("FLOAT_APP_SWITCH");
                return zVar;
            case 15:
                return qc.z.f11059b;
            case 16:
                return qc.s.f11051b;
            case 17:
                return qc.p.f11049b;
            case 18:
                return qc.w.f11057b;
            case 19:
                return qc.f.f11041b;
            case 20:
                h0 h0Var5 = v7.g.f13646c;
                h0 h0Var6 = v7.g.f13646c;
                do {
                    value3 = h0Var6.getValue();
                    gVar3 = (v7.g) value3;
                    i9.l.e(gVar3, "$this$update");
                } while (!h0Var6.f(value3, v7.g.a(gVar3, true)));
                return zVar;
            case 21:
                hc.c cVar5 = c.f8897a;
                c.f();
                n.b("FLOAT_APP_SWITCH");
                return zVar;
            case 22:
                c0 c0Var = s0.g.f12534a;
                return null;
            case 23:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 24:
                hc.c cVar6 = c.f8897a;
                c.g();
                return zVar;
            case 25:
                MainActivity mainActivity = MainActivity.f2912y;
                a.a.N();
                return zVar;
            case ServiceTypes.KEYCODE_MOVE_UP_RIGHT /* 26 */:
                p1.u uVar = new p1.u(new u7.d(4));
                uVar.d();
                return uVar;
            case ServiceTypes.KEYCODE_MOVE_DOWN_LEFT /* 27 */:
                h0 h0Var7 = v7.g.f13646c;
                h0 h0Var8 = v7.g.f13646c;
                do {
                    value4 = h0Var8.getValue();
                    gVar4 = (v7.g) value4;
                    i9.l.e(gVar4, "$this$update");
                } while (!h0Var8.f(value4, v7.g.a(gVar4, false)));
                return zVar;
            case ServiceTypes.KEYCODE_MOVE_DOWN_RIGHT /* 28 */:
                jc.e eVar = k0.f2635a;
                return jc.d.f7117c;
            default:
                return new d1(1L);
        }
    }
}
