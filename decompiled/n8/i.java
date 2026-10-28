package n8;

import android.view.WindowManager;
import com.baidu.carlife.sdk.util.Logger;
import java.util.LinkedHashMap;
import r2.i1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8911b;

    public /* synthetic */ i(int i7, String str) {
        this.f8910a = i7;
        this.f8911b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.f8910a;
        String str = this.f8911b;
        switch (i7) {
            case 0:
                i1 i1Var = (i1) n.f8929c.get(str);
                if (i1Var != null) {
                    i1Var.setVisibility(0);
                }
                break;
            default:
                LinkedHashMap linkedHashMap = n.f8929c;
                i1 i1Var2 = (i1) linkedHashMap.get(str);
                if (i1Var2 != null) {
                    try {
                        ((WindowManager) n.f8927a.getValue()).removeView(i1Var2);
                    } catch (Exception e7) {
                        Logger.INSTANCE.e("CarLife_Vehicle", a2.f.G("【悬浮模块】removeView失败: ", e7.getMessage(), " "), e7);
                    }
                    linkedHashMap.remove(str);
                    n.f8928b.remove(str);
                }
                break;
        }
    }
}
