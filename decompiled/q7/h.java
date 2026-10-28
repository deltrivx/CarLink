package q7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.carlife.sdk.util.Logger;
import f1.b1;
import f1.n;
import f1.s;
import f1.w1;
import i9.l;
import l8.y;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h extends BroadcastReceiver implements t7.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10976e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10977a = "App";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10978b = "悬浮应用";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10979c = "支持桌面悬浮应用";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10980d;

    @Override // t7.g
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        y8.c cVar2 = null;
        n8.c.d(new e(this, cVar2, 0));
        n8.c.d(new e(this, cVar2, 1));
    }

    @Override // t7.g
    public final String b() {
        return this.f10978b;
    }

    @Override // t7.g
    public final void c(int i7, s sVar) {
        sVar.W(62540749);
        sVar.p(false);
    }

    @Override // t7.g
    public final void d(boolean z10, h9.a aVar, s sVar, int i7) {
        l.e(aVar, "onDismissRequest");
        sVar.Y(758251715);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2);
        if ((i10 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            b1 b1VarK = f1.b.k(i.f10982g, sVar);
            sVar.W(5004770);
            Object objK = sVar.K();
            if (objK == n.f5051a) {
                objK = new y(aVar, 5);
                sVar.h0(objK);
            }
            sVar.p(false);
            l8.n.a(z10, (h9.a) objK, 0L, false, 0, null, null, null, null, n1.h.e(370911660, new g8.h(b1VarK, 9), sVar), sVar, i10 & 14, 1020);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new c(this, z10, aVar, i7, 0);
        }
    }

    @Override // t7.g
    public final String e() {
        return this.f10979c;
    }

    public final synchronized void f() {
        try {
            if (this.f10980d) {
                n8.a.b().unregisterReceiver(this);
                this.f10980d = false;
                n8.n.b("FLOAT_APP_SWITCH");
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【悬浮广播】注销异常: " + e7.getMessage(), e7);
        }
    }

    @Override // t7.g
    public final String getName() {
        return this.f10977a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l.e(context, "context");
        l.e(intent, "intent");
        Logger.INSTANCE.d("CarLife_Vehicle", ob.a.q("【悬浮广播】", intent.getAction()));
        if (!l.a(intent.getAction(), "com.autonavi.plus.showmap")) {
            if (l.a(intent.getAction(), "com.autonavi.plus.closemap")) {
                n8.n.b("FLOAT_APP_SWITCH");
            }
        } else {
            int intExtra = intent.getIntExtra("w", 0);
            int intExtra2 = intent.getIntExtra("h", 0);
            int intExtra3 = intent.getIntExtra("x", 0);
            int intExtra4 = intent.getIntExtra("y", 0);
            o oVar = n8.n.f8927a;
            n8.n.a(0, (intExtra - intExtra3) - 2, (intExtra2 - intExtra4) - 1, intExtra3, intExtra4, "FLOAT_APP_SWITCH", b.f10958a);
        }
    }
}
