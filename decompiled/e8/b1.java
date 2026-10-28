package e8;

import a8.x1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import b8.g2;
import b8.h2;
import com.baidu.carlife.sdk.util.Logger;
import f1.w1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends BroadcastReceiver implements h2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4490e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4491a = "MediaButton";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4492b = "媒体按键";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f4493c = g2.f1593a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4494d;

    @Override // b8.h2
    public final void a() {
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new a8.c1(this, null, 10));
    }

    @Override // b8.h2
    public final String b() {
        return this.f4492b;
    }

    @Override // b8.h2
    public final void c(boolean z10, h9.a aVar, h9.k kVar, f1.s sVar, int i7) {
        b1 b1Var = this;
        i9.l.e(aVar, "onDismissRequest");
        i9.l.e(kVar, "onConfigured");
        sVar.Y(-1353886759);
        int i10 = i7 | (sVar.g(z10) ? 4 : 2) | (sVar.h(kVar) ? 256 : 128) | (sVar.h(b1Var) ? 2048 : 1024);
        if ((i10 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1849434622);
            Object objK = sVar.K();
            f1.w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = f1.b.s("");
                sVar.h0(objK);
            }
            f1.b1 b1Var2 = (f1.b1) objK;
            Object objC = a2.f.C(sVar, false, 1849434622);
            if (objC == w0Var) {
                objC = new f1.h1(0);
                sVar.h0(objC);
            }
            f1.h1 h1Var = (f1.h1) objC;
            sVar.p(false);
            n1.c cVarE = n1.h.e(-1464338094, new a8.o(aVar, 14), sVar);
            x1 x1Var = new x1(kVar, b1Var, b1Var2, h1Var, 6);
            b1Var = b1Var;
            l8.n.a(z10, null, 0L, false, 0, null, cVarE, null, n1.h.e(2140797712, x1Var, sVar), n1.h.e(-1514193150, new a1(b1Var, b1Var2, h1Var, 1), sVar), sVar, (i10 & 14) | 817889280, 382);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new a8.i(b1Var, z10, aVar, kVar, i7, 21);
        }
    }

    public final synchronized void d() {
        try {
            if (!this.f4494d) {
                u3.f.g(n8.a.b(), this, new IntentFilter("android.intent.action.MEDIA_BUTTON"));
                this.f4494d = true;
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【媒体按键】注册异常: " + e7.getMessage());
        }
    }

    @Override // b8.h2
    public final String getName() {
        return this.f4491a;
    }

    @Override // b8.h2
    public final g2 getType() {
        return this.f4493c;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent = null;
        if (Build.VERSION.SDK_INT >= 33) {
            if (intent != null) {
                keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT", KeyEvent.class);
            }
        } else if (intent != null) {
            keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        }
        if (keyEvent != null) {
            Handler handler = d8.l.f3821a;
            int keyCode = keyEvent.getKeyCode();
            int i7 = 1;
            if (d8.l.b(keyCode, true)) {
                d8.l.c(keyEvent, new d8.g(keyCode, i7));
            }
        }
    }
}
