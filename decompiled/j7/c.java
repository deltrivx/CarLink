package j7;

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
import n7.e;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements TransportListener, g, AudioManager.OnAudioFocusChangeListener, m7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarLifeReceiver f6958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k7.d f6959b = new k7.d(4, this);

    public c(CarLifeReceiver carLifeReceiver) {
        this.f6958a = carLifeReceiver;
    }

    @Override // k7.g
    public final void a(n7.d dVar, String str) {
        l.e(dVar, "source");
        l.e(str, "errorMessage");
        k7.c cVar = k7.c.f7339a;
        k7.c.a(this);
        Logger.INSTANCE.e(Constants.TAG, "【导航音频】播放出错 - ".concat(str));
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
        Logger.INSTANCE.d(Constants.TAG, "【导航音频】释放焦点");
    }

    @Override // k7.g
    public final void e() {
        if (i2.c.P(this, 4)) {
            k7.c.d(this, 2, 3, 24);
            Logger.INSTANCE.d(Constants.TAG, "【导航音频】请求短时音频焦点");
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        if (i7 == -2 || i7 == -1) {
            Logger.INSTANCE.d(Constants.TAG, "【导航音频】失去焦点");
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
        this.f6959b.f();
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

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final boolean onReceiveMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        l.e(carLifeContext, "context");
        l.e(carLifeMessage, "message");
        if (carLifeMessage.getChannel() != 4) {
            return false;
        }
        int serviceType = carLifeMessage.getServiceType();
        k7.d dVar = this.f6959b;
        switch (serviceType) {
            case ServiceTypes.MSG_NAV_TTS_INIT /* 262145 */:
                l1 protoPayload = carLifeMessage.getProtoPayload();
                l.c(protoPayload, "null cannot be cast to non-null type com.baidu.carlife.protobuf.CarlifeTTSInitProto.CarlifeTTSInit");
                dVar.c(e.a(carLifeContext, (CarlifeTTSInitProto.CarlifeTTSInit) protoPayload));
                break;
            case ServiceTypes.MSG_NAV_TTS_END /* 262146 */:
                dVar.f();
                break;
            case ServiceTypes.MSG_NAV_TTS_DATA /* 262147 */:
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
