package com.baidu.carlife.sdk.receiver;

import android.content.Context;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import com.baidu.carlife.sdk.util.ApplicationUtilsKt;
import i9.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/baidu/carlife/sdk/receiver/CarLife;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "channel", "uniqueId", "", "", "features", "configs", "Lt8/z;", "init", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/baidu/carlife/sdk/receiver/CarLifeReceiver;", "receiver", "()Lcom/baidu/carlife/sdk/receiver/CarLifeReceiver;", "Lcom/baidu/carlife/sdk/receiver/CarLifeReceiver;", "carlife-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class CarLife {
    public static final CarLife INSTANCE = new CarLife();
    private static CarLifeReceiver receiver;

    private CarLife() {
    }

    public static final void init(Context context, String channel, String uniqueId, Map<String, Integer> features, Map<String, ? extends Object> configs) throws IllegalAccessException {
        l.e(context, "context");
        l.e(channel, "channel");
        l.e(uniqueId, "uniqueId");
        l.e(features, "features");
        l.e(configs, "configs");
        if (!ApplicationUtilsKt.isMainProcess(context)) {
            throw new IllegalAccessException("can't init CarLife receiver not in main process");
        }
        receiver = new CarLifeReceiverImpl(context, channel, uniqueId, new LinkedHashMap(features), configs);
    }

    public static final CarLifeReceiver receiver() {
        CarLifeReceiver carLifeReceiver = receiver;
        if (carLifeReceiver != null) {
            return carLifeReceiver;
        }
        throw new RuntimeException("CarLife not init or init failed");
    }
}
