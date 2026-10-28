package n8;

import com.baidu.carlife.sdk.internal.protocol.CarLifeMessage;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.google.protobuf.j0;
import u8.b0;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8944a = b0.W0(new t8.j(Integer.valueOf(ServiceTypes.MSG_CMD_MEDIA_INFO), new m7.g(3)), new t8.j(Integer.valueOf(ServiceTypes.MSG_CMD_MEDIA_PROGRESS_BAR), new m7.g(4)));

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static j0 a(CarLifeMessage carLifeMessage) {
        h9.o oVar = (h9.o) f8944a.get(Integer.valueOf(carLifeMessage.getServiceType()));
        if (oVar != null) {
            return (j0) oVar.invoke(carLifeMessage.getBody(), Integer.valueOf(carLifeMessage.getCommandSize()), Integer.valueOf(carLifeMessage.getPayloadSize()));
        }
        return null;
    }
}
