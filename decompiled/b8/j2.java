package b8;

import com.baidu.carlife.sdk.util.Logger;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {
    public static List a() {
        t8.o oVar = n8.d.f8898a;
        String strD = n8.d.d("TASKER_SEQUENCE", "");
        if (strD.length() == 0) {
            return n2.f1621g;
        }
        try {
            qc.b bVar = qc.b.f11032d;
            bVar.getClass();
            return (List) bVar.a(new pc.c(n2.Companion.serializer()), strD);
        } catch (Exception unused) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【任务配置】解析失败，恢复默认配置");
            t8.o oVar2 = n8.d.f8898a;
            n8.d.h("TASKER_SEQUENCE");
            return n2.f1621g;
        }
    }

    public final mc.a serializer() {
        return i2.f1599a;
    }
}
