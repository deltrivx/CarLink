package com.baidu.carlife.sdk.internal;

import android.content.SharedPreferences;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import i9.n;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class CarLifeContextImpl$sharedPreferences$2 extends n implements h9.a {
    final /* synthetic */ CarLifeContextImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarLifeContextImpl$sharedPreferences$2(CarLifeContextImpl carLifeContextImpl) {
        super(0);
        this.this$0 = carLifeContextImpl;
    }

    @Override // h9.a
    public final SharedPreferences invoke() {
        return this.this$0.getContext().getSharedPreferences("CarLifeSDK", 0);
    }
}
