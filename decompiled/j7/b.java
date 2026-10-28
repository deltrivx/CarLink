package j7;

import android.media.AudioManager;
import android.media.AudioTrack;
import com.baidu.carlife.protobuf.CarlifeModuleStatusProto;
import com.baidu.carlife.protobuf.CarlifeMusicInitProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.receiver.CarLifeReceiver;
import com.baidu.carlife.sdk.util.Logger;
import com.google.protobuf.l1;
import fc.h0;
import i9.l;
import k7.g;
import k7.h;
import m7.j;
import n7.f;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements TransportListener, g, AudioManager.OnAudioFocusChangeListener, m7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarLifeContext f6956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.d f6957b;

    public b(CarLifeReceiver carLifeReceiver) {
        l.e(carLifeReceiver, "context");
        this.f6956a = carLifeReceiver;
        this.f6957b = new k7.d(3, this);
    }

    @Override // k7.g
    public final void a(n7.d dVar, String str) {
        l.e(dVar, "source");
        l.e(str, "errorMessage");
        k7.c cVar = k7.c.f7339a;
        k7.c.a(this);
        Logger.INSTANCE.e(Constants.TAG, "【媒体音频】播放出错: ".concat(str));
    }

    @Override // m7.a
    public final j b() {
        return i2.c.B();
    }

    @Override // k7.g
    public final void c(h hVar) {
    }

    @Override // k7.g
    public final void d(n7.d dVar) {
        l.e(dVar, "source");
        h.f7353a.getClass();
        h0 h0Var = h.f7354b;
        Boolean bool = Boolean.FALSE;
        h0Var.getClass();
        h0Var.j(null, bool);
    }

    @Override // k7.g
    public final void e() {
        if (i2.c.P(this, 3)) {
            int iD = k7.c.d(this, 1, 1, 16);
            k7.d dVar = this.f6957b;
            if (iD != 1) {
                dVar.e(null);
                Logger.INSTANCE.d(Constants.TAG, "【媒体音频】播放中, 请求音频焦点失败");
            } else {
                dVar.e(Float.valueOf(1.0f));
                Logger.INSTANCE.d(Constants.TAG, "【媒体音频】播放中, 请求音频焦点成功");
            }
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        k7.d dVar = this.f6957b;
        if (i7 == -3 || i7 == -2) {
            dVar.e(null);
            Logger.INSTANCE.d(Constants.TAG, "【媒体音频】临时失去焦点, 降低音量继续播放");
            return;
        }
        if (i7 != -1) {
            if (i7 != 1) {
                return;
            }
            dVar.e(Float.valueOf(1.0f));
            Logger.INSTANCE.d(Constants.TAG, "【媒体音频】获得焦点, 恢复播放");
            return;
        }
        if (i2.c.B().f8592a) {
            return;
        }
        CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 1, Integer.valueOf(ServiceTypes.MSG_CMD_MODULE_CONTROL), 0, 4, null);
        carLifeMessageObtain$default.payload(CarlifeModuleStatusProto.CarlifeModuleStatus.newBuilder().setModuleID(3).setStatusID(0).m16build());
        this.f6956a.postMessage(carLifeMessageObtain$default);
        Logger.INSTANCE.d(Constants.TAG, "【媒体音频】永久失去焦点, 停止播放");
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAttached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.a(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.b(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionDetached(CarLifeContext carLifeContext) {
        l.e(carLifeContext, "context");
        k7.c cVar = k7.c.f7339a;
        k7.c.a(this);
        this.f6957b.f();
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionEstablished(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.d(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionPrompt(String str) {
        com.baidu.carlife.sdk.a.e(this, str);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionReattached(CarLifeContext carLifeContext) {
        l.e(carLifeContext, "context");
        k7.c cVar = k7.c.f7339a;
        k7.c.a(this);
        this.f6957b.f();
        Logger.INSTANCE.d(Constants.TAG, "【媒体音频】设备重新连接，关闭旧流");
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.g(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionWait() {
        com.baidu.carlife.sdk.a.h(this);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final boolean onReceiveMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        l.e(carLifeContext, "context");
        l.e(carLifeMessage, "message");
        if (carLifeMessage.getChannel() != 3) {
            return false;
        }
        int serviceType = carLifeMessage.getServiceType();
        k7.d dVar = this.f6957b;
        switch (serviceType) {
            case ServiceTypes.MSG_MEDIA_INIT /* 196609 */:
                h.f7353a.getClass();
                h0 h0Var = h.f7354b;
                Boolean bool = Boolean.TRUE;
                h0Var.getClass();
                h0Var.j(null, bool);
                l1 protoPayload = carLifeMessage.getProtoPayload();
                l.c(protoPayload, "null cannot be cast to non-null type com.baidu.carlife.protobuf.CarlifeMusicInitProto.CarlifeMusicInit");
                CarlifeMusicInitProto.CarlifeMusicInit carlifeMusicInit = (CarlifeMusicInitProto.CarlifeMusicInit) protoPayload;
                dVar.c(new f(carLifeContext, new n7.c(carlifeMusicInit.getSampleRate(), carlifeMusicInit.getChannelConfig(), carlifeMusicInit.getSampleFormat()), i2.c.B().f8594c * 1024));
                break;
            case ServiceTypes.MSG_MEDIA_STOP /* 196610 */:
                h.f7353a.getClass();
                h0 h0Var2 = h.f7354b;
                Boolean bool2 = Boolean.FALSE;
                h0Var2.getClass();
                h0Var2.j(null, bool2);
                dVar.f();
                break;
            case ServiceTypes.MSG_MEDIA_PAUSE /* 196611 */:
                h.f7353a.getClass();
                h0 h0Var3 = h.f7354b;
                Boolean bool3 = Boolean.FALSE;
                h0Var3.getClass();
                h0Var3.j(null, bool3);
                AudioTrack audioTrack = dVar.f7346c;
                if (audioTrack != null) {
                    audioTrack.pause();
                }
                dVar.h(h.f7358f);
                break;
            case ServiceTypes.MSG_MEDIA_RESUME_PLAY /* 196612 */:
                h.f7353a.getClass();
                h0 h0Var4 = h.f7354b;
                Boolean bool4 = Boolean.TRUE;
                h0Var4.getClass();
                h0Var4.j(null, bool4);
                dVar.e(Float.valueOf(1.0f));
                break;
            case ServiceTypes.MSG_MEDIA_DATA /* 196614 */:
            case ServiceTypes.MSG_MEDIA_DATA_ENCODER /* 196615 */:
                h.f7353a.getClass();
                h0 h0Var5 = h.f7354b;
                Boolean bool5 = Boolean.TRUE;
                h0Var5.getClass();
                h0Var5.j(null, bool5);
                dVar.a(carLifeMessage);
                break;
        }
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
