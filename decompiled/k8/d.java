package k8;

import android.content.Intent;
import com.baidu.carlife.sdk.util.Logger;
import com.muyetuge.carlifevehicle.service.MainService;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a() {
        try {
            n8.a.b().startService(new Intent(n8.a.b(), (Class<?>) MainService.class));
        } catch (Exception e7) {
            Logger.INSTANCE.d("CarLife_Vehicle", ob.a.q("【连接服务】服务启动失败: ", e7.getMessage()), e7);
        }
    }
}
