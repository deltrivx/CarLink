package e8;

import cc.o1;
import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n8.s f4629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1.b1 f4632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(boolean z10, n8.s sVar, f1.b1 b1Var, f1.b1 b1Var2, f1.b1 b1Var3, y8.c cVar) {
        super(2, cVar);
        this.f4628a = z10;
        this.f4629b = sVar;
        this.f4630c = b1Var;
        this.f4631d = b1Var2;
        this.f4632e = b1Var3;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new u0(this.f4628a, this.f4629b, this.f4630c, this.f4631d, this.f4632e, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        u0 u0Var = (u0) create((cc.y) obj, (y8.c) obj2);
        t8.z zVar = t8.z.f12851a;
        u0Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        t8.a.e(obj);
        boolean z10 = this.f4628a;
        n8.s sVar = this.f4629b;
        if (z10) {
            try {
                sVar.a(null, new l(2, this.f4630c, this.f4631d, this.f4632e));
            } catch (Exception e7) {
                hc.c cVar = n8.c.f8897a;
                n8.c.j(0, "不支持日志监听");
                Logger.INSTANCE.e("CarLife_Vehicle", e7.getMessage(), e7);
            }
        } else {
            o1 o1Var = sVar.f8943b;
            if (o1Var != null) {
                o1Var.a(null);
            }
            sVar.f8943b = null;
        }
        return t8.z.f12851a;
    }
}
