package j7;

import a5.e;
import android.media.AudioManager;
import com.baidu.carlife.protobuf.CarlifeTTSInitProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.receiver.CarLifeReceiver;
import com.baidu.carlife.sdk.util.Logger;
import com.google.protobuf.l1;
import i9.l;
import k7.g;
import k7.h;
import m7.j;
import t8.o;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class d implements TransportListener, g, AudioManager.OnAudioFocusChangeListener, m7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarLifeReceiver f6960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.d f6961b = new k7.d(5, this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f6962c = t8.a.d(new e(8, this));

    public d(CarLifeReceiver carLifeReceiver) {
        this.f6960a = carLifeReceiver;
    }

    @Override // k7.g
    public final void a(n7.d dVar, String str) {
        l.e(dVar, "source");
        l.e(str, "errorMessage");
        k7.c cVar = k7.c.f7339a;
        k7.c.a(this);
        Logger.INSTANCE.e(Constants.TAG, "【语音音频】播放出错: ".concat(str));
        if (dVar == ((n7.d) this.f6962c.getValue())) {
            this.f6960a.postMessage(1, ServiceTypes.MSG_CMD_MIC_RECORD_PREPARE_DONE);
        }
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
        k7.c cVar = k7.c.f7339a;
        k7.c.a(this);
        Logger.INSTANCE.d(Constants.TAG, "【语音音频】释放焦点");
        if (dVar == ((n7.d) this.f6962c.getValue())) {
            this.f6960a.postMessage(1, ServiceTypes.MSG_CMD_MIC_RECORD_PREPARE_DONE);
        }
    }

    @Override // k7.g
    public final void e() {
        if (i2.c.P(this, 5)) {
            k7.c.d(this, 3, 4, 24);
            Logger.INSTANCE.d(Constants.TAG, "【语音音频】请求独占音频焦点");
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        if (i7 == -2 || i7 == -1) {
            this.f6961b.f();
            Logger.INSTANCE.d(Constants.TAG, "【语音音频】语音播报失去焦点，停止播放");
        }
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
        this.f6961b.f();
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
    public final /* synthetic */ void onConnectionReattached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.f(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.g(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionWait() {
        com.baidu.carlife.sdk.a.h(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final boolean onReceiveMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        l.e(carLifeContext, "context");
        l.e(carLifeMessage, "message");
        int serviceType = carLifeMessage.getServiceType();
        k7.d dVar = this.f6961b;
        if (serviceType == 65649) {
            dVar.d((n7.d) this.f6962c.getValue());
            Logger.INSTANCE.d(Constants.TAG, "【语音音频】播放提示音（叮一声）");
        }
        if (carLifeMessage.getChannel() == 5) {
            switch (carLifeMessage.getServiceType()) {
                case ServiceTypes.MSG_VR_AUDIO_INIT /* 327682 */:
                    l1 protoPayload = carLifeMessage.getProtoPayload();
                    l.c(protoPayload, "null cannot be cast to non-null type com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit");
                    dVar.c(n7.e.a(carLifeContext, (CarlifeTTSInitProto.CarlifeTTSInit) protoPayload));
                    break;
                case ServiceTypes.MSG_VR_AUDIO_DATA /* 327683 */:
                    dVar.a(carLifeMessage);
                    break;
                case ServiceTypes.MSG_VR_AUDIO_STOP /* 327684 */:
                    dVar.f();
                    break;
                case ServiceTypes.MSG_VR_AUDIO_INTERRUPT /* 327686 */:
                    dVar.f();
                    break;
            }
        }
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
