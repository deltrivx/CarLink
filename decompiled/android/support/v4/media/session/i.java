package android.support.v4.media.session;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f582a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f583b;

    public /* synthetic */ i() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Looper looper) {
        super(looper);
        this.f583b = kVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        m mVar;
        k kVar;
        i iVar;
        switch (this.f582a) {
            case 0:
                if (message.what == 1) {
                    synchronized (((k) this.f583b).f585a) {
                        mVar = (m) ((k) this.f583b).f588d.get();
                        kVar = (k) this.f583b;
                        iVar = kVar.f589e;
                        break;
                    }
                    if (mVar == null || kVar != mVar.b() || iVar == null) {
                        return;
                    }
                    mVar.f((x4.a) message.obj);
                    ((k) this.f583b).a(mVar, iVar);
                    mVar.f(null);
                    return;
                }
                return;
            default:
                int i7 = message.what;
                if (i7 == -3 || i7 == -2 || i7 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f583b).get(), message.what);
                    return;
                } else {
                    if (i7 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
        }
    }
}
