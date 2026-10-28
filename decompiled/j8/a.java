package j8;

import a9.i;
import cc.b0;
import cc.y;
import com.baidu.carlife.sdk.util.Logger;
import d8.v;
import h9.n;
import t8.z;
import y8.c;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6963a;

    @Override // a9.a
    public final c create(Object obj, c cVar) {
        return new a(2, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((y) obj, (c) obj2)).invokeSuspend(z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f6963a;
        if (i7 == 0) {
            t8.a.e(obj);
            this.f6963a = 1;
            Object objH = b0.h(1000L, this);
            z8.a aVar = z8.a.f15774a;
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t8.a.e(obj);
        }
        hc.c cVar = v.f3842a;
        v.a(new b8.y());
        Logger.INSTANCE.d("CarLife_Vehicle", "【系统启动】系统启动消息已发送");
        return z.f12851a;
    }
}
