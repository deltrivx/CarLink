package x7;

import android.content.Intent;
import com.baidu.carlife.protobuf.CarlifeNaviNextTurnInfoProto;
import com.baidu.carlife.sdk.CarLifeContext;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.transport.TransportListener;
import com.baidu.carlife.sdk.receiver.CarLifeReceiver;
import com.baidu.carlife.sdk.util.Logger;
import com.google.protobuf.l1;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class m implements TransportListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarLifeContext f14673a;

    public m(CarLifeReceiver carLifeReceiver) {
        i9.l.e(carLifeReceiver, "context");
        this.f14673a = carLifeReceiver;
    }

    public final String a(int i7) {
        if (i7 < 1000) {
            return i7 + "米";
        }
        double d10 = ((double) i7) / 1000.0d;
        if (d10 % 1.0d != 0.0d) {
            return String.format(Locale.getDefault(), "%.1f公里", Arrays.copyOf(new Object[]{Double.valueOf(d10)}, 1));
        }
        return ((int) d10) + "公里";
    }

    public final void b(t8.j... jVarArr) {
        Intent intent = new Intent("AUTONAVI_STANDARD_BROADCAST_SEND");
        intent.setFlags(32);
        for (t8.j jVar : jVarArr) {
            String str = (String) jVar.f12830a;
            Object obj = jVar.f12831b;
            if (obj instanceof Integer) {
                intent.putExtra(str, ((Number) obj).intValue());
            } else if (obj instanceof String) {
                intent.putExtra(str, (String) obj);
            } else if (obj instanceof Boolean) {
                intent.putExtra(str, ((Boolean) obj).booleanValue());
            }
        }
        try {
            this.f14673a.getContext().sendBroadcast(intent);
        } catch (Exception e7) {
            Logger.INSTANCE.e("CarLife_Vehicle", ob.a.q("【高德广播】发送异常: ", e7.getMessage()), e7);
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
        i9.l.e(carLifeContext, "context");
        i9.l.e(carLifeMessage, "message");
        if (carLifeMessage.getServiceType() == 65584) {
            l1 protoPayload = carLifeMessage.getProtoPayload();
            CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfo carlifeNaviNextTurnInfo = protoPayload instanceof CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfo ? (CarlifeNaviNextTurnInfoProto.CarlifeNaviNextTurnInfo) protoPayload : null;
            if (carlifeNaviNextTurnInfo != null) {
                b(new t8.j("KEY_TYPE", 10019), new t8.j("EXTRA_STATE", Integer.valueOf(i9.l.a(carlifeNaviNextTurnInfo.getRoadName(), "目的地") ? 39 : 8)));
                b(new t8.j("KEY_TYPE", 10019), new t8.j("EXTRA_STATE", Integer.valueOf(i9.l.a(carlifeNaviNextTurnInfo.getRoadName(), "目的地") ? 9 : 8)));
                b(new t8.j("KEY_TYPE", 12107), new t8.j("HUD_IS_OPEN", Integer.valueOf(i9.l.a(carlifeNaviNextTurnInfo.getRoadName(), "目的地") ? 1 : 0)));
                b(new t8.j("TYPE", 0), new t8.j("KEY_TYPE", 10001), new t8.j("ACTION", Integer.valueOf(carlifeNaviNextTurnInfo.getAction())), new t8.j("ICON", Integer.valueOf(carlifeNaviNextTurnInfo.getNextTurn())), new t8.j("NEW_ICON", Integer.valueOf(carlifeNaviNextTurnInfo.getNextTurn())), new t8.j("NEXT_ROAD_NAME", carlifeNaviNextTurnInfo.getRoadName()), new t8.j("SEG_REMAIN_DIS", Integer.valueOf(carlifeNaviNextTurnInfo.getRemainDistance())), new t8.j("SEG_REMAIN_DIS_AUTO", a(carlifeNaviNextTurnInfo.getRemainDistance())), new t8.j("ROUTE_ALL_DIS", Integer.valueOf(carlifeNaviNextTurnInfo.getTotalDistance())), new t8.j("ROUTE_REMAIN_DIS", Integer.valueOf(carlifeNaviNextTurnInfo.getTotalDistance())), new t8.j("ROUTE_REMAIN_DIS_AUTO", a(carlifeNaviNextTurnInfo.getTotalDistance())));
                return false;
            }
        }
        return false;
    }

    @Override // com.baidu.carlife.sdk.internal.transport.TransportListener
    public final /* synthetic */ boolean onSendMessage(CarLifeContext carLifeContext, CarLifeMessage carLifeMessage) {
        return com.baidu.carlife.sdk.internal.transport.b.b(this, carLifeContext, carLifeMessage);
    }
}
