package h8;

import com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.util.Logger;
import com.google.protobuf.l1;
import g8.i;
import i9.l;
import n8.h;
import t8.j;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class c implements TransportListener {
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
        a aVar = b.f6456a;
        b.f6456a.g();
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionEstablished(CarLifeContext carLifeContext) {
        l.e(carLifeContext, "context");
        j jVarE = h.e();
        int iIntValue = ((Number) jVarE.f12830a).intValue();
        int iIntValue2 = ((Number) jVarE.f12831b).intValue();
        CarLifeMessage carLifeMessageObtain = CarLifeMessage.INSTANCE.obtain(1, Integer.valueOf(ServiceTypes.MSG_CMD_VIDEO_ENCODER_INIT), 0);
        carLifeMessageObtain.payload(CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo.newBuilder().setWidth(iIntValue).setHeight(iIntValue2).setFrameRate(((i) i.f6025j.getValue()).f6029d).m16build());
        carLifeContext.postMessage(carLifeMessageObtain);
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
        int serviceType = carLifeMessage.getServiceType();
        if (serviceType == 65544) {
            try {
                l1 protoPayload = carLifeMessage.getProtoPayload();
                l.c(protoPayload, "null cannot be cast to non-null type com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo");
                CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo carlifeVideoEncoderInfo = (CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo) protoPayload;
                Logger.INSTANCE.d("CarLife_Vehicle", "【视频模块】收到视频初始化消息: " + carlifeVideoEncoderInfo.getWidth() + "x" + carlifeVideoEncoderInfo.getHeight() + "-" + carlifeVideoEncoderInfo.getFrameRate());
                b.f6456a.e(carlifeVideoEncoderInfo);
            } catch (Exception e7) {
                Logger.INSTANCE.e("CarLife_Vehicle", "【视频模块】解析视频初始化消息失败", e7);
            }
        } else if (serviceType == 131073) {
            a aVar = b.f6456a;
            aVar.getClass();
            if (carLifeMessage.getPayloadSize() != 0 && aVar.f6447a.get()) {
                carLifeMessage.acquire();
                aVar.f6455i.offer(carLifeMessage);
            }
        }
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
