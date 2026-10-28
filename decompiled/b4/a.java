package b4;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import cc.b0;
import cc.u;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.anr.TraceFileHelper;
import com.tencent.bugly.proguard.ai;
import com.tencent.bugly.proguard.al;
import com.tencent.bugly.proguard.aq;
import com.tencent.bugly.proguard.ay;
import com.tencent.bugly.proguard.l0;
import com.tencent.bugly.proguard.s;
import java.lang.reflect.Method;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1471c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f1469a = i7;
        this.f1470b = obj;
        this.f1471c = obj2;
    }

    public /* synthetic */ a(int i7, Object obj, Object obj2, boolean z10) {
        this.f1469a = i7;
        this.f1471c = obj;
        this.f1470b = obj2;
    }

    private final void a() {
        try {
            al.a(aq.f3163d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
            synchronized (((aq) this.f1470b)) {
                ((aq) this.f1471c).f3165b.registerReceiver(aq.f3163d, ((aq) this.f1471c).f3164a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        switch (this.f1469a) {
            case 0:
                wb.b bVar = (wb.b) this.f1470b;
                Typeface typeface = (Typeface) this.f1471c;
                d3.e eVar = (d3.e) bVar.f14284a;
                if (eVar != null) {
                    eVar.v(typeface);
                    return;
                }
                return;
            case 1:
                ((i) this.f1470b).accept(this.f1471c);
                return;
            case 2:
                ((Runnable) this.f1470b).run();
                synchronized (((ai) this.f1471c).f3114j) {
                    ai.b((ai) this.f1471c);
                    break;
                }
                return;
            case 3:
                a();
                return;
            case 4:
                ay ayVar = ((l0) this.f1471c).f3451b;
                String str = (String) this.f1470b;
                if (ayVar.a(true)) {
                    try {
                        al.c("read trace first dump for create time!", new Object[0]);
                        TraceFileHelper.a firstDumpInfo = TraceFileHelper.readFirstDumpInfo(str, false);
                        long jCurrentTimeMillis = firstDumpInfo != null ? firstDumpInfo.f3022c : -1L;
                        if (jCurrentTimeMillis == -1) {
                            al.d("trace dump fail could not get time!", new Object[0]);
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        if (ayVar.a(jCurrentTimeMillis)) {
                            return;
                        }
                        ayVar.a(jCurrentTimeMillis, str);
                        return;
                    } catch (Throwable th) {
                        if (!al.a(th)) {
                            th.printStackTrace();
                        }
                        al.e("handle anr error %s", th.getClass().toString());
                        return;
                    }
                }
                return;
            case 5:
                s.c((Context) this.f1470b, (BuglyStrategy) this.f1471c);
                return;
            case 6:
                ((cc.l) this.f1470b).y((dc.d) this.f1471c);
                return;
            case 7:
                hc.g gVar = (hc.g) this.f1471c;
                u uVar = gVar.f6514d;
                while (true) {
                    try {
                        ((Runnable) this.f1470b).run();
                    } catch (Throwable th2) {
                        b0.o(th2, y8.i.f15108a);
                    }
                    Runnable runnableX = gVar.x();
                    if (runnableX == null) {
                        return;
                    }
                    this.f1470b = runnableX;
                    i7++;
                    if (i7 >= 16 && uVar.v(gVar)) {
                        uVar.g(gVar, this);
                        return;
                    }
                    break;
                }
                break;
            case 8:
                ((kc.e) ((kc.f) this.f1470b)).g((kc.b) this.f1471c, z.f12851a);
                return;
            case 9:
                ((u3.d) this.f1470b).f13043a = this.f1471c;
                return;
            case 10:
                ((Application) this.f1470b).unregisterActivityLifecycleCallbacks((u3.d) this.f1471c);
                return;
            default:
                Object obj = this.f1471c;
                Object obj2 = this.f1470b;
                try {
                    Method method = u3.e.f13052d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        u3.e.f13053e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e7) {
                    if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                        throw e7;
                    }
                    return;
                } catch (Throwable th3) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
                    return;
                }
        }
    }
}
