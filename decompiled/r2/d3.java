package r2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.baidu.carlifevehicle.R;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f11215a = new LinkedHashMap();

    public static final fc.f0 a(Context context) {
        fc.f0 f0Var;
        LinkedHashMap linkedHashMap = f11215a;
        synchronized (linkedHashMap) {
            try {
                Object objG = linkedHashMap.get(context);
                if (objG == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    ec.h hVarC = i2.c.c(-1, 6, null);
                    a2.d dVar = new a2.d(new f1.u2(contentResolver, uriFor, new c3(hVarC, o9.e0.q(Looper.getMainLooper())), hVarC, context, null));
                    cc.q1 q1VarB = cc.b0.b();
                    jc.e eVar = cc.k0.f2635a;
                    objG = fc.y.g(dVar, new hc.c(n3.u.G(q1VarB, hc.m.f6531a)), new fc.e0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objG);
                }
                f0Var = (fc.f0) objG;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f0Var;
    }

    public static final f1.v b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof f1.v) {
            return (f1.v) tag;
        }
        return null;
    }
}
