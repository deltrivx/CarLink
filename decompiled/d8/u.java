package d8;

import b8.n2;
import cc.y;
import com.baidu.carlife.sdk.util.Logger;
import fc.h0;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f3841b;

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        u uVar = new u(2, cVar);
        uVar.f3841b = obj;
        return uVar;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        ((u) create((y) obj, (y8.c) obj2)).invokeSuspend(z.f12851a);
        return z8.a.f15774a;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f3840a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw ob.a.n(obj);
        }
        t8.a.e(obj);
        y yVar = (y) this.f3841b;
        Logger.INSTANCE.d("CarLife_Vehicle", "【自动任务】自动任务初始化");
        n2.Companion.getClass();
        h0 h0Var = n2.f1622h;
        t tVar = new t(0, yVar);
        this.f3840a = 1;
        h0Var.l(tVar, this);
        return z8.a.f15774a;
    }
}
