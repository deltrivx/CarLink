package com.baidu.carlife.sdk.internal.protocol;

import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.a;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.util.Logger;
import i9.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/ProtocolTracer;", "Lcom/baidu/carlife/sdk/internal/transport/TransportListener;", "", "isReceiver", "<init>", "(Z)V", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "Lt8/z;", "monitorTraffic", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "Lcom/baidu/carlife/sdk/CarLifeContext;", "context", "onReceiveMessage", "(Lcom/baidu/carlife/sdk/CarLifeContext;Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)Z", "onSendMessage", "onConnectionDetached", "(Lcom/baidu/carlife/sdk/CarLifeContext;)V", "onConnectionAttached", "onConnectionReattached", "onConnectionEstablished", "Z", "", "tick", "J", "", "frameCount", "I", "byteCount", "mIsDiscardMsg", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class ProtocolTracer implements TransportListener {
    private long byteCount;
    private int frameCount;
    private final boolean isReceiver;
    private boolean mIsDiscardMsg = true;
    private long tick;

    public ProtocolTracer(boolean z10) {
        this.isReceiver = z10;
    }

    private final void monitorTraffic(CarLifeMessage message) {
        if (message.getChannel() == 2) {
            this.frameCount++;
        }
        this.byteCount += (long) (message.getSize() + 8);
        if (this.tick == 0) {
            this.tick = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j5 = jCurrentTimeMillis - this.tick;
        if (j5 > 1000) {
            Logger.INSTANCE.v(Constants.TAG, "ProtocolTracer bitrate ", Long.valueOf(((this.byteCount * ((long) 8)) * ((long) 1000)) / j5), " frame rate ", Long.valueOf(((long) (this.frameCount * 1000)) / j5));
            this.tick = jCurrentTimeMillis;
            this.frameCount = 0;
            this.byteCount = 0L;
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public void onConnectionAttached(CarLifeContext context) {
        l.e(context, "context");
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
        a.b(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public void onConnectionDetached(CarLifeContext context) {
        l.e(context, "context");
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public void onConnectionEstablished(CarLifeContext context) {
        l.e(context, "context");
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionPrompt(String str) {
        a.e(this, str);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public void onConnectionReattached(CarLifeContext context) {
        l.e(context, "context");
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        a.g(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionWait() {
        a.h(this);
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public boolean onReceiveMessage(CarLifeContext context, CarLifeMessage message) {
        l.e(context, "context");
        l.e(message, "message");
        int serviceType = message.getServiceType();
        if (serviceType == 98305) {
            this.mIsDiscardMsg = false;
        }
        if (!this.isReceiver && this.mIsDiscardMsg) {
            return true;
        }
        if (serviceType != 131073 && serviceType != 360449 && serviceType != 65589 && serviceType != 65590 && serviceType != 65574 && serviceType != 65584) {
            switch (serviceType) {
                case ServiceTypes.MSG_VIDEO_HEARTBEAT /* 131074 */:
                case ServiceTypes.MSG_MEDIA_DATA /* 196614 */:
                case ServiceTypes.MSG_MEDIA_DATA_ENCODER /* 196615 */:
                case ServiceTypes.MSG_NAV_TTS_DATA /* 262147 */:
                case ServiceTypes.MSG_VR_AUDIO_DATA /* 327683 */:
                    Logger.INSTANCE.v(Constants.TAG, "ProtocolTracer onReceiveMessage ", message, " @" + ServiceTypes.INSTANCE.getMsgName(serviceType));
                    break;
                default:
                    Logger.INSTANCE.d(Constants.TAG, "ProtocolTracer onReceiveMessage ", message, " @" + ServiceTypes.INSTANCE.getMsgName(serviceType));
                    break;
            }
        }
        monitorTraffic(message);
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public boolean onSendMessage(CarLifeContext context, CarLifeMessage message) {
        l.e(context, "context");
        l.e(message, "message");
        int serviceType = message.getServiceType();
        if (serviceType == 131073 || serviceType == 196614 || serviceType == 360449 || serviceType == 327683 || serviceType == 65590 || serviceType == 425985 || serviceType == 65574) {
            Logger.INSTANCE.v(Constants.TAG, "ProtocolTracer onSendMessage ", message, " @" + ServiceTypes.INSTANCE.getMsgName(serviceType));
        } else if (serviceType == 131074) {
            Logger.INSTANCE.v(Constants.TAG, "ProtocolTracer onSendMessage ", message, " @MSG_VIDEO_HEARTBEAT");
        } else {
            Logger.INSTANCE.d(Constants.TAG, "ProtocolTracer onSendMessage ", message, " @" + ServiceTypes.INSTANCE.getMsgName(serviceType));
        }
        return false;
    }
}
