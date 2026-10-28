package n8;

import android.widget.Toast;
import com.baidu.carlife.sdk.util.Logger;
import java.util.function.IntConsumer;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8896c;

    public /* synthetic */ b(int i7, int i10, Object obj) {
        this.f8894a = i10;
        this.f8896c = obj;
        this.f8895b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objB;
        int i7 = this.f8894a;
        int i10 = this.f8895b;
        Object obj = this.f8896c;
        switch (i7) {
            case 0:
                try {
                    Toast.makeText(a.b(), (String) obj, i10).show();
                    objB = z.f12851a;
                } catch (Throwable th) {
                    objB = t8.a.b(th);
                }
                Throwable thA = t8.m.a(objB);
                if (thA != null) {
                    Logger.INSTANCE.e("CommonUtils", ob.a.q("Toast 显示失败: ", thA.getMessage()));
                }
                break;
            default:
                ((IntConsumer) obj).accept(i10);
                break;
        }
    }
}
