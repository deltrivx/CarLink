package w0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.muyetuge.carlifevehicle.application.MainApplication;
import com.muyetuge.carlifevehicle.service.AccessService;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e1 implements h9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13778a;

    public /* synthetic */ e1(int i7) {
        this.f13778a = i7;
    }

    @Override // h9.a
    public final Object invoke() {
        int i7 = this.f13778a;
        t8.z zVar = t8.z.f12851a;
        switch (i7) {
            case 0:
                f1.c0 c0Var = f1.f13786a;
                return null;
            case 1:
                return z1.f14025b;
            case 2:
                hc.c cVar = n8.c.f8897a;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + n8.a.b().getPackageName()));
                    intent.setFlags(268435456);
                    n8.a.b().startActivity(intent);
                    break;
                } catch (Exception e7) {
                    n8.c.j(0, "打开应用详情失败: " + e7.getMessage());
                }
                return zVar;
            case 3:
                hc.c cVar2 = n8.c.f8897a;
                n8.c.g();
                return zVar;
            case 4:
                hc.c cVar3 = n8.c.f8897a;
                n8.c.a();
                throw null;
            case 5:
                fc.h0 h0Var = AccessService.f2915d;
                try {
                    Intent intent2 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                    intent2.setFlags(268435456);
                    ((Context) AccessService.f2916e.getValue()).startActivity(intent2);
                    hc.c cVar4 = n8.c.f8897a;
                    n8.c.j(1, "点击 " + n8.a.a() + " 开启无障碍服务权限");
                    break;
                } catch (Exception e10) {
                    hc.c cVar5 = n8.c.f8897a;
                    n8.c.j(0, "打开应用详情失败: " + e10.getMessage());
                }
                return zVar;
            case 6:
                MainApplication mainApplication = MainApplication.f2914a;
                return i2.c.A();
            case 7:
                f1.c0 c0Var2 = androidx.compose.foundation.c.f779a;
                return x.z.f14514a;
            case 8:
                return new x.b1();
            case 9:
                return new x.o1(0);
            case 10:
                hc.c cVar6 = n8.c.f8897a;
                n8.c.i();
                return zVar;
            case 11:
                float f10 = z.y.f15597a;
                return zVar;
            default:
                float f11 = z.y.f15597a;
                return Boolean.TRUE;
        }
    }
}
