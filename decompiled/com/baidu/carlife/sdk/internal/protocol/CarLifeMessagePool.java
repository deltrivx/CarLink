package com.baidu.carlife.sdk.internal.protocol;

import com.baidu.carlife.sdk.Constants;
import com.baidu.carlife.sdk.util.Logger;
import i9.g;
import i9.l;
import java.util.LinkedList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessagePool;", "", "", "capacity", "<init>", "(I)V", "channel", "serviceType", "length", "Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "obtain", "(ILjava/lang/Integer;I)Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;", "message", "Lt8/z;", "recycle", "(Lcom/baidu/carlife/sdk/internal/protocol/CarLifeMessage;)V", "I", "Ljava/util/LinkedList;", "recyclePoll", "Ljava/util/LinkedList;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class CarLifeMessagePool {
    private final int capacity;
    private final LinkedList<CarLifeMessage> recyclePoll;

    public CarLifeMessagePool() {
        this(0, 1, null);
    }

    public CarLifeMessagePool(int i7) {
        this.capacity = i7;
        this.recyclePoll = new LinkedList<>();
    }

    public /* synthetic */ CarLifeMessagePool(int i7, int i10, g gVar) {
        this((i10 & 1) != 0 ? 100 : i7);
    }

    public static /* synthetic */ CarLifeMessage obtain$default(CarLifeMessagePool carLifeMessagePool, int i7, Integer num, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = 1;
        }
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return carLifeMessagePool.obtain(i7, num, i10);
    }

    public final synchronized CarLifeMessage obtain(int channel, Integer serviceType, int length) {
        CarLifeMessage carLifeMessagePoll;
        try {
            Logger.INSTANCE.v(Constants.TAG, "CarLifeMessagePool recyclePoll obtain size " + this.recyclePoll.size());
            carLifeMessagePoll = this.recyclePoll.poll();
            if (carLifeMessagePoll == null) {
                carLifeMessagePoll = new CarLifeMessage(channel);
            }
            CarLifeMessage.reset$default(carLifeMessagePoll, channel, length, null, 4, null);
            if (serviceType != null) {
                carLifeMessagePoll.setServiceType(serviceType.intValue());
            }
        } catch (Throwable th) {
            throw th;
        }
        return carLifeMessagePoll;
    }

    public final synchronized void recycle(CarLifeMessage message) {
        try {
            l.e(message, "message");
            if (this.recyclePoll.size() < this.capacity) {
                this.recyclePoll.offer(message);
            }
            Logger.INSTANCE.v(Constants.TAG, "CarLifeMessagePool recyclePoll recycle size " + this.recyclePoll.size());
        } catch (Throwable th) {
            throw th;
        }
    }
}
