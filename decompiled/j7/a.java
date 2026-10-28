package j7;

import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.receiver.CarLifeReceiver;
import fc.h0;
import i9.l;
import k7.h;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class a implements TransportListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarLifeContext f6955a;

    public a(CarLifeReceiver carLifeReceiver) {
        l.e(carLifeReceiver, "context");
        this.f6955a = carLifeReceiver;
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
    public final /* synthetic */ void onConnectionDetached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.c(this, carLifeContext);
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
        if (carLifeMessage.getChannel() != 3) {
            return false;
        }
        switch (carLifeMessage.getServiceType()) {
            case ServiceTypes.MSG_MEDIA_INIT /* 196609 */:
                h.f7353a.getClass();
                h0 h0Var = h.f7354b;
                Boolean bool = Boolean.TRUE;
                h0Var.getClass();
                h0Var.j(null, bool);
                break;
            case ServiceTypes.MSG_MEDIA_STOP /* 196610 */:
                h.f7353a.getClass();
                h0 h0Var2 = h.f7354b;
                Boolean bool2 = Boolean.FALSE;
                h0Var2.getClass();
                h0Var2.j(null, bool2);
                break;
            case ServiceTypes.MSG_MEDIA_PAUSE /* 196611 */:
                h.f7353a.getClass();
                h0 h0Var3 = h.f7354b;
                Boolean bool3 = Boolean.FALSE;
                h0Var3.getClass();
                h0Var3.j(null, bool3);
                break;
            case ServiceTypes.MSG_MEDIA_RESUME_PLAY /* 196612 */:
                h.f7353a.getClass();
                h0 h0Var4 = h.f7354b;
                Boolean bool4 = Boolean.TRUE;
                h0Var4.getClass();
                h0Var4.j(null, bool4);
                break;
        }
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
