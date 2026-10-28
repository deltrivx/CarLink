package k8;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.baidu.carlife.sdk.util.Logger;
import com.muyetuge.carlifevehicle.service.BaseService;
import e4.k;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a() {
        Intent intent = new Intent(n8.a.b(), (Class<?>) BaseService.class);
        try {
            if (!BaseService.f2920a.v(n8.a.b(), true)) {
                n8.a.b().startService(intent);
                return;
            }
            Context contextB = n8.a.b();
            if (Build.VERSION.SDK_INT >= 26) {
                k.n(contextB, intent);
            } else {
                contextB.startService(intent);
            }
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", ob.a.q("【前台服务】服务启动失败: ", e7.getMessage()), e7);
        }
    }
}
