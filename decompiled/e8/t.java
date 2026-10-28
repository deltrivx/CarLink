package e8;

import android.content.Intent;
import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class t implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f4623a = new t();

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        if (((Boolean) obj).booleanValue()) {
            Intent intent = new Intent("AUTONAVI_STANDARD_BROADCAST_SEND");
            intent.setFlags(32);
            intent.putExtra("KEY_TYPE", 10016);
            try {
                n8.a.b().sendBroadcast(intent);
            } catch (Exception e7) {
                Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【高德广播】发送异常: ", e7.getMessage()), e7);
            }
        }
        return t8.z.f12851a;
    }
}
