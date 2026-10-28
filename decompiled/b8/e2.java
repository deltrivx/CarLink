package b8;

import com.baidu.carlife.protobuf.CarlifeCarHardKeyCodeProto;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    public static void a(int i7) {
        if (i7 != 14) {
            if (i7 != 33) {
                if (i7 == 85) {
                    k7.h.f7353a.getClass();
                    i7 = ((Boolean) k7.h.f7354b.getValue()).booleanValue() ? 32 : 31;
                }
            } else if (f2.f1584d) {
                f2.f1584d = false;
                i7 = 34;
            } else {
                f2.f1584d = true;
                hc.c cVar = n8.c.f8897a;
                n8.c.d(new a8.c0(2, null, 9));
                i7 = 33;
            }
        } else {
            if (!CarLife.receiver().isConnected()) {
                hc.c cVar2 = n8.c.f8897a;
                n8.c.f();
                return;
            }
            i7 = 14;
        }
        CarLifeMessage carLifeMessageObtain = CarLifeMessage.INSTANCE.obtain(6, Integer.valueOf(ServiceTypes.MSG_TOUCH_CAR_HARD_KEY_CODE), 0);
        carLifeMessageObtain.payload(CarlifeCarHardKeyCodeProto.CarlifeCarHardKeyCode.newBuilder().setKeycode(i7).m16build());
        CarLife.receiver().postMessage(carLifeMessageObtain);
    }
}
