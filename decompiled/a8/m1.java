package a8;

import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f177a = new m1();

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        b8.c2 c2Var = (b8.c2) obj;
        if (c2Var instanceof b8.d1) {
            Logger.INSTANCE.d("CarLife_Vehicle", "【按键消息】" + c2Var);
            int i7 = ((b8.d1) c2Var).f1575b;
            b8.f2.f1583c.getClass();
            b8.e2.a(i7);
        }
        return t8.z.f12851a;
    }
}
