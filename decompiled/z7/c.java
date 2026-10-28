package z7;

import android.app.Activity;
import android.view.WindowManager;
import cc.y;
import com.baidu.carlife.sdk.util.Logger;
import f1.b1;
import h9.n;
import java.lang.reflect.Field;
import t8.m;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a9.i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f15747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f15748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Activity activity, b1 b1Var, y8.c cVar, int i7) {
        super(2, cVar);
        this.f15746a = i7;
        this.f15747b = activity;
        this.f15748c = b1Var;
    }

    @Override // a9.a
    public final y8.c create(Object obj, y8.c cVar) {
        switch (this.f15746a) {
            case 0:
                return new c(this.f15747b, this.f15748c, cVar, 0);
            default:
                return new c(this.f15747b, this.f15748c, cVar, 1);
        }
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        y8.c cVar = (y8.c) obj2;
        switch (this.f15746a) {
            case 0:
                c cVar2 = (c) create(yVar, cVar);
                z zVar = z.f12851a;
                cVar2.invokeSuspend(zVar);
                return zVar;
            default:
                c cVar3 = (c) create(yVar, cVar);
                z zVar2 = z.f12851a;
                cVar3.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // a9.a
    public final Object invokeSuspend(Object obj) {
        Field declaredField;
        Object objB;
        int i7 = this.f15746a;
        b1 b1Var = this.f15748c;
        Activity activity = this.f15747b;
        z zVar = z.f12851a;
        switch (i7) {
            case 0:
                t8.a.e(obj);
                if (activity != null) {
                    boolean z10 = ((k) b1Var.getValue()).f15773j;
                    WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                    try {
                        declaredField = attributes.getClass().getDeclaredField("splitState");
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused) {
                        declaredField = null;
                    }
                    if (declaredField != null) {
                        try {
                            declaredField.set(attributes, Integer.valueOf(z10 ? 1 : 0));
                            objB = zVar;
                        } catch (Throwable th) {
                            objB = t8.a.b(th);
                        }
                        Throwable thA = m.a(objB);
                        if (thA != null) {
                            Logger.INSTANCE.d("ScreenFeature", ob.a.q("【系统边栏】设置splitState失败: ", thA.getMessage()));
                        }
                    }
                }
                break;
            default:
                t8.a.e(obj);
                if (!((k) b1Var.getValue()).f15772i) {
                    if (activity != null) {
                        l.b(activity, (k) b1Var.getValue());
                    }
                } else if (activity != null) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(2062);
                }
                break;
        }
        return zVar;
    }
}
