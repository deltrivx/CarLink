package n7;

import com.baidu.carlife.protobuf.CarlifeTTSInitProto;
import com.baidu.carlife.sdk.CarLifeContext;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static f a(CarLifeContext carLifeContext, CarlifeTTSInitProto.CarlifeTTSInit carlifeTTSInit) {
        return new f(carLifeContext, new c(carlifeTTSInit.getSampleRate(), carlifeTTSInit.getChannelConfig(), carlifeTTSInit.getSampleFormat()), 65536);
    }
}
