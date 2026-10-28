package n8;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.i0;
import com.baidu.carlife.sdk.util.Logger;
import com.baidu.carlifevehicle.R;
import r2.i1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Display f8949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceView f8950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowManager.LayoutParams f8951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h9.n f8952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowManager f8953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f8954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f8955g;

    public w(Display display, SurfaceView surfaceView, WindowManager.LayoutParams layoutParams, n1.c cVar, int i7) {
        surfaceView = (i7 & 2) != 0 ? null : surfaceView;
        cVar = (i7 & 8) != 0 ? null : cVar;
        i9.l.e(display, "display");
        this.f8949a = display;
        this.f8950b = surfaceView;
        this.f8951c = layoutParams;
        this.f8952d = cVar;
        try {
            Context contextCreateDisplayContext = a.b().createDisplayContext(display);
            this.f8954f = contextCreateDisplayContext;
            i9.l.b(contextCreateDisplayContext);
            Object systemService = contextCreateDisplayContext.getSystemService("window");
            i9.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f8953e = (WindowManager) systemService;
            Logger.INSTANCE.d("CarLife_Vehicle", "【副屏悬浮】DisplayContext & WindowManager 创建成功");
        } catch (Exception e7) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【副屏悬浮】创建 DisplayContext 或 WindowManager 失败", e7);
        }
    }

    public final void a() {
        View view = this.f8955g;
        if (view != null) {
            try {
                try {
                    WindowManager windowManager = this.f8953e;
                    if (windowManager != null) {
                        windowManager.removeView(view);
                    }
                    Logger.INSTANCE.d("CarLife_Vehicle", "【副屏悬浮】View 已从副屏移除");
                } catch (Exception e7) {
                    Logger.INSTANCE.e("CarLife_Vehicle", "【副屏悬浮】移除 View 失败", e7);
                }
            } finally {
                this.f8955g = null;
            }
        }
    }

    public final void b() {
        Context context;
        View view;
        int i7 = 1;
        WindowManager windowManager = this.f8953e;
        if (windowManager == null || (context = this.f8954f) == null) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【副屏悬浮】WindowManager 或 displayContext 未初始化，无法显示");
            return;
        }
        if (this.f8955g != null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, Build.VERSION.SDK_INT >= 26 ? 2038 : 2003, 776, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        layoutParams.y = 0;
        WindowManager.LayoutParams layoutParams2 = this.f8951c;
        layoutParams.width = layoutParams2.width;
        layoutParams.height = layoutParams2.height;
        layoutParams.x = layoutParams2.x;
        layoutParams.y = layoutParams2.y;
        try {
            if (this.f8952d != null) {
                i1 i1Var = new i1(context);
                u uVar = new u();
                i0.h(i1Var, uVar);
                i1Var.setTag(R.id.view_tree_saved_state_registry_owner, uVar);
                i1Var.setContent(new n1.c(new v(this, i7), 1572359561, true));
                view = i1Var;
            } else {
                View view2 = this.f8950b;
                view = view2 != null ? view2 : null;
            }
            this.f8955g = view;
            if (view != null) {
                windowManager.addView(view, layoutParams);
                Logger.INSTANCE.d("CarLife_Vehicle", "【副屏悬浮】View 已成功添加到副屏 displayId=" + this.f8949a.getDisplayId());
            }
        } catch (Exception e7) {
            Logger.INSTANCE.e("CarLife_Vehicle", "【副屏悬浮】添加 View 到副屏失败", e7);
        }
    }
}
