package c8;

import android.os.Process;
import cc.o1;
import com.baidu.carlife.sdk.util.Logger;
import f1.b1;
import f1.h1;
import java.util.List;
import l8.j0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1.p f2483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f2484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f2485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f2486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f2487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h1 f2488f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p1.p pVar, b1 b1Var, b1 b1Var2, b1 b1Var3, b1 b1Var4, h1 h1Var, y8.c cVar) {
        super(2, cVar);
        this.f2483a = pVar;
        this.f2484b = b1Var;
        this.f2485c = b1Var2;
        this.f2486d = b1Var3;
        this.f2487e = b1Var4;
        this.f2488f = h1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        return new e(this.f2483a, this.f2484b, this.f2485c, this.f2486d, this.f2487e, this.f2488f, cVar);
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        e eVar = (e) create((cc.y) obj, (y8.c) obj2);
        t8.z zVar = t8.z.f12851a;
        eVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        List listJ;
        t8.a.e(obj);
        n nVar = n.f2521a;
        if (((Boolean) this.f2484b.getValue()).booleanValue()) {
            p1.p pVar = this.f2483a;
            pVar.clear();
            try {
                if (((j0) this.f2485c.getValue()).f8197b.c()) {
                    listJ = n3.l.J("logcat", "--pid=" + Process.myPid(), "-v", "time", "-T", "0");
                } else {
                    listJ = n3.l.J("logcat", "-v", "time", "-T", "0");
                }
                n.f2522b.a(listJ, new a8.z(pVar, this.f2486d, this.f2487e, this.f2488f, 1));
            } catch (Exception e7) {
                hc.c cVar = n8.c.f8897a;
                n8.c.j(0, "不支持日志监听");
                Logger.INSTANCE.e("CarLife_Vehicle", e7.getMessage(), e7);
            }
        } else {
            n8.s sVar = n.f2522b;
            o1 o1Var = sVar.f8943b;
            if (o1Var != null) {
                o1Var.a(null);
            }
            sVar.f8943b = null;
        }
        return t8.z.f12851a;
    }
}
