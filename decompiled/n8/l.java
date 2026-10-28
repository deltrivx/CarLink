package n8;

import android.view.View;
import android.view.WindowManager;
import com.baidu.carlife.sdk.util.Logger;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8924e;

    public /* synthetic */ l(String str, int i7, int i10, int i11, int i12) {
        this.f8920a = str;
        this.f8921b = i7;
        this.f8922c = i10;
        this.f8923d = i11;
        this.f8924e = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinkedHashMap linkedHashMap = n.f8928b;
        String str = this.f8920a;
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) linkedHashMap.get(str);
        if (layoutParams == null) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【悬浮模块】updateFloatView找不到layoutParams key=".concat(str));
            return;
        }
        layoutParams.width = this.f8921b;
        layoutParams.height = this.f8922c;
        layoutParams.x = this.f8923d;
        layoutParams.y = this.f8924e;
        ((WindowManager) n.f8927a.getValue()).updateViewLayout((View) n.f8929c.get(str), layoutParams);
    }
}
