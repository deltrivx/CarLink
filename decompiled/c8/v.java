package c8;

import android.app.Activity;
import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import b8.m2;
import b8.n2;
import c1.u2;
import com.baidu.carlife.sdk.Configs;
import f1.w0;
import java.io.IOException;
import java.util.List;
import l8.j0;
import l8.l0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class v implements h9.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2557b;

    public /* synthetic */ v(int i7, Object obj) {
        this.f2556a = i7;
        this.f2557b = obj;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i7 = this.f2556a;
        w0 w0Var = f1.n.f5051a;
        t8.z zVar = t8.z.f12851a;
        Object obj3 = this.f2557b;
        boolean z10 = false;
        switch (i7) {
            case 0:
                f1.s sVar = (f1.s) obj;
                m2 m2Var = (m2) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    i2.c.m(m2Var.f1615b, null, sVar, 0, 2);
                    i2.c.p(m2Var.f1616c, sVar, 0);
                }
                return zVar;
            case 1:
                f1.s sVar2 = (f1.s) obj;
                n2 n2Var = (n2) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    i2.c.m(n2Var.f1624b, null, sVar2, 0, 2);
                    List list = n2Var.f1625c;
                    sVar2.W(1849434622);
                    Object objK = sVar2.K();
                    if (objK == w0Var) {
                        objK = new b3.b0(7);
                        sVar2.h0(objK);
                    }
                    sVar2.p(false);
                    i2.c.p("触发: " + u8.p.q0(list, " → ", null, null, (h9.k) objK, 30), sVar2, 0);
                    List list2 = n2Var.f1626d;
                    sVar2.W(1849434622);
                    Object objK2 = sVar2.K();
                    if (objK2 == w0Var) {
                        objK2 = new b3.b0(8);
                        sVar2.h0(objK2);
                    }
                    sVar2.p(false);
                    i2.c.p("执行: " + u8.p.q0(list2, " → ", null, null, (h9.k) objK2, 30), sVar2, 0);
                }
                return zVar;
            case 2:
                f1.s sVar3 = (f1.s) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (sVar3.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                    throw null;
                }
                sVar3.Q();
                return zVar;
            case 3:
                f1.s sVar4 = (f1.s) obj;
                Activity activity = (Activity) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    k9.a.c(n3.l.J("音频传输通道", "手机向车机传输的音频流通道"), n3.l.J(new j0("互联通道", new l0(0), null, null, null, 28), new j0("蓝牙通道", new l0(1), null, null, null, 28)), Configs.FEATURE_CONFIG_AUDIO_TRANSMISSION_MODE, false, false, null, sVar4, 454, 56);
                    List listJ = n3.l.J("麦克风选择", "语音麦克风选择");
                    l0 l0Var = new l0(0);
                    sVar4.W(5004770);
                    boolean zH = sVar4.h(activity);
                    Object objK3 = sVar4.K();
                    Object obj4 = objK3;
                    if (zH || objK3 == w0Var) {
                        m7.f fVar = new m7.f(activity, z10 ? 1 : 0);
                        sVar4.h0(fVar);
                        obj4 = fVar;
                    }
                    sVar4.p(false);
                    k9.a.f(listJ, n3.l.J(new j0("车机麦克风", l0Var, null, null, (h9.a) obj4, 12), new j0("手机麦克风", new l0(1), null, null, null, 28)), new t8.j(Configs.FEATURE_CONFIG_VOICE_MIC, new l0(1)), false, false, null, sVar4, 70, 56);
                    i2.c.j(n3.l.I("重启CarLife生效"), sVar4, 6);
                }
                return zVar;
            case 4:
                f1.s sVar5 = (f1.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    u2.b((String) ((t8.j) obj3).f12830a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 0, 0, 131070);
                }
                return zVar;
            case 5:
                f1.s sVar6 = (f1.s) obj;
                ((Number) obj2).intValue();
                sVar6.W(666084174);
                String str = ((o0.d) obj3).f9252b;
                sVar6.p(false);
                return str;
            case 6:
                f1.s sVar7 = (f1.s) obj;
                ((Number) obj2).intValue();
                sVar7.W(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                sVar7.p(false);
                return strValueOf;
            case 7:
                f1.s sVar8 = (f1.s) obj;
                ((Number) obj2).intValue();
                sVar8.W(-1376593684);
                String string = ((RemoteAction) obj3).getTitle().toString();
                sVar8.p(false);
                return string;
            default:
                f1.s sVar9 = (f1.s) obj;
                t7.g gVar = (t7.g) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    i2.c.m(gVar.b(), null, sVar9, 0, 2);
                    i2.c.p(gVar.e(), sVar9, 0);
                }
                return zVar;
        }
    }
}
