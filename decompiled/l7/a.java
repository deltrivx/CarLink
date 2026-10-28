package l7;

import cc.o1;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.util.Logger;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8077a;

    public a(b bVar) {
        this.f8077a = bVar;
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b bVar = this.f8077a;
        if (CarLife.receiver().isConnected()) {
            if (zBooleanValue) {
                bVar.f8078a.a();
                Logger.INSTANCE.d(Constants.TAG, "【录音模块】应用前台开始录音");
            } else {
                e eVar = bVar.f8078a;
                eVar.f8088e = false;
                o1 o1Var = eVar.f8087d;
                if (o1Var != null) {
                    o1Var.a(null);
                }
                eVar.f8087d = null;
                Logger.INSTANCE.d(Constants.TAG, "【录音模块】应用后台停止录音");
            }
        }
        return z.f12851a;
    }
}
