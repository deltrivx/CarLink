package q7;

import android.content.IntentFilter;
import com.baidu.carlife.sdk.util.Logger;
import n8.n;
import t8.o;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements fc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f10964b;

    public /* synthetic */ d(h hVar, int i7) {
        this.f10963a = i7;
        this.f10964b = hVar;
    }

    @Override // fc.e
    public final Object h(Object obj, y8.c cVar) {
        switch (this.f10963a) {
            case 0:
                if (((i) obj).f10983a == 1) {
                    h hVar = this.f10964b;
                    synchronized (hVar) {
                        try {
                            if (!hVar.f10980d) {
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("com.autonavi.plus.showmap");
                                intentFilter.addAction("com.autonavi.plus.closemap");
                                intentFilter.addAction("com.autonavi.plus.offset");
                                u3.f.g(n8.a.b(), hVar, intentFilter);
                                hVar.f10980d = true;
                            }
                        } catch (Exception e7) {
                            Logger.INSTANCE.d("CarLife_Vehicle", "【悬浮广播】注册异常: " + e7.getMessage());
                        }
                        break;
                    }
                } else {
                    this.f10964b.f();
                }
                return z.f12851a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                i iVar = (i) i.f10982g.getValue();
                if (iVar.f10983a == 2) {
                    if (zBooleanValue) {
                        n.b("FLOAT_APP_SWITCH");
                    } else {
                        o oVar = n.f8927a;
                        n.a(0, iVar.f10984b, iVar.f10985c, iVar.f10986d, iVar.f10987e, "FLOAT_APP_SWITCH", new n1.c(new a(this.f10964b), 994069966, true));
                    }
                }
                return z.f12851a;
        }
    }
}
