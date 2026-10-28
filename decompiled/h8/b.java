package h8;

import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import com.baidu.carlife.protobuf.CarlifeTouchActionProto;
import com.baidu.carlife.protobuf.CarlifeVideoEncoderInfoProto;
import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.receiver.CarLife;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6456a = new a();

    public static void a(Surface surface) {
        f6456a.i(surface);
    }

    public static void b(View view, MotionEvent motionEvent) {
        int x8;
        a aVar = f6456a;
        aVar.getClass();
        CarlifeVideoEncoderInfoProto.CarlifeVideoEncoderInfo carlifeVideoEncoderInfo = aVar.f6454h;
        if (carlifeVideoEncoderInfo != null) {
            CarlifeTouchActionProto.CarlifeTouchAction.Builder action = CarlifeTouchActionProto.CarlifeTouchAction.newBuilder().setAction(motionEvent.getAction());
            int x10 = (int) motionEvent.getX();
            int width = view.getWidth();
            int width2 = carlifeVideoEncoderInfo.getWidth();
            if (width2 != 0 && width != 0) {
                x10 = (x10 * width2) / width;
            }
            CarlifeTouchActionProto.CarlifeTouchAction.Builder x11 = action.setX(x10);
            int y5 = (int) motionEvent.getY();
            int height = view.getHeight();
            int height2 = carlifeVideoEncoderInfo.getHeight();
            if (height2 != 0 && height != 0) {
                y5 = (y5 * height2) / height;
            }
            CarlifeTouchActionProto.CarlifeTouchAction.Builder y6 = x11.setY(y5);
            int width3 = view.getWidth();
            int width4 = carlifeVideoEncoderInfo.getWidth();
            int i7 = 0;
            if (motionEvent.getPointerCount() > 1) {
                x8 = (int) motionEvent.getX(1);
                if (width4 != 0 && width3 != 0) {
                    x8 = (x8 * width4) / width3;
                }
            } else {
                x8 = 0;
            }
            CarlifeTouchActionProto.CarlifeTouchAction.Builder pointerx = y6.setPointerx(x8);
            int height3 = view.getHeight();
            int height4 = carlifeVideoEncoderInfo.getHeight();
            if (motionEvent.getPointerCount() > 1) {
                int y10 = (int) motionEvent.getY(1);
                if (height4 != 0 && height3 != 0) {
                    y10 = (y10 * height4) / height3;
                }
                i7 = y10;
            }
            CarlifeTouchActionProto.CarlifeTouchAction.Builder pointery = pointerx.setPointery(i7);
            CarLifeMessage carLifeMessageObtain$default = CarLifeMessage.Companion.obtain$default(CarLifeMessage.INSTANCE, 6, Integer.valueOf(ServiceTypes.MSG_TOUCH_ACTION), 0, 4, null);
            carLifeMessageObtain$default.payload(pointery.m16build());
            carLifeMessageObtain$default.setTag(System.currentTimeMillis());
            CarLife.receiver().postMessage(carLifeMessageObtain$default);
        }
    }
}
