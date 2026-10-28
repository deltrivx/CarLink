package com.baidu.carlife.sdk.util;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.n;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class DeviceUtilsKt$availableProcessors$2 extends n implements h9.a {
    public static final DeviceUtilsKt$availableProcessors$2 INSTANCE = new DeviceUtilsKt$availableProcessors$2();

    public DeviceUtilsKt$availableProcessors$2() {
        super(0);
    }

    @Override // h9.a
    public final Integer invoke() {
        return Integer.valueOf(Runtime.getRuntime().availableProcessors());
    }
}
