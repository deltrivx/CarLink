package q0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements h9.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10530b;

    public /* synthetic */ a(f fVar, int i7) {
        this.f10529a = i7;
        this.f10530b = fVar;
    }

    @Override // h9.k
    public final Object invoke(Object obj) {
        switch (this.f10529a) {
            case 0:
                h9.a aVar = (h9.a) obj;
                View view = this.f10530b.f10542a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new com.baidu.carlife.sdk.internal.a(aVar, 2));
                    }
                }
                return z.f12851a;
            case 1:
                ActionMode actionMode = this.f10530b.f10549h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return z.f12851a;
            case 2:
                ActionMode actionMode2 = this.f10530b.f10549h;
                if (actionMode2 != null && Build.VERSION.SDK_INT >= 23) {
                    actionMode2.invalidateContentRect();
                }
                return z.f12851a;
            default:
                f fVar = this.f10530b;
                fVar.f10546e.d();
                return new e8.p(7, fVar);
        }
    }
}
