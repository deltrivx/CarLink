package n8;

import android.os.Process;
import cc.b0;
import cc.k0;
import cc.o1;
import cc.q1;
import com.baidu.carlife.sdk.util.Logger;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.c f8942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o1 f8943b;

    public s() {
        jc.e eVar = k0.f2635a;
        jc.d dVar = jc.d.f7117c;
        q1 q1VarB = b0.b();
        dVar.getClass();
        this.f8942a = b0.a(n3.u.G(dVar, q1VarB));
    }

    public final void a(List list, h9.k kVar) {
        if (this.f8943b != null) {
            return;
        }
        List listJ = u3.f.a(a.b(), "android.permission.READ_LOGS") != 0 ? n3.l.J("logcat", a2.f.E(Process.myPid(), "--pid="), "-v", "raw", "-T", "0") : n3.l.J("logcat", "-v", "raw", "-T", "0");
        if (list == null) {
            list = listJ;
        }
        o1 o1VarS = null;
        try {
            o1VarS = b0.s(this.f8942a, null, new r(new ProcessBuilder((List<String>) list).redirectErrorStream(true).start(), kVar, null), 3);
        } catch (IOException e7) {
            Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【日志监听】启动失败: ", e7.getMessage()), e7);
        }
        this.f8943b = o1VarS;
    }
}
