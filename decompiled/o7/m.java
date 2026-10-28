package o7;

import a8.c0;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.util.Logger;
import fc.h0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements TransportListener {
    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionAttached(CarLifeContext carLifeContext) {
        Object value;
        u uVar;
        i9.l.e(carLifeContext, "context");
        Logger.INSTANCE.d("CarLife_Vehicle", "【连接状态】与设备建立连接");
        h0 h0Var = u.f9519o;
        h0 h0Var2 = u.f9519o;
        do {
            value = h0Var2.getValue();
            uVar = (u) value;
            i9.l.e(uVar, "$this$update");
        } while (!h0Var2.f(value, u.a(uVar, v.f9535b, "与设备建立连接", 0, null, 0, null, 0, null, null, null, 65529)));
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionAuthenFailed(CarLifeContext carLifeContext) {
        Object value;
        u uVar;
        i9.l.e(carLifeContext, "context");
        Logger.INSTANCE.d("CarLife_Vehicle", "【连接状态】车机渠道号验证失败");
        h0 h0Var = u.f9519o;
        h0 h0Var2 = u.f9519o;
        do {
            value = h0Var2.getValue();
            uVar = (u) value;
            i9.l.e(uVar, "$this$update");
        } while (!h0Var2.f(value, u.a(uVar, v.f9539f, "车机渠道号验证失败", 0, null, 0, null, 0, null, null, null, 65529)));
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionDetached(CarLifeContext carLifeContext) {
        Object value;
        u uVar;
        i9.l.e(carLifeContext, "context");
        Logger.INSTANCE.d("CarLife_Vehicle", "【连接状态】与设备断开连接");
        h0 h0Var = u.f9519o;
        h0 h0Var2 = u.f9519o;
        do {
            value = h0Var2.getValue();
            uVar = (u) value;
            i9.l.e(uVar, "$this$update");
        } while (!h0Var2.f(value, u.a(uVar, v.f9538e, "与设备断开连接", 0, null, 0, null, 0, null, null, null, 65529)));
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionEstablished(CarLifeContext carLifeContext) {
        Object value;
        u uVar;
        i9.l.e(carLifeContext, "context");
        Logger.INSTANCE.d("CarLife_Vehicle", "【连接状态】协议校验成功");
        h0 h0Var = u.f9519o;
        h0 h0Var2 = u.f9519o;
        do {
            value = h0Var2.getValue();
            uVar = (u) value;
            i9.l.e(uVar, "$this$update");
        } while (!h0Var2.f(value, u.a(uVar, null, "协议校验成功", 0, null, 0, null, 0, null, null, null, 65531)));
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionPrompt(String str) {
        i9.l.e(str, "prompt");
        h0 h0Var = u.f9519o;
        h0 h0Var2 = u.f9519o;
        while (true) {
            Object value = h0Var2.getValue();
            u uVar = (u) value;
            i9.l.e(uVar, "$this$update");
            String str2 = str;
            if (h0Var2.f(value, u.a(uVar, null, str2, 0, null, 0, null, 0, null, null, null, 65531))) {
                Logger.INSTANCE.d("CarLife_Vehicle", "【连接状态】".concat(str2));
                return;
            }
            str = str2;
        }
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final /* synthetic */ void onConnectionReattached(CarLifeContext carLifeContext) {
        com.baidu.carlife.sdk.a.f(this, carLifeContext);
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionVersionNotSupprt(CarLifeContext carLifeContext) {
        Object value;
        u uVar;
        i9.l.e(carLifeContext, "context");
        Logger.INSTANCE.d("CarLife_Vehicle", "【连接状态】与设备协议版本不兼容");
        h0 h0Var = u.f9519o;
        h0 h0Var2 = u.f9519o;
        do {
            value = h0Var2.getValue();
            uVar = (u) value;
            i9.l.e(uVar, "$this$update");
        } while (!h0Var2.f(value, u.a(uVar, v.f9537d, "与设备协议版本不兼容", 0, null, 0, null, 0, null, null, null, 65529)));
    }

    @Override // com.baidu.carlife.sdk.ConnectionChangeListener
    public final void onConnectionWait() {
        Object value;
        u uVar;
        Logger.INSTANCE.d("CarLife_Vehicle", "【连接状态】正在等待连接");
        h0 h0Var = u.f9519o;
        h0 h0Var2 = u.f9519o;
        do {
            value = h0Var2.getValue();
            uVar = (u) value;
            i9.l.e(uVar, "$this$update");
        } while (!h0Var2.f(value, u.a(uVar, v.f9534a, null, 0, null, 0, null, 0, null, null, null, 65533)));
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final boolean onReceiveMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        i9.l.e(carLifeContext, "context");
        i9.l.e(carLifeMessage, "message");
        int serviceType = carLifeMessage.getServiceType();
        if (serviceType == 65544) {
            hc.c cVar = n8.c.f8897a;
            n8.c.d(new c0(2, null, 14));
            return false;
        }
        if (serviceType != 65569) {
            return false;
        }
        hc.c cVar2 = n8.c.f8897a;
        n8.c.f();
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
