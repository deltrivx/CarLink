package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Ld5/b;", "Landroidx/lifecycle/t;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class ProcessLifecycleInitializer implements d5.b {
    @Override // d5.b
    public final List a() {
        return u8.w.f13122a;
    }

    @Override // d5.b
    public final Object b(Context context) {
        i9.l.e(context, "context");
        d5.a aVarC = d5.a.c(context);
        i9.l.d(aVarC, "getInstance(...)");
        if (!aVarC.f3770b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!q.f1066a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            i9.l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new p());
        }
        c0 c0Var = c0.f1015i;
        c0Var.getClass();
        c0Var.f1020e = new Handler();
        c0Var.f1021f.d(n.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        i9.l.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new b0(c0Var));
        return c0Var;
    }
}
