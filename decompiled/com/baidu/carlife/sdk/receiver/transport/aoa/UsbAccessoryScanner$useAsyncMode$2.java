package com.baidu.carlife.sdk.receiver.transport.aoa;

import com.baidu.carlife.sdk.Configs;
import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.a;
import i9.n;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class UsbAccessoryScanner$useAsyncMode$2 extends n implements a {
    final /* synthetic */ UsbAccessoryScanner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsbAccessoryScanner$useAsyncMode$2(UsbAccessoryScanner usbAccessoryScanner) {
        super(0);
        this.this$0 = usbAccessoryScanner;
    }

    @Override // h9.a
    public final Boolean invoke() {
        return (Boolean) this.this$0.context.getConfig(Configs.CONFIG_USE_ASYNC_USB_MODE, Boolean.FALSE);
    }
}
