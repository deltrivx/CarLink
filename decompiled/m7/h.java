package m7;

import a8.f1;
import android.app.Activity;
import c8.v;
import com.baidu.carlife.sdk.Configs;
import f1.b1;
import f1.s;
import f1.w0;
import f1.w2;
import h9.n;
import java.util.List;
import l0.t0;
import l8.j0;
import l8.l0;
import o7.u;
import t8.z;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f8586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2 f8587c;

    public /* synthetic */ h(Activity activity, w2 w2Var, int i7) {
        this.f8585a = i7;
        this.f8586b = activity;
        this.f8587c = w2Var;
    }

    public h(b1 b1Var, Activity activity) {
        this.f8585a = 2;
        this.f8587c = b1Var;
        this.f8586b = activity;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f8585a;
        int i10 = 6;
        z zVar = z.f12851a;
        Activity activity = this.f8586b;
        w2 w2Var = this.f8587c;
        int i11 = 1;
        int i12 = 3;
        switch (i7) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    g5.a.b(null, n1.h.e(586612968, new v(i12, activity), sVar), sVar, 48, 1);
                    g5.a.b("音频通道设置", n1.h.e(-1232128047, new g8.h(w2Var, i12), sVar), sVar, 54, 0);
                    g5.a.b("媒体设置", n1.h.e(-1577043792, new g8.h(w2Var, 4), sVar), sVar, 54, 0);
                }
                break;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    List listJ = n3.l.J("手机端IP获取方式", "手机端IP获取方式");
                    j0 j0Var = new j0("默认", new l0(0), null, null, null, 28);
                    j0 j0Var2 = new j0("指定IP", new l0(1), null, null, null, 28);
                    l0 l0Var = new l0(2);
                    sVar2.W(-1633490746);
                    boolean zH = sVar2.h(activity) | sVar2.f(w2Var);
                    Object objK = sVar2.K();
                    w0 w0Var = f1.n.f5051a;
                    if (zH || objK == w0Var) {
                        objK = new f1(11, activity, w2Var);
                        sVar2.h0(objK);
                    }
                    sVar2.p(false);
                    List listJ2 = n3.l.J(j0Var, j0Var2, new j0("蓝牙Socket", l0Var, null, null, (h9.a) objK, 12));
                    boolean z10 = ((u) w2Var.getValue()).f9527g != 0;
                    sVar2.W(1849434622);
                    Object objK2 = sVar2.K();
                    if (objK2 == w0Var) {
                        objK2 = new t0(27);
                        sVar2.h0(objK2);
                    }
                    sVar2.p(false);
                    k9.a.c(listJ, listJ2, Configs.CONFIG_TARGET_IP_GET, false, z10, (h9.k) objK2, sVar2, 196998, 8);
                    int i13 = ((u) w2Var.getValue()).f9527g;
                    if (i13 == 1) {
                        sVar2.W(38936577);
                        o7.j jVar = o7.j.f9497b;
                        t8.j jVar2 = new t8.j("手机端IP地址", ((u) w2Var.getValue()).f9528h);
                        sVar2.W(1849434622);
                        Object objK3 = sVar2.K();
                        if (objK3 == w0Var) {
                            objK3 = new t0(28);
                            sVar2.h0(objK3);
                        }
                        sVar2.p(false);
                        jVar.f(jVar2, (h9.k) objK3, sVar2, 432);
                        i2.c.j(n3.l.J("热点连不上可以设置手机端IP地址", "如设置192.167.40.36会自动扫描192.167.40.(1-254)", "手机开热点IP一般为192.168.43.*|192.168.137.*"), sVar2, 6);
                        sVar2.p(false);
                    } else if (i13 == 2) {
                        sVar2.W(39658629);
                        i2.c.j(n3.l.I("需配合CarLife辅助使用"), sVar2, 6);
                        sVar2.p(false);
                    } else {
                        sVar2.W(39881612);
                        sVar2.p(false);
                    }
                }
                break;
            default:
                s sVar3 = (s) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    g5.a.b(null, n1.h.e(583806493, new g8.h(w2Var, i10), sVar3), sVar3, 48, 1);
                    g5.a.b("WIFI热点设置", n1.h.e(704415700, new h(activity, w2Var, i11), sVar3), sVar3, 54, 0);
                    g5.a.b("WLAN直连设置", n1.h.e(-257209515, new g8.h(w2Var, 7), sVar3), sVar3, 54, 0);
                    g5.a.b("USB连接设置", o7.d.f9479b, sVar3, 54, 0);
                }
                break;
        }
        return zVar;
    }
}
