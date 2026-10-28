package g8;

import b3.b0;
import com.baidu.carlife.sdk.Configs;
import com.baidu.carlifevehicle.R;
import f1.s;
import f1.w0;
import f1.w2;
import h9.k;
import h9.n;
import h9.o;
import java.util.ArrayList;
import java.util.List;
import l0.t0;
import l8.j0;
import l8.l0;
import l8.m0;
import n3.l;
import o7.u;
import r1.m;
import t8.j;
import t8.z;
import u8.q;
import x.n1;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f6023b;

    public /* synthetic */ h(w2 w2Var, int i7) {
        this.f6022a = i7;
        this.f6023b = w2Var;
    }

    private final Object e(Object obj, Object obj2) {
        s sVar = (s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            g5.a.b(null, u7.b.f13075a, sVar, 48, 1);
            w2 w2Var = this.f6023b;
            g5.a.b("样式", n1.h.e(1405864486, new h(w2Var, 12), sVar), sVar, 54, 0);
            g5.a.b("位置", n1.h.e(654315333, new h(w2Var, 13), sVar), sVar, 54, 0);
        }
        return z.f12851a;
    }

    private final Object f(Object obj, Object obj2) {
        s sVar = (s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            List listJ = l.J("时间格式", "请选择时间格式");
            b9.b<u7.g> bVar = u7.g.f13081e;
            ArrayList arrayList = new ArrayList(q.a0(bVar, 10));
            for (u7.g gVar : bVar) {
                arrayList.add(new j0(gVar.f13082a, new m0(gVar.f13083b), null, null, null, 28));
            }
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = new o7.q(21);
                sVar.h0(objK);
            }
            sVar.p(false);
            k9.a.c(listJ, arrayList, "TIME_FORMAT", false, false, (k) objK, sVar, 196998, 24);
            List listJ2 = l.J("背景颜色", "调整背景颜色");
            j jVar = new j("TIME_BACKGROUND_COLOR", "#80000000");
            sVar.W(1849434622);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new o7.q(22);
                sVar.h0(objK2);
            }
            sVar.p(false);
            i2.c.g(listJ2, jVar, false, (k) objK2, sVar, 3126, 4);
            List listJ3 = l.J("背景圆角", "dp");
            w2 w2Var = this.f6023b;
            j jVar2 = new j("TIME_ROUNDED_CORNER", Integer.valueOf(((u7.h) w2Var.getValue()).f13089d));
            j jVarJ = a2.f.J(new n9.a(0.0f, 100.0f), 0, sVar, 1849434622);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new o7.q(23);
                sVar.h0(objK3);
            }
            sVar.p(false);
            a.a.i(listJ3, jVar2, jVarJ, false, (k) objK3, sVar, 24582, 8);
            List listJ4 = l.J("文字颜色", "调整文字颜色");
            j jVar3 = new j("TIME_FONT_COLOR", "#FFFFFFFF");
            sVar.W(1849434622);
            Object objK4 = sVar.K();
            if (objK4 == w0Var) {
                objK4 = new o7.q(24);
                sVar.h0(objK4);
            }
            sVar.p(false);
            i2.c.g(listJ4, jVar3, false, (k) objK4, sVar, 3126, 4);
            List listJ5 = l.J("文字大小", "sp");
            j jVar4 = new j("TIME_FONT_SIZE", Integer.valueOf(((u7.h) w2Var.getValue()).f13094i));
            j jVarJ2 = a2.f.J(new n9.a(0.0f, 100.0f), 0, sVar, 1849434622);
            Object objK5 = sVar.K();
            if (objK5 == w0Var) {
                objK5 = new o7.q(25);
                sVar.h0(objK5);
            }
            sVar.p(false);
            a.a.i(listJ5, jVar4, jVarJ2, false, (k) objK5, sVar, 24582, 8);
            List listJ6 = l.J("文字行高", "sp");
            j jVar5 = new j("TIME_LINE_HEIGHT", Integer.valueOf(((u7.h) w2Var.getValue()).k));
            j jVarJ3 = a2.f.J(new n9.a(0.0f, 100.0f), 0, sVar, 1849434622);
            Object objK6 = sVar.K();
            if (objK6 == w0Var) {
                objK6 = new o7.q(26);
                sVar.h0(objK6);
            }
            sVar.p(false);
            a.a.i(listJ6, jVar5, jVarJ3, false, (k) objK6, sVar, 24582, 8);
            List listJ7 = l.J("文字粗体", "调整文字粗细");
            j jVar6 = new j("TIME_FONT_WEIGHT", Boolean.valueOf(((u7.h) w2Var.getValue()).f13095j));
            sVar.W(1849434622);
            Object objK7 = sVar.K();
            if (objK7 == w0Var) {
                objK7 = new o7.q(27);
                sVar.h0(objK7);
            }
            sVar.p(false);
            g5.a.g(listJ7, jVar6, false, (k) objK7, sVar, 3462, 0);
        }
        return z.f12851a;
    }

    private final Object g(Object obj, Object obj2) {
        s sVar = (s) obj;
        int i7 = 0;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            List listJ = l.J("时间位置", "请选择时间位置");
            List listJ2 = l.J(new j0("左上", new l0(1), null, null, null, 28), new j0("右上", new l0(0), null, null, null, 28), new j0("左下", new l0(2), null, null, null, 28), new j0("右下", new l0(3), null, null, null, 28));
            sVar.W(1849434622);
            Object objK = sVar.K();
            w0 w0Var = f1.n.f5051a;
            if (objK == w0Var) {
                objK = new o7.q(28);
                sVar.h0(objK);
            }
            sVar.p(false);
            int i10 = 1;
            k9.a.c(listJ, listJ2, "TIME_ALIGNMENT", false, false, (k) objK, sVar, 196998, 24);
            List listJ3 = l.J("上下外边距", "dp");
            w2 w2Var = this.f6023b;
            j jVar = new j("TIME_MARGIN_VERTICAL", Integer.valueOf(((u7.h) w2Var.getValue()).f13090e));
            float f10 = 3;
            j jVarJ = a2.f.J(new n9.a(0.0f, ((Number) n8.h.e().f12831b).intValue() / f10), 0, sVar, 1849434622);
            Object objK2 = sVar.K();
            if (objK2 == w0Var) {
                objK2 = new o7.q(29);
                sVar.h0(objK2);
            }
            sVar.p(false);
            a.a.i(listJ3, jVar, jVarJ, false, (k) objK2, sVar, 24582, 8);
            List listJ4 = l.J("左右外边距", "dp");
            j jVar2 = new j("TIME_MARGIN_HORIZONTAL", Integer.valueOf(((u7.h) w2Var.getValue()).f13091f));
            j jVarJ2 = a2.f.J(new n9.a(0.0f, ((Number) n8.h.e().f12830a).intValue() / f10), 0, sVar, 1849434622);
            Object objK3 = sVar.K();
            if (objK3 == w0Var) {
                objK3 = new u7.d(i7);
                sVar.h0(objK3);
            }
            sVar.p(false);
            a.a.i(listJ4, jVar2, jVarJ2, false, (k) objK3, sVar, 24582, 8);
            List listJ5 = l.J("上下内边距", "dp");
            j jVar3 = new j("TIME_PADDING_VERTICAL", Integer.valueOf(((u7.h) w2Var.getValue()).f13096l));
            j jVarJ3 = a2.f.J(new n9.a(0.0f, 100.0f), 0, sVar, 1849434622);
            Object objK4 = sVar.K();
            if (objK4 == w0Var) {
                objK4 = new u7.d(i10);
                sVar.h0(objK4);
            }
            sVar.p(false);
            a.a.i(listJ5, jVar3, jVarJ3, false, (k) objK4, sVar, 24582, 8);
            List listJ6 = l.J("左右内边距", "dp");
            j jVar4 = new j("TIME_PADDING_HORIZONTAL", Integer.valueOf(((u7.h) w2Var.getValue()).f13097m));
            j jVarJ4 = a2.f.J(new n9.a(0.0f, 100.0f), 0, sVar, 1849434622);
            Object objK5 = sVar.K();
            if (objK5 == w0Var) {
                objK5 = new u7.d(2);
                sVar.h0(objK5);
            }
            sVar.p(false);
            a.a.i(listJ6, jVar4, jVarJ4, false, (k) objK5, sVar, 27654, 0);
        }
        return z.f12851a;
    }

    @Override // h9.n
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f6022a;
        int i10 = 10;
        int i11 = 23;
        w0 w0Var = f1.n.f5051a;
        int i12 = 1;
        z zVar = z.f12851a;
        w2 w2Var = this.f6023b;
        int i13 = 2;
        int i14 = 0;
        switch (i7) {
            case 0:
                s sVar = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
                    sVar.Q();
                } else {
                    List listJ = l.J("渲染刷新", "返回前台时刷新显示");
                    Boolean bool = Boolean.FALSE;
                    j jVar = new j("VIDEO_REFRESH", bool);
                    sVar.W(1849434622);
                    Object objK = sVar.K();
                    if (objK == w0Var) {
                        objK = new b0(22);
                        sVar.h0(objK);
                    }
                    sVar.p(false);
                    g5.a.g(listJ, jVar, false, (k) objK, sVar, 3126, 4);
                    List listJ2 = l.J("重启解码器", "返回前台时重启解码器");
                    j jVar2 = new j("VIDEO_RESTART", bool);
                    sVar.W(1849434622);
                    Object objK2 = sVar.K();
                    if (objK2 == w0Var) {
                        objK2 = new b0(i11);
                        sVar.h0(objK2);
                    }
                    sVar.p(false);
                    g5.a.g(listJ2, jVar2, false, (k) objK2, sVar, 3126, 4);
                    List listJ3 = l.J("渲染方式", "选择CarLife画面渲染方式");
                    b9.b<g> bVar = g.f6019d;
                    ArrayList arrayList = new ArrayList(q.a0(bVar, 10));
                    for (g gVar : bVar) {
                        arrayList.add(new j0(gVar.f6020a, new l0(gVar.f6021b), null, null, null, 28));
                    }
                    sVar.W(1849434622);
                    Object objK3 = sVar.K();
                    if (objK3 == w0Var) {
                        objK3 = new b0(24);
                        sVar.h0(objK3);
                    }
                    sVar.p(false);
                    k9.a.c(listJ3, arrayList, "VIDEO_RENDER_TYPE", false, false, (k) objK3, sVar, 196998, 24);
                    k9.a.f(l.J("帧率", "每秒显示的画面数量"), l.J(new j0("15FPS", new l0(15), null, null, null, 28), new j0("20FPS", new l0(20), null, null, null, 28), new j0("30FPS", new l0(30), null, null, null, 28), new j0("60FPS", new l0(60), null, null, null, 28)), new j("VIDEO_FRAME_RATE", new l0(((i) w2Var.getValue()).f6029d)), false, false, null, sVar, 6, 56);
                    k9.a.f(l.J("I帧间隔", "选择编码时的关键帧插入间隔"), l.J(new j0("1", new l0(1), null, null, null, 28), new j0("15", new l0(15), null, null, null, 28), new j0("30", new l0(30), null, null, null, 28), new j0("60", new l0(60), null, null, null, 28), new j0("90", new l0(90), null, null, null, 28), new j0("120", new l0(120), null, null, null, 28), new j0("240", new l0(240), null, null, null, 28), new j0("300", new l0(300), null, null, null, 28), new j0("400", new l0(400), null, null, null, 28)), new j(Configs.FEATURE_CONFIG_I_FRAME_INTERVAL, new l0(300)), false, false, null, sVar, 6, 56);
                    i2.c.j(l.I("重启CarLife生效"), sVar, 6);
                }
                return zVar;
            case 1:
                s sVar2 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar2.z()) {
                    sVar2.Q();
                } else {
                    j jVarE = n8.h.e();
                    int iIntValue = ((Number) jVarE.f12830a).intValue();
                    int iIntValue2 = ((Number) jVarE.f12831b).intValue();
                    List listJ4 = l.J("显示宽度", "px");
                    j jVar3 = new j("VIDEO_WIDTH", Integer.valueOf(((i) w2Var.getValue()).f6026a));
                    float f10 = iIntValue;
                    float f11 = 10;
                    j jVar4 = new j(new n9.a(f10 / f11, f10), 0);
                    sVar2.W(1849434622);
                    Object objK4 = sVar2.K();
                    if (objK4 == w0Var) {
                        objK4 = new b0(25);
                        sVar2.h0(objK4);
                    }
                    sVar2.p(false);
                    a.a.i(listJ4, jVar3, jVar4, false, (k) objK4, sVar2, 24582, 8);
                    List listJ5 = l.J("显示高度", "px");
                    j jVar5 = new j("VIDEO_HEIGHT", Integer.valueOf(((i) w2Var.getValue()).f6027b));
                    float f12 = iIntValue2;
                    j jVarJ = a2.f.J(new n9.a(f12 / f11, f12), 0, sVar2, 1849434622);
                    Object objK5 = sVar2.K();
                    if (objK5 == w0Var) {
                        objK5 = new b0(26);
                        sVar2.h0(objK5);
                    }
                    sVar2.p(false);
                    a.a.i(listJ5, jVar5, jVarJ, false, (k) objK5, sVar2, 24582, 8);
                    List listJ6 = l.J("显示位置", "选择对齐位置");
                    b9.b<c> bVar2 = c.f6007f;
                    ArrayList arrayList2 = new ArrayList(q.a0(bVar2, 10));
                    for (c cVar : bVar2) {
                        arrayList2.add(new j0(cVar.f6008a, new l0(cVar.f6009b), null, null, null, 28));
                    }
                    j jVar6 = new j("VIDEO_ALIGNMENT", new l0(((i) w2Var.getValue()).f6028c));
                    sVar2.W(1849434622);
                    Object objK6 = sVar2.K();
                    if (objK6 == w0Var) {
                        objK6 = new b0(27);
                        sVar2.h0(objK6);
                    }
                    sVar2.p(false);
                    k9.a.f(listJ6, arrayList2, jVar6, false, false, (k) objK6, sVar2, 221190, 8);
                }
                return zVar;
            case 2:
                s sVar3 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar3.z()) {
                    sVar3.Q();
                } else {
                    g5.a.b(null, n1.h.e(1669941849, new h(w2Var, i14), sVar3), sVar3, 48, 1);
                    g5.a.b("显示设置", n1.h.e(-148799166, new h(w2Var, i12), sVar3), sVar3, 54, 0);
                }
                return zVar;
            case 3:
                s sVar4 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar4.z()) {
                    sVar4.Q();
                } else {
                    List listJ7 = l.J("媒体音频通道", "媒体音频通道设置");
                    j jVar7 = new j("AUDIO_MEDIA", Integer.valueOf(((m7.j) w2Var.getValue()).f8601j));
                    sVar4.W(1849434622);
                    Object objK7 = sVar4.K();
                    if (objK7 == w0Var) {
                        objK7 = new m7.g(i14);
                        sVar4.h0(objK7);
                    }
                    sVar4.p(false);
                    m7.i iVar = m7.i.f8588a;
                    iVar.a(listJ7, jVar7, false, (o) objK7, sVar4, 27654);
                    List listJ8 = l.J("导航音频通道", "导航音频通道设置");
                    j jVar8 = new j("AUDIO_TTS", Integer.valueOf(((m7.j) w2Var.getValue()).k));
                    sVar4.W(1849434622);
                    Object objK8 = sVar4.K();
                    if (objK8 == w0Var) {
                        objK8 = new m7.g(i12);
                        sVar4.h0(objK8);
                    }
                    sVar4.p(false);
                    iVar.a(listJ8, jVar8, false, (o) objK8, sVar4, 27654);
                    List listJ9 = l.J("语音助手音频通道", "语音助手音频通道设置");
                    j jVar9 = new j("AUDIO_VR", Integer.valueOf(((m7.j) w2Var.getValue()).f8602l));
                    sVar4.W(1849434622);
                    Object objK9 = sVar4.K();
                    if (objK9 == w0Var) {
                        objK9 = new m7.g(i13);
                        sVar4.h0(objK9);
                    }
                    sVar4.p(false);
                    iVar.a(listJ9, jVar9, false, (o) objK9, sVar4, 27654);
                    i2.c.j(l.I("重启CarLife生效"), sVar4, 6);
                }
                return zVar;
            case 4:
                s sVar5 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar5.z()) {
                    sVar5.Q();
                } else {
                    List listJ10 = l.J("与其他应用同时播放", "允许音乐与其他应用同时播放");
                    j jVar10 = new j("AUDIO_MEDIA_LOSS_PLAY", Boolean.TRUE);
                    sVar5.W(1849434622);
                    Object objK10 = sVar5.K();
                    if (objK10 == w0Var) {
                        objK10 = new t0(15);
                        sVar5.h0(objK10);
                    }
                    sVar5.p(false);
                    g5.a.g(listJ10, jVar10, false, (k) objK10, sVar5, 3126, 4);
                    g5.a.g(l.J("媒体信息显示", "系统显示音乐歌词封面等信息"), new j(Configs.FEATURE_CONFIG_MUSIC_HUD, 0), false, null, sVar5, 54, 12);
                    g5.a.g(l.J("媒体数据压缩", "AAC有损压缩, 数据体积小"), new j(Configs.FEATURE_CONFIG_AAC_SUPPORT, 0), false, null, sVar5, 54, 12);
                    List listJ11 = l.J("语音播报时媒体音量", "%");
                    j jVar11 = new j("AUDIO_MEDIA_VOLUME", Integer.valueOf(((m7.j) w2Var.getValue()).f8593b));
                    j jVarJ2 = a2.f.J(new n9.a(0.0f, 100.0f), 9, sVar5, 1849434622);
                    Object objK11 = sVar5.K();
                    if (objK11 == w0Var) {
                        objK11 = new t0(16);
                        sVar5.h0(objK11);
                    }
                    sVar5.p(false);
                    a.a.i(listJ11, jVar11, jVarJ2, false, (k) objK11, sVar5, 24582, 8);
                    k9.a.f(l.J("媒体缓存", "媒体播放缓存大小设置"), l.J(new j0("64KB", new l0(64), null, null, null, 28), new j0("128KB", new l0(128), null, null, null, 28), new j0("192KB", new l0(192), null, null, null, 28), new j0("256KB", new l0(256), null, null, null, 28), new j0("384KB", new l0(384), null, null, null, 28), new j0("512KB", new l0(512), null, null, null, 28), new j0("640KB", new l0(640), null, null, null, 28), new j0("768KB", new l0(768), null, null, null, 28), new j0("1MB", new l0(1024), null, null, null, 28)), new j("AUDIO_MEDIA_CACHE", new l0(256)), false, false, null, sVar5, 70, 56);
                    i2.c.j(l.I("重启CarLife生效"), sVar5, 6);
                }
                return zVar;
            case 5:
                s sVar6 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar6.z()) {
                    sVar6.Q();
                } else {
                    o7.g gVar2 = o7.g.f9489a;
                    j jVar12 = new j("CONNECT_COVER_WAIT", ((u) w2Var.getValue()).k);
                    sVar6.W(1849434622);
                    Object objK12 = sVar6.K();
                    if (objK12 == w0Var) {
                        objK12 = new t0(i11);
                        sVar6.h0(objK12);
                    }
                    sVar6.p(false);
                    gVar2.b(jVar12, R.drawable.cover_wait, (k) objK12, sVar6, 384);
                    float fN = g5.a.n(16, sVar6);
                    m mVar = m.f11116a;
                    d0.c.a(sVar6, androidx.compose.foundation.layout.c.b(mVar, fN));
                    j jVar13 = new j("CONNECT_COVER_SUCCESS", ((u) w2Var.getValue()).f9531l);
                    sVar6.W(1849434622);
                    Object objK13 = sVar6.K();
                    if (objK13 == w0Var) {
                        objK13 = new t0(24);
                        sVar6.h0(objK13);
                    }
                    sVar6.p(false);
                    gVar2.b(jVar13, R.drawable.cover_success, (k) objK13, sVar6, 384);
                    d0.c.a(sVar6, androidx.compose.foundation.layout.c.b(mVar, g5.a.n(16, sVar6)));
                    j jVar14 = new j("CONNECT_COVER_FAIL", ((u) w2Var.getValue()).f9532m);
                    sVar6.W(1849434622);
                    Object objK14 = sVar6.K();
                    if (objK14 == w0Var) {
                        objK14 = new t0(25);
                        sVar6.h0(objK14);
                    }
                    sVar6.p(false);
                    gVar2.b(jVar14, R.drawable.cover_fail, (k) objK14, sVar6, 384);
                }
                return zVar;
            case 6:
                s sVar7 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    o7.g.f9489a.c(null, sVar7, 0);
                    List listJ12 = l.J("连接超时时间", "秒");
                    j jVar15 = new j(Configs.CONFIG_CONNECT_TIMEOUT, Integer.valueOf(((u) w2Var.getValue()).f9529i));
                    j jVar16 = new j(new n9.a(5.0f, 60.0f), 0);
                    sVar7.W(1849434622);
                    Object objK15 = sVar7.K();
                    if (objK15 == w0Var) {
                        objK15 = new t0(26);
                        sVar7.h0(objK15);
                    }
                    sVar7.p(false);
                    a.a.i(listJ12, jVar15, jVar16, false, (k) objK15, sVar7, 27654, 0);
                }
                return zVar;
            case 7:
                s sVar8 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    List listJ13 = l.J("蓝牙广播", "手机端收到广播会触发连接");
                    j jVar17 = new j(Configs.CONFIG_WIFI_DIRECT_BLE, 1);
                    sVar8.W(1849434622);
                    Object objK16 = sVar8.K();
                    if (objK16 == w0Var) {
                        objK16 = new t0(29);
                        sVar8.h0(objK16);
                    }
                    sVar8.p(false);
                    g5.a.g(listJ13, jVar17, false, (k) objK16, sVar8, 3126, 4);
                    List listJ14 = l.J("创建群组", "优先车机端创建群组");
                    j jVar18 = new j(Configs.CONFIG_WIFI_DIRECT_GROUP, 0);
                    sVar8.W(1849434622);
                    Object objK17 = sVar8.K();
                    if (objK17 == w0Var) {
                        objK17 = new o7.q(0);
                        sVar8.h0(objK17);
                    }
                    sVar8.p(false);
                    g5.a.g(listJ14, jVar18, false, (k) objK17, sVar8, 3126, 4);
                    o7.j jVar19 = o7.j.f9497b;
                    j jVar20 = new j("车机端直连名称", ((u) w2Var.getValue()).f9525e);
                    sVar8.W(1849434622);
                    Object objK18 = sVar8.K();
                    if (objK18 == w0Var) {
                        objK18 = new o7.q(1);
                        sVar8.h0(objK18);
                    }
                    sVar8.p(false);
                    jVar19.e(jVar20, (k) objK18, sVar8, 432);
                    i2.c.j(l.I("填手机端直连中搜索到的车机直连名称"), sVar8, 6);
                }
                return zVar;
            case 8:
                s sVar9 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    List listJ15 = l.J("应用悬浮", "配合支持悬浮应用的桌面使用");
                    List listJ16 = l.J(new j0("关闭", new l0(0), null, null, null, 28), new j0("悬浮(配合桌面使用)", new l0(1), null, null, null, 28), new j0("自定义(双指双击关闭)", new l0(2), null, null, null, 28));
                    sVar9.W(1849434622);
                    Object objK19 = sVar9.K();
                    if (objK19 == w0Var) {
                        objK19 = new o7.q(4);
                        sVar9.h0(objK19);
                    }
                    sVar9.p(false);
                    k9.a.c(listJ15, listJ16, "FLOAT_APP_SWITCH", false, false, (k) objK19, sVar9, 196998, 24);
                    List listJ17 = l.J("宽度", "px");
                    int i15 = q7.h.f10976e;
                    j jVar21 = new j("FLOAT_APP_WIDTH", Integer.valueOf(((q7.i) w2Var.getValue()).f10984b));
                    j jVarJ3 = a2.f.J(new n9.a(0.0f, ((Number) n8.h.e().f12830a).intValue()), 0, sVar9, 1849434622);
                    Object objK20 = sVar9.K();
                    if (objK20 == w0Var) {
                        objK20 = new o7.q(5);
                        sVar9.h0(objK20);
                    }
                    sVar9.p(false);
                    a.a.i(listJ17, jVar21, jVarJ3, false, (k) objK20, sVar9, 24582, 8);
                    List listJ18 = l.J("高度", "px");
                    j jVar22 = new j("FLOAT_APP_HEIGHT", Integer.valueOf(((q7.i) w2Var.getValue()).f10985c));
                    j jVarJ4 = a2.f.J(new n9.a(0.0f, ((Number) n8.h.e().f12831b).intValue()), 0, sVar9, 1849434622);
                    Object objK21 = sVar9.K();
                    if (objK21 == w0Var) {
                        objK21 = new o7.q(6);
                        sVar9.h0(objK21);
                    }
                    sVar9.p(false);
                    a.a.i(listJ18, jVar22, jVarJ4, false, (k) objK21, sVar9, 24582, 8);
                    List listJ19 = l.J("左偏移X", "px");
                    j jVar23 = new j("FLOAT_APP_OFFSET_X", Integer.valueOf(((q7.i) w2Var.getValue()).f10986d));
                    float f13 = 2;
                    j jVarJ5 = a2.f.J(new n9.a(0.0f, ((Number) n8.h.e().f12830a).intValue() / f13), 0, sVar9, 1849434622);
                    Object objK22 = sVar9.K();
                    if (objK22 == w0Var) {
                        objK22 = new o7.q(7);
                        sVar9.h0(objK22);
                    }
                    sVar9.p(false);
                    a.a.i(listJ19, jVar23, jVarJ5, false, (k) objK22, sVar9, 24582, 8);
                    List listJ20 = l.J("上偏移Y", "px");
                    j jVar24 = new j("FLOAT_APP_OFFSET_Y", Integer.valueOf(((q7.i) w2Var.getValue()).f10987e));
                    j jVarJ6 = a2.f.J(new n9.a(0.0f, ((Number) n8.h.e().f12831b).intValue() / f13), 0, sVar9, 1849434622);
                    Object objK23 = sVar9.K();
                    if (objK23 == w0Var) {
                        objK23 = new o7.q(8);
                        sVar9.h0(objK23);
                    }
                    sVar9.p(false);
                    a.a.i(listJ20, jVar24, jVarJ6, false, (k) objK23, sVar9, 24582, 8);
                    i2.c.j(l.I("自定义悬浮设置"), sVar9, 6);
                }
                return zVar;
            case 9:
                s sVar10 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar10.z()) {
                    sVar10.Q();
                } else {
                    g5.a.b(null, n1.h.e(1825456405, new h(w2Var, 8), sVar10), sVar10, 48, 1);
                }
                return zVar;
            case 10:
                s sVar11 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar11.z()) {
                    sVar11.Q();
                } else {
                    List listJ21 = l.J("小白条", "屏幕底部小白条");
                    j jVar25 = new j("FLOAT_GESTURE_SWITCH", Boolean.TRUE);
                    sVar11.W(1849434622);
                    Object objK24 = sVar11.K();
                    if (objK24 == w0Var) {
                        objK24 = new o7.q(11);
                        sVar11.h0(objK24);
                    }
                    sVar11.p(false);
                    g5.a.g(listJ21, jVar25, false, (k) objK24, sVar11, 3126, 4);
                    List listJ22 = l.J("小白条宽度", "px");
                    j jVar26 = new j("FLOAT_GESTURE_WIDTH", Integer.valueOf(((r7.b) w2Var.getValue()).f11643b));
                    j jVarJ7 = a2.f.J(new n9.a(0.0f, 300.0f), 0, sVar11, 1849434622);
                    Object objK25 = sVar11.K();
                    if (objK25 == w0Var) {
                        objK25 = new o7.q(12);
                        sVar11.h0(objK25);
                    }
                    sVar11.p(false);
                    a.a.i(listJ22, jVar26, jVarJ7, false, (k) objK25, sVar11, 24582, 8);
                    List listJ23 = l.J("小白条高度", "px");
                    j jVar27 = new j("FLOAT_GESTURE_HEIGHT", Integer.valueOf(((r7.b) w2Var.getValue()).f11644c));
                    j jVarJ8 = a2.f.J(new n9.a(0.0f, 50.0f), 0, sVar11, 1849434622);
                    Object objK26 = sVar11.K();
                    if (objK26 == w0Var) {
                        objK26 = new o7.q(13);
                        sVar11.h0(objK26);
                    }
                    sVar11.p(false);
                    a.a.i(listJ23, jVar27, jVarJ8, false, (k) objK26, sVar11, 24582, 8);
                    List listJ24 = l.J("小白条底边距", "px");
                    j jVar28 = new j("FLOAT_GESTURE_BOTTOM", Integer.valueOf(((r7.b) w2Var.getValue()).f11645d));
                    j jVarJ9 = a2.f.J(new n9.a(0.0f, 150.0f), 0, sVar11, 1849434622);
                    Object objK27 = sVar11.K();
                    if (objK27 == w0Var) {
                        objK27 = new o7.q(14);
                        sVar11.h0(objK27);
                    }
                    sVar11.p(false);
                    a.a.i(listJ24, jVar28, jVarJ9, false, (k) objK27, sVar11, 24582, 8);
                    i2.c.j(l.I("单击返回桌面, 长按打开设置"), sVar11, 6);
                }
                return zVar;
            case 11:
                s sVar12 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar12.z()) {
                    sVar12.Q();
                } else {
                    g5.a.b(null, n1.h.e(1956894957, new h(w2Var, i10), sVar12), sVar12, 48, 1);
                }
                return zVar;
            case 12:
                return f(obj, obj2);
            case 13:
                return g(obj, obj2);
            case 14:
                return e(obj, obj2);
            default:
                s sVar13 = (s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar13.z()) {
                    sVar13.Q();
                } else {
                    List listJ25 = l.J("屏幕圆角", "dp");
                    j jVar29 = new j("ROUNDED_CORNER", Integer.valueOf(((z7.k) w2Var.getValue()).f15764a));
                    j jVar30 = new j(new n9.a(0.0f, 100.0f), 0);
                    sVar13.W(1849434622);
                    Object objK28 = sVar13.K();
                    if (objK28 == w0Var) {
                        objK28 = new n1(23);
                        sVar13.h0(objK28);
                    }
                    sVar13.p(false);
                    a.a.i(listJ25, jVar29, jVar30, false, (k) objK28, sVar13, 27654, 0);
                }
                return zVar;
        }
    }
}
