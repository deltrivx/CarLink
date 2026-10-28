package b8;

import com.baidu.carlife.protobuf.CarlifeThemeChangeProto;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;
import com.baidu.carlife.sdk.util.Logger;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class r2 {
    public static String a(int i7) {
        Object next;
        b9.b bVar = s2.f1651e;
        bVar.getClass();
        i9.b bVar2 = new i9.b(6, bVar);
        do {
            if (!bVar2.hasNext()) {
                next = null;
                break;
            }
            next = bVar2.next();
        } while (((s2) next).f1653b != i7);
        s2 s2Var = (s2) next;
        return s2Var != null ? s2Var.f1652a : "未知模式";
    }

    public static void b(int i7) {
        CarLifeMessage carLifeMessageObtain = CarLifeMessage.INSTANCE.obtain(1, Integer.valueOf(ServiceTypes.MSG_CMD_HU_THEME_CHANGE), 0);
        carLifeMessageObtain.payload(CarlifeThemeChangeProto.CarlifeThemeChange.newBuilder().setThemeModes(i7).m16build());
        CarLife.receiver().postMessage(carLifeMessageObtain);
        Logger.Companion companion = Logger.INSTANCE;
        s2.f1649c.getClass();
        companion.d("CarLife_Vehicle", "【互联主题】已切换到".concat(a(i7)));
    }
}
