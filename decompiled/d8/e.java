package d8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.lifecycle.z;
import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3797a;

    public e(f fVar) {
        this.f3797a = fVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.f3797a.f3800b = null;
        Logger.INSTANCE.d("TaskerDesaySV", "服务绑定失效 (onBindingDied)");
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        f fVar = this.f3797a;
        fVar.f3800b = null;
        fVar.f3802d.set(false);
        Logger.INSTANCE.e("TaskerDesaySV", "服务返回 Null 绑定");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final f fVar = this.f3797a;
        i9.l.e(componentName, "name");
        i9.l.e(iBinder, "binder");
        int i7 = 1;
        try {
            fVar.f3800b = l5.b.U(iBinder);
            Logger.Companion companion = Logger.INSTANCE;
            companion.d("TaskerDesaySV", "服务已连接");
            iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: d8.d
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    Logger.INSTANCE.e("TaskerDesaySV", "远程服务进程已死亡 (DeathRecipient)");
                    f fVar2 = fVar;
                    fVar2.f3799a.post(new z(6, fVar2));
                }
            }, 0);
            int iD0 = u8.l.D0(f.f3798g, 254);
            if (iD0 < 0) {
                iD0 = 0;
            }
            int[] iArr = {1};
            l5.c cVar = fVar.f3800b;
            if (cVar != null) {
                ((l5.a) cVar).V(iD0, fVar.f3804f, iArr);
            }
            companion.d("TaskerDesaySV", "大灯监听已注册");
            fVar.f3799a.post(new b(fVar, fVar.c(), i7));
        } catch (RemoteException e7) {
            Logger.INSTANCE.e("TaskerDesaySV", "注册监听失败 / 链接死亡", e7);
        } catch (Exception e10) {
            Logger.INSTANCE.e("TaskerDesaySV", "onServiceConnected 未知异常", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i9.l.e(componentName, "name");
        this.f3797a.f3800b = null;
        Logger.INSTANCE.d("TaskerDesaySV", "服务意外断开 (onServiceDisconnected)");
    }
}
