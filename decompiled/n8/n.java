package n8;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import androidx.lifecycle.i0;
import com.baidu.carlife.sdk.util.Logger;
import com.baidu.carlifevehicle.R;
import java.util.LinkedHashMap;
import r2.i1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t8.o f8927a = t8.a.d(new f(1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f8928b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f8929c = new LinkedHashMap();

    public static void a(final int i7, final int i10, final int i11, final int i12, final int i13, final String str, final n1.c cVar) {
        if (!x6.a.i().v(a.b(), true)) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【悬浮模块】悬浮窗权限未开启");
        } else if (!f8929c.containsKey(str)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: n8.j
                @Override // java.lang.Runnable
                public final void run() {
                    i1 i1Var = new i1(a.b());
                    u uVar = new u();
                    i0.h(i1Var, uVar);
                    i1Var.setTag(R.id.view_tree_saved_state_registry_owner, uVar);
                    i1Var.setContent(new n1.c(new m(cVar, 1), 773539085, true));
                    i1Var.setVisibility(i7);
                    t8.o oVar = n.f8927a;
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 552, -3);
                    layoutParams.gravity = 8388659;
                    layoutParams.width = i10;
                    layoutParams.height = i11;
                    layoutParams.x = i12;
                    layoutParams.y = i13;
                    try {
                        ((WindowManager) n.f8927a.getValue()).addView(i1Var, layoutParams);
                    } catch (Exception e7) {
                        Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【悬浮模块】addView失败: ", e7.getMessage()), e7);
                    }
                    LinkedHashMap linkedHashMap = n.f8929c;
                    String str2 = str;
                    linkedHashMap.put(str2, i1Var);
                    n.f8928b.put(str2, layoutParams);
                }
            });
        } else {
            new Handler(Looper.getMainLooper()).post(new l(str, i10, i11, i12, i13));
            c(str);
        }
    }

    public static void b(String str) {
        new Handler(Looper.getMainLooper()).post(new i(1, str));
    }

    public static void c(String str) {
        new Handler(Looper.getMainLooper()).post(new i(0, str));
    }
}
