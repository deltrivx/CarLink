package m7;

import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.receiver.CarLifeReceiver;
import com.baidu.carlife.sdk.util.Logger;
import f1.s;
import f1.w1;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements v7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8561a = "CarLife设置";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8562b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8563c = 2;

    @Override // v7.e
    public final void a() {
        CarLifeReceiver carLifeReceiverReceiver = CarLife.receiver();
        o oVar = n8.d.f8898a;
        if (n8.d.b(0, Configs.FEATURE_CONFIG_AUDIO_TRANSMISSION_MODE) == 0) {
            carLifeReceiverReceiver.registerTransportListener(new j7.b(carLifeReceiverReceiver));
            carLifeReceiverReceiver.registerTransportListener(new j7.c(carLifeReceiverReceiver));
            carLifeReceiverReceiver.registerTransportListener(new j7.d(carLifeReceiverReceiver));
            if (n8.d.b(0, Configs.FEATURE_CONFIG_MUSIC_HUD) == 1) {
                carLifeReceiverReceiver.registerTransportListener(new k7.f());
                Logger.INSTANCE.d("AudioEntry", "【音频模块】注册音乐信息模块");
            }
        } else {
            carLifeReceiverReceiver.registerTransportListener(new j7.a(carLifeReceiverReceiver));
        }
        Logger.Companion companion = Logger.INSTANCE;
        companion.d("AudioEntry", "【音频模块】注册音频模块");
        if (n8.d.b(1, Configs.FEATURE_CONFIG_VOICE_MIC) == 0) {
            carLifeReceiverReceiver.registerTransportListener(new l7.b(carLifeReceiverReceiver));
            companion.d("AudioEntry", "【音频模块】注册麦克风模块");
        }
    }

    @Override // v7.e
    public final void b(int i7, s sVar) {
        n3.l.d(sVar);
    }

    @Override // v7.e
    public final void c(int i7, s sVar) {
        n3.l.c(sVar);
    }

    @Override // v7.e
    public final v7.h d() {
        return v7.h.f13652c;
    }

    @Override // v7.e
    public final int e() {
        return this.f8562b;
    }

    @Override // v7.e
    public final int f() {
        return this.f8563c;
    }

    @Override // v7.e
    public final String g() {
        return this.f8561a;
    }

    @Override // v7.e
    public final v7.f h() {
        return v7.f.Settings;
    }

    @Override // v7.e
    public final void i(int i7, s sVar) {
        sVar.Y(850864380);
        if ((i7 & 1) == 0 && sVar.z()) {
            sVar.Q();
        } else {
            i.f8588a.c(null, sVar, 48);
        }
        w1 w1VarR = sVar.r();
        if (w1VarR != null) {
            w1VarR.f5192d = new b3.a(i7, 17, this);
        }
    }
}
