package d8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.baidu.carlife.sdk.util.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f3798g = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 18, 251, 252, 253, 254, 255, 256, 257};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l5.c f3800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile a f3801c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3799a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3802d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f3803e = new e(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f3804f = new c(this);

    public final void a() {
        AtomicBoolean atomicBoolean = this.f3802d;
        if (atomicBoolean.get()) {
            Logger.INSTANCE.w("TaskerDesaySV", "服务已在连接或绑定中，跳过");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.desay.svcarinfo", "com.desay.svcarinfo.CarInfoService"));
            boolean zBindService = n8.a.b().bindService(intent, this.f3803e, 1);
            atomicBoolean.set(zBindService);
            if (zBindService) {
                return;
            }
            Logger.INSTANCE.e("TaskerDesaySV", "绑定服务失败: bindService returned false");
        } catch (SecurityException e7) {
            Logger.INSTANCE.e("TaskerDesaySV", "绑定服务失败: 权限不足", e7);
            atomicBoolean.set(false);
        } catch (Exception e10) {
            Logger.INSTANCE.e("TaskerDesaySV", "绑定服务发生未知异常", e10);
            atomicBoolean.set(false);
        }
    }

    public final void b() {
        if (this.f3802d.compareAndSet(true, false)) {
            try {
                d();
                n8.a.b().unbindService(this.f3803e);
                Logger.INSTANCE.d("TaskerDesaySV", "解绑服务成功");
            } catch (IllegalArgumentException unused) {
                Logger.INSTANCE.w("TaskerDesaySV", "解绑失败: 服务未注册或已解绑");
            } catch (Exception e7) {
                Logger.INSTANCE.e("TaskerDesaySV", "解绑过程发生异常", e7);
            } finally {
                this.f3800b = null;
            }
        }
    }

    public final boolean c() {
        l5.c cVar = this.f3800b;
        if (cVar == null || !((l5.a) cVar).f8058b.isBinderAlive()) {
            Logger.INSTANCE.w("TaskerDesaySV", "服务未连接或已由于远程进程死亡断开");
            return false;
        }
        try {
            int iD0 = u8.l.D0(f3798g, 254);
            if (iD0 < 0) {
                iD0 = 0;
            }
            int[] iArrU = ((l5.a) cVar).U(iD0);
            return (iArrU == null || iArrU.length == 0 || iArrU[0] != 1) ? false : true;
        } catch (RemoteException e7) {
            Logger.INSTANCE.e("TaskerDesaySV", "远程调用失败: 获取大灯状态", e7);
        } catch (Exception e10) {
            Logger.INSTANCE.e("TaskerDesaySV", "未知异常: 获取大灯状态", e10);
        }
    }

    public final void d() {
        try {
            l5.c cVar = this.f3800b;
            if (cVar == null || !((l5.a) cVar).f8058b.isBinderAlive()) {
                return;
            }
            int iD0 = u8.l.D0(f3798g, 254);
            if (iD0 < 0) {
                iD0 = 0;
            }
            l5.c cVar2 = this.f3800b;
            if (cVar2 != null) {
                ((l5.a) cVar2).W(iD0, this.f3804f);
            }
        } catch (RemoteException unused) {
        } catch (Exception e7) {
            Logger.INSTANCE.e("TaskerDesaySV", "注销回调失败", e7);
        }
    }
}
