package com.baidu.carlife.sdk.util;

import com.baidu.carlife.sdk.internal.protocol.ServiceTypes;
import h9.k;
import i9.n;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-23e26df0efaa9d89388e95288a59e5b70285fd87fbcf7c2259fd838f43f3aa6d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = ServiceTypes.KEYCODE_NUMBER_CLEAR)
public final class Logger$log$message$1 extends n implements k {
    final /* synthetic */ Logger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Logger$log$message$1(Logger logger) {
        super(1);
        this.this$0 = logger;
    }

    @Override // h9.k
    public final CharSequence invoke(Object obj) {
        return this.this$0.transform(obj);
    }
}
