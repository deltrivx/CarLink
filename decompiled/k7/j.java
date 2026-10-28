package k7;

import cc.y;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.util.Logger;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a9.i implements h9.n {
    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new j(2, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((y) obj, (y8.c) obj2);
        z zVar = z.f12851a;
        jVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        t8.a.e(obj);
        n.f7380g = n.c();
        Logger.INSTANCE.d(Constants.TAG, "【音频测试】测试文件已准备好");
        return z.f12851a;
    }
}
