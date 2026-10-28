package e8;

import android.content.pm.PackageManager;
import b8.n2;
import com.muyetuge.carlifevehicle.activity.MainActivity;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends a9.i implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f4602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(q0 q0Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f4600a = i7;
        this.f4602c = q0Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f4600a) {
            case 0:
                return new p0(this.f4602c, cVar, 0);
            default:
                return new p0(this.f4602c, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        cc.y yVar = (cc.y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f4600a) {
            case 0:
                break;
        }
        return ((p0) create(yVar, cVar)).invokeSuspend(t8.z.f12851a);
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4600a) {
            case 0:
                int i7 = this.f4601b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                try {
                    PackageManager packageManager = n8.a.b().getPackageManager();
                    i9.l.d(packageManager, "getPackageManager(...)");
                    packageManager.getPackageInfo("com.desay.svcarinfo", 0);
                    n2.Companion.getClass();
                    fc.h0 h0Var = n2.f1622h;
                    o0 o0Var = new o0(this.f4602c, 0);
                    this.f4601b = 1;
                    h0Var.l(o0Var, this);
                    return z8.a.f15774a;
                } catch (Exception unused) {
                    return t8.z.f12851a;
                }
            default:
                int i10 = this.f4601b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw ob.a.n(obj);
                }
                t8.a.e(obj);
                try {
                    PackageManager packageManager2 = n8.a.b().getPackageManager();
                    i9.l.d(packageManager2, "getPackageManager(...)");
                    packageManager2.getPackageInfo("com.desay.svcarinfo", 0);
                    fc.h0 h0Var2 = MainActivity.f2913z;
                    o0 o0Var2 = new o0(this.f4602c, 1);
                    this.f4601b = 1;
                    h0Var2.l(o0Var2, this);
                    return z8.a.f15774a;
                } catch (Exception unused2) {
                    return t8.z.f12851a;
                }
        }
    }
}
