package l7;

import a8.c1;
import cc.o1;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.receiver.CarLifeReceiver;
import com.baidu.carlife.sdk.util.Logger;
import com.muyetuge.carlifevehicle.activity.MainActivity;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class b implements TransportListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f8078a;

    public b(CarLifeReceiver carLifeReceiver) {
        l.e(carLifeReceiver, "context");
        this.f8078a = new e(carLifeReceiver);
        hc.c cVar = n8.c.f8897a;
        n8.c.d(new c1(this, null, 20));
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
        e eVar = this.f8078a;
        eVar.f8088e = false;
        o1 o1Var = eVar.f8087d;
        if (o1Var != null) {
            o1Var.a(null);
        }
        eVar.f8087d = null;
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
        e eVar = this.f8078a;
        l.e(carLifeContext, "context");
        l.e(carLifeMessage, "message");
        switch (carLifeMessage.getServiceType()) {
            case ServiceTypes.MSG_CMD_MIC_RECORD_WAKEUP_START /* 65570 */:
                if (((Boolean) MainActivity.f2913z.getValue()).booleanValue()) {
                    eVar.a();
                    Logger.INSTANCE.d(Constants.TAG, "【录音模块】开始监听麦克风");
                }
                return false;
            case ServiceTypes.MSG_CMD_MIC_RECORD_END /* 65571 */:
                eVar.f8088e = false;
                o1 o1Var = eVar.f8087d;
                if (o1Var != null) {
                    o1Var.a(null);
                }
                eVar.f8087d = null;
                Logger.INSTANCE.d(Constants.TAG, "【录音模块】停止录音");
                return false;
            case ServiceTypes.MSG_CMD_MIC_RECORD_RECOG_START /* 65572 */:
                if (((Boolean) MainActivity.f2913z.getValue()).booleanValue()) {
                    eVar.a();
                    Logger.INSTANCE.d(Constants.TAG, "【录音模块】开始录音");
                }
                return false;
            default:
                return false;
        }
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
